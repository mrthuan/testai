package com.bykv.vk.openvk.preload.geckox.utils;

import java.io.InputStream;
import java.security.MessageDigest;

/* compiled from: MD5Utils.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    static final char[] f7665a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static void a(InputStream inputStream, String str) {
        if (str != null) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                try {
                    try {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int read = inputStream.read(bArr, 0, 4096);
                            if (read == -1) {
                                break;
                            }
                            messageDigest.update(bArr, 0, read);
                        }
                        try {
                            byte[] digest = messageDigest.digest();
                            String a10 = a(digest, digest.length);
                            if (!str.equals(a10)) {
                                throw new RuntimeException(androidx.appcompat.view.menu.d.d("md5 check failed file: local md5:", a10, " expect md5:", str));
                            }
                            return;
                        } catch (Exception e10) {
                            throw new RuntimeException("md5 check failed:" + e10.getMessage(), e10);
                        }
                    } catch (Exception e11) {
                        throw new RuntimeException("md5 check failed:" + e11.getMessage(), e11);
                    }
                } finally {
                    CloseableUtils.close(inputStream);
                }
            } catch (Exception e12) {
                throw new RuntimeException("md5 check failed:" + e12.getMessage(), e12);
            }
        }
        throw new RuntimeException("md5 check failed: md5 == null");
    }

    private static String a(byte[] bArr, int i10) {
        if (bArr != null) {
            if (i10 + 0 <= bArr.length) {
                int i11 = i10 * 2;
                char[] cArr = new char[i11];
                int i12 = 0;
                for (int i13 = 0; i13 < i10; i13++) {
                    int i14 = bArr[i13 + 0] & 255;
                    int i15 = i12 + 1;
                    char[] cArr2 = f7665a;
                    cArr[i12] = cArr2[i14 >> 4];
                    i12 = i15 + 1;
                    cArr[i15] = cArr2[i14 & 15];
                }
                return new String(cArr, 0, i11);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new NullPointerException("bytes is null");
    }
}
