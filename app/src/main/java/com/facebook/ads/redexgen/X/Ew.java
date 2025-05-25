package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class Ew implements Runnable {
    public final /* synthetic */ F6 A00;
    public final /* synthetic */ F9 A01;

    public Ew(F6 f62, F9 f92) {
        this.A00 = f62;
        this.A01 = f92;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (KQ.A02(this)) {
            return;
        }
        try {
            this.A01.ACh(this.A00.A00, this.A00.A01);
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
