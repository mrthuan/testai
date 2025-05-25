package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Ex  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0788Ex implements Runnable {
    public final /* synthetic */ F6 A00;
    public final /* synthetic */ F9 A01;

    public RunnableC0788Ex(F6 f62, F9 f92) {
        this.A00 = f62;
        this.A01 = f92;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (KQ.A02(this)) {
            return;
        }
        try {
            this.A01.ACi(this.A00.A00, this.A00.A01);
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
