package com.dj.lib.rtt;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public class RTT {
    static {
        System.loadLibrary("rtt");
    }

    public static native float[] findRectPoint(Bitmap bitmap);
}
