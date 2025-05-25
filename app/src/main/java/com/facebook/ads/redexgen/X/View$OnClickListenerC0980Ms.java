package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ms  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC0980Ms implements View.OnClickListener {
    public final /* synthetic */ C1Z A00;
    public final /* synthetic */ JF A01;
    public final /* synthetic */ MR A02;
    public final /* synthetic */ C0981Mt A03;
    public final /* synthetic */ String A04;

    public View$OnClickListenerC0980Ms(C0981Mt c0981Mt, JF jf2, MR mr, String str, C1Z c1z) {
        this.A03 = c0981Mt;
        this.A01 = jf2;
        this.A02 = mr;
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
            c2s = this.A03.A01;
            c1314Zs = this.A03.A02;
            if (c2s.A0O(c1314Zs.A01(), true)) {
                this.A02.A9l(this.A04, this.A00);
            } else if (!TextUtils.isEmpty(this.A00.A00())) {
                L2 l22 = new L2();
                c1314Zs2 = this.A03.A02;
                L2.A0M(l22, c1314Zs2, L5.A00(this.A00.A00()), this.A04);
            }
        } catch (Throwable th2) {
            KQ.A00(th2, this);
        }
    }
}
