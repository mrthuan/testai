package com.bytedance.adsdk.lottie.Qhi.cJ;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* compiled from: PathKeyframeAnimation.java */
/* loaded from: classes.dex */
public class Gm extends Sf<PointF> {
    private final PointF CJ;
    private WAv ROR;
    private final PathMeasure Tgh;

    /* renamed from: fl  reason: collision with root package name */
    private final float[] f7739fl;

    public Gm(List<? extends com.bytedance.adsdk.lottie.ROR.Qhi<PointF>> list) {
        super(list);
        this.CJ = new PointF();
        this.f7739fl = new float[2];
        this.Tgh = new PathMeasure();
    }

    @Override // com.bytedance.adsdk.lottie.Qhi.cJ.Qhi
    /* renamed from: cJ */
    public PointF Qhi(com.bytedance.adsdk.lottie.ROR.Qhi<PointF> qhi, float f10) {
        WAv wAv = (WAv) qhi;
        Path cJ = wAv.cJ();
        if (cJ == null) {
            return qhi.Qhi;
        }
        if (this.f7744ac == null) {
            if (this.ROR != wAv) {
                this.Tgh.setPath(cJ, false);
                this.ROR = wAv;
            }
            PathMeasure pathMeasure = this.Tgh;
            pathMeasure.getPosTan(pathMeasure.getLength() * f10, this.f7739fl, null);
            PointF pointF = this.CJ;
            float[] fArr = this.f7739fl;
            pointF.set(fArr[0], fArr[1]);
            return this.CJ;
        }
        wAv.ROR.floatValue();
        CJ();
        Sf();
        throw null;
    }
}
