package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class HF implements Runnable {
    public final HE A00;

    public HF(HE he2) {
        this.A00 = he2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (KQ.A02(this)) {
            return;
        }
        try {
            this.A00.ACX();
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
