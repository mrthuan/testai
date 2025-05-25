package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.af  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1363af extends AbstractC05444k {
    public static String[] A01 = {"ofgeN", "GcYePxlnDkyLzFZQt8gXTfFAd", "bIohWxIGlUqKJ41hMBKnFxYrg", "ROugplE3NXuve66PKoPS6E1ZAyp", "eD20R2wAf", "s8oLKbIochRuLWrY7HR296xJjla", "faP6eJ6K6STeOEuOEXCJ6OuUaXzDbpLW", "oXM2gF3tn"};
    public boolean A00 = true;

    public abstract boolean A0R(AnonymousClass56 anonymousClass56);

    public abstract boolean A0S(AnonymousClass56 anonymousClass56);

    public abstract boolean A0T(AnonymousClass56 anonymousClass56, int i10, int i11, int i12, int i13);

    public abstract boolean A0U(AnonymousClass56 anonymousClass56, AnonymousClass56 anonymousClass562, int i10, int i11, int i12, int i13);

    @Override // com.facebook.ads.redexgen.X.AbstractC05444k
    public final boolean A0D(AnonymousClass56 anonymousClass56) {
        return !this.A00 || anonymousClass56.A0Z();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05444k
    public final boolean A0E(AnonymousClass56 anonymousClass56, C05434j c05434j, C05434j c05434j2) {
        if (c05434j != null && (c05434j.A01 != c05434j2.A01 || c05434j.A03 != c05434j2.A03)) {
            return A0T(anonymousClass56, c05434j.A01, c05434j.A03, c05434j2.A01, c05434j2.A03);
        }
        return A0R(anonymousClass56);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05444k
    public final boolean A0F(AnonymousClass56 anonymousClass56, C05434j c05434j, C05434j c05434j2) {
        int i10 = c05434j.A01;
        int oldLeft = c05434j.A03;
        View view = anonymousClass56.A0H;
        int oldTop = c05434j2 == null ? view.getLeft() : c05434j2.A01;
        String[] strArr = A01;
        if (strArr[7].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[7] = "jyZdeafgD";
        strArr2[4] = "NUmje91r8";
        int top = c05434j2 == null ? view.getTop() : c05434j2.A03;
        if (!anonymousClass56.A0a() && (i10 != oldTop || oldLeft != top)) {
            view.layout(oldTop, top, view.getWidth() + oldTop, view.getHeight() + top);
            return A0T(anonymousClass56, i10, oldLeft, oldTop, top);
        }
        return A0S(anonymousClass56);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05444k
    public final boolean A0G(AnonymousClass56 anonymousClass56, C05434j c05434j, C05434j c05434j2) {
        if (c05434j.A01 != c05434j2.A01 || c05434j.A03 != c05434j2.A03) {
            return A0T(anonymousClass56, c05434j.A01, c05434j.A03, c05434j2.A01, c05434j2.A03);
        }
        A0O(anonymousClass56);
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05444k
    public final boolean A0H(AnonymousClass56 anonymousClass56, AnonymousClass56 anonymousClass562, C05434j c05434j, C05434j c05434j2) {
        int i10;
        int i11;
        int i12 = c05434j.A01;
        int i13 = c05434j.A03;
        if (anonymousClass562.A0f()) {
            i10 = c05434j.A01;
            i11 = c05434j.A03;
        } else {
            i10 = c05434j2.A01;
            i11 = c05434j2.A03;
        }
        return A0U(anonymousClass56, anonymousClass562, i12, i13, i10, i11);
    }

    public final void A0N(AnonymousClass56 anonymousClass56) {
        A0C(anonymousClass56);
    }

    public final void A0O(AnonymousClass56 anonymousClass56) {
        A0C(anonymousClass56);
    }

    public final void A0P(AnonymousClass56 anonymousClass56) {
        A0C(anonymousClass56);
    }

    public final void A0Q(AnonymousClass56 anonymousClass56, boolean z10) {
        A0C(anonymousClass56);
    }
}
