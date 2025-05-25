package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: com.facebook.ads.redexgen.X.37  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class AnonymousClass37 {
    public static final View.AccessibilityDelegate A01;
    public static final AnonymousClass36 A02;
    public final View.AccessibilityDelegate A00 = A02.A00(this);

    static {
        if (Build.VERSION.SDK_INT >= 16) {
            A02 = new C1389b7();
        } else {
            A02 = new AnonymousClass36();
        }
        A01 = new View.AccessibilityDelegate();
    }

    public final View.AccessibilityDelegate A00() {
        return this.A00;
    }

    public final C05293u A01(View view) {
        return A02.A01(A01, view);
    }

    public final void A02(View view, int i10) {
        A01.sendAccessibilityEvent(view, i10);
    }

    public final void A03(View view, AccessibilityEvent accessibilityEvent) {
        A01.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public final void A04(View view, AccessibilityEvent accessibilityEvent) {
        A01.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public final boolean A05(View view, AccessibilityEvent accessibilityEvent) {
        return A01.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public final boolean A06(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return A01.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public void A07(View view, AccessibilityEvent accessibilityEvent) {
        A01.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void A08(View view, C05273s c05273s) {
        A01.onInitializeAccessibilityNodeInfo(view, c05273s.A0M());
    }

    public boolean A09(View view, int i10, Bundle bundle) {
        return A02.A02(A01, view, i10, bundle);
    }
}
