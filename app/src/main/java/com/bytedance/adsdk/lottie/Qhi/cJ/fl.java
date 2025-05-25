package com.bytedance.adsdk.lottie.Qhi.cJ;

import java.util.List;

/* compiled from: FloatKeyframeAnimation.java */
/* loaded from: classes.dex */
public class fl extends Sf<Float> {
    public fl(List<com.bytedance.adsdk.lottie.ROR.Qhi<Float>> list) {
        super(list);
    }

    public float ac(com.bytedance.adsdk.lottie.ROR.Qhi<Float> qhi, float f10) {
        if (qhi.Qhi != null && qhi.cJ != null) {
            if (this.f7744ac == null) {
                return com.bytedance.adsdk.lottie.Tgh.Tgh.Qhi(qhi.Tgh(), qhi.ROR(), f10);
            }
            qhi.ROR.floatValue();
            CJ();
            Sf();
            throw null;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }

    @Override // com.bytedance.adsdk.lottie.Qhi.cJ.Qhi
    /* renamed from: cJ */
    public Float Qhi(com.bytedance.adsdk.lottie.ROR.Qhi<Float> qhi, float f10) {
        return Float.valueOf(ac(qhi, f10));
    }

    public float hm() {
        return ac(ac(), fl());
    }
}
