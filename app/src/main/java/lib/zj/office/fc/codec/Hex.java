package lib.zj.office.fc.codec;

import androidx.activity.r;
import java.io.UnsupportedEncodingException;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* loaded from: classes3.dex */
public class Hex implements BinaryEncoder, BinaryDecoder {
    public static final String DEFAULT_CHARSET_NAME = "UTF-8";
    private static final char[] DIGITS_LOWER = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final char[] DIGITS_UPPER = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private final String charsetName;

    public Hex() {
        this.charsetName = "UTF-8";
    }

    public static byte[] decodeHex(char[] cArr) {
        int length = cArr.length;
        if ((length & 1) == 0) {
            byte[] bArr = new byte[length >> 1];
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                int i12 = i10 + 1;
                i10 = i12 + 1;
                bArr[i11] = (byte) (((toDigit(cArr[i10], i10) << 4) | toDigit(cArr[i12], i12)) & FunctionEval.FunctionID.EXTERNAL_FUNC);
                i11++;
            }
            return bArr;
        }
        throw new DecoderException("Odd number of characters.");
    }

    public static char[] encodeHex(byte[] bArr) {
        return encodeHex(bArr, true);
    }

    public static String encodeHexString(byte[] bArr) {
        return new String(encodeHex(bArr));
    }

    public static int toDigit(char c, int i10) {
        int digit = Character.digit(c, 16);
        if (digit != -1) {
            return digit;
        }
        throw new DecoderException("Illegal hexadecimal character " + c + " at index " + i10);
    }

    @Override // lib.zj.office.fc.codec.BinaryDecoder
    public byte[] decode(byte[] bArr) {
        try {
            return decodeHex(new String(bArr, getCharsetName()).toCharArray());
        } catch (UnsupportedEncodingException e10) {
            throw new DecoderException(e10.getMessage(), e10);
        }
    }

    @Override // lib.zj.office.fc.codec.BinaryEncoder
    public byte[] encode(byte[] bArr) {
        return StringUtils.getBytesUnchecked(encodeHexString(bArr), getCharsetName());
    }

    public String getCharsetName() {
        return this.charsetName;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[charsetName=");
        return r.g(sb2, this.charsetName, "]");
    }

    public static char[] encodeHex(byte[] bArr, boolean z10) {
        return encodeHex(bArr, z10 ? DIGITS_LOWER : DIGITS_UPPER);
    }

    @Override // lib.zj.office.fc.codec.Encoder
    public Object encode(Object obj) {
        try {
            return encodeHex(obj instanceof String ? ((String) obj).getBytes(getCharsetName()) : (byte[]) obj);
        } catch (UnsupportedEncodingException e10) {
            throw new EncoderException(e10.getMessage(), e10);
        } catch (ClassCastException e11) {
            throw new EncoderException(e11.getMessage(), e11);
        }
    }

    public Hex(String str) {
        this.charsetName = str;
    }

    public static char[] encodeHex(byte[] bArr, char[] cArr) {
        char[] cArr2 = new char[bArr.length << 1];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            cArr2[i10] = cArr[(b10 & 240) >>> 4];
            i10 = i11 + 1;
            cArr2[i11] = cArr[b10 & 15];
        }
        return cArr2;
    }

    @Override // lib.zj.office.fc.codec.Decoder
    public Object decode(Object obj) {
        try {
            return decodeHex(obj instanceof String ? ((String) obj).toCharArray() : (char[]) obj);
        } catch (ClassCastException e10) {
            throw new DecoderException(e10.getMessage(), e10);
        }
    }
}
