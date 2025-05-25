package com.facebook.ads.redexgen.X;

import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Sp  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1133Sp extends C2P {
    public final /* synthetic */ C1132So A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1133Sp(C1132So c1132So, double d10, double d11, double d12, boolean z10) {
        super(d10, d11, d12, z10);
        this.A00 = c1132So;
    }

    @Override // com.facebook.ads.redexgen.X.C2P
    public final void A00(boolean z10, boolean z11, C2R c2r) {
        boolean z12;
        String str;
        Map A0I;
        if (z11) {
            z12 = this.A00.A0A;
            if (!z12) {
                this.A00.A0A = true;
                C1132So c1132So = this.A00;
                str = this.A00.A0J;
                A0I = this.A00.A0I(EnumC1078Qm.A0B);
                c1132So.A0Q(str, A0I);
            }
        }
    }
}
