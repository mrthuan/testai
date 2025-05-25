package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* compiled from: Optimizer.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean[] f2939a = new boolean[3];

    public static void a(d dVar, androidx.constraintlayout.core.c cVar, ConstraintWidget constraintWidget) {
        constraintWidget.f2838p = -1;
        constraintWidget.f2840q = -1;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = dVar.V[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviour != dimensionBehaviour2 && constraintWidget.V[0] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            ConstraintAnchor constraintAnchor = constraintWidget.K;
            int i10 = constraintAnchor.f2804g;
            int u7 = dVar.u();
            ConstraintAnchor constraintAnchor2 = constraintWidget.M;
            int i11 = u7 - constraintAnchor2.f2804g;
            constraintAnchor.f2806i = cVar.k(constraintAnchor);
            constraintAnchor2.f2806i = cVar.k(constraintAnchor2);
            cVar.d(constraintAnchor.f2806i, i10);
            cVar.d(constraintAnchor2.f2806i, i11);
            constraintWidget.f2838p = 2;
            constraintWidget.f2812b0 = i10;
            int i12 = i11 - i10;
            constraintWidget.X = i12;
            int i13 = constraintWidget.f2817e0;
            if (i12 < i13) {
                constraintWidget.X = i13;
            }
        }
        if (dVar.V[1] != dimensionBehaviour2 && constraintWidget.V[1] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
            ConstraintAnchor constraintAnchor3 = constraintWidget.L;
            int i14 = constraintAnchor3.f2804g;
            int o10 = dVar.o();
            ConstraintAnchor constraintAnchor4 = constraintWidget.N;
            int i15 = o10 - constraintAnchor4.f2804g;
            constraintAnchor3.f2806i = cVar.k(constraintAnchor3);
            constraintAnchor4.f2806i = cVar.k(constraintAnchor4);
            cVar.d(constraintAnchor3.f2806i, i14);
            cVar.d(constraintAnchor4.f2806i, i15);
            if (constraintWidget.f2815d0 > 0 || constraintWidget.f2827j0 == 8) {
                ConstraintAnchor constraintAnchor5 = constraintWidget.O;
                constraintAnchor5.f2806i = cVar.k(constraintAnchor5);
                cVar.d(constraintAnchor5.f2806i, constraintWidget.f2815d0 + i14);
            }
            constraintWidget.f2840q = 2;
            constraintWidget.f2813c0 = i14;
            int i16 = i15 - i14;
            constraintWidget.Y = i16;
            int i17 = constraintWidget.f2819f0;
            if (i16 < i17) {
                constraintWidget.Y = i17;
            }
        }
    }

    public static final boolean b(int i10, int i11) {
        if ((i10 & i11) == i11) {
            return true;
        }
        return false;
    }
}
