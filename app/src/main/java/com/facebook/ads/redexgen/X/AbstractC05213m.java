package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: com.facebook.ads.redexgen.X.3m  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC05213m {
    public static final C05203l A00;

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            A00 = new FY();
        } else if (Build.VERSION.SDK_INT >= 16) {
            A00 = new C1384b1();
        } else {
            A00 = new C05203l();
        }
    }

    public static int A00(AccessibilityEvent accessibilityEvent) {
        return A00.A00(accessibilityEvent);
    }

    public static void A01(AccessibilityEvent accessibilityEvent, int i10) {
        A00.A01(accessibilityEvent, i10);
    }
}
