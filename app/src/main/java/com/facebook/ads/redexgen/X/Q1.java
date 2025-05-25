package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class Q1 implements View.OnClickListener {
    public final /* synthetic */ A6 A00;

    public Q1(A6 a62) {
        this.A00 = a62;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        AbstractC04390h abstractC04390h;
        Handler handler;
        Runnable runnable;
        if (KQ.A02(this)) {
            return;
        }
        try {
            z10 = this.A00.A0K;
            if (!z10) {
                this.A00.A0L = true;
                A6 a62 = this.A00;
                abstractC04390h = this.A00.A0T;
                a62.A0e(((C0815Ga) abstractC04390h).A0G().toString());
                if (((U6) this.A00).A05.A0U() >= 0) {
                    handler = this.A00.A08;
                    runnable = this.A00.A0j;
                    handler.postDelayed(runnable, ((U6) this.A00).A05.A0U());
                }
            }
            A6 a63 = this.A00;
            z11 = this.A00.A0K;
            a63.A0h(z11 ? false : true);
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
