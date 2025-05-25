package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.google.android.gms.common.api.Api;
import java.util.WeakHashMap;
import l.f;
import lib.zj.office.fc.hslf.record.SlideAtom;
import pdf.pdfreader.viewer.editor.free.R;
import x0.f0;
import x0.s0;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements w, x0.s, x0.q, x0.r {
    public static final int[] B = {R.attr.actionBarSize, 16842841};
    public final x0.t A;

    /* renamed from: a  reason: collision with root package name */
    public int f2170a;

    /* renamed from: b  reason: collision with root package name */
    public int f2171b;
    public ContentFrameLayout c;

    /* renamed from: d  reason: collision with root package name */
    public ActionBarContainer f2172d;

    /* renamed from: e  reason: collision with root package name */
    public x f2173e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f2174f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2175g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2176h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2177i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2178j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f2179k;

    /* renamed from: l  reason: collision with root package name */
    public int f2180l;

    /* renamed from: m  reason: collision with root package name */
    public int f2181m;

    /* renamed from: n  reason: collision with root package name */
    public final Rect f2182n;

    /* renamed from: o  reason: collision with root package name */
    public final Rect f2183o;

    /* renamed from: p  reason: collision with root package name */
    public final Rect f2184p;

    /* renamed from: q  reason: collision with root package name */
    public x0.s0 f2185q;

    /* renamed from: r  reason: collision with root package name */
    public x0.s0 f2186r;

    /* renamed from: s  reason: collision with root package name */
    public x0.s0 f2187s;

    /* renamed from: t  reason: collision with root package name */
    public x0.s0 f2188t;

    /* renamed from: u  reason: collision with root package name */
    public d f2189u;

    /* renamed from: v  reason: collision with root package name */
    public OverScroller f2190v;

    /* renamed from: w  reason: collision with root package name */
    public ViewPropertyAnimator f2191w;

    /* renamed from: x  reason: collision with root package name */
    public final a f2192x;

    /* renamed from: y  reason: collision with root package name */
    public final b f2193y;

    /* renamed from: z  reason: collision with root package name */
    public final c f2194z;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f2191w = null;
            actionBarOverlayLayout.f2179k = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f2191w = null;
            actionBarOverlayLayout.f2179k = false;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.q();
            actionBarOverlayLayout.f2191w = actionBarOverlayLayout.f2172d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f2192x);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.q();
            actionBarOverlayLayout.f2191w = actionBarOverlayLayout.f2172d.animate().translationY(-actionBarOverlayLayout.f2172d.getHeight()).setListener(actionBarOverlayLayout.f2192x);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
    }

    /* loaded from: classes.dex */
    public static class e extends ViewGroup.MarginLayoutParams {
        public e() {
            super(-1, -1);
        }
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public static boolean p(FrameLayout frameLayout, Rect rect, boolean z10) {
        boolean z11;
        e eVar = (e) frameLayout.getLayoutParams();
        int i10 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
        int i11 = rect.left;
        if (i10 != i11) {
            ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i11;
            z11 = true;
        } else {
            z11 = false;
        }
        int i12 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        int i13 = rect.top;
        if (i12 != i13) {
            ((ViewGroup.MarginLayoutParams) eVar).topMargin = i13;
            z11 = true;
        }
        int i14 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
        int i15 = rect.right;
        if (i14 != i15) {
            ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i15;
            z11 = true;
        }
        if (z10) {
            int i16 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            int i17 = rect.bottom;
            if (i16 != i17) {
                ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i17;
                return true;
            }
        }
        return z11;
    }

    @Override // androidx.appcompat.widget.w
    public final boolean a() {
        s();
        return this.f2173e.a();
    }

    @Override // androidx.appcompat.widget.w
    public final void b() {
        s();
        this.f2173e.b();
    }

    @Override // androidx.appcompat.widget.w
    public final void c(androidx.appcompat.view.menu.h hVar, f.d dVar) {
        s();
        this.f2173e.c(hVar, dVar);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // androidx.appcompat.widget.w
    public final boolean d() {
        s();
        return this.f2173e.d();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i10;
        super.draw(canvas);
        if (this.f2174f != null && !this.f2175g) {
            if (this.f2172d.getVisibility() == 0) {
                i10 = (int) (this.f2172d.getTranslationY() + this.f2172d.getBottom() + 0.5f);
            } else {
                i10 = 0;
            }
            this.f2174f.setBounds(0, i10, getWidth(), this.f2174f.getIntrinsicHeight() + i10);
            this.f2174f.draw(canvas);
        }
    }

    @Override // androidx.appcompat.widget.w
    public final boolean e() {
        s();
        return this.f2173e.e();
    }

    @Override // androidx.appcompat.widget.w
    public final boolean f() {
        s();
        return this.f2173e.f();
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.w
    public final boolean g() {
        s();
        return this.f2173e.g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f2172d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        x0.t tVar = this.A;
        return tVar.f31526b | tVar.f31525a;
    }

    public CharSequence getTitle() {
        s();
        return this.f2173e.getTitle();
    }

    @Override // androidx.appcompat.widget.w
    public final void h(int i10) {
        s();
        if (i10 != 2) {
            if (i10 != 5) {
                if (i10 == 109) {
                    setOverlayMode(true);
                    return;
                }
                return;
            }
            this.f2173e.r();
            return;
        }
        this.f2173e.q();
    }

    @Override // androidx.appcompat.widget.w
    public final void i() {
        s();
        this.f2173e.h();
    }

    @Override // x0.r
    public final void j(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        k(view, i10, i11, i12, i13, i14);
    }

    @Override // x0.q
    public final void k(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    @Override // x0.q
    public final boolean l(View view, View view2, int i10, int i11) {
        if (i11 == 0 && onStartNestedScroll(view, view2, i10)) {
            return true;
        }
        return false;
    }

    @Override // x0.q
    public final void m(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // x0.q
    public final void n(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // x0.q
    public final void o(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        s();
        x0.s0 i10 = x0.s0.i(this, windowInsets);
        boolean p10 = p(this.f2172d, new Rect(i10.c(), i10.e(), i10.d(), i10.b()), false);
        WeakHashMap<View, x0.n0> weakHashMap = x0.f0.f31435a;
        Rect rect = this.f2182n;
        f0.i.b(this, i10, rect);
        int i11 = rect.left;
        int i12 = rect.top;
        int i13 = rect.right;
        int i14 = rect.bottom;
        s0.k kVar = i10.f31498a;
        x0.s0 l10 = kVar.l(i11, i12, i13, i14);
        this.f2185q = l10;
        boolean z10 = true;
        if (!this.f2186r.equals(l10)) {
            this.f2186r = this.f2185q;
            p10 = true;
        }
        Rect rect2 = this.f2183o;
        if (!rect2.equals(rect)) {
            rect2.set(rect);
        } else {
            z10 = p10;
        }
        if (z10) {
            requestLayout();
        }
        return kVar.a().f31498a.c().f31498a.b().h();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        r(getContext());
        WeakHashMap<View, x0.n0> weakHashMap = x0.f0.f31435a;
        f0.h.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i16 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int measuredHeight;
        s0.e bVar;
        s();
        measureChildWithMargins(this.f2172d, i10, 0, i11, 0);
        e eVar = (e) this.f2172d.getLayoutParams();
        int max = Math.max(0, this.f2172d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int max2 = Math.max(0, this.f2172d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f2172d.getMeasuredState());
        WeakHashMap<View, x0.n0> weakHashMap = x0.f0.f31435a;
        if ((f0.d.g(this) & 256) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            measuredHeight = this.f2170a;
            if (this.f2177i && this.f2172d.getTabContainer() != null) {
                measuredHeight += this.f2170a;
            }
        } else {
            measuredHeight = this.f2172d.getVisibility() != 8 ? this.f2172d.getMeasuredHeight() : 0;
        }
        Rect rect = this.f2182n;
        Rect rect2 = this.f2184p;
        rect2.set(rect);
        x0.s0 s0Var = this.f2185q;
        this.f2187s = s0Var;
        if (!this.f2176h && !z10) {
            rect2.top += measuredHeight;
            rect2.bottom += 0;
            this.f2187s = s0Var.f31498a.l(0, measuredHeight, 0, 0);
        } else {
            o0.b b10 = o0.b.b(s0Var.c(), this.f2187s.e() + measuredHeight, this.f2187s.d(), this.f2187s.b() + 0);
            x0.s0 s0Var2 = this.f2187s;
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 30) {
                bVar = new s0.d(s0Var2);
            } else if (i12 >= 29) {
                bVar = new s0.c(s0Var2);
            } else {
                bVar = new s0.b(s0Var2);
            }
            bVar.g(b10);
            this.f2187s = bVar.b();
        }
        p(this.c, rect2, true);
        if (!this.f2188t.equals(this.f2187s)) {
            x0.s0 s0Var3 = this.f2187s;
            this.f2188t = s0Var3;
            x0.f0.b(this.c, s0Var3);
        }
        measureChildWithMargins(this.c, i10, 0, i11, 0);
        e eVar2 = (e) this.c.getLayoutParams();
        int max3 = Math.max(max, this.c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int max4 = Math.max(max2, this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i10, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i11, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        boolean z11 = false;
        if (!this.f2178j || !z10) {
            return false;
        }
        this.f2190v.fling(0, 0, 0, (int) f11, 0, 0, SlideAtom.USES_MASTER_SLIDE_ID, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        if (this.f2190v.getFinalY() > this.f2172d.getHeight()) {
            z11 = true;
        }
        if (z11) {
            q();
            this.f2194z.run();
        } else {
            q();
            this.f2193y.run();
        }
        this.f2179k = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.f2180l + i11;
        this.f2180l = i14;
        setActionBarHideOffset(i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        l.y yVar;
        q.g gVar;
        this.A.a(i10, 0);
        this.f2180l = getActionBarHideOffset();
        q();
        d dVar = this.f2189u;
        if (dVar != null && (gVar = (yVar = (l.y) dVar).f20422u) != null) {
            gVar.a();
            yVar.f20422u = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) != 0 && this.f2172d.getVisibility() == 0) {
            return this.f2178j;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (this.f2178j && !this.f2179k) {
            if (this.f2180l <= this.f2172d.getHeight()) {
                q();
                postDelayed(this.f2193y, 600L);
                return;
            }
            q();
            postDelayed(this.f2194z, 600L);
        }
    }

    @Override // android.view.View
    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i10) {
        boolean z10;
        boolean z11;
        super.onWindowSystemUiVisibilityChanged(i10);
        s();
        int i11 = this.f2181m ^ i10;
        this.f2181m = i10;
        if ((i10 & 4) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((i10 & 256) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        d dVar = this.f2189u;
        if (dVar != null) {
            ((l.y) dVar).f20418q = !z11;
            if (!z10 && z11) {
                l.y yVar = (l.y) dVar;
                if (!yVar.f20419r) {
                    yVar.f20419r = true;
                    yVar.v(true);
                }
            } else {
                l.y yVar2 = (l.y) dVar;
                if (yVar2.f20419r) {
                    yVar2.f20419r = false;
                    yVar2.v(true);
                }
            }
        }
        if ((i11 & 256) != 0 && this.f2189u != null) {
            WeakHashMap<View, x0.n0> weakHashMap = x0.f0.f31435a;
            f0.h.c(this);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f2171b = i10;
        d dVar = this.f2189u;
        if (dVar != null) {
            ((l.y) dVar).f20417p = i10;
        }
    }

    public final void q() {
        removeCallbacks(this.f2193y);
        removeCallbacks(this.f2194z);
        ViewPropertyAnimator viewPropertyAnimator = this.f2191w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void r(Context context) {
        boolean z10;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(B);
        boolean z11 = false;
        this.f2170a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f2174f = drawable;
        if (drawable == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        setWillNotDraw(z10);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z11 = true;
        }
        this.f2175g = z11;
        this.f2190v = new OverScroller(context);
    }

    public final void s() {
        x wrapper;
        if (this.c == null) {
            this.c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f2172d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof x) {
                wrapper = (x) findViewById;
            } else if (findViewById instanceof Toolbar) {
                wrapper = ((Toolbar) findViewById).getWrapper();
            } else {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
            }
            this.f2173e = wrapper;
        }
    }

    public void setActionBarHideOffset(int i10) {
        q();
        this.f2172d.setTranslationY(-Math.max(0, Math.min(i10, this.f2172d.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.f2189u = dVar;
        if (getWindowToken() != null) {
            ((l.y) this.f2189u).f20417p = this.f2171b;
            int i10 = this.f2181m;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                WeakHashMap<View, x0.n0> weakHashMap = x0.f0.f31435a;
                f0.h.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.f2177i = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.f2178j) {
            this.f2178j = z10;
            if (!z10) {
                q();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i10) {
        s();
        this.f2173e.setIcon(i10);
    }

    public void setLogo(int i10) {
        s();
        this.f2173e.m(i10);
    }

    public void setOverlayMode(boolean z10) {
        boolean z11;
        this.f2176h = z10;
        if (z10 && getContext().getApplicationInfo().targetSdkVersion < 19) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f2175g = z11;
    }

    @Override // androidx.appcompat.widget.w
    public void setWindowCallback(Window.Callback callback) {
        s();
        this.f2173e.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.w
    public void setWindowTitle(CharSequence charSequence) {
        s();
        this.f2173e.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2171b = 0;
        this.f2182n = new Rect();
        this.f2183o = new Rect();
        this.f2184p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        x0.s0 s0Var = x0.s0.f31497b;
        this.f2185q = s0Var;
        this.f2186r = s0Var;
        this.f2187s = s0Var;
        this.f2188t = s0Var;
        this.f2192x = new a();
        this.f2193y = new b();
        this.f2194z = new c();
        r(context);
        this.A = new x0.t();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        s();
        this.f2173e.setIcon(drawable);
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i10) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }
}
