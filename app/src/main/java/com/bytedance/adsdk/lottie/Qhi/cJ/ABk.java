package com.bytedance.adsdk.lottie.Qhi.cJ;

import java.util.List;

/* compiled from: ScaleKeyframeAnimation.java */
/* loaded from: classes.dex */
public class ABk extends Sf<com.bytedance.adsdk.lottie.ROR.ac> {
    private final com.bytedance.adsdk.lottie.ROR.ac CJ;

    public ABk(List<com.bytedance.adsdk.lottie.ROR.Qhi<com.bytedance.adsdk.lottie.ROR.ac>> list) {
        super(list);
        this.CJ = new com.bytedance.adsdk.lottie.ROR.ac();
    }

    @Override // com.bytedance.adsdk.lottie.Qhi.cJ.Qhi
    /* renamed from: cJ */
    public com.bytedance.adsdk.lottie.ROR.ac Qhi(com.bytedance.adsdk.lottie.ROR.Qhi<com.bytedance.adsdk.lottie.ROR.ac> qhi, float f10) {
        com.bytedance.adsdk.lottie.ROR.ac acVar;
        com.bytedance.adsdk.lottie.ROR.ac acVar2 = qhi.Qhi;
        if (acVar2 != null && (acVar = qhi.cJ) != null) {
            com.bytedance.adsdk.lottie.ROR.ac acVar3 = acVar2;
            com.bytedance.adsdk.lottie.ROR.ac acVar4 = acVar;
            if (this.f7744ac == null) {
                this.CJ.Qhi(com.bytedance.adsdk.lottie.Tgh.Tgh.Qhi(acVar3.Qhi(), acVar4.Qhi(), f10), com.bytedance.adsdk.lottie.Tgh.Tgh.Qhi(acVar3.cJ(), acVar4.cJ(), f10));
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
