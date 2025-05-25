package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.inmobi.media.d7  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1598d7 extends ViewGroup {
    public C1598d7(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams p10) {
        kotlin.jvm.internal.g.e(p10, "p");
        return p10 instanceof C1584c7;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p10) {
        kotlin.jvm.internal.g.e(p10, "p");
        return new C1584c7(p10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                kotlin.jvm.internal.g.c(layoutParams, "null cannot be cast to non-null type com.inmobi.ads.viewsv2.NativeContainerLayout.LayoutParams");
                C1584c7 c1584c7 = (C1584c7) layoutParams;
                int i15 = c1584c7.f14986a;
                childAt.layout(i15, c1584c7.f14987b, childAt.getMeasuredWidth() + i15, childAt.getMeasuredHeight() + c1584c7.f14987b);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        measureChildren(i10, i11);
        int childCount = getChildCount();
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                kotlin.jvm.internal.g.c(layoutParams, "null cannot be cast to non-null type com.inmobi.ads.viewsv2.NativeContainerLayout.LayoutParams");
                C1584c7 c1584c7 = (C1584c7) layoutParams;
                int i15 = c1584c7.f14986a;
                int i16 = c1584c7.f14987b;
                i13 = Math.max(i13, childAt.getMeasuredWidth() + i15);
                i12 = Math.max(i12, childAt.getMeasuredHeight() + i16);
            }
        }
        setMeasuredDimension(View.resolveSize(Math.max(i13, getSuggestedMinimumWidth()), i10), View.resolveSize(Math.max(i12, getSuggestedMinimumHeight()), i11));
    }
}
