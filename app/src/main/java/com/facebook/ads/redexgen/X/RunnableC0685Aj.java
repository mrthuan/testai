package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* renamed from: com.facebook.ads.redexgen.X.Aj  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0685Aj implements Runnable {
    public final /* synthetic */ Format A00;
    public final /* synthetic */ C0689An A01;

    public RunnableC0685Aj(C0689An c0689An, Format format) {
        this.A01 = c0689An;
        this.A00 = format;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0690Ao interfaceC0690Ao;
        if (KQ.A02(this)) {
            return;
        }
        try {
            interfaceC0690Ao = this.A01.A01;
            interfaceC0690Ao.ABH(this.A00);
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
