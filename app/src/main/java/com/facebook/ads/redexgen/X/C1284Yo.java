package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Yo  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1284Yo implements C6 {
    public final long A00;
    public final C5 A01;

    public C1284Yo(long j10) {
        this(j10, 0L);
    }

    public C1284Yo(long j10, long j11) {
        this.A00 = j10;
        this.A01 = new C5(j11 == 0 ? C7.A04 : new C7(0L, j11));
    }

    @Override // com.facebook.ads.redexgen.X.C6
    public final long A7F() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.C6
    public final C5 A8H(long j10) {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.C6
    public final boolean A9h() {
        return false;
    }
}
