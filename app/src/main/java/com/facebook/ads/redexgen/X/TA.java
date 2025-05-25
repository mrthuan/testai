package com.facebook.ads.redexgen.X;

import android.os.Handler;

/* loaded from: assets/audience_network.dex */
public class TA extends KY {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ T7 A02;
    public final /* synthetic */ EnumC1099Rh A03;

    public TA(T7 t72, EnumC1099Rh enumC1099Rh, int i10, int i11) {
        this.A02 = t72;
        this.A03 = enumC1099Rh;
        this.A00 = i10;
        this.A01 = i11;
    }

    @Override // com.facebook.ads.redexgen.X.KY
    public final void A06() {
        C1314Zs c1314Zs;
        Handler handler;
        C06478w c06478w;
        C1314Zs c1314Zs2;
        C06478w c06478w2;
        C1091Qz c1091Qz;
        Handler handler2;
        C1314Zs c1314Zs3;
        C06478w c06478w3;
        Handler handler3;
        C1314Zs c1314Zs4;
        C1314Zs c1314Zs5;
        C06478w c06478w4;
        SZ sz;
        Handler handler4;
        C1314Zs c1314Zs6;
        C1314Zs c1314Zs7;
        Handler handler5;
        C06478w c06478w5;
        C06478w c06478w6;
        C1126Si c1126Si;
        C1314Zs c1314Zs8;
        C06478w c06478w7;
        C1098Rg c1098Rg;
        if (this.A03 == EnumC1099Rh.A07) {
            this.A02.A0L(JE.A0w);
            c1314Zs8 = this.A02.A0A;
            c1314Zs8.A0E().A3U();
            c06478w7 = this.A02.A0B;
            c1098Rg = T7.A0I;
            c06478w7.A02(c1098Rg);
        } else if (this.A03 == EnumC1099Rh.A03) {
            this.A02.A0L(JE.A0r);
            this.A02.A03 = true;
            c06478w6 = this.A02.A0B;
            c1126Si = T7.A0G;
            c06478w6.A02(c1126Si);
            this.A02.A0K(this.A00);
        } else if (this.A03 == EnumC1099Rh.A06) {
            this.A02.A0L(JE.A0q);
            c1314Zs7 = this.A02.A0A;
            c1314Zs7.A0E().A3M();
            this.A02.A03 = true;
            handler5 = this.A02.A07;
            handler5.removeCallbacksAndMessages(null);
            c06478w5 = this.A02.A0B;
            c06478w5.A02(new C9R(this.A01, this.A01));
            this.A02.A0K(this.A01);
        } else if (this.A03 == EnumC1099Rh.A0A) {
            c1314Zs4 = this.A02.A0A;
            if (C0877Im.A1p(c1314Zs4)) {
                c1314Zs6 = this.A02.A0A;
                c1314Zs6.A0A().AE9();
            }
            this.A02.A0L(JE.A0u);
            c1314Zs5 = this.A02.A0A;
            c1314Zs5.A0E().A3b();
            c06478w4 = this.A02.A0B;
            sz = T7.A0H;
            c06478w4.A02(sz);
            handler4 = this.A02.A07;
            handler4.removeCallbacksAndMessages(null);
            this.A02.A0H();
        } else if (this.A03 == EnumC1099Rh.A05) {
            this.A02.A0L(JE.A0t);
            c1314Zs3 = this.A02.A0A;
            c1314Zs3.A0E().A3Q();
            c06478w3 = this.A02.A0B;
            final int i10 = this.A00;
            c06478w3.A02(new AbstractC1128Sk(i10) { // from class: com.facebook.ads.redexgen.X.9P
            });
            handler3 = this.A02.A07;
            handler3.removeCallbacksAndMessages(null);
            this.A02.A0K(this.A00);
        } else if (this.A03 == EnumC1099Rh.A04) {
            this.A02.A0L(JE.A0s);
            c1314Zs2 = this.A02.A0A;
            c1314Zs2.A0E().A3N();
            c06478w2 = this.A02.A0B;
            c1091Qz = T7.A0K;
            c06478w2.A02(c1091Qz);
            handler2 = this.A02.A07;
            handler2.removeCallbacksAndMessages(null);
        } else if (this.A03 == EnumC1099Rh.A09) {
            this.A02.A0L(JE.A0q);
            c1314Zs = this.A02.A0A;
            c1314Zs.A0E().A3W();
            this.A02.A03 = true;
            handler = this.A02.A07;
            handler.removeCallbacksAndMessages(null);
            c06478w = this.A02.A0B;
            c06478w.A02(new C9R(this.A00, this.A01));
            this.A02.A0K(this.A00);
        }
    }
}
