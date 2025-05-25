package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import g0.d;

/* loaded from: classes.dex */
public class Layer extends ConstraintHelper {

    /* renamed from: i  reason: collision with root package name */
    public float f2969i;

    /* renamed from: j  reason: collision with root package name */
    public float f2970j;

    /* renamed from: k  reason: collision with root package name */
    public float f2971k;

    /* renamed from: l  reason: collision with root package name */
    public ConstraintLayout f2972l;

    /* renamed from: m  reason: collision with root package name */
    public float f2973m;

    /* renamed from: n  reason: collision with root package name */
    public float f2974n;

    /* renamed from: o  reason: collision with root package name */
    public float f2975o;

    /* renamed from: p  reason: collision with root package name */
    public float f2976p;

    /* renamed from: q  reason: collision with root package name */
    public float f2977q;

    /* renamed from: r  reason: collision with root package name */
    public float f2978r;

    /* renamed from: s  reason: collision with root package name */
    public float f2979s;

    /* renamed from: t  reason: collision with root package name */
    public float f2980t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f2981u;

    /* renamed from: v  reason: collision with root package name */
    public View[] f2982v;

    /* renamed from: w  reason: collision with root package name */
    public float f2983w;

    /* renamed from: x  reason: collision with root package name */
    public float f2984x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f2985y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f2986z;

