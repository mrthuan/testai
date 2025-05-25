package com.bytedance.adsdk.lottie.ac.Qhi;

import android.graphics.PointF;
import java.util.List;

/* compiled from: AnimatableSplitDimensionPathValue.java */
/* loaded from: classes.dex */
public class WAv implements iMK<PointF, PointF> {
    private final cJ Qhi;
    private final cJ cJ;

    public WAv(cJ cJVar, cJ cJVar2) {
        this.Qhi = cJVar;
        this.cJ = cJVar2;
    }

    @Override // com.bytedance.adsdk.lottie.ac.Qhi.iMK
    public com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<PointF, PointF> Qhi() {
        return new com.bytedance.adsdk.lottie.Qhi.cJ.pA(this.Qhi.Qhi(), this.cJ.Qhi());
    }

    @Override // com.bytedance.adsdk.lottie.ac.Qhi.iMK
    public List<com.bytedance.adsdk.lottie.ROR.Qhi<PointF>> ac() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // com.bytedance.adsdk.lottie.ac.Qhi.iMK
    public boolean cJ() {
        if (this.Qhi.cJ() && this.cJ.cJ()) {
            return true;
        }
        return false;
    }
}
