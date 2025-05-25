package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class R7 implements View.OnClickListener {
    public final /* synthetic */ C1011Nx A00;

    public R7(C1011Nx c1011Nx) {
        this.A00 = c1011Nx;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        JF jf2;
        C1314Zs c1314Zs;
        T7 t72;
        boolean A07;
        T7 t73;
        T7 t74;
        if (KQ.A02(this)) {
            return;
        }
        try {
            jf2 = this.A00.A04;
            jf2.A04(JE.A0j, null);
            c1314Zs = this.A00.A03;
            c1314Zs.A0E().A3X();
            t72 = this.A00.A00;
            if (t72 != null) {
                A07 = this.A00.A07();
                if (A07) {
                    t74 = this.A00.A00;
                    t74.setVolume(1.0f);
                } else {
                    t73 = this.A00.A00;
                    t73.setVolume(0.0f);
                }
                this.A00.A09();
            }
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
