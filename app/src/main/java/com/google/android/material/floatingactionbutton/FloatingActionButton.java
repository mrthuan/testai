package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.appcompat.widget.k;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.g;
import com.google.android.material.internal.VisibilityAwareImageButton;
import f8.j;
import f9.h;
import f9.m;
import f9.q;
import j8.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import pdf.pdfreader.viewer.editor.free.R;
import w8.s;
import w8.w;
import x0.f0;
import x0.n0;
import y.i;

/* loaded from: classes2.dex */
public class FloatingActionButton extends VisibilityAwareImageButton implements u8.a, q, CoordinatorLayout.b {

    /* renamed from: b  reason: collision with root package name */
    public ColorStateList f12506b;
    public PorterDuff.Mode c;

    /* renamed from: d  reason: collision with root package name */
    public ColorStateList f12507d;

    /* renamed from: e  reason: collision with root package name */
    public PorterDuff.Mode f12508e;

    /* renamed from: f  reason: collision with root package name */
    public ColorStateList f12509f;

    /* renamed from: g  reason: collision with root package name */
    public int f12510g;

    /* renamed from: h  reason: collision with root package name */
    public int f12511h;

    /* renamed from: i  reason: collision with root package name */
    public int f12512i;

    /* renamed from: j  reason: collision with root package name */
    public int f12513j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f12514k;

    /* renamed from: l  reason: collision with root package name */
    public final Rect f12515l;

    /* renamed from: m  reason: collision with root package name */
    public final Rect f12516m;

    /* renamed from: n  reason: collision with root package name */
    public final k f12517n;

    /* renamed from: o  reason: collision with root package name */
    public final u8.b f12518o;

    /* renamed from: p  reason: collision with root package name */
    public v8.g f12519p;

    /* loaded from: classes2.dex */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes2.dex */
    public class b implements e9.b {
        public b() {
        }
    }

    /* loaded from: classes2.dex */
    public class c<T extends FloatingActionButton> implements g.e {

        /* renamed from: a  reason: collision with root package name */
        public final j<T> f12523a;

        public c(BottomAppBar.b bVar) {
            this.f12523a = bVar;
        }

