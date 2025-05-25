package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Ie  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0869Ie implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ C0872Ih A04;

    public RunnableC0869Ie(C0872Ih c0872Ih, int i10, int i11, int i12, float f10) {
        this.A04 = c0872Ih;
        this.A03 = i10;
        this.A01 = i11;
        this.A02 = i12;
        this.A00 = f10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0873Ii interfaceC0873Ii;
        if (KQ.A02(this)) {
            return;
        }
        try {
            interfaceC0873Ii = this.A04.A01;
            interfaceC0873Ii.AE8(this.A03, this.A01, this.A02, this.A00);
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
