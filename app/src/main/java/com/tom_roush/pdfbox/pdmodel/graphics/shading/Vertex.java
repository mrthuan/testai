package com.tom_roush.pdfbox.pdmodel.graphics.shading;

import android.graphics.PointF;

/* loaded from: classes2.dex */
class Vertex {
    public float[] color;
    public PointF point;

    public Vertex(PointF pointF, float[] fArr) {
        this.point = pointF;
        this.color = (float[]) fArr.clone();
    }

    public String toString() {
        float[] fArr;
        StringBuilder sb2 = new StringBuilder();
        for (float f10 : this.color) {
            if (sb2.length() > 0) {
                sb2.append(' ');
            }
            sb2.append(String.format("%3.2f", Float.valueOf(f10)));
        }
        return "Vertex{ " + this.point + ", colors=[" + ((Object) sb2) + "] }";
    }
}
