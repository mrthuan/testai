package com.facebook.ads.redexgen.X;

import java.io.Serializable;

/* renamed from: com.facebook.ads.redexgen.X.2R  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C2R implements Serializable {
    public C2Q A00;
    public C2Q A01;

    public C2R() {
        this(0.5d, 0.5d);
    }

    public C2R(double d10) {
        this(d10, 0.5d);
    }

    public C2R(double d10, double d11) {
        this.A00 = new C2Q(d10);
        this.A01 = new C2Q(d11);
        A02();
    }

    public final C2Q A00() {
        return this.A00;
    }

    public final C2Q A01() {
        return this.A01;
    }

    public final void A02() {
        this.A00.A07();
        this.A01.A07();
    }

    public final void A03() {
        this.A00.A08();
        this.A01.A08();
    }

    public final void A04(double d10, double d11) {
        this.A00.A09(d10, d11);
    }

    public final void A05(double d10, double d11) {
        this.A01.A09(d10, d11);
    }
}
