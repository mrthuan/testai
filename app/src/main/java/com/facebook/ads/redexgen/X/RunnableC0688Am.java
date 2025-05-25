package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Am  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0688Am implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C0689An A01;

    public RunnableC0688Am(C0689An c0689An, int i10) {
        this.A01 = c0689An;
        this.A00 = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0690Ao interfaceC0690Ao;
        if (KQ.A02(this)) {
            return;
        }
        try {
            interfaceC0690Ao = this.A01.A01;
            interfaceC0690Ao.ABI(this.A00);
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
