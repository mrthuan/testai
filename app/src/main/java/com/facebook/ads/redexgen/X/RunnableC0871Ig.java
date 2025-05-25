package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Ig  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0871Ig implements Runnable {
    public final /* synthetic */ BH A00;
    public final /* synthetic */ C0872Ih A01;

    public RunnableC0871Ig(C0872Ih c0872Ih, BH bh2) {
        this.A01 = c0872Ih;
        this.A00 = bh2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0873Ii interfaceC0873Ii;
        if (KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A00();
            interfaceC0873Ii = this.A01.A01;
            interfaceC0873Ii.ADy(this.A00);
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
