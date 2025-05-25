package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Nz  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC1013Nz implements Runnable {
    public final /* synthetic */ O0 A00;
    public final /* synthetic */ O1 A01;

    public RunnableC1013Nz(O0 o02, O1 o12) {
        this.A00 = o02;
        this.A01 = o12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (KQ.A02(this)) {
            return;
        }
        try {
            this.A01.ABD();
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
