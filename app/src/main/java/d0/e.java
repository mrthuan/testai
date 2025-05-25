package d0;

import androidx.activity.r;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import androidx.constraintlayout.widget.ConstraintLayout;
import d0.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: DependencyGraph.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final androidx.constraintlayout.core.widgets.d f16019a;

    /* renamed from: d  reason: collision with root package name */
    public final androidx.constraintlayout.core.widgets.d f16021d;

    /* renamed from: f  reason: collision with root package name */
    public b.InterfaceC0188b f16023f;

    /* renamed from: g  reason: collision with root package name */
    public final b.a f16024g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList<i> f16025h;

    /* renamed from: b  reason: collision with root package name */
    public boolean f16020b = true;
    public boolean c = true;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList<WidgetRun> f16022e = new ArrayList<>();

    public e(androidx.constraintlayout.core.widgets.d dVar) {
        new ArrayList();
        this.f16023f = null;
        this.f16024g = new b.a();
        this.f16025h = new ArrayList<>();
        this.f16019a = dVar;
        this.f16021d = dVar;
    }

    public final void a(DependencyNode dependencyNode, int i10, int i11, ArrayList arrayList, i iVar) {
        WidgetRun widgetRun = dependencyNode.f2863d;
        if (widgetRun.c == null) {
            androidx.constraintlayout.core.widgets.d dVar = this.f16019a;
            if (widgetRun != dVar.f2814d && widgetRun != dVar.f2816e) {
                if (iVar == null) {
                    iVar = new i(widgetRun);
                    arrayList.add(iVar);
                }
                widgetRun.c = iVar;
                iVar.f16028b.add(widgetRun);
                DependencyNode dependencyNode2 = widgetRun.f2879h;
                Iterator it = dependencyNode2.f2870k.iterator();
                while (it.hasNext()) {
                    d dVar2 = (d) it.next();
                    if (dVar2 instanceof DependencyNode) {
                        a((DependencyNode) dVar2, i10, 0, arrayList, iVar);
                    }
                }
                DependencyNode dependencyNode3 = widgetRun.f2880i;
                Iterator it2 = dependencyNode3.f2870k.iterator();
                while (it2.hasNext()) {
                    d dVar3 = (d) it2.next();
                    if (dVar3 instanceof DependencyNode) {
                        a((DependencyNode) dVar3, i10, 1, arrayList, iVar);
                    }
                }
                if (i10 == 1 && (widgetRun instanceof androidx.constraintlayout.core.widgets.analyzer.d)) {
                    Iterator it3 = ((androidx.constraintlayout.core.widgets.analyzer.d) widgetRun).f2887k.f2870k.iterator();
                    while (it3.hasNext()) {
                        d dVar4 = (d) it3.next();
                        if (dVar4 instanceof DependencyNode) {
                            a((DependencyNode) dVar4, i10, 2, arrayList, iVar);
                        }
                    }
                }
                Iterator it4 = dependencyNode2.f2871l.iterator();
                while (it4.hasNext()) {
                    a((DependencyNode) it4.next(), i10, 0, arrayList, iVar);
                }
                Iterator it5 = dependencyNode3.f2871l.iterator();
                while (it5.hasNext()) {
                    a((DependencyNode) it5.next(), i10, 1, arrayList, iVar);
                }
                if (i10 == 1 && (widgetRun instanceof androidx.constraintlayout.core.widgets.analyzer.d)) {
                    Iterator it6 = ((androidx.constraintlayout.core.widgets.analyzer.d) widgetRun).f2887k.f2871l.iterator();
                    while (it6.hasNext()) {
                        a((DependencyNode) it6.next(), i10, 2, arrayList, iVar);
                    }
                }
            }
        }
    }

    public final void b(androidx.constraintlayout.core.widgets.d dVar) {
        int i10;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3;
        Iterator<ConstraintWidget> it = dVar.f5504w0.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = next.V;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = dimensionBehaviourArr[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = dimensionBehaviourArr[1];
            if (next.f2827j0 == 8) {
                next.f2809a = true;
            } else {
                float f10 = next.f2853x;
                if (f10 < 1.0f && dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    next.f2844s = 2;
                }
                float f11 = next.A;
                if (f11 < 1.0f && dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    next.f2846t = 2;
                }
                if (next.Z > 0.0f) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviour4 == dimensionBehaviour6 && (dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour5 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        next.f2844s = 3;
                    } else if (dimensionBehaviour5 == dimensionBehaviour6 && (dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        next.f2846t = 3;
                    } else if (dimensionBehaviour4 == dimensionBehaviour6 && dimensionBehaviour5 == dimensionBehaviour6) {
                        if (next.f2844s == 0) {
                            next.f2844s = 3;
                        }
                        if (next.f2846t == 0) {
                            next.f2846t = 3;
                        }
                    }
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                ConstraintAnchor constraintAnchor = next.M;
                ConstraintAnchor constraintAnchor2 = next.K;
                if (dimensionBehaviour4 == dimensionBehaviour7 && next.f2844s == 1 && (constraintAnchor2.f2803f == null || constraintAnchor.f2803f == null)) {
                    dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                }
                ConstraintAnchor constraintAnchor3 = next.N;
                ConstraintAnchor constraintAnchor4 = next.L;
                if (dimensionBehaviour5 == dimensionBehaviour7 && next.f2846t == 1 && (constraintAnchor4.f2803f == null || constraintAnchor3.f2803f == null)) {
                    dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour8 = dimensionBehaviour5;
                androidx.constraintlayout.core.widgets.analyzer.c cVar = next.f2814d;
                cVar.f2875d = dimensionBehaviour4;
                int i11 = next.f2844s;
                cVar.f2873a = i11;
                androidx.constraintlayout.core.widgets.analyzer.d dVar2 = next.f2816e;
                dVar2.f2875d = dimensionBehaviour8;
                int i12 = next.f2846t;
                dVar2.f2873a = i12;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour9 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                if ((dimensionBehaviour4 != dimensionBehaviour9 && dimensionBehaviour4 != ConstraintWidget.DimensionBehaviour.FIXED && dimensionBehaviour4 != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || (dimensionBehaviour8 != dimensionBehaviour9 && dimensionBehaviour8 != ConstraintWidget.DimensionBehaviour.FIXED && dimensionBehaviour8 != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)) {
                    ConstraintAnchor[] constraintAnchorArr = next.S;
                    if (dimensionBehaviour4 == dimensionBehaviour7 && (dimensionBehaviour8 == (dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviour8 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        if (i11 == 3) {
                            if (dimensionBehaviour8 == dimensionBehaviour3) {
                                f(next, dimensionBehaviour3, 0, dimensionBehaviour3, 0);
                            }
                            int o10 = next.o();
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour10 = ConstraintWidget.DimensionBehaviour.FIXED;
                            f(next, dimensionBehaviour10, (int) ((o10 * next.Z) + 0.5f), dimensionBehaviour10, o10);
                            next.f2814d.f2876e.d(next.u());
                            next.f2816e.f2876e.d(next.o());
                            next.f2809a = true;
                        } else if (i11 == 1) {
                            f(next, dimensionBehaviour3, 0, dimensionBehaviour8, 0);
                            next.f2814d.f2876e.f2884m = next.u();
                        } else {
                            dimensionBehaviour = dimensionBehaviour8;
                            if (i11 == 2) {
                                ConstraintWidget.DimensionBehaviour dimensionBehaviour11 = dVar.V[0];
                                ConstraintWidget.DimensionBehaviour dimensionBehaviour12 = ConstraintWidget.DimensionBehaviour.FIXED;
                                if (dimensionBehaviour11 == dimensionBehaviour12 || dimensionBehaviour11 == dimensionBehaviour9) {
                                    f(next, dimensionBehaviour12, (int) ((f10 * dVar.u()) + 0.5f), dimensionBehaviour, next.o());
                                    next.f2814d.f2876e.d(next.u());
                                    next.f2816e.f2876e.d(next.o());
                                    next.f2809a = true;
                                }
                            } else if (constraintAnchorArr[0].f2803f == null || constraintAnchorArr[1].f2803f == null) {
                                f(next, dimensionBehaviour3, 0, dimensionBehaviour, 0);
                                next.f2814d.f2876e.d(next.u());
                                next.f2816e.f2876e.d(next.o());
                                next.f2809a = true;
                            }
                        }
                    } else {
                        dimensionBehaviour = dimensionBehaviour8;
                    }
                    if (dimensionBehaviour == dimensionBehaviour7 && (dimensionBehaviour4 == (dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviour4 == ConstraintWidget.DimensionBehaviour.FIXED)) {
                        if (i12 == 3) {
                            if (dimensionBehaviour4 == dimensionBehaviour2) {
                                f(next, dimensionBehaviour2, 0, dimensionBehaviour2, 0);
                            }
                            int u7 = next.u();
                            float f12 = next.Z;
                            if (next.f2810a0 == -1) {
                                f12 = 1.0f / f12;
                            }
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour13 = ConstraintWidget.DimensionBehaviour.FIXED;
                            f(next, dimensionBehaviour13, u7, dimensionBehaviour13, (int) ((u7 * f12) + 0.5f));
                            next.f2814d.f2876e.d(next.u());
                            next.f2816e.f2876e.d(next.o());
                            next.f2809a = true;
                        } else if (i12 == 1) {
                            f(next, dimensionBehaviour4, 0, dimensionBehaviour2, 0);
                            next.f2816e.f2876e.f2884m = next.o();
                        } else if (i12 == 2) {
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour14 = dVar.V[1];
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour15 = ConstraintWidget.DimensionBehaviour.FIXED;
                            if (dimensionBehaviour14 == dimensionBehaviour15 || dimensionBehaviour14 == dimensionBehaviour9) {
                                f(next, dimensionBehaviour4, next.u(), dimensionBehaviour15, (int) ((f11 * dVar.o()) + 0.5f));
                                next.f2814d.f2876e.d(next.u());
                                next.f2816e.f2876e.d(next.o());
                                next.f2809a = true;
                            }
                        } else if (constraintAnchorArr[2].f2803f == null || constraintAnchorArr[3].f2803f == null) {
                            f(next, dimensionBehaviour2, 0, dimensionBehaviour, 0);
                            next.f2814d.f2876e.d(next.u());
                            next.f2816e.f2876e.d(next.o());
                            next.f2809a = true;
                        }
                    }
                    if (dimensionBehaviour4 == dimensionBehaviour7 && dimensionBehaviour == dimensionBehaviour7) {
                        if (i11 != 1 && i12 != 1) {
                            if (i12 == 2 && i11 == 2) {
                                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = dVar.V;
                                ConstraintWidget.DimensionBehaviour dimensionBehaviour16 = dimensionBehaviourArr2[0];
                                ConstraintWidget.DimensionBehaviour dimensionBehaviour17 = ConstraintWidget.DimensionBehaviour.FIXED;
                                if (dimensionBehaviour16 == dimensionBehaviour17 && dimensionBehaviourArr2[1] == dimensionBehaviour17) {
                                    f(next, dimensionBehaviour17, (int) ((f10 * dVar.u()) + 0.5f), dimensionBehaviour17, (int) ((f11 * dVar.o()) + 0.5f));
                                    next.f2814d.f2876e.d(next.u());
                                    next.f2816e.f2876e.d(next.o());
                                    next.f2809a = true;
                                }
                            }
                        } else {
                            ConstraintWidget.DimensionBehaviour dimensionBehaviour18 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                            f(next, dimensionBehaviour18, 0, dimensionBehaviour18, 0);
                            next.f2814d.f2876e.f2884m = next.u();
                            next.f2816e.f2876e.f2884m = next.o();
                        }
                    }
                } else {
                    int u10 = next.u();
                    if (dimensionBehaviour4 == dimensionBehaviour9) {
                        u10 = (dVar.u() - constraintAnchor2.f2804g) - constraintAnchor.f2804g;
                        dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                    }
                    int o11 = next.o();
                    if (dimensionBehaviour8 == dimensionBehaviour9) {
                        int o12 = (dVar.o() - constraintAnchor4.f2804g) - constraintAnchor3.f2804g;
                        dimensionBehaviour8 = ConstraintWidget.DimensionBehaviour.FIXED;
                        i10 = o12;
                    } else {
                        i10 = o11;
                    }
                    f(next, dimensionBehaviour4, u10, dimensionBehaviour8, i10);
                    next.f2814d.f2876e.d(next.u());
                    next.f2816e.f2876e.d(next.o());
                    next.f2809a = true;
                }
            }
        }
    }

    public final void c() {
        ArrayList<WidgetRun> arrayList = this.f16022e;
        arrayList.clear();
        androidx.constraintlayout.core.widgets.d dVar = this.f16021d;
        dVar.f2814d.f();
        dVar.f2816e.f();
        arrayList.add(dVar.f2814d);
        arrayList.add(dVar.f2816e);
        Iterator<ConstraintWidget> it = dVar.f5504w0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            if (next instanceof androidx.constraintlayout.core.widgets.f) {
                arrayList.add(new h(next));
            } else {
                if (next.B()) {
                    if (next.f2811b == null) {
                        next.f2811b = new c(0, next);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f2811b);
                } else {
                    arrayList.add(next.f2814d);
                }
                if (next.C()) {
                    if (next.c == null) {
                        next.c = new c(1, next);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.c);
                } else {
                    arrayList.add(next.f2816e);
                }
                if (next instanceof c0.b) {
                    arrayList.add(new androidx.constraintlayout.core.widgets.analyzer.b(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<WidgetRun> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<WidgetRun> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            WidgetRun next2 = it3.next();
            if (next2.f2874b != dVar) {
                next2.d();
            }
        }
        ArrayList<i> arrayList2 = this.f16025h;
        arrayList2.clear();
        androidx.constraintlayout.core.widgets.d dVar2 = this.f16019a;
        e(dVar2.f2814d, 0, arrayList2);
        e(dVar2.f2816e, 1, arrayList2);
        this.f16020b = false;
    }

    public final int d(androidx.constraintlayout.core.widgets.d dVar, int i10) {
        long j10;
        ArrayList<i> arrayList;
        int i11;
        WidgetRun widgetRun;
        WidgetRun widgetRun2;
        long max;
        float f10;
        long j11;
        androidx.constraintlayout.core.widgets.d dVar2 = dVar;
        int i12 = i10;
        ArrayList<i> arrayList2 = this.f16025h;
        int size = arrayList2.size();
        int i13 = 0;
        long j12 = 0;
        while (i13 < size) {
            WidgetRun widgetRun3 = arrayList2.get(i13).f16027a;
            if (!(widgetRun3 instanceof c) ? !(i12 != 0 ? (widgetRun3 instanceof androidx.constraintlayout.core.widgets.analyzer.d) : (widgetRun3 instanceof androidx.constraintlayout.core.widgets.analyzer.c)) : ((c) widgetRun3).f2877f != i12) {
                j10 = 0;
                arrayList = arrayList2;
                i11 = size;
            } else {
                if (i12 == 0) {
                    widgetRun = dVar2.f2814d;
                } else {
                    widgetRun = dVar2.f2816e;
                }
                DependencyNode dependencyNode = widgetRun.f2879h;
                if (i12 == 0) {
                    widgetRun2 = dVar2.f2814d;
                } else {
                    widgetRun2 = dVar2.f2816e;
                }
                DependencyNode dependencyNode2 = widgetRun2.f2880i;
                boolean contains = widgetRun3.f2879h.f2871l.contains(dependencyNode);
                DependencyNode dependencyNode3 = widgetRun3.f2880i;
                boolean contains2 = dependencyNode3.f2871l.contains(dependencyNode2);
                long j13 = widgetRun3.j();
                DependencyNode dependencyNode4 = widgetRun3.f2879h;
                if (contains && contains2) {
                    long b10 = i.b(dependencyNode4, 0L);
                    long a10 = i.a(dependencyNode3, 0L);
                    long j14 = b10 - j13;
                    int i14 = dependencyNode3.f2865f;
                    arrayList = arrayList2;
                    i11 = size;
                    if (j14 >= (-i14)) {
                        j14 += i14;
                    }
                    long j15 = j14;
                    long j16 = dependencyNode4.f2865f;
                    long j17 = ((-a10) - j13) - j16;
                    if (j17 >= j16) {
                        j17 -= j16;
                    }
                    ConstraintWidget constraintWidget = widgetRun3.f2874b;
                    if (i12 == 0) {
                        f10 = constraintWidget.f2821g0;
                    } else if (i12 == 1) {
                        f10 = constraintWidget.f2823h0;
                    } else {
                        constraintWidget.getClass();
                        f10 = -1.0f;
                    }
                    if (f10 > 0.0f) {
                        j11 = (((float) j15) / (1.0f - f10)) + (((float) j17) / f10);
                    } else {
                        j11 = 0;
                    }
                    float f11 = (float) j11;
                    j10 = (dependencyNode4.f2865f + ((((f11 * f10) + 0.5f) + j13) + r.l(1.0f, f10, f11, 0.5f))) - dependencyNode3.f2865f;
                } else {
                    arrayList = arrayList2;
                    i11 = size;
                    if (contains) {
                        max = Math.max(i.b(dependencyNode4, dependencyNode4.f2865f), dependencyNode4.f2865f + j13);
                    } else if (contains2) {
                        max = Math.max(-i.a(dependencyNode3, dependencyNode3.f2865f), (-dependencyNode3.f2865f) + j13);
                    } else {
                        j10 = (widgetRun3.j() + dependencyNode4.f2865f) - dependencyNode3.f2865f;
                    }
                    j10 = max;
                }
            }
            j12 = Math.max(j12, j10);
            i13++;
            dVar2 = dVar;
            i12 = i10;
            arrayList2 = arrayList;
            size = i11;
        }
        return (int) j12;
    }

    public final void e(WidgetRun widgetRun, int i10, ArrayList<i> arrayList) {
        DependencyNode dependencyNode;
        Iterator it = widgetRun.f2879h.f2870k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            dependencyNode = widgetRun.f2880i;
            if (!hasNext) {
                break;
            }
            d dVar = (d) it.next();
            if (dVar instanceof DependencyNode) {
                a((DependencyNode) dVar, i10, 0, arrayList, null);
            } else if (dVar instanceof WidgetRun) {
                a(((WidgetRun) dVar).f2879h, i10, 0, arrayList, null);
            }
        }
        Iterator it2 = dependencyNode.f2870k.iterator();
        while (it2.hasNext()) {
            d dVar2 = (d) it2.next();
            if (dVar2 instanceof DependencyNode) {
                a((DependencyNode) dVar2, i10, 1, arrayList, null);
            } else if (dVar2 instanceof WidgetRun) {
                a(((WidgetRun) dVar2).f2880i, i10, 1, arrayList, null);
            }
        }
        if (i10 == 1) {
            Iterator it3 = ((androidx.constraintlayout.core.widgets.analyzer.d) widgetRun).f2887k.f2870k.iterator();
            while (it3.hasNext()) {
                d dVar3 = (d) it3.next();
                if (dVar3 instanceof DependencyNode) {
                    a((DependencyNode) dVar3, i10, 2, arrayList, null);
                }
            }
        }
    }

    public final void f(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i10, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i11) {
        boolean z10;
        b.a aVar = this.f16024g;
        aVar.f16008a = dimensionBehaviour;
        aVar.f16009b = dimensionBehaviour2;
        aVar.c = i10;
        aVar.f16010d = i11;
        ((ConstraintLayout.c) this.f16023f).b(constraintWidget, aVar);
        constraintWidget.R(aVar.f16011e);
        constraintWidget.O(aVar.f16012f);
        constraintWidget.F = aVar.f16014h;
        int i12 = aVar.f16013g;
        constraintWidget.f2815d0 = i12;
        if (i12 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        constraintWidget.F = z10;
    }

    public final void g() {
        boolean z10;
        a aVar;
        Iterator<ConstraintWidget> it = this.f16019a.f5504w0.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            if (!next.f2809a) {
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = next.V;
                boolean z11 = false;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                int i10 = next.f2844s;
                int i11 = next.f2846t;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (dimensionBehaviour != dimensionBehaviour3 && (dimensionBehaviour != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || i10 != 1)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (dimensionBehaviour2 == dimensionBehaviour3 || (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && i11 == 1)) {
                    z11 = true;
                }
                androidx.constraintlayout.core.widgets.analyzer.a aVar2 = next.f2814d.f2876e;
                boolean z12 = aVar2.f2869j;
                androidx.constraintlayout.core.widgets.analyzer.a aVar3 = next.f2816e.f2876e;
                boolean z13 = aVar3.f2869j;
                if (z12 && z13) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                    f(next, dimensionBehaviour4, aVar2.f2866g, dimensionBehaviour4, aVar3.f2866g);
                    next.f2809a = true;
                } else if (z12 && z11) {
                    f(next, ConstraintWidget.DimensionBehaviour.FIXED, aVar2.f2866g, dimensionBehaviour3, aVar3.f2866g);
                    if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        next.f2816e.f2876e.f2884m = next.o();
                    } else {
                        next.f2816e.f2876e.d(next.o());
                        next.f2809a = true;
                    }
                } else if (z13 && z10) {
                    f(next, dimensionBehaviour3, aVar2.f2866g, ConstraintWidget.DimensionBehaviour.FIXED, aVar3.f2866g);
                    if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        next.f2814d.f2876e.f2884m = next.u();
                    } else {
                        next.f2814d.f2876e.d(next.u());
                        next.f2809a = true;
                    }
                }
                if (next.f2809a && (aVar = next.f2816e.f2888l) != null) {
                    aVar.d(next.f2815d0);
                }
            }
        }
    }
}
