package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class Q9 implements Runnable {
    public final /* synthetic */ C06519a A00;

    public Q9(C06519a c06519a) {
        this.A00 = c06519a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (KQ.A02(this)) {
            return;
        }
        try {
            ((AbstractC1160Tq) this.A00).A08.A4P(((AbstractC1160Tq) this.A00).A09.A7I());
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
