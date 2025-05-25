package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.ce  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1483ce implements AnonymousClass64 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ GL A01;
    public final /* synthetic */ GL A02;
    public final /* synthetic */ C8X A03;

    public C1483ce(GL gl2, int i10, C8X c8x, GL gl3) {
        this.A01 = gl2;
        this.A00 = i10;
        this.A03 = c8x;
        this.A02 = gl3;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass64
    public final void ABB() {
        this.A01.A0C(this.A00, this.A03);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass64
    public final void ABC() {
        InterfaceC04540x interfaceC04540x;
        interfaceC04540x = this.A01.A00;
        interfaceC04540x.ACN(this.A02, C0894Jg.A00(AdErrorType.NO_FILL));
    }
}
