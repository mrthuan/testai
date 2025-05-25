package com.bytedance.adsdk.lottie.ac.Qhi;

import android.graphics.PointF;
import java.util.List;

/* compiled from: AnimatablePathValue.java */
/* loaded from: classes.dex */
public class Tgh implements iMK<PointF, PointF> {
    private final List<com.bytedance.adsdk.lottie.ROR.Qhi<PointF>> Qhi;

    public Tgh(List<com.bytedance.adsdk.lottie.ROR.Qhi<PointF>> list) {
        this.Qhi = list;
    }

    @Override // com.bytedance.adsdk.lottie.ac.Qhi.iMK
    public com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<PointF, PointF> Qhi() {
        if (this.Qhi.get(0).fl()) {
            return new com.bytedance.adsdk.lottie.Qhi.cJ.zc(this.Qhi);
        }
        return new com.bytedance.adsdk.lottie.Qhi.cJ.Gm(this.Qhi);
    }

    @Override // com.bytedance.adsdk.lottie.ac.Qhi.iMK
    public List<com.bytedance.adsdk.lottie.ROR.Qhi<PointF>> ac() {
        return this.Qhi;
    }

    @Override // com.bytedance.adsdk.lottie.ac.Qhi.iMK
    public boolean cJ() {
        if (this.Qhi.size() != 1 || !this.Qhi.get(0).fl()) {
            return false;
        }
        return true;
    }
}
