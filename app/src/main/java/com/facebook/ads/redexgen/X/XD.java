package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup;
import lib.zj.office.fc.hpsf.Constants;

/* loaded from: assets/audience_network.dex */
public final class XD implements InterfaceC0823Gk {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final InterfaceC0833Gu A06;
    public final InterfaceC0847Hi A07;

    public XD(InterfaceC0833Gu interfaceC0833Gu) {
        this(interfaceC0833Gu, Constants.CP_MAC_ROMAN, 25000, 25000, 0.75f, 0.75f, 2000L, InterfaceC0847Hi.A00);
    }

    public XD(InterfaceC0833Gu interfaceC0833Gu, int i10, int i11, int i12, float f10, float f11, long j10, InterfaceC0847Hi interfaceC0847Hi) {
        this.A06 = interfaceC0833Gu;
        this.A03 = i10;
        this.A02 = i11;
        this.A04 = i12;
        this.A00 = f10;
        this.A01 = f11;
        this.A05 = j10;
        this.A07 = interfaceC0847Hi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0823Gk
    /* renamed from: A00 */
    public final D2 A5A(TrackGroup trackGroup, int... iArr) {
        return new D2(trackGroup, iArr, this.A06, this.A03, this.A02, this.A04, this.A00, this.A01, this.A05, this.A07);
    }
}
