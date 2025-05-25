package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class MN implements View.OnClickListener {
    public final /* synthetic */ C1Z A00;
    public final /* synthetic */ JF A01;
    public final /* synthetic */ MO A02;
    public final /* synthetic */ MR A03;
    public final /* synthetic */ String A04;

    public MN(MO mo2, JF jf2, MR mr, String str, C1Z c1z) {
        this.A02 = mo2;
        this.A01 = jf2;
        this.A03 = mr;
        this.A04 = str;
        this.A00 = c1z;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C2S c2s;
        C1314Zs c1314Zs;
        C1314Zs c1314Zs2;
        if (KQ.A02(this)) {
            return;
        }
        try {
            this.A01.A04(JE.A0A, null);
            c2s = this.A02.A02;
            c1314Zs = this.A02.A03;
            if (c2s.A0O(c1314Zs.A01(), true)) {
                this.A03.A9l(this.A04, this.A00);
            } else if (!TextUtils.isEmpty(this.A00.A00())) {
                L2 l22 = new L2();
                c1314Zs2 = this.A02.A03;
                L2.A0M(l22, c1314Zs2, L5.A00(this.A00.A00()), this.A04);
            }
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
