package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class X0 implements InterfaceC0837Gy {
    public final HL<? super X1> A00;

    public X0() {
        this(null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HL != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.FileDataSource> */
    public X0(HL<? super X1> hl2) {
        this.A00 = hl2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0837Gy
    public final InterfaceC0838Gz A4t() {
        return new X1(this.A00);
    }
}
