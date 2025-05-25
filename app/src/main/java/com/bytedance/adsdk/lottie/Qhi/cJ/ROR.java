package com.bytedance.adsdk.lottie.Qhi.cJ;

import java.util.List;

/* compiled from: IntegerKeyframeAnimation.java */
/* loaded from: classes.dex */
public class ROR extends Sf<Integer> {
    public ROR(List<com.bytedance.adsdk.lottie.ROR.Qhi<Integer>> list) {
        super(list);
    }

    public int ac(com.bytedance.adsdk.lottie.ROR.Qhi<Integer> qhi, float f10) {
        if (qhi.Qhi != null && qhi.cJ != null) {
            if (this.f7744ac == null) {
                return com.bytedance.adsdk.lottie.Tgh.Tgh.Qhi(qhi.Sf(), qhi.hm(), f10);
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
