package com.facebook.ads.redexgen.X;

import android.view.accessibility.AccessibilityEvent;

/* loaded from: assets/audience_network.dex */
public class FY extends C1384b1 {
    @Override // com.facebook.ads.redexgen.X.C05203l
    public final int A00(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    @Override // com.facebook.ads.redexgen.X.C05203l
    public final void A01(AccessibilityEvent accessibilityEvent, int i10) {
        accessibilityEvent.setContentChangeTypes(i10);
    }
}
