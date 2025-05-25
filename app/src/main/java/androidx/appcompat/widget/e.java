package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;
import x0.f0;

/* compiled from: AppCompatBackgroundHelper.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final View f2568a;

    /* renamed from: d  reason: collision with root package name */
    public s0 f2570d;

    /* renamed from: e  reason: collision with root package name */
    public s0 f2571e;

    /* renamed from: f  reason: collision with root package name */
    public s0 f2572f;
    public int c = -1;

    /* renamed from: b  reason: collision with root package name */
    public final h f2569b = h.a();

    public e(View view) {
        this.f2568a = view;
    }

    public final void a() {
        boolean z10;
        View view = this.f2568a;
        Drawable background = view.getBackground();
        if (background != null) {
            boolean z11 = false;
            if (this.f2570d != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (this.f2572f == null) {
                    this.f2572f = new s0();
                }
                s0 s0Var = this.f2572f;
                s0Var.f2672a = null;
                s0Var.f2674d = false;
                s0Var.f2673b = null;
                s0Var.c = false;
                WeakHashMap<View, x0.n0> weakHashMap = x0.f0.f31435a;
                ColorStateList g10 = f0.i.g(view);
                if (g10 != null) {
                    s0Var.f2674d = true;
                    s0Var.f2672a = g10;
                }
                PorterDuff.Mode h10 = f0.i.h(view);
                if (h10 != null) {
                    s0Var.c = true;
                    s0Var.f2673b = h10;
                }
                if (s0Var.f2674d || s0Var.c) {
                    h.e(background, s0Var, view.getDrawableState());
                    z11 = true;
                }
                if (z11) {
                    return;
                }
            }
            s0 s0Var2 = this.f2571e;
            if (s0Var2 != null) {
                h.e(background, s0Var2, view.getDrawableState());
                return;
            }
            s0 s0Var3 = this.f2570d;
            if (s0Var3 != null) {
                h.e(background, s0Var3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        s0 s0Var = this.f2571e;
        if (s0Var != null) {
            return s0Var.f2672a;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        s0 s0Var = this.f2571e;
        if (s0Var != null) {
            return s0Var.f2673b;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i10) {
        ColorStateList i11;
        View view = this.f2568a;
        Context context = view.getContext();
        int[] iArr = k.a.C;
        u0 m10 = u0.m(context, attributeSet, iArr, i10, 0);
        View view2 = this.f2568a;
        x0.f0.n(view2, view2.getContext(), iArr, attributeSet, m10.f2688b, i10);
        try {
            if (m10.l(0)) {
                this.c = m10.i(0, -1);
                h hVar = this.f2569b;
                Context context2 = view.getContext();
                int i12 = this.c;
                synchronized (hVar) {
                    i11 = hVar.f2594a.i(context2, i12);
                }
                if (i11 != null) {
                    g(i11);
                }
            }
            if (m10.l(1)) {
                f0.i.q(view, m10.b(1));
            }
            if (m10.l(2)) {
                f0.i.r(view, a0.c(m10.h(2, -1), null));
            }
        } finally {
            m10.n();
        }
    }

    public final void e() {
        this.c = -1;
        g(null);
        a();
    }

    public final void f(int i10) {
        ColorStateList colorStateList;
        this.c = i10;
        h hVar = this.f2569b;
        if (hVar != null) {
            Context context = this.f2568a.getContext();
            synchronized (hVar) {
                colorStateList = hVar.f2594a.i(context, i10);
            }
        } else {
            colorStateList = null;
        }
        g(colorStateList);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f2570d == null) {
                this.f2570d = new s0();
            }
            s0 s0Var = this.f2570d;
            s0Var.f2672a = colorStateList;
            s0Var.f2674d = true;
        } else {
            this.f2570d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f2571e == null) {
            this.f2571e = new s0();
        }
        s0 s0Var = this.f2571e;
        s0Var.f2672a = colorStateList;
        s0Var.f2674d = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f2571e == null) {
            this.f2571e = new s0();
        }
        s0 s0Var = this.f2571e;
        s0Var.f2673b = mode;
        s0Var.c = true;
        a();
    }
}
