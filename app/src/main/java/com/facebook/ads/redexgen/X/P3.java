package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class P3 implements Runnable {
    public final /* synthetic */ UQ A00;

    public P3(UQ uq) {
        this.A00 = uq;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        if (KQ.A02(this)) {
            return;
        }
        try {
            z10 = this.A00.A0O;
            if (!z10) {
                return;
            }
            this.A00.A0N();
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
