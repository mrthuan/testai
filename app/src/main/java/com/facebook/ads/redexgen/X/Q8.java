package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class Q8 implements Runnable {
    public final /* synthetic */ C1148Te A00;

    public Q8(C1148Te c1148Te) {
        this.A00 = c1148Te;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A00.A0D(JE.A0Z);
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
