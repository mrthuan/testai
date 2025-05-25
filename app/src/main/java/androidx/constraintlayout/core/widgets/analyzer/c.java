package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import java.util.ArrayList;

/* compiled from: HorizontalWidgetRun.java */
/* loaded from: classes.dex */
public final class c extends WidgetRun {

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f2885k = new int[2];

    /* compiled from: HorizontalWidgetRun.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f2886a;

        static {
            int[] iArr = new int[WidgetRun.RunType.values().length];
            f2886a = iArr;
            try {
                iArr[WidgetRun.RunType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2886a[WidgetRun.RunType.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2886a[WidgetRun.RunType.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public c(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        this.f2879h.f2864e = DependencyNode.Type.LEFT;
        this.f2880i.f2864e = DependencyNode.Type.RIGHT;
        this.f2877f = 0;
    }

    public static void m(int[] iArr, int i10, int i11, int i12, int i13, float f10, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 != -1) {
            if (i14 != 0) {
                if (i14 == 1) {
                    iArr[0] = i15;
                    iArr[1] = (int) ((i15 * f10) + 0.5f);
                    return;
                }
                return;
            }
            iArr[0] = (int) ((i16 * f10) + 0.5f);
            iArr[1] = i16;
            return;
        }
        int i17 = (int) ((i16 * f10) + 0.5f);
        int i18 = (int) ((i15 / f10) + 0.5f);
        if (i17 <= i15) {
            iArr[0] = i17;
            iArr[1] = i16;
        } else if (i18 <= i16) {
            iArr[0] = i15;
            iArr[1] = i18;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0248, code lost:
        if (r15 != 1) goto L127;
     */
    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, d0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(d0.d r23) {
        /*
            Method dump skipped, instructions count: 901
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.analyzer.c.a(d0.d):void");
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void d() {
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintWidget constraintWidget5 = this.f2874b;
        boolean z10 = constraintWidget5.f2809a;
        androidx.constraintlayout.core.widgets.analyzer.a aVar = this.f2876e;
        if (z10) {
            aVar.d(constraintWidget5.u());
        }
        boolean z11 = aVar.f2869j;
        DependencyNode dependencyNode = this.f2880i;
        DependencyNode dependencyNode2 = this.f2879h;
        if (!z11) {
            ConstraintWidget constraintWidget6 = this.f2874b;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = constraintWidget6.V[0];
            this.f2875d = dimensionBehaviour3;
            if (dimensionBehaviour3 != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                if (dimensionBehaviour3 == dimensionBehaviour4 && (constraintWidget4 = constraintWidget6.W) != null && ((dimensionBehaviour2 = constraintWidget4.V[0]) == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour2 == dimensionBehaviour4)) {
                    int u7 = (constraintWidget4.u() - this.f2874b.K.e()) - this.f2874b.M.e();
                    WidgetRun.b(dependencyNode2, constraintWidget4.f2814d.f2879h, this.f2874b.K.e());
                    WidgetRun.b(dependencyNode, constraintWidget4.f2814d.f2880i, -this.f2874b.M.e());
                    aVar.d(u7);
                    return;
                } else if (dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.FIXED) {
                    aVar.d(constraintWidget6.u());
                }
            }
        } else {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = this.f2875d;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
            if (dimensionBehaviour5 == dimensionBehaviour6 && (constraintWidget2 = (constraintWidget = this.f2874b).W) != null && ((dimensionBehaviour = constraintWidget2.V[0]) == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour == dimensionBehaviour6)) {
                WidgetRun.b(dependencyNode2, constraintWidget2.f2814d.f2879h, constraintWidget.K.e());
                WidgetRun.b(dependencyNode, constraintWidget2.f2814d.f2880i, -this.f2874b.M.e());
                return;
            }
        }
        if (aVar.f2869j) {
            ConstraintWidget constraintWidget7 = this.f2874b;
            if (constraintWidget7.f2809a) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget7.S;
                ConstraintAnchor constraintAnchor = constraintAnchorArr[0];
                ConstraintAnchor constraintAnchor2 = constraintAnchor.f2803f;
                if (constraintAnchor2 != null && constraintAnchorArr[1].f2803f != null) {
                    if (constraintWidget7.B()) {
                        dependencyNode2.f2865f = this.f2874b.S[0].e();
                        dependencyNode.f2865f = -this.f2874b.S[1].e();
                        return;
                    }
                    DependencyNode h10 = WidgetRun.h(this.f2874b.S[0]);
                    if (h10 != null) {
                        WidgetRun.b(dependencyNode2, h10, this.f2874b.S[0].e());
                    }
                    DependencyNode h11 = WidgetRun.h(this.f2874b.S[1]);
                    if (h11 != null) {
                        WidgetRun.b(dependencyNode, h11, -this.f2874b.S[1].e());
                    }
                    dependencyNode2.f2862b = true;
                    dependencyNode.f2862b = true;
                    return;
                } else if (constraintAnchor2 != null) {
                    DependencyNode h12 = WidgetRun.h(constraintAnchor);
                    if (h12 != null) {
                        WidgetRun.b(dependencyNode2, h12, this.f2874b.S[0].e());
                        WidgetRun.b(dependencyNode, dependencyNode2, aVar.f2866g);
                        return;
                    }
                    return;
                } else {
                    ConstraintAnchor constraintAnchor3 = constraintAnchorArr[1];
                    if (constraintAnchor3.f2803f != null) {
                        DependencyNode h13 = WidgetRun.h(constraintAnchor3);
                        if (h13 != null) {
                            WidgetRun.b(dependencyNode, h13, -this.f2874b.S[1].e());
                            WidgetRun.b(dependencyNode2, dependencyNode, -aVar.f2866g);
                            return;
                        }
                        return;
                    } else if (!(constraintWidget7 instanceof c0.a) && constraintWidget7.W != null && constraintWidget7.m(ConstraintAnchor.Type.CENTER).f2803f == null) {
                        ConstraintWidget constraintWidget8 = this.f2874b;
                        WidgetRun.b(dependencyNode2, constraintWidget8.W.f2814d.f2879h, constraintWidget8.v());
                        WidgetRun.b(dependencyNode, dependencyNode2, aVar.f2866g);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
        if (this.f2875d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            ConstraintWidget constraintWidget9 = this.f2874b;
            int i10 = constraintWidget9.f2844s;
            ArrayList arrayList = aVar.f2870k;
            ArrayList arrayList2 = aVar.f2871l;
            if (i10 != 2) {
                if (i10 == 3) {
                    if (constraintWidget9.f2846t == 3) {
                        dependencyNode2.f2861a = this;
                        dependencyNode.f2861a = this;
                        d dVar = constraintWidget9.f2816e;
                        dVar.f2879h.f2861a = this;
                        dVar.f2880i.f2861a = this;
                        aVar.f2861a = this;
                        if (constraintWidget9.C()) {
                            arrayList2.add(this.f2874b.f2816e.f2876e);
                            this.f2874b.f2816e.f2876e.f2870k.add(aVar);
                            d dVar2 = this.f2874b.f2816e;
                            dVar2.f2876e.f2861a = this;
                            arrayList2.add(dVar2.f2879h);
                            arrayList2.add(this.f2874b.f2816e.f2880i);
                            this.f2874b.f2816e.f2879h.f2870k.add(aVar);
                            this.f2874b.f2816e.f2880i.f2870k.add(aVar);
                        } else if (this.f2874b.B()) {
                            this.f2874b.f2816e.f2876e.f2871l.add(aVar);
                            arrayList.add(this.f2874b.f2816e.f2876e);
                        } else {
                            this.f2874b.f2816e.f2876e.f2871l.add(aVar);
                        }
                    } else {
                        androidx.constraintlayout.core.widgets.analyzer.a aVar2 = constraintWidget9.f2816e.f2876e;
                        arrayList2.add(aVar2);
                        aVar2.f2870k.add(aVar);
                        this.f2874b.f2816e.f2879h.f2870k.add(aVar);
                        this.f2874b.f2816e.f2880i.f2870k.add(aVar);
                        aVar.f2862b = true;
                        arrayList.add(dependencyNode2);
                        arrayList.add(dependencyNode);
                        dependencyNode2.f2871l.add(aVar);
                        dependencyNode.f2871l.add(aVar);
                    }
                }
            } else {
                ConstraintWidget constraintWidget10 = constraintWidget9.W;
                if (constraintWidget10 != null) {
                    androidx.constraintlayout.core.widgets.analyzer.a aVar3 = constraintWidget10.f2816e.f2876e;
                    arrayList2.add(aVar3);
                    aVar3.f2870k.add(aVar);
                    aVar.f2862b = true;
                    arrayList.add(dependencyNode2);
                    arrayList.add(dependencyNode);
                }
            }
        }
        ConstraintWidget constraintWidget11 = this.f2874b;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget11.S;
        ConstraintAnchor constraintAnchor4 = constraintAnchorArr2[0];
        ConstraintAnchor constraintAnchor5 = constraintAnchor4.f2803f;
        if (constraintAnchor5 != null && constraintAnchorArr2[1].f2803f != null) {
            if (constraintWidget11.B()) {
                dependencyNode2.f2865f = this.f2874b.S[0].e();
                dependencyNode.f2865f = -this.f2874b.S[1].e();
                return;
            }
            DependencyNode h14 = WidgetRun.h(this.f2874b.S[0]);
            DependencyNode h15 = WidgetRun.h(this.f2874b.S[1]);
            if (h14 != null) {
                h14.b(this);
            }
            if (h15 != null) {
                h15.b(this);
            }
            this.f2881j = WidgetRun.RunType.CENTER;
        } else if (constraintAnchor5 != null) {
            DependencyNode h16 = WidgetRun.h(constraintAnchor4);
            if (h16 != null) {
                WidgetRun.b(dependencyNode2, h16, this.f2874b.S[0].e());
                c(dependencyNode, dependencyNode2, 1, aVar);
            }
        } else {
            ConstraintAnchor constraintAnchor6 = constraintAnchorArr2[1];
            if (constraintAnchor6.f2803f != null) {
                DependencyNode h17 = WidgetRun.h(constraintAnchor6);
                if (h17 != null) {
                    WidgetRun.b(dependencyNode, h17, -this.f2874b.S[1].e());
                    c(dependencyNode2, dependencyNode, -1, aVar);
                }
            } else if (!(constraintWidget11 instanceof c0.a) && (constraintWidget3 = constraintWidget11.W) != null) {
                WidgetRun.b(dependencyNode2, constraintWidget3.f2814d.f2879h, constraintWidget11.v());
                c(dependencyNode, dependencyNode2, 1, aVar);
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void e() {
        DependencyNode dependencyNode = this.f2879h;
        if (dependencyNode.f2869j) {
            this.f2874b.f2812b0 = dependencyNode.f2866g;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void f() {
        this.c = null;
        this.f2879h.c();
        this.f2880i.c();
        this.f2876e.c();
        this.f2878g = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final boolean k() {
        if (this.f2875d != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || this.f2874b.f2844s == 0) {
            return true;
        }
        return false;
    }

    public final void n() {
        this.f2878g = false;
        DependencyNode dependencyNode = this.f2879h;
        dependencyNode.c();
        dependencyNode.f2869j = false;
        DependencyNode dependencyNode2 = this.f2880i;
        dependencyNode2.c();
        dependencyNode2.f2869j = false;
        this.f2876e.f2869j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f2874b.f2831l0;
    }
}
