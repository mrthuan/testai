package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.activity.r;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import g8.e;
import g8.i;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p0.a;
import pdf.pdfreader.viewer.editor.free.R;
import w8.s;
import x0.f0;
import x0.n0;
import x0.s0;
import x0.u;

/* loaded from: classes2.dex */
public class CollapsingToolbarLayout extends FrameLayout {
    public s0 A;
    public int B;
    public boolean C;
    public int D;
    public boolean E;

    /* renamed from: a  reason: collision with root package name */
    public boolean f12021a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12022b;
    public ViewGroup c;

    /* renamed from: d  reason: collision with root package name */
    public View f12023d;

    /* renamed from: e  reason: collision with root package name */
    public View f12024e;

    /* renamed from: f  reason: collision with root package name */
    public int f12025f;

    /* renamed from: g  reason: collision with root package name */
    public int f12026g;

    /* renamed from: h  reason: collision with root package name */
    public int f12027h;

    /* renamed from: i  reason: collision with root package name */
    public int f12028i;

    /* renamed from: j  reason: collision with root package name */
    public final Rect f12029j;

    /* renamed from: k  reason: collision with root package name */
    public final com.google.android.material.internal.a f12030k;

    /* renamed from: l  reason: collision with root package name */
    public final t8.a f12031l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f12032m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f12033n;

    /* renamed from: o  reason: collision with root package name */
    public Drawable f12034o;

    /* renamed from: p  reason: collision with root package name */
    public Drawable f12035p;

    /* renamed from: q  reason: collision with root package name */
    public int f12036q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f12037r;

    /* renamed from: s  reason: collision with root package name */
    public ValueAnimator f12038s;

    /* renamed from: t  reason: collision with root package name */
    public long f12039t;

    /* renamed from: u  reason: collision with root package name */
    public final TimeInterpolator f12040u;

    /* renamed from: v  reason: collision with root package name */
    public final TimeInterpolator f12041v;

    /* renamed from: w  reason: collision with root package name */
    public int f12042w;

    /* renamed from: x  reason: collision with root package name */
    public c f12043x;

    /* renamed from: y  reason: collision with root package name */
    public int f12044y;

    /* renamed from: z  reason: collision with root package name */
    public int f12045z;

    /* loaded from: classes2.dex */
    public class a implements u {
        public a() {
        }

        @Override // x0.u
        public final s0 m(View view, s0 s0Var) {
            s0 s0Var2;
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.getClass();
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            if (f0.d.b(collapsingToolbarLayout)) {
                s0Var2 = s0Var;
            } else {
                s0Var2 = null;
            }
            if (!w0.b.a(collapsingToolbarLayout.A, s0Var2)) {
                collapsingToolbarLayout.A = s0Var2;
                collapsingToolbarLayout.requestLayout();
            }
            return s0Var.f31498a.c();
        }
    }

