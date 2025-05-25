package com.bytedance.adsdk.lottie.Qhi.cJ;

import java.util.List;

/* compiled from: ColorKeyframeAnimation.java */
/* loaded from: classes.dex */
public class cJ extends Sf<Integer> {
    public cJ(List<com.bytedance.adsdk.lottie.ROR.Qhi<Integer>> list) {
        super(list);
    }

    public int ac(com.bytedance.adsdk.lottie.ROR.Qhi<Integer> qhi, float f10) {
        if (qhi.Qhi != null && qhi.cJ != null) {
            if (this.f7744ac == null) {
                return com.bytedance.adsdk.lottie.Tgh.cJ.Qhi(com.bytedance.adsdk.lottie.Tgh.Tgh.cJ(f10, 0.0f, 1.0f), qhi.Qhi.intValue(), qhi.cJ.intValue());
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
    public Integer Qhi(com.bytedance.adsdk.lottie.ROR.Qhi<Integer> qhi, float f10) {
        return Integer.valueOf(ac(qhi, f10));
    }

    public int hm() {
        return ac(ac(), fl());
    }
}
