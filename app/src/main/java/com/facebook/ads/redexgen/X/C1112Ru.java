package com.facebook.ads.redexgen.X;

import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.Ru  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1112Ru {
    public C1116Ry A00;
    public Set<String> A01;
    public Set<String> A02;
    public boolean A03;
    public boolean A04 = true;

    public final C1112Ru A00(C1116Ry c1116Ry) {
        this.A00 = c1116Ry;
        return this;
    }

    public final C1112Ru A01(Set<String> pinnedCertificates) {
        this.A01 = pinnedCertificates;
        return this;
    }

    public final C1112Ru A02(Set<String> pinnedPublicKeys) {
        this.A02 = pinnedPublicKeys;
        return this;
    }

    public final C1112Ru A03(boolean z10) {
        this.A04 = z10;
        return this;
    }

    public final C1112Ru A04(boolean z10) {
        this.A03 = z10;
        return this;
    }

    public final C1113Rv A05() {
        return new C1113Rv(this.A00, this.A04, this.A02, this.A01, this.A03);
    }
}
