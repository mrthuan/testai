package com.facebook.ads.redexgen.X;

import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class J3 {
    public double A00;
    public J9 A01;
    public JA A02;
    public String A03;
    public String A04;
    public Map<String, String> A05;
    public boolean A06;

    public final J3 A00(double d10) {
        this.A00 = d10;
        return this;
    }

    public final J3 A01(J9 j92) {
        this.A01 = j92;
        return this;
    }

    public final J3 A02(JA ja2) {
        this.A02 = ja2;
        return this;
    }

    public final J3 A03(String str) {
        this.A03 = str;
        return this;
    }

    public final J3 A04(String str) {
        this.A04 = str;
        return this;
    }

    public final J3 A05(Map<String, String> mData) {
        this.A05 = mData;
        return this;
    }

    public final J3 A06(boolean z10) {
        this.A06 = z10;
        return this;
    }

    public final J4 A07(C7j c7j) {
        return new J4(c7j, this.A04, this.A00, this.A03, this.A05, this.A01, this.A02, this.A06);
    }
}
