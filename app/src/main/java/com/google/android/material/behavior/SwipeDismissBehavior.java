package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import d1.c;
import java.util.WeakHashMap;
import x0.f0;
import x0.n0;
import y0.f;

/* loaded from: classes2.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    public c f12070a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f12071b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public int f12072d = 2;

    /* renamed from: e  reason: collision with root package name */
    public final float f12073e = 0.5f;

    /* renamed from: f  reason: collision with root package name */
    public float f12074f = 0.0f;

    /* renamed from: g  reason: collision with root package name */
    public float f12075g = 0.5f;

    /* renamed from: h  reason: collision with root package name */
    public final a f12076h = new a();

    /* loaded from: classes2.dex */
    public class a extends c.AbstractC0191c {

        /* renamed from: a  reason: collision with root package name */
        public int f12077a;

        /* renamed from: b  reason: collision with root package name */
        public int f12078b = -1;

        public a() {
        }

        @Override // d1.c.AbstractC0191c
        public final int a(View view, int i10) {
            boolean z10;
            int width;
            int width2;
            int width3;
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            if (f0.e.d(view) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i11 = SwipeDismissBehavior.this.f12072d;
            if (i11 == 0) {
                if (z10) {
                    width = this.f12077a - view.getWidth();
                    width2 = this.f12077a;
                } else {
                    width = this.f12077a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i11 == 1) {
                if (z10) {
                    width = this.f12077a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                } else {
                    width = this.f12077a - view.getWidth();
                    width2 = this.f12077a;
                }
            } else {
                width = this.f12077a - view.getWidth();
                width2 = view.getWidth() + this.f12077a;
            }
            return Math.min(Math.max(width, i10), width2);
        }

        @Override // d1.c.AbstractC0191c
        public final int b(View view, int i10) {
            return view.getTop();
        }

        @Override // d1.c.AbstractC0191c
        public final int c(View view) {
            return view.getWidth();
        }

        @Override // d1.c.AbstractC0191c
        public final void g(View view, int i10) {
            this.f12078b = i10;
            this.f12077a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
                swipeDismissBehavior.c = true;
                parent.requestDisallowInterceptTouchEvent(true);
                swipeDismissBehavior.c = false;
            }
        }

        @Override // d1.c.AbstractC0191c
        public final void h(int i10) {
            SwipeDismissBehavior.this.getClass();
        }

        @Override // d1.c.AbstractC0191c
        public final void i(View view, int i10, int i11) {
            SwipeDismissBehavior swipeDismissBehavior = SwipeDismissBehavior.this;
            float width = view.getWidth() * swipeDismissBehavior.f12074f;
            float width2 = view.getWidth() * swipeDismissBehavior.f12075g;
            float abs = Math.abs(i10 - this.f12077a);
            if (abs <= width) {
                view.setAlpha(1.0f);
            } else if (abs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - width) / (width2 - width))), 1.0f));
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
            if (java.lang.Math.abs(r9.getLeft() - r8.f12077a) >= java.lang.Math.round(r9.getWidth() * r3.f12073e)) goto L33;
         */
        @Override // d1.c.AbstractC0191c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void j(android.view.View r9, float r10, float r11) {
            /*
                r8 = this;
                r11 = -1
                r8.f12078b = r11
                int r11 = r9.getWidth()
                r0 = 0
                int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                r2 = 1
                com.google.android.material.behavior.SwipeDismissBehavior r3 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r4 = 0
                if (r1 == 0) goto L39
                java.util.WeakHashMap<android.view.View, x0.n0> r5 = x0.f0.f31435a
                int r5 = x0.f0.e.d(r9)
                if (r5 != r2) goto L1a
                r5 = r2
                goto L1b
            L1a:
                r5 = r4
            L1b:
                int r6 = r3.f12072d
                r7 = 2
                if (r6 != r7) goto L21
                goto L52
            L21:
                if (r6 != 0) goto L2d
                if (r5 == 0) goto L2a
                int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r1 >= 0) goto L54
                goto L52
            L2a:
                if (r1 <= 0) goto L54
                goto L52
            L2d:
                if (r6 != r2) goto L54
                if (r5 == 0) goto L34
                if (r1 <= 0) goto L54
                goto L52
            L34:
                int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r1 >= 0) goto L54
                goto L52
            L39:
                int r1 = r9.getLeft()
                int r5 = r8.f12077a
                int r1 = r1 - r5
                int r5 = r9.getWidth()
                float r5 = (float) r5
                float r6 = r3.f12073e
                float r5 = r5 * r6
                int r5 = java.lang.Math.round(r5)
                int r1 = java.lang.Math.abs(r1)
                if (r1 < r5) goto L54
            L52:
                r1 = r2
                goto L55
            L54:
                r1 = r4
            L55:
                if (r1 == 0) goto L6b
                int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r10 < 0) goto L66
                int r10 = r9.getLeft()
                int r0 = r8.f12077a
                if (r10 >= r0) goto L64
                goto L66
            L64:
                int r0 = r0 + r11
                goto L6e
            L66:
                int r10 = r8.f12077a
                int r0 = r10 - r11
                goto L6e
            L6b:
                int r0 = r8.f12077a
                r2 = r4
            L6e:
                d1.c r10 = r3.f12070a
                int r11 = r9.getTop()
                boolean r10 = r10.s(r0, r11)
                if (r10 == 0) goto L84
                com.google.android.material.behavior.SwipeDismissBehavior$b r10 = new com.google.android.material.behavior.SwipeDismissBehavior$b
                r10.<init>(r9, r2)
                java.util.WeakHashMap<android.view.View, x0.n0> r11 = x0.f0.f31435a
                x0.f0.d.m(r9, r10)
            L84:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.j(android.view.View, float, float):void");
        }

        @Override // d1.c.AbstractC0191c
        public final boolean k(View view, int i10) {
            int i11 = this.f12078b;
            if ((i11 == -1 || i11 == i10) && SwipeDismissBehavior.this.s(view)) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final View f12079a;

        public b(View view, boolean z10) {
            this.f12079a = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c cVar = SwipeDismissBehavior.this.f12070a;
            if (cVar != null && cVar.h()) {
                WeakHashMap<View, n0> weakHashMap = f0.f31435a;
                f0.d.m(this.f12079a, this);
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean g(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        boolean z10 = this.f12071b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.f12071b = false;
            }
        } else {
            z10 = coordinatorLayout.s(v10, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f12071b = z10;
        }
        if (!z10) {
            return false;
        }
        if (this.f12070a == null) {
            this.f12070a = new c(coordinatorLayout.getContext(), coordinatorLayout, this.f12076h);
        }
        if (!this.c && this.f12070a.t(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean h(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        if (f0.d.c(v10) == 0) {
            f0.d.s(v10, 1);
            f0.l(v10, 1048576);
            f0.i(v10, 0);
            if (s(v10)) {
                f0.m(v10, f.a.f31960l, null, new i8.a(this));
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean r(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        if (this.f12070a != null) {
            if (!this.c || motionEvent.getActionMasked() != 3) {
                this.f12070a.m(motionEvent);
                return true;
            }
            return true;
        }
        return false;
    }

    public boolean s(View view) {
        return true;
    }
}
