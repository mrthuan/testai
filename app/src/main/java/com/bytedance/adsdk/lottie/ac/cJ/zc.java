package com.bytedance.adsdk.lottie.ac.cJ;

import android.graphics.PointF;

/* compiled from: RectangleShape.java */
/* loaded from: classes.dex */
public class zc implements ac {
    private final com.bytedance.adsdk.lottie.ac.Qhi.cJ CJ;
    private final String Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private final com.bytedance.adsdk.lottie.ac.Qhi.iMK<PointF, PointF> f7845ac;
    private final com.bytedance.adsdk.lottie.ac.Qhi.iMK<PointF, PointF> cJ;

    /* renamed from: fl  reason: collision with root package name */
    private final boolean f7846fl;

    public zc(String str, com.bytedance.adsdk.lottie.ac.Qhi.iMK<PointF, PointF> imk, com.bytedance.adsdk.lottie.ac.Qhi.iMK<PointF, PointF> imk2, com.bytedance.adsdk.lottie.ac.Qhi.cJ cJVar, boolean z10) {
        this.Qhi = str;
        this.cJ = imk;
        this.f7845ac = imk2;
        this.CJ = cJVar;
        this.f7846fl = z10;
    }

    public com.bytedance.adsdk.lottie.ac.Qhi.iMK<PointF, PointF> CJ() {
        return this.cJ;
    }

    public String Qhi() {
        return this.Qhi;
    }

    public com.bytedance.adsdk.lottie.ac.Qhi.iMK<PointF, PointF> ac() {
        return this.f7845ac;
    }

    public com.bytedance.adsdk.lottie.ac.Qhi.cJ cJ() {
        return this.CJ;
    }

    public boolean fl() {
        return this.f7846fl;
    }

    public String toString() {
        return "RectangleShape{position=" + this.cJ + ", size=" + this.f7845ac + '}';
    }

    @Override // com.bytedance.adsdk.lottie.ac.cJ.ac
    public com.bytedance.adsdk.lottie.Qhi.Qhi.ac Qhi(com.bytedance.adsdk.lottie.hm hmVar, com.bytedance.adsdk.lottie.ROR ror, com.bytedance.adsdk.lottie.ac.ac.Qhi qhi) {
        return new com.bytedance.adsdk.lottie.Qhi.Qhi.hpZ(hmVar, qhi, this);
    }
}
