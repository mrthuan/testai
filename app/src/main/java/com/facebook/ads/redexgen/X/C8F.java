package com.facebook.ads.redexgen.X;

import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.8F  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C8F extends Exception {
    public int A00;
    public int A01;
    public int A02;
    public JSONObject A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;

    public C8F(String str) {
        super(str);
        this.A01 = 0;
        this.A06 = true;
        this.A05 = true;
        this.A04 = false;
        this.A00 = 0;
        this.A02 = -1;
    }

    public C8F(String str, String str2) {
        super(str + '\n' + str2);
        this.A01 = 0;
        this.A06 = true;
        this.A05 = true;
        this.A04 = false;
        this.A00 = 0;
        this.A02 = -1;
    }

    public C8F(Throwable th2) {
        super(th2);
        this.A01 = 0;
        this.A06 = true;
        this.A05 = true;
        this.A04 = false;
        this.A00 = 0;
        this.A02 = -1;
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

    public final JSONObject A03() {
        return this.A03;
    }

    public final void A04(int i10) {
        this.A00 = i10;
    }

    public final void A05(int i10) {
        this.A01 = i10;
    }

    public final void A06(int i10) {
        this.A02 = i10;
    }

    public final void A07(JSONObject jSONObject) {
        this.A03 = jSONObject;
    }

    public final void A08(boolean z10) {
        this.A05 = z10;
    }

    public final void A09(boolean z10) {
        this.A04 = z10;
    }

    public final void A0A(boolean z10) {
        this.A06 = z10;
    }

    public final boolean A0B() {
        return this.A05;
    }

    public final boolean A0C() {
        return this.A04;
    }

    public final boolean A0D() {
        return this.A06;
    }
}
