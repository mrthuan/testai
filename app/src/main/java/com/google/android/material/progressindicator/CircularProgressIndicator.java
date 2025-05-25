package com.google.android.material.progressindicator;

import a9.c;
import a9.f;
import a9.g;
import a9.l;
import android.content.Context;
import android.util.AttributeSet;
import pdf.pdfreader.viewer.editor.free.R;

/* loaded from: classes2.dex */
public final class CircularProgressIndicator extends BaseProgressIndicator<CircularProgressIndicatorSpec> {

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ int f12778n = 0;

    public CircularProgressIndicator(Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public final CircularProgressIndicatorSpec a(Context context, AttributeSet attributeSet) {
        return new CircularProgressIndicatorSpec(context, attributeSet);
    }

    public int getIndicatorDirection() {
        return ((CircularProgressIndicatorSpec) this.f12763a).f12781i;
    }

    public int getIndicatorInset() {
        return ((CircularProgressIndicatorSpec) this.f12763a).f12780h;
    }

    public int getIndicatorSize() {
        return ((CircularProgressIndicatorSpec) this.f12763a).f12779g;
    }

    public void setIndicatorDirection(int i10) {
        ((CircularProgressIndicatorSpec) this.f12763a).f12781i = i10;
        invalidate();
    }

    public void setIndicatorInset(int i10) {
        S s4 = this.f12763a;
        if (((CircularProgressIndicatorSpec) s4).f12780h != i10) {
            ((CircularProgressIndicatorSpec) s4).f12780h = i10;
            invalidate();
        }
    }

    public void setIndicatorSize(int i10) {
        int max = Math.max(i10, getTrackThickness() * 2);
        S s4 = this.f12763a;
        if (((CircularProgressIndicatorSpec) s4).f12779g != max) {
            ((CircularProgressIndicatorSpec) s4).f12779g = max;
            ((CircularProgressIndicatorSpec) s4).getClass();
            invalidate();
        }
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackThickness(int i10) {
        super.setTrackThickness(i10);
        ((CircularProgressIndicatorSpec) this.f12763a).getClass();
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, 2132018246);
        Context context2 = getContext();
        CircularProgressIndicatorSpec circularProgressIndicatorSpec = (CircularProgressIndicatorSpec) this.f12763a;
        setIndeterminateDrawable(new l(context2, circularProgressIndicatorSpec, new c(circularProgressIndicatorSpec), new f(circularProgressIndicatorSpec)));
        setProgressDrawable(new g(getContext(), circularProgressIndicatorSpec, new c(circularProgressIndicatorSpec)));
    }
}
