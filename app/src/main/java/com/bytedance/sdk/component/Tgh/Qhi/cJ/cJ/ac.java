package com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ;

/* compiled from: PolicyConfig.java */
/* loaded from: classes.dex */
public class ac {
    private int Qhi;
    private int cJ;

    public ac(int i10, int i11, long j10) {
        if (i11 >= i10) {
            this.Qhi = i10;
            this.cJ = i11;
            return;
        }
        throw new IllegalStateException("atMostBatchSendCount should meet a condition (atMostBatchSendCount >= maxCacheCount)");
    }

    public static ac CJ() {
        return new ac(1, 100, -1L);
    }

    public static ac ac() {
        return new ac(1, 100, 172800000L);
    }

    public static ac fl() {
        return new ac(3, 100, 172800000L);
    }

    public int Qhi() {
        return this.Qhi;
    }

    public int cJ() {
        return this.cJ;
    }
}
