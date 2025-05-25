package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Ey  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0789Ey implements Runnable {
    public final /* synthetic */ F6 A00;
    public final /* synthetic */ F7 A01;
    public final /* synthetic */ F8 A02;
    public final /* synthetic */ F9 A03;

    public RunnableC0789Ey(F6 f62, F9 f92, F7 f72, F8 f82) {
        this.A00 = f62;
        this.A03 = f92;
        this.A01 = f72;
        this.A02 = f82;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (KQ.A02(this)) {
            return;
        }
        try {
            this.A03.ACW(this.A00.A00, this.A00.A01, this.A01, this.A02);
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
