package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Vj  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1205Vj implements InterfaceC0945Lj {
    public final C0944Li A00;
    public final InterfaceC0945Lj A01;

    public C1205Vj(InterfaceC0945Lj interfaceC0945Lj, int i10, int i11) {
        this.A01 = interfaceC0945Lj;
        this.A00 = new C0944Li(i10, i11);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0945Lj
    public final void AEb(String str) {
        boolean A08;
        this.A00.A04(str);
        if (this.A00.A02() != null) {
            A08 = AbstractC0947Ll.A08(this.A00);
            if (A08) {
                this.A01.AEb(this.A00.A02());
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0945Lj
    public final void flush() {
        boolean A08;
        this.A00.A03();
        while (this.A00.A02() != null) {
            A08 = AbstractC0947Ll.A08(this.A00);
            if (A08) {
                this.A01.AEb(this.A00.A02());
            }
            this.A00.A03();
        }
    }
}
