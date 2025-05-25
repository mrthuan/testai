package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.widget.EdgeEffect;

/* renamed from: com.facebook.ads.redexgen.X.43  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class AnonymousClass43 {
    public static final AnonymousClass42 A00;

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            A00 = new C1379aw();
        } else {
            A00 = new AnonymousClass42();
        }
    }

    public static void A00(EdgeEffect edgeEffect, float f10, float f11) {
        A00.A00(edgeEffect, f10, f11);
    }
}
