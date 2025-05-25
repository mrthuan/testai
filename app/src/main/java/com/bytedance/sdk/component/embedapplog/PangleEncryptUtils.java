package com.bytedance.sdk.component.embedapplog;

/* loaded from: classes.dex */
class PangleEncryptUtils {
    static {
        try {
            System.loadLibrary("tobEmbedPagEncrypt");
        } catch (UnsatisfiedLinkError e10) {
            e10.getMessage();
        }
    }

    public static byte[] decrypt(byte[] bArr, int i10) {
        try {
            return ttDecrypt(bArr, i10);
        } catch (Throwable th2) {
            th2.getMessage();
            return null;
        }
    }

    public static byte[] encrypt(byte[] bArr, int i10) {
        try {
            return ttEncrypt(bArr, i10);
        } catch (Throwable th2) {
            th2.getMessage();
            return null;
        }
    }

    private static native byte[] ttDecrypt(byte[] bArr, int i10);

    private static native byte[] ttEncrypt(byte[] bArr, int i10);
}
