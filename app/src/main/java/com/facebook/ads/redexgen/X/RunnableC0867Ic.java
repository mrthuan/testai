package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* renamed from: com.facebook.ads.redexgen.X.Ic  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0867Ic implements Runnable {
    public final /* synthetic */ Format A00;
    public final /* synthetic */ C0872Ih A01;

    public RunnableC0867Ic(C0872Ih c0872Ih, Format format) {
        this.A01 = c0872Ih;
        this.A00 = format;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0873Ii interfaceC0873Ii;
        if (KQ.A02(this)) {
            return;
        }
        try {
            interfaceC0873Ii = this.A01.A01;
            interfaceC0873Ii.AE3(this.A00);
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
