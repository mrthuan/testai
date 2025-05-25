package com.bytedance.adsdk.lottie.ac.cJ;

import androidx.activity.f;

/* compiled from: ShapePath.java */
/* loaded from: classes.dex */
public class kYc implements ac {
    private final boolean CJ;
    private final String Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private final com.bytedance.adsdk.lottie.ac.Qhi.hm f7838ac;
    private final int cJ;

    public kYc(String str, int i10, com.bytedance.adsdk.lottie.ac.Qhi.hm hmVar, boolean z10) {
        this.Qhi = str;
        this.cJ = i10;
        this.f7838ac = hmVar;
        this.CJ = z10;
    }

    public String Qhi() {
        return this.Qhi;
    }

    public boolean ac() {
        return this.CJ;
    }

    public com.bytedance.adsdk.lottie.ac.Qhi.hm cJ() {
        return this.f7838ac;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ShapePath{name=");
        sb2.append(this.Qhi);
        sb2.append(", index=");
        return f.n(sb2, this.cJ, '}');
    }

    @Override // com.bytedance.adsdk.lottie.ac.cJ.ac
    public com.bytedance.adsdk.lottie.Qhi.Qhi.ac Qhi(com.bytedance.adsdk.lottie.hm hmVar, com.bytedance.adsdk.lottie.ROR ror, com.bytedance.adsdk.lottie.ac.ac.Qhi qhi) {
        return new com.bytedance.adsdk.lottie.Qhi.Qhi.tP(hmVar, qhi, this);
    }
}
