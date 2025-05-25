package com.facebook.ads.redexgen.X;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.2W  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C2W implements Serializable {
    public static final long serialVersionUID = -3209129042070173126L;
    public C2W A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final List<C2W> A04;

    public C2W(int i10, String str, String str2) {
        this.A04 = new ArrayList();
        this.A01 = i10;
        this.A03 = str;
        this.A02 = str2;
    }

    public C2W(String str) {
        this(0, null, str);
    }

    private void A00(C2W c2w) {
        this.A00 = c2w;
    }

    public final int A01() {
        return this.A01;
    }

    public final C2W A02() {
        return this.A00;
    }

    public final String A03() {
        return this.A02;
    }

    public final String A04() {
        return this.A03;
    }

    public final List<C2W> A05() {
        return this.A04;
    }

    public final void A06(C2W c2w) {
        c2w.A00(this);
        this.A04.add(c2w);
    }
}
