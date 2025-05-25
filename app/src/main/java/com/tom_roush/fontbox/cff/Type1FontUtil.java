package com.tom_roush.fontbox.cff;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.util.Locale;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* loaded from: classes2.dex */
public final class Type1FontUtil {
    private Type1FontUtil() {
    }

    public static byte[] charstringDecrypt(byte[] bArr, int i10) {
        return decrypt(bArr, 4330, i10);
    }

    public static byte[] charstringEncrypt(byte[] bArr, int i10) {
        return encrypt(bArr, 4330, i10);
    }

    private static byte[] decrypt(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[bArr.length];
        for (int i12 = 0; i12 < bArr.length; i12++) {
            int i13 = bArr[i12] & FunctionEval.FunctionID.EXTERNAL_FUNC;
            bArr2[i12] = (byte) ((i10 >> 8) ^ i13);
            i10 = 65535 & (((i13 + i10) * 52845) + 22719);
        }
        int length = bArr.length - i11;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr2, i11, bArr3, 0, length);
        return bArr3;
    }

    public static byte[] eexecDecrypt(byte[] bArr) {
        return decrypt(bArr, 55665, 4);
    }

    public static byte[] eexecEncrypt(byte[] bArr) {
        return encrypt(bArr, 55665, 4);
    }

    private static byte[] encrypt(byte[] bArr, int i10, int i11) {
        int length = bArr.length + i11;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, i11, length - i11);
        byte[] bArr3 = new byte[length];
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = (bArr2[i12] & 255) ^ (i10 >> 8);
            bArr3[i12] = (byte) i13;
            i10 = 65535 & (((i13 + i10) * 52845) + 22719);
        }
        return bArr3;
    }

    public static byte[] hexDecode(String str) {
        if (str.length() % 2 == 0) {
            byte[] bArr = new byte[str.length() / 2];
            int i10 = 0;
            while (i10 < str.length()) {
                int i11 = i10 + 2;
                bArr[i10 / 2] = (byte) Integer.parseInt(str.substring(i10, i11), 16);
                i10 = i11;
            }
            return bArr;
        }
        throw new IllegalArgumentException();
    }

    public static String hexEncode(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            String hexString = Integer.toHexString(b10 & 255);
            if (hexString.length() == 1) {
                sb2.append(PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES);
            }
            sb2.append(hexString.toUpperCase(Locale.US));
        }
        return sb2.toString();
    }
}
