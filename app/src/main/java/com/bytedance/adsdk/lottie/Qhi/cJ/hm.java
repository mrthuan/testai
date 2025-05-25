package com.bytedance.adsdk.lottie.Qhi.cJ;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MaskKeyframeAnimation.java */
/* loaded from: classes.dex */
public class hm {
    private final List<Qhi<com.bytedance.adsdk.lottie.ac.cJ.pA, Path>> Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private final List<com.bytedance.adsdk.lottie.ac.cJ.hm> f7749ac;
    private final List<Qhi<Integer, Integer>> cJ;

    public hm(List<com.bytedance.adsdk.lottie.ac.cJ.hm> list) {
        this.f7749ac = list;
        this.Qhi = new ArrayList(list.size());
        this.cJ = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.Qhi.add(list.get(i10).cJ().Qhi());
            this.cJ.add(list.get(i10).ac().Qhi());
        }
    }

    public List<com.bytedance.adsdk.lottie.ac.cJ.hm> Qhi() {
        return this.f7749ac;
    }

    public List<Qhi<Integer, Integer>> ac() {
        return this.cJ;
    }

    public List<Qhi<com.bytedance.adsdk.lottie.ac.cJ.pA, Path>> cJ() {
        return this.Qhi;
    }
}
