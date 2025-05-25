package com.bytedance.adsdk.lottie.Qhi.cJ;

import java.util.List;

/* compiled from: GradientColorKeyframeAnimation.java */
/* loaded from: classes.dex */
public class Tgh extends Sf<com.bytedance.adsdk.lottie.ac.cJ.fl> {
    private final com.bytedance.adsdk.lottie.ac.cJ.fl CJ;

    public Tgh(List<com.bytedance.adsdk.lottie.ROR.Qhi<com.bytedance.adsdk.lottie.ac.cJ.fl>> list) {
        super(list);
        com.bytedance.adsdk.lottie.ac.cJ.fl flVar = list.get(0).Qhi;
        int ac2 = flVar != null ? flVar.ac() : 0;
        this.CJ = new com.bytedance.adsdk.lottie.ac.cJ.fl(new float[ac2], new int[ac2]);
    }

    @Override // com.bytedance.adsdk.lottie.Qhi.cJ.Qhi
    /* renamed from: cJ */
    public com.bytedance.adsdk.lottie.ac.cJ.fl Qhi(com.bytedance.adsdk.lottie.ROR.Qhi<com.bytedance.adsdk.lottie.ac.cJ.fl> qhi, float f10) {
        this.CJ.Qhi(qhi.Qhi, qhi.cJ, f10);
        return this.CJ;
    }
}
