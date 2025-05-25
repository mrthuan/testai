package com.lib.detect.edge;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public class MNNDetectEdgeNativeHelper {
    static {
        System.loadLibrary("cvlib");
    }

    public static native synchronized long initSession(String str);

    public static native synchronized Bitmap processImageWithMNN(long j10, Bitmap bitmap);

    public static native synchronized void releaseSession(long j10);
}
