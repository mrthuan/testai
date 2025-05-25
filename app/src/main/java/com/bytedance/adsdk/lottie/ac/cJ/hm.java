package com.bytedance.adsdk.lottie.ac.cJ;

/* compiled from: Mask.java */
/* loaded from: classes.dex */
public class hm {
    private final boolean CJ;
    private final Qhi Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private final com.bytedance.adsdk.lottie.ac.Qhi.fl f7833ac;
    private final com.bytedance.adsdk.lottie.ac.Qhi.hm cJ;

    /* compiled from: Mask.java */
    /* loaded from: classes.dex */
    public enum Qhi {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public hm(Qhi qhi, com.bytedance.adsdk.lottie.ac.Qhi.hm hmVar, com.bytedance.adsdk.lottie.ac.Qhi.fl flVar, boolean z10) {
        this.Qhi = qhi;
        this.cJ = hmVar;
        this.f7833ac = flVar;
        this.CJ = z10;
    }

    public boolean CJ() {
        return this.CJ;
    }

    public Qhi Qhi() {
        return this.Qhi;
    }

    public com.bytedance.adsdk.lottie.ac.Qhi.fl ac() {
        return this.f7833ac;
    }

    public com.bytedance.adsdk.lottie.ac.Qhi.hm cJ() {
        return this.cJ;
    }
}