        @Override // com.google.android.material.floatingactionbutton.g.e
        public final void a() {
            j8.e topEdgeTreatment;
            j8.e topEdgeTreatment2;
            j8.e topEdgeTreatment3;
            j8.e topEdgeTreatment4;
            BottomAppBar.b bVar = (BottomAppBar.b) this.f12523a;
            bVar.getClass();
            BottomAppBar bottomAppBar = BottomAppBar.this;
            if (bottomAppBar.f12085d0 == 1) {
                FloatingActionButton floatingActionButton = FloatingActionButton.this;
                float translationX = floatingActionButton.getTranslationX();
                topEdgeTreatment = bottomAppBar.getTopEdgeTreatment();
                int i10 = (topEdgeTreatment.f19067e > translationX ? 1 : (topEdgeTreatment.f19067e == translationX ? 0 : -1));
                h hVar = bottomAppBar.V;
                if (i10 != 0) {
                    topEdgeTreatment4 = bottomAppBar.getTopEdgeTreatment();
                    topEdgeTreatment4.f19067e = translationX;
                    hVar.invalidateSelf();
                }
                float f10 = 0.0f;
                float max = Math.max(0.0f, -floatingActionButton.getTranslationY());
                topEdgeTreatment2 = bottomAppBar.getTopEdgeTreatment();
                if (topEdgeTreatment2.f19066d != max) {
                    topEdgeTreatment3 = bottomAppBar.getTopEdgeTreatment();
                    if (max >= 0.0f) {
                        topEdgeTreatment3.f19066d = max;
                        hVar.invalidateSelf();
                    } else {
                        topEdgeTreatment3.getClass();
                        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
                    }
                }
                if (floatingActionButton.getVisibility() == 0) {
                    f10 = floatingActionButton.getScaleY();
                }
                hVar.o(f10);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.g.e
        public final void b() {
            float f10;
            BottomAppBar.b bVar = (BottomAppBar.b) this.f12523a;
            bVar.getClass();
            BottomAppBar bottomAppBar = BottomAppBar.this;
            h hVar = bottomAppBar.V;
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            if (floatingActionButton.getVisibility() == 0 && bottomAppBar.f12085d0 == 1) {
                f10 = floatingActionButton.getScaleY();
            } else {
                f10 = 0.0f;
            }
            hVar.o(f10);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof c) && ((c) obj).f12523a.equals(this.f12523a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f12523a.hashCode();
        }
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    private g getImpl() {
        if (this.f12519p == null) {
            this.f12519p = new v8.g(this, new b());
        }
        return this.f12519p;
    }

    @Override // u8.a
    public final boolean a() {
        return this.f12518o.f30262b;
    }

    public final void d(BottomAppBar.a aVar) {
        g impl = getImpl();
        if (impl.f12555t == null) {
            impl.f12555t = new ArrayList<>();
        }
        impl.f12555t.add(aVar);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().j(getDrawableState());
    }

    public final void e(j8.d dVar) {
        g impl = getImpl();
        if (impl.f12554s == null) {
            impl.f12554s = new ArrayList<>();
        }
        impl.f12554s.add(dVar);
    }

    public final void f(BottomAppBar.b bVar) {
        g impl = getImpl();
        c cVar = new c(bVar);
        if (impl.f12556u == null) {
            impl.f12556u = new ArrayList<>();
        }
        impl.f12556u.add(cVar);
    }

    public final int g(int i10) {
        int i11 = this.f12511h;
        if (i11 != 0) {
            return i11;
        }
        Resources resources = getResources();
        if (i10 != -1) {
            if (i10 != 1) {
                return resources.getDimensionPixelSize(R.dimen.design_fab_size_normal);
            }
            return resources.getDimensionPixelSize(R.dimen.design_fab_size_mini);
        } else if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return g(1);
        } else {
            return g(0);
        }
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f12506b;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.c;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().e();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f12544i;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f12545j;
    }

    public Drawable getContentBackground() {
        return getImpl().f12540e;
    }

    public int getCustomSize() {
        return this.f12511h;
    }

    public int getExpandedComponentIdHint() {
        return this.f12518o.f30261a;
    }

    public f8.h getHideMotionSpec() {
        return getImpl().f12549n;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f12509f;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f12509f;
    }

    public m getShapeAppearanceModel() {
        m mVar = getImpl().f12537a;
        mVar.getClass();
        return mVar;
    }

    public f8.h getShowMotionSpec() {
        return getImpl().f12548m;
    }

    public int getSize() {
        return this.f12510g;
    }

    public int getSizeDimension() {
        return g(this.f12510g);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f12507d;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f12508e;
    }

    public boolean getUseCompatPadding() {
        return this.f12514k;
    }

    public final void h(j8.b bVar, boolean z10) {
        d dVar;
        boolean z11;
        int i10;
        AnimatorSet c10;
        g impl = getImpl();
        if (bVar == null) {
            dVar = null;
        } else {
            dVar = new d(this, bVar);
        }
        boolean z12 = true;
        if (impl.f12557v.getVisibility() != 0 ? impl.f12553r != 2 : impl.f12553r == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            Animator animator = impl.f12547l;
            if (animator != null) {
                animator.cancel();
            }
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            FloatingActionButton floatingActionButton = impl.f12557v;
            if (!f0.g.c(floatingActionButton) || floatingActionButton.isInEditMode()) {
                z12 = false;
            }
            if (z12) {
                f8.h hVar = impl.f12549n;
                if (hVar != null) {
                    c10 = impl.b(hVar, 0.0f, 0.0f, 0.0f);
                } else {
                    c10 = impl.c(g.F, g.G, 0.0f, 0.4f, 0.4f);
                }
                c10.addListener(new e(impl, z10, dVar));
                ArrayList<Animator.AnimatorListener> arrayList = impl.f12555t;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        c10.addListener(it.next());
                    }
                }
                c10.start();
                return;
            }
            if (z10) {
                i10 = 8;
            } else {
                i10 = 4;
            }
            floatingActionButton.b(i10, z10);
            if (dVar != null) {
                dVar.f12530a.a(dVar.f12531b);
            }
        }
    }

