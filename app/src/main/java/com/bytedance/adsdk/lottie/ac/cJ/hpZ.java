package com.bytedance.adsdk.lottie.ac.cJ;

import android.graphics.Path;

/* compiled from: ShapeFill.java */
/* loaded from: classes.dex */
public class hpZ implements ac {
    private final com.bytedance.adsdk.lottie.ac.Qhi.Qhi CJ;
    private final boolean Qhi;
    private final boolean Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private final String f7836ac;
    private final Path.FillType cJ;

    /* renamed from: fl  reason: collision with root package name */
    private final com.bytedance.adsdk.lottie.ac.Qhi.fl f7837fl;

    public hpZ(String str, boolean z10, Path.FillType fillType, com.bytedance.adsdk.lottie.ac.Qhi.Qhi qhi, com.bytedance.adsdk.lottie.ac.Qhi.fl flVar, boolean z11) {
        this.f7836ac = str;
        this.Qhi = z10;
        this.cJ = fillType;
        this.CJ = qhi;
        this.f7837fl = flVar;
        this.Tgh = z11;
    }

    public Path.FillType CJ() {
        return this.cJ;
    }

    public String Qhi() {
        return this.f7836ac;
    }

    public com.bytedance.adsdk.lottie.ac.Qhi.fl ac() {
        return this.f7837fl;
    }

    public com.bytedance.adsdk.lottie.ac.Qhi.Qhi cJ() {
        return this.CJ;
    }

    public boolean fl() {
        return this.Tgh;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.Qhi + '}';
    }

    @Override // com.bytedance.adsdk.lottie.ac.cJ.ac
    public com.bytedance.adsdk.lottie.Qhi.Qhi.ac Qhi(com.bytedance.adsdk.lottie.hm hmVar, com.bytedance.adsdk.lottie.ROR ror, com.bytedance.adsdk.lottie.ac.ac.Qhi qhi) {
        return new com.bytedance.adsdk.lottie.Qhi.Qhi.Sf(hmVar, qhi, this);
    }
}
