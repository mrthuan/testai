package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Id  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0868Id implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C0872Ih A02;

    public RunnableC0868Id(C0872Ih c0872Ih, int i10, long j10) {
        this.A02 = c0872Ih;
        this.A00 = i10;
        this.A01 = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0873Ii interfaceC0873Ii;
        if (KQ.A02(this)) {
            return;
        }
        try {
            interfaceC0873Ii = this.A02.A01;
            interfaceC0873Ii.ABo(this.A00, this.A01);
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
