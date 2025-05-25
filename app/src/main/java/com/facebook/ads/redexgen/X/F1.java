package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public class F1 implements Runnable {
    public final /* synthetic */ F6 A00;
    public final /* synthetic */ F7 A01;
    public final /* synthetic */ F8 A02;
    public final /* synthetic */ F9 A03;
    public final /* synthetic */ IOException A04;
    public final /* synthetic */ boolean A05;

    public F1(F6 f62, F9 f92, F7 f72, F8 f82, IOException iOException, boolean z10) {
        this.A00 = f62;
        this.A03 = f92;
        this.A01 = f72;
        this.A02 = f82;
        this.A04 = iOException;
        this.A05 = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (KQ.A02(this)) {
            return;
        }
        try {
            this.A03.ACU(this.A00.A00, this.A00.A01, this.A01, this.A02, this.A04, this.A05);
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
