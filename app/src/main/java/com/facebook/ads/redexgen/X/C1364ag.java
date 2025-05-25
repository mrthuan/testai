package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: com.facebook.ads.redexgen.X.ag  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1364ag extends AnonymousClass37 {
    public final AnonymousClass37 A00 = new C1365ah(this);
    public final FL A01;

    public C1364ag(FL fl2) {
        this.A01 = fl2;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass37
    public final void A07(View view, AccessibilityEvent accessibilityEvent) {
        super.A07(view, accessibilityEvent);
        accessibilityEvent.setClassName(FL.class.getName());
        if ((view instanceof FL) && !A0B()) {
            FL fl2 = (FL) view;
            if (fl2.getLayoutManager() != null) {
                fl2.getLayoutManager().A1t(accessibilityEvent);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass37
    public final void A08(View view, C05273s c05273s) {
        super.A08(view, c05273s);
        c05273s.A0O(FL.class.getName());
        if (!A0B() && this.A01.getLayoutManager() != null) {
            this.A01.getLayoutManager().A1F(c05273s);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass37
    public final boolean A09(View view, int i10, Bundle bundle) {
        if (super.A09(view, i10, bundle)) {
            return true;
        }
        if (!A0B() && this.A01.getLayoutManager() != null) {
            return this.A01.getLayoutManager().A1V(i10, bundle);
        }
        return false;
    }

    public final AnonymousClass37 A0A() {
        return this.A00;
    }

    public final boolean A0B() {
        return this.A01.A1p();
    }
}
