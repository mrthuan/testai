package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class P6 implements View.OnClickListener {
    public final /* synthetic */ UQ A00;

    public P6(UQ uq) {
        this.A00 = uq;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        AbstractC04390h abstractC04390h;
        AbstractC1456cD abstractC1456cD;
        Handler handler;
        Runnable runnable;
        AbstractC1456cD abstractC1456cD2;
        if (KQ.A02(this)) {
            return;
        }
        try {
            z10 = this.A00.A0O;
            if (!z10) {
                this.A00.A0P = true;
                UQ uq = this.A00;
                abstractC04390h = this.A00.A0c;
                uq.A0d(((C0815Ga) abstractC04390h).A0G().toString());
                abstractC1456cD = this.A00.A0G;
                if (abstractC1456cD.A0U() >= 0) {
                    handler = this.A00.A09;
                    runnable = this.A00.A0i;
                    abstractC1456cD2 = this.A00.A0G;
                    handler.postDelayed(runnable, abstractC1456cD2.A0U());
                }
            }
            UQ uq2 = this.A00;
            z11 = this.A00.A0O;
            uq2.A0g(z11 ? false : true);
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
