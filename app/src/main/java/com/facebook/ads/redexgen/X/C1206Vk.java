package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Vk  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1206Vk implements InterfaceC0945Lj {
    public int A00;
    public final InterfaceC0945Lj A01;

    public C1206Vk(InterfaceC0945Lj interfaceC0945Lj, int i10) {
        this.A01 = interfaceC0945Lj;
        this.A00 = i10;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0945Lj
    public final void AEb(String str) {
        if (this.A00 > 0) {
            this.A01.AEb(str);
            this.A00--;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0945Lj
    public final void flush() {
        this.A01.flush();
    }
}
