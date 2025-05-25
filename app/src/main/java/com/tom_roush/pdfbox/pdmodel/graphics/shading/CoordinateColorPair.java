package com.tom_roush.pdfbox.pdmodel.graphics.shading;

import android.graphics.PointF;

/* loaded from: classes2.dex */
class CoordinateColorPair {
    final float[] color;
    final PointF coordinate;

    public CoordinateColorPair(PointF pointF, float[] fArr) {
        this.coordinate = pointF;
        this.color = (float[]) fArr.clone();
    }
}