    public final boolean i() {
        g impl = getImpl();
        if (impl.f12557v.getVisibility() == 0) {
            if (impl.f12553r != 1) {
                return false;
            }
        } else if (impl.f12553r == 2) {
            return false;
        }
        return true;
    }

    public final boolean j() {
        g impl = getImpl();
        if (impl.f12557v.getVisibility() != 0) {
            if (impl.f12553r != 2) {
                return false;
            }
        } else if (impl.f12553r == 1) {
            return false;
        }
        return true;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().h();
    }

    public final void k(Rect rect) {
        int i10 = rect.left;
        Rect rect2 = this.f12515l;
        rect.left = i10 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    public final void l() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f12507d;
        if (colorStateList == null) {
            drawable.clearColorFilter();
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f12508e;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(androidx.appcompat.widget.h.c(colorForState, mode));
    }

    public final void m(b.a aVar, boolean z10) {
        d dVar;
        boolean z11;
        boolean z12;
        AnimatorSet c10;
        float f10;
        float f11;
        g impl = getImpl();
        if (aVar == null) {
            dVar = null;
        } else {
            dVar = new d(this, aVar);
        }
        boolean z13 = true;
        if (impl.f12557v.getVisibility() == 0 ? impl.f12553r != 1 : impl.f12553r == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            Animator animator = impl.f12547l;
            if (animator != null) {
                animator.cancel();
            }
            if (impl.f12548m == null) {
                z12 = true;
            } else {
                z12 = false;
            }
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            FloatingActionButton floatingActionButton = impl.f12557v;
            if (!f0.g.c(floatingActionButton) || floatingActionButton.isInEditMode()) {
                z13 = false;
            }
            Matrix matrix = impl.A;
            if (z13) {
                if (floatingActionButton.getVisibility() != 0) {
                    float f12 = 0.0f;
                    floatingActionButton.setAlpha(0.0f);
                    if (z12) {
                        f10 = 0.4f;
                    } else {
                        f10 = 0.0f;
                    }
                    floatingActionButton.setScaleY(f10);
                    if (z12) {
                        f11 = 0.4f;
                    } else {
                        f11 = 0.0f;
                    }
                    floatingActionButton.setScaleX(f11);
                    if (z12) {
                        f12 = 0.4f;
                    }
                    impl.f12551p = f12;
                    impl.a(f12, matrix);
                    floatingActionButton.setImageMatrix(matrix);
                }
                f8.h hVar = impl.f12548m;
                if (hVar != null) {
                    c10 = impl.b(hVar, 1.0f, 1.0f, 1.0f);
                } else {
                    c10 = impl.c(g.D, g.E, 1.0f, 1.0f, 1.0f);
                }
                c10.addListener(new f(impl, z10, dVar));
                ArrayList<Animator.AnimatorListener> arrayList = impl.f12554s;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        c10.addListener(it.next());
                    }
                }
                c10.start();
                return;
            }
            floatingActionButton.b(0, z10);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            impl.f12551p = 1.0f;
            impl.a(1.0f, matrix);
            floatingActionButton.setImageMatrix(matrix);
            if (dVar != null) {
                dVar.f12530a.b();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        g impl = getImpl();
        h hVar = impl.f12538b;
        FloatingActionButton floatingActionButton = impl.f12557v;
        if (hVar != null) {
            b.b.Y(floatingActionButton, hVar);
        }
        if (!(impl instanceof v8.g)) {
            ViewTreeObserver viewTreeObserver = floatingActionButton.getViewTreeObserver();
            if (impl.B == null) {
                impl.B = new v8.f(impl);
            }
            viewTreeObserver.addOnPreDrawListener(impl.B);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.f12557v.getViewTreeObserver();
        v8.f fVar = impl.B;
        if (fVar != null) {
            viewTreeObserver.removeOnPreDrawListener(fVar);
            impl.B = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int sizeDimension = getSizeDimension();
        this.f12512i = (sizeDimension - this.f12513j) / 2;
        getImpl().q();
        int min = Math.min(View.resolveSize(sizeDimension, i10), View.resolveSize(sizeDimension, i11));
        Rect rect = this.f12515l;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof i9.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i9.a aVar = (i9.a) parcelable;
        super.onRestoreInstanceState(aVar.f5506a);
        Bundle orDefault = aVar.c.getOrDefault("expandableWidgetHelper", null);
        orDefault.getClass();
        u8.b bVar = this.f12518o;
        bVar.getClass();
        bVar.f30262b = orDefault.getBoolean("expanded", false);
        bVar.f30261a = orDefault.getInt("expandedComponentIdHint", 0);
        if (bVar.f30262b) {
            View view = (View) bVar.c;
            ViewParent parent = view.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).g(view);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        i9.a aVar = new i9.a(onSaveInstanceState);
        i<String, Bundle> iVar = aVar.c;
        u8.b bVar = this.f12518o;
        bVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", bVar.f30262b);
        bundle.putInt("expandedComponentIdHint", bVar.f30261a);
        iVar.put("expandableWidgetHelper", bundle);
        return aVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (motionEvent.getAction() == 0) {
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            boolean c10 = f0.g.c(this);
            Rect rect = this.f12516m;
            if (c10) {
                rect.set(0, 0, getWidth(), getHeight());
                k(rect);
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && !rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f12506b != colorStateList) {
            this.f12506b = colorStateList;
            g impl = getImpl();
            h hVar = impl.f12538b;
            if (hVar != null) {
                hVar.setTintList(colorStateList);
            }
            v8.b bVar = impl.f12539d;
            if (bVar != null) {
                if (colorStateList != null) {
                    bVar.f30759m = colorStateList.getColorForState(bVar.getState(), bVar.f30759m);
                }
                bVar.f30762p = colorStateList;
                bVar.f30760n = true;
                bVar.invalidateSelf();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.c != mode) {
            this.c = mode;
            h hVar = getImpl().f12538b;
            if (hVar != null) {
                hVar.setTintMode(mode);
            }
        }
    }

    public void setCompatElevation(float f10) {
        g impl = getImpl();
        if (impl.f12543h != f10) {
            impl.f12543h = f10;
            impl.k(f10, impl.f12544i, impl.f12545j);
        }
    }

    public void setCompatElevationResource(int i10) {
        setCompatElevation(getResources().getDimension(i10));
    }

    public void setCompatHoveredFocusedTranslationZ(float f10) {
        g impl = getImpl();
        if (impl.f12544i != f10) {
            impl.f12544i = f10;
            impl.k(impl.f12543h, f10, impl.f12545j);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i10) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i10));
    }

    public void setCompatPressedTranslationZ(float f10) {
        g impl = getImpl();
        if (impl.f12545j != f10) {
            impl.f12545j = f10;
            impl.k(impl.f12543h, impl.f12544i, f10);
        }
    }

    public void setCompatPressedTranslationZResource(int i10) {
        setCompatPressedTranslationZ(getResources().getDimension(i10));
    }

    public void setCustomSize(int i10) {
        if (i10 >= 0) {
            if (i10 != this.f12511h) {
                this.f12511h = i10;
                requestLayout();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Custom size must be non-negative");
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        h hVar = getImpl().f12538b;
        if (hVar != null) {
            hVar.m(f10);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        if (z10 != getImpl().f12541f) {
            getImpl().f12541f = z10;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i10) {
        this.f12518o.f30261a = i10;
    }

    public void setHideMotionSpec(f8.h hVar) {
        getImpl().f12549n = hVar;
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(f8.h.b(getContext(), i10));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            g impl = getImpl();
            float f10 = impl.f12551p;
            impl.f12551p = f10;
            Matrix matrix = impl.A;
            impl.a(f10, matrix);
            impl.f12557v.setImageMatrix(matrix);
            if (this.f12507d != null) {
                l();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        this.f12517n.c(i10);
        l();
    }

    public void setMaxImageSize(int i10) {
        this.f12513j = i10;
        g impl = getImpl();
        if (impl.f12552q != i10) {
            impl.f12552q = i10;
            float f10 = impl.f12551p;
            impl.f12551p = f10;
            Matrix matrix = impl.A;
            impl.a(f10, matrix);
            impl.f12557v.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(int i10) {
        setRippleColor(ColorStateList.valueOf(i10));
    }

    @Override // android.view.View
    public void setScaleX(float f10) {
        super.setScaleX(f10);
        ArrayList<g.e> arrayList = getImpl().f12556u;
        if (arrayList != null) {
            Iterator<g.e> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    @Override // android.view.View
    public void setScaleY(float f10) {
        super.setScaleY(f10);
        ArrayList<g.e> arrayList = getImpl().f12556u;
        if (arrayList != null) {
            Iterator<g.e> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    public void setShadowPaddingEnabled(boolean z10) {
        g impl = getImpl();
        impl.f12542g = z10;
        impl.q();
    }

    @Override // f9.q
    public void setShapeAppearanceModel(m mVar) {
        getImpl().n(mVar);
    }

    public void setShowMotionSpec(f8.h hVar) {
        getImpl().f12548m = hVar;
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(f8.h.b(getContext(), i10));
    }

    public void setSize(int i10) {
        this.f12511h = 0;
        if (i10 != this.f12510g) {
            this.f12510g = i10;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f12507d != colorStateList) {
            this.f12507d = colorStateList;
            l();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f12508e != mode) {
            this.f12508e = mode;
            l();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        getImpl().l();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        getImpl().l();
    }

    @Override // android.view.View
    public void setTranslationZ(float f10) {
        super.setTranslationZ(f10);
        getImpl().l();
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f12514k != z10) {
            this.f12514k = z10;
            getImpl().i();
        }
    }

    @Override // com.google.android.material.internal.VisibilityAwareImageButton, android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    /* loaded from: classes2.dex */
    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a  reason: collision with root package name */
        public Rect f12520a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f12521b;

        public BaseBehavior() {
            this.f12521b = true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean a(View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            int left = floatingActionButton.getLeft();
            Rect rect2 = floatingActionButton.f12515l;
            rect.set(left + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void c(CoordinatorLayout.f fVar) {
            if (fVar.f3493h == 0) {
                fVar.f3493h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            boolean z10;
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                t(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.f) {
                    z10 = ((CoordinatorLayout.f) layoutParams).f3487a instanceof BottomSheetBehavior;
                } else {
                    z10 = false;
                }
                if (z10) {
                    u(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
            int i11;
            boolean z10;
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ArrayList i12 = coordinatorLayout.i(floatingActionButton);
            int size = i12.size();
            int i13 = 0;
            for (int i14 = 0; i14 < size; i14++) {
                View view2 = (View) i12.get(i14);
                if (view2 instanceof AppBarLayout) {
                    if (t(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.f) {
                        z10 = ((CoordinatorLayout.f) layoutParams).f3487a instanceof BottomSheetBehavior;
                    } else {
                        z10 = false;
                    }
                    if (z10 && u(view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.u(floatingActionButton, i10);
            Rect rect = floatingActionButton.f12515l;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
                if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) {
                    i11 = rect.right;
                } else if (floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) fVar).leftMargin) {
                    i11 = -rect.left;
                } else {
                    i11 = 0;
                }
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) {
                    i13 = rect.bottom;
                } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) fVar).topMargin) {
                    i13 = -rect.top;
                }
                if (i13 != 0) {
                    WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                    floatingActionButton.offsetTopAndBottom(i13);
                }
                if (i11 != 0) {
                    WeakHashMap<View, n0> weakHashMap2 = f0.f31435a;
                    floatingActionButton.offsetLeftAndRight(i11);
                    return true;
                }
                return true;
            }
            return true;
        }

        public final boolean s(View view, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            if (!this.f12521b || fVar.f3491f != view.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            return true;
        }

        public final boolean t(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!s(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f12520a == null) {
                this.f12520a = new Rect();
            }
            Rect rect = this.f12520a;
            w8.c.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.h(null, false);
                return true;
            }
            floatingActionButton.m(null, false);
            return true;
        }

        public final boolean u(View view, FloatingActionButton floatingActionButton) {
            if (!s(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.h(null, false);
                return true;
            }
            floatingActionButton.m(null, false);
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e8.a.f16498s);
            this.f12521b = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.floatingActionButtonStyle);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f12509f != colorStateList) {
            this.f12509f = colorStateList;
            getImpl().m(this.f12509f);
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i10) {
        super(l9.a.a(context, attributeSet, i10, 2132018038), attributeSet, i10);
        this.f12515l = new Rect();
        this.f12516m = new Rect();
        Context context2 = getContext();
        TypedArray d10 = s.d(context2, attributeSet, e8.a.f16497r, i10, 2132018038, new int[0]);
        this.f12506b = b9.c.a(context2, d10, 1);
        this.c = w.f(d10.getInt(2, -1), null);
        this.f12509f = b9.c.a(context2, d10, 12);
        this.f12510g = d10.getInt(7, -1);
        this.f12511h = d10.getDimensionPixelSize(6, 0);
        int dimensionPixelSize = d10.getDimensionPixelSize(3, 0);
        float dimension = d10.getDimension(4, 0.0f);
        float dimension2 = d10.getDimension(9, 0.0f);
        float dimension3 = d10.getDimension(11, 0.0f);
        this.f12514k = d10.getBoolean(16, false);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        setMaxImageSize(d10.getDimensionPixelSize(10, 0));
        f8.h a10 = f8.h.a(context2, d10, 15);
        f8.h a11 = f8.h.a(context2, d10, 8);
        m mVar = new m(m.d(context2, attributeSet, i10, 2132018038, m.f17211m));
        boolean z10 = d10.getBoolean(5, false);
        setEnabled(d10.getBoolean(0, true));
        d10.recycle();
        k kVar = new k(this);
        this.f12517n = kVar;
        kVar.b(attributeSet, i10);
        this.f12518o = new u8.b(this);
        getImpl().n(mVar);
        getImpl().g(this.f12506b, this.c, this.f12509f, dimensionPixelSize);
        getImpl().f12546k = dimensionPixelSize2;
        g impl = getImpl();
        if (impl.f12543h != dimension) {
            impl.f12543h = dimension;
            impl.k(dimension, impl.f12544i, impl.f12545j);
        }
        g impl2 = getImpl();
        if (impl2.f12544i != dimension2) {
            impl2.f12544i = dimension2;
            impl2.k(impl2.f12543h, dimension2, impl2.f12545j);
        }
        g impl3 = getImpl();
        if (impl3.f12545j != dimension3) {
            impl3.f12545j = dimension3;
            impl3.k(impl3.f12543h, impl3.f12544i, dimension3);
        }
        getImpl().f12548m = a10;
        getImpl().f12549n = a11;
        getImpl().f12541f = z10;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    /* loaded from: classes2.dex */
    public static abstract class a {
        public void b() {
        }

        public void a(FloatingActionButton floatingActionButton) {
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
    }
}
