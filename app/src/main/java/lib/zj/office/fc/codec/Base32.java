package lib.zj.office.fc.codec;

import a0.a;
import a6.h;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: classes3.dex */
public class Base32 extends BaseNCodec {
    private static final int BITS_PER_ENCODED_BYTE = 5;
    private static final int BYTES_PER_ENCODED_BLOCK = 8;
    private static final int BYTES_PER_UNENCODED_BLOCK = 5;
    private static final byte[] CHUNK_SEPARATOR = {13, 10};
    private static final byte[] DECODE_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Field.BARCODE, -1, -1, 26, Field.NUMWORDS, Field.NUMCHARS, 29, 30, 31, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};
    private static final byte[] ENCODE_TABLE = {Field.SECTION, Field.SECTIONPAGES, Field.INCLUDEPICTURE, Field.INCLUDETEXT, Field.FILESIZE, Field.FORMTEXT, Field.FORMCHECKBOX, Field.NOTEREF, Field.TOA, 74, Field.MERGESEQ, 76, 77, 78, Field.AUTOTEXT, 80, Field.ADDIN, 82, Field.FORMDROPDOWN, Field.ADVANCE, Field.DOCPROPERTY, 86, Field.CONTROL, Field.HYPERLINK, Field.AUTOTEXTLIST, Field.LISTNUM, Field.GOTOBUTTON, Field.MACROBUTTON, Field.AUTONUMOUT, Field.AUTONUMLGL, Field.AUTONUM, Field.IMPORT};
    private static final byte[] HEX_DECODE_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Field.BARCODE, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, Field.NUMWORDS, Field.NUMCHARS, 29, 30, 31, 32};
    private static final byte[] HEX_ENCODE_TABLE = {48, Field.EQ, Field.GOTOBUTTON, Field.MACROBUTTON, Field.AUTONUMOUT, Field.AUTONUMLGL, Field.AUTONUM, Field.IMPORT, 56, Field.SYMBOL, Field.SECTION, Field.SECTIONPAGES, Field.INCLUDEPICTURE, Field.INCLUDETEXT, Field.FILESIZE, Field.FORMTEXT, Field.FORMCHECKBOX, Field.NOTEREF, Field.TOA, 74, Field.MERGESEQ, 76, 77, 78, Field.AUTOTEXT, 80, Field.ADDIN, 82, Field.FORMDROPDOWN, Field.ADVANCE, Field.DOCPROPERTY, 86};
    private static final int MASK_5BITS = 31;
    private long bitWorkArea;
    private final int decodeSize;
    private final byte[] decodeTable;
    private final int encodeSize;
    private final byte[] encodeTable;
    private final byte[] lineSeparator;

    public Base32() {
        this(false);
    }

    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v7 */
    @Override // lib.zj.office.fc.codec.BaseNCodec
    public void decode(byte[] bArr, int i10, int i11) {
        long j10;
        long j11;
        long j12;
        long j13;
        byte b10;
        long j14;
        if (this.eof) {
            return;
        }
        ?? r22 = 1;
        if (i11 < 0) {
            this.eof = true;
        }
        int i12 = 0;
        int i13 = i10;
        while (true) {
            if (i12 >= i11) {
                break;
            }
            int i14 = i13 + 1;
            byte b11 = bArr[i13];
            if (b11 == 61) {
                this.eof = r22;
                break;
            }
            ensureBufferSize(this.decodeSize);
            if (b11 >= 0) {
                byte[] bArr2 = this.decodeTable;
                if (b11 < bArr2.length && (b10 = bArr2[b11]) >= 0) {
                    int i15 = (this.modulus + r22) % 8;
                    this.modulus = i15;
                    this.bitWorkArea = (this.bitWorkArea << 5) + b10;
                    if (i15 == 0) {
                        byte[] bArr3 = this.buffer;
                        int i16 = this.pos;
                        int i17 = i16 + 1;
                        bArr3[i16] = (byte) ((j14 >> 32) & 255);
                        int i18 = i17 + 1;
                        bArr3[i17] = (byte) ((j14 >> 24) & 255);
                        int i19 = i18 + 1;
                        bArr3[i18] = (byte) ((j14 >> 16) & 255);
                        int i20 = i19 + 1;
                        bArr3[i19] = (byte) ((j14 >> 8) & 255);
                        this.pos = i20 + 1;
                        bArr3[i20] = (byte) (j14 & 255);
                    }
                }
            }
            i12++;
            i13 = i14;
            r22 = 1;
        }
        if (this.eof && this.modulus >= 2) {
            ensureBufferSize(this.decodeSize);
            switch (this.modulus) {
                case 2:
                    byte[] bArr4 = this.buffer;
                    int i21 = this.pos;
                    this.pos = i21 + 1;
                    bArr4[i21] = (byte) ((this.bitWorkArea >> 2) & 255);
                    return;
                case 3:
                    byte[] bArr5 = this.buffer;
                    int i22 = this.pos;
                    this.pos = i22 + 1;
                    bArr5[i22] = (byte) ((this.bitWorkArea >> 7) & 255);
                    return;
                case 4:
                    this.bitWorkArea = this.bitWorkArea >> 4;
                    byte[] bArr6 = this.buffer;
                    int i23 = this.pos;
                    int i24 = i23 + 1;
                    bArr6[i23] = (byte) ((j10 >> 8) & 255);
                    this.pos = i24 + 1;
                    bArr6[i24] = (byte) (j10 & 255);
                    return;
                case 5:
                    this.bitWorkArea = this.bitWorkArea >> 1;
                    byte[] bArr7 = this.buffer;
                    int i25 = this.pos;
                    int i26 = i25 + 1;
                    bArr7[i25] = (byte) ((j11 >> 16) & 255);
                    int i27 = i26 + 1;
                    bArr7[i26] = (byte) ((j11 >> 8) & 255);
                    this.pos = i27 + 1;
                    bArr7[i27] = (byte) (j11 & 255);
                    return;
                case 6:
                    this.bitWorkArea = this.bitWorkArea >> 6;
                    byte[] bArr8 = this.buffer;
                    int i28 = this.pos;
                    int i29 = i28 + 1;
                    bArr8[i28] = (byte) ((j12 >> 16) & 255);
                    int i30 = i29 + 1;
                    bArr8[i29] = (byte) ((j12 >> 8) & 255);
                    this.pos = i30 + 1;
                    bArr8[i30] = (byte) (j12 & 255);
                    return;
                case 7:
                    this.bitWorkArea = this.bitWorkArea >> 3;
                    byte[] bArr9 = this.buffer;
                    int i31 = this.pos;
                    int i32 = i31 + 1;
                    bArr9[i31] = (byte) ((j13 >> 24) & 255);
                    int i33 = i32 + 1;
                    bArr9[i32] = (byte) ((j13 >> 16) & 255);
                    int i34 = i33 + 1;
                    bArr9[i33] = (byte) ((j13 >> 8) & 255);
                    this.pos = i34 + 1;
                    bArr9[i34] = (byte) (j13 & 255);
                    return;
                default:
                    return;
            }
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
                if (i13 != 2) {
                    if (i13 != 3) {
                        if (i13 == 4) {
                            byte[] bArr2 = this.buffer;
                            int i14 = i12 + 1;
                            byte[] bArr3 = this.encodeTable;
                            long j10 = this.bitWorkArea;
                            bArr2[i12] = bArr3[((int) (j10 >> 27)) & 31];
                            int i15 = i14 + 1;
                            bArr2[i14] = bArr3[((int) (j10 >> 22)) & 31];
                            int i16 = i15 + 1;
                            bArr2[i15] = bArr3[((int) (j10 >> 17)) & 31];
                            int i17 = i16 + 1;
                            bArr2[i16] = bArr3[((int) (j10 >> 12)) & 31];
                            int i18 = i17 + 1;
                            bArr2[i17] = bArr3[((int) (j10 >> 7)) & 31];
                            int i19 = i18 + 1;
                            bArr2[i18] = bArr3[((int) (j10 >> 2)) & 31];
                            int i20 = i19 + 1;
                            bArr2[i19] = bArr3[((int) (j10 << 3)) & 31];
                            this.pos = i20 + 1;
                            bArr2[i20] = 61;
                        }
                    } else {
                        byte[] bArr4 = this.buffer;
                        int i21 = i12 + 1;
                        byte[] bArr5 = this.encodeTable;
                        long j11 = this.bitWorkArea;
                        bArr4[i12] = bArr5[((int) (j11 >> 19)) & 31];
                        int i22 = i21 + 1;
                        bArr4[i21] = bArr5[((int) (j11 >> 14)) & 31];
                        int i23 = i22 + 1;
                        bArr4[i22] = bArr5[((int) (j11 >> 9)) & 31];
                        int i24 = i23 + 1;
                        bArr4[i23] = bArr5[((int) (j11 >> 4)) & 31];
                        int i25 = i24 + 1;
                        bArr4[i24] = bArr5[((int) (j11 << 1)) & 31];
                        int i26 = i25 + 1;
                        bArr4[i25] = 61;
                        int i27 = i26 + 1;
                        bArr4[i26] = 61;
                        this.pos = i27 + 1;
                        bArr4[i27] = 61;
                    }
                } else {
                    byte[] bArr6 = this.buffer;
                    int i28 = i12 + 1;
                    byte[] bArr7 = this.encodeTable;
                    long j12 = this.bitWorkArea;
                    bArr6[i12] = bArr7[((int) (j12 >> 11)) & 31];
                    int i29 = i28 + 1;
                    bArr6[i28] = bArr7[((int) (j12 >> 6)) & 31];
                    int i30 = i29 + 1;
                    bArr6[i29] = bArr7[((int) (j12 >> 1)) & 31];
                    int i31 = i30 + 1;
                    bArr6[i30] = bArr7[((int) (j12 << 4)) & 31];
                    int i32 = i31 + 1;
                    bArr6[i31] = 61;
                    int i33 = i32 + 1;
                    bArr6[i32] = 61;
                    int i34 = i33 + 1;
                    bArr6[i33] = 61;
                    this.pos = i34 + 1;
                    bArr6[i34] = 61;
                }
            } else {
                byte[] bArr8 = this.buffer;
                int i35 = i12 + 1;
                byte[] bArr9 = this.encodeTable;
                long j13 = this.bitWorkArea;
                bArr8[i12] = bArr9[((int) (j13 >> 3)) & 31];
                int i36 = i35 + 1;
                bArr8[i35] = bArr9[((int) (j13 << 2)) & 31];
                int i37 = i36 + 1;
                bArr8[i36] = 61;
                int i38 = i37 + 1;
                bArr8[i37] = 61;
                int i39 = i38 + 1;
                bArr8[i38] = 61;
                int i40 = i39 + 1;
                bArr8[i39] = 61;
                int i41 = i40 + 1;
                bArr8[i40] = 61;
                this.pos = i41 + 1;
                bArr8[i41] = 61;
            }
            int i42 = this.currentLinePos;
            int i43 = this.pos;
            int i44 = (i43 - i12) + i42;
            this.currentLinePos = i44;
            if (this.lineLength > 0 && i44 > 0) {
                byte[] bArr10 = this.lineSeparator;
                System.arraycopy(bArr10, 0, this.buffer, i43, bArr10.length);
                this.pos += this.lineSeparator.length;
                return;
            }
            return;
        }
        int i45 = i10;
        int i46 = 0;
        while (i46 < i11) {
            ensureBufferSize(this.encodeSize);
            int i47 = (this.modulus + 1) % 5;
            this.modulus = i47;
            int i48 = i45 + 1;
            int i49 = bArr[i45];
            if (i49 < 0) {
                i49 += 256;
            }
            long j14 = (this.bitWorkArea << 8) + i49;
            this.bitWorkArea = j14;
            if (i47 == 0) {
                byte[] bArr11 = this.buffer;
                int i50 = this.pos;
                int i51 = i50 + 1;
                byte[] bArr12 = this.encodeTable;
                bArr11[i50] = bArr12[((int) (j14 >> 35)) & 31];
                int i52 = i51 + 1;
                bArr11[i51] = bArr12[((int) (j14 >> 30)) & 31];
                int i53 = i52 + 1;
                bArr11[i52] = bArr12[((int) (j14 >> 25)) & 31];
                int i54 = i53 + 1;
                bArr11[i53] = bArr12[((int) (j14 >> 20)) & 31];
                int i55 = i54 + 1;
                bArr11[i54] = bArr12[((int) (j14 >> 15)) & 31];
                int i56 = i55 + 1;
                bArr11[i55] = bArr12[((int) (j14 >> 10)) & 31];
                int i57 = i56 + 1;
                bArr11[i56] = bArr12[((int) (j14 >> 5)) & 31];
                int i58 = i57 + 1;
                this.pos = i58;
                bArr11[i57] = bArr12[((int) j14) & 31];
                int i59 = this.currentLinePos + 8;
                this.currentLinePos = i59;
                int i60 = this.lineLength;
                if (i60 > 0 && i60 <= i59) {
                    byte[] bArr13 = this.lineSeparator;
                    System.arraycopy(bArr13, 0, bArr11, i58, bArr13.length);
                    this.pos += this.lineSeparator.length;
                    this.currentLinePos = 0;
                }
            }
            i46++;
            i45 = i48;
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

    public Base32(boolean z10) {
        this(0, null, z10);
    }

    public Base32(int i10) {
        this(i10, CHUNK_SEPARATOR);
    }

    public Base32(int i10, byte[] bArr) {
        this(i10, bArr, false);
    }

    public Base32(int i10, byte[] bArr, boolean z10) {
        super(5, 8, i10, bArr == null ? 0 : bArr.length);
        if (z10) {
            this.encodeTable = HEX_ENCODE_TABLE;
            this.decodeTable = HEX_DECODE_TABLE;
        } else {
            this.encodeTable = ENCODE_TABLE;
            this.decodeTable = DECODE_TABLE;
        }
        if (i10 <= 0) {
            this.encodeSize = 8;
            this.lineSeparator = null;
        } else if (bArr != null) {
            if (!containsAlphabetOrPad(bArr)) {
                this.encodeSize = bArr.length + 8;
                byte[] bArr2 = new byte[bArr.length];
                this.lineSeparator = bArr2;
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            } else {
                throw new IllegalArgumentException(h.d("lineSeparator must not contain Base32 characters: [", StringUtils.newStringUtf8(bArr), "]"));
            }
        } else {
            throw new IllegalArgumentException(a.g("lineLength ", i10, " > 0, but lineSeparator is null"));
        }
        this.decodeSize = this.encodeSize - 1;
    }
}
