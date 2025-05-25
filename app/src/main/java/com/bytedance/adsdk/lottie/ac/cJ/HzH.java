package com.bytedance.adsdk.lottie.ac.cJ;

import java.util.Arrays;
import java.util.List;

/* compiled from: ShapeGroup.java */
/* loaded from: classes.dex */
public class HzH implements ac {
    private final String Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private final boolean f7815ac;
    private final List<ac> cJ;

    public HzH(String str, List<ac> list, boolean z10) {
        this.Qhi = str;
        this.cJ = list;
        this.f7815ac = z10;
    }

    public String Qhi() {
        return this.Qhi;
    }

    public boolean ac() {
        return this.f7815ac;
    }

    public List<ac> cJ() {
        return this.cJ;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.Qhi + "' Shapes: " + Arrays.toString(this.cJ.toArray()) + '}';
    }

    @Override // com.bytedance.adsdk.lottie.ac.cJ.ac
    public com.bytedance.adsdk.lottie.Qhi.Qhi.ac Qhi(com.bytedance.adsdk.lottie.hm hmVar, com.bytedance.adsdk.lottie.ROR ror, com.bytedance.adsdk.lottie.ac.ac.Qhi qhi) {
        return new com.bytedance.adsdk.lottie.Qhi.Qhi.fl(hmVar, qhi, this, ror);
    }
}
