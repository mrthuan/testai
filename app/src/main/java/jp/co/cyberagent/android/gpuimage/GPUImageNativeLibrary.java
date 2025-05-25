package jp.co.cyberagent.android.gpuimage;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public class GPUImageNativeLibrary {
    static {
        System.loadLibrary("yuv-decoder");
    }

    public static native void YUVtoARBG(byte[] bArr, int i10, int i11, int[] iArr);

    public static native void YUVtoRBGA(byte[] bArr, int i10, int i11, int[] iArr);

    public static native void adjustBitmap(Bitmap bitmap);
}
