package com.bytedance.adsdk.lottie.Qhi.cJ;

import android.graphics.PointF;
import androidx.activity.r;
import java.util.List;

/* compiled from: PointKeyframeAnimation.java */
/* loaded from: classes.dex */
public class zc extends Sf<PointF> {
    private final PointF CJ;

    public zc(List<com.bytedance.adsdk.lottie.ROR.Qhi<PointF>> list) {
        super(list);
        this.CJ = new PointF();
    }

    @Override // com.bytedance.adsdk.lottie.Qhi.cJ.Qhi
    /* renamed from: cJ */
    public PointF Qhi(com.bytedance.adsdk.lottie.ROR.Qhi<PointF> qhi, float f10) {
        return Qhi(qhi, f10, f10, f10);
    }

    @Override // com.bytedance.adsdk.lottie.Qhi.cJ.Qhi
    /* renamed from: cJ */
    public PointF Qhi(com.bytedance.adsdk.lottie.ROR.Qhi<PointF> qhi, float f10, float f11, float f12) {
        PointF pointF;
        PointF pointF2 = qhi.Qhi;
        if (pointF2 != null && (pointF = qhi.cJ) != null) {
            PointF pointF3 = pointF2;
            PointF pointF4 = pointF;
            if (this.f7744ac == null) {
                PointF pointF5 = this.CJ;
                float f13 = pointF3.x;
                float l10 = r.l(pointF4.x, f13, f11, f13);
                float f14 = pointF3.y;
                pointF5.set(l10, ((pointF4.y - f14) * f12) + f14);
                return this.CJ;
            }
            qhi.ROR.floatValue();
            CJ();
            Sf();
            throw null;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
