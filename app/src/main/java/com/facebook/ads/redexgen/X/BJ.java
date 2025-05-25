package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class BJ extends Thread {
    public final /* synthetic */ AbstractC1290Yu A00;

    public BJ(AbstractC1290Yu abstractC1290Yu) {
        this.A00 = abstractC1290Yu;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A0M();
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
