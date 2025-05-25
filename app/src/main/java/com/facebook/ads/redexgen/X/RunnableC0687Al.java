package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Al  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0687Al implements Runnable {
    public final /* synthetic */ C0689An A00;
    public final /* synthetic */ BH A01;

    public RunnableC0687Al(C0689An c0689An, BH bh2) {
        this.A00 = c0689An;
        this.A01 = bh2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0690Ao interfaceC0690Ao;
        if (KQ.A02(this)) {
            return;
        }
        try {
            this.A01.A00();
            interfaceC0690Ao = this.A00.A01;
            interfaceC0690Ao.ABF(this.A01);
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
