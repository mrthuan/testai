package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class Eo implements Runnable {
    public final /* synthetic */ C0757Dg A00;

    public Eo(C0757Dg c0757Dg) {
        this.A00 = c0757Dg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        XV xv;
        if (KQ.A02(this)) {
            return;
        }
        try {
            z10 = this.A00.A0G;
            if (!z10) {
                xv = this.A00.A08;
                xv.ABd(this.A00);
            }
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
