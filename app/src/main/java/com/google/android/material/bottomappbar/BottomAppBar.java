package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.k;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import f8.j;
import f9.h;
import f9.m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p0.a;
import pdf.pdfreader.viewer.editor.free.R;
import w8.s;
import w8.v;
import w8.w;
import x0.f0;
import x0.n0;
import x0.s0;

/* loaded from: classes2.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {

    /* renamed from: v0  reason: collision with root package name */
    public static final /* synthetic */ int f12081v0 = 0;
    public Integer U;
    public final h V;
    public Animator W;

    /* renamed from: a0  reason: collision with root package name */
    public Animator f12082a0;

    /* renamed from: b0  reason: collision with root package name */
    public int f12083b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f12084c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f12085d0;

    /* renamed from: e0  reason: collision with root package name */
    public final int f12086e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f12087f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f12088g0;

    /* renamed from: h0  reason: collision with root package name */
    public final boolean f12089h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f12090i0;

    /* renamed from: j0  reason: collision with root package name */
    public final boolean f12091j0;

    /* renamed from: k0  reason: collision with root package name */
    public final boolean f12092k0;

    /* renamed from: l0  reason: collision with root package name */
    public final boolean f12093l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f12094m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f12095n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f12096o0;

    /* renamed from: p0  reason: collision with root package name */
    public Behavior f12097p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f12098q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f12099r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f12100s0;

    /* renamed from: t0  reason: collision with root package name */
    public final a f12101t0;

    /* renamed from: u0  reason: collision with root package name */
    public final b f12102u0;

    /* loaded from: classes2.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            BottomAppBar bottomAppBar = BottomAppBar.this;
            if (!bottomAppBar.f12095n0) {
                bottomAppBar.D(bottomAppBar.f12083b0, bottomAppBar.f12096o0);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b implements j<FloatingActionButton> {
        public b() {
        }
    }

    /* loaded from: classes2.dex */
    public class c implements w.b {
        public c() {
        }

        @Override // w8.w.b
        public final s0 b(View view, s0 s0Var, w.c cVar) {
            boolean z10;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            if (bottomAppBar.f12091j0) {
                bottomAppBar.f12098q0 = s0Var.b();
            }
            boolean z11 = true;
            boolean z12 = false;
            if (bottomAppBar.f12092k0) {
                if (bottomAppBar.f12100s0 != s0Var.c()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                bottomAppBar.f12100s0 = s0Var.c();
            } else {
                z10 = false;
            }
            if (bottomAppBar.f12093l0) {
                if (bottomAppBar.f12099r0 == s0Var.d()) {
                    z11 = false;
                }
                bottomAppBar.f12099r0 = s0Var.d();
                z12 = z11;
            }
            if (z10 || z12) {
                Animator animator = bottomAppBar.f12082a0;
                if (animator != null) {
                    animator.cancel();
                }
                Animator animator2 = bottomAppBar.W;
                if (animator2 != null) {
                    animator2.cancel();
                }
                bottomAppBar.F();
                bottomAppBar.E();
            }
            return s0Var;
        }
    }

    /* loaded from: classes2.dex */
    public class d extends AnimatorListenerAdapter {
        public d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            int i10 = BottomAppBar.f12081v0;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.getClass();
            bottomAppBar.f12095n0 = false;
            bottomAppBar.f12082a0 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            int i10 = BottomAppBar.f12081v0;
            BottomAppBar.this.getClass();
        }
    }

    /* loaded from: classes2.dex */
    public class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ActionMenuView f12112a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f12113b;
        public final /* synthetic */ boolean c;

        public e(ActionMenuView actionMenuView, int i10, boolean z10) {
            this.f12112a = actionMenuView;
            this.f12113b = i10;
            this.c = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i10 = this.f12113b;
            boolean z10 = this.c;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            ActionMenuView actionMenuView = this.f12112a;
            actionMenuView.setTranslationX(bottomAppBar.A(actionMenuView, i10, z10));
        }
    }

    /* loaded from: classes2.dex */
    public static class f extends c1.a {
        public static final Parcelable.Creator<f> CREATOR = new a();
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f12115d;

        /* loaded from: classes2.dex */
        public class a implements Parcelable.ClassLoaderCreator<f> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new f[i10];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new f(parcel, null);
            }
        }

        public f(Toolbar.i iVar) {
            super(iVar);
        }

        @Override // c1.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f5506a, i10);
            parcel.writeInt(this.c);
            parcel.writeInt(this.f12115d ? 1 : 0);
        }

        public f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readInt();
            this.f12115d = parcel.readInt() != 0;
        }
    }

    public BottomAppBar(Context context) {
        this(context, null);
    }

    private ActionMenuView getActionMenuView() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.f12098q0;
    }

    private int getFabAlignmentAnimationDuration() {
        return x8.a.c(getContext(), R.attr.motionDurationLong2, OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return B(this.f12083b0);
    }

    private float getFabTranslationY() {
        int i10;
        if (this.f12085d0 == 1) {
            return -getTopEdgeTreatment().f19066d;
        }
        View z10 = z();
        if (z10 != null) {
            i10 = (-((getMeasuredHeight() + getBottomInset()) - z10.getMeasuredHeight())) / 2;
        } else {
            i10 = 0;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.f12100s0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.f12099r0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public j8.e getTopEdgeTreatment() {
        return (j8.e) this.V.f17164a.f17186a.f17219i;
    }

    public final int A(ActionMenuView actionMenuView, int i10, boolean z10) {
        int i11;
        int left;
        int i12;
        boolean z11;
        int i13 = 0;
        if (this.f12088g0 != 1 && (i10 != 1 || !z10)) {
            return 0;
        }
        boolean e10 = w.e(this);
        if (e10) {
            i11 = getMeasuredWidth();
        } else {
            i11 = 0;
        }
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if ((childAt.getLayoutParams() instanceof Toolbar.g) && (((Toolbar.g) childAt.getLayoutParams()).f20280a & 8388615) == 8388611) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (e10) {
                    i11 = Math.min(i11, childAt.getLeft());
                } else {
                    i11 = Math.max(i11, childAt.getRight());
                }
            }
        }
        if (e10) {
            left = actionMenuView.getRight();
        } else {
            left = actionMenuView.getLeft();
        }
        if (e10) {
            i12 = this.f12099r0;
        } else {
            i12 = -this.f12100s0;
        }
        if (getNavigationIcon() == null) {
            i13 = getResources().getDimensionPixelOffset(R.dimen.m3_bottomappbar_horizontal_padding);
            if (!e10) {
                i13 = -i13;
            }
        }
        return i11 - ((left + i12) + i13);
    }

    public final float B(int i10) {
        int i11;
        int i12;
        boolean e10 = w.e(this);
        int i13 = 1;
        if (i10 == 1) {
            View z10 = z();
            if (e10) {
                i11 = this.f12100s0;
            } else {
                i11 = this.f12099r0;
            }
            if (this.f12087f0 != -1 && z10 != null) {
                i12 = (z10.getMeasuredWidth() / 2) + this.f12087f0 + i11;
            } else {
                i12 = this.f12086e0 + i11;
            }
            int measuredWidth = (getMeasuredWidth() / 2) - i12;
            if (e10) {
                i13 = -1;
            }
            return measuredWidth * i13;
        }
        return 0.0f;
    }

    public final boolean C() {
        FloatingActionButton y10 = y();
        if (y10 != null && y10.j()) {
            return true;
        }
        return false;
    }

    public final void D(int i10, boolean z10) {
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        if (!f0.g.c(this)) {
            this.f12095n0 = false;
            int i11 = this.f12094m0;
            if (i11 != 0) {
                this.f12094m0 = 0;
                getMenu().clear();
                k(i11);
                return;
            }
            return;
        }
        Animator animator = this.f12082a0;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!C()) {
            i10 = 0;
            z10 = false;
        }
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            float fabAlignmentAnimationDuration = getFabAlignmentAnimationDuration();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
            ofFloat.setDuration(0.8f * fabAlignmentAnimationDuration);
            if (Math.abs(actionMenuView.getTranslationX() - A(actionMenuView, i10, z10)) > 1.0f) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                ofFloat2.setDuration(fabAlignmentAnimationDuration * 0.2f);
                ofFloat2.addListener(new j8.c(this, actionMenuView, i10, z10));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playSequentially(ofFloat2, ofFloat);
                arrayList.add(animatorSet);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                arrayList.add(ofFloat);
            }
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(arrayList);
        this.f12082a0 = animatorSet2;
        animatorSet2.addListener(new d());
        this.f12082a0.start();
    }

    public final void E() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null && this.f12082a0 == null) {
            actionMenuView.setAlpha(1.0f);
            if (!C()) {
                H(actionMenuView, 0, false, false);
            } else {
                H(actionMenuView, this.f12083b0, this.f12096o0, false);
            }
        }
    }

    public final void F() {
        float f10;
        getTopEdgeTreatment().f19067e = getFabTranslationX();
        h hVar = this.V;
        if (this.f12096o0 && C() && this.f12085d0 == 1) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        hVar.o(f10);
        View z10 = z();
        if (z10 != null) {
            z10.setTranslationY(getFabTranslationY());
            z10.setTranslationX(getFabTranslationX());
        }
    }

    public final void G(int i10) {
        float f10 = i10;
        if (f10 != getTopEdgeTreatment().c) {
            getTopEdgeTreatment().c = f10;
            this.V.invalidateSelf();
        }
    }

    public final void H(ActionMenuView actionMenuView, int i10, boolean z10, boolean z11) {
        e eVar = new e(actionMenuView, i10, z10);
        if (z11) {
            actionMenuView.post(eVar);
        } else {
            eVar.run();
        }
    }

    public ColorStateList getBackgroundTint() {
        return this.V.f17164a.f17190f;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().f19066d;
    }

    public int getFabAlignmentMode() {
        return this.f12083b0;
    }

    public int getFabAlignmentModeEndMargin() {
        return this.f12087f0;
    }

    public int getFabAnchorMode() {
        return this.f12085d0;
    }

    public int getFabAnimationMode() {
        return this.f12084c0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f19065b;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f19064a;
    }

    public boolean getHideOnScroll() {
        return this.f12090i0;
    }

    public int getMenuAlignmentMode() {
        return this.f12088g0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b.b.Y(this, this.V);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            Animator animator = this.f12082a0;
            if (animator != null) {
                animator.cancel();
            }
            Animator animator2 = this.W;
            if (animator2 != null) {
                animator2.cancel();
            }
            F();
            View z11 = z();
            if (z11 != null) {
                WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                if (f0.g.c(z11)) {
                    z11.post(new k(z11, 5));
                }
            }
        }
        E();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.f5506a);
        this.f12083b0 = fVar.c;
        this.f12096o0 = fVar.f12115d;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final Parcelable onSaveInstanceState() {
        f fVar = new f((Toolbar.i) super.onSaveInstanceState());
        fVar.c = this.f12083b0;
        fVar.f12115d = this.f12096o0;
        return fVar;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        a.b.h(this.V, colorStateList);
    }

    public void setCradleVerticalOffset(float f10) {
        if (f10 != getCradleVerticalOffset()) {
            j8.e topEdgeTreatment = getTopEdgeTreatment();
            if (f10 >= 0.0f) {
                topEdgeTreatment.f19066d = f10;
                this.V.invalidateSelf();
                F();
                return;
            }
            topEdgeTreatment.getClass();
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        h hVar = this.V;
        hVar.m(f10);
        int i10 = hVar.f17164a.f17201q - hVar.i();
        Behavior behavior = getBehavior();
        behavior.f12067h = i10;
        if (behavior.f12066g == 1) {
            setTranslationY(behavior.f12065f + i10);
        }
    }

    public void setFabAlignmentMode(int i10) {
        this.f12094m0 = 0;
        this.f12095n0 = true;
        D(i10, this.f12096o0);
        if (this.f12083b0 != i10) {
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            if (f0.g.c(this)) {
                Animator animator = this.W;
                if (animator != null) {
                    animator.cancel();
                }
                ArrayList arrayList = new ArrayList();
                if (this.f12084c0 == 1) {
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(y(), "translationX", B(i10));
                    ofFloat.setDuration(getFabAlignmentAnimationDuration());
                    arrayList.add(ofFloat);
                } else {
                    FloatingActionButton y10 = y();
                    if (y10 != null && !y10.i()) {
                        y10.h(new j8.b(this, i10), true);
                    }
                }
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(arrayList);
                animatorSet.setInterpolator(x8.a.d(getContext(), R.attr.motionEasingEmphasizedInterpolator, f8.b.f17141a));
                this.W = animatorSet;
                animatorSet.addListener(new j8.a(this));
                this.W.start();
            }
        }
        this.f12083b0 = i10;
    }

    public void setFabAlignmentModeEndMargin(int i10) {
        if (this.f12087f0 != i10) {
            this.f12087f0 = i10;
            F();
        }
    }

    public void setFabAnchorMode(int i10) {
        this.f12085d0 = i10;
        F();
        View z10 = z();
        if (z10 != null) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) z10.getLayoutParams();
            fVar.f3489d = 17;
            int i11 = this.f12085d0;
            if (i11 == 1) {
                fVar.f3489d = 49;
            }
            if (i11 == 0) {
                fVar.f3489d |= 80;
            }
            z10.requestLayout();
            this.V.invalidateSelf();
        }
    }

    public void setFabAnimationMode(int i10) {
        this.f12084c0 = i10;
    }

    public void setFabCornerSize(float f10) {
        if (f10 != getTopEdgeTreatment().f19068f) {
            getTopEdgeTreatment().f19068f = f10;
            this.V.invalidateSelf();
        }
    }

    public void setFabCradleMargin(float f10) {
        if (f10 != getFabCradleMargin()) {
            getTopEdgeTreatment().f19065b = f10;
            this.V.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f10) {
        if (f10 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().f19064a = f10;
            this.V.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z10) {
        this.f12090i0 = z10;
    }

    public void setMenuAlignmentMode(int i10) {
        if (this.f12088g0 != i10) {
            this.f12088g0 = i10;
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                H(actionMenuView, this.f12083b0, C(), false);
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.U != null) {
            drawable = drawable.mutate();
            a.b.g(drawable, this.U.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i10) {
        this.U = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public final FloatingActionButton y() {
        View z10 = z();
        if (z10 instanceof FloatingActionButton) {
            return (FloatingActionButton) z10;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View z() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            i0.a r2 = r0.f3468b
            java.lang.Object r2 = r2.f18403b
            y.i r2 = (y.i) r2
            java.lang.Object r2 = r2.getOrDefault(r4, r1)
            java.util.List r2 = (java.util.List) r2
            java.util.ArrayList r0 = r0.f3469d
            r0.clear()
            if (r2 == 0) goto L26
            r0.addAll(r2)
        L26:
            java.util.Iterator r0 = r0.iterator()
        L2a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L3e
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L2a
        L3e:
            return r2
        L3f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.z():android.view.View");
    }

    public BottomAppBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bottomAppBarStyle);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public Behavior getBehavior() {
        if (this.f12097p0 == null) {
            this.f12097p0 = new Behavior();
        }
        return this.f12097p0;
    }

    /* loaded from: classes2.dex */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: j  reason: collision with root package name */
        public final Rect f12103j;

        /* renamed from: k  reason: collision with root package name */
        public WeakReference<BottomAppBar> f12104k;

        /* renamed from: l  reason: collision with root package name */
        public int f12105l;

        /* renamed from: m  reason: collision with root package name */
        public final a f12106m;

        /* loaded from: classes2.dex */
        public class a implements View.OnLayoutChangeListener {
            public a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                Behavior behavior = Behavior.this;
                BottomAppBar bottomAppBar = behavior.f12104k.get();
                if (bottomAppBar != null && ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton))) {
                    int height = view.getHeight();
                    if (view instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                        int measuredWidth = floatingActionButton.getMeasuredWidth();
                        int measuredHeight = floatingActionButton.getMeasuredHeight();
                        Rect rect = behavior.f12103j;
                        rect.set(0, 0, measuredWidth, measuredHeight);
                        floatingActionButton.k(rect);
                        int height2 = rect.height();
                        bottomAppBar.G(height2);
                        bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().f17215e.a(new RectF(rect)));
                        height = height2;
                    }
                    CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
                    if (behavior.f12105l == 0) {
                        if (bottomAppBar.f12085d0 == 1) {
                            ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fab_bottom_margin) - ((view.getMeasuredHeight() - height) / 2));
                        }
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin = bottomAppBar.getLeftInset();
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin = bottomAppBar.getRightInset();
                        boolean e10 = w.e(view);
                        int i18 = bottomAppBar.f12086e0;
                        if (e10) {
                            ((ViewGroup.MarginLayoutParams) fVar).leftMargin += i18;
                        } else {
                            ((ViewGroup.MarginLayoutParams) fVar).rightMargin += i18;
                        }
                    }
                    int i19 = BottomAppBar.f12081v0;
                    bottomAppBar.F();
                    return;
                }
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
            this.f12106m = new a();
            this.f12103j = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.f12104k = new WeakReference<>(bottomAppBar);
            int i11 = BottomAppBar.f12081v0;
            View z10 = bottomAppBar.z();
            if (z10 != null) {
                WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                if (!f0.g.c(z10)) {
                    CoordinatorLayout.f fVar = (CoordinatorLayout.f) z10.getLayoutParams();
                    fVar.f3489d = 17;
                    int i12 = bottomAppBar.f12085d0;
                    if (i12 == 1) {
                        fVar.f3489d = 49;
                    }
                    if (i12 == 0) {
                        fVar.f3489d |= 80;
                    }
                    this.f12105l = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) z10.getLayoutParams())).bottomMargin;
                    if (z10 instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) z10;
                        if (bottomAppBar.f12085d0 == 0 && bottomAppBar.f12089h0) {
                            f0.i.s(floatingActionButton, 0.0f);
                            floatingActionButton.setCompatElevation(0.0f);
                        }
                        if (floatingActionButton.getShowMotionSpec() == null) {
                            floatingActionButton.setShowMotionSpecResource(R.animator.mtrl_fab_show_motion_spec);
                        }
                        if (floatingActionButton.getHideMotionSpec() == null) {
                            floatingActionButton.setHideMotionSpecResource(R.animator.mtrl_fab_hide_motion_spec);
                        }
                        floatingActionButton.d(bottomAppBar.f12101t0);
                        floatingActionButton.e(new j8.d(bottomAppBar));
                        floatingActionButton.f(bottomAppBar.f12102u0);
                    }
                    z10.addOnLayoutChangeListener(this.f12106m);
                    bottomAppBar.F();
                }
            }
            coordinatorLayout.u(bottomAppBar, i10);
            super.h(coordinatorLayout, bottomAppBar, i10);
            return false;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            if (bottomAppBar.getHideOnScroll() && super.p(coordinatorLayout, bottomAppBar, view2, view3, i10, i11)) {
                return true;
            }
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f12106m = new a();
            this.f12103j = new Rect();
        }
    }

    public BottomAppBar(Context context, AttributeSet attributeSet, int i10) {
        super(l9.a.a(context, attributeSet, i10, 2132018219), attributeSet, i10);
        h hVar = new h();
        this.V = hVar;
        this.f12094m0 = 0;
        this.f12095n0 = false;
        this.f12096o0 = true;
        this.f12101t0 = new a();
        this.f12102u0 = new b();
        Context context2 = getContext();
        TypedArray d10 = s.d(context2, attributeSet, e8.a.f16480e, i10, 2132018219, new int[0]);
        ColorStateList a10 = b9.c.a(context2, d10, 1);
        if (d10.hasValue(12)) {
            setNavigationIconTint(d10.getColor(12, -1));
        }
        int dimensionPixelSize = d10.getDimensionPixelSize(2, 0);
        this.f12083b0 = d10.getInt(3, 0);
        this.f12084c0 = d10.getInt(6, 0);
        this.f12085d0 = d10.getInt(5, 1);
        this.f12089h0 = d10.getBoolean(16, true);
        this.f12088g0 = d10.getInt(11, 0);
        this.f12090i0 = d10.getBoolean(10, false);
        this.f12091j0 = d10.getBoolean(13, false);
        this.f12092k0 = d10.getBoolean(14, false);
        this.f12093l0 = d10.getBoolean(15, false);
        this.f12087f0 = d10.getDimensionPixelOffset(4, -1);
        boolean z10 = d10.getBoolean(0, true);
        d10.recycle();
        this.f12086e0 = getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fabOffsetEndMode);
        j8.e eVar = new j8.e(d10.getDimensionPixelOffset(7, 0), d10.getDimensionPixelOffset(8, 0), d10.getDimensionPixelOffset(9, 0));
        m.a aVar = new m.a();
        aVar.f17230i = eVar;
        hVar.setShapeAppearanceModel(new m(aVar));
        if (z10) {
            hVar.r(2);
        } else {
            hVar.r(1);
            if (Build.VERSION.SDK_INT >= 28) {
                setOutlineAmbientShadowColor(0);
                setOutlineSpotShadowColor(0);
            }
        }
        hVar.p(Paint.Style.FILL);
        hVar.k(context2);
        setElevation(dimensionPixelSize);
        a.b.h(hVar, a10);
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        f0.d.q(this, hVar);
        c cVar = new c();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e8.a.f16501v, i10, 2132018219);
        boolean z11 = obtainStyledAttributes.getBoolean(3, false);
        boolean z12 = obtainStyledAttributes.getBoolean(4, false);
        boolean z13 = obtainStyledAttributes.getBoolean(5, false);
        obtainStyledAttributes.recycle();
        w.a(this, new v(z11, z12, z13, cVar));
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }
}
