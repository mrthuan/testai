package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class EG implements Runnable {
    public final /* synthetic */ EI A00;
    public final /* synthetic */ Throwable A01;

    public EG(EI ei2, Throwable th2) {
        this.A00 = ei2;
        this.A01 = th2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean A0I;
        boolean A0H;
        boolean A0H2;
        if (KQ.A02(this)) {
            return;
        }
        try {
            A0I = this.A00.A0I(1, this.A01 != null ? 4 : 2, this.A01);
            if (A0I) {
                return;
            }
            A0H = this.A00.A0H(6, 3);
            if (A0H) {
                return;
            }
            A0H2 = this.A00.A0H(7, 0);
            if (!A0H2) {
                throw new IllegalStateException();
            }
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
