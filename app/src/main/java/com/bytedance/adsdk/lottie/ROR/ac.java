package com.bytedance.adsdk.lottie.ROR;

/* compiled from: ScaleXY.java */
/* loaded from: classes.dex */
public class ac {
    private float Qhi;
    private float cJ;

    public ac(float f10, float f11) {
        this.Qhi = f10;
        this.cJ = f11;
    }

    public float Qhi() {
        return this.Qhi;
    }

    public float cJ() {
        return this.cJ;
    }

    public String toString() {
        return Qhi() + "x" + cJ();
    }

    public void Qhi(float f10, float f11) {
        this.Qhi = f10;
        this.cJ = f11;
    }

    public boolean cJ(float f10, float f11) {
        return this.Qhi == f10 && this.cJ == f11;
    }

    public ac() {
        this(1.0f, 1.0f);
    }
}
