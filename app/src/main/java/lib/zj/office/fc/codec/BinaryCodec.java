package lib.zj.office.fc.codec;

import lib.zj.office.fc.hwpf.usermodel.Field;

/* loaded from: classes3.dex */
public class BinaryCodec implements BinaryDecoder, BinaryEncoder {
    private static final int BIT_0 = 1;
    private static final int BIT_1 = 2;
    private static final int BIT_2 = 4;
    private static final int BIT_3 = 8;
    private static final int BIT_4 = 16;
    private static final int BIT_5 = 32;
    private static final int BIT_6 = 64;
    private static final int BIT_7 = 128;
    private static final char[] EMPTY_CHAR_ARRAY = new char[0];
    private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    private static final int[] BITS = {1, 2, 4, 8, 16, 32, 64, 128};

    public static byte[] fromAscii(char[] cArr) {
        if (cArr != null && cArr.length != 0) {
            int length = cArr.length >> 3;
            byte[] bArr = new byte[length];
            int length2 = cArr.length - 1;
            int i10 = 0;
            while (i10 < length) {
                int i11 = 0;
                while (true) {
                    int[] iArr = BITS;
                    if (i11 < iArr.length) {
                        if (cArr[length2 - i11] == '1') {
                            bArr[i10] = (byte) (iArr[i11] | bArr[i10]);
                        }
                        i11++;
                    }
                }
                i10++;
                length2 -= 8;
            }
            return bArr;
        }
        return EMPTY_BYTE_ARRAY;
    }

    private static boolean isEmpty(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            return false;
        }
        return true;
    }

    public static byte[] toAsciiBytes(byte[] bArr) {
        if (isEmpty(bArr)) {
            return EMPTY_BYTE_ARRAY;
        }
        int length = bArr.length << 3;
        byte[] bArr2 = new byte[length];
        int i10 = length - 1;
        int i11 = 0;
        while (i11 < bArr.length) {
            int i12 = 0;
            while (true) {
                int[] iArr = BITS;
                if (i12 < iArr.length) {
                    if ((iArr[i12] & bArr[i11]) == 0) {
                        bArr2[i10 - i12] = 48;
                    } else {
                        bArr2[i10 - i12] = Field.EQ;
                    }
                    i12++;
                }
            }
            i11++;
            i10 -= 8;
        }
        return bArr2;
    }

    public static char[] toAsciiChars(byte[] bArr) {
        if (isEmpty(bArr)) {
            return EMPTY_CHAR_ARRAY;
        }
        int length = bArr.length << 3;
        char[] cArr = new char[length];
        int i10 = length - 1;
        int i11 = 0;
        while (i11 < bArr.length) {
            int i12 = 0;
            while (true) {
                int[] iArr = BITS;
                if (i12 < iArr.length) {
                    if ((iArr[i12] & bArr[i11]) == 0) {
                        cArr[i10 - i12] = '0';
                    } else {
                        cArr[i10 - i12] = '1';
                    }
                    i12++;
                }
            }
            i11++;
            i10 -= 8;
        }
        return cArr;
    }

    public static String toAsciiString(byte[] bArr) {
        return new String(toAsciiChars(bArr));
    }

    @Override // lib.zj.office.fc.codec.Decoder
    public Object decode(Object obj) {
        if (obj == null) {
            return EMPTY_BYTE_ARRAY;
        }
        if (obj instanceof byte[]) {
            return fromAscii((byte[]) obj);
        }
        if (obj instanceof char[]) {
            return fromAscii((char[]) obj);
        }
        if (obj instanceof String) {
            return fromAscii(((String) obj).toCharArray());
        }
        throw new DecoderException("argument not a byte array");
    }

    @Override // lib.zj.office.fc.codec.BinaryEncoder
    public byte[] encode(byte[] bArr) {
        return toAsciiBytes(bArr);
    }

    public byte[] toByteArray(String str) {
        if (str == null) {
            return EMPTY_BYTE_ARRAY;
        }
        return fromAscii(str.toCharArray());
    }

    @Override // lib.zj.office.fc.codec.Encoder
    public Object encode(Object obj) {
        if (obj instanceof byte[]) {
            return toAsciiChars((byte[]) obj);
        }
        throw new EncoderException("argument not a byte array");
    }

    public static byte[] fromAscii(byte[] bArr) {
        if (isEmpty(bArr)) {
            return EMPTY_BYTE_ARRAY;
        }
        int length = bArr.length >> 3;
        byte[] bArr2 = new byte[length];
        int length2 = bArr.length - 1;
        int i10 = 0;
        while (i10 < length) {
            int i11 = 0;
            while (true) {
                int[] iArr = BITS;
                if (i11 < iArr.length) {
                    if (bArr[length2 - i11] == 49) {
                        bArr2[i10] = (byte) (iArr[i11] | bArr2[i10]);
                    }
                    i11++;
                }
            }
            i10++;
            length2 -= 8;
        }
        return bArr2;
    }

    @Override // lib.zj.office.fc.codec.BinaryDecoder
    public byte[] decode(byte[] bArr) {
        return fromAscii(bArr);
    }
}
