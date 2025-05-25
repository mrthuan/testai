package lib.zj.office.fc.codec;

import a6.h;
import com.google.android.gms.common.api.Api;
import java.math.BigInteger;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: classes3.dex */
public class Base64 extends BaseNCodec {
    private static final int BITS_PER_ENCODED_BYTE = 6;
    private static final int BYTES_PER_ENCODED_BLOCK = 4;
    private static final int BYTES_PER_UNENCODED_BLOCK = 3;
    private static final int MASK_6BITS = 63;
    private int bitWorkArea;
    private final int decodeSize;
    private final byte[] decodeTable;
    private final int encodeSize;
    private final byte[] encodeTable;
    private final byte[] lineSeparator;
    static final byte[] CHUNK_SEPARATOR = {13, 10};
    private static final byte[] STANDARD_ENCODE_TABLE = {Field.SECTION, Field.SECTIONPAGES, Field.INCLUDEPICTURE, Field.INCLUDETEXT, Field.FILESIZE, Field.FORMTEXT, Field.FORMCHECKBOX, Field.NOTEREF, Field.TOA, 74, Field.MERGESEQ, 76, 77, 78, Field.AUTOTEXT, 80, Field.ADDIN, 82, Field.FORMDROPDOWN, Field.ADVANCE, Field.DOCPROPERTY, 86, Field.CONTROL, Field.HYPERLINK, Field.AUTOTEXTLIST, Field.LISTNUM, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, Field.EQ, Field.GOTOBUTTON, Field.MACROBUTTON, Field.AUTONUMOUT, Field.AUTONUMLGL, Field.AUTONUM, Field.IMPORT, 56, Field.SYMBOL, 43, Field.GLOSSARY};
    private static final byte[] URL_SAFE_ENCODE_TABLE = {Field.SECTION, Field.SECTIONPAGES, Field.INCLUDEPICTURE, Field.INCLUDETEXT, Field.FILESIZE, Field.FORMTEXT, Field.FORMCHECKBOX, Field.NOTEREF, Field.TOA, 74, Field.MERGESEQ, 76, 77, 78, Field.AUTOTEXT, 80, Field.ADDIN, 82, Field.FORMDROPDOWN, Field.ADVANCE, Field.DOCPROPERTY, 86, Field.CONTROL, Field.HYPERLINK, Field.AUTOTEXTLIST, Field.LISTNUM, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, Field.EQ, Field.GOTOBUTTON, Field.MACROBUTTON, Field.AUTONUMOUT, Field.AUTONUMLGL, Field.AUTONUM, Field.IMPORT, 56, Field.SYMBOL, Field.DDE, Field.SHAPE};
    private static final byte[] DECODE_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Field.USERADDRESS, -1, Field.USERADDRESS, -1, Field.BARCODE, Field.AUTONUMOUT, Field.AUTONUMLGL, Field.AUTONUM, Field.IMPORT, 56, Field.SYMBOL, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, Field.BARCODE, -1, 26, Field.NUMWORDS, Field.NUMCHARS, 29, 30, 31, 32, 33, 34, Field.QUOTE, 36, Field.PAGEREF, Field.ASK, Field.FILLIN, Field.DATA, 41, 42, 43, 44, Field.DDE, Field.DDEAUTO, Field.GLOSSARY, 48, Field.EQ, Field.GOTOBUTTON, Field.MACROBUTTON};

    public Base64() {
        this(0);
    }

    public static byte[] decodeBase64(String str) {
        return new Base64().decode(str);
    }

    public static BigInteger decodeInteger(byte[] bArr) {
        return new BigInteger(1, decodeBase64(bArr));
    }

    public static byte[] encodeBase64(byte[] bArr) {
        return encodeBase64(bArr, false);
    }

    public static byte[] encodeBase64Chunked(byte[] bArr) {
        return encodeBase64(bArr, true);
    }

    public static String encodeBase64String(byte[] bArr) {
        return StringUtils.newStringUtf8(encodeBase64(bArr, false));
    }

    public static byte[] encodeBase64URLSafe(byte[] bArr) {
        return encodeBase64(bArr, false, true);
    }

    public static String encodeBase64URLSafeString(byte[] bArr) {
        return StringUtils.newStringUtf8(encodeBase64(bArr, false, true));
    }

    public static byte[] encodeInteger(BigInteger bigInteger) {
        if (bigInteger != null) {
            return encodeBase64(toIntegerBytes(bigInteger), false);
        }
        throw new NullPointerException("encodeInteger called with null parameter");
    }

    public static boolean isArrayByteBase64(byte[] bArr) {
        return isBase64(bArr);
    }

    public static boolean isBase64(byte b10) {
        if (b10 != 61) {
            if (b10 >= 0) {
                byte[] bArr = DECODE_TABLE;
                if (b10 >= bArr.length || bArr[b10] == -1) {
                }
            }
            return false;
        }
        return true;
    }

    public static byte[] toIntegerBytes(BigInteger bigInteger) {
        int bitLength = ((bigInteger.bitLength() + 7) >> 3) << 3;
        byte[] byteArray = bigInteger.toByteArray();
        int i10 = 1;
        if (bigInteger.bitLength() % 8 != 0 && (bigInteger.bitLength() / 8) + 1 == bitLength / 8) {
            return byteArray;
        }
        int length = byteArray.length;
        if (bigInteger.bitLength() % 8 == 0) {
            length--;
        } else {
            i10 = 0;
        }
        int i11 = bitLength / 8;
        int i12 = i11 - length;
        byte[] bArr = new byte[i11];
        System.arraycopy(byteArray, i10, bArr, i12, length);
        return bArr;
    }

    @Override // lib.zj.office.fc.codec.BaseNCodec
    public void decode(byte[] bArr, int i10, int i11) {
        byte b10;
        if (this.eof) {
            return;
        }
        if (i11 < 0) {
            this.eof = true;
        }
        int i12 = 0;
        while (true) {
            if (i12 >= i11) {
                break;
            }
            ensureBufferSize(this.decodeSize);
            int i13 = i10 + 1;
            byte b11 = bArr[i10];
            if (b11 == 61) {
                this.eof = true;
                break;
            }
            if (b11 >= 0) {
                byte[] bArr2 = DECODE_TABLE;
                if (b11 < bArr2.length && (b10 = bArr2[b11]) >= 0) {
                    int i14 = (this.modulus + 1) % 4;
                    this.modulus = i14;
                    int i15 = (this.bitWorkArea << 6) + b10;
                    this.bitWorkArea = i15;
                    if (i14 == 0) {
                        byte[] bArr3 = this.buffer;
                        int i16 = this.pos;
                        int i17 = i16 + 1;
                        bArr3[i16] = (byte) ((i15 >> 16) & FunctionEval.FunctionID.EXTERNAL_FUNC);
                        int i18 = i17 + 1;
                        bArr3[i17] = (byte) ((i15 >> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC);
                        this.pos = i18 + 1;
                        bArr3[i18] = (byte) (i15 & FunctionEval.FunctionID.EXTERNAL_FUNC);
                    }
                }
            }
            i12++;
            i10 = i13;
        }
        if (this.eof && this.modulus != 0) {
            ensureBufferSize(this.decodeSize);
            int i19 = this.modulus;
            if (i19 != 2) {
                if (i19 == 3) {
                    int i20 = this.bitWorkArea >> 2;
                    this.bitWorkArea = i20;
                    byte[] bArr4 = this.buffer;
                    int i21 = this.pos;
                    int i22 = i21 + 1;
                    bArr4[i21] = (byte) ((i20 >> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC);
                    this.pos = i22 + 1;
                    bArr4[i22] = (byte) (i20 & FunctionEval.FunctionID.EXTERNAL_FUNC);
                    return;
                }
                return;
            }
            int i23 = this.bitWorkArea >> 4;
            this.bitWorkArea = i23;
            byte[] bArr5 = this.buffer;
            int i24 = this.pos;
            this.pos = i24 + 1;
            bArr5[i24] = (byte) (i23 & FunctionEval.FunctionID.EXTERNAL_FUNC);
        }
    }

    @Override // lib.zj.office.fc.codec.BaseNCodec
    public void encode(byte[] bArr, int i10, int i11) {
        if (this.eof) {
            return;
        }
        if (i11 < 0) {
            this.eof = true;
            if (this.modulus == 0 && this.lineLength == 0) {
                return;
            }
            ensureBufferSize(this.encodeSize);
            int i12 = this.pos;
            int i13 = this.modulus;
            if (i13 != 1) {
                if (i13 == 2) {
                    byte[] bArr2 = this.buffer;
                    int i14 = i12 + 1;
                    byte[] bArr3 = this.encodeTable;
                    int i15 = this.bitWorkArea;
                    bArr2[i12] = bArr3[(i15 >> 10) & 63];
                    int i16 = i14 + 1;
                    bArr2[i14] = bArr3[(i15 >> 4) & 63];
                    int i17 = i16 + 1;
                    this.pos = i17;
                    bArr2[i16] = bArr3[(i15 << 2) & 63];
                    if (bArr3 == STANDARD_ENCODE_TABLE) {
                        this.pos = i17 + 1;
                        bArr2[i17] = 61;
                    }
                }
            } else {
                byte[] bArr4 = this.buffer;
                int i18 = i12 + 1;
                byte[] bArr5 = this.encodeTable;
                int i19 = this.bitWorkArea;
                bArr4[i12] = bArr5[(i19 >> 2) & 63];
                int i20 = i18 + 1;
                this.pos = i20;
                bArr4[i18] = bArr5[(i19 << 4) & 63];
                if (bArr5 == STANDARD_ENCODE_TABLE) {
                    int i21 = i20 + 1;
                    bArr4[i20] = 61;
                    this.pos = i21 + 1;
                    bArr4[i21] = 61;
                }
            }
            int i22 = this.currentLinePos;
            int i23 = this.pos;
            int i24 = (i23 - i12) + i22;
            this.currentLinePos = i24;
            if (this.lineLength > 0 && i24 > 0) {
                byte[] bArr6 = this.lineSeparator;
                System.arraycopy(bArr6, 0, this.buffer, i23, bArr6.length);
                this.pos += this.lineSeparator.length;
                return;
            }
            return;
        }
        int i25 = 0;
        while (i25 < i11) {
            ensureBufferSize(this.encodeSize);
            int i26 = (this.modulus + 1) % 3;
            this.modulus = i26;
            int i27 = i10 + 1;
            int i28 = bArr[i10];
            if (i28 < 0) {
                i28 += 256;
            }
            int i29 = (this.bitWorkArea << 8) + i28;
            this.bitWorkArea = i29;
            if (i26 == 0) {
                byte[] bArr7 = this.buffer;
                int i30 = this.pos;
                int i31 = i30 + 1;
                byte[] bArr8 = this.encodeTable;
                bArr7[i30] = bArr8[(i29 >> 18) & 63];
                int i32 = i31 + 1;
                bArr7[i31] = bArr8[(i29 >> 12) & 63];
                int i33 = i32 + 1;
                bArr7[i32] = bArr8[(i29 >> 6) & 63];
                int i34 = i33 + 1;
                this.pos = i34;
                bArr7[i33] = bArr8[i29 & 63];
                int i35 = this.currentLinePos + 4;
                this.currentLinePos = i35;
                int i36 = this.lineLength;
                if (i36 > 0 && i36 <= i35) {
                    byte[] bArr9 = this.lineSeparator;
                    System.arraycopy(bArr9, 0, bArr7, i34, bArr9.length);
                    this.pos += this.lineSeparator.length;
                    this.currentLinePos = 0;
                }
            }
            i25++;
            i10 = i27;
        }
    }

    @Override // lib.zj.office.fc.codec.BaseNCodec
    public boolean isInAlphabet(byte b10) {
        if (b10 >= 0) {
            byte[] bArr = this.decodeTable;
            if (b10 < bArr.length && bArr[b10] != -1) {
                return true;
            }
        }
        return false;
    }

    public boolean isUrlSafe() {
        if (this.encodeTable == URL_SAFE_ENCODE_TABLE) {
            return true;
        }
        return false;
    }

    public Base64(boolean z10) {
        this(76, CHUNK_SEPARATOR, z10);
    }

    public static byte[] decodeBase64(byte[] bArr) {
        return new Base64().decode(bArr);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z10) {
        return encodeBase64(bArr, z10, false);
    }

    public static boolean isBase64(String str) {
        return isBase64(StringUtils.getBytesUtf8(str));
    }

    public Base64(int i10) {
        this(i10, CHUNK_SEPARATOR);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z10, boolean z11) {
        return encodeBase64(bArr, z10, z11, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    public static boolean isBase64(byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (!isBase64(bArr[i10]) && !BaseNCodec.isWhiteSpace(bArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public Base64(int i10, byte[] bArr) {
        this(i10, bArr, false);
    }

    public static byte[] encodeBase64(byte[] bArr, boolean z10, boolean z11, int i10) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        Base64 base64 = z10 ? new Base64(z11) : new Base64(0, CHUNK_SEPARATOR, z11);
        long encodedLength = base64.getEncodedLength(bArr);
        if (encodedLength <= i10) {
            return base64.encode(bArr);
        }
        throw new IllegalArgumentException("Input array too big, the output array would be bigger (" + encodedLength + ") than the specified maximum size of " + i10);
    }

    public Base64(int i10, byte[] bArr, boolean z10) {
        super(3, 4, i10, bArr == null ? 0 : bArr.length);
        this.decodeTable = DECODE_TABLE;
        if (bArr != null) {
            if (containsAlphabetOrPad(bArr)) {
                throw new IllegalArgumentException(h.d("lineSeparator must not contain base64 characters: [", StringUtils.newStringUtf8(bArr), "]"));
            }
            if (i10 > 0) {
                this.encodeSize = bArr.length + 4;
                byte[] bArr2 = new byte[bArr.length];
                this.lineSeparator = bArr2;
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            } else {
                this.encodeSize = 4;
                this.lineSeparator = null;
            }
        } else {
            this.encodeSize = 4;
            this.lineSeparator = null;
        }
        this.decodeSize = this.encodeSize - 1;
        this.encodeTable = z10 ? URL_SAFE_ENCODE_TABLE : STANDARD_ENCODE_TABLE;
    }
}
