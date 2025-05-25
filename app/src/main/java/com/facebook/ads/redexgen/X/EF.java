package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class EF implements Runnable {
    public final /* synthetic */ EI A00;

    public EF(EI ei2) {
        this.A00 = ei2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A0H(5, 3);
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
