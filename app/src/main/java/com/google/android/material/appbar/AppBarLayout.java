package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import f9.h;
import g8.i;
import g8.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import p0.a;
import pdf.pdfreader.viewer.editor.free.R;
import w8.s;
import x0.f0;
import x0.n0;
import x0.o;
import x0.s0;
import x0.u;
import y0.f;

/* loaded from: classes2.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f11981y = 0;

    /* renamed from: a  reason: collision with root package name */
    public int f11982a;

    /* renamed from: b  reason: collision with root package name */
    public int f11983b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f11984d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f11985e;

    /* renamed from: f  reason: collision with root package name */
    public int f11986f;

    /* renamed from: g  reason: collision with root package name */
    public s0 f11987g;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList f11988h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f11989i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f11990j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f11991k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f11992l;

    /* renamed from: m  reason: collision with root package name */
    public int f11993m;

    /* renamed from: n  reason: collision with root package name */
    public WeakReference<View> f11994n;

    /* renamed from: o  reason: collision with root package name */
    public final ColorStateList f11995o;

    /* renamed from: p  reason: collision with root package name */
    public ValueAnimator f11996p;

    /* renamed from: q  reason: collision with root package name */
    public ValueAnimator.AnimatorUpdateListener f11997q;

    /* renamed from: r  reason: collision with root package name */
    public final ArrayList f11998r;

    /* renamed from: s  reason: collision with root package name */
    public final long f11999s;

    /* renamed from: t  reason: collision with root package name */
    public final TimeInterpolator f12000t;

    /* renamed from: u  reason: collision with root package name */
    public int[] f12001u;

    /* renamed from: v  reason: collision with root package name */
    public Drawable f12002v;

    /* renamed from: w  reason: collision with root package name */
    public final float f12003w;

    /* renamed from: x  reason: collision with root package name */
    public Behavior f12004x;

    /* loaded from: classes2.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends g8.f<T> {

        /* renamed from: j  reason: collision with root package name */
        public int f12005j;

        /* renamed from: k  reason: collision with root package name */
        public int f12006k;

        /* renamed from: l  reason: collision with root package name */
        public ValueAnimator f12007l;

        /* renamed from: m  reason: collision with root package name */
        public b f12008m;

        /* renamed from: n  reason: collision with root package name */
        public WeakReference<View> f12009n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f12010o;

        /* loaded from: classes2.dex */
        public class a extends x0.a {
            public a() {
            }

            @Override // x0.a
            public final void d(View view, y0.f fVar) {
                this.f31416a.onInitializeAccessibilityNodeInfo(view, fVar.f31951a);
                fVar.l(BaseBehavior.this.f12010o);
                fVar.h(ScrollView.class.getName());
            }
        }

        /* loaded from: classes2.dex */
        public static class b extends c1.a {
            public static final Parcelable.Creator<b> CREATOR = new a();
            public boolean c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f12012d;

            /* renamed from: e  reason: collision with root package name */
            public int f12013e;

            /* renamed from: f  reason: collision with root package name */
            public float f12014f;

            /* renamed from: g  reason: collision with root package name */
            public boolean f12015g;

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
                    return new b(parcel, null);
                }
            }

            public b(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                boolean z10;
                boolean z11;
                if (parcel.readByte() != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.c = z10;
                if (parcel.readByte() != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f12012d = z11;
                this.f12013e = parcel.readInt();
                this.f12014f = parcel.readFloat();
                this.f12015g = parcel.readByte() != 0;
            }

            @Override // c1.a, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                parcel.writeParcelable(this.f5506a, i10);
                parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f12012d ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f12013e);
                parcel.writeFloat(this.f12014f);
                parcel.writeByte(this.f12015g ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior() {
        }

        public static void C(KeyEvent keyEvent, View view, AppBarLayout appBarLayout) {
            if (keyEvent.getAction() == 0 || keyEvent.getAction() == 1) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 19 && keyCode != 280 && keyCode != 92) {
                    if ((keyCode == 20 || keyCode == 281 || keyCode == 93) && view.getScrollY() > 0) {
                        appBarLayout.setExpanded(false);
                    }
                } else if (view.getScrollY() < view.getMeasuredHeight() * 0.1d) {
                    appBarLayout.setExpanded(true);
                }
            }
        }

        public static View D(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if ((childAt instanceof o) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0071  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void I(androidx.coordinatorlayout.widget.CoordinatorLayout r7, com.google.android.material.appbar.AppBarLayout r8, int r9, int r10, boolean r11) {
            /*
                int r0 = java.lang.Math.abs(r9)
                int r1 = r8.getChildCount()
                r2 = 0
                r3 = r2
            La:
                r4 = 0
                if (r3 >= r1) goto L21
                android.view.View r5 = r8.getChildAt(r3)
                int r6 = r5.getTop()
                if (r0 < r6) goto L1e
                int r6 = r5.getBottom()
                if (r0 > r6) goto L1e
                goto L22
            L1e:
                int r3 = r3 + 1
                goto La
            L21:
                r5 = r4
            L22:
                r0 = 1
                if (r5 == 0) goto L5e
                android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$e r1 = (com.google.android.material.appbar.AppBarLayout.e) r1
                int r1 = r1.f12019a
                r3 = r1 & 1
                if (r3 == 0) goto L5e
                java.util.WeakHashMap<android.view.View, x0.n0> r3 = x0.f0.f31435a
                int r3 = x0.f0.d.d(r5)
                if (r10 <= 0) goto L4b
                r10 = r1 & 12
                if (r10 == 0) goto L4b
                int r9 = -r9
                int r10 = r5.getBottom()
                int r10 = r10 - r3
                int r1 = r8.getTopInset()
                int r10 = r10 - r1
                if (r9 < r10) goto L5e
                goto L5c
            L4b:
                r10 = r1 & 2
                if (r10 == 0) goto L5e
                int r9 = -r9
                int r10 = r5.getBottom()
                int r10 = r10 - r3
                int r1 = r8.getTopInset()
                int r10 = r10 - r1
                if (r9 < r10) goto L5e
            L5c:
                r9 = r0
                goto L5f
            L5e:
                r9 = r2
            L5f:
                boolean r10 = r8.f11992l
                if (r10 == 0) goto L6b
                android.view.View r9 = D(r7)
                boolean r9 = r8.g(r9)
            L6b:
                boolean r9 = r8.f(r9)
                if (r11 != 0) goto Laf
                if (r9 == 0) goto Lb2
                i0.a r9 = r7.f3468b
                java.lang.Object r9 = r9.f18403b
                y.i r9 = (y.i) r9
                java.lang.Object r9 = r9.getOrDefault(r8, r4)
                java.util.List r9 = (java.util.List) r9
                java.util.ArrayList r7 = r7.f3469d
                r7.clear()
                if (r9 == 0) goto L89
                r7.addAll(r9)
            L89:
                int r9 = r7.size()
                r10 = r2
            L8e:
                if (r10 >= r9) goto Lad
                java.lang.Object r11 = r7.get(r10)
                android.view.View r11 = (android.view.View) r11
                android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r11 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r11
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r11 = r11.f3487a
                boolean r1 = r11 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r1 == 0) goto Laa
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r11 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r11
                int r7 = r11.f17690f
                if (r7 == 0) goto Lad
                r2 = r0
                goto Lad
            Laa:
                int r10 = r10 + 1
                goto L8e
            Lad:
                if (r2 == 0) goto Lb2
            Laf:
                r8.jumpDrawablesToCurrentState()
            Lb2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.I(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        public final void B(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            int height;
            int abs = Math.abs(t() - i10);
            float abs2 = Math.abs(0.0f);
            if (abs2 > 0.0f) {
                height = Math.round((abs / abs2) * 1000.0f) * 3;
            } else {
                height = (int) (((abs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            }
            int t4 = t();
            if (t4 == i10) {
                ValueAnimator valueAnimator = this.f12007l;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f12007l.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f12007l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f12007l = valueAnimator3;
                valueAnimator3.setInterpolator(f8.b.f17144e);
                this.f12007l.addUpdateListener(new com.google.android.material.appbar.a(this, coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f12007l.setDuration(Math.min(height, (int) OS2WindowsMetricsTable.WEIGHT_CLASS_SEMI_BOLD));
            this.f12007l.setIntValues(t4, i10);
            this.f12007l.start();
        }

        public final void E(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int[] iArr) {
            int i11;
            int i12;
            if (i10 != 0) {
                if (i10 < 0) {
                    i11 = -appBarLayout.getTotalScrollRange();
                    i12 = appBarLayout.getDownNestedPreScrollRange() + i11;
                } else {
                    i11 = -appBarLayout.getUpNestedPreScrollRange();
                    i12 = 0;
                }
                int i13 = i11;
                int i14 = i12;
                if (i13 != i14) {
                    iArr[1] = z(coordinatorLayout, appBarLayout, t() - i10, i13, i14);
                }
            }
            if (appBarLayout.f11992l) {
                appBarLayout.f(appBarLayout.g(view));
            }
        }

        public final b F(Parcelable parcelable, T t4) {
            boolean z10;
            boolean z11;
            int s4 = s();
            int childCount = t4.getChildCount();
            boolean z12 = false;
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = t4.getChildAt(i10);
                int bottom = childAt.getBottom() + s4;
                if (childAt.getTop() + s4 <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = c1.a.f5505b;
                    }
                    b bVar = new b(parcelable);
                    if (s4 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    bVar.f12012d = z10;
                    if (!z10 && (-s4) >= t4.getTotalScrollRange()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    bVar.c = z11;
                    bVar.f12013e = i10;
                    WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                    if (bottom == t4.getTopInset() + f0.d.d(childAt)) {
                        z12 = true;
                    }
                    bVar.f12015g = z12;
                    bVar.f12014f = bottom / childAt.getHeight();
                    return bVar;
                }
            }
            return null;
        }

        public final void G(CoordinatorLayout coordinatorLayout, T t4) {
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            int paddingTop = t4.getPaddingTop() + t4.getTopInset();
            int t10 = t() - paddingTop;
            int childCount = t4.getChildCount();
            int i10 = 0;
            while (true) {
                z10 = true;
                if (i10 < childCount) {
                    View childAt = t4.getChildAt(i10);
                    int top = childAt.getTop();
                    int bottom = childAt.getBottom();
                    e eVar = (e) childAt.getLayoutParams();
                    if ((eVar.f12019a & 32) == 32) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        top -= ((LinearLayout.LayoutParams) eVar).topMargin;
                        bottom += ((LinearLayout.LayoutParams) eVar).bottomMargin;
                    }
                    int i11 = -t10;
                    if (top <= i11 && bottom >= i11) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                View childAt2 = t4.getChildAt(i10);
                e eVar2 = (e) childAt2.getLayoutParams();
                int i12 = eVar2.f12019a;
                if ((i12 & 17) == 17) {
                    int i13 = -childAt2.getTop();
                    int i14 = -childAt2.getBottom();
                    if (i10 == 0) {
                        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                        if (f0.d.b(t4) && f0.d.b(childAt2)) {
                            i13 -= t4.getTopInset();
                        }
                    }
                    if ((i12 & 2) == 2) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        WeakHashMap<View, n0> weakHashMap2 = f0.f31435a;
                        i14 += f0.d.d(childAt2);
                    } else {
                        if ((i12 & 5) == 5) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            WeakHashMap<View, n0> weakHashMap3 = f0.f31435a;
                            int d10 = f0.d.d(childAt2) + i14;
                            if (t10 < d10) {
                                i13 = d10;
                            } else {
                                i14 = d10;
                            }
                        }
                    }
                    if ((i12 & 32) != 32) {
                        z10 = false;
                    }
                    if (z10) {
                        i13 += ((LinearLayout.LayoutParams) eVar2).topMargin;
                        i14 -= ((LinearLayout.LayoutParams) eVar2).bottomMargin;
                    }
                    if (t10 < (i14 + i13) / 2) {
                        i13 = i14;
                    }
                    B(coordinatorLayout, t4, com.google.android.play.core.assetpacks.c.n(i13 + paddingTop, -t4.getTotalScrollRange(), 0));
                }
            }
        }

        public final void H(CoordinatorLayout coordinatorLayout, T t4) {
            View view;
            boolean z10;
            boolean z11;
            boolean z12;
            f0.l(coordinatorLayout, f.a.f31956h.a());
            boolean z13 = false;
            f0.i(coordinatorLayout, 0);
            f0.l(coordinatorLayout, f.a.f31957i.a());
            f0.i(coordinatorLayout, 0);
            if (t4.getTotalScrollRange() == 0) {
                return;
            }
            int childCount = coordinatorLayout.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 < childCount) {
                    View childAt = coordinatorLayout.getChildAt(i10);
                    if (((CoordinatorLayout.f) childAt.getLayoutParams()).f3487a instanceof ScrollingViewBehavior) {
                        view = childAt;
                        break;
                    }
                    i10++;
                } else {
                    view = null;
                    break;
                }
            }
            if (view == null) {
                return;
            }
            int childCount2 = t4.getChildCount();
            int i11 = 0;
            while (true) {
                z10 = true;
                if (i11 < childCount2) {
                    if (((e) t4.getChildAt(i11).getLayoutParams()).f12019a != 0) {
                        z11 = true;
                        break;
                    }
                    i11++;
                } else {
                    z11 = false;
                    break;
                }
            }
            if (!z11) {
                return;
            }
            if (f0.d(coordinatorLayout) != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z12) {
                f0.o(coordinatorLayout, new a());
            }
            if (t() != (-t4.getTotalScrollRange())) {
                f0.m(coordinatorLayout, f.a.f31956h, null, new com.google.android.material.appbar.c(t4, false));
                z13 = true;
            }
            if (t() != 0) {
                if (view.canScrollVertically(-1)) {
                    int i12 = -t4.getDownNestedPreScrollRange();
                    if (i12 != 0) {
                        f0.m(coordinatorLayout, f.a.f31957i, null, new com.google.android.material.appbar.b(this, coordinatorLayout, t4, view, i12));
                    }
                } else {
                    f0.m(coordinatorLayout, f.a.f31957i, null, new com.google.android.material.appbar.c(t4, true));
                }
                this.f12010o = z10;
            }
            z10 = z13;
            this.f12010o = z10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v12, types: [g8.c] */
        @Override // g8.h, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
            boolean z10;
            int round;
            final AppBarLayout appBarLayout = (AppBarLayout) view;
            super.h(coordinatorLayout, appBarLayout, i10);
            int pendingAction = appBarLayout.getPendingAction();
            b bVar = this.f12008m;
            if (bVar != null && (pendingAction & 8) == 0) {
                if (bVar.c) {
                    A(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
                } else if (bVar.f12012d) {
                    A(coordinatorLayout, appBarLayout, 0);
                } else {
                    View childAt = appBarLayout.getChildAt(bVar.f12013e);
                    int i11 = -childAt.getBottom();
                    if (this.f12008m.f12015g) {
                        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                        round = appBarLayout.getTopInset() + f0.d.d(childAt) + i11;
                    } else {
                        round = Math.round(childAt.getHeight() * this.f12008m.f12014f) + i11;
                    }
                    A(coordinatorLayout, appBarLayout, round);
                }
            } else if (pendingAction != 0) {
                if ((pendingAction & 4) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((pendingAction & 2) != 0) {
                    int i12 = -appBarLayout.getUpNestedPreScrollRange();
                    if (z10) {
                        B(coordinatorLayout, appBarLayout, i12);
                    } else {
                        A(coordinatorLayout, appBarLayout, i12);
                    }
                } else if ((pendingAction & 1) != 0) {
                    if (z10) {
                        B(coordinatorLayout, appBarLayout, 0);
                    } else {
                        A(coordinatorLayout, appBarLayout, 0);
                    }
                }
            }
            appBarLayout.f11986f = 0;
            this.f12008m = null;
            int n10 = com.google.android.play.core.assetpacks.c.n(s(), -appBarLayout.getTotalScrollRange(), 0);
            i iVar = this.f17691a;
            if (iVar != null) {
                iVar.b(n10);
            } else {
                this.f17692b = n10;
            }
            I(coordinatorLayout, appBarLayout, s(), 0, true);
            appBarLayout.d(s());
            H(coordinatorLayout, appBarLayout);
            final View D = D(coordinatorLayout);
            if (D != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    D.addOnUnhandledKeyEventListener(new View.OnUnhandledKeyEventListener() { // from class: g8.c
                        @Override // android.view.View.OnUnhandledKeyEventListener
                        public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                            AppBarLayout.BaseBehavior baseBehavior = AppBarLayout.BaseBehavior.this;
                            View view3 = D;
                            AppBarLayout appBarLayout2 = appBarLayout;
                            baseBehavior.getClass();
                            AppBarLayout.BaseBehavior.C(keyEvent, view3, appBarLayout2);
                            return false;
                        }
                    });
                } else {
                    D.setOnKeyListener(new View.OnKeyListener() { // from class: g8.d
                        @Override // android.view.View.OnKeyListener
                        public final boolean onKey(View view2, int i13, KeyEvent keyEvent) {
                            AppBarLayout.BaseBehavior.this.getClass();
                            AppBarLayout.BaseBehavior.C(keyEvent, D, appBarLayout);
                            return false;
                        }
                    });
                }
            }
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) appBarLayout.getLayoutParams())).height != -2) {
                return false;
            }
            coordinatorLayout.v(appBarLayout, i10, i11, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final /* bridge */ /* synthetic */ void k(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
            E(coordinatorLayout, (AppBarLayout) view, view2, i11, iArr);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void l(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i12 < 0) {
                iArr[1] = z(coordinatorLayout, appBarLayout, t() - i12, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i12 == 0) {
                H(coordinatorLayout, appBarLayout);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void n(View view, Parcelable parcelable) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (parcelable instanceof b) {
                b bVar = this.f12008m;
                this.f12008m = (b) parcelable;
                return;
            }
            this.f12008m = null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final Parcelable o(View view) {
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            b F = F(absSavedState, (AppBarLayout) view);
            if (F != null) {
                return F;
            }
            return absSavedState;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
            if (r2 != false) goto L15;
         */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean p(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4, android.view.View r5, int r6, int r7) {
            /*
                r1 = this;
                com.google.android.material.appbar.AppBarLayout r3 = (com.google.android.material.appbar.AppBarLayout) r3
                r5 = r6 & 2
                r6 = 0
                if (r5 == 0) goto L2c
                boolean r5 = r3.f11992l
                r0 = 1
                if (r5 != 0) goto L2b
                int r5 = r3.getTotalScrollRange()
                if (r5 == 0) goto L14
                r5 = r0
                goto L15
            L14:
                r5 = r6
            L15:
                if (r5 == 0) goto L28
                int r2 = r2.getHeight()
                int r4 = r4.getHeight()
                int r2 = r2 - r4
                int r3 = r3.getHeight()
                if (r2 > r3) goto L28
                r2 = r0
                goto L29
            L28:
                r2 = r6
            L29:
                if (r2 == 0) goto L2c
            L2b:
                r6 = r0
            L2c:
                if (r6 == 0) goto L35
                android.animation.ValueAnimator r2 = r1.f12007l
                if (r2 == 0) goto L35
                r2.cancel()
            L35:
                r2 = 0
                r1.f12009n = r2
                r1.f12006k = r7
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.p(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, android.view.View, int, int):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i10) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f12006k == 0 || i10 == 1) {
                G(coordinatorLayout, appBarLayout);
                if (appBarLayout.f11992l) {
                    appBarLayout.f(appBarLayout.g(view2));
                }
            }
            this.f12009n = new WeakReference<>(view2);
        }

        @Override // g8.h
        public final int t() {
            return s() + this.f12005j;
        }

        @Override // g8.f
        public final boolean v(View view) {
            View view2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            WeakReference<View> weakReference = this.f12009n;
            if (weakReference != null && ((view2 = weakReference.get()) == null || !view2.isShown() || view2.canScrollVertically(-1))) {
                return false;
            }
            return true;
        }

        @Override // g8.f
        public final int w(View view) {
            return -((AppBarLayout) view).getDownNestedScrollRange();
        }

        @Override // g8.f
        public final int x(View view) {
            return ((AppBarLayout) view).getTotalScrollRange();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // g8.f
        public final void y(View view, CoordinatorLayout coordinatorLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            G(coordinatorLayout, appBarLayout);
            if (appBarLayout.f11992l) {
                appBarLayout.f(appBarLayout.g(D(coordinatorLayout)));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // g8.f
        public final int z(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
            int i13;
            boolean z10;
            int i14;
            int i15;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int t4 = t();
            int i16 = 0;
            if (i11 != 0 && t4 >= i11 && t4 <= i12) {
                int n10 = com.google.android.play.core.assetpacks.c.n(i10, i11, i12);
                if (t4 != n10) {
                    if (appBarLayout.f11985e) {
                        int abs = Math.abs(n10);
                        int childCount = appBarLayout.getChildCount();
                        int i17 = 0;
                        while (true) {
                            if (i17 >= childCount) {
                                break;
                            }
                            View childAt = appBarLayout.getChildAt(i17);
                            e eVar = (e) childAt.getLayoutParams();
                            Interpolator interpolator = eVar.c;
                            if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                                if (interpolator != null) {
                                    int i18 = eVar.f12019a;
                                    if ((i18 & 1) != 0) {
                                        i15 = childAt.getHeight() + ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin + 0;
                                        if ((i18 & 2) != 0) {
                                            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                                            i15 -= f0.d.d(childAt);
                                        }
                                    } else {
                                        i15 = 0;
                                    }
                                    WeakHashMap<View, n0> weakHashMap2 = f0.f31435a;
                                    if (f0.d.b(childAt)) {
                                        i15 -= appBarLayout.getTopInset();
                                    }
                                    if (i15 > 0) {
                                        float f10 = i15;
                                        i13 = (childAt.getTop() + Math.round(interpolator.getInterpolation((abs - childAt.getTop()) / f10) * f10)) * Integer.signum(n10);
                                    }
                                }
                            } else {
                                i17++;
                            }
                        }
                    }
                    i13 = n10;
                    i iVar = this.f17691a;
                    if (iVar != null) {
                        z10 = iVar.b(i13);
                    } else {
                        this.f17692b = i13;
                        z10 = false;
                    }
                    int i19 = t4 - n10;
                    this.f12005j = n10 - i13;
                    int i20 = 1;
                    if (z10) {
                        int i21 = 0;
                        while (i21 < appBarLayout.getChildCount()) {
                            e eVar2 = (e) appBarLayout.getChildAt(i21).getLayoutParams();
                            d dVar = eVar2.f12020b;
                            if (dVar != null && (eVar2.f12019a & i20) != 0) {
                                View childAt2 = appBarLayout.getChildAt(i21);
                                Rect rect = dVar.f12017a;
                                childAt2.getDrawingRect(rect);
                                appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect);
                                rect.offset(0, -appBarLayout.getTopInset());
                                float abs2 = rect.top - Math.abs(s());
                                if (abs2 <= 0.0f) {
                                    float m10 = 1.0f - com.google.android.play.core.assetpacks.c.m(Math.abs(abs2 / rect.height()), 0.0f, 1.0f);
                                    float height = (-abs2) - ((rect.height() * 0.3f) * (1.0f - (m10 * m10)));
                                    childAt2.setTranslationY(height);
                                    Rect rect2 = dVar.f12018b;
                                    childAt2.getDrawingRect(rect2);
                                    rect2.offset(0, (int) (-height));
                                    WeakHashMap<View, n0> weakHashMap3 = f0.f31435a;
                                    f0.f.c(childAt2, rect2);
                                } else {
                                    WeakHashMap<View, n0> weakHashMap4 = f0.f31435a;
                                    f0.f.c(childAt2, null);
                                    childAt2.setTranslationY(0.0f);
                                }
                            }
                            i21++;
                            i20 = 1;
                        }
                    }
                    if (!z10 && appBarLayout.f11985e) {
                        coordinatorLayout.g(appBarLayout);
                    }
                    appBarLayout.d(s());
                    if (n10 < t4) {
                        i14 = -1;
                    } else {
                        i14 = 1;
                    }
                    I(coordinatorLayout, appBarLayout, n10, i14, false);
                    i16 = i19;
                }
            } else {
                this.f12005j = 0;
            }
            H(coordinatorLayout, appBarLayout);
            return i16;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes2.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes2.dex */
    public static class ScrollingViewBehavior extends g8.g {
        public ScrollingViewBehavior() {
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean b(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            int n10;
            CoordinatorLayout.c cVar = ((CoordinatorLayout.f) view2.getLayoutParams()).f3487a;
            if (cVar instanceof BaseBehavior) {
                int bottom = (view2.getBottom() - view.getTop()) + ((BaseBehavior) cVar).f12005j + this.f17689e;
                if (this.f17690f == 0) {
                    n10 = 0;
                } else {
                    float w7 = w(view2);
                    int i10 = this.f17690f;
                    n10 = com.google.android.play.core.assetpacks.c.n((int) (w7 * i10), 0, i10);
                }
                int i11 = bottom - n10;
                WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                view.offsetTopAndBottom(i11);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.f11992l) {
                    appBarLayout.f(appBarLayout.g(view));
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void e(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                f0.l(coordinatorLayout, f.a.f31956h.a());
                f0.i(coordinatorLayout, 0);
                f0.l(coordinatorLayout, f.a.f31957i.a());
                f0.i(coordinatorLayout, 0);
                f0.o(coordinatorLayout, null);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean m(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
            AppBarLayout appBarLayout;
            ArrayList i10 = coordinatorLayout.i(view);
            int size = i10.size();
            int i11 = 0;
            while (true) {
                if (i11 < size) {
                    View view2 = (View) i10.get(i11);
                    if (view2 instanceof AppBarLayout) {
                        appBarLayout = (AppBarLayout) view2;
                        break;
                    }
                    i11++;
                } else {
                    appBarLayout = null;
                    break;
                }
            }
            if (appBarLayout != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                int width = coordinatorLayout.getWidth();
                int height = coordinatorLayout.getHeight();
                Rect rect3 = this.c;
                rect3.set(0, 0, width, height);
                if (!rect3.contains(rect2)) {
                    appBarLayout.e(false, !z10, true);
                    return true;
                }
            }
            return false;
        }

        @Override // g8.g
        public final AppBarLayout v(ArrayList arrayList) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = (View) arrayList.get(i10);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // g8.g
        public final float w(View view) {
            int i10;
            int i11;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                CoordinatorLayout.c cVar = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).f3487a;
                if (cVar instanceof BaseBehavior) {
                    i10 = ((BaseBehavior) cVar).t();
                } else {
                    i10 = 0;
                }
                if ((downNestedPreScrollRange == 0 || totalScrollRange + i10 > downNestedPreScrollRange) && (i11 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (i10 / i11) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // g8.g
        public final int x(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).getTotalScrollRange();
            }
            return view.getMeasuredHeight();
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e8.a.S);
            this.f17690f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes2.dex */
    public class a implements u {
        public a() {
        }

        @Override // x0.u
        public final s0 m(View view, s0 s0Var) {
            s0 s0Var2;
            boolean z10;
            AppBarLayout appBarLayout = AppBarLayout.this;
            appBarLayout.getClass();
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            if (f0.d.b(appBarLayout)) {
                s0Var2 = s0Var;
            } else {
                s0Var2 = null;
            }
            if (!w0.b.a(appBarLayout.f11987g, s0Var2)) {
                appBarLayout.f11987g = s0Var2;
                if (appBarLayout.f12002v != null && appBarLayout.getTopInset() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                appBarLayout.setWillNotDraw(!z10);
                appBarLayout.requestLayout();
            }
            return s0Var;
        }
    }

    /* loaded from: classes2.dex */
    public interface b<T extends AppBarLayout> {
        void a(T t4, int i10);
    }

    /* loaded from: classes2.dex */
    public static abstract class c {
    }

    /* loaded from: classes2.dex */
    public static class d extends c {

        /* renamed from: a  reason: collision with root package name */
        public final Rect f12017a = new Rect();

        /* renamed from: b  reason: collision with root package name */
        public final Rect f12018b = new Rect();
    }

    /* loaded from: classes2.dex */
    public interface f {
        void a();
    }

    /* loaded from: classes2.dex */
    public interface g extends b<AppBarLayout> {
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    public static e b(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new e((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new e(layoutParams);
    }

    public final void a(g gVar) {
        if (this.f11988h == null) {
            this.f11988h = new ArrayList();
        }
        if (gVar != null && !this.f11988h.contains(gVar)) {
            this.f11988h.add(gVar);
        }
    }

    public final void c() {
        BaseBehavior.b bVar;
        Behavior behavior = this.f12004x;
        if (behavior != null && this.f11983b != -1 && this.f11986f == 0) {
            bVar = behavior.F(c1.a.f5505b, this);
        } else {
            bVar = null;
        }
        this.f11983b = -1;
        this.c = -1;
        this.f11984d = -1;
        if (bVar != null) {
            Behavior behavior2 = this.f12004x;
            if (behavior2.f12008m == null) {
                behavior2.f12008m = bVar;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    public final void d(int i10) {
        this.f11982a = i10;
        if (!willNotDraw()) {
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            f0.d.k(this);
        }
        ArrayList arrayList = this.f11988h;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = (b) this.f11988h.get(i11);
                if (bVar != null) {
                    bVar.a(this, i10);
                }
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z10;
        super.draw(canvas);
        if (this.f12002v != null && getTopInset() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.f11982a);
            this.f12002v.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f12002v;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final void e(boolean z10, boolean z11, boolean z12) {
        int i10;
        int i11;
        if (z10) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        int i12 = 0;
        if (z11) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        int i13 = i10 | i11;
        if (z12) {
            i12 = 8;
        }
        this.f11986f = i13 | i12;
        requestLayout();
    }

    public final boolean f(boolean z10) {
        float f10;
        float f11;
        if ((!this.f11989i) && this.f11991k != z10) {
            this.f11991k = z10;
            refreshDrawableState();
            if (!this.f11992l || !(getBackground() instanceof h)) {
                return true;
            }
            float f12 = 0.0f;
            if (this.f11995o != null) {
                if (z10) {
                    f11 = 0.0f;
                } else {
                    f11 = 255.0f;
                }
                if (z10) {
                    f12 = 255.0f;
                }
                i(f11, f12);
                return true;
            }
            float f13 = this.f12003w;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = f13;
            }
            if (z10) {
                f12 = f13;
            }
            i(f10, f12);
            return true;
        }
        return false;
    }

    public final boolean g(View view) {
        int i10;
        View view2;
        View view3 = null;
        if (this.f11994n == null && (i10 = this.f11993m) != -1) {
            if (view != null) {
                view2 = view.findViewById(i10);
            } else {
                view2 = null;
            }
            if (view2 == null && (getParent() instanceof ViewGroup)) {
                view2 = ((ViewGroup) getParent()).findViewById(this.f11993m);
            }
            if (view2 != null) {
                this.f11994n = new WeakReference<>(view2);
            }
        }
        WeakReference<View> weakReference = this.f11994n;
        if (weakReference != null) {
            view3 = weakReference.get();
        }
        if (view3 != null) {
            view = view3;
        }
        if (view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0)) {
            return true;
        }
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.f12004x = behavior;
        return behavior;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int getDownNestedPreScrollRange() {
        /*
            r9 = this;
            int r0 = r9.c
            r1 = -1
            if (r0 == r1) goto L6
            return r0
        L6:
            int r0 = r9.getChildCount()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = r1
        Le:
            if (r0 < 0) goto L69
            android.view.View r3 = r9.getChildAt(r0)
            int r4 = r3.getVisibility()
            r5 = 8
            if (r4 != r5) goto L1d
            goto L66
        L1d:
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$e r4 = (com.google.android.material.appbar.AppBarLayout.e) r4
            int r5 = r3.getMeasuredHeight()
            int r6 = r4.f12019a
            r7 = r6 & 5
            r8 = 5
            if (r7 != r8) goto L63
            int r7 = r4.topMargin
            int r4 = r4.bottomMargin
            int r7 = r7 + r4
            r4 = r6 & 8
            if (r4 == 0) goto L3f
            java.util.WeakHashMap<android.view.View, x0.n0> r4 = x0.f0.f31435a
            int r4 = x0.f0.d.d(r3)
        L3d:
            int r4 = r4 + r7
            goto L4e
        L3f:
            r4 = r6 & 2
            if (r4 == 0) goto L4c
            java.util.WeakHashMap<android.view.View, x0.n0> r4 = x0.f0.f31435a
            int r4 = x0.f0.d.d(r3)
            int r4 = r5 - r4
            goto L3d
        L4c:
            int r4 = r7 + r5
        L4e:
            if (r0 != 0) goto L61
            java.util.WeakHashMap<android.view.View, x0.n0> r6 = x0.f0.f31435a
            boolean r3 = x0.f0.d.b(r3)
            if (r3 == 0) goto L61
            int r3 = r9.getTopInset()
            int r5 = r5 - r3
            int r4 = java.lang.Math.min(r4, r5)
        L61:
            int r2 = r2 + r4
            goto L66
        L63:
            if (r2 <= 0) goto L66
            goto L69
        L66:
            int r0 = r0 + (-1)
            goto Le
        L69:
            int r0 = java.lang.Math.max(r1, r2)
            r9.c = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.getDownNestedPreScrollRange():int");
    }

    public int getDownNestedScrollRange() {
        int i10 = this.f11984d;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredHeight = ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin + childAt.getMeasuredHeight();
                int i13 = eVar.f12019a;
                if ((i13 & 1) == 0) {
                    break;
                }
                i12 += measuredHeight;
                if ((i13 & 2) != 0) {
                    WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                    i12 -= f0.d.d(childAt);
                    break;
                }
            }
            i11++;
        }
        int max = Math.max(0, i12);
        this.f11984d = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f11993m;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        int d10 = f0.d.d(this);
        if (d10 == 0) {
            int childCount = getChildCount();
            if (childCount >= 1) {
                d10 = f0.d.d(getChildAt(childCount - 1));
            } else {
                d10 = 0;
            }
            if (d10 == 0) {
                return getHeight() / 3;
            }
        }
        return (d10 * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f11986f;
    }

    public Drawable getStatusBarForeground() {
        return this.f12002v;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        s0 s0Var = this.f11987g;
        if (s0Var != null) {
            return s0Var.e();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i10 = this.f11983b;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i13 = eVar.f12019a;
                if ((i13 & 1) == 0) {
                    break;
                }
                int i14 = measuredHeight + ((LinearLayout.LayoutParams) eVar).topMargin + ((LinearLayout.LayoutParams) eVar).bottomMargin + i12;
                if (i11 == 0) {
                    WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                    if (f0.d.b(childAt)) {
                        i14 -= getTopInset();
                    }
                }
                i12 = i14;
                if ((i13 & 2) != 0) {
                    WeakHashMap<View, n0> weakHashMap2 = f0.f31435a;
                    i12 -= f0.d.d(childAt);
                    break;
                }
            }
            i11++;
        }
        int max = Math.max(0, i12);
        this.f11983b = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public final boolean h() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8) {
            return false;
        }
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        if (f0.d.b(childAt)) {
            return false;
        }
        return true;
    }

    public final void i(float f10, float f11) {
        ValueAnimator valueAnimator = this.f11996p;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
        this.f11996p = ofFloat;
        ofFloat.setDuration(this.f11999s);
        this.f11996p.setInterpolator(this.f12000t);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f11997q;
        if (animatorUpdateListener != null) {
            this.f11996p.addUpdateListener(animatorUpdateListener);
        }
        this.f11996p.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b.b.X(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if (this.f12001u == null) {
            this.f12001u = new int[4];
        }
        int[] iArr = this.f12001u;
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + iArr.length);
        boolean z10 = this.f11990j;
        if (z10) {
            i11 = R.attr.state_liftable;
        } else {
            i11 = -2130969873;
        }
        iArr[0] = i11;
        if (z10 && this.f11991k) {
            i12 = R.attr.state_lifted;
        } else {
            i12 = -2130969874;
        }
        iArr[1] = i12;
        if (z10) {
            i13 = R.attr.state_collapsible;
        } else {
            i13 = -2130969869;
        }
        iArr[2] = i13;
        if (z10 && this.f11991k) {
            i14 = R.attr.state_collapsed;
        } else {
            i14 = -2130969868;
        }
        iArr[3] = i14;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.f11994n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f11994n = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        boolean z12;
        super.onLayout(z10, i10, i11, i12, i13);
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        boolean z13 = true;
        if (f0.d.b(this) && h()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                getChildAt(childCount).offsetTopAndBottom(topInset);
            }
        }
        c();
        this.f11985e = false;
        int childCount2 = getChildCount();
        int i14 = 0;
        while (true) {
            if (i14 >= childCount2) {
                break;
            } else if (((e) getChildAt(i14).getLayoutParams()).c != null) {
                this.f11985e = true;
                break;
            } else {
                i14++;
            }
        }
        Drawable drawable = this.f12002v;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.f11989i) {
            if (!this.f11992l) {
                int childCount3 = getChildCount();
                int i15 = 0;
                while (true) {
                    if (i15 < childCount3) {
                        int i16 = ((e) getChildAt(i15).getLayoutParams()).f12019a;
                        if ((i16 & 1) == 1 && (i16 & 10) != 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            z11 = true;
                            break;
                        }
                        i15++;
                    } else {
                        z11 = false;
                        break;
                    }
                }
                if (!z11) {
                    z13 = false;
                }
            }
            if (this.f11990j != z13) {
                this.f11990j = z13;
                refreshDrawableState();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != 1073741824) {
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            if (f0.d.b(this) && h()) {
                int measuredHeight = getMeasuredHeight();
                if (mode != Integer.MIN_VALUE) {
                    if (mode == 0) {
                        measuredHeight += getTopInset();
                    }
                } else {
                    measuredHeight = com.google.android.play.core.assetpacks.c.n(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i11));
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        c();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        b.b.V(this, f10);
    }

    public void setExpanded(boolean z10) {
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        e(z10, f0.g.c(this), true);
    }

    public void setLiftOnScroll(boolean z10) {
        this.f11992l = z10;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.f11993m = -1;
        if (view == null) {
            WeakReference<View> weakReference = this.f11994n;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f11994n = null;
            return;
        }
        this.f11994n = new WeakReference<>(view);
    }

    public void setLiftOnScrollTargetViewId(int i10) {
        this.f11993m = i10;
        WeakReference<View> weakReference = this.f11994n;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f11994n = null;
    }

    public void setLiftableOverrideEnabled(boolean z10) {
        this.f11989i = z10;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i10) {
        if (i10 == 1) {
            super.setOrientation(i10);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        boolean z10;
        Drawable drawable2 = this.f12002v;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f12002v = drawable3;
            boolean z11 = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f12002v.setState(getDrawableState());
                }
                Drawable drawable4 = this.f12002v;
                WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                a.c.b(drawable4, f0.e.d(this));
                Drawable drawable5 = this.f12002v;
                if (getVisibility() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                drawable5.setVisible(z10, false);
                this.f12002v.setCallback(this);
            }
            if (this.f12002v != null && getTopInset() > 0) {
                z11 = true;
            }
            setWillNotDraw(!z11);
            WeakHashMap<View, n0> weakHashMap2 = f0.f31435a;
            f0.d.k(this);
        }
    }

    public void setStatusBarForegroundColor(int i10) {
        setStatusBarForeground(new ColorDrawable(i10));
    }

    public void setStatusBarForegroundResource(int i10) {
        setStatusBarForeground(m.a.a(getContext(), i10));
    }

    @Deprecated
    public void setTargetElevation(float f10) {
        j.a(this, f10);
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
        Drawable drawable = this.f12002v;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f12002v) {
            return false;
        }
        return true;
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.appBarLayoutStyle);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new e();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    /* JADX WARN: Finally extract failed */
    public AppBarLayout(Context context, AttributeSet attributeSet, int i10) {
        super(l9.a.a(context, attributeSet, i10, 2132018034), attributeSet, i10);
        this.f11983b = -1;
        this.c = -1;
        this.f11984d = -1;
        this.f11986f = 0;
        this.f11998r = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        int i11 = Build.VERSION.SDK_INT;
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray d10 = s.d(context3, attributeSet, j.f17696a, i10, 2132018034, new int[0]);
        try {
            if (d10.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, d10.getResourceId(0, 0)));
            }
            d10.recycle();
            TypedArray d11 = s.d(context2, attributeSet, e8.a.f16473a, i10, 2132018034, new int[0]);
            Drawable drawable = d11.getDrawable(0);
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            f0.d.q(this, drawable);
            ColorStateList a10 = b9.c.a(context2, d11, 6);
            this.f11995o = a10;
            if (getBackground() instanceof ColorDrawable) {
                h hVar = new h();
                hVar.n(ColorStateList.valueOf(((ColorDrawable) getBackground()).getColor()));
                if (a10 != null) {
                    hVar.setAlpha(this.f11991k ? FunctionEval.FunctionID.EXTERNAL_FUNC : 0);
                    hVar.n(a10);
                    this.f11997q = new g8.a(0, this, hVar);
                } else {
                    hVar.k(context2);
                    this.f11997q = new g8.b(0, this, hVar);
                }
                f0.d.q(this, hVar);
            }
            this.f11999s = x8.a.c(context2, R.attr.motionDurationMedium2, getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.f12000t = x8.a.d(context2, R.attr.motionEasingStandardInterpolator, f8.b.f17141a);
            if (d11.hasValue(4)) {
                e(d11.getBoolean(4, false), false, false);
            }
            if (d11.hasValue(3)) {
                j.a(this, d11.getDimensionPixelSize(3, 0));
            }
            if (i11 >= 26) {
                if (d11.hasValue(2)) {
                    setKeyboardNavigationCluster(d11.getBoolean(2, false));
                }
                if (d11.hasValue(1)) {
                    setTouchscreenBlocksFocus(d11.getBoolean(1, false));
                }
            }
            this.f12003w = getResources().getDimension(R.dimen.design_appbar_elevation);
            this.f11992l = d11.getBoolean(5, false);
            this.f11993m = d11.getResourceId(7, -1);
            setStatusBarForeground(d11.getDrawable(8));
            d11.recycle();
            f0.i.u(this, new a());
        } catch (Throwable th2) {
            d10.recycle();
            throw th2;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* loaded from: classes2.dex */
    public static class e extends LinearLayout.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f12019a;

        /* renamed from: b  reason: collision with root package name */
        public d f12020b;
        public final Interpolator c;

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f12019a = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e8.a.f16475b);
            this.f12019a = obtainStyledAttributes.getInt(1, 0);
            this.f12020b = obtainStyledAttributes.getInt(0, 0) != 1 ? null : new d();
            if (obtainStyledAttributes.hasValue(2)) {
                this.c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(2, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public e() {
            super(-1, -2);
            this.f12019a = 1;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f12019a = 1;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f12019a = 1;
        }

        public e(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f12019a = 1;
        }
    }
}
