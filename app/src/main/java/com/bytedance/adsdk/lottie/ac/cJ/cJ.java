package com.bytedance.adsdk.lottie.ac.cJ;

import android.graphics.PointF;

/* compiled from: CircleShape.java */
/* loaded from: classes.dex */
public class cJ implements ac {
    private final boolean CJ;
    private final String Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private final com.bytedance.adsdk.lottie.ac.Qhi.ROR f7831ac;
    private final com.bytedance.adsdk.lottie.ac.Qhi.iMK<PointF, PointF> cJ;

    /* renamed from: fl  reason: collision with root package name */
    private final boolean f7832fl;

    public cJ(String str, com.bytedance.adsdk.lottie.ac.Qhi.iMK<PointF, PointF> imk, com.bytedance.adsdk.lottie.ac.Qhi.ROR ror, boolean z10, boolean z11) {
        this.Qhi = str;
        this.cJ = imk;
        this.f7831ac = ror;
        this.CJ = z10;
        this.f7832fl = z11;
    }

    public boolean CJ() {
        return this.CJ;
    }

    @Override // com.bytedance.adsdk.lottie.ac.cJ.ac
    public com.bytedance.adsdk.lottie.Qhi.Qhi.ac Qhi(com.bytedance.adsdk.lottie.hm hmVar, com.bytedance.adsdk.lottie.ROR ror, com.bytedance.adsdk.lottie.ac.ac.Qhi qhi) {
        return new com.bytedance.adsdk.lottie.Qhi.Qhi.ROR(hmVar, qhi, this);
    }

    public com.bytedance.adsdk.lottie.ac.Qhi.ROR ac() {
        return this.f7831ac;
    }

    public com.bytedance.adsdk.lottie.ac.Qhi.iMK<PointF, PointF> cJ() {
        return this.cJ;
    }

    public boolean fl() {
        return this.f7832fl;
    }

    public String Qhi() {
        return this.Qhi;
    }
}
