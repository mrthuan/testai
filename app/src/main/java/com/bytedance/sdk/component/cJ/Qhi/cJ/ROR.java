package com.bytedance.sdk.component.cJ.Qhi.cJ;

/* compiled from: SegmentPool.java */
/* loaded from: classes.dex */
final class ROR {
    static Tgh Qhi;
    static long cJ;

    private ROR() {
    }

    public static Tgh Qhi() {
        synchronized (ROR.class) {
            Tgh tgh = Qhi;
            if (tgh != null) {
                Qhi = tgh.Tgh;
                tgh.Tgh = null;
                cJ -= 8192;
                return tgh;
            }
            return new Tgh();
        }
    }

    public static void Qhi(Tgh tgh) {
        if (tgh.Tgh == null && tgh.ROR == null) {
            if (tgh.CJ) {
                return;
            }
            synchronized (ROR.class) {
                long j10 = cJ;
                if (j10 + 8192 > 65536) {
                    return;
                }
                cJ = j10 + 8192;
                tgh.Tgh = Qhi;
                tgh.f8353ac = 0;
                tgh.cJ = 0;
                Qhi = tgh;
                return;
            }
        }
        throw new IllegalArgumentException();
    }
}
