package com.facebook.ads.redexgen.X;

import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Ry  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1116Ry {
    public int A00;
    public int A01;
    public int A02;
    public InterfaceC1106Ro A03;
    public Map<String, String> A04;
    public final int A05;
    public final int A06;

    public C1116Ry(int i10, int i11, int i12, int i13, int i14, Map<String, String> requestHeaders, InterfaceC1106Ro interfaceC1106Ro) {
        this.A06 = i10;
        this.A00 = i11;
        this.A02 = i12;
        this.A05 = i13;
        this.A01 = i14;
        this.A04 = requestHeaders;
        this.A03 = interfaceC1106Ro;
    }

    public final int A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01;
    }

    public final int A02() {
        return this.A02;
    }

    public final int A03() {
        return this.A05;
    }

    public final int A04() {
        return this.A06;
    }

    public final InterfaceC1106Ro A05() {
        return this.A03;
    }

    public final Map<String, String> A06() {
        return this.A04;
    }
}
