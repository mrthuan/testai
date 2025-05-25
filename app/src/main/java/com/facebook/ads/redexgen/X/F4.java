package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class F4 implements Runnable {
    public final /* synthetic */ F6 A00;
    public final /* synthetic */ F8 A01;
    public final /* synthetic */ F9 A02;

    public F4(F6 f62, F9 f92, F8 f82) {
        this.A00 = f62;
        this.A02 = f92;
        this.A01 = f82;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (KQ.A02(this)) {
            return;
        }
        try {
            this.A02.ABn(this.A00.A00, this.A00.A01, this.A01);
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
