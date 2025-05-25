package com.bytedance.sdk.component.CJ;

import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.sdk.component.utils.ABk;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: AES.java */
/* loaded from: classes.dex */
public class Qhi {
    private static String Qhi;

    @Deprecated
    public static String Qhi(String str, String str2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "AES");
            if (TextUtils.isEmpty(Qhi)) {
                Qhi = Qhi("AES/CBC/PKCS5Padding");
            }
            Cipher cipher = Cipher.getInstance(Qhi);
            cipher.init(1, secretKeySpec);
            return Base64.encodeToString(cipher.doFinal(str.getBytes("utf-8")), 0);
        } catch (Throwable th2) {
            th2.getMessage();
            return null;
        }
    }

    public static String cJ(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] decode = Base64.decode(str, 0);
            SecretKeySpec secretKeySpec = new SecretKeySpec(str3.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, new IvParameterSpec(str2.getBytes()));
            return new String(cipher.doFinal(decode));
        } catch (Throwable th2) {
            ABk.cJ(th2.getMessage());
            return null;
        }
    }

    public static String Qhi(String str, String str2, String str3) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(str3.getBytes(), "AES");
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, secretKeySpec, new IvParameterSpec(str2.getBytes()));
            return Base64.encodeToString(cipher.doFinal(str.getBytes("utf-8")), 0);
        } catch (Throwable th2) {
            ABk.cJ(th2.getMessage());
            return null;
        }
    }

    @Deprecated
    public static String cJ(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] decode = Base64.decode(str, 0);
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "AES");
            if (TextUtils.isEmpty(Qhi)) {
                Qhi = Qhi("AES/CBC/PKCS5Padding");
            }
            Cipher cipher = Cipher.getInstance(Qhi);
            cipher.init(2, secretKeySpec);
            return new String(cipher.doFinal(decode));
        } catch (Exception unused) {
            return null;
        }
    }

    public static String Qhi(String str) {
        int[] iArr = new int[str.length()];
        iArr[4] = 6;
        iArr[5] = 1;
        iArr[6] = 1;
        return new String(Qhi(str.getBytes(), iArr));
    }

    public static byte[] Qhi(byte[] bArr, int[] iArr) {
        if (bArr == null || bArr.length == 0 || iArr == null || iArr.length == 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            bArr2[i10] = (byte) (bArr[i10] ^ iArr[i10 % iArr.length]);
        }
        return bArr2;
    }
}
