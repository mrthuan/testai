package x0;

import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;
import x0.d;
import x0.f0;

/* compiled from: WindowInsetsCompat.java */
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: b  reason: collision with root package name */
    public static final s0 f31497b;

    /* renamed from: a  reason: collision with root package name */
    public final k f31498a;

    /* compiled from: WindowInsetsCompat.java */
    @SuppressLint({"SoonBlockedPrivateApi"})
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final Field f31499a;

        /* renamed from: b  reason: collision with root package name */
        public static final Field f31500b;
        public static final Field c;

        /* renamed from: d  reason: collision with root package name */
        public static final boolean f31501d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f31499a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f31500b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                c = declaredField3;
                declaredField3.setAccessible(true);
                f31501d = true;
            } catch (ReflectiveOperationException e10) {
                e10.getMessage();
            }
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class d extends c {
        public d() {
        }

        @Override // x0.s0.e
        public void c(int i10, o0.b bVar) {
            this.c.setInsets(m.a(i10), bVar.d());
        }

        public d(s0 s0Var) {
            super(s0Var);
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final s0 f31507a;

        /* renamed from: b  reason: collision with root package name */
        public o0.b[] f31508b;

        public e() {
            this(new s0());
        }

        public final void a() {
            o0.b[] bVarArr = this.f31508b;
            if (bVarArr != null) {
                o0.b bVar = bVarArr[l.a(1)];
                o0.b bVar2 = this.f31508b[l.a(2)];
                s0 s0Var = this.f31507a;
                if (bVar2 == null) {
                    bVar2 = s0Var.a(2);
                }
                if (bVar == null) {
                    bVar = s0Var.a(1);
                }
                g(o0.b.a(bVar, bVar2));
                o0.b bVar3 = this.f31508b[l.a(16)];
                if (bVar3 != null) {
                    f(bVar3);
                }
                o0.b bVar4 = this.f31508b[l.a(32)];
                if (bVar4 != null) {
                    d(bVar4);
                }
                o0.b bVar5 = this.f31508b[l.a(64)];
                if (bVar5 != null) {
                    h(bVar5);
                }
            }
        }

        public s0 b() {
            throw null;
        }

        public void c(int i10, o0.b bVar) {
            if (this.f31508b == null) {
                this.f31508b = new o0.b[9];
            }
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    this.f31508b[l.a(i11)] = bVar;
                }
            }
        }

        public void e(o0.b bVar) {
            throw null;
        }

        public void g(o0.b bVar) {
            throw null;
        }

        public e(s0 s0Var) {
            this.f31507a = s0Var;
        }

        public void d(o0.b bVar) {
        }

        public void f(o0.b bVar) {
        }

        public void h(o0.b bVar) {
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class f extends k {

        /* renamed from: h  reason: collision with root package name */
        public static boolean f31509h = false;

        /* renamed from: i  reason: collision with root package name */
        public static Method f31510i;

        /* renamed from: j  reason: collision with root package name */
        public static Class<?> f31511j;

        /* renamed from: k  reason: collision with root package name */
        public static Field f31512k;

        /* renamed from: l  reason: collision with root package name */
        public static Field f31513l;
        public final WindowInsets c;

        /* renamed from: d  reason: collision with root package name */
        public o0.b[] f31514d;

        /* renamed from: e  reason: collision with root package name */
        public o0.b f31515e;

        /* renamed from: f  reason: collision with root package name */
        public s0 f31516f;

        /* renamed from: g  reason: collision with root package name */
        public o0.b f31517g;

        public f(s0 s0Var, WindowInsets windowInsets) {
            super(s0Var);
            this.f31515e = null;
            this.c = windowInsets;
        }

        @SuppressLint({"WrongConstant"})
        private o0.b r(int i10, boolean z10) {
            o0.b bVar = o0.b.f22638e;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    bVar = o0.b.a(bVar, s(i11, z10));
                }
            }
            return bVar;
        }

        private o0.b t() {
            s0 s0Var = this.f31516f;
            if (s0Var != null) {
                return s0Var.f31498a.h();
            }
            return o0.b.f22638e;
        }

        private o0.b u(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f31509h) {
                    v();
                }
                Method method = f31510i;
                if (method != null && f31511j != null && f31512k != null) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            return null;
                        }
                        Rect rect = (Rect) f31512k.get(f31513l.get(invoke));
                        if (rect == null) {
                            return null;
                        }
                        return o0.b.b(rect.left, rect.top, rect.right, rect.bottom);
                    } catch (ReflectiveOperationException e10) {
                        e10.getMessage();
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        @SuppressLint({"PrivateApi"})
        private static void v() {
            try {
                f31510i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f31511j = cls;
                f31512k = cls.getDeclaredField("mVisibleInsets");
                f31513l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f31512k.setAccessible(true);
                f31513l.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                e10.getMessage();
            }
            f31509h = true;
        }

        @Override // x0.s0.k
        public void d(View view) {
            o0.b u7 = u(view);
            if (u7 == null) {
                u7 = o0.b.f22638e;
            }
            w(u7);
        }

        @Override // x0.s0.k
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.f31517g, ((f) obj).f31517g);
        }

        @Override // x0.s0.k
        public o0.b f(int i10) {
            return r(i10, false);
        }

        @Override // x0.s0.k
        public final o0.b j() {
            if (this.f31515e == null) {
                WindowInsets windowInsets = this.c;
                this.f31515e = o0.b.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
            }
            return this.f31515e;
        }

        @Override // x0.s0.k
        public s0 l(int i10, int i11, int i12, int i13) {
            e bVar;
            s0 i14 = s0.i(null, this.c);
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 30) {
                bVar = new d(i14);
            } else if (i15 >= 29) {
                bVar = new c(i14);
            } else {
                bVar = new b(i14);
            }
            bVar.g(s0.f(j(), i10, i11, i12, i13));
            bVar.e(s0.f(h(), i10, i11, i12, i13));
            return bVar.b();
        }

        @Override // x0.s0.k
        public boolean n() {
            return this.c.isRound();
        }

        @Override // x0.s0.k
        public void o(o0.b[] bVarArr) {
            this.f31514d = bVarArr;
        }

        @Override // x0.s0.k
        public void p(s0 s0Var) {
            this.f31516f = s0Var;
        }

        public o0.b s(int i10, boolean z10) {
            int i11;
            x0.d e10;
            int i12 = 0;
            if (i10 != 1) {
                o0.b bVar = null;
                if (i10 != 2) {
                    o0.b bVar2 = o0.b.f22638e;
                    if (i10 != 8) {
                        if (i10 != 16) {
                            if (i10 != 32) {
                                if (i10 != 64) {
                                    if (i10 != 128) {
                                        return bVar2;
                                    }
                                    s0 s0Var = this.f31516f;
                                    if (s0Var != null) {
                                        e10 = s0Var.f31498a.e();
                                    } else {
                                        e10 = e();
                                    }
                                    if (e10 != null) {
                                        int a10 = e10.a();
                                        int c = e10.c();
                                        int b10 = e10.b();
                                        if (Build.VERSION.SDK_INT >= 28) {
                                            i12 = d.a.c(e10.f31432a);
                                        }
                                        return o0.b.b(a10, c, b10, i12);
                                    }
                                    return bVar2;
                                }
                                return k();
                            }
                            return g();
                        }
                        return i();
                    }
                    o0.b[] bVarArr = this.f31514d;
                    if (bVarArr != null) {
                        bVar = bVarArr[l.a(8)];
                    }
                    if (bVar != null) {
                        return bVar;
                    }
                    o0.b j10 = j();
                    o0.b t4 = t();
                    int i13 = j10.f22641d;
                    if (i13 > t4.f22641d) {
                        return o0.b.b(0, 0, 0, i13);
                    }
                    o0.b bVar3 = this.f31517g;
                    if (bVar3 != null && !bVar3.equals(bVar2) && (i11 = this.f31517g.f22641d) > t4.f22641d) {
                        return o0.b.b(0, 0, 0, i11);
                    }
                    return bVar2;
                } else if (z10) {
                    o0.b t10 = t();
                    o0.b h10 = h();
                    return o0.b.b(Math.max(t10.f22639a, h10.f22639a), 0, Math.max(t10.c, h10.c), Math.max(t10.f22641d, h10.f22641d));
                } else {
                    o0.b j11 = j();
                    s0 s0Var2 = this.f31516f;
                    if (s0Var2 != null) {
                        bVar = s0Var2.f31498a.h();
                    }
                    int i14 = j11.f22641d;
                    if (bVar != null) {
                        i14 = Math.min(i14, bVar.f22641d);
                    }
                    return o0.b.b(j11.f22639a, 0, j11.c, i14);
                }
            } else if (z10) {
                return o0.b.b(0, Math.max(t().f22640b, j().f22640b), 0, 0);
            } else {
                return o0.b.b(0, j().f22640b, 0, 0);
            }
        }

        public void w(o0.b bVar) {
            this.f31517g = bVar;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class g extends f {

        /* renamed from: m  reason: collision with root package name */
        public o0.b f31518m;

        public g(s0 s0Var, WindowInsets windowInsets) {
            super(s0Var, windowInsets);
            this.f31518m = null;
        }

        @Override // x0.s0.k
        public s0 b() {
            return s0.i(null, this.c.consumeStableInsets());
        }

        @Override // x0.s0.k
        public s0 c() {
            return s0.i(null, this.c.consumeSystemWindowInsets());
        }

        @Override // x0.s0.k
        public final o0.b h() {
            if (this.f31518m == null) {
                WindowInsets windowInsets = this.c;
                this.f31518m = o0.b.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
            }
            return this.f31518m;
        }

        @Override // x0.s0.k
        public boolean m() {
            return this.c.isConsumed();
        }

        @Override // x0.s0.k
        public void q(o0.b bVar) {
            this.f31518m = bVar;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class h extends g {
        public h(s0 s0Var, WindowInsets windowInsets) {
            super(s0Var, windowInsets);
        }

        @Override // x0.s0.k
        public s0 a() {
            WindowInsets consumeDisplayCutout;
            consumeDisplayCutout = this.c.consumeDisplayCutout();
            return s0.i(null, consumeDisplayCutout);
        }

        @Override // x0.s0.k
        public x0.d e() {
            DisplayCutout displayCutout;
            displayCutout = this.c.getDisplayCutout();
            if (displayCutout == null) {
                return null;
            }
            return new x0.d(displayCutout);
        }

        @Override // x0.s0.f, x0.s0.k
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            if (Objects.equals(this.c, hVar.c) && Objects.equals(this.f31517g, hVar.f31517g)) {
                return true;
            }
            return false;
        }

        @Override // x0.s0.k
        public int hashCode() {
            return this.c.hashCode();
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static final class l {
        public static int a(int i10) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return 1;
                }
                if (i10 == 4) {
                    return 2;
                }
                if (i10 != 8) {
                    if (i10 == 16) {
                        return 4;
                    }
                    if (i10 != 32) {
                        if (i10 != 64) {
                            if (i10 != 128) {
                                if (i10 == 256) {
                                    return 8;
                                }
                                throw new IllegalArgumentException(b.a.c("type needs to be >= FIRST and <= LAST, type=", i10));
                            }
                            return 7;
                        }
                        return 6;
                    }
                    return 5;
                }
                return 3;
            }
            return 0;
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static final class m {
        public static int a(int i10) {
            int statusBars;
            int i11 = 0;
            for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                if ((i10 & i12) != 0) {
                    if (i12 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i12 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i12 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i12 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i12 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i12 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i12 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i12 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    }
                    i11 |= statusBars;
                }
            }
            return i11;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f31497b = j.f31522q;
        } else {
            f31497b = k.f31523b;
        }
    }

    public s0(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f31498a = new j(this, windowInsets);
        } else if (i10 >= 29) {
            this.f31498a = new i(this, windowInsets);
        } else if (i10 >= 28) {
            this.f31498a = new h(this, windowInsets);
        } else {
            this.f31498a = new g(this, windowInsets);
        }
    }

    public static o0.b f(o0.b bVar, int i10, int i11, int i12, int i13) {
        int max = Math.max(0, bVar.f22639a - i10);
        int max2 = Math.max(0, bVar.f22640b - i11);
        int max3 = Math.max(0, bVar.c - i12);
        int max4 = Math.max(0, bVar.f22641d - i13);
        if (max == i10 && max2 == i11 && max3 == i12 && max4 == i13) {
            return bVar;
        }
        return o0.b.b(max, max2, max3, max4);
    }

    public static s0 i(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        s0 s0Var = new s0(windowInsets);
        if (view != null) {
            WeakHashMap<View, n0> weakHashMap = f0.f31435a;
            if (f0.g.b(view)) {
                s0 a10 = f0.j.a(view);
                k kVar = s0Var.f31498a;
                kVar.p(a10);
                kVar.d(view.getRootView());
            }
        }
        return s0Var;
    }

    public final o0.b a(int i10) {
        return this.f31498a.f(i10);
    }

    @Deprecated
    public final int b() {
        return this.f31498a.j().f22641d;
    }

    @Deprecated
    public final int c() {
        return this.f31498a.j().f22639a;
    }

    @Deprecated
    public final int d() {
        return this.f31498a.j().c;
    }

    @Deprecated
    public final int e() {
        return this.f31498a.j().f22640b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        return w0.b.a(this.f31498a, ((s0) obj).f31498a);
    }

    @Deprecated
    public final s0 g(int i10, int i11, int i12, int i13) {
        e bVar;
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 30) {
            bVar = new d(this);
        } else if (i14 >= 29) {
            bVar = new c(this);
        } else {
            bVar = new b(this);
        }
        bVar.g(o0.b.b(i10, i11, i12, i13));
        return bVar.b();
    }

    public final WindowInsets h() {
        k kVar = this.f31498a;
        if (kVar instanceof f) {
            return ((f) kVar).c;
        }
        return null;
    }

    public final int hashCode() {
        k kVar = this.f31498a;
        if (kVar == null) {
            return 0;
        }
        return kVar.hashCode();
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class b extends e {

        /* renamed from: e  reason: collision with root package name */
        public static Field f31502e = null;

        /* renamed from: f  reason: collision with root package name */
        public static boolean f31503f = false;

        /* renamed from: g  reason: collision with root package name */
        public static Constructor<WindowInsets> f31504g = null;

        /* renamed from: h  reason: collision with root package name */
        public static boolean f31505h = false;
        public WindowInsets c;

        /* renamed from: d  reason: collision with root package name */
        public o0.b f31506d;

        public b() {
            this.c = i();
        }

        private static WindowInsets i() {
            if (!f31503f) {
                try {
                    f31502e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException unused) {
                }
                f31503f = true;
            }
            Field field = f31502e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException unused2) {
                }
            }
            if (!f31505h) {
                try {
                    f31504g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException unused3) {
                }
                f31505h = true;
            }
            Constructor<WindowInsets> constructor = f31504g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException unused4) {
                }
            }
            return null;
        }

        @Override // x0.s0.e
        public s0 b() {
            a();
            s0 i10 = s0.i(null, this.c);
            o0.b[] bVarArr = this.f31508b;
            k kVar = i10.f31498a;
            kVar.o(bVarArr);
            kVar.q(this.f31506d);
            return i10;
        }

        @Override // x0.s0.e
        public void e(o0.b bVar) {
            this.f31506d = bVar;
        }

        @Override // x0.s0.e
        public void g(o0.b bVar) {
            WindowInsets windowInsets = this.c;
            if (windowInsets != null) {
                this.c = windowInsets.replaceSystemWindowInsets(bVar.f22639a, bVar.f22640b, bVar.c, bVar.f22641d);
            }
        }

        public b(s0 s0Var) {
            super(s0Var);
            this.c = s0Var.h();
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class c extends e {
        public final WindowInsets.Builder c;

        public c() {
            this.c = androidx.appcompat.widget.u.d();
        }

        @Override // x0.s0.e
        public s0 b() {
            WindowInsets build;
            a();
            build = this.c.build();
            s0 i10 = s0.i(null, build);
            i10.f31498a.o(this.f31508b);
            return i10;
        }

        @Override // x0.s0.e
        public void d(o0.b bVar) {
            this.c.setMandatorySystemGestureInsets(bVar.d());
        }

        @Override // x0.s0.e
        public void e(o0.b bVar) {
            this.c.setStableInsets(bVar.d());
        }

        @Override // x0.s0.e
        public void f(o0.b bVar) {
            this.c.setSystemGestureInsets(bVar.d());
        }

        @Override // x0.s0.e
        public void g(o0.b bVar) {
            androidx.lifecycle.c0.h(this.c, bVar.d());
        }

        @Override // x0.s0.e
        public void h(o0.b bVar) {
            com.google.android.gms.internal.ads.f.j(this.c, bVar.d());
        }

        public c(s0 s0Var) {
            super(s0Var);
            WindowInsets.Builder d10;
            WindowInsets h10 = s0Var.h();
            if (h10 != null) {
                d10 = a4.f.f(h10);
            } else {
                d10 = androidx.appcompat.widget.u.d();
            }
            this.c = d10;
        }
    }

    public s0() {
        this.f31498a = new k(this);
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class i extends h {

        /* renamed from: n  reason: collision with root package name */
        public o0.b f31519n;

        /* renamed from: o  reason: collision with root package name */
        public o0.b f31520o;

        /* renamed from: p  reason: collision with root package name */
        public o0.b f31521p;

        public i(s0 s0Var, WindowInsets windowInsets) {
            super(s0Var, windowInsets);
            this.f31519n = null;
            this.f31520o = null;
            this.f31521p = null;
        }

        @Override // x0.s0.k
        public o0.b g() {
            Insets mandatorySystemGestureInsets;
            if (this.f31520o == null) {
                mandatorySystemGestureInsets = this.c.getMandatorySystemGestureInsets();
                this.f31520o = o0.b.c(mandatorySystemGestureInsets);
            }
            return this.f31520o;
        }

        @Override // x0.s0.k
        public o0.b i() {
            if (this.f31519n == null) {
                this.f31519n = o0.b.c(androidx.lifecycle.c0.a(this.c));
            }
            return this.f31519n;
        }

        @Override // x0.s0.k
        public o0.b k() {
            Insets tappableElementInsets;
            if (this.f31521p == null) {
                tappableElementInsets = this.c.getTappableElementInsets();
                this.f31521p = o0.b.c(tappableElementInsets);
            }
            return this.f31521p;
        }

        @Override // x0.s0.f, x0.s0.k
        public s0 l(int i10, int i11, int i12, int i13) {
            WindowInsets inset;
            inset = this.c.inset(i10, i11, i12, i13);
            return s0.i(null, inset);
        }

        @Override // x0.s0.g, x0.s0.k
        public void q(o0.b bVar) {
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class j extends i {

        /* renamed from: q  reason: collision with root package name */
        public static final s0 f31522q;

        static {
            WindowInsets windowInsets;
            windowInsets = WindowInsets.CONSUMED;
            f31522q = s0.i(null, windowInsets);
        }

        public j(s0 s0Var, WindowInsets windowInsets) {
            super(s0Var, windowInsets);
        }

        @Override // x0.s0.f, x0.s0.k
        public o0.b f(int i10) {
            Insets insets;
            insets = this.c.getInsets(m.a(i10));
            return o0.b.c(insets);
        }

        @Override // x0.s0.f, x0.s0.k
        public final void d(View view) {
        }
    }

    /* compiled from: WindowInsetsCompat.java */
    /* loaded from: classes.dex */
    public static class k {

        /* renamed from: b  reason: collision with root package name */
        public static final s0 f31523b;

        /* renamed from: a  reason: collision with root package name */
        public final s0 f31524a;

        static {
            e bVar;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                bVar = new d();
            } else if (i10 >= 29) {
                bVar = new c();
            } else {
                bVar = new b();
            }
            f31523b = bVar.b().f31498a.a().f31498a.b().f31498a.c();
        }

        public k(s0 s0Var) {
            this.f31524a = s0Var;
        }

        public s0 a() {
            return this.f31524a;
        }

        public s0 b() {
            return this.f31524a;
        }

        public s0 c() {
            return this.f31524a;
        }

        public x0.d e() {
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            if (n() == kVar.n() && m() == kVar.m() && w0.b.a(j(), kVar.j()) && w0.b.a(h(), kVar.h()) && w0.b.a(e(), kVar.e())) {
                return true;
            }
            return false;
        }

        public o0.b f(int i10) {
            return o0.b.f22638e;
        }

        public o0.b g() {
            return j();
        }

        public o0.b h() {
            return o0.b.f22638e;
        }

        public int hashCode() {
            return w0.b.b(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e());
        }

        public o0.b i() {
            return j();
        }

        public o0.b j() {
            return o0.b.f22638e;
        }

        public o0.b k() {
            return j();
        }

        public s0 l(int i10, int i11, int i12, int i13) {
            return f31523b;
        }

        public boolean m() {
            return false;
        }

        public boolean n() {
            return false;
        }

        public void d(View view) {
        }

        public void o(o0.b[] bVarArr) {
        }

        public void p(s0 s0Var) {
        }

        public void q(o0.b bVar) {
        }
    }
}
