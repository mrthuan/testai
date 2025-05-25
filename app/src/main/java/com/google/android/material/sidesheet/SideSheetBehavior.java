package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.r;
import androidx.appcompat.widget.z0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import d1.c;
import f9.h;
import f9.m;
import g9.f;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import pdf.pdfreader.viewer.editor.free.R;
import x0.f0;
import x0.n0;
import y0.f;
import y0.j;

/* loaded from: classes2.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    public g9.a f12848a;

    /* renamed from: b  reason: collision with root package name */
    public h f12849b;
    public final ColorStateList c;

    /* renamed from: d  reason: collision with root package name */
    public final m f12850d;

    /* renamed from: e  reason: collision with root package name */
    public final SideSheetBehavior<V>.c f12851e;

    /* renamed from: f  reason: collision with root package name */
    public final float f12852f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f12853g;

    /* renamed from: h  reason: collision with root package name */
    public int f12854h;

    /* renamed from: i  reason: collision with root package name */
    public d1.c f12855i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f12856j;

    /* renamed from: k  reason: collision with root package name */
    public final float f12857k;

    /* renamed from: l  reason: collision with root package name */
    public int f12858l;

    /* renamed from: m  reason: collision with root package name */
    public int f12859m;

    /* renamed from: n  reason: collision with root package name */
    public int f12860n;

    /* renamed from: o  reason: collision with root package name */
    public WeakReference<V> f12861o;

    /* renamed from: p  reason: collision with root package name */
    public WeakReference<View> f12862p;

    /* renamed from: q  reason: collision with root package name */
    public int f12863q;

    /* renamed from: r  reason: collision with root package name */
    public VelocityTracker f12864r;

    /* renamed from: s  reason: collision with root package name */
    public int f12865s;

    /* renamed from: t  reason: collision with root package name */
    public final LinkedHashSet f12866t;

    /* renamed from: u  reason: collision with root package name */
    public final a f12867u;

    /* loaded from: classes2.dex */
    public class a extends c.AbstractC0191c {
        public a() {
        }

        @Override // d1.c.AbstractC0191c
        public final int a(View view, int i10) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            return com.google.android.play.core.assetpacks.c.n(i10, sideSheetBehavior.f12848a.a(), sideSheetBehavior.f12859m);
        }

        @Override // d1.c.AbstractC0191c
        public final int b(View view, int i10) {
            return view.getTop();
        }

        @Override // d1.c.AbstractC0191c
        public final int c(View view) {
            return SideSheetBehavior.this.f12859m;
        }

        @Override // d1.c.AbstractC0191c
        public final void h(int i10) {
            if (i10 == 1) {
                SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                if (sideSheetBehavior.f12853g) {
                    sideSheetBehavior.s(1);
                }
            }
        }

        @Override // d1.c.AbstractC0191c
        public final void i(View view, int i10, int i11) {
            View view2;
            ViewGroup.MarginLayoutParams marginLayoutParams;
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            WeakReference<View> weakReference = sideSheetBehavior.f12862p;
            if (weakReference != null) {
                view2 = weakReference.get();
            } else {
                view2 = null;
            }
            if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                g9.a aVar = sideSheetBehavior.f12848a;
                int left = view.getLeft();
                view.getRight();
                int i12 = aVar.f17697a.f12859m;
                if (left <= i12) {
                    marginLayoutParams.rightMargin = i12 - left;
                }
                view2.setLayoutParams(marginLayoutParams);
            }
            LinkedHashSet<g9.b> linkedHashSet = sideSheetBehavior.f12866t;
            if (!linkedHashSet.isEmpty()) {
                g9.a aVar2 = sideSheetBehavior.f12848a;
                int i13 = aVar2.f17697a.f12859m;
                aVar2.a();
                for (g9.b bVar : linkedHashSet) {
                    bVar.b();
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
            if (r6 != false) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x006b, code lost:
            if (r6 == false) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
            if (java.lang.Math.abs(r9 - r1.a()) < java.lang.Math.abs(r9 - r5.f12859m)) goto L34;
         */
        @Override // d1.c.AbstractC0191c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void j(android.view.View r8, float r9, float r10) {
            /*
                r7 = this;
                com.google.android.material.sidesheet.SideSheetBehavior r0 = com.google.android.material.sidesheet.SideSheetBehavior.this
                g9.a r1 = r0.f12848a
                r1.getClass()
                r2 = 0
                int r3 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                r4 = 1
                if (r3 >= 0) goto Lf
                goto L84
            Lf:
                int r3 = r8.getRight()
                float r3 = (float) r3
                com.google.android.material.sidesheet.SideSheetBehavior<? extends android.view.View> r5 = r1.f17697a
                float r6 = r5.f12857k
                float r6 = r6 * r9
                float r6 = r6 + r3
                float r3 = java.lang.Math.abs(r6)
                r6 = 1056964608(0x3f000000, float:0.5)
                int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                r6 = 0
                if (r3 <= 0) goto L27
                r3 = r4
                goto L28
            L27:
                r3 = r6
            L28:
                if (r3 == 0) goto L5a
                float r9 = java.lang.Math.abs(r9)
                float r2 = java.lang.Math.abs(r10)
                int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r9 <= 0) goto L38
                r9 = r4
                goto L39
            L38:
                r9 = r6
            L39:
                if (r9 == 0) goto L44
                r9 = 500(0x1f4, float:7.0E-43)
                float r9 = (float) r9
                int r9 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
                if (r9 <= 0) goto L44
                r9 = r4
                goto L45
            L44:
                r9 = r6
            L45:
                if (r9 != 0) goto L86
                int r9 = r8.getLeft()
                int r10 = r5.f12859m
                int r1 = r1.a()
                int r10 = r10 - r1
                int r10 = r10 / 2
                if (r9 <= r10) goto L57
                r6 = r4
            L57:
                if (r6 == 0) goto L84
                goto L86
            L5a:
                int r2 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r2 == 0) goto L6d
                float r9 = java.lang.Math.abs(r9)
                float r10 = java.lang.Math.abs(r10)
                int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
                if (r9 <= 0) goto L6b
                r6 = r4
            L6b:
                if (r6 != 0) goto L86
            L6d:
                int r9 = r8.getLeft()
                int r10 = r1.a()
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                int r1 = r5.f12859m
                int r9 = r9 - r1
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto L86
            L84:
                r9 = 3
                goto L87
            L86:
                r9 = 5
            L87:
                r0.t(r8, r4, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.sidesheet.SideSheetBehavior.a.j(android.view.View, float, float):void");
        }

        @Override // d1.c.AbstractC0191c
        public final boolean k(View view, int i10) {
            WeakReference<V> weakReference;
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            if (sideSheetBehavior.f12854h == 1 || (weakReference = sideSheetBehavior.f12861o) == null || weakReference.get() != view) {
                return false;
            }
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public class c {

        /* renamed from: a  reason: collision with root package name */
        public int f12869a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f12870b;
        public final z0 c = new z0(this, 3);

        public c() {
        }

        public final void a(int i10) {
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            WeakReference<V> weakReference = sideSheetBehavior.f12861o;
            if (weakReference != null && weakReference.get() != null) {
                this.f12869a = i10;
                if (!this.f12870b) {
                    WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                    f0.d.m(sideSheetBehavior.f12861o.get(), this.c);
                    this.f12870b = true;
                }
            }
        }
    }

    public SideSheetBehavior() {
        this.f12851e = new c();
        this.f12853g = true;
        this.f12854h = 5;
        this.f12857k = 0.1f;
        this.f12863q = -1;
        this.f12866t = new LinkedHashSet();
        this.f12867u = new a();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void c(CoordinatorLayout.f fVar) {
        this.f12861o = null;
        this.f12855i = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void f() {
        this.f12861o = null;
        this.f12855i = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean g(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        boolean z10;
        d1.c cVar;
        VelocityTracker velocityTracker;
        if ((v10.isShown() || f0.e(v10) != null) && this.f12853g) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            this.f12856j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.f12864r) != null) {
            velocityTracker.recycle();
            this.f12864r = null;
        }
        if (this.f12864r == null) {
            this.f12864r = VelocityTracker.obtain();
        }
        this.f12864r.addMovement(motionEvent);
        if (actionMasked != 0) {
            if ((actionMasked == 1 || actionMasked == 3) && this.f12856j) {
                this.f12856j = false;
                return false;
            }
        } else {
            this.f12865s = (int) motionEvent.getX();
        }
        if (!this.f12856j && (cVar = this.f12855i) != null && cVar.t(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean h(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        int i11;
        int i12;
        View findViewById;
        int i13;
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        if (f0.d.b(coordinatorLayout) && !f0.d.b(v10)) {
            v10.setFitsSystemWindows(true);
        }
        int i14 = 0;
        if (this.f12861o == null) {
            this.f12861o = new WeakReference<>(v10);
            h hVar = this.f12849b;
            if (hVar != null) {
                f0.d.q(v10, hVar);
                h hVar2 = this.f12849b;
                float f10 = this.f12852f;
                if (f10 == -1.0f) {
                    f10 = f0.i.i(v10);
                }
                hVar2.m(f10);
            } else {
                ColorStateList colorStateList = this.c;
                if (colorStateList != null) {
                    f0.i.q(v10, colorStateList);
                }
            }
            if (this.f12854h == 5) {
                i13 = 4;
            } else {
                i13 = 0;
            }
            if (v10.getVisibility() != i13) {
                v10.setVisibility(i13);
            }
            u();
            if (f0.d.c(v10) == 0) {
                f0.d.s(v10, 1);
            }
            if (f0.e(v10) == null) {
                f0.p(v10, v10.getResources().getString(R.string.arg_res_0x7f130476));
            }
        }
        if (this.f12855i == null) {
            this.f12855i = new d1.c(coordinatorLayout.getContext(), coordinatorLayout, this.f12867u);
        }
        g9.a aVar = this.f12848a;
        aVar.getClass();
        int left = v10.getLeft() - aVar.f17697a.f12860n;
        coordinatorLayout.u(v10, i10);
        this.f12859m = coordinatorLayout.getWidth();
        this.f12858l = v10.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v10.getLayoutParams();
        if (marginLayoutParams != null) {
            this.f12848a.getClass();
            i11 = marginLayoutParams.rightMargin;
        } else {
            i11 = 0;
        }
        this.f12860n = i11;
        int i15 = this.f12854h;
        if (i15 != 1 && i15 != 2) {
            if (i15 != 3) {
                if (i15 == 5) {
                    i14 = this.f12848a.f17697a.f12859m;
                } else {
                    throw new IllegalStateException("Unexpected value: " + this.f12854h);
                }
            }
        } else {
            g9.a aVar2 = this.f12848a;
            aVar2.getClass();
            i14 = left - (v10.getLeft() - aVar2.f17697a.f12860n);
        }
        v10.offsetLeftAndRight(i14);
        if (this.f12862p == null && (i12 = this.f12863q) != -1 && (findViewById = coordinatorLayout.findViewById(i12)) != null) {
            this.f12862p = new WeakReference<>(findViewById);
        }
        for (g9.b bVar : this.f12866t) {
            if (bVar instanceof f) {
                ((f) bVar).getClass();
            }
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void n(View view, Parcelable parcelable) {
        int i10 = ((b) parcelable).c;
        this.f12854h = (i10 == 1 || i10 == 2) ? 5 : 5;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final Parcelable o(View view) {
        return new b(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean r(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        VelocityTracker velocityTracker;
        boolean z13 = false;
        if (!v10.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i10 = this.f12854h;
        if (i10 == 1 && actionMasked == 0) {
            return true;
        }
        d1.c cVar = this.f12855i;
        if (cVar != null && (this.f12853g || i10 == 1)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            cVar.m(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.f12864r) != null) {
            velocityTracker.recycle();
            this.f12864r = null;
        }
        if (this.f12864r == null) {
            this.f12864r = VelocityTracker.obtain();
        }
        this.f12864r.addMovement(motionEvent);
        d1.c cVar2 = this.f12855i;
        if (cVar2 != null && (this.f12853g || this.f12854h == 1)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && actionMasked == 2 && !this.f12856j) {
            if (cVar2 != null && (this.f12853g || this.f12854h == 1)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 && Math.abs(this.f12865s - motionEvent.getX()) > this.f12855i.f16053b) {
                z13 = true;
            }
            if (z13) {
                this.f12855i.c(v10, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f12856j;
    }

    public final void s(int i10) {
        V v10;
        int i11;
        if (this.f12854h == i10) {
            return;
        }
        this.f12854h = i10;
        WeakReference<V> weakReference = this.f12861o;
        if (weakReference == null || (v10 = weakReference.get()) == null) {
            return;
        }
        if (this.f12854h == 5) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        if (v10.getVisibility() != i11) {
            v10.setVisibility(i11);
        }
        for (g9.b bVar : this.f12866t) {
            bVar.a();
        }
        u();
    }

    public final void t(View view, boolean z10, int i10) {
        int a10;
        boolean z11;
        SideSheetBehavior<? extends View> sideSheetBehavior = this.f12848a.f17697a;
        if (i10 != 3) {
            if (i10 == 5) {
                a10 = sideSheetBehavior.f12848a.f17697a.f12859m;
            } else {
                sideSheetBehavior.getClass();
                throw new IllegalArgumentException(b.a.c("Invalid state to get outer edge offset: ", i10));
            }
        } else {
            a10 = sideSheetBehavior.f12848a.a();
        }
        d1.c cVar = sideSheetBehavior.f12855i;
        if (cVar != null && (!z10 ? cVar.u(view, a10, view.getTop()) : cVar.s(a10, view.getTop()))) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            s(2);
            this.f12851e.a(i10);
            return;
        }
        s(i10);
    }

    public final void u() {
        V v10;
        WeakReference<V> weakReference = this.f12861o;
        if (weakReference == null || (v10 = weakReference.get()) == null) {
            return;
        }
        f0.l(v10, 262144);
        f0.i(v10, 0);
        f0.l(v10, 1048576);
        f0.i(v10, 0);
        if (this.f12854h != 5) {
            f0.m(v10, f.a.f31960l, null, new j() { // from class: g9.d
                @Override // y0.j
                public final boolean a(View view) {
                    String str;
                    SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                    sideSheetBehavior.getClass();
                    int i10 = r2;
                    if (i10 != 1 && i10 != 2) {
                        Reference reference = sideSheetBehavior.f12861o;
                        if (reference != null && reference.get() != null) {
                            View view2 = (View) sideSheetBehavior.f12861o.get();
                            boolean z10 = false;
                            e eVar = new e(sideSheetBehavior, i10, 0);
                            ViewParent parent = view2.getParent();
                            if (parent != null && parent.isLayoutRequested()) {
                                WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                                if (f0.g.b(view2)) {
                                    z10 = true;
                                }
                            }
                            if (z10) {
                                view2.post(eVar);
                            } else {
                                eVar.run();
                            }
                        } else {
                            sideSheetBehavior.s(i10);
                        }
                        return true;
                    }
                    StringBuilder sb2 = new StringBuilder("STATE_");
                    if (i10 == 1) {
                        str = "DRAGGING";
                    } else {
                        str = "SETTLING";
                    }
                    throw new IllegalArgumentException(r.g(sb2, str, " should not be set externally."));
                }
            });
        }
        if (this.f12854h != 3) {
            f0.m(v10, f.a.f31958j, null, new j() { // from class: g9.d
                @Override // y0.j
                public final boolean a(View view) {
                    String str;
                    SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
                    sideSheetBehavior.getClass();
                    int i10 = r2;
                    if (i10 != 1 && i10 != 2) {
                        Reference reference = sideSheetBehavior.f12861o;
                        if (reference != null && reference.get() != null) {
                            View view2 = (View) sideSheetBehavior.f12861o.get();
                            boolean z10 = false;
                            e eVar = new e(sideSheetBehavior, i10, 0);
                            ViewParent parent = view2.getParent();
                            if (parent != null && parent.isLayoutRequested()) {
                                WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                                if (f0.g.b(view2)) {
                                    z10 = true;
                                }
                            }
                            if (z10) {
                                view2.post(eVar);
                            } else {
                                eVar.run();
                            }
                        } else {
                            sideSheetBehavior.s(i10);
                        }
                        return true;
                    }
                    StringBuilder sb2 = new StringBuilder("STATE_");
                    if (i10 == 1) {
                        str = "DRAGGING";
                    } else {
                        str = "SETTLING";
                    }
                    throw new IllegalArgumentException(r.g(sb2, str, " should not be set externally."));
                }
            });
        }
    }

    /* loaded from: classes2.dex */
    public static class b extends c1.a {
        public static final Parcelable.Creator<b> CREATOR = new a();
        public final int c;

        /* loaded from: classes2.dex */
        public class a implements Parcelable.ClassLoaderCreator<b> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new b[i10];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new b(parcel, (ClassLoader) null);
            }
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readInt();
        }

        @Override // c1.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f5506a, i10);
            parcel.writeInt(this.c);
        }

        public b(AbsSavedState absSavedState, SideSheetBehavior sideSheetBehavior) {
            super(absSavedState);
            this.c = sideSheetBehavior.f12854h;
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12851e = new c();
        this.f12853g = true;
        this.f12854h = 5;
        this.f12857k = 0.1f;
        this.f12863q = -1;
        this.f12866t = new LinkedHashSet();
        this.f12867u = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e8.a.X);
        if (obtainStyledAttributes.hasValue(3)) {
            this.c = b9.c.a(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.f12850d = new m(m.c(context, attributeSet, 0, 2132018178));
        }
        if (obtainStyledAttributes.hasValue(5)) {
            int resourceId = obtainStyledAttributes.getResourceId(5, -1);
            this.f12863q = resourceId;
            WeakReference<View> weakReference = this.f12862p;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f12862p = null;
            WeakReference<V> weakReference2 = this.f12861o;
            if (weakReference2 != null) {
                V v10 = weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                    if (f0.g.c(v10)) {
                        v10.requestLayout();
                    }
                }
            }
        }
        m mVar = this.f12850d;
        if (mVar != null) {
            h hVar = new h(mVar);
            this.f12849b = hVar;
            hVar.k(context);
            ColorStateList colorStateList = this.c;
            if (colorStateList != null) {
                this.f12849b.n(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f12849b.setTint(typedValue.data);
            }
        }
        this.f12852f = obtainStyledAttributes.getDimension(2, -1.0f);
        this.f12853g = obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        if (this.f12848a == null) {
            this.f12848a = new g9.a(this);
        }
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
