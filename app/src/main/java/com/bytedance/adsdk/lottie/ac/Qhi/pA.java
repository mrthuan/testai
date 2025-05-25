package com.bytedance.adsdk.lottie.ac.Qhi;

import java.util.Arrays;
import java.util.List;

/* compiled from: BaseAnimatableValue.java */
/* loaded from: classes.dex */
abstract class pA<V, O> implements iMK<V, O> {
    final List<com.bytedance.adsdk.lottie.ROR.Qhi<V>> Qhi;

    public pA(List<com.bytedance.adsdk.lottie.ROR.Qhi<V>> list) {
        this.Qhi = list;
    }

    @Override // com.bytedance.adsdk.lottie.ac.Qhi.iMK
    public List<com.bytedance.adsdk.lottie.ROR.Qhi<V>> ac() {
        return this.Qhi;
    }

    @Override // com.bytedance.adsdk.lottie.ac.Qhi.iMK
    public boolean cJ() {
        if (this.Qhi.isEmpty() || (this.Qhi.size() == 1 && this.Qhi.get(0).fl())) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (!this.Qhi.isEmpty()) {
            sb2.append("values=");
            sb2.append(Arrays.toString(this.Qhi.toArray()));
        }
        return sb2.toString();
    }
}
