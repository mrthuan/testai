package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import f9.m;
import java.util.ArrayList;
import java.util.WeakHashMap;
import pdf.pdfreader.viewer.editor.free.R;
import w8.s;
import x0.f0;
import x0.n0;

/* loaded from: classes2.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {
    public static final b I = new b();
    public static final c J = new c();
    public static final d K = new d();
    public static final e L = new e();
    public int A;
    public final ExtendedFloatingActionButtonBehavior B;
    public boolean C;
    public boolean D;
    public boolean E;
    public ColorStateList F;
    public int G;
    public int H;

    /* renamed from: t  reason: collision with root package name */
    public int f12490t;

    /* renamed from: u  reason: collision with root package name */
    public final f f12491u;

    /* renamed from: v  reason: collision with root package name */
    public final f f12492v;

    /* renamed from: w  reason: collision with root package name */
    public final h f12493w;

    /* renamed from: x  reason: collision with root package name */
    public final g f12494x;

    /* renamed from: y  reason: collision with root package name */
    public final int f12495y;

    /* renamed from: z  reason: collision with root package name */
    public int f12496z;

    /* loaded from: classes2.dex */
    public class a implements i {
        public a() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.i
        public final int getHeight() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.i
        public final ViewGroup.LayoutParams getLayoutParams() {
            return new ViewGroup.LayoutParams(getWidth(), getHeight());
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.i
        public final int getPaddingEnd() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.i
        public final int getPaddingStart() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.i
        public final int getWidth() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }
    }

    /* loaded from: classes2.dex */
    public class b extends Property<View, Float> {
        public b() {
            super(Float.class, InMobiNetworkValues.WIDTH);
        }

        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        public final void set(View view, Float f10) {
            View view2 = view;
            view2.getLayoutParams().width = f10.intValue();
            view2.requestLayout();
        }
    }

    /* loaded from: classes2.dex */
    public class c extends Property<View, Float> {
        public c() {
            super(Float.class, InMobiNetworkValues.HEIGHT);
        }

        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        public final void set(View view, Float f10) {
            View view2 = view;
            view2.getLayoutParams().height = f10.intValue();
            view2.requestLayout();
        }
    }

    /* loaded from: classes2.dex */
    public class d extends Property<View, Float> {
        public d() {
            super(Float.class, "paddingStart");
        }

        @Override // android.util.Property
        public final Float get(View view) {
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            return Float.valueOf(f0.e.f(view));
        }

        @Override // android.util.Property
        public final void set(View view, Float f10) {
            View view2 = view;
            int intValue = f10.intValue();
            int paddingTop = view2.getPaddingTop();
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            f0.e.k(view2, intValue, paddingTop, f0.e.e(view2), view2.getPaddingBottom());
        }
    }

    /* loaded from: classes2.dex */
    public class e extends Property<View, Float> {
        public e() {
            super(Float.class, "paddingEnd");
        }

        @Override // android.util.Property
        public final Float get(View view) {
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            return Float.valueOf(f0.e.e(view));
        }

        @Override // android.util.Property
        public final void set(View view, Float f10) {
            View view2 = view;
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            f0.e.k(view2, f0.e.f(view2), view2.getPaddingTop(), f10.intValue(), view2.getPaddingBottom());
        }
    }

    /* loaded from: classes2.dex */
    public interface i {
        int getHeight();

        ViewGroup.LayoutParams getLayoutParams();

        int getPaddingEnd();

        int getPaddingStart();

        int getWidth();
    }

    public ExtendedFloatingActionButton(Context context) {
        this(context, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0042, code lost:
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0049, code lost:
        if (r5.E != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004f, code lost:
        if (r5.isInEditMode() == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r5, int r6) {
        /*
            r0 = 2
            r1 = 1
            if (r6 == 0) goto L20
            if (r6 == r1) goto L1d
            if (r6 == r0) goto L1a
            r2 = 3
            if (r6 != r2) goto Le
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$f r2 = r5.f12492v
            goto L22
        Le:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unknown strategy type: "
            java.lang.String r6 = b.a.c(r0, r6)
            r5.<init>(r6)
            throw r5
        L1a:
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$f r2 = r5.f12491u
            goto L22
        L1d:
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$g r2 = r5.f12494x
            goto L22
        L20:
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h r2 = r5.f12493w
        L22:
            boolean r3 = r2.f()
            if (r3 == 0) goto L2a
            goto La1
        L2a:
            java.util.WeakHashMap<android.view.View, x0.n0> r3 = x0.f0.f31435a
            boolean r3 = x0.f0.g.c(r5)
            r4 = 0
            if (r3 != 0) goto L4b
            int r3 = r5.getVisibility()
            if (r3 == 0) goto L3e
            int r3 = r5.f12490t
            if (r3 != r0) goto L44
            goto L42
        L3e:
            int r3 = r5.f12490t
            if (r3 == r1) goto L44
        L42:
            r3 = r1
            goto L45
        L44:
            r3 = r4
        L45:
            if (r3 != 0) goto L52
            boolean r3 = r5.E
            if (r3 == 0) goto L52
        L4b:
            boolean r3 = r5.isInEditMode()
            if (r3 != 0) goto L52
            goto L53
        L52:
            r1 = r4
        L53:
            if (r1 != 0) goto L5c
            r2.d()
            r2.e()
            goto La1
        L5c:
            if (r6 != r0) goto L79
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            if (r6 == 0) goto L6d
            int r0 = r6.width
            r5.G = r0
            int r6 = r6.height
            r5.H = r6
            goto L79
        L6d:
            int r6 = r5.getWidth()
            r5.G = r6
            int r6 = r5.getHeight()
            r5.H = r6
        L79:
            r5.measure(r4, r4)
            android.animation.AnimatorSet r5 = r2.g()
            v8.c r6 = new v8.c
            r6.<init>(r2)
            r5.addListener(r6)
            java.util.ArrayList<android.animation.Animator$AnimatorListener> r6 = r2.c
            java.util.Iterator r6 = r6.iterator()
        L8e:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L9e
            java.lang.Object r0 = r6.next()
            android.animation.Animator$AnimatorListener r0 = (android.animation.Animator.AnimatorListener) r0
            r5.addListener(r0)
            goto L8e
        L9e:
            r5.start()
        La1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.e(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton, int):void");
    }

    public final void f(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<ExtendedFloatingActionButton> getBehavior() {
        return this.B;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    public int getCollapsedSize() {
        int i10 = this.f12495y;
        if (i10 < 0) {
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            return (Math.min(f0.e.f(this), f0.e.e(this)) * 2) + getIconSize();
        }
        return i10;
    }

    public f8.h getExtendMotionSpec() {
        return this.f12492v.f30746f;
    }

    public f8.h getHideMotionSpec() {
        return this.f12494x.f30746f;
    }

    public f8.h getShowMotionSpec() {
        return this.f12493w.f30746f;
    }

    public f8.h getShrinkMotionSpec() {
        return this.f12491u.f30746f;
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.C && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.C = false;
            this.f12491u.d();
        }
    }

    public void setAnimateShowBeforeLayout(boolean z10) {
        this.E = z10;
    }

    public void setExtendMotionSpec(f8.h hVar) {
        this.f12492v.f30746f = hVar;
    }

    public void setExtendMotionSpecResource(int i10) {
        setExtendMotionSpec(f8.h.b(getContext(), i10));
    }

    public void setExtended(boolean z10) {
        f fVar;
        if (this.C == z10) {
            return;
        }
        if (z10) {
            fVar = this.f12492v;
        } else {
            fVar = this.f12491u;
        }
        if (fVar.f()) {
            return;
        }
        fVar.d();
    }

    public void setHideMotionSpec(f8.h hVar) {
        this.f12494x.f30746f = hVar;
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(f8.h.b(getContext(), i10));
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(i10, i11, i12, i13);
        if (this.C && !this.D) {
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            this.f12496z = f0.e.f(this);
            this.A = f0.e.e(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10, i11, i12, i13);
        if (this.C && !this.D) {
            this.f12496z = i10;
            this.A = i12;
        }
    }

    public void setShowMotionSpec(f8.h hVar) {
        this.f12493w.f30746f = hVar;
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(f8.h.b(getContext(), i10));
    }

    public void setShrinkMotionSpec(f8.h hVar) {
        this.f12491u.f30746f = hVar;
    }

    public void setShrinkMotionSpecResource(int i10) {
        setShrinkMotionSpec(f8.h.b(getContext(), i10));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        this.F = getTextColors();
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.extendedFloatingActionButtonStyle);
    }

    /* loaded from: classes2.dex */
    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a  reason: collision with root package name */
        public Rect f12497a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f12498b;
        public final boolean c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f12498b = false;
            this.c = true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final /* bridge */ /* synthetic */ boolean a(View view, Rect rect) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            return false;
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
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                s(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.f) {
                    z10 = ((CoordinatorLayout.f) layoutParams).f3487a instanceof BottomSheetBehavior;
                } else {
                    z10 = false;
                }
                if (z10) {
                    t(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
            boolean z10;
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            ArrayList i11 = coordinatorLayout.i(extendedFloatingActionButton);
            int size = i11.size();
            for (int i12 = 0; i12 < size; i12++) {
                View view2 = (View) i11.get(i12);
                if (view2 instanceof AppBarLayout) {
                    if (s(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.f) {
                        z10 = ((CoordinatorLayout.f) layoutParams).f3487a instanceof BottomSheetBehavior;
                    } else {
                        z10 = false;
                    }
                    if (z10 && t(view2, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.u(extendedFloatingActionButton, i10);
            return true;
        }

        public final boolean s(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z10;
            int i10;
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams();
            boolean z11 = this.f12498b;
            boolean z12 = this.c;
            int i11 = 0;
            if ((!z11 && !z12) || fVar.f3491f != appBarLayout.getId()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                return false;
            }
            if (this.f12497a == null) {
                this.f12497a = new Rect();
            }
            Rect rect = this.f12497a;
            w8.c.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                if (z12) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                ExtendedFloatingActionButton.e(extendedFloatingActionButton, i10);
            } else {
                if (z12) {
                    i11 = 3;
                }
                ExtendedFloatingActionButton.e(extendedFloatingActionButton, i11);
            }
            return true;
        }

        public final boolean t(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z10;
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams();
            boolean z11 = this.f12498b;
            boolean z12 = this.c;
            int i10 = 0;
            if ((!z11 && !z12) || fVar.f3491f != view.getId()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                return false;
            }
            int i11 = 2;
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                if (!z12) {
                    i11 = 1;
                }
                ExtendedFloatingActionButton.e(extendedFloatingActionButton, i11);
            } else {
                if (z12) {
                    i10 = 3;
                }
                ExtendedFloatingActionButton.e(extendedFloatingActionButton, i10);
            }
            return true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e8.a.f16496q);
            this.f12498b = obtainStyledAttributes.getBoolean(0, false);
            this.c = obtainStyledAttributes.getBoolean(1, true);
            obtainStyledAttributes.recycle();
        }
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet, int i10) {
        super(l9.a.a(context, attributeSet, i10, 2132018255), attributeSet, i10);
        boolean z10;
        com.google.android.material.floatingactionbutton.b bVar;
        this.f12490t = 0;
        k3.e eVar = new k3.e();
        h hVar = new h(eVar);
        this.f12493w = hVar;
        g gVar = new g(eVar);
        this.f12494x = gVar;
        this.C = true;
        this.D = false;
        this.E = false;
        Context context2 = getContext();
        this.B = new ExtendedFloatingActionButtonBehavior(context2, attributeSet);
        TypedArray d10 = s.d(context2, attributeSet, e8.a.f16495p, i10, 2132018255, new int[0]);
        f8.h a10 = f8.h.a(context2, d10, 5);
        f8.h a11 = f8.h.a(context2, d10, 4);
        f8.h a12 = f8.h.a(context2, d10, 2);
        f8.h a13 = f8.h.a(context2, d10, 6);
        this.f12495y = d10.getDimensionPixelSize(0, -1);
        int i11 = d10.getInt(3, 1);
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        this.f12496z = f0.e.f(this);
        this.A = f0.e.e(this);
        k3.e eVar2 = new k3.e();
        com.google.android.material.floatingactionbutton.a aVar = new com.google.android.material.floatingactionbutton.a(this);
        com.google.android.material.floatingactionbutton.b bVar2 = new com.google.android.material.floatingactionbutton.b(this, aVar);
        i cVar = new com.google.android.material.floatingactionbutton.c(this, bVar2, aVar);
        if (i11 != 1) {
            bVar = i11 != 2 ? cVar : bVar2;
            z10 = true;
        } else {
            z10 = true;
            bVar = aVar;
        }
        f fVar = new f(eVar2, bVar, z10);
        this.f12492v = fVar;
        f fVar2 = new f(eVar2, new a(), false);
        this.f12491u = fVar2;
        hVar.f30746f = a10;
        gVar.f30746f = a11;
        fVar.f30746f = a12;
        fVar2.f30746f = a13;
        d10.recycle();
        setShapeAppearanceModel(new m(m.d(context2, attributeSet, i10, 2132018255, m.f17211m)));
        this.F = getTextColors();
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        this.F = getTextColors();
    }

    /* loaded from: classes2.dex */
    public class f extends v8.a {

        /* renamed from: g  reason: collision with root package name */
        public final i f12500g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f12501h;

        public f(k3.e eVar, i iVar, boolean z10) {
            super(ExtendedFloatingActionButton.this, eVar);
            this.f12500g = iVar;
            this.f12501h = z10;
        }

        @Override // v8.h
        public final void a() {
            this.f30744d.f19557a = null;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.D = false;
            extendedFloatingActionButton.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            i iVar = this.f12500g;
            layoutParams.width = iVar.getLayoutParams().width;
            layoutParams.height = iVar.getLayoutParams().height;
        }

        @Override // v8.h
        public final int c() {
            if (this.f12501h) {
                return R.animator.mtrl_extended_fab_change_size_expand_motion_spec;
            }
            return R.animator.mtrl_extended_fab_change_size_collapse_motion_spec;
        }

        @Override // v8.h
        public final void d() {
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            boolean z10 = this.f12501h;
            extendedFloatingActionButton.C = z10;
            ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            if (!z10) {
                extendedFloatingActionButton.G = layoutParams.width;
                extendedFloatingActionButton.H = layoutParams.height;
            }
            i iVar = this.f12500g;
            layoutParams.width = iVar.getLayoutParams().width;
            layoutParams.height = iVar.getLayoutParams().height;
            int paddingStart = iVar.getPaddingStart();
            int paddingTop = extendedFloatingActionButton.getPaddingTop();
            int paddingEnd = iVar.getPaddingEnd();
            int paddingBottom = extendedFloatingActionButton.getPaddingBottom();
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            f0.e.k(extendedFloatingActionButton, paddingStart, paddingTop, paddingEnd, paddingBottom);
            extendedFloatingActionButton.requestLayout();
        }

        @Override // v8.h
        public final boolean f() {
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            if (this.f12501h != extendedFloatingActionButton.C && extendedFloatingActionButton.getIcon() != null && !TextUtils.isEmpty(extendedFloatingActionButton.getText())) {
                return false;
            }
            return true;
        }

        @Override // v8.a, v8.h
        public final AnimatorSet g() {
            float f10;
            f8.h hVar = this.f30746f;
            if (hVar == null) {
                if (this.f30745e == null) {
                    this.f30745e = f8.h.b(this.f30742a, c());
                }
                hVar = this.f30745e;
                hVar.getClass();
            }
            boolean g10 = hVar.g(InMobiNetworkValues.WIDTH);
            i iVar = this.f12500g;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            if (g10) {
                PropertyValuesHolder[] e10 = hVar.e(InMobiNetworkValues.WIDTH);
                e10[0].setFloatValues(extendedFloatingActionButton.getWidth(), iVar.getWidth());
                hVar.h(InMobiNetworkValues.WIDTH, e10);
            }
            if (hVar.g(InMobiNetworkValues.HEIGHT)) {
                PropertyValuesHolder[] e11 = hVar.e(InMobiNetworkValues.HEIGHT);
                e11[0].setFloatValues(extendedFloatingActionButton.getHeight(), iVar.getHeight());
                hVar.h(InMobiNetworkValues.HEIGHT, e11);
            }
            if (hVar.g("paddingStart")) {
                PropertyValuesHolder[] e12 = hVar.e("paddingStart");
                PropertyValuesHolder propertyValuesHolder = e12[0];
                WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                propertyValuesHolder.setFloatValues(f0.e.f(extendedFloatingActionButton), iVar.getPaddingStart());
                hVar.h("paddingStart", e12);
            }
            if (hVar.g("paddingEnd")) {
                PropertyValuesHolder[] e13 = hVar.e("paddingEnd");
                PropertyValuesHolder propertyValuesHolder2 = e13[0];
                WeakHashMap<View, n0> weakHashMap2 = f0.f31435a;
                propertyValuesHolder2.setFloatValues(f0.e.e(extendedFloatingActionButton), iVar.getPaddingEnd());
                hVar.h("paddingEnd", e13);
            }
            if (hVar.g("labelOpacity")) {
                PropertyValuesHolder[] e14 = hVar.e("labelOpacity");
                float f11 = 0.0f;
                boolean z10 = this.f12501h;
                if (z10) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                if (z10) {
                    f11 = 1.0f;
                }
                e14[0].setFloatValues(f10, f11);
                hVar.h("labelOpacity", e14);
            }
            return h(hVar);
        }

        @Override // v8.h
        public final void onAnimationStart(Animator animator) {
            k3.e eVar = this.f30744d;
            Animator animator2 = (Animator) eVar.f19557a;
            if (animator2 != null) {
                animator2.cancel();
            }
            eVar.f19557a = animator;
            boolean z10 = this.f12501h;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.C = z10;
            extendedFloatingActionButton.D = true;
            extendedFloatingActionButton.setHorizontallyScrolling(true);
        }

        @Override // v8.h
        public final void e() {
        }
    }

    /* loaded from: classes2.dex */
    public class g extends v8.a {

        /* renamed from: g  reason: collision with root package name */
        public boolean f12503g;

        public g(k3.e eVar) {
            super(ExtendedFloatingActionButton.this, eVar);
        }

        @Override // v8.h
        public final void a() {
            this.f30744d.f19557a = null;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.f12490t = 0;
            if (!this.f12503g) {
                extendedFloatingActionButton.setVisibility(8);
            }
        }

        @Override // v8.a, v8.h
        public final void b() {
            super.b();
            this.f12503g = true;
        }

        @Override // v8.h
        public final int c() {
            return R.animator.mtrl_extended_fab_hide_motion_spec;
        }

        @Override // v8.h
        public final void d() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // v8.h
        public final boolean f() {
            b bVar = ExtendedFloatingActionButton.I;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            if (extendedFloatingActionButton.getVisibility() == 0) {
                if (extendedFloatingActionButton.f12490t == 1) {
                    return true;
                }
            } else if (extendedFloatingActionButton.f12490t != 2) {
                return true;
            }
            return false;
        }

        @Override // v8.h
        public final void onAnimationStart(Animator animator) {
            k3.e eVar = this.f30744d;
            Animator animator2 = (Animator) eVar.f19557a;
            if (animator2 != null) {
                animator2.cancel();
            }
            eVar.f19557a = animator;
            this.f12503g = false;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.setVisibility(0);
            extendedFloatingActionButton.f12490t = 1;
        }

        @Override // v8.h
        public final void e() {
        }
    }

    /* loaded from: classes2.dex */
    public class h extends v8.a {
        public h(k3.e eVar) {
            super(ExtendedFloatingActionButton.this, eVar);
        }

        @Override // v8.h
        public final void a() {
            this.f30744d.f19557a = null;
            ExtendedFloatingActionButton.this.f12490t = 0;
        }

        @Override // v8.h
        public final int c() {
            return R.animator.mtrl_extended_fab_show_motion_spec;
        }

        @Override // v8.h
        public final void d() {
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.setVisibility(0);
            extendedFloatingActionButton.setAlpha(1.0f);
            extendedFloatingActionButton.setScaleY(1.0f);
            extendedFloatingActionButton.setScaleX(1.0f);
        }

        @Override // v8.h
        public final boolean f() {
            b bVar = ExtendedFloatingActionButton.I;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            if (extendedFloatingActionButton.getVisibility() != 0) {
                if (extendedFloatingActionButton.f12490t != 2) {
                    return false;
                }
            } else if (extendedFloatingActionButton.f12490t == 1) {
                return false;
            }
            return true;
        }

        @Override // v8.h
        public final void onAnimationStart(Animator animator) {
            k3.e eVar = this.f30744d;
            Animator animator2 = (Animator) eVar.f19557a;
            if (animator2 != null) {
                animator2.cancel();
            }
            eVar.f19557a = animator;
            ExtendedFloatingActionButton extendedFloatingActionButton = ExtendedFloatingActionButton.this;
            extendedFloatingActionButton.setVisibility(0);
            extendedFloatingActionButton.f12490t = 2;
        }

        @Override // v8.h
        public final void e() {
        }
    }
}
