package d0;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;

/* compiled from: Grouping.java */
/* loaded from: classes.dex */
public final class g {
    public static j a(ConstraintWidget constraintWidget, int i10, ArrayList<j> arrayList, j jVar) {
        int i11;
        boolean z10;
        int i12;
        if (i10 == 0) {
            i11 = constraintWidget.f2849u0;
        } else {
            i11 = constraintWidget.f2851v0;
        }
        int i13 = 0;
        if (i11 != -1 && (jVar == null || i11 != jVar.f16031b)) {
            int i14 = 0;
            while (true) {
                if (i14 >= arrayList.size()) {
                    break;
                }
                j jVar2 = arrayList.get(i14);
                if (jVar2.f16031b == i11) {
                    if (jVar != null) {
                        jVar.c(i10, jVar2);
                        arrayList.remove(jVar);
                    }
                    jVar = jVar2;
                } else {
                    i14++;
                }
            }
        } else if (i11 != -1) {
            return jVar;
        }
        if (jVar == null) {
            if (constraintWidget instanceof c0.b) {
                c0.b bVar = (c0.b) constraintWidget;
                int i15 = 0;
                while (true) {
                    if (i15 < bVar.f5503x0) {
                        ConstraintWidget constraintWidget2 = bVar.f5502w0[i15];
                        if ((i10 == 0 && (i12 = constraintWidget2.f2849u0) != -1) || (i10 == 1 && (i12 = constraintWidget2.f2851v0) != -1)) {
                            break;
                        }
                        i15++;
                    } else {
                        i12 = -1;
                        break;
                    }
                }
                if (i12 != -1) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= arrayList.size()) {
                            break;
                        }
                        j jVar3 = arrayList.get(i16);
                        if (jVar3.f16031b == i12) {
                            jVar = jVar3;
                            break;
                        }
                        i16++;
                    }
                }
            }
            if (jVar == null) {
                jVar = new j(i10);
            }
            arrayList.add(jVar);
        }
        ArrayList<ConstraintWidget> arrayList2 = jVar.f16030a;
        if (arrayList2.contains(constraintWidget)) {
            z10 = false;
        } else {
            arrayList2.add(constraintWidget);
            z10 = true;
        }
        if (z10) {
            if (constraintWidget instanceof androidx.constraintlayout.core.widgets.f) {
                androidx.constraintlayout.core.widgets.f fVar = (androidx.constraintlayout.core.widgets.f) constraintWidget;
                ConstraintAnchor constraintAnchor = fVar.f2937z0;
                if (fVar.A0 == 0) {
                    i13 = 1;
                }
                constraintAnchor.c(i13, jVar, arrayList);
            }
            int i17 = jVar.f16031b;
            if (i10 == 0) {
                constraintWidget.f2849u0 = i17;
                constraintWidget.K.c(i10, jVar, arrayList);
                constraintWidget.M.c(i10, jVar, arrayList);
            } else {
                constraintWidget.f2851v0 = i17;
                constraintWidget.L.c(i10, jVar, arrayList);
                constraintWidget.O.c(i10, jVar, arrayList);
                constraintWidget.N.c(i10, jVar, arrayList);
            }
            constraintWidget.R.c(i10, jVar, arrayList);
        }
        return jVar;
    }

    public static boolean b(ConstraintWidget.DimensionBehaviour dimensionBehaviour, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, ConstraintWidget.DimensionBehaviour dimensionBehaviour3, ConstraintWidget.DimensionBehaviour dimensionBehaviour4) {
        boolean z10;
        boolean z11;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour6;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.FIXED;
        if (dimensionBehaviour3 != dimensionBehaviour7 && dimensionBehaviour3 != (dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) && (dimensionBehaviour3 != ConstraintWidget.DimensionBehaviour.MATCH_PARENT || dimensionBehaviour == dimensionBehaviour6)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (dimensionBehaviour4 != dimensionBehaviour7 && dimensionBehaviour4 != (dimensionBehaviour5 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) && (dimensionBehaviour4 != ConstraintWidget.DimensionBehaviour.MATCH_PARENT || dimensionBehaviour2 == dimensionBehaviour5)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z10 && !z11) {
            return false;
        }
        return true;
    }
}
