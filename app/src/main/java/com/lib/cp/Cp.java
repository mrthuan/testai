package com.lib.cp;

import android.graphics.Bitmap;
import android.graphics.Point;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* loaded from: classes2.dex */
public class Cp {
    static {
        System.loadLibrary("cvlib");
    }

    public static Bitmap a(Bitmap bitmap, Point[] pointArr) {
        if (pointArr.length == 4) {
            Point point = pointArr[0];
            Point point2 = pointArr[1];
            Point point3 = pointArr[2];
            Point point4 = pointArr[3];
            Bitmap createBitmap = Bitmap.createBitmap((int) ((t0.R(point4, point3) + t0.R(point, point2)) / 2.0d), (int) ((t0.R(point2, point3) + t0.R(point, point4)) / 2.0d), Bitmap.Config.ARGB_8888);
            if (nativeCrop(bitmap, pointArr, createBitmap) != 0) {
                return createBitmap;
            }
            throw new RuntimeException("Crop failed");
        }
        throw new IllegalArgumentException("Size is not 4");
    }

    private static native int nativeCrop(Bitmap bitmap, Point[] pointArr, Bitmap bitmap2);
}
