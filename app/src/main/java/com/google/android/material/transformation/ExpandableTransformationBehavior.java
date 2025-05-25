package com.google.android.material.transformation;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

@Deprecated
/* loaded from: classes2.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: b  reason: collision with root package name */
    public AnimatorSet f13135b;

    public ExpandableTransformationBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    public void s(View view, View view2, boolean z10, boolean z11) {
        boolean z12;
        AnimatorSet animatorSet = this.f13135b;
        if (animatorSet != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            animatorSet.cancel();
        }
        AnimatorSet t4 = t(view, view2, z10, z12);
        this.f13135b = t4;
        t4.addListener(new n9.a(this));
        this.f13135b.start();
        if (!z11) {
            this.f13135b.end();
        }
    }

    public abstract AnimatorSet t(View view, View view2, boolean z10, boolean z11);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
