package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Hl  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0850Hl {
    public boolean A00;

    public final synchronized void A00() throws InterruptedException {
        while (!this.A00) {
            wait();
        }
    }

    public final synchronized boolean A01() {
        boolean z10;
        z10 = this.A00;
        this.A00 = false;
        return z10;
    }

    public final synchronized boolean A02() {
        if (this.A00) {
            return false;
        }
        this.A00 = true;
        notifyAll();
        return true;
    }
}