    /* loaded from: classes2.dex */
    public class c implements AppBarLayout.g {
        public c() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.b
        public final void a(AppBarLayout appBarLayout, int i10) {
            int i11;
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.f12044y = i10;
            s0 s0Var = collapsingToolbarLayout.A;
            if (s0Var != null) {
                i11 = s0Var.e();
            } else {
                i11 = 0;
            }
            int childCount = collapsingToolbarLayout.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = collapsingToolbarLayout.getChildAt(i12);
                b bVar = (b) childAt.getLayoutParams();
                i b10 = CollapsingToolbarLayout.b(childAt);
                int i13 = bVar.f12047a;
                if (i13 != 1) {
                    if (i13 == 2) {
                        b10.b(Math.round((-i10) * bVar.f12048b));
                    }
                } else {
                    b10.b(com.google.android.play.core.assetpacks.c.n(-i10, 0, ((collapsingToolbarLayout.getHeight() - CollapsingToolbarLayout.b(childAt).f17694b) - childAt.getHeight()) - ((FrameLayout.LayoutParams) ((b) childAt.getLayoutParams())).bottomMargin));
                }
            }
            collapsingToolbarLayout.d();
            if (collapsingToolbarLayout.f12035p != null && i11 > 0) {
                WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                f0.d.k(collapsingToolbarLayout);
            }
            int height = collapsingToolbarLayout.getHeight();
            WeakHashMap<View, n0> weakHashMap2 = f0.f31435a;
            int d10 = (height - f0.d.d(collapsingToolbarLayout)) - i11;
            float scrimVisibleHeightTrigger = height - collapsingToolbarLayout.getScrimVisibleHeightTrigger();
            float f10 = d10;
            float min = Math.min(1.0f, scrimVisibleHeightTrigger / f10);
            com.google.android.material.internal.a aVar = collapsingToolbarLayout.f12030k;
            aVar.f12636d = min;
            aVar.f12638e = r.l(1.0f, min, 0.5f, min);
            aVar.f12640f = collapsingToolbarLayout.f12044y + d10;
            aVar.p(Math.abs(i10) / f10);
        }
    }

    /* loaded from: classes2.dex */
    public interface d {
    }

    public CollapsingToolbarLayout(Context context) {
        this(context, null);
    }

    public static i b(View view) {
        i iVar = (i) view.getTag(R.id.view_offset_helper);
        if (iVar == null) {
            i iVar2 = new i(view);
            view.setTag(R.id.view_offset_helper, iVar2);
            return iVar2;
        }
        return iVar;
    }

    public final void a() {
        boolean z10;
        if (!this.f12021a) {
            return;
        }
        ViewGroup viewGroup = null;
        this.c = null;
        this.f12023d = null;
        int i10 = this.f12022b;
        if (i10 != -1) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById(i10);
            this.c = viewGroup2;
            if (viewGroup2 != null) {
                ViewParent parent = viewGroup2.getParent();
                View view = viewGroup2;
                while (parent != this && parent != null) {
                    if (parent instanceof View) {
                        view = (View) parent;
                    }
                    parent = parent.getParent();
                    view = view;
                }
                this.f12023d = view;
            }
        }
        if (this.c == null) {
            int childCount = getChildCount();
            int i11 = 0;
            while (true) {
                if (i11 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i11);
                if (!(childAt instanceof Toolbar) && !(childAt instanceof android.widget.Toolbar)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    viewGroup = (ViewGroup) childAt;
                    break;
                }
                i11++;
            }
            this.c = viewGroup;
        }
        c();
        this.f12021a = false;
    }

    public final void c() {
        View view;
        if (!this.f12032m && (view = this.f12024e) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f12024e);
            }
        }
        if (this.f12032m && this.c != null) {
            if (this.f12024e == null) {
                this.f12024e = new View(getContext());
            }
            if (this.f12024e.getParent() == null) {
                this.c.addView(this.f12024e, -1, -1);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    public final void d() {
        boolean z10;
        if (this.f12034o != null || this.f12035p != null) {
            if (getHeight() + this.f12044y < getScrimVisibleHeightTrigger()) {
                z10 = true;
            } else {
                z10 = false;
            }
            setScrimsShown(z10);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i10;
        Drawable drawable;
        super.draw(canvas);
        a();
        if (this.c == null && (drawable = this.f12034o) != null && this.f12036q > 0) {
            drawable.mutate().setAlpha(this.f12036q);
            this.f12034o.draw(canvas);
        }
        if (this.f12032m && this.f12033n) {
            ViewGroup viewGroup = this.c;
            com.google.android.material.internal.a aVar = this.f12030k;
            if (viewGroup != null && this.f12034o != null && this.f12036q > 0) {
                boolean z10 = true;
                if (this.f12045z != 1) {
                    z10 = false;
                }
                if (z10 && aVar.f12633b < aVar.f12638e) {
                    int save = canvas.save();
                    canvas.clipRect(this.f12034o.getBounds(), Region.Op.DIFFERENCE);
                    aVar.d(canvas);
                    canvas.restoreToCount(save);
                }
            }
            aVar.d(canvas);
        }
        if (this.f12035p != null && this.f12036q > 0) {
            s0 s0Var = this.A;
            if (s0Var != null) {
                i10 = s0Var.e();
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                this.f12035p.setBounds(0, -this.f12044y, getWidth(), i10 - this.f12044y);
                this.f12035p.mutate().setAlpha(this.f12036q);
                this.f12035p.draw(canvas);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0018, code lost:
        r3 = true;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean drawChild(android.graphics.Canvas r7, android.view.View r8, long r9) {
        /*
            r6 = this;
            android.graphics.drawable.Drawable r0 = r6.f12034o
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L4d
            int r3 = r6.f12036q
            if (r3 <= 0) goto L4d
            android.view.View r3 = r6.f12023d
            if (r3 == 0) goto L14
            if (r3 != r6) goto L11
            goto L14
        L11:
            if (r8 != r3) goto L1a
            goto L18
        L14:
            android.view.ViewGroup r3 = r6.c
            if (r8 != r3) goto L1a
        L18:
            r3 = r1
            goto L1b
        L1a:
            r3 = r2
        L1b:
            if (r3 == 0) goto L4d
            int r3 = r6.getWidth()
            int r4 = r6.getHeight()
            int r5 = r6.f12045z
            if (r5 != r1) goto L2b
            r5 = r1
            goto L2c
        L2b:
            r5 = r2
        L2c:
            if (r5 == 0) goto L38
            if (r8 == 0) goto L38
            boolean r5 = r6.f12032m
            if (r5 == 0) goto L38
            int r4 = r8.getBottom()
        L38:
            r0.setBounds(r2, r2, r3, r4)
            android.graphics.drawable.Drawable r0 = r6.f12034o
            android.graphics.drawable.Drawable r0 = r0.mutate()
            int r3 = r6.f12036q
            r0.setAlpha(r3)
            android.graphics.drawable.Drawable r0 = r6.f12034o
            r0.draw(r7)
            r0 = r1
            goto L4e
        L4d:
            r0 = r2
        L4e:
            boolean r7 = super.drawChild(r7, r8, r9)
            if (r7 != 0) goto L58
            if (r0 == 0) goto L57
            goto L58
        L57:
            r1 = r2
        L58:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f12035p;
        boolean z10 = false;
        if (drawable != null && drawable.isStateful()) {
            z10 = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f12034o;
        if (drawable2 != null && drawable2.isStateful()) {
            z10 |= drawable2.setState(drawableState);
        }
        com.google.android.material.internal.a aVar = this.f12030k;
        if (aVar != null) {
            z10 |= aVar.r(drawableState);
        }
        if (z10) {
            invalidate();
        }
    }

    public final void e(int i10, int i11, int i12, int i13, boolean z10) {
        View view;
        boolean z11;
        boolean z12;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z13;
        int i19;
        int i20;
        if (this.f12032m && (view = this.f12024e) != null) {
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            boolean z14 = false;
            if (f0.g.b(view) && this.f12024e.getVisibility() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f12033n = z11;
            if (z11 || z10) {
                if (f0.e.d(this) == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                View view2 = this.f12023d;
                if (view2 == null) {
                    view2 = this.c;
                }
                int height = ((getHeight() - b(view2).f17694b) - view2.getHeight()) - ((FrameLayout.LayoutParams) ((b) view2.getLayoutParams())).bottomMargin;
                View view3 = this.f12024e;
                Rect rect = this.f12029j;
                w8.c.a(this, view3, rect);
                ViewGroup viewGroup = this.c;
                if (viewGroup instanceof Toolbar) {
                    Toolbar toolbar = (Toolbar) viewGroup;
                    i15 = toolbar.getTitleMarginStart();
                    i16 = toolbar.getTitleMarginEnd();
                    i17 = toolbar.getTitleMarginTop();
                    i14 = toolbar.getTitleMarginBottom();
                } else if (Build.VERSION.SDK_INT >= 24 && (viewGroup instanceof android.widget.Toolbar)) {
                    android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
                    i15 = toolbar2.getTitleMarginStart();
                    i16 = toolbar2.getTitleMarginEnd();
                    i17 = toolbar2.getTitleMarginTop();
                    i14 = toolbar2.getTitleMarginBottom();
                } else {
                    i14 = 0;
                    i15 = 0;
                    i16 = 0;
                    i17 = 0;
                }
                int i21 = rect.left;
                if (z12) {
                    i18 = i16;
                } else {
                    i18 = i15;
                }
                int i22 = i21 + i18;
                int i23 = rect.top + height + i17;
                int i24 = rect.right;
                if (!z12) {
                    i15 = i16;
                }
                int i25 = i24 - i15;
                int i26 = (rect.bottom + height) - i14;
                com.google.android.material.internal.a aVar = this.f12030k;
                Rect rect2 = aVar.f12644h;
                if (rect2.left == i22 && rect2.top == i23 && rect2.right == i25 && rect2.bottom == i26) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13) {
                    rect2.set(i22, i23, i25, i26);
                    aVar.S = true;
                }
                if (z12) {
                    i19 = this.f12027h;
                } else {
                    i19 = this.f12025f;
                }
                int i27 = rect.top + this.f12026g;
                int i28 = i12 - i10;
                if (z12) {
                    i20 = this.f12025f;
                } else {
                    i20 = this.f12027h;
                }
                int i29 = i28 - i20;
                int i30 = (i13 - i11) - this.f12028i;
                Rect rect3 = aVar.f12642g;
                if (rect3.left == i19 && rect3.top == i27 && rect3.right == i29 && rect3.bottom == i30) {
                    z14 = true;
                }
                if (!z14) {
                    rect3.set(i19, i27, i29, i30);
                    aVar.S = true;
                }
                aVar.i(z10);
            }
        }
    }

    public final void f() {
        CharSequence charSequence;
        if (this.c != null && this.f12032m && TextUtils.isEmpty(this.f12030k.G)) {
            ViewGroup viewGroup = this.c;
            if (viewGroup instanceof Toolbar) {
                charSequence = ((Toolbar) viewGroup).getTitle();
            } else if (viewGroup instanceof android.widget.Toolbar) {
                charSequence = ((android.widget.Toolbar) viewGroup).getTitle();
            } else {
                charSequence = null;
            }
            setTitle(charSequence);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new b();
    }

    public int getCollapsedTitleGravity() {
        return this.f12030k.f12650k;
    }

    public float getCollapsedTitleTextSize() {
        return this.f12030k.f12654m;
    }

    public Typeface getCollapsedTitleTypeface() {
        Typeface typeface = this.f12030k.f12669w;
        if (typeface == null) {
            return Typeface.DEFAULT;
        }
        return typeface;
    }

    public Drawable getContentScrim() {
        return this.f12034o;
    }

    public int getExpandedTitleGravity() {
        return this.f12030k.f12648j;
    }

    public int getExpandedTitleMarginBottom() {
        return this.f12028i;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f12027h;
    }

    public int getExpandedTitleMarginStart() {
        return this.f12025f;
    }

    public int getExpandedTitleMarginTop() {
        return this.f12026g;
    }

    public float getExpandedTitleTextSize() {
        return this.f12030k.f12652l;
    }

    public Typeface getExpandedTitleTypeface() {
        Typeface typeface = this.f12030k.f12672z;
        if (typeface == null) {
            return Typeface.DEFAULT;
        }
        return typeface;
    }

    public int getHyphenationFrequency() {
        return this.f12030k.f12663q0;
    }

    public int getLineCount() {
        StaticLayout staticLayout = this.f12030k.f12647i0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    public float getLineSpacingAdd() {
        return this.f12030k.f12647i0.getSpacingAdd();
    }

    public float getLineSpacingMultiplier() {
        return this.f12030k.f12647i0.getSpacingMultiplier();
    }

    public int getMaxLines() {
        return this.f12030k.f12657n0;
    }

    public int getScrimAlpha() {
        return this.f12036q;
    }

    public long getScrimAnimationDuration() {
        return this.f12039t;
    }

    public int getScrimVisibleHeightTrigger() {
        int i10;
        int i11 = this.f12042w;
        if (i11 >= 0) {
            return i11 + this.B + this.D;
        }
        s0 s0Var = this.A;
        if (s0Var != null) {
            i10 = s0Var.e();
        } else {
            i10 = 0;
        }
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        int d10 = f0.d.d(this);
        if (d10 > 0) {
            return Math.min((d10 * 2) + i10, getHeight());
        }
        return getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.f12035p;
    }

    public CharSequence getTitle() {
        if (this.f12032m) {
            return this.f12030k.G;
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.f12045z;
    }

    public TimeInterpolator getTitlePositionInterpolator() {
        return this.f12030k.V;
    }

    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.f12030k.F;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            boolean z10 = true;
            if (this.f12045z != 1) {
                z10 = false;
            }
            if (z10) {
                appBarLayout.setLiftOnScroll(false);
            }
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            setFitsSystemWindows(f0.d.b(appBarLayout));
            if (this.f12043x == null) {
                this.f12043x = new c();
            }
            appBarLayout.a(this.f12043x);
            f0.h.c(this);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f12030k.h(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        ViewParent parent = getParent();
        c cVar = this.f12043x;
        if (cVar != null && (parent instanceof AppBarLayout) && (arrayList = ((AppBarLayout) parent).f11988h) != null) {
            arrayList.remove(cVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        s0 s0Var = this.A;
        if (s0Var != null) {
            int e10 = s0Var.e();
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                if (!f0.d.b(childAt) && childAt.getTop() < e10) {
                    childAt.offsetTopAndBottom(e10);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i15 = 0; i15 < childCount2; i15++) {
            i b10 = b(getChildAt(i15));
            View view = b10.f17693a;
            b10.f17694b = view.getTop();
            b10.c = view.getLeft();
        }
        e(i10, i11, i12, i13, false);
        f();
        d();
        int childCount3 = getChildCount();
        for (int i16 = 0; i16 < childCount3; i16++) {
            b(getChildAt(i16)).a();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int measuredHeight;
        int measuredHeight2;
        a();
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        s0 s0Var = this.A;
        if (s0Var != null) {
            i12 = s0Var.e();
        } else {
            i12 = 0;
        }
        if ((mode == 0 || this.C) && i12 > 0) {
            this.B = i12;
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + i12, 1073741824));
        }
        if (this.E) {
            com.google.android.material.internal.a aVar = this.f12030k;
            if (aVar.f12657n0 > 1) {
                f();
                e(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
                int i13 = aVar.f12660p;
                if (i13 > 1) {
                    TextPaint textPaint = aVar.U;
                    textPaint.setTextSize(aVar.f12652l);
                    textPaint.setTypeface(aVar.f12672z);
                    textPaint.setLetterSpacing(aVar.f12643g0);
                    int i14 = i13 - 1;
                    this.D = i14 * Math.round(textPaint.descent() + (-textPaint.ascent()));
                    super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.D, 1073741824));
                }
            }
        }
        ViewGroup viewGroup = this.c;
        if (viewGroup != null) {
            View view = this.f12023d;
            if (view != null && view != this) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    measuredHeight2 = view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                } else {
                    measuredHeight2 = view.getMeasuredHeight();
                }
                setMinimumHeight(measuredHeight2);
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                measuredHeight = viewGroup.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
            } else {
                measuredHeight = viewGroup.getMeasuredHeight();
            }
            setMinimumHeight(measuredHeight);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Drawable drawable = this.f12034o;
        if (drawable != null) {
            ViewGroup viewGroup = this.c;
            boolean z10 = true;
            if (this.f12045z != 1) {
                z10 = false;
            }
            if (z10 && viewGroup != null && this.f12032m) {
                i11 = viewGroup.getBottom();
            }
            drawable.setBounds(0, 0, i10, i11);
        }
    }

    public void setCollapsedTitleGravity(int i10) {
        this.f12030k.l(i10);
    }

    public void setCollapsedTitleTextAppearance(int i10) {
        this.f12030k.k(i10);
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        com.google.android.material.internal.a aVar = this.f12030k;
        if (aVar.f12658o != colorStateList) {
            aVar.f12658o = colorStateList;
            aVar.i(false);
        }
    }

    public void setCollapsedTitleTextSize(float f10) {
        com.google.android.material.internal.a aVar = this.f12030k;
        if (aVar.f12654m != f10) {
            aVar.f12654m = f10;
            aVar.i(false);
        }
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        com.google.android.material.internal.a aVar = this.f12030k;
        if (aVar.m(typeface)) {
            aVar.i(false);
        }
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.f12034o;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f12034o = drawable3;
            if (drawable3 != null) {
                int width = getWidth();
                int height = getHeight();
                ViewGroup viewGroup = this.c;
                boolean z10 = true;
                if (this.f12045z != 1) {
                    z10 = false;
                }
                if (z10 && viewGroup != null && this.f12032m) {
                    height = viewGroup.getBottom();
                }
                drawable3.setBounds(0, 0, width, height);
                this.f12034o.setCallback(this);
                this.f12034o.setAlpha(this.f12036q);
            }
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            f0.d.k(this);
        }
    }

    public void setContentScrimColor(int i10) {
        setContentScrim(new ColorDrawable(i10));
    }

    public void setContentScrimResource(int i10) {
        setContentScrim(androidx.core.content.a.getDrawable(getContext(), i10));
    }

    public void setExpandedTitleColor(int i10) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setExpandedTitleGravity(int i10) {
        com.google.android.material.internal.a aVar = this.f12030k;
        if (aVar.f12648j != i10) {
            aVar.f12648j = i10;
            aVar.i(false);
        }
    }

    public void setExpandedTitleMarginBottom(int i10) {
        this.f12028i = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i10) {
        this.f12027h = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i10) {
        this.f12025f = i10;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i10) {
        this.f12026g = i10;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i10) {
        this.f12030k.n(i10);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        com.google.android.material.internal.a aVar = this.f12030k;
        if (aVar.f12656n != colorStateList) {
            aVar.f12656n = colorStateList;
            aVar.i(false);
        }
    }

    public void setExpandedTitleTextSize(float f10) {
        com.google.android.material.internal.a aVar = this.f12030k;
        if (aVar.f12652l != f10) {
            aVar.f12652l = f10;
            aVar.i(false);
        }
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        com.google.android.material.internal.a aVar = this.f12030k;
        if (aVar.o(typeface)) {
            aVar.i(false);
        }
    }

    public void setExtraMultilineHeightEnabled(boolean z10) {
        this.E = z10;
    }

    public void setForceApplySystemWindowInsetTop(boolean z10) {
        this.C = z10;
    }

    public void setHyphenationFrequency(int i10) {
        this.f12030k.f12663q0 = i10;
    }

    public void setLineSpacingAdd(float f10) {
        this.f12030k.f12659o0 = f10;
    }

    public void setLineSpacingMultiplier(float f10) {
        this.f12030k.f12661p0 = f10;
    }

    public void setMaxLines(int i10) {
        com.google.android.material.internal.a aVar = this.f12030k;
        if (i10 != aVar.f12657n0) {
            aVar.f12657n0 = i10;
            Bitmap bitmap = aVar.K;
            if (bitmap != null) {
                bitmap.recycle();
                aVar.K = null;
            }
            aVar.i(false);
        }
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z10) {
        this.f12030k.J = z10;
    }

    public void setScrimAlpha(int i10) {
        ViewGroup viewGroup;
        if (i10 != this.f12036q) {
            if (this.f12034o != null && (viewGroup = this.c) != null) {
                WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                f0.d.k(viewGroup);
            }
            this.f12036q = i10;
            WeakHashMap<View, n0> weakHashMap2 = f0.f31435a;
            f0.d.k(this);
        }
    }

    public void setScrimAnimationDuration(long j10) {
        this.f12039t = j10;
    }

    public void setScrimVisibleHeightTrigger(int i10) {
        if (this.f12042w != i10) {
            this.f12042w = i10;
            d();
        }
    }

    public void setScrimsShown(boolean z10) {
        boolean z11;
        TimeInterpolator timeInterpolator;
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        int i10 = 0;
        if (f0.g.c(this) && !isInEditMode()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f12037r != z10) {
            if (z11) {
                if (z10) {
                    i10 = 255;
                }
                a();
                ValueAnimator valueAnimator = this.f12038s;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.f12038s = valueAnimator2;
                    if (i10 > this.f12036q) {
                        timeInterpolator = this.f12040u;
                    } else {
                        timeInterpolator = this.f12041v;
                    }
                    valueAnimator2.setInterpolator(timeInterpolator);
                    this.f12038s.addUpdateListener(new e(this));
                } else if (valueAnimator.isRunning()) {
                    this.f12038s.cancel();
                }
                this.f12038s.setDuration(this.f12039t);
                this.f12038s.setIntValues(this.f12036q, i10);
                this.f12038s.start();
            } else {
                if (z10) {
                    i10 = 255;
                }
                setScrimAlpha(i10);
            }
            this.f12037r = z10;
        }
    }

    public void setStaticLayoutBuilderConfigurer(d dVar) {
        com.google.android.material.internal.a aVar = this.f12030k;
        if (dVar != null) {
            aVar.i(true);
        } else {
            aVar.getClass();
        }
    }

    public void setStatusBarScrim(Drawable drawable) {
        boolean z10;
        Drawable drawable2 = this.f12035p;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f12035p = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f12035p.setState(getDrawableState());
                }
                Drawable drawable4 = this.f12035p;
                WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                a.c.b(drawable4, f0.e.d(this));
                Drawable drawable5 = this.f12035p;
                if (getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                drawable5.setVisible(z10, false);
                this.f12035p.setCallback(this);
                this.f12035p.setAlpha(this.f12036q);
            }
            WeakHashMap<View, n0> weakHashMap2 = f0.f31435a;
            f0.d.k(this);
        }
    }

    public void setStatusBarScrimColor(int i10) {
        setStatusBarScrim(new ColorDrawable(i10));
    }

    public void setStatusBarScrimResource(int i10) {
        setStatusBarScrim(androidx.core.content.a.getDrawable(getContext(), i10));
    }

    public void setTitle(CharSequence charSequence) {
        com.google.android.material.internal.a aVar = this.f12030k;
        if (charSequence == null || !TextUtils.equals(aVar.G, charSequence)) {
            aVar.G = charSequence;
            aVar.H = null;
            Bitmap bitmap = aVar.K;
            if (bitmap != null) {
                bitmap.recycle();
                aVar.K = null;
            }
            aVar.i(false);
        }
        setContentDescription(getTitle());
    }

    public void setTitleCollapseMode(int i10) {
        boolean z10;
        this.f12045z = i10;
        boolean z11 = true;
        if (i10 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f12030k.c = z10;
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.f12045z != 1) {
                z11 = false;
            }
            if (z11) {
                appBarLayout.setLiftOnScroll(false);
            }
        }
        if (z10 && this.f12034o == null) {
            float dimension = getResources().getDimension(R.dimen.design_appbar_elevation);
            t8.a aVar = this.f12031l;
            setContentScrimColor(aVar.a(dimension, aVar.f29973d));
        }
    }

    public void setTitleEllipsize(TextUtils.TruncateAt truncateAt) {
        com.google.android.material.internal.a aVar = this.f12030k;
        aVar.F = truncateAt;
        aVar.i(false);
    }

    public void setTitleEnabled(boolean z10) {
        if (z10 != this.f12032m) {
            this.f12032m = z10;
            setContentDescription(getTitle());
            c();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(TimeInterpolator timeInterpolator) {
        com.google.android.material.internal.a aVar = this.f12030k;
        aVar.V = timeInterpolator;
        aVar.i(false);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        boolean z10;
        super.setVisibility(i10);
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable = this.f12035p;
        if (drawable != null && drawable.isVisible() != z10) {
            this.f12035p.setVisible(z10, false);
        }
        Drawable drawable2 = this.f12034o;
        if (drawable2 != null && drawable2.isVisible() != z10) {
            this.f12034o.setVisible(z10, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f12034o && drawable != this.f12035p) {
            return false;
        }
        return true;
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.collapsingToolbarLayoutStyle);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new b();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i10) {
        super(l9.a.a(context, attributeSet, i10, 2132018037), attributeSet, i10);
        int i11;
        ColorStateList a10;
        ColorStateList a11;
        TextUtils.TruncateAt truncateAt;
        this.f12021a = true;
        this.f12029j = new Rect();
        this.f12042w = -1;
        this.B = 0;
        this.D = 0;
        Context context2 = getContext();
        com.google.android.material.internal.a aVar = new com.google.android.material.internal.a(this);
        this.f12030k = aVar;
        aVar.W = f8.b.f17144e;
        aVar.i(false);
        aVar.J = false;
        this.f12031l = new t8.a(context2);
        TypedArray d10 = s.d(context2, attributeSet, e8.a.f16493n, i10, 2132018037, new int[0]);
        int i12 = d10.getInt(4, 8388691);
        if (aVar.f12648j != i12) {
            aVar.f12648j = i12;
            aVar.i(false);
        }
        aVar.l(d10.getInt(0, 8388627));
        int dimensionPixelSize = d10.getDimensionPixelSize(5, 0);
        this.f12028i = dimensionPixelSize;
        this.f12027h = dimensionPixelSize;
        this.f12026g = dimensionPixelSize;
        this.f12025f = dimensionPixelSize;
        if (d10.hasValue(8)) {
            this.f12025f = d10.getDimensionPixelSize(8, 0);
        }
        if (d10.hasValue(7)) {
            this.f12027h = d10.getDimensionPixelSize(7, 0);
        }
        if (d10.hasValue(9)) {
            this.f12026g = d10.getDimensionPixelSize(9, 0);
        }
        if (d10.hasValue(6)) {
            this.f12028i = d10.getDimensionPixelSize(6, 0);
        }
        this.f12032m = d10.getBoolean(20, true);
        setTitle(d10.getText(18));
        aVar.n(2132017654);
        aVar.k(2132017628);
        if (d10.hasValue(10)) {
            aVar.n(d10.getResourceId(10, 0));
        }
        if (d10.hasValue(1)) {
            aVar.k(d10.getResourceId(1, 0));
        }
        if (d10.hasValue(22)) {
            int i13 = d10.getInt(22, -1);
            if (i13 == 0) {
                truncateAt = TextUtils.TruncateAt.START;
            } else if (i13 == 1) {
                truncateAt = TextUtils.TruncateAt.MIDDLE;
            } else if (i13 != 3) {
                truncateAt = TextUtils.TruncateAt.END;
            } else {
                truncateAt = TextUtils.TruncateAt.MARQUEE;
            }
            setTitleEllipsize(truncateAt);
        }
        if (d10.hasValue(11) && aVar.f12656n != (a11 = b9.c.a(context2, d10, 11))) {
            aVar.f12656n = a11;
            aVar.i(false);
        }
        if (d10.hasValue(2) && aVar.f12658o != (a10 = b9.c.a(context2, d10, 2))) {
            aVar.f12658o = a10;
            aVar.i(false);
        }
        this.f12042w = d10.getDimensionPixelSize(16, -1);
        if (d10.hasValue(14) && (i11 = d10.getInt(14, 1)) != aVar.f12657n0) {
            aVar.f12657n0 = i11;
            Bitmap bitmap = aVar.K;
            if (bitmap != null) {
                bitmap.recycle();
                aVar.K = null;
            }
            aVar.i(false);
        }
        if (d10.hasValue(21)) {
            aVar.V = AnimationUtils.loadInterpolator(context2, d10.getResourceId(21, 0));
            aVar.i(false);
        }
        this.f12039t = d10.getInt(15, OS2WindowsMetricsTable.WEIGHT_CLASS_SEMI_BOLD);
        this.f12040u = x8.a.d(context2, R.attr.motionEasingStandardInterpolator, f8.b.c);
        this.f12041v = x8.a.d(context2, R.attr.motionEasingStandardInterpolator, f8.b.f17143d);
        setContentScrim(d10.getDrawable(3));
        setStatusBarScrim(d10.getDrawable(17));
        setTitleCollapseMode(d10.getInt(19, 0));
        this.f12022b = d10.getResourceId(23, -1);
        this.C = d10.getBoolean(13, false);
        this.E = d10.getBoolean(12, false);
        d10.recycle();
        setWillNotDraw(false);
        a aVar2 = new a();
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        f0.i.u(this, aVar2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public void setCollapsedTitleTextColor(int i10) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i10));
    }

    /* loaded from: classes2.dex */
    public static class b extends FrameLayout.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public final int f12047a;

        /* renamed from: b  reason: collision with root package name */
        public float f12048b;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f12047a = 0;
            this.f12048b = 0.5f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e8.a.f16494o);
            this.f12047a = obtainStyledAttributes.getInt(0, 0);
            this.f12048b = obtainStyledAttributes.getFloat(1, 0.5f);
            obtainStyledAttributes.recycle();
        }

        public b() {
            super(-1, -1);
            this.f12047a = 0;
            this.f12048b = 0.5f;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f12047a = 0;
            this.f12048b = 0.5f;
        }
    }
}