    public Layer(Context context) {
        super(context);
        this.f2969i = Float.NaN;
        this.f2970j = Float.NaN;
        this.f2971k = Float.NaN;
        this.f2973m = 1.0f;
        this.f2974n = 1.0f;
        this.f2975o = Float.NaN;
        this.f2976p = Float.NaN;
        this.f2977q = Float.NaN;
        this.f2978r = Float.NaN;
        this.f2979s = Float.NaN;
        this.f2980t = Float.NaN;
        this.f2981u = true;
        this.f2982v = null;
        this.f2983w = 0.0f;
        this.f2984x = 0.0f;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void j(ConstraintLayout constraintLayout) {
        i(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void n(AttributeSet attributeSet) {
        super.n(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, d.c);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 6) {
                    this.f2985y = true;
                } else if (index == 22) {
                    this.f2986z = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2972l = (ConstraintLayout) getParent();
        if (this.f2985y || this.f2986z) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i10 = 0; i10 < this.f3272b; i10++) {
                View c = this.f2972l.c(this.f3271a[i10]);
                if (c != null) {
                    if (this.f2985y) {
                        c.setVisibility(visibility);
                    }
                    if (this.f2986z && elevation > 0.0f) {
                        c.setTranslationZ(c.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void q() {
        v();
        this.f2975o = Float.NaN;
        this.f2976p = Float.NaN;
        ConstraintWidget constraintWidget = ((ConstraintLayout.b) getLayoutParams()).f3326q0;
        constraintWidget.R(0);
        constraintWidget.O(0);
        u();
        layout(((int) this.f2979s) - getPaddingLeft(), ((int) this.f2980t) - getPaddingTop(), getPaddingRight() + ((int) this.f2977q), getPaddingBottom() + ((int) this.f2978r));
        w();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void r(ConstraintLayout constraintLayout) {
        this.f2972l = constraintLayout;
        float rotation = getRotation();
        if (rotation == 0.0f) {
            if (!Float.isNaN(this.f2971k)) {
                this.f2971k = rotation;
                return;
            }
            return;
        }
        this.f2971k = rotation;
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        h();
    }

    @Override // android.view.View
    public void setPivotX(float f10) {
        this.f2969i = f10;
        w();
    }

    @Override // android.view.View
    public void setPivotY(float f10) {
        this.f2970j = f10;
        w();
    }

    @Override // android.view.View
    public void setRotation(float f10) {
        this.f2971k = f10;
        w();
    }

    @Override // android.view.View
    public void setScaleX(float f10) {
        this.f2973m = f10;
        w();
    }

    @Override // android.view.View
    public void setScaleY(float f10) {
        this.f2974n = f10;
        w();
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        this.f2983w = f10;
        w();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        this.f2984x = f10;
        w();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        h();
    }

    public final void u() {
        if (this.f2972l == null) {
            return;
        }
        if (!this.f2981u && !Float.isNaN(this.f2975o) && !Float.isNaN(this.f2976p)) {
            return;
        }
        if (!Float.isNaN(this.f2969i) && !Float.isNaN(this.f2970j)) {
            this.f2976p = this.f2970j;
            this.f2975o = this.f2969i;
            return;
        }
        View[] m10 = m(this.f2972l);
        int left = m10[0].getLeft();
        int top = m10[0].getTop();
        int right = m10[0].getRight();
        int bottom = m10[0].getBottom();
        for (int i10 = 0; i10 < this.f3272b; i10++) {
            View view = m10[i10];
            left = Math.min(left, view.getLeft());
            top = Math.min(top, view.getTop());
            right = Math.max(right, view.getRight());
            bottom = Math.max(bottom, view.getBottom());
        }
        this.f2977q = right;
        this.f2978r = bottom;
        this.f2979s = left;
        this.f2980t = top;
        if (Float.isNaN(this.f2969i)) {
            this.f2975o = (left + right) / 2;
        } else {
            this.f2975o = this.f2969i;
        }
        if (Float.isNaN(this.f2970j)) {
            this.f2976p = (top + bottom) / 2;
        } else {
            this.f2976p = this.f2970j;
        }
    }

    public final void v() {
        int i10;
        if (this.f2972l == null || (i10 = this.f3272b) == 0) {
            return;
        }
        View[] viewArr = this.f2982v;
        if (viewArr == null || viewArr.length != i10) {
            this.f2982v = new View[i10];
        }
        for (int i11 = 0; i11 < this.f3272b; i11++) {
            this.f2982v[i11] = this.f2972l.c(this.f3271a[i11]);
        }
    }

    public final void w() {
        double radians;
        if (this.f2972l == null) {
            return;
        }
        if (this.f2982v == null) {
            v();
        }
        u();
        if (Float.isNaN(this.f2971k)) {
            radians = 0.0d;
        } else {
            radians = Math.toRadians(this.f2971k);
        }
        float sin = (float) Math.sin(radians);
        float cos = (float) Math.cos(radians);
        float f10 = this.f2973m;
        float f11 = f10 * cos;
        float f12 = this.f2974n;
        float f13 = (-f12) * sin;
        float f14 = f10 * sin;
        float f15 = f12 * cos;
        for (int i10 = 0; i10 < this.f3272b; i10++) {
            View view = this.f2982v[i10];
            int left = view.getLeft();
            int top = view.getTop();
            float right = ((view.getRight() + left) / 2) - this.f2975o;
            float bottom = ((view.getBottom() + top) / 2) - this.f2976p;
            view.setTranslationX((((f13 * bottom) + (f11 * right)) - right) + this.f2983w);
            view.setTranslationY((((f15 * bottom) + (right * f14)) - bottom) + this.f2984x);
            view.setScaleY(this.f2974n);
            view.setScaleX(this.f2973m);
            if (!Float.isNaN(this.f2971k)) {
                view.setRotation(this.f2971k);
            }
        }
    }

    public Layer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2969i = Float.NaN;
        this.f2970j = Float.NaN;
        this.f2971k = Float.NaN;
        this.f2973m = 1.0f;
        this.f2974n = 1.0f;
        this.f2975o = Float.NaN;
        this.f2976p = Float.NaN;
        this.f2977q = Float.NaN;
        this.f2978r = Float.NaN;
        this.f2979s = Float.NaN;
        this.f2980t = Float.NaN;
        this.f2981u = true;
        this.f2982v = null;
        this.f2983w = 0.0f;
        this.f2984x = 0.0f;
    }

    public Layer(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f2969i = Float.NaN;
        this.f2970j = Float.NaN;
        this.f2971k = Float.NaN;
        this.f2973m = 1.0f;
        this.f2974n = 1.0f;
        this.f2975o = Float.NaN;
        this.f2976p = Float.NaN;
        this.f2977q = Float.NaN;
        this.f2978r = Float.NaN;
        this.f2979s = Float.NaN;
        this.f2980t = Float.NaN;
        this.f2981u = true;
        this.f2982v = null;
        this.f2983w = 0.0f;
        this.f2984x = 0.0f;
    }
}
