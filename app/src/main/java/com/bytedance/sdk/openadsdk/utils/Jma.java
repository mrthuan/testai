package com.bytedance.sdk.openadsdk.utils;

import android.os.SystemClock;

/* compiled from: TimeStamp.java */
/* loaded from: classes.dex */
public class Jma {
    public long Qhi;
    private long cJ;

    private Jma(boolean z10) {
        if (z10) {
            CJ();
        }
    }

    public static Jma Qhi() {
        return new Jma(true);
    }

    public static Jma cJ() {
        return new Jma(false);
    }

    public void CJ() {
        this.Qhi = System.currentTimeMillis();
        this.cJ = SystemClock.elapsedRealtime();
    }

    public long ac() {
        return SystemClock.elapsedRealtime() - this.cJ;
    }

    public boolean fl() {
        if (this.cJ > 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return String.valueOf(this.Qhi);
    }

    public long Qhi(Jma jma) {
        return Math.abs(jma.cJ - this.cJ);
    }
}
