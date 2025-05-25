package com.bytedance.adsdk.lottie.Tgh;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.activity.r;
import com.bytedance.adsdk.lottie.ac.cJ.pA;
import com.bytedance.component.sdk.annotation.FloatRange;

/* compiled from: MiscUtils.java */
/* loaded from: classes.dex */
public class Tgh {
    private static final PointF Qhi = new PointF();

    public static float Qhi(float f10, float f11, @FloatRange(from = 0.0d, to = 1.0d) float f12) {
        return r.l(f11, f10, f12, f10);
    }

    public static boolean ac(float f10, float f11, float f12) {
        if (f10 >= f11 && f10 <= f12) {
            return true;
        }
        return false;
    }

    private static int cJ(int i10, int i11) {
        int i12 = i10 / i11;
        return (((i10 ^ i11) >= 0) || i10 % i11 == 0) ? i12 : i12 - 1;
    }

    public static int Qhi(int i10, int i11, @FloatRange(from = 0.0d, to = 1.0d) float f10) {
        return (int) ((f10 * (i11 - i10)) + i10);
    }

    public static PointF Qhi(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float cJ(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f12, f10));
    }

    public static void Qhi(pA pAVar, Path path) {
        path.reset();
        PointF Qhi2 = pAVar.Qhi();
        path.moveTo(Qhi2.x, Qhi2.y);
        Qhi.set(Qhi2.x, Qhi2.y);
        for (int i10 = 0; i10 < pAVar.ac().size(); i10++) {
            com.bytedance.adsdk.lottie.ac.Qhi qhi = pAVar.ac().get(i10);
            PointF Qhi3 = qhi.Qhi();
            PointF cJ = qhi.cJ();
            PointF ac2 = qhi.ac();
            PointF pointF = Qhi;
            if (Qhi3.equals(pointF) && cJ.equals(ac2)) {
                path.lineTo(ac2.x, ac2.y);
            } else {
                path.cubicTo(Qhi3.x, Qhi3.y, cJ.x, cJ.y, ac2.x, ac2.y);
            }
            pointF.set(ac2.x, ac2.y);
        }
        if (pAVar.cJ()) {
            path.close();
        }
    }

    public static int Qhi(float f10, float f11) {
        return Qhi((int) f10, (int) f11);
    }

    private static int Qhi(int i10, int i11) {
        return i10 - (i11 * cJ(i10, i11));
    }

    public static int Qhi(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i12, i10));
    }
}
