package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Ib  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0866Ib implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C0872Ih A02;
    public final /* synthetic */ String A03;

    public RunnableC0866Ib(C0872Ih c0872Ih, String str, long j10, long j11) {
        this.A02 = c0872Ih;
        this.A03 = str;
        this.A01 = j10;
        this.A00 = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0873Ii interfaceC0873Ii;
        if (KQ.A02(this)) {
            return;
        }
        try {
            interfaceC0873Ii = this.A02.A01;
            interfaceC0873Ii.ADx(this.A03, this.A01, this.A00);
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
