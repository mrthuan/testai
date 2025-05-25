package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class TG implements S9 {
    public final /* synthetic */ C1068Qc A00;

    public TG(C1068Qc c1068Qc) {
        this.A00 = c1068Qc;
    }

    @Override // com.facebook.ads.redexgen.X.S9
    public final void AEd() {
        MR mr;
        MR mr2;
        N9 n92;
        mr = this.A00.A02;
        if (mr != null) {
            mr2 = this.A00.A02;
            n92 = this.A00.A03;
            mr2.A4P(n92.A8K());
        }
    }

    @Override // com.facebook.ads.redexgen.X.S9
    public final void AEf(SB sb2) {
        MR mr;
        MR mr2;
        N9 n92;
        MR mr3;
        N9 n93;
        mr = this.A00.A02;
        if (mr == null) {
            return;
        }
        if (sb2 == null || !sb2.A00()) {
            mr2 = this.A00.A02;
            n92 = this.A00.A03;
            mr2.A4P(n92.A8K());
            return;
        }
        mr3 = this.A00.A02;
        n93 = this.A00.A03;
        mr3.A4P(n93.A8L());
    }
}
