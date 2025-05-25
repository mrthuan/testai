package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Insets;
import android.media.ImageReader;
import android.util.AttributeSet;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class f {
    public static /* bridge */ /* synthetic */ ImageReader b(int i10, int i11) {
        return ImageReader.newInstance(i10, i11, 1, 3, 768L);
    }

    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction c() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
    }

    public static /* bridge */ /* synthetic */ void j(WindowInsets.Builder builder, Insets insets) {
        builder.setTappableElementInsets(insets);
    }

    public static /* bridge */ /* synthetic */ void l(CoordinatorLayout coordinatorLayout, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10) {
        coordinatorLayout.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, 0);
    }
}
