package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import d1.c;
import f9.h;
import f9.m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import l8.g;
import lib.zj.office.fc.hslf.record.SlideAtom;
import pdf.pdfreader.viewer.editor.free.R;
import w8.w;
import x0.a;
import x0.f0;
import x0.n0;
import x0.r0;
import y0.f;

/* loaded from: classes2.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public final BottomSheetBehavior<V>.e A;
    public ValueAnimator B;
    public int C;
    public int D;
    public int E;
    public float F;
    public int G;
    public final float H;
    public boolean I;
    public boolean J;
    public boolean K;
    public int L;
    public d1.c M;
    public boolean N;
    public int O;
    public boolean P;
    public final float Q;
    public int R;
    public int S;
    public int T;
    public WeakReference<V> U;
    public WeakReference<View> V;
    public WeakReference<View> W;
    public final ArrayList<c> X;
    public VelocityTracker Y;
    public int Z;

    /* renamed from: a  reason: collision with root package name */
    public int f12116a;

    /* renamed from: a0  reason: collision with root package name */
    public int f12117a0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f12118b;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f12119b0;
    public final float c;

    /* renamed from: c0  reason: collision with root package name */
    public HashMap f12120c0;

    /* renamed from: d  reason: collision with root package name */
    public int f12121d;

    /* renamed from: d0  reason: collision with root package name */
    public final SparseIntArray f12122d0;

    /* renamed from: e  reason: collision with root package name */
    public int f12123e;

    /* renamed from: e0  reason: collision with root package name */
    public final b f12124e0;

    /* renamed from: f  reason: collision with root package name */
    public boolean f12125f;

    /* renamed from: g  reason: collision with root package name */
    public int f12126g;

    /* renamed from: h  reason: collision with root package name */
    public final int f12127h;

    /* renamed from: i  reason: collision with root package name */
    public h f12128i;

    /* renamed from: j  reason: collision with root package name */
    public final ColorStateList f12129j;

    /* renamed from: k  reason: collision with root package name */
    public int f12130k;

    /* renamed from: l  reason: collision with root package name */
    public int f12131l;

    /* renamed from: m  reason: collision with root package name */
    public int f12132m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f12133n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f12134o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f12135p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f12136q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f12137r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f12138s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f12139t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f12140u;

    /* renamed from: v  reason: collision with root package name */
    public int f12141v;

    /* renamed from: w  reason: collision with root package name */
    public int f12142w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f12143x;

    /* renamed from: y  reason: collision with root package name */
    public final m f12144y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f12145z;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f12146a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f12147b;

        public a(View view, int i10) {
            this.f12146a = view;
            this.f12147b = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BottomSheetBehavior.this.H(this.f12146a, false, this.f12147b);
        }
    }

    /* loaded from: classes2.dex */
    public class b extends c.AbstractC0191c {
        public b() {
        }

        @Override // d1.c.AbstractC0191c
        public final int a(View view, int i10) {
            return view.getLeft();
        }

        @Override // d1.c.AbstractC0191c
        public final int b(View view, int i10) {
            return com.google.android.play.core.assetpacks.c.n(i10, BottomSheetBehavior.this.z(), d());
        }

        @Override // d1.c.AbstractC0191c
        public final int d() {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.I) {
                return bottomSheetBehavior.T;
            }
            return bottomSheetBehavior.G;
        }

        @Override // d1.c.AbstractC0191c
        public final void h(int i10) {
            if (i10 == 1) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.K) {
                    bottomSheetBehavior.F(1);
                }
            }
        }

        @Override // d1.c.AbstractC0191c
        public final void i(View view, int i10, int i11) {
            BottomSheetBehavior.this.v(i11);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
            if (java.lang.Math.abs(r5.getTop() - r3.z()) < java.lang.Math.abs(r5.getTop() - r3.E)) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0099, code lost:
            if (java.lang.Math.abs(r6 - r3.E) < java.lang.Math.abs(r6 - r3.G)) goto L7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00b3, code lost:
            if (java.lang.Math.abs(r6 - r3.D) < java.lang.Math.abs(r6 - r3.G)) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00c2, code lost:
            if (r6 < java.lang.Math.abs(r6 - r3.G)) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00d3, code lost:
            if (java.lang.Math.abs(r6 - r7) < java.lang.Math.abs(r6 - r3.G)) goto L7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
            if (r6 > r3.E) goto L7;
         */
        @Override // d1.c.AbstractC0191c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void j(android.view.View r5, float r6, float r7) {
            /*
                r4 = this;
                r0 = 0
                int r1 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                r2 = 1
                com.google.android.material.bottomsheet.BottomSheetBehavior r3 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                if (r1 >= 0) goto L1b
                boolean r6 = r3.f12118b
                if (r6 == 0) goto Le
                goto Lc4
            Le:
                int r6 = r5.getTop()
                java.lang.System.currentTimeMillis()
                int r7 = r3.E
                if (r6 <= r7) goto Lc4
                goto Ld5
            L1b:
                boolean r1 = r3.I
                if (r1 == 0) goto L70
                boolean r1 = r3.G(r5, r7)
                if (r1 == 0) goto L70
                float r6 = java.lang.Math.abs(r6)
                float r0 = java.lang.Math.abs(r7)
                int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r6 >= 0) goto L38
                int r6 = r3.f12121d
                float r6 = (float) r6
                int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
                if (r6 > 0) goto L4c
            L38:
                int r6 = r5.getTop()
                int r7 = r3.T
                int r0 = r3.z()
                int r0 = r0 + r7
                int r0 = r0 / 2
                if (r6 <= r0) goto L49
                r6 = r2
                goto L4a
            L49:
                r6 = 0
            L4a:
                if (r6 == 0) goto L4f
            L4c:
                r6 = 5
                goto Ld8
            L4f:
                boolean r6 = r3.f12118b
                if (r6 == 0) goto L55
                goto Lc4
            L55:
                int r6 = r5.getTop()
                int r7 = r3.z()
                int r6 = r6 - r7
                int r6 = java.lang.Math.abs(r6)
                int r7 = r5.getTop()
                int r0 = r3.E
                int r7 = r7 - r0
                int r7 = java.lang.Math.abs(r7)
                if (r6 >= r7) goto Ld5
                goto Lc4
            L70:
                int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r0 == 0) goto L9c
                float r6 = java.lang.Math.abs(r6)
                float r7 = java.lang.Math.abs(r7)
                int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
                if (r6 <= 0) goto L81
                goto L9c
            L81:
                boolean r6 = r3.f12118b
                if (r6 == 0) goto L86
                goto Ld7
            L86:
                int r6 = r5.getTop()
                int r7 = r3.E
                int r7 = r6 - r7
                int r7 = java.lang.Math.abs(r7)
                int r0 = r3.G
                int r6 = r6 - r0
                int r6 = java.lang.Math.abs(r6)
                if (r7 >= r6) goto Ld7
                goto Ld5
            L9c:
                int r6 = r5.getTop()
                boolean r7 = r3.f12118b
                if (r7 == 0) goto Lb6
                int r7 = r3.D
                int r7 = r6 - r7
                int r7 = java.lang.Math.abs(r7)
                int r0 = r3.G
                int r6 = r6 - r0
                int r6 = java.lang.Math.abs(r6)
                if (r7 >= r6) goto Ld7
                goto Lc4
            Lb6:
                int r7 = r3.E
                if (r6 >= r7) goto Lc6
                int r7 = r3.G
                int r7 = r6 - r7
                int r7 = java.lang.Math.abs(r7)
                if (r6 >= r7) goto Ld5
            Lc4:
                r6 = 3
                goto Ld8
            Lc6:
                int r7 = r6 - r7
                int r7 = java.lang.Math.abs(r7)
                int r0 = r3.G
                int r6 = r6 - r0
                int r6 = java.lang.Math.abs(r6)
                if (r7 >= r6) goto Ld7
            Ld5:
                r6 = 6
                goto Ld8
            Ld7:
                r6 = 4
            Ld8:
                r3.getClass()
                r3.H(r5, r2, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.b.j(android.view.View, float, float):void");
        }

        @Override // d1.c.AbstractC0191c
        public final boolean k(View view, int i10) {
            View view2;
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i11 = bottomSheetBehavior.L;
            if (i11 == 1 || bottomSheetBehavior.f12119b0) {
                return false;
            }
            if (i11 == 3 && bottomSheetBehavior.Z == i10) {
                WeakReference<View> weakReference = bottomSheetBehavior.W;
                if (weakReference != null) {
                    view2 = weakReference.get();
                } else {
                    view2 = null;
                }
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            System.currentTimeMillis();
            WeakReference<V> weakReference2 = bottomSheetBehavior.U;
            if (weakReference2 == null || weakReference2.get() != view) {
                return false;
            }
            return true;
        }
    }

    /* loaded from: classes2.dex */
    public class e {

        /* renamed from: a  reason: collision with root package name */
        public int f12153a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f12154b;
        public final a c = new a();

        /* loaded from: classes2.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                e eVar = e.this;
                eVar.f12154b = false;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                d1.c cVar = bottomSheetBehavior.M;
                if (cVar != null && cVar.h()) {
                    eVar.a(eVar.f12153a);
                } else if (bottomSheetBehavior.L == 2) {
                    bottomSheetBehavior.F(eVar.f12153a);
                }
            }
        }

        public e() {
        }

        public final void a(int i10) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            WeakReference<V> weakReference = bottomSheetBehavior.U;
            if (weakReference != null && weakReference.get() != null) {
                this.f12153a = i10;
                if (!this.f12154b) {
                    WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                    f0.d.m(bottomSheetBehavior.U.get(), this.c);
                    this.f12154b = true;
                }
            }
        }
    }

    public BottomSheetBehavior() {
        this.f12116a = 0;
        this.f12118b = true;
        this.f12130k = -1;
        this.f12131l = -1;
        this.A = new e();
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = 4;
        this.Q = 0.1f;
        this.X = new ArrayList<>();
        this.f12122d0 = new SparseIntArray();
        this.f12124e0 = new b();
    }

    public static View w(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        if (f0.i.p(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View w7 = w(viewGroup.getChildAt(i10));
                if (w7 != null) {
                    return w7;
                }
            }
        }
        return null;
    }

    public static <V extends View> BottomSheetBehavior<V> x(V v10) {
        ViewGroup.LayoutParams layoutParams = v10.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.f) {
            CoordinatorLayout.c cVar = ((CoordinatorLayout.f) layoutParams).f3487a;
            if (cVar instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) cVar;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    public final int A(int i10) {
        if (i10 != 3) {
            if (i10 != 4) {
                if (i10 != 5) {
                    if (i10 == 6) {
                        return this.E;
                    }
                    throw new IllegalArgumentException(b.a.c("Invalid state to get top offset: ", i10));
                }
                return this.T;
            }
            return this.G;
        }
        return z();
    }

    public final void B(View view) {
        WeakReference<View> weakReference;
        if (view == null && (weakReference = this.V) != null) {
            u(weakReference.get(), 1);
            this.V = null;
            return;
        }
        this.V = new WeakReference<>(view);
        I(view, 1);
    }

    public final void C(boolean z10) {
        if (this.I != z10) {
            this.I = z10;
            if (!z10 && this.L == 5) {
                E(4);
            }
            J();
        }
    }

    public final void D(int i10) {
        boolean z10 = false;
        if (i10 == -1) {
            if (!this.f12125f) {
                this.f12125f = true;
                z10 = true;
            }
        } else if (this.f12125f || this.f12123e != i10) {
            this.f12125f = false;
            this.f12123e = Math.max(0, i10);
            z10 = true;
        }
        if (z10) {
            M();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x004b, code lost:
        if (x0.f0.g.b(r5) != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E(int r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 == r0) goto L5d
            r1 = 2
            if (r5 != r1) goto L7
            goto L5d
        L7:
            boolean r1 = r4.I
            if (r1 != 0) goto Lf
            r1 = 5
            if (r5 != r1) goto Lf
            return
        Lf:
            r1 = 6
            if (r5 != r1) goto L20
            boolean r1 = r4.f12118b
            if (r1 == 0) goto L20
            int r1 = r4.A(r5)
            int r2 = r4.D
            if (r1 > r2) goto L20
            r1 = 3
            goto L21
        L20:
            r1 = r5
        L21:
            java.lang.ref.WeakReference<V extends android.view.View> r2 = r4.U
            if (r2 == 0) goto L59
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L2c
            goto L59
        L2c:
            java.lang.ref.WeakReference<V extends android.view.View> r5 = r4.U
            java.lang.Object r5 = r5.get()
            android.view.View r5 = (android.view.View) r5
            com.google.android.material.bottomsheet.BottomSheetBehavior$a r2 = new com.google.android.material.bottomsheet.BottomSheetBehavior$a
            r2.<init>(r5, r1)
            android.view.ViewParent r1 = r5.getParent()
            if (r1 == 0) goto L4e
            boolean r1 = r1.isLayoutRequested()
            if (r1 == 0) goto L4e
            java.util.WeakHashMap<android.view.View, x0.n0> r1 = x0.f0.f31435a
            boolean r1 = x0.f0.g.b(r5)
            if (r1 == 0) goto L4e
            goto L4f
        L4e:
            r0 = 0
        L4f:
            if (r0 == 0) goto L55
            r5.post(r2)
            goto L5c
        L55:
            r2.run()
            goto L5c
        L59:
            r4.F(r5)
        L5c:
            return
        L5d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "STATE_"
            r2.<init>(r3)
            if (r5 != r0) goto L6b
            java.lang.String r5 = "DRAGGING"
            goto L6d
        L6b:
            java.lang.String r5 = "SETTLING"
        L6d:
            java.lang.String r0 = " should not be set externally."
            java.lang.String r5 = androidx.activity.r.g(r2, r5, r0)
            r1.<init>(r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.E(int):void");
    }

    public final void F(int i10) {
        V v10;
        if (this.L == i10) {
            return;
        }
        this.L = i10;
        WeakReference<V> weakReference = this.U;
        if (weakReference == null || (v10 = weakReference.get()) == null) {
            return;
        }
        int i11 = 0;
        if (i10 == 3) {
            L(true);
        } else if (i10 == 6 || i10 == 5 || i10 == 4) {
            L(false);
        }
        K(i10, true);
        while (true) {
            ArrayList<c> arrayList = this.X;
            if (i11 < arrayList.size()) {
                arrayList.get(i11).c(v10, i10);
                i11++;
            } else {
                J();
                return;
            }
        }
    }

    public final boolean G(View view, float f10) {
        if (this.J) {
            return true;
        }
        if (view.getTop() < this.G) {
            return false;
        }
        int t4 = t();
        if (Math.abs(((f10 * this.Q) + view.getTop()) - this.G) / t4 > 0.5f) {
            return true;
        }
        return false;
    }

    public final void H(View view, boolean z10, int i10) {
        boolean z11;
        int A = A(i10);
        d1.c cVar = this.M;
        if (cVar != null && (!z10 ? cVar.u(view, view.getLeft(), A) : cVar.s(view.getLeft(), A))) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            F(2);
            K(i10, true);
            this.A.a(i10);
            return;
        }
        F(i10);
    }

    public final void I(View view, int i10) {
        int i11;
        boolean z10;
        x0.a aVar;
        if (view == null) {
            return;
        }
        u(view, i10);
        int i12 = 6;
        if (!this.f12118b && this.L != 6) {
            String string = view.getResources().getString(R.string.arg_res_0x7f13008c);
            l8.c cVar = new l8.c(this, 6);
            ArrayList f10 = f0.f(view);
            int i13 = 0;
            while (true) {
                if (i13 < f10.size()) {
                    if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((f.a) f10.get(i13)).f31964a).getLabel())) {
                        i11 = ((f.a) f10.get(i13)).a();
                        break;
                    }
                    i13++;
                } else {
                    int i14 = 0;
                    int i15 = -1;
                    while (true) {
                        int[] iArr = f0.f31437d;
                        if (i14 >= iArr.length || i15 != -1) {
                            break;
                        }
                        int i16 = iArr[i14];
                        boolean z11 = true;
                        for (int i17 = 0; i17 < f10.size(); i17++) {
                            if (((f.a) f10.get(i17)).a() != i16) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            z11 &= z10;
                        }
                        if (z11) {
                            i15 = i16;
                        }
                        i14++;
                    }
                    i11 = i15;
                }
            }
            if (i11 != -1) {
                f.a aVar2 = new f.a(null, i11, string, cVar, null);
                View.AccessibilityDelegate d10 = f0.d(view);
                if (d10 == null) {
                    aVar = null;
                } else if (d10 instanceof a.C0399a) {
                    aVar = ((a.C0399a) d10).f31418a;
                } else {
                    aVar = new x0.a(d10);
                }
                if (aVar == null) {
                    aVar = new x0.a();
                }
                f0.o(view, aVar);
                f0.l(view, aVar2.a());
                f0.f(view).add(aVar2);
                f0.i(view, 0);
            }
            this.f12122d0.put(i10, i11);
        }
        if (this.I && this.L != 5) {
            f0.m(view, f.a.f31960l, null, new l8.c(this, 5));
        }
        int i18 = this.L;
        if (i18 != 3) {
            if (i18 != 4) {
                if (i18 == 6) {
                    f0.m(view, f.a.f31959k, null, new l8.c(this, 4));
                    f0.m(view, f.a.f31958j, null, new l8.c(this, 3));
                    return;
                }
                return;
            }
            if (this.f12118b) {
                i12 = 3;
            }
            f0.m(view, f.a.f31958j, null, new l8.c(this, i12));
            return;
        }
        if (this.f12118b) {
            i12 = 4;
        }
        f0.m(view, f.a.f31959k, null, new l8.c(this, i12));
    }

    public final void J() {
        WeakReference<V> weakReference = this.U;
        if (weakReference != null) {
            I(weakReference.get(), 0);
        }
        WeakReference<View> weakReference2 = this.V;
        if (weakReference2 != null) {
            I(weakReference2.get(), 1);
        }
    }

    public final void K(int i10, boolean z10) {
        boolean z11;
        ValueAnimator valueAnimator;
        if (i10 == 2) {
            return;
        }
        if (this.L == 3 && (this.f12143x || z() == 0)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f12145z != z11 && this.f12128i != null) {
            this.f12145z = z11;
            float f10 = 0.0f;
            if (z10 && (valueAnimator = this.B) != null) {
                if (valueAnimator.isRunning()) {
                    this.B.reverse();
                    return;
                }
                if (!z11) {
                    f10 = 1.0f;
                }
                this.B.setFloatValues(1.0f - f10, f10);
                this.B.start();
                return;
            }
            ValueAnimator valueAnimator2 = this.B;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.B.cancel();
            }
            h hVar = this.f12128i;
            if (!this.f12145z) {
                f10 = 1.0f;
            }
            hVar.o(f10);
        }
    }

    public final void L(boolean z10) {
        WeakReference<V> weakReference = this.U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (!(parent instanceof CoordinatorLayout)) {
            return;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
        int childCount = coordinatorLayout.getChildCount();
        if (z10) {
            if (this.f12120c0 == null) {
                this.f12120c0 = new HashMap(childCount);
            } else {
                return;
            }
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = coordinatorLayout.getChildAt(i10);
            if (childAt != this.U.get() && z10) {
                this.f12120c0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
            }
        }
        if (!z10) {
            this.f12120c0 = null;
        }
    }

    public final void M() {
        V v10;
        if (this.U != null) {
            s();
            if (this.L == 4 && (v10 = this.U.get()) != null) {
                v10.requestLayout();
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void c(CoordinatorLayout.f fVar) {
        this.U = null;
        this.M = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void f() {
        this.U = null;
        this.M = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean g(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        boolean z10;
        View view;
        d1.c cVar;
        if (v10.isShown() && this.K) {
            int actionMasked = motionEvent.getActionMasked();
            View view2 = null;
            if (actionMasked == 0) {
                this.Z = -1;
                VelocityTracker velocityTracker = this.Y;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.Y = null;
                }
            }
            if (this.Y == null) {
                this.Y = VelocityTracker.obtain();
            }
            this.Y.addMovement(motionEvent);
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.f12119b0 = false;
                    this.Z = -1;
                    if (this.N) {
                        this.N = false;
                        return false;
                    }
                }
            } else {
                int x4 = (int) motionEvent.getX();
                this.f12117a0 = (int) motionEvent.getY();
                if (this.L != 2) {
                    WeakReference<View> weakReference = this.W;
                    if (weakReference != null) {
                        view = weakReference.get();
                    } else {
                        view = null;
                    }
                    if (view != null && coordinatorLayout.s(view, x4, this.f12117a0)) {
                        this.Z = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.f12119b0 = true;
                    }
                }
                if (this.Z == -1 && !coordinatorLayout.s(v10, x4, this.f12117a0)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.N = z10;
            }
            if (!this.N && (cVar = this.M) != null && cVar.t(motionEvent)) {
                return true;
            }
            WeakReference<View> weakReference2 = this.W;
            if (weakReference2 != null) {
                view2 = weakReference2.get();
            }
            if (actionMasked != 2 || view2 == null || this.N || this.L == 1 || coordinatorLayout.s(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.M == null || Math.abs(this.f12117a0 - motionEvent.getY()) <= this.M.f16053b) {
                return false;
            }
            return true;
        }
        this.N = true;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean h(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        boolean z10;
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        if (f0.d.b(coordinatorLayout) && !f0.d.b(v10)) {
            v10.setFitsSystemWindows(true);
        }
        int i11 = 0;
        if (this.U == null) {
            this.f12126g = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 29 && !this.f12133n && !this.f12125f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f12134o || this.f12135p || this.f12136q || this.f12138s || this.f12139t || this.f12140u || z10) {
                w.a(v10, new l8.b(this, z10));
            }
            g gVar = new g(v10);
            if (i12 >= 30) {
                v10.setWindowInsetsAnimationCallback(new r0.d.a(gVar));
            } else {
                Object tag = v10.getTag(R.id.tag_on_apply_window_listener);
                View.OnApplyWindowInsetsListener aVar = new r0.c.a(v10, gVar);
                v10.setTag(R.id.tag_window_insets_animation_callback, aVar);
                if (tag == null) {
                    v10.setOnApplyWindowInsetsListener(aVar);
                }
            }
            this.U = new WeakReference<>(v10);
            h hVar = this.f12128i;
            if (hVar != null) {
                f0.d.q(v10, hVar);
                h hVar2 = this.f12128i;
                float f10 = this.H;
                if (f10 == -1.0f) {
                    f10 = f0.i.i(v10);
                }
                hVar2.m(f10);
            } else {
                ColorStateList colorStateList = this.f12129j;
                if (colorStateList != null) {
                    f0.i.q(v10, colorStateList);
                }
            }
            J();
            if (f0.d.c(v10) == 0) {
                f0.d.s(v10, 1);
            }
        }
        if (this.M == null) {
            this.M = new d1.c(coordinatorLayout.getContext(), coordinatorLayout, this.f12124e0);
        }
        int top = v10.getTop();
        coordinatorLayout.u(v10, i10);
        this.S = coordinatorLayout.getWidth();
        this.T = coordinatorLayout.getHeight();
        int height = v10.getHeight();
        this.R = height;
        int i13 = this.T;
        int i14 = i13 - height;
        int i15 = this.f12142w;
        if (i14 < i15) {
            if (this.f12137r) {
                this.R = i13;
            } else {
                this.R = i13 - i15;
            }
        }
        this.D = Math.max(0, i13 - this.R);
        this.E = (int) ((1.0f - this.F) * this.T);
        s();
        int i16 = this.L;
        if (i16 == 3) {
            v10.offsetTopAndBottom(z());
        } else if (i16 == 6) {
            v10.offsetTopAndBottom(this.E);
        } else if (this.I && i16 == 5) {
            v10.offsetTopAndBottom(this.T);
        } else if (i16 == 4) {
            v10.offsetTopAndBottom(this.G);
        } else if (i16 == 1 || i16 == 2) {
            v10.offsetTopAndBottom(top - v10.getTop());
        }
        K(this.L, false);
        this.W = new WeakReference<>(w(v10));
        while (true) {
            ArrayList<c> arrayList = this.X;
            if (i11 >= arrayList.size()) {
                return true;
            }
            arrayList.get(i11).a(v10);
            i11++;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(y(i10, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.f12130k, marginLayoutParams.width), y(i12, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, this.f12131l, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean j(View view) {
        WeakReference<View> weakReference = this.W;
        if (weakReference != null && view == weakReference.get() && this.L != 3) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void k(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int[] iArr, int i12) {
        View view2;
        if (i12 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.W;
        if (weakReference != null) {
            view2 = weakReference.get();
        } else {
            view2 = null;
        }
        if (view != view2) {
            return;
        }
        int top = v10.getTop();
        int i13 = top - i11;
        if (i11 > 0) {
            if (i13 < z()) {
                int z10 = top - z();
                iArr[1] = z10;
                int i14 = -z10;
                WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                v10.offsetTopAndBottom(i14);
                F(3);
            } else if (!this.K) {
                return;
            } else {
                iArr[1] = i11;
                WeakHashMap<View, n0> weakHashMap2 = f0.f31435a;
                v10.offsetTopAndBottom(-i11);
                F(1);
            }
        } else if (i11 < 0 && !view.canScrollVertically(-1)) {
            int i15 = this.G;
            if (i13 > i15 && !this.I) {
                int i16 = top - i15;
                iArr[1] = i16;
                int i17 = -i16;
                WeakHashMap<View, n0> weakHashMap3 = f0.f31435a;
                v10.offsetTopAndBottom(i17);
                F(4);
            } else if (!this.K) {
                return;
            } else {
                iArr[1] = i11;
                WeakHashMap<View, n0> weakHashMap4 = f0.f31435a;
                v10.offsetTopAndBottom(-i11);
                F(1);
            }
        }
        v(v10.getTop());
        this.O = i11;
        this.P = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void n(View view, Parcelable parcelable) {
        d dVar = (d) parcelable;
        int i10 = this.f12116a;
        if (i10 != 0) {
            if (i10 == -1 || (i10 & 1) == 1) {
                this.f12123e = dVar.f12149d;
            }
            if (i10 == -1 || (i10 & 2) == 2) {
                this.f12118b = dVar.f12150e;
            }
            if (i10 == -1 || (i10 & 4) == 4) {
                this.I = dVar.f12151f;
            }
            if (i10 == -1 || (i10 & 8) == 8) {
                this.J = dVar.f12152g;
            }
        }
        int i11 = dVar.c;
        if (i11 != 1 && i11 != 2) {
            this.L = i11;
        } else {
            this.L = 4;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final Parcelable o(View view) {
        return new d(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean p(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
        this.O = 0;
        this.P = false;
        if ((i10 & 2) == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002f, code lost:
        if (r3.getTop() <= r1.E) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006f, code lost:
        if (java.lang.Math.abs(r2 - r1.D) < java.lang.Math.abs(r2 - r1.G)) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007e, code lost:
        if (r2 < java.lang.Math.abs(r2 - r1.G)) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008e, code lost:
        if (java.lang.Math.abs(r2 - r4) < java.lang.Math.abs(r2 - r1.G)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a9, code lost:
        if (java.lang.Math.abs(r2 - r1.E) < java.lang.Math.abs(r2 - r1.G)) goto L18;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(androidx.coordinatorlayout.widget.CoordinatorLayout r2, V r3, android.view.View r4, int r5) {
        /*
            r1 = this;
            int r2 = r3.getTop()
            int r5 = r1.z()
            r0 = 3
            if (r2 != r5) goto Lf
            r1.F(r0)
            return
        Lf:
            java.lang.ref.WeakReference<android.view.View> r2 = r1.W
            if (r2 == 0) goto Lb4
            java.lang.Object r2 = r2.get()
            if (r4 != r2) goto Lb4
            boolean r2 = r1.P
            if (r2 != 0) goto L1f
            goto Lb4
        L1f:
            int r2 = r1.O
            if (r2 <= 0) goto L33
            boolean r2 = r1.f12118b
            if (r2 == 0) goto L29
            goto Lae
        L29:
            int r2 = r3.getTop()
            int r4 = r1.E
            if (r2 <= r4) goto Lae
            goto Lab
        L33:
            boolean r2 = r1.I
            if (r2 == 0) goto L54
            android.view.VelocityTracker r2 = r1.Y
            if (r2 != 0) goto L3d
            r2 = 0
            goto L4c
        L3d:
            r4 = 1000(0x3e8, float:1.401E-42)
            float r5 = r1.c
            r2.computeCurrentVelocity(r4, r5)
            android.view.VelocityTracker r2 = r1.Y
            int r4 = r1.Z
            float r2 = r2.getYVelocity(r4)
        L4c:
            boolean r2 = r1.G(r3, r2)
            if (r2 == 0) goto L54
            r0 = 5
            goto Lae
        L54:
            int r2 = r1.O
            if (r2 != 0) goto L91
            int r2 = r3.getTop()
            boolean r4 = r1.f12118b
            if (r4 == 0) goto L72
            int r4 = r1.D
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r1.G
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            if (r4 >= r2) goto Lad
            goto Lae
        L72:
            int r4 = r1.E
            if (r2 >= r4) goto L81
            int r4 = r1.G
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            if (r2 >= r4) goto Lab
            goto Lae
        L81:
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r1.G
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            if (r4 >= r2) goto Lad
            goto Lab
        L91:
            boolean r2 = r1.f12118b
            if (r2 == 0) goto L96
            goto Lad
        L96:
            int r2 = r3.getTop()
            int r4 = r1.E
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r1.G
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            if (r4 >= r2) goto Lad
        Lab:
            r0 = 6
            goto Lae
        Lad:
            r0 = 4
        Lae:
            r2 = 0
            r1.H(r3, r2, r0)
            r1.P = r2
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.q(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean r(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        boolean z10;
        boolean z11 = false;
        if (!v10.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i10 = this.L;
        if (i10 == 1 && actionMasked == 0) {
            return true;
        }
        d1.c cVar = this.M;
        if (cVar != null && (this.K || i10 == 1)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            cVar.m(motionEvent);
        }
        if (actionMasked == 0) {
            this.Z = -1;
            VelocityTracker velocityTracker = this.Y;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.Y = null;
            }
        }
        if (this.Y == null) {
            this.Y = VelocityTracker.obtain();
        }
        this.Y.addMovement(motionEvent);
        if (this.M != null && (this.K || this.L == 1)) {
            z11 = true;
        }
        if (z11 && actionMasked == 2 && !this.N) {
            float abs = Math.abs(this.f12117a0 - motionEvent.getY());
            d1.c cVar2 = this.M;
            if (abs > cVar2.f16053b) {
                cVar2.c(v10, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.N;
    }

    public final void s() {
        int t4 = t();
        if (this.f12118b) {
            this.G = Math.max(this.T - t4, this.D);
        } else {
            this.G = this.T - t4;
        }
    }

    public final int t() {
        int i10;
        if (this.f12125f) {
            return Math.min(Math.max(this.f12126g, this.T - ((this.S * 9) / 16)), this.R) + this.f12141v;
        }
        if (!this.f12133n && !this.f12134o && (i10 = this.f12132m) > 0) {
            return Math.max(this.f12123e, i10 + this.f12127h);
        }
        return this.f12123e + this.f12141v;
    }

    public final void u(View view, int i10) {
        if (view == null) {
            return;
        }
        f0.l(view, 524288);
        f0.i(view, 0);
        f0.l(view, 262144);
        f0.i(view, 0);
        f0.l(view, 1048576);
        f0.i(view, 0);
        SparseIntArray sparseIntArray = this.f12122d0;
        int i11 = sparseIntArray.get(i10, -1);
        if (i11 != -1) {
            f0.l(view, i11);
            f0.i(view, 0);
            sparseIntArray.delete(i10);
        }
    }

    public final void v(int i10) {
        V v10 = this.U.get();
        if (v10 != null) {
            ArrayList<c> arrayList = this.X;
            if (!arrayList.isEmpty()) {
                int i11 = this.G;
                if (i10 <= i11 && i11 != z()) {
                    z();
                }
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    arrayList.get(i12).b(v10);
                }
            }
        }
    }

    public final int y(int i10, int i11, int i12, int i13) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i11, i13);
        if (i12 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode != 1073741824) {
            if (size != 0) {
                i12 = Math.min(size, i12);
            }
            return View.MeasureSpec.makeMeasureSpec(i12, SlideAtom.USES_MASTER_SLIDE_ID);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, i12), 1073741824);
    }

    public final int z() {
        int i10;
        if (this.f12118b) {
            return this.D;
        }
        int i11 = this.C;
        if (this.f12137r) {
            i10 = 0;
        } else {
            i10 = this.f12142w;
        }
        return Math.max(i11, i10);
    }

    /* loaded from: classes2.dex */
    public static class d extends c1.a {
        public static final Parcelable.Creator<d> CREATOR = new a();
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public final int f12149d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f12150e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f12151f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f12152g;

        /* loaded from: classes2.dex */
        public class a implements Parcelable.ClassLoaderCreator<d> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final d createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new d(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new d[i10];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new d(parcel, (ClassLoader) null);
            }
        }

        public d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readInt();
            this.f12149d = parcel.readInt();
            this.f12150e = parcel.readInt() == 1;
            this.f12151f = parcel.readInt() == 1;
            this.f12152g = parcel.readInt() == 1;
        }

        @Override // c1.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f5506a, i10);
            parcel.writeInt(this.c);
            parcel.writeInt(this.f12149d);
            parcel.writeInt(this.f12150e ? 1 : 0);
            parcel.writeInt(this.f12151f ? 1 : 0);
            parcel.writeInt(this.f12152g ? 1 : 0);
        }

        public d(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
            super(absSavedState);
            this.c = bottomSheetBehavior.L;
            this.f12149d = bottomSheetBehavior.f12123e;
            this.f12150e = bottomSheetBehavior.f12118b;
            this.f12151f = bottomSheetBehavior.I;
            this.f12152g = bottomSheetBehavior.J;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i10;
        this.f12116a = 0;
        this.f12118b = true;
        this.f12130k = -1;
        this.f12131l = -1;
        this.A = new e();
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = 4;
        this.Q = 0.1f;
        this.X = new ArrayList<>();
        this.f12122d0 = new SparseIntArray();
        this.f12124e0 = new b();
        this.f12127h = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e8.a.f16484g);
        int i11 = 3;
        if (obtainStyledAttributes.hasValue(3)) {
            this.f12129j = b9.c.a(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(21)) {
            this.f12144y = new m(m.c(context, attributeSet, R.attr.bottomSheetStyle, 2132018036));
        }
        m mVar = this.f12144y;
        if (mVar != null) {
            h hVar = new h(mVar);
            this.f12128i = hVar;
            hVar.k(context);
            ColorStateList colorStateList = this.f12129j;
            if (colorStateList != null) {
                this.f12128i.n(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f12128i.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.B = ofFloat;
        ofFloat.setDuration(500L);
        this.B.addUpdateListener(new l8.a(this));
        this.H = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f12130k = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f12131l = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue != null && (i10 = peekValue.data) == -1) {
            D(i10);
        } else {
            D(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        }
        C(obtainStyledAttributes.getBoolean(8, false));
        this.f12133n = obtainStyledAttributes.getBoolean(13, false);
        boolean z10 = obtainStyledAttributes.getBoolean(6, true);
        if (this.f12118b != z10) {
            this.f12118b = z10;
            if (this.U != null) {
                s();
            }
            F((this.f12118b && this.L == 6) ? i11 : this.L);
            K(this.L, true);
            J();
        }
        this.J = obtainStyledAttributes.getBoolean(12, false);
        this.K = obtainStyledAttributes.getBoolean(4, true);
        this.f12116a = obtainStyledAttributes.getInt(10, 0);
        float f10 = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f10 > 0.0f && f10 < 1.0f) {
            this.F = f10;
            if (this.U != null) {
                this.E = (int) ((1.0f - f10) * this.T);
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
            if (peekValue2 != null && peekValue2.type == 16) {
                int i12 = peekValue2.data;
                if (i12 >= 0) {
                    this.C = i12;
                    K(this.L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (dimensionPixelOffset >= 0) {
                    this.C = dimensionPixelOffset;
                    K(this.L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.f12121d = obtainStyledAttributes.getInt(11, OS2WindowsMetricsTable.WEIGHT_CLASS_MEDIUM);
            this.f12134o = obtainStyledAttributes.getBoolean(17, false);
            this.f12135p = obtainStyledAttributes.getBoolean(18, false);
            this.f12136q = obtainStyledAttributes.getBoolean(19, false);
            this.f12137r = obtainStyledAttributes.getBoolean(20, true);
            this.f12138s = obtainStyledAttributes.getBoolean(14, false);
            this.f12139t = obtainStyledAttributes.getBoolean(15, false);
            this.f12140u = obtainStyledAttributes.getBoolean(16, false);
            this.f12143x = obtainStyledAttributes.getBoolean(23, true);
            obtainStyledAttributes.recycle();
            this.c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    /* loaded from: classes2.dex */
    public static abstract class c {
        public abstract void b(View view);

        public abstract void c(View view, int i10);

        public void a(View view) {
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void l(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
    }
}
