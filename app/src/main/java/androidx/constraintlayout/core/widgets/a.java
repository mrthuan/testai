package androidx.constraintlayout.core.widgets;

import androidx.activity.r;
import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.HashMap;

/* compiled from: Barrier.java */
/* loaded from: classes.dex */
public final class a extends c0.b {

    /* renamed from: y0  reason: collision with root package name */
    public int f2859y0 = 0;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f2860z0 = true;
    public int A0 = 0;
    public boolean B0 = false;

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean E() {
        return this.B0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean F() {
        return this.B0;
    }

    public final boolean V() {
        int i10;
        int i11;
        int i12;
        boolean z10 = true;
        int i13 = 0;
        while (true) {
            i10 = this.f5503x0;
            if (i13 >= i10) {
                break;
            }
            ConstraintWidget constraintWidget = this.f5502w0[i13];
            if ((this.f2860z0 || constraintWidget.f()) && ((((i11 = this.f2859y0) == 0 || i11 == 1) && !constraintWidget.E()) || (((i12 = this.f2859y0) == 2 || i12 == 3) && !constraintWidget.F()))) {
                z10 = false;
            }
            i13++;
        }
        if (!z10 || i10 <= 0) {
            return false;
        }
        int i14 = 0;
        boolean z11 = false;
        for (int i15 = 0; i15 < this.f5503x0; i15++) {
            ConstraintWidget constraintWidget2 = this.f5502w0[i15];
            if (this.f2860z0 || constraintWidget2.f()) {
                if (!z11) {
                    int i16 = this.f2859y0;
                    if (i16 == 0) {
                        i14 = constraintWidget2.m(ConstraintAnchor.Type.LEFT).d();
                    } else if (i16 == 1) {
                        i14 = constraintWidget2.m(ConstraintAnchor.Type.RIGHT).d();
                    } else if (i16 == 2) {
                        i14 = constraintWidget2.m(ConstraintAnchor.Type.TOP).d();
                    } else if (i16 == 3) {
                        i14 = constraintWidget2.m(ConstraintAnchor.Type.BOTTOM).d();
                    }
                    z11 = true;
                }
                int i17 = this.f2859y0;
                if (i17 == 0) {
                    i14 = Math.min(i14, constraintWidget2.m(ConstraintAnchor.Type.LEFT).d());
                } else if (i17 == 1) {
                    i14 = Math.max(i14, constraintWidget2.m(ConstraintAnchor.Type.RIGHT).d());
                } else if (i17 == 2) {
                    i14 = Math.min(i14, constraintWidget2.m(ConstraintAnchor.Type.TOP).d());
                } else if (i17 == 3) {
                    i14 = Math.max(i14, constraintWidget2.m(ConstraintAnchor.Type.BOTTOM).d());
                }
            }
        }
        int i18 = i14 + this.A0;
        int i19 = this.f2859y0;
        if (i19 != 0 && i19 != 1) {
            N(i18, i18);
        } else {
            M(i18, i18);
        }
        this.B0 = true;
        return true;
    }

    public final int W() {
        int i10 = this.f2859y0;
        if (i10 != 0 && i10 != 1) {
            if (i10 == 2 || i10 == 3) {
                return 1;
            }
            return -1;
        }
        return 0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void e(androidx.constraintlayout.core.c cVar, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i10;
        int i11;
        int i12;
        int i13;
        ConstraintAnchor[] constraintAnchorArr = this.S;
        ConstraintAnchor constraintAnchor = this.K;
        constraintAnchorArr[0] = constraintAnchor;
        int i14 = 2;
        ConstraintAnchor constraintAnchor2 = this.L;
        constraintAnchorArr[2] = constraintAnchor2;
        ConstraintAnchor constraintAnchor3 = this.M;
        constraintAnchorArr[1] = constraintAnchor3;
        ConstraintAnchor constraintAnchor4 = this.N;
        constraintAnchorArr[3] = constraintAnchor4;
        for (ConstraintAnchor constraintAnchor5 : constraintAnchorArr) {
            constraintAnchor5.f2806i = cVar.k(constraintAnchor5);
        }
        int i15 = this.f2859y0;
        if (i15 >= 0 && i15 < 4) {
            ConstraintAnchor constraintAnchor6 = constraintAnchorArr[i15];
            if (!this.B0) {
                V();
            }
            if (this.B0) {
                this.B0 = false;
                int i16 = this.f2859y0;
                if (i16 != 0 && i16 != 1) {
                    if (i16 == 2 || i16 == 3) {
                        cVar.d(constraintAnchor2.f2806i, this.f2813c0);
                        cVar.d(constraintAnchor4.f2806i, this.f2813c0);
                        return;
                    }
                    return;
                }
                cVar.d(constraintAnchor.f2806i, this.f2812b0);
                cVar.d(constraintAnchor3.f2806i, this.f2812b0);
                return;
            }
            for (int i17 = 0; i17 < this.f5503x0; i17++) {
                ConstraintWidget constraintWidget = this.f5502w0[i17];
                if ((this.f2860z0 || constraintWidget.f()) && ((((i13 = this.f2859y0) == 0 || i13 == 1) && constraintWidget.V[0] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.K.f2803f != null && constraintWidget.M.f2803f != null) || ((i13 == 2 || i13 == 3) && constraintWidget.V[1] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.L.f2803f != null && constraintWidget.N.f2803f != null))) {
                    z11 = true;
                    break;
                }
            }
            z11 = false;
            if (!constraintAnchor.g() && !constraintAnchor3.g()) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (!constraintAnchor2.g() && !constraintAnchor4.g()) {
                z13 = false;
            } else {
                z13 = true;
            }
            if (!z11 && (((i12 = this.f2859y0) == 0 && z12) || ((i12 == 2 && z13) || ((i12 == 1 && z12) || (i12 == 3 && z13))))) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (!z14) {
                i10 = 4;
            } else {
                i10 = 5;
            }
            int i18 = 0;
            while (i18 < this.f5503x0) {
                ConstraintWidget constraintWidget2 = this.f5502w0[i18];
                if (this.f2860z0 || constraintWidget2.f()) {
                    SolverVariable k10 = cVar.k(constraintWidget2.S[this.f2859y0]);
                    int i19 = this.f2859y0;
                    ConstraintAnchor constraintAnchor7 = constraintWidget2.S[i19];
                    constraintAnchor7.f2806i = k10;
                    ConstraintAnchor constraintAnchor8 = constraintAnchor7.f2803f;
                    if (constraintAnchor8 != null && constraintAnchor8.f2801d == this) {
                        i11 = constraintAnchor7.f2804g + 0;
                    } else {
                        i11 = 0;
                    }
                    if (i19 != 0 && i19 != i14) {
                        androidx.constraintlayout.core.b l10 = cVar.l();
                        SolverVariable m10 = cVar.m();
                        m10.f2754d = 0;
                        l10.c(constraintAnchor6.f2806i, k10, m10, this.A0 + i11);
                        cVar.c(l10);
                    } else {
                        androidx.constraintlayout.core.b l11 = cVar.l();
                        SolverVariable m11 = cVar.m();
                        m11.f2754d = 0;
                        l11.d(constraintAnchor6.f2806i, k10, m11, this.A0 - i11);
                        cVar.c(l11);
                    }
                    cVar.e(constraintAnchor6.f2806i, k10, this.A0 + i11, i10);
                }
                i18++;
                i14 = 2;
            }
            int i20 = this.f2859y0;
            if (i20 == 0) {
                cVar.e(constraintAnchor3.f2806i, constraintAnchor.f2806i, 0, 8);
                cVar.e(constraintAnchor.f2806i, this.W.M.f2806i, 0, 4);
                cVar.e(constraintAnchor.f2806i, this.W.K.f2806i, 0, 0);
            } else if (i20 == 1) {
                cVar.e(constraintAnchor.f2806i, constraintAnchor3.f2806i, 0, 8);
                cVar.e(constraintAnchor.f2806i, this.W.K.f2806i, 0, 4);
                cVar.e(constraintAnchor.f2806i, this.W.M.f2806i, 0, 0);
            } else if (i20 == 2) {
                cVar.e(constraintAnchor4.f2806i, constraintAnchor2.f2806i, 0, 8);
                cVar.e(constraintAnchor2.f2806i, this.W.N.f2806i, 0, 4);
                cVar.e(constraintAnchor2.f2806i, this.W.L.f2806i, 0, 0);
            } else if (i20 == 3) {
                cVar.e(constraintAnchor2.f2806i, constraintAnchor4.f2806i, 0, 8);
                cVar.e(constraintAnchor2.f2806i, this.W.L.f2806i, 0, 4);
                cVar.e(constraintAnchor2.f2806i, this.W.N.f2806i, 0, 0);
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean f() {
        return true;
    }

    @Override // c0.b, androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void j(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.j(constraintWidget, hashMap);
        a aVar = (a) constraintWidget;
        this.f2859y0 = aVar.f2859y0;
        this.f2860z0 = aVar.f2860z0;
        this.A0 = aVar.A0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final String toString() {
        String g10 = r.g(new StringBuilder("[Barrier] "), this.f2831l0, " {");
        for (int i10 = 0; i10 < this.f5503x0; i10++) {
            ConstraintWidget constraintWidget = this.f5502w0[i10];
            if (i10 > 0) {
                g10 = a6.h.c(g10, ", ");
            }
            StringBuilder k10 = a0.a.k(g10);
            k10.append(constraintWidget.f2831l0);
            g10 = k10.toString();
        }
        return a6.h.c(g10, "}");
    }
}
