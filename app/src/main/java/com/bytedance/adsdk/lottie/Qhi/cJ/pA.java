package com.bytedance.adsdk.lottie.Qhi.cJ;

import android.graphics.PointF;
import java.util.Collections;

/* compiled from: SplitDimensionPathKeyframeAnimation.java */
/* loaded from: classes.dex */
public class pA extends Qhi<PointF, PointF> {
    protected com.bytedance.adsdk.lottie.ROR.cJ<Float> CJ;
    private final PointF ROR;
    private final Qhi<Float, Float> Sf;
    private final PointF Tgh;

    /* renamed from: fl  reason: collision with root package name */
    protected com.bytedance.adsdk.lottie.ROR.cJ<Float> f7751fl;

    /* renamed from: hm  reason: collision with root package name */
    private final Qhi<Float, Float> f7752hm;

    public pA(Qhi<Float, Float> qhi, Qhi<Float, Float> qhi2) {
        super(Collections.emptyList());
        this.Tgh = new PointF();
        this.ROR = new PointF();
        this.Sf = qhi;
        this.f7752hm = qhi2;
        Qhi(Sf());
    }

    @Override // com.bytedance.adsdk.lottie.Qhi.cJ.Qhi
    /* renamed from: cJ */
    public PointF Qhi(com.bytedance.adsdk.lottie.ROR.Qhi<PointF> qhi, float f10) {
        com.bytedance.adsdk.lottie.ROR.Qhi<Float> ac2;
        com.bytedance.adsdk.lottie.ROR.Qhi<Float> ac3;
        if (this.CJ != null && (ac3 = this.Sf.ac()) != null) {
            this.Sf.fl();
            Float f11 = ac3.ROR;
            if (f11 != null) {
                f11.floatValue();
            }
            throw null;
        } else if (this.f7751fl != null && (ac2 = this.f7752hm.ac()) != null) {
            this.f7752hm.fl();
            Float f12 = ac2.ROR;
            if (f12 != null) {
                f12.floatValue();
            }
            throw null;
        } else {
            this.ROR.set(this.Tgh.x, 0.0f);
            PointF pointF = this.ROR;
            pointF.set(pointF.x, this.Tgh.y);
            return this.ROR;
        }
    }

    @Override // com.bytedance.adsdk.lottie.Qhi.cJ.Qhi
    /* renamed from: hm */
    public PointF ROR() {
        return Qhi(null, 0.0f);
    }

    @Override // com.bytedance.adsdk.lottie.Qhi.cJ.Qhi
    public void Qhi(float f10) {
        this.Sf.Qhi(f10);
        this.f7752hm.Qhi(f10);
        this.Tgh.set(this.Sf.ROR().floatValue(), this.f7752hm.ROR().floatValue());
        for (int i10 = 0; i10 < this.Qhi.size(); i10++) {
            this.Qhi.get(i10).Qhi();
        }
    }
}
