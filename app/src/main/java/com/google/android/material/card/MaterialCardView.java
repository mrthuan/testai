package com.google.android.material.card;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import b.b;
import f9.h;
import f9.m;
import f9.q;
import n8.c;
import p0.a;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import w8.s;

/* loaded from: classes2.dex */
public class MaterialCardView extends CardView implements Checkable, q {

    /* renamed from: l  reason: collision with root package name */
    public static final int[] f12217l = {16842911};

    /* renamed from: m  reason: collision with root package name */
    public static final int[] f12218m = {16842912};

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f12219n = {R.attr.state_dragged};

    /* renamed from: h  reason: collision with root package name */
    public final c f12220h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f12221i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f12222j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f12223k;

    /* loaded from: classes2.dex */
    public interface a {
    }

    public MaterialCardView(Context context) {
        this(context, null);
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f12220h.c.getBounds());
        return rectF;
    }

    public final void f() {
        c cVar;
        RippleDrawable rippleDrawable;
        if (Build.VERSION.SDK_INT > 26 && (rippleDrawable = (cVar = this.f12220h).f22360o) != null) {
            Rect bounds = rippleDrawable.getBounds();
            int i10 = bounds.bottom;
            cVar.f22360o.setBounds(bounds.left, bounds.top, bounds.right, i10 - 1);
            cVar.f22360o.setBounds(bounds.left, bounds.top, bounds.right, i10);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.f12220h.c.f17164a.c;
    }

    public ColorStateList getCardForegroundColor() {
        return this.f12220h.f22349d.f17164a.c;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f12220h.f22355j;
    }

    public int getCheckedIconGravity() {
        return this.f12220h.f22352g;
    }

    public int getCheckedIconMargin() {
        return this.f12220h.f22350e;
    }

    public int getCheckedIconSize() {
        return this.f12220h.f22351f;
    }

    public ColorStateList getCheckedIconTint() {
        return this.f12220h.f22357l;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.f12220h.f22348b.bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.f12220h.f22348b.left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.f12220h.f22348b.right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.f12220h.f22348b.top;
    }

    public float getProgress() {
        return this.f12220h.c.f17164a.f17194j;
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.f12220h.c.j();
    }

    public ColorStateList getRippleColor() {
        return this.f12220h.f22356k;
    }

    public m getShapeAppearanceModel() {
        return this.f12220h.f22358m;
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.f12220h.f22359n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f12220h.f22359n;
    }

    public int getStrokeWidth() {
        return this.f12220h.f22353h;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f12222j;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b.Y(this, this.f12220h.c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        boolean z10;
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 3);
        c cVar = this.f12220h;
        if (cVar != null && cVar.f22364s) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            View.mergeDrawableStates(onCreateDrawableState, f12217l);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f12218m);
        }
        if (this.f12223k) {
            View.mergeDrawableStates(onCreateDrawableState, f12219n);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        c cVar = this.f12220h;
        if (cVar != null && cVar.f22364s) {
            z10 = true;
        } else {
            z10 = false;
        }
        accessibilityNodeInfo.setCheckable(z10);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f12220h.e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f12221i) {
            c cVar = this.f12220h;
            if (!cVar.f22363r) {
                cVar.f22363r = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f12220h.c.n(colorStateList);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f10) {
        super.setCardElevation(f10);
        c cVar = this.f12220h;
        cVar.c.m(cVar.f22347a.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        h hVar = this.f12220h.f22349d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        hVar.n(colorStateList);
    }

    public void setCheckable(boolean z10) {
        this.f12220h.f22364s = z10;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        if (this.f12222j != z10) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f12220h.g(drawable);
    }

    public void setCheckedIconGravity(int i10) {
        c cVar = this.f12220h;
        if (cVar.f22352g != i10) {
            cVar.f22352g = i10;
            MaterialCardView materialCardView = cVar.f22347a;
            cVar.e(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i10) {
        this.f12220h.f22350e = i10;
    }

    public void setCheckedIconMarginResource(int i10) {
        if (i10 != -1) {
            this.f12220h.f22350e = getResources().getDimensionPixelSize(i10);
        }
    }

    public void setCheckedIconResource(int i10) {
        this.f12220h.g(m.a.a(getContext(), i10));
    }

    public void setCheckedIconSize(int i10) {
        this.f12220h.f22351f = i10;
    }

    public void setCheckedIconSizeResource(int i10) {
        if (i10 != 0) {
            this.f12220h.f22351f = getResources().getDimensionPixelSize(i10);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        c cVar = this.f12220h;
        cVar.f22357l = colorStateList;
        Drawable drawable = cVar.f22355j;
        if (drawable != null) {
            a.b.h(drawable, colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z10) {
        Drawable drawable;
        super.setClickable(z10);
        c cVar = this.f12220h;
        if (cVar != null) {
            Drawable drawable2 = cVar.f22354i;
            MaterialCardView materialCardView = cVar.f22347a;
            if (materialCardView.isClickable()) {
                drawable = cVar.c();
            } else {
                drawable = cVar.f22349d;
            }
            cVar.f22354i = drawable;
            if (drawable2 != drawable) {
                if (materialCardView.getForeground() instanceof InsetDrawable) {
                    ((InsetDrawable) materialCardView.getForeground()).setDrawable(drawable);
                } else {
                    materialCardView.setForeground(cVar.d(drawable));
                }
            }
        }
    }

    public void setDragged(boolean z10) {
        if (this.f12223k != z10) {
            this.f12223k = z10;
            refreshDrawableState();
            f();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f10) {
        super.setMaxCardElevation(f10);
        this.f12220h.k();
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z10) {
        super.setPreventCornerOverlap(z10);
        c cVar = this.f12220h;
        cVar.k();
        cVar.j();
    }

    public void setProgress(float f10) {
        c cVar = this.f12220h;
        cVar.c.o(f10);
        h hVar = cVar.f22349d;
        if (hVar != null) {
            hVar.o(f10);
        }
        h hVar2 = cVar.f22362q;
        if (hVar2 != null) {
            hVar2.o(f10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
        if (r3 != false) goto L16;
     */
    @Override // androidx.cardview.widget.CardView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setRadius(float r3) {
        /*
            r2 = this;
            super.setRadius(r3)
            n8.c r0 = r2.f12220h
            f9.m r1 = r0.f22358m
            f9.m r3 = r1.g(r3)
            r0.h(r3)
            android.graphics.drawable.Drawable r3 = r0.f22354i
            r3.invalidateSelf()
            boolean r3 = r0.i()
            if (r3 != 0) goto L2e
            com.google.android.material.card.MaterialCardView r3 = r0.f22347a
            boolean r3 = r3.getPreventCornerOverlap()
            if (r3 == 0) goto L2b
            f9.h r3 = r0.c
            boolean r3 = r3.l()
            if (r3 != 0) goto L2b
            r3 = 1
            goto L2c
        L2b:
            r3 = 0
        L2c:
            if (r3 == 0) goto L31
        L2e:
            r0.j()
        L31:
            boolean r3 = r0.i()
            if (r3 == 0) goto L3a
            r0.k()
        L3a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.card.MaterialCardView.setRadius(float):void");
    }

    public void setRippleColor(ColorStateList colorStateList) {
        c cVar = this.f12220h;
        cVar.f22356k = colorStateList;
        RippleDrawable rippleDrawable = cVar.f22360o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i10) {
        ColorStateList colorStateList = androidx.core.content.a.getColorStateList(getContext(), i10);
        c cVar = this.f12220h;
        cVar.f22356k = colorStateList;
        RippleDrawable rippleDrawable = cVar.f22360o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    @Override // f9.q
    public void setShapeAppearanceModel(m mVar) {
        setClipToOutline(mVar.f(getBoundsAsRectF()));
        this.f12220h.h(mVar);
    }

    public void setStrokeColor(int i10) {
        setStrokeColor(ColorStateList.valueOf(i10));
    }

    public void setStrokeWidth(int i10) {
        c cVar = this.f12220h;
        if (i10 != cVar.f22353h) {
            cVar.f22353h = i10;
            h hVar = cVar.f22349d;
            ColorStateList colorStateList = cVar.f22359n;
            hVar.t(i10);
            hVar.s(colorStateList);
        }
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z10) {
        super.setUseCompatPadding(z10);
        c cVar = this.f12220h;
        cVar.k();
        cVar.j();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        boolean z10;
        c cVar = this.f12220h;
        if (cVar != null && cVar.f22364s) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && isEnabled()) {
            this.f12222j = !this.f12222j;
            refreshDrawableState();
            f();
            cVar.f(this.f12222j, true);
        }
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialCardViewStyle);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        c cVar = this.f12220h;
        if (cVar.f22359n != colorStateList) {
            cVar.f22359n = colorStateList;
            h hVar = cVar.f22349d;
            hVar.t(cVar.f22353h);
            hVar.s(colorStateList);
        }
        invalidate();
    }

    public MaterialCardView(Context context, AttributeSet attributeSet, int i10) {
        super(l9.a.a(context, attributeSet, i10, 2132018239), attributeSet, i10);
        this.f12222j = false;
        this.f12223k = false;
        this.f12221i = true;
        TypedArray d10 = s.d(getContext(), attributeSet, e8.a.C, i10, 2132018239, new int[0]);
        c cVar = new c(this, attributeSet, i10);
        this.f12220h = cVar;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        h hVar = cVar.c;
        hVar.n(cardBackgroundColor);
        cVar.f22348b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        cVar.j();
        MaterialCardView materialCardView = cVar.f22347a;
        ColorStateList a10 = b9.c.a(materialCardView.getContext(), d10, 11);
        cVar.f22359n = a10;
        if (a10 == null) {
            cVar.f22359n = ColorStateList.valueOf(-1);
        }
        cVar.f22353h = d10.getDimensionPixelSize(12, 0);
        boolean z10 = d10.getBoolean(0, false);
        cVar.f22364s = z10;
        materialCardView.setLongClickable(z10);
        cVar.f22357l = b9.c.a(materialCardView.getContext(), d10, 6);
        cVar.g(b9.c.d(materialCardView.getContext(), d10, 2));
        cVar.f22351f = d10.getDimensionPixelSize(5, 0);
        cVar.f22350e = d10.getDimensionPixelSize(4, 0);
        cVar.f22352g = d10.getInteger(3, 8388661);
        ColorStateList a11 = b9.c.a(materialCardView.getContext(), d10, 7);
        cVar.f22356k = a11;
        if (a11 == null) {
            cVar.f22356k = ColorStateList.valueOf(t0.K(materialCardView, R.attr.colorControlHighlight));
        }
        ColorStateList a12 = b9.c.a(materialCardView.getContext(), d10, 1);
        h hVar2 = cVar.f22349d;
        hVar2.n(a12 == null ? ColorStateList.valueOf(0) : a12);
        RippleDrawable rippleDrawable = cVar.f22360o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(cVar.f22356k);
        }
        hVar.m(materialCardView.getCardElevation());
        ColorStateList colorStateList = cVar.f22359n;
        hVar2.t(cVar.f22353h);
        hVar2.s(colorStateList);
        materialCardView.setBackgroundInternal(cVar.d(hVar));
        LayerDrawable c = materialCardView.isClickable() ? cVar.c() : hVar2;
        cVar.f22354i = c;
        materialCardView.setForeground(cVar.d(c));
        d10.recycle();
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i10) {
        this.f12220h.c.n(ColorStateList.valueOf(i10));
    }

    public void setOnCheckedChangeListener(a aVar) {
    }
}
