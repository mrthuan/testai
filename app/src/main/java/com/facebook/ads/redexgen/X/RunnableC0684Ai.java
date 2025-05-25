package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Ai  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0684Ai implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C0689An A02;
    public final /* synthetic */ String A03;

    public RunnableC0684Ai(C0689An c0689An, String str, long j10, long j11) {
        this.A02 = c0689An;
        this.A03 = str;
        this.A01 = j10;
        this.A00 = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0690Ao interfaceC0690Ao;
        if (KQ.A02(this)) {
            return;
        }
        try {
            interfaceC0690Ao = this.A02.A01;
            interfaceC0690Ao.ABE(this.A03, this.A01, this.A00);
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
