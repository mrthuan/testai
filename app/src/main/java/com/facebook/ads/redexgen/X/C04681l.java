package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: com.facebook.ads.redexgen.X.1l  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C04681l extends C04832a {
    @Override // com.facebook.ads.redexgen.X.C3S
    public final C05193k A08(View view, C05193k c05193k) {
        WindowInsets result = (WindowInsets) C05193k.A01(c05193k);
        WindowInsets unwrapped = view.dispatchApplyWindowInsets(result);
        if (unwrapped != result) {
            result = new WindowInsets(unwrapped);
        }
        return C05193k.A00(result);
    }

    @Override // com.facebook.ads.redexgen.X.C3S
    public final C05193k A09(View view, C05193k c05193k) {
        WindowInsets result = (WindowInsets) C05193k.A01(c05193k);
        WindowInsets unwrapped = view.onApplyWindowInsets(result);
        if (unwrapped != result) {
            result = new WindowInsets(unwrapped);
        }
        return C05193k.A00(result);
    }

    @Override // com.facebook.ads.redexgen.X.C3S
    public final void A0B(View view) {
        view.stopNestedScroll();
    }

    @Override // com.facebook.ads.redexgen.X.C3S
    public final void A0F(View view, final C3D c3d) {
        if (c3d == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.facebook.ads.redexgen.X.3R
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    C05193k compatInsets = c3d.ABA(view2, C05193k.A00(windowInsets));
                    return (WindowInsets) C05193k.A01(compatInsets);
                }
            });
        }
    }
}
