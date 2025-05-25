package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class SM implements Runnable {
    public final /* synthetic */ C0910Jx A00;

    public SM(C0910Jx c0910Jx) {
        this.A00 = c0910Jx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (KQ.A02(this)) {
            return;
        }
        try {
            C0910Jx.A03(this.A00);
            throw null;
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
