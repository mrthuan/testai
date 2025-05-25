package com.bytedance.adsdk.lottie.Qhi.Qhi;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;

/* compiled from: StrokeContent.java */
/* loaded from: classes.dex */
public class qMt extends Qhi {
    private final com.bytedance.adsdk.lottie.ac.ac.Qhi CJ;
    private final com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Integer, Integer> ROR;
    private com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<ColorFilter, ColorFilter> Sf;
    private final boolean Tgh;

    /* renamed from: fl  reason: collision with root package name */
    private final String f7736fl;

    public qMt(com.bytedance.adsdk.lottie.hm hmVar, com.bytedance.adsdk.lottie.ac.ac.Qhi qhi, com.bytedance.adsdk.lottie.ac.cJ.tP tPVar) {
        super(hmVar, qhi, tPVar.ROR().Qhi(), tPVar.Sf().Qhi(), tPVar.hm(), tPVar.ac(), tPVar.CJ(), tPVar.fl(), tPVar.Tgh());
        this.CJ = qhi;
        this.f7736fl = tPVar.Qhi();
        this.Tgh = tPVar.WAv();
        com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Integer, Integer> Qhi = tPVar.cJ().Qhi();
        this.ROR = Qhi;
        Qhi.Qhi(this);
        qhi.Qhi(Qhi);
    }

    @Override // com.bytedance.adsdk.lottie.Qhi.Qhi.Qhi, com.bytedance.adsdk.lottie.Qhi.Qhi.Tgh
    public void Qhi(Canvas canvas, Matrix matrix, int i10) {
        if (this.Tgh) {
            return;
        }
        this.cJ.setColor(((com.bytedance.adsdk.lottie.Qhi.cJ.cJ) this.ROR).hm());
        com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<ColorFilter, ColorFilter> qhi = this.Sf;
        if (qhi != null) {
            this.cJ.setColorFilter(qhi.ROR());
        }
        super.Qhi(canvas, matrix, i10);
    }
}
