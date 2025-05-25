package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Vn  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1209Vn implements InterfaceC0945Lj {
    public int A00;
    public final InterfaceC0945Lj A01;
    public final InterfaceC0945Lj A02;

    public C1209Vn(InterfaceC0945Lj interfaceC0945Lj, int i10, InterfaceC0945Lj interfaceC0945Lj2) {
        this.A01 = interfaceC0945Lj;
        this.A00 = i10;
        this.A02 = interfaceC0945Lj2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0945Lj
    public final void AEb(String str) {
        if (this.A00 > 0) {
            this.A01.AEb(str);
            this.A01.flush();
            this.A00--;
            return;
        }
        this.A02.AEb(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0945Lj
    public final void flush() {
        this.A02.flush();
    }
}
