package com.bytedance.adsdk.lottie;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;
import androidx.activity.r;

/* compiled from: PathInterpolatorApi14.java */
/* loaded from: classes.dex */
class hpZ implements Interpolator {
    private final float[] Qhi;
    private final float[] cJ;

    public hpZ(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i10 = ((int) (length / 0.002f)) + 1;
        this.Qhi = new float[i10];
        this.cJ = new float[i10];
        float[] fArr = new float[2];
        for (int i11 = 0; i11 < i10; i11++) {
            pathMeasure.getPosTan((i11 * length) / (i10 - 1), fArr, null);
            this.Qhi[i11] = fArr[0];
            this.cJ[i11] = fArr[1];
        }
    }

    private static Path Qhi(float f10, float f11, float f12, float f13) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f10, f11, f12, f13, 1.0f, 1.0f);
        return path;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        int length = this.Qhi.length - 1;
        int i10 = 0;
        while (length - i10 > 1) {
            int i11 = (i10 + length) / 2;
            if (f10 < this.Qhi[i11]) {
                length = i11;
            } else {
                i10 = i11;
            }
        }
        float[] fArr = this.Qhi;
        float f11 = fArr[length];
        float f12 = fArr[i10];
        float f13 = f11 - f12;
        if (f13 == 0.0f) {
            return this.cJ[i10];
        }
        float[] fArr2 = this.cJ;
        float f14 = fArr2[i10];
        return r.l(fArr2[length], f14, (f10 - f12) / f13, f14);
    }

    public hpZ(float f10, float f11, float f12, float f13) {
        this(Qhi(f10, f11, f12, f13));
    }
}
