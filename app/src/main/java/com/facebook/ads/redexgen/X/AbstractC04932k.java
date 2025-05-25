package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;

/* renamed from: com.facebook.ads.redexgen.X.2k  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC04932k {
    public static TypedValue A00;
    public static final Object A01 = new Object();

    public static final Drawable A00(Context context, int i10) {
        int resolvedId;
        if (Build.VERSION.SDK_INT >= 21) {
            return context.getDrawable(i10);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return context.getResources().getDrawable(i10);
        }
        synchronized (A01) {
            if (A00 == null) {
                A00 = new TypedValue();
            }
            context.getResources().getValue(i10, A00, true);
            resolvedId = A00.resourceId;
        }
        return context.getResources().getDrawable(resolvedId);
    }
}
