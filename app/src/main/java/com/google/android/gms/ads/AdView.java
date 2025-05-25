package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class AdView extends BaseAdView {
    public AdView(Context context) {
        super(context);
        if (context == null) {
            throw new NullPointerException("Context cannot be null");
        }
    }

    public AdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AdView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, 0);
    }
}
