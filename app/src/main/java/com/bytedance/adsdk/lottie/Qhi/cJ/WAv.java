package com.bytedance.adsdk.lottie.Qhi.cJ;

import android.graphics.Path;
import android.graphics.PointF;

/* compiled from: PathKeyframe.java */
/* loaded from: classes.dex */
public class WAv extends com.bytedance.adsdk.lottie.ROR.Qhi<PointF> {
    private final com.bytedance.adsdk.lottie.ROR.Qhi<PointF> Gm;
    private Path WAv;

    public WAv(com.bytedance.adsdk.lottie.ROR ror, com.bytedance.adsdk.lottie.ROR.Qhi<PointF> qhi) {
        super(ror, qhi.Qhi, qhi.cJ, qhi.f7757ac, qhi.CJ, qhi.f7758fl, qhi.Tgh, qhi.ROR);
        this.Gm = qhi;
        Qhi();
    }

    public void Qhi() {
        boolean z10;
        T t4;
        T t10;
        T t11 = this.cJ;
        if (t11 != 0 && (t10 = this.Qhi) != 0 && ((PointF) t10).equals(((PointF) t11).x, ((PointF) t11).y)) {
            z10 = true;
        } else {
            z10 = false;
        }
        T t12 = this.Qhi;
        if (t12 != 0 && (t4 = this.cJ) != 0 && !z10) {
            com.bytedance.adsdk.lottie.ROR.Qhi<PointF> qhi = this.Gm;
            this.WAv = com.bytedance.adsdk.lottie.Tgh.ROR.Qhi((PointF) t12, (PointF) t4, qhi.Sf, qhi.f7759hm);
        }
    }

    public Path cJ() {
        return this.WAv;
    }
}
