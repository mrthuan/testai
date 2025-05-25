package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class TP extends AbstractC1101Rj {
    public final /* synthetic */ C9Z A00;

    public TP(C9Z c9z) {
        this.A00 = c9z;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1101Rj
    public final void A03() {
        C0957Lv c0957Lv;
        C0957Lv c0957Lv2;
        String str;
        C1102Rk c1102Rk;
        C0957Lv c0957Lv3;
        AbstractC1456cD abstractC1456cD;
        J7 j72;
        String str2;
        AbstractC1456cD abstractC1456cD2;
        C1314Zs c1314Zs;
        C1314Zs c1314Zs2;
        AbstractC1456cD abstractC1456cD3;
        AbstractC1456cD abstractC1456cD4;
        c0957Lv = this.A00.A0E;
        if (!c0957Lv.A07()) {
            C9Z c9z = this.A00;
            c0957Lv2 = this.A00.A0E;
            c9z.setImpressionRecordingFlag(c0957Lv2);
            str = this.A00.A0A;
            if (!TextUtils.isEmpty(str)) {
                O8 o82 = new O8();
                c1102Rk = this.A00.A09;
                O8 A03 = o82.A03(c1102Rk);
                c0957Lv3 = this.A00.A0E;
                O8 A02 = A03.A02(c0957Lv3);
                abstractC1456cD = ((VP) this.A00).A0A;
                Map<String, String> A05 = A02.A04(abstractC1456cD.A0b()).A05();
                j72 = ((VP) this.A00).A0C;
                str2 = this.A00.A0A;
                j72.AA6(str2, A05);
                abstractC1456cD2 = ((VP) this.A00).A0A;
                C1T A1Q = abstractC1456cD2.A1Q();
                c1314Zs = this.A00.A0D;
                C1T.A07(A1Q, c1314Zs);
                c1314Zs2 = this.A00.A0D;
                c1314Zs2.A0E().A36();
                abstractC1456cD3 = this.A00.A03;
                String A0a = abstractC1456cD3.A0a();
                abstractC1456cD4 = ((VP) this.A00).A0A;
                C2M.A02(A0a, AbstractC0940Le.A00(abstractC1456cD4.A0c()));
            }
        }
    }
}
