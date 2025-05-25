package com.inmobi.media;

import android.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.inmobi.media.u3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1823u3 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f15489a = 0;

    public static byte[] a(String str) {
        int i10;
        String str2;
        if (str != null) {
            int length = str.length() % 4;
            i10 = length + ((((length ^ 4) & ((-length) | length)) >> 31) & 4);
        } else {
            i10 = 0;
        }
        if (str != null) {
            StringBuilder reverse = new StringBuilder((CharSequence) str).reverse();
            kotlin.jvm.internal.g.d(reverse, "StringBuilder(this).reverse()");
            str2 = reverse.toString();
        } else {
            str2 = null;
        }
        String valueOf = String.valueOf(str2);
        for (int i11 = 0; i11 < i10; i11++) {
            valueOf = valueOf + '=';
        }
        byte[] bytes = valueOf.getBytes(kotlin.text.a.f19966b);
        kotlin.jvm.internal.g.d(bytes, "this as java.lang.String).getBytes(charset)");
        return Base64.decode(bytes, 2);
    }

    public static String a(String data, byte[] bArr) {
        byte[] bArr2;
        kotlin.jvm.internal.g.e(data, "data");
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        try {
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS7Padding");
            kotlin.jvm.internal.g.d(cipher, "getInstance(...)");
            cipher.init(1, secretKeySpec);
            byte[] bytes = data.getBytes(kotlin.text.a.f19966b);
            kotlin.jvm.internal.g.d(bytes, "this as java.lang.String).getBytes(charset)");
            bArr2 = cipher.doFinal(bytes);
        } catch (Throwable th2) {
            th2.getMessage();
            bArr2 = null;
        }
        byte[] encode = Base64.encode(bArr2, 2);
        kotlin.jvm.internal.g.d(encode, "encode(...)");
        return new String(encode, kotlin.text.a.f19966b);
    }
}
