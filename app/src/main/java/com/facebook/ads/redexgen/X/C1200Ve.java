package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Ve  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1200Ve extends KY {
    public final /* synthetic */ DialogInterface A00;
    public final /* synthetic */ MG A01;

    public C1200Ve(MG mg2, DialogInterface dialogInterface) {
        this.A01 = mg2;
        this.A00 = dialogInterface;
    }

    @Override // com.facebook.ads.redexgen.X.KY
    public final void A06() {
        InterfaceC1108Rq interfaceC1108Rq;
        InterfaceC1108Rq interfaceC1108Rq2;
        C1313Zr c1313Zr;
        Map<? extends String, ? extends String> A02;
        interfaceC1108Rq = this.A01.A01.A02;
        if (interfaceC1108Rq != null) {
            interfaceC1108Rq2 = this.A01.A01.A02;
            c1313Zr = this.A01.A01.A00;
            String A03 = KE.A03(c1313Zr);
            S4 s4 = new S4();
            A02 = this.A01.A01.A02(this.A01.A00.getText().toString());
            interfaceC1108Rq2.AES(A03, s4.A05(A02).A08());
        }
        this.A00.cancel();
    }
}
