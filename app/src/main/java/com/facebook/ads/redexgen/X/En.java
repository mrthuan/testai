package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class En implements Runnable {
    public final /* synthetic */ C0757Dg A00;

    public En(C0757Dg c0757Dg) {
        this.A00 = c0757Dg;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A09();
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
