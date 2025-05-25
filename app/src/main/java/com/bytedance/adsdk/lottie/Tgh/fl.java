package com.bytedance.adsdk.lottie.Tgh;

/* compiled from: MeanCalculator.java */
/* loaded from: classes.dex */
public class fl {
    private float Qhi;
    private int cJ;

    public void Qhi(float f10) {
        float f11 = this.Qhi + f10;
        this.Qhi = f11;
        int i10 = this.cJ + 1;
        this.cJ = i10;
        if (i10 == Integer.MAX_VALUE) {
            this.Qhi = f11 / 2.0f;
            this.cJ = i10 / 2;
        }
    }
}
