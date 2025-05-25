package com.bytedance.sdk.openadsdk.component.Sf;

/* compiled from: OpenAdDisplayStat.java */
/* loaded from: classes.dex */
public final class Qhi {
    private float Qhi;
    private long cJ;

    public float Qhi() {
        return this.Qhi;
    }

    public long cJ() {
        return this.cJ;
    }

    public void Qhi(float f10) {
        StringBuilder sb2 = new StringBuilder("setTotalTime() called with: time = [");
        sb2.append(f10);
        sb2.append("]");
        this.Qhi = f10;
    }

    public void Qhi(long j10) {
        this.cJ = j10;
    }
}
