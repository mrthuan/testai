package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import java.util.ArrayList;

/* compiled from: VerticalWidgetRun.java */
/* loaded from: classes.dex */
public final class d extends WidgetRun {

    /* renamed from: k  reason: collision with root package name */
    public final DependencyNode f2887k;

    /* renamed from: l  reason: collision with root package name */
    public d0.a f2888l;

    /* compiled from: VerticalWidgetRun.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f2889a;

        static {
            int[] iArr = new int[WidgetRun.RunType.values().length];
            f2889a = iArr;
            try {
                iArr[WidgetRun.RunType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2889a[WidgetRun.RunType.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2889a[WidgetRun.RunType.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public d(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        DependencyNode dependencyNode = new DependencyNode(this);
        this.f2887k = dependencyNode;
        this.f2888l = null;
        this.f2879h.f2864e = DependencyNode.Type.TOP;
        this.f2880i.f2864e = DependencyNode.Type.BOTTOM;
        dependencyNode.f2864e = DependencyNode.Type.BASELINE;
        this.f2877f = 1;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, d0.d
    public final void a(d0.d dVar) {
        androidx.constraintlayout.core.widgets.analyzer.a aVar;
        float f10;
        float f11;
        float f12;
        int i10;
        if (a.f2889a[this.f2881j.ordinal()] != 3) {
            androidx.constraintlayout.core.widgets.analyzer.a aVar2 = this.f2876e;
            if (aVar2.c && !aVar2.f2869j && this.f2875d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                ConstraintWidget constraintWidget = this.f2874b;
                int i11 = constraintWidget.f2846t;
                if (i11 != 2) {
                    if (i11 == 3) {
                        androidx.constraintlayout.core.widgets.analyzer.a aVar3 = constraintWidget.f2814d.f2876e;
                        if (aVar3.f2869j) {
                            int i12 = constraintWidget.f2810a0;
                            if (i12 != -1) {
                                if (i12 != 0) {
                                    if (i12 != 1) {
                                        i10 = 0;
                                        aVar2.d(i10);
                                    } else {
                                        f10 = aVar3.f2866g;
                                        f11 = constraintWidget.Z;
                                    }
                                } else {
                                    f12 = aVar3.f2866g * constraintWidget.Z;
                                    i10 = (int) (f12 + 0.5f);
                                    aVar2.d(i10);
                                }
                            } else {
                                f10 = aVar3.f2866g;
                                f11 = constraintWidget.Z;
                            }
                            f12 = f10 / f11;
                            i10 = (int) (f12 + 0.5f);
                            aVar2.d(i10);
                        }
                    }
                } else {
                    ConstraintWidget constraintWidget2 = constraintWidget.W;
                    if (constraintWidget2 != null) {
                        if (constraintWidget2.f2816e.f2876e.f2869j) {
                            aVar2.d((int) ((aVar.f2866g * constraintWidget.A) + 0.5f));
                        }
                    }
                }
            }
            DependencyNode dependencyNode = this.f2879h;
            if (dependencyNode.c) {
                DependencyNode dependencyNode2 = this.f2880i;
                if (dependencyNode2.c) {
                    if (dependencyNode.f2869j && dependencyNode2.f2869j && aVar2.f2869j) {
                        return;
                    }
                    boolean z10 = aVar2.f2869j;
                    ArrayList arrayList = dependencyNode.f2871l;
                    ArrayList arrayList2 = dependencyNode2.f2871l;
                    if (!z10 && this.f2875d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                        ConstraintWidget constraintWidget3 = this.f2874b;
                        if (constraintWidget3.f2844s == 0 && !constraintWidget3.C()) {
                            int i13 = ((DependencyNode) arrayList.get(0)).f2866g + dependencyNode.f2865f;
                            int i14 = ((DependencyNode) arrayList2.get(0)).f2866g + dependencyNode2.f2865f;
                            dependencyNode.d(i13);
                            dependencyNode2.d(i14);
                            aVar2.d(i14 - i13);
                            return;
                        }
                    }
                    if (!aVar2.f2869j && this.f2875d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && this.f2873a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                        int i15 = (((DependencyNode) arrayList2.get(0)).f2866g + dependencyNode2.f2865f) - (((DependencyNode) arrayList.get(0)).f2866g + dependencyNode.f2865f);
                        int i16 = aVar2.f2884m;
                        if (i15 < i16) {
                            aVar2.d(i15);
                        } else {
                            aVar2.d(i16);
                        }
                    }
                    if (aVar2.f2869j && arrayList.size() > 0 && arrayList2.size() > 0) {
                        DependencyNode dependencyNode3 = (DependencyNode) arrayList.get(0);
                        DependencyNode dependencyNode4 = (DependencyNode) arrayList2.get(0);
                        int i17 = dependencyNode3.f2866g;
                        int i18 = dependencyNode.f2865f + i17;
                        int i19 = dependencyNode4.f2866g;
                        int i20 = dependencyNode2.f2865f + i19;
                        float f13 = this.f2874b.f2823h0;
                        if (dependencyNode3 == dependencyNode4) {
                            f13 = 0.5f;
                        } else {
                            i17 = i18;
                            i19 = i20;
                        }
                        dependencyNode.d((int) ((((i19 - i17) - aVar2.f2866g) * f13) + i17 + 0.5f));
                        dependencyNode2.d(dependencyNode.f2866g + aVar2.f2866g);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        ConstraintWidget constraintWidget4 = this.f2874b;
        l(constraintWidget4.L, constraintWidget4.N, 1);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void d() {
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4;
        ConstraintWidget constraintWidget5 = this.f2874b;
        boolean z10 = constraintWidget5.f2809a;
        androidx.constraintlayout.core.widgets.analyzer.a aVar = this.f2876e;
        if (z10) {
            aVar.d(constraintWidget5.o());
        }
        boolean z11 = aVar.f2869j;
        DependencyNode dependencyNode = this.f2880i;
        DependencyNode dependencyNode2 = this.f2879h;
        if (!z11) {
            ConstraintWidget constraintWidget6 = this.f2874b;
            this.f2875d = constraintWidget6.V[1];
            if (constraintWidget6.F) {
                this.f2888l = new d0.a(this);
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = this.f2875d;
            if (dimensionBehaviour != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (constraintWidget4 = this.f2874b.W) != null && constraintWidget4.V[1] == ConstraintWidget.DimensionBehaviour.FIXED) {
                    int o10 = (constraintWidget4.o() - this.f2874b.L.e()) - this.f2874b.N.e();
                    WidgetRun.b(dependencyNode2, constraintWidget4.f2816e.f2879h, this.f2874b.L.e());
                    WidgetRun.b(dependencyNode, constraintWidget4.f2816e.f2880i, -this.f2874b.N.e());
                    aVar.d(o10);
                    return;
                } else if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.FIXED) {
                    aVar.d(this.f2874b.o());
                }
            }
        } else if (this.f2875d == ConstraintWidget.DimensionBehaviour.MATCH_PARENT && (constraintWidget2 = (constraintWidget = this.f2874b).W) != null && constraintWidget2.V[1] == ConstraintWidget.DimensionBehaviour.FIXED) {
            WidgetRun.b(dependencyNode2, constraintWidget2.f2816e.f2879h, constraintWidget.L.e());
            WidgetRun.b(dependencyNode, constraintWidget2.f2816e.f2880i, -this.f2874b.N.e());
            return;
        }
        boolean z12 = aVar.f2869j;
        DependencyNode dependencyNode3 = this.f2887k;
        if (z12) {
            ConstraintWidget constraintWidget7 = this.f2874b;
            if (constraintWidget7.f2809a) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget7.S;
                ConstraintAnchor constraintAnchor = constraintAnchorArr[2];
                ConstraintAnchor constraintAnchor2 = constraintAnchor.f2803f;
                if (constraintAnchor2 != null && constraintAnchorArr[3].f2803f != null) {
                    if (constraintWidget7.C()) {
                        dependencyNode2.f2865f = this.f2874b.S[2].e();
                        dependencyNode.f2865f = -this.f2874b.S[3].e();
                    } else {
                        DependencyNode h10 = WidgetRun.h(this.f2874b.S[2]);
                        if (h10 != null) {
                            WidgetRun.b(dependencyNode2, h10, this.f2874b.S[2].e());
                        }
                        DependencyNode h11 = WidgetRun.h(this.f2874b.S[3]);
                        if (h11 != null) {
                            WidgetRun.b(dependencyNode, h11, -this.f2874b.S[3].e());
                        }
                        dependencyNode2.f2862b = true;
                        dependencyNode.f2862b = true;
                    }
                    ConstraintWidget constraintWidget8 = this.f2874b;
                    if (constraintWidget8.F) {
                        WidgetRun.b(dependencyNode3, dependencyNode2, constraintWidget8.f2815d0);
                        return;
                    }
                    return;
                } else if (constraintAnchor2 != null) {
                    DependencyNode h12 = WidgetRun.h(constraintAnchor);
                    if (h12 != null) {
                        WidgetRun.b(dependencyNode2, h12, this.f2874b.S[2].e());
                        WidgetRun.b(dependencyNode, dependencyNode2, aVar.f2866g);
                        ConstraintWidget constraintWidget9 = this.f2874b;
                        if (constraintWidget9.F) {
                            WidgetRun.b(dependencyNode3, dependencyNode2, constraintWidget9.f2815d0);
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    ConstraintAnchor constraintAnchor3 = constraintAnchorArr[3];
                    if (constraintAnchor3.f2803f != null) {
                        DependencyNode h13 = WidgetRun.h(constraintAnchor3);
                        if (h13 != null) {
                            WidgetRun.b(dependencyNode, h13, -this.f2874b.S[3].e());
                            WidgetRun.b(dependencyNode2, dependencyNode, -aVar.f2866g);
                        }
                        ConstraintWidget constraintWidget10 = this.f2874b;
                        if (constraintWidget10.F) {
                            WidgetRun.b(dependencyNode3, dependencyNode2, constraintWidget10.f2815d0);
                            return;
                        }
                        return;
                    }
                    ConstraintAnchor constraintAnchor4 = constraintAnchorArr[4];
                    if (constraintAnchor4.f2803f != null) {
                        DependencyNode h14 = WidgetRun.h(constraintAnchor4);
                        if (h14 != null) {
                            WidgetRun.b(dependencyNode3, h14, 0);
                            WidgetRun.b(dependencyNode2, dependencyNode3, -this.f2874b.f2815d0);
                            WidgetRun.b(dependencyNode, dependencyNode2, aVar.f2866g);
                            return;
                        }
                        return;
                    } else if (!(constraintWidget7 instanceof c0.a) && constraintWidget7.W != null && constraintWidget7.m(ConstraintAnchor.Type.CENTER).f2803f == null) {
                        ConstraintWidget constraintWidget11 = this.f2874b;
                        WidgetRun.b(dependencyNode2, constraintWidget11.W.f2816e.f2879h, constraintWidget11.w());
                        WidgetRun.b(dependencyNode, dependencyNode2, aVar.f2866g);
                        ConstraintWidget constraintWidget12 = this.f2874b;
                        if (constraintWidget12.F) {
                            WidgetRun.b(dependencyNode3, dependencyNode2, constraintWidget12.f2815d0);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
        ArrayList arrayList = aVar.f2871l;
        if (!z12 && this.f2875d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget13 = this.f2874b;
            int i10 = constraintWidget13.f2846t;
            ArrayList arrayList2 = aVar.f2870k;
            if (i10 != 2) {
                if (i10 == 3 && !constraintWidget13.C()) {
                    ConstraintWidget constraintWidget14 = this.f2874b;
                    if (constraintWidget14.f2844s != 3) {
                        androidx.constraintlayout.core.widgets.analyzer.a aVar2 = constraintWidget14.f2814d.f2876e;
                        arrayList.add(aVar2);
                        aVar2.f2870k.add(aVar);
                        aVar.f2862b = true;
                        arrayList2.add(dependencyNode2);
                        arrayList2.add(dependencyNode);
                    }
                }
            } else {
                ConstraintWidget constraintWidget15 = constraintWidget13.W;
                if (constraintWidget15 != null) {
                    androidx.constraintlayout.core.widgets.analyzer.a aVar3 = constraintWidget15.f2816e.f2876e;
                    arrayList.add(aVar3);
                    aVar3.f2870k.add(aVar);
                    aVar.f2862b = true;
                    arrayList2.add(dependencyNode2);
                    arrayList2.add(dependencyNode);
                }
            }
        } else {
            aVar.b(this);
        }
        ConstraintWidget constraintWidget16 = this.f2874b;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget16.S;
        ConstraintAnchor constraintAnchor5 = constraintAnchorArr2[2];
        ConstraintAnchor constraintAnchor6 = constraintAnchor5.f2803f;
        if (constraintAnchor6 != null && constraintAnchorArr2[3].f2803f != null) {
            if (constraintWidget16.C()) {
                dependencyNode2.f2865f = this.f2874b.S[2].e();
                dependencyNode.f2865f = -this.f2874b.S[3].e();
            } else {
                DependencyNode h15 = WidgetRun.h(this.f2874b.S[2]);
                DependencyNode h16 = WidgetRun.h(this.f2874b.S[3]);
                if (h15 != null) {
                    h15.b(this);
                }
                if (h16 != null) {
                    h16.b(this);
                }
                this.f2881j = WidgetRun.RunType.CENTER;
            }
            if (this.f2874b.F) {
                c(dependencyNode3, dependencyNode2, 1, this.f2888l);
            }
        } else if (constraintAnchor6 != null) {
            DependencyNode h17 = WidgetRun.h(constraintAnchor5);
            if (h17 != null) {
                WidgetRun.b(dependencyNode2, h17, this.f2874b.S[2].e());
                c(dependencyNode, dependencyNode2, 1, aVar);
                if (this.f2874b.F) {
                    c(dependencyNode3, dependencyNode2, 1, this.f2888l);
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = this.f2875d;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour2 == dimensionBehaviour3) {
                    ConstraintWidget constraintWidget17 = this.f2874b;
                    if (constraintWidget17.Z > 0.0f) {
                        c cVar = constraintWidget17.f2814d;
                        if (cVar.f2875d == dimensionBehaviour3) {
                            cVar.f2876e.f2870k.add(aVar);
                            arrayList.add(this.f2874b.f2814d.f2876e);
                            aVar.f2861a = this;
                        }
                    }
                }
            }
        } else {
            ConstraintAnchor constraintAnchor7 = constraintAnchorArr2[3];
            if (constraintAnchor7.f2803f != null) {
                DependencyNode h18 = WidgetRun.h(constraintAnchor7);
                if (h18 != null) {
                    WidgetRun.b(dependencyNode, h18, -this.f2874b.S[3].e());
                    c(dependencyNode2, dependencyNode, -1, aVar);
                    if (this.f2874b.F) {
                        c(dependencyNode3, dependencyNode2, 1, this.f2888l);
                    }
                }
            } else {
                ConstraintAnchor constraintAnchor8 = constraintAnchorArr2[4];
                if (constraintAnchor8.f2803f != null) {
                    DependencyNode h19 = WidgetRun.h(constraintAnchor8);
                    if (h19 != null) {
                        WidgetRun.b(dependencyNode3, h19, 0);
                        c(dependencyNode2, dependencyNode3, -1, this.f2888l);
                        c(dependencyNode, dependencyNode2, 1, aVar);
                    }
                } else if (!(constraintWidget16 instanceof c0.a) && (constraintWidget3 = constraintWidget16.W) != null) {
                    WidgetRun.b(dependencyNode2, constraintWidget3.f2816e.f2879h, constraintWidget16.w());
                    c(dependencyNode, dependencyNode2, 1, aVar);
                    if (this.f2874b.F) {
                        c(dependencyNode3, dependencyNode2, 1, this.f2888l);
                    }
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = this.f2875d;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviour4 == dimensionBehaviour5) {
                        ConstraintWidget constraintWidget18 = this.f2874b;
                        if (constraintWidget18.Z > 0.0f) {
                            c cVar2 = constraintWidget18.f2814d;
                            if (cVar2.f2875d == dimensionBehaviour5) {
                                cVar2.f2876e.f2870k.add(aVar);
                                arrayList.add(this.f2874b.f2814d.f2876e);
                                aVar.f2861a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList.size() == 0) {
            aVar.c = true;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void e() {
        DependencyNode dependencyNode = this.f2879h;
        if (dependencyNode.f2869j) {
            this.f2874b.f2813c0 = dependencyNode.f2866g;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void f() {
        this.c = null;
        this.f2879h.c();
        this.f2880i.c();
        this.f2887k.c();
        this.f2876e.c();
        this.f2878g = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final boolean k() {
        if (this.f2875d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.f2874b.f2846t == 0) {
            return true;
        }
        return false;
    }

    public final void m() {
        this.f2878g = false;
        DependencyNode dependencyNode = this.f2879h;
        dependencyNode.c();
        dependencyNode.f2869j = false;
        DependencyNode dependencyNode2 = this.f2880i;
        dependencyNode2.c();
        dependencyNode2.f2869j = false;
        DependencyNode dependencyNode3 = this.f2887k;
        dependencyNode3.c();
        dependencyNode3.f2869j = false;
        this.f2876e.f2869j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f2874b.f2831l0;
    }
}
