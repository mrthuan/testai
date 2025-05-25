package com.google.android.material.progressindicator;

import a9.g;
import a9.l;
import a9.m;
import a9.o;
import a9.r;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.view.menu.c;
import java.util.WeakHashMap;
import pdf.pdfreader.viewer.editor.free.R;
import x0.f0;
import x0.n0;

/* loaded from: classes2.dex */
public final class LinearProgressIndicator extends BaseProgressIndicator<LinearProgressIndicatorSpec> {

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ int f12782n = 0;

    public LinearProgressIndicator(Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public final LinearProgressIndicatorSpec a(Context context, AttributeSet attributeSet) {
        return new LinearProgressIndicatorSpec(context, attributeSet);
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public final void b(int i10, boolean z10) {
        S s4 = this.f12763a;
        if (s4 != 0 && ((LinearProgressIndicatorSpec) s4).f12783g == 0 && isIndeterminate()) {
            return;
        }
        super.b(i10, z10);
    }

    public int getIndeterminateAnimationType() {
        return ((LinearProgressIndicatorSpec) this.f12763a).f12783g;
    }

    public int getIndicatorDirection() {
        return ((LinearProgressIndicatorSpec) this.f12763a).f12784h;
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        S s4 = this.f12763a;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) s4;
        boolean z11 = true;
        if (((LinearProgressIndicatorSpec) s4).f12784h != 1) {
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            if ((f0.e.d(this) != 1 || ((LinearProgressIndicatorSpec) s4).f12784h != 2) && (f0.e.d(this) != 0 || ((LinearProgressIndicatorSpec) s4).f12784h != 3)) {
                z11 = false;
            }
        }
        linearProgressIndicatorSpec.f12785i = z11;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        int paddingRight = i10 - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i11 - (getPaddingBottom() + getPaddingTop());
        l<LinearProgressIndicatorSpec> indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        g<LinearProgressIndicatorSpec> progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    public void setIndeterminateAnimationType(int i10) {
        S s4 = this.f12763a;
        if (((LinearProgressIndicatorSpec) s4).f12783g == i10) {
            return;
        }
        if (c() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        ((LinearProgressIndicatorSpec) s4).f12783g = i10;
        ((LinearProgressIndicatorSpec) s4).a();
        if (i10 == 0) {
            l<LinearProgressIndicatorSpec> indeterminateDrawable = getIndeterminateDrawable();
            o oVar = new o((LinearProgressIndicatorSpec) s4);
            indeterminateDrawable.f441m = oVar;
            oVar.f2009a = indeterminateDrawable;
        } else {
            l<LinearProgressIndicatorSpec> indeterminateDrawable2 = getIndeterminateDrawable();
            r rVar = new r(getContext(), (LinearProgressIndicatorSpec) s4);
            indeterminateDrawable2.f441m = rVar;
            rVar.f2009a = indeterminateDrawable2;
        }
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        ((LinearProgressIndicatorSpec) this.f12763a).a();
    }

    public void setIndicatorDirection(int i10) {
        S s4 = this.f12763a;
        ((LinearProgressIndicatorSpec) s4).f12784h = i10;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) s4;
        boolean z10 = true;
        if (i10 != 1) {
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            if ((f0.e.d(this) != 1 || ((LinearProgressIndicatorSpec) s4).f12784h != 2) && (f0.e.d(this) != 0 || i10 != 3)) {
                z10 = false;
            }
        }
        linearProgressIndicatorSpec.f12785i = z10;
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackCornerRadius(int i10) {
        super.setTrackCornerRadius(i10);
        ((LinearProgressIndicatorSpec) this.f12763a).a();
        invalidate();
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, 2132018258);
        c rVar;
        Context context2 = getContext();
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) this.f12763a;
        m mVar = new m(linearProgressIndicatorSpec);
        if (linearProgressIndicatorSpec.f12783g == 0) {
            rVar = new o(linearProgressIndicatorSpec);
        } else {
            rVar = new r(context2, linearProgressIndicatorSpec);
        }
        setIndeterminateDrawable(new l(context2, linearProgressIndicatorSpec, mVar, rVar));
        setProgressDrawable(new g(getContext(), linearProgressIndicatorSpec, new m(linearProgressIndicatorSpec)));
    }
}
