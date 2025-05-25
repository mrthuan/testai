package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.41  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass41 extends AbstractC0728Cc {
    public final int A00;
    public final int A01;
    public final HL<? super InterfaceC0838Gz> A02;
    public final String A03;
    public final boolean A04;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HL != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.DataSource> */
    public AnonymousClass41(String str, HL<? super InterfaceC0838Gz> hl2) {
        this(str, hl2, 8000, 8000, false);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.HL != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.DataSource> */
    public AnonymousClass41(String str, HL<? super InterfaceC0838Gz> hl2, int i10, int i11, boolean z10) {
        this.A03 = str;
        this.A02 = hl2;
        this.A00 = i10;
        this.A01 = i11;
        this.A04 = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC0728Cc
    /* renamed from: A00 */
    public final C0730Ce A01(HA ha2) {
        return new C0730Ce(this.A03, null, this.A02, this.A00, this.A01, this.A04, ha2);
    }
}
