package d0;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import d0.b;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: Direct.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final b.a f16026a = new b.a();

    public static boolean a(ConstraintWidget constraintWidget) {
        androidx.constraintlayout.core.widgets.d dVar;
        boolean z10;
        boolean z11;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.V;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = dimensionBehaviourArr[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = dimensionBehaviourArr[1];
        ConstraintWidget constraintWidget2 = constraintWidget.W;
        if (constraintWidget2 != null) {
            dVar = (androidx.constraintlayout.core.widgets.d) constraintWidget2;
        } else {
            dVar = null;
        }
        if (dVar != null) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = dVar.V[0];
        }
        if (dVar != null) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = dVar.V[1];
        }
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.FIXED;
        if (dimensionBehaviour3 != dimensionBehaviour7 && !constraintWidget.E() && dimensionBehaviour3 != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT && ((dimensionBehaviour3 != (dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) || constraintWidget.f2844s != 0 || constraintWidget.Z != 0.0f || !constraintWidget.x(0)) && (dimensionBehaviour3 != dimensionBehaviour2 || constraintWidget.f2844s != 1 || !constraintWidget.y(0, constraintWidget.u())))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (dimensionBehaviour4 != dimensionBehaviour7 && !constraintWidget.F() && dimensionBehaviour4 != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT && ((dimensionBehaviour4 != (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) || constraintWidget.f2846t != 0 || constraintWidget.Z != 0.0f || !constraintWidget.x(1)) && (dimensionBehaviour4 != dimensionBehaviour || constraintWidget.f2846t != 1 || !constraintWidget.y(1, constraintWidget.o())))) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (constraintWidget.Z > 0.0f && (z10 || z11)) {
            return true;
        }
        if (!z10 || !z11) {
            return false;
        }
        return true;
    }

    public static void b(int i10, ConstraintWidget constraintWidget, b.InterfaceC0188b interfaceC0188b, boolean z10) {
        boolean z11;
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        char c;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        if (constraintWidget.f2834n) {
            return;
        }
        if (!(constraintWidget instanceof androidx.constraintlayout.core.widgets.d) && constraintWidget.D() && a(constraintWidget)) {
            androidx.constraintlayout.core.widgets.d.Y(constraintWidget, interfaceC0188b, new b.a());
        }
        ConstraintAnchor m10 = constraintWidget.m(ConstraintAnchor.Type.LEFT);
        ConstraintAnchor m11 = constraintWidget.m(ConstraintAnchor.Type.RIGHT);
        int d10 = m10.d();
        int d11 = m11.d();
        HashSet<ConstraintAnchor> hashSet = m10.f2799a;
        char c10 = 0;
        if (hashSet != null && m10.c) {
            Iterator<ConstraintAnchor> it = hashSet.iterator();
            while (it.hasNext()) {
                ConstraintAnchor next = it.next();
                ConstraintWidget constraintWidget2 = next.f2801d;
                int i11 = i10 + 1;
                boolean a10 = a(constraintWidget2);
                if (constraintWidget2.D() && a10) {
                    androidx.constraintlayout.core.widgets.d.Y(constraintWidget2, interfaceC0188b, new b.a());
                }
                ConstraintAnchor constraintAnchor5 = constraintWidget2.K;
                ConstraintAnchor constraintAnchor6 = constraintWidget2.M;
                if ((next == constraintAnchor5 && (constraintAnchor4 = constraintAnchor6.f2803f) != null && constraintAnchor4.c) || (next == constraintAnchor6 && (constraintAnchor3 = constraintAnchor5.f2803f) != null && constraintAnchor3.c)) {
                    c = 1;
                } else {
                    c = c10;
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidget2.V[c10];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour == dimensionBehaviour2 && !a10) {
                    if (dimensionBehaviour == dimensionBehaviour2 && constraintWidget2.f2852w >= 0 && constraintWidget2.f2850v >= 0 && ((constraintWidget2.f2827j0 == 8 || (constraintWidget2.f2844s == 0 && constraintWidget2.Z == 0.0f)) && !constraintWidget2.B() && !constraintWidget2.H && c != 0 && !constraintWidget2.B())) {
                        d(i11, constraintWidget, interfaceC0188b, constraintWidget2, z10);
                    }
                } else if (!constraintWidget2.D()) {
                    if (next == constraintAnchor5 && constraintAnchor6.f2803f == null) {
                        int e10 = constraintAnchor5.e() + d10;
                        constraintWidget2.M(e10, constraintWidget2.u() + e10);
                        b(i11, constraintWidget2, interfaceC0188b, z10);
                    } else if (next == constraintAnchor6 && constraintAnchor5.f2803f == null) {
                        int e11 = d10 - constraintAnchor6.e();
                        constraintWidget2.M(e11 - constraintWidget2.u(), e11);
                        b(i11, constraintWidget2, interfaceC0188b, z10);
                    } else if (c != 0 && !constraintWidget2.B()) {
                        c(i11, constraintWidget2, interfaceC0188b, z10);
                    }
                }
                c10 = 0;
            }
        }
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.f) {
            return;
        }
        HashSet<ConstraintAnchor> hashSet2 = m11.f2799a;
        if (hashSet2 != null && m11.c) {
            Iterator<ConstraintAnchor> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                ConstraintAnchor next2 = it2.next();
                ConstraintWidget constraintWidget3 = next2.f2801d;
                int i12 = i10 + 1;
                boolean a11 = a(constraintWidget3);
                if (constraintWidget3.D() && a11) {
                    androidx.constraintlayout.core.widgets.d.Y(constraintWidget3, interfaceC0188b, new b.a());
                }
                ConstraintAnchor constraintAnchor7 = constraintWidget3.K;
                ConstraintAnchor constraintAnchor8 = constraintWidget3.M;
                if ((next2 == constraintAnchor7 && (constraintAnchor2 = constraintAnchor8.f2803f) != null && constraintAnchor2.c) || (next2 == constraintAnchor8 && (constraintAnchor = constraintAnchor7.f2803f) != null && constraintAnchor.c)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = constraintWidget3.V[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour3 == dimensionBehaviour4 && !a11) {
                    if (dimensionBehaviour3 == dimensionBehaviour4 && constraintWidget3.f2852w >= 0 && constraintWidget3.f2850v >= 0) {
                        if (constraintWidget3.f2827j0 != 8) {
                            if (constraintWidget3.f2844s == 0) {
                                if (constraintWidget3.Z == 0.0f) {
                                }
                            }
                        }
                        if (!constraintWidget3.B() && !constraintWidget3.H && z11 && !constraintWidget3.B()) {
                            d(i12, constraintWidget, interfaceC0188b, constraintWidget3, z10);
                        }
                    }
                } else if (!constraintWidget3.D()) {
                    if (next2 == constraintAnchor7 && constraintAnchor8.f2803f == null) {
                        int e12 = constraintAnchor7.e() + d11;
                        constraintWidget3.M(e12, constraintWidget3.u() + e12);
                        b(i12, constraintWidget3, interfaceC0188b, z10);
                    } else if (next2 == constraintAnchor8 && constraintAnchor7.f2803f == null) {
                        int e13 = d11 - constraintAnchor8.e();
                        constraintWidget3.M(e13 - constraintWidget3.u(), e13);
                        b(i12, constraintWidget3, interfaceC0188b, z10);
                    } else if (z11 && !constraintWidget3.B()) {
                        c(i12, constraintWidget3, interfaceC0188b, z10);
                    }
                }
            }
        }
        constraintWidget.f2834n = true;
    }

    public static void c(int i10, ConstraintWidget constraintWidget, b.InterfaceC0188b interfaceC0188b, boolean z10) {
        float f10;
        float f11 = constraintWidget.f2821g0;
        ConstraintAnchor constraintAnchor = constraintWidget.K;
        int d10 = constraintAnchor.f2803f.d();
        ConstraintAnchor constraintAnchor2 = constraintWidget.M;
        int d11 = constraintAnchor2.f2803f.d();
        int e10 = constraintAnchor.e() + d10;
        int e11 = d11 - constraintAnchor2.e();
        if (d10 == d11) {
            f11 = 0.5f;
        } else {
            d10 = e10;
            d11 = e11;
        }
        int u7 = constraintWidget.u();
        int i11 = (d11 - d10) - u7;
        if (d10 > d11) {
            i11 = (d10 - d11) - u7;
        }
        if (i11 > 0) {
            f10 = (f11 * i11) + 0.5f;
        } else {
            f10 = f11 * i11;
        }
        int i12 = ((int) f10) + d10;
        int i13 = i12 + u7;
        if (d10 > d11) {
            i13 = i12 - u7;
        }
        constraintWidget.M(i12, i13);
        b(i10 + 1, constraintWidget, interfaceC0188b, z10);
    }

    public static void d(int i10, ConstraintWidget constraintWidget, b.InterfaceC0188b interfaceC0188b, ConstraintWidget constraintWidget2, boolean z10) {
        int u7;
        float f10 = constraintWidget2.f2821g0;
        ConstraintAnchor constraintAnchor = constraintWidget2.K;
        int e10 = constraintAnchor.e() + constraintAnchor.f2803f.d();
        ConstraintAnchor constraintAnchor2 = constraintWidget2.M;
        int d10 = constraintAnchor2.f2803f.d() - constraintAnchor2.e();
        if (d10 >= e10) {
            int u10 = constraintWidget2.u();
            if (constraintWidget2.f2827j0 != 8) {
                int i11 = constraintWidget2.f2844s;
                if (i11 == 2) {
                    if (constraintWidget instanceof androidx.constraintlayout.core.widgets.d) {
                        u7 = constraintWidget.u();
                    } else {
                        u7 = constraintWidget.W.u();
                    }
                    u10 = (int) (constraintWidget2.f2821g0 * 0.5f * u7);
                } else if (i11 == 0) {
                    u10 = d10 - e10;
                }
                u10 = Math.max(constraintWidget2.f2850v, u10);
                int i12 = constraintWidget2.f2852w;
                if (i12 > 0) {
                    u10 = Math.min(i12, u10);
                }
            }
            int i13 = e10 + ((int) ((f10 * ((d10 - e10) - u10)) + 0.5f));
            constraintWidget2.M(i13, u10 + i13);
            b(i10 + 1, constraintWidget2, interfaceC0188b, z10);
        }
    }

    public static void e(int i10, ConstraintWidget constraintWidget, b.InterfaceC0188b interfaceC0188b) {
        float f10;
        float f11 = constraintWidget.f2823h0;
        ConstraintAnchor constraintAnchor = constraintWidget.L;
        int d10 = constraintAnchor.f2803f.d();
        ConstraintAnchor constraintAnchor2 = constraintWidget.N;
        int d11 = constraintAnchor2.f2803f.d();
        int e10 = constraintAnchor.e() + d10;
        int e11 = d11 - constraintAnchor2.e();
        if (d10 == d11) {
            f11 = 0.5f;
        } else {
            d10 = e10;
            d11 = e11;
        }
        int o10 = constraintWidget.o();
        int i11 = (d11 - d10) - o10;
        if (d10 > d11) {
            i11 = (d10 - d11) - o10;
        }
        if (i11 > 0) {
            f10 = (f11 * i11) + 0.5f;
        } else {
            f10 = f11 * i11;
        }
        int i12 = (int) f10;
        int i13 = d10 + i12;
        int i14 = i13 + o10;
        if (d10 > d11) {
            i13 = d10 - i12;
            i14 = i13 - o10;
        }
        constraintWidget.N(i13, i14);
        g(i10 + 1, constraintWidget, interfaceC0188b);
    }

    public static void f(int i10, ConstraintWidget constraintWidget, b.InterfaceC0188b interfaceC0188b, ConstraintWidget constraintWidget2) {
        int o10;
        float f10 = constraintWidget2.f2823h0;
        ConstraintAnchor constraintAnchor = constraintWidget2.L;
        int e10 = constraintAnchor.e() + constraintAnchor.f2803f.d();
        ConstraintAnchor constraintAnchor2 = constraintWidget2.N;
        int d10 = constraintAnchor2.f2803f.d() - constraintAnchor2.e();
        if (d10 >= e10) {
            int o11 = constraintWidget2.o();
            if (constraintWidget2.f2827j0 != 8) {
                int i11 = constraintWidget2.f2846t;
                if (i11 == 2) {
                    if (constraintWidget instanceof androidx.constraintlayout.core.widgets.d) {
                        o10 = constraintWidget.o();
                    } else {
                        o10 = constraintWidget.W.o();
                    }
                    o11 = (int) (f10 * 0.5f * o10);
                } else if (i11 == 0) {
                    o11 = d10 - e10;
                }
                o11 = Math.max(constraintWidget2.f2854y, o11);
                int i12 = constraintWidget2.f2855z;
                if (i12 > 0) {
                    o11 = Math.min(i12, o11);
                }
            }
            int i13 = e10 + ((int) ((f10 * ((d10 - e10) - o11)) + 0.5f));
            constraintWidget2.N(i13, o11 + i13);
            g(i10 + 1, constraintWidget2, interfaceC0188b);
        }
    }

    public static void g(int i10, ConstraintWidget constraintWidget, b.InterfaceC0188b interfaceC0188b) {
        ConstraintAnchor constraintAnchor;
        boolean z10;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        char c;
        ConstraintAnchor constraintAnchor4;
        ConstraintAnchor constraintAnchor5;
        if (constraintWidget.f2836o) {
            return;
        }
        if (!(constraintWidget instanceof androidx.constraintlayout.core.widgets.d) && constraintWidget.D() && a(constraintWidget)) {
            androidx.constraintlayout.core.widgets.d.Y(constraintWidget, interfaceC0188b, new b.a());
        }
        ConstraintAnchor m10 = constraintWidget.m(ConstraintAnchor.Type.TOP);
        ConstraintAnchor m11 = constraintWidget.m(ConstraintAnchor.Type.BOTTOM);
        int d10 = m10.d();
        int d11 = m11.d();
        HashSet<ConstraintAnchor> hashSet = m10.f2799a;
        char c10 = 1;
        if (hashSet != null && m10.c) {
            Iterator<ConstraintAnchor> it = hashSet.iterator();
            while (it.hasNext()) {
                ConstraintAnchor next = it.next();
                ConstraintWidget constraintWidget2 = next.f2801d;
                int i11 = i10 + 1;
                boolean a10 = a(constraintWidget2);
                if (constraintWidget2.D() && a10) {
                    androidx.constraintlayout.core.widgets.d.Y(constraintWidget2, interfaceC0188b, new b.a());
                }
                ConstraintAnchor constraintAnchor6 = constraintWidget2.L;
                ConstraintAnchor constraintAnchor7 = constraintWidget2.N;
                if ((next == constraintAnchor6 && (constraintAnchor5 = constraintAnchor7.f2803f) != null && constraintAnchor5.c) || (next == constraintAnchor7 && (constraintAnchor4 = constraintAnchor6.f2803f) != null && constraintAnchor4.c)) {
                    c = c10;
                } else {
                    c = 0;
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidget2.V[c10];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour == dimensionBehaviour2 && !a10) {
                    if (dimensionBehaviour == dimensionBehaviour2 && constraintWidget2.f2855z >= 0 && constraintWidget2.f2854y >= 0 && ((constraintWidget2.f2827j0 == 8 || (constraintWidget2.f2846t == 0 && constraintWidget2.Z == 0.0f)) && !constraintWidget2.C() && !constraintWidget2.H && c != 0 && !constraintWidget2.C())) {
                        f(i11, constraintWidget, interfaceC0188b, constraintWidget2);
                    }
                } else if (!constraintWidget2.D()) {
                    if (next == constraintAnchor6 && constraintAnchor7.f2803f == null) {
                        int e10 = constraintAnchor6.e() + d10;
                        constraintWidget2.N(e10, constraintWidget2.o() + e10);
                        g(i11, constraintWidget2, interfaceC0188b);
                    } else if (next == constraintAnchor7 && constraintAnchor6.f2803f == null) {
                        int e11 = d10 - constraintAnchor7.e();
                        constraintWidget2.N(e11 - constraintWidget2.o(), e11);
                        g(i11, constraintWidget2, interfaceC0188b);
                    } else if (c != 0 && !constraintWidget2.C()) {
                        e(i11, constraintWidget2, interfaceC0188b);
                    }
                }
                c10 = 1;
            }
        }
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.f) {
            return;
        }
        HashSet<ConstraintAnchor> hashSet2 = m11.f2799a;
        if (hashSet2 != null && m11.c) {
            Iterator<ConstraintAnchor> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                ConstraintAnchor next2 = it2.next();
                ConstraintWidget constraintWidget3 = next2.f2801d;
                int i12 = i10 + 1;
                boolean a11 = a(constraintWidget3);
                if (constraintWidget3.D() && a11) {
                    androidx.constraintlayout.core.widgets.d.Y(constraintWidget3, interfaceC0188b, new b.a());
                }
                ConstraintAnchor constraintAnchor8 = constraintWidget3.L;
                ConstraintAnchor constraintAnchor9 = constraintWidget3.N;
                if ((next2 == constraintAnchor8 && (constraintAnchor3 = constraintAnchor9.f2803f) != null && constraintAnchor3.c) || (next2 == constraintAnchor9 && (constraintAnchor2 = constraintAnchor8.f2803f) != null && constraintAnchor2.c)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = constraintWidget3.V[1];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour3 == dimensionBehaviour4 && !a11) {
                    if (dimensionBehaviour3 == dimensionBehaviour4 && constraintWidget3.f2855z >= 0 && constraintWidget3.f2854y >= 0) {
                        if (constraintWidget3.f2827j0 != 8) {
                            if (constraintWidget3.f2846t == 0) {
                                if (constraintWidget3.Z == 0.0f) {
                                }
                            }
                        }
                        if (!constraintWidget3.C() && !constraintWidget3.H && z10 && !constraintWidget3.C()) {
                            f(i12, constraintWidget, interfaceC0188b, constraintWidget3);
                        }
                    }
                } else if (constraintWidget3.D()) {
                    continue;
                } else if (next2 == constraintAnchor8 && constraintAnchor9.f2803f == null) {
                    int e12 = constraintAnchor8.e() + d11;
                    constraintWidget3.N(e12, constraintWidget3.o() + e12);
                    g(i12, constraintWidget3, interfaceC0188b);
                } else if (next2 == constraintAnchor9 && constraintAnchor8.f2803f == null) {
                    int e13 = d11 - constraintAnchor9.e();
                    constraintWidget3.N(e13 - constraintWidget3.o(), e13);
                    g(i12, constraintWidget3, interfaceC0188b);
                } else if (z10 && !constraintWidget3.C()) {
                    e(i12, constraintWidget3, interfaceC0188b);
                }
            }
        }
        ConstraintAnchor m12 = constraintWidget.m(ConstraintAnchor.Type.BASELINE);
        if (m12.f2799a != null && m12.c) {
            int d12 = m12.d();
            Iterator<ConstraintAnchor> it3 = m12.f2799a.iterator();
            while (it3.hasNext()) {
                ConstraintAnchor next3 = it3.next();
                ConstraintWidget constraintWidget4 = next3.f2801d;
                int i13 = i10 + 1;
                boolean a12 = a(constraintWidget4);
                if (constraintWidget4.D() && a12) {
                    androidx.constraintlayout.core.widgets.d.Y(constraintWidget4, interfaceC0188b, new b.a());
                }
                if (constraintWidget4.V[1] != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || a12) {
                    if (!constraintWidget4.D() && next3 == (constraintAnchor = constraintWidget4.O)) {
                        int e14 = next3.e() + d12;
                        if (constraintWidget4.F) {
                            int i14 = e14 - constraintWidget4.f2815d0;
                            int i15 = constraintWidget4.Y + i14;
                            constraintWidget4.f2813c0 = i14;
                            constraintWidget4.L.l(i14);
                            constraintWidget4.N.l(i15);
                            constraintAnchor.l(e14);
                            constraintWidget4.f2832m = true;
                        }
                        g(i13, constraintWidget4, interfaceC0188b);
                    }
                }
            }
        }
        constraintWidget.f2836o = true;
    }
}
