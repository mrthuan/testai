package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: Guideline.java */
/* loaded from: classes.dex */
public final class f extends ConstraintWidget {
    public boolean B0;

    /* renamed from: w0  reason: collision with root package name */
    public float f2934w0 = -1.0f;

    /* renamed from: x0  reason: collision with root package name */
    public int f2935x0 = -1;

    /* renamed from: y0  reason: collision with root package name */
    public int f2936y0 = -1;

    /* renamed from: z0  reason: collision with root package name */
    public ConstraintAnchor f2937z0 = this.L;
    public int A0 = 0;

    /* compiled from: Guideline.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f2938a;

        static {
            int[] iArr = new int[ConstraintAnchor.Type.values().length];
            f2938a = iArr;
            try {
                iArr[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2938a[ConstraintAnchor.Type.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2938a[ConstraintAnchor.Type.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2938a[ConstraintAnchor.Type.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2938a[ConstraintAnchor.Type.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2938a[ConstraintAnchor.Type.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2938a[ConstraintAnchor.Type.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2938a[ConstraintAnchor.Type.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2938a[ConstraintAnchor.Type.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public f() {
        this.T.clear();
        this.T.add(this.f2937z0);
        int length = this.S.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.S[i10] = this.f2937z0;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean E() {
        return this.B0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean F() {
        return this.B0;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void T(androidx.constraintlayout.core.c cVar, boolean z10) {
        if (this.W == null) {
            return;
        }
        ConstraintAnchor constraintAnchor = this.f2937z0;
        cVar.getClass();
        int n10 = androidx.constraintlayout.core.c.n(constraintAnchor);
        if (this.A0 == 1) {
            this.f2812b0 = n10;
            this.f2813c0 = 0;
            O(this.W.o());
            R(0);
            return;
        }
        this.f2812b0 = 0;
        this.f2813c0 = n10;
        R(this.W.u());
        O(0);
    }

    public final void U(int i10) {
        this.f2937z0.l(i10);
        this.B0 = true;
    }

    public final void V(int i10) {
        if (this.A0 == i10) {
            return;
        }
        this.A0 = i10;
        ArrayList<ConstraintAnchor> arrayList = this.T;
        arrayList.clear();
        if (this.A0 == 1) {
            this.f2937z0 = this.K;
        } else {
            this.f2937z0 = this.L;
        }
        arrayList.add(this.f2937z0);
        ConstraintAnchor[] constraintAnchorArr = this.S;
        int length = constraintAnchorArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            constraintAnchorArr[i11] = this.f2937z0;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void e(androidx.constraintlayout.core.c cVar, boolean z10) {
        boolean z11;
        d dVar = (d) this.W;
        if (dVar == null) {
            return;
        }
        Object m10 = dVar.m(ConstraintAnchor.Type.LEFT);
        Object m11 = dVar.m(ConstraintAnchor.Type.RIGHT);
        ConstraintWidget constraintWidget = this.W;
        boolean z12 = true;
        if (constraintWidget != null && constraintWidget.V[0] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.A0 == 0) {
            m10 = dVar.m(ConstraintAnchor.Type.TOP);
            m11 = dVar.m(ConstraintAnchor.Type.BOTTOM);
            ConstraintWidget constraintWidget2 = this.W;
            if (constraintWidget2 == null || constraintWidget2.V[1] != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                z12 = false;
            }
            z11 = z12;
        }
        if (this.B0) {
            ConstraintAnchor constraintAnchor = this.f2937z0;
            if (constraintAnchor.c) {
                SolverVariable k10 = cVar.k(constraintAnchor);
                cVar.d(k10, this.f2937z0.d());
                if (this.f2935x0 != -1) {
                    if (z11) {
                        cVar.f(cVar.k(m11), k10, 0, 5);
                    }
                } else if (this.f2936y0 != -1 && z11) {
                    SolverVariable k11 = cVar.k(m11);
                    cVar.f(k10, cVar.k(m10), 0, 5);
                    cVar.f(k11, k10, 0, 5);
                }
                this.B0 = false;
                return;
            }
        }
        if (this.f2935x0 != -1) {
            SolverVariable k12 = cVar.k(this.f2937z0);
            cVar.e(k12, cVar.k(m10), this.f2935x0, 8);
            if (z11) {
                cVar.f(cVar.k(m11), k12, 0, 5);
            }
        } else if (this.f2936y0 != -1) {
            SolverVariable k13 = cVar.k(this.f2937z0);
            SolverVariable k14 = cVar.k(m11);
            cVar.e(k13, k14, -this.f2936y0, 8);
            if (z11) {
                cVar.f(k13, cVar.k(m10), 0, 5);
                cVar.f(k14, k13, 0, 5);
            }
        } else if (this.f2934w0 != -1.0f) {
            SolverVariable k15 = cVar.k(this.f2937z0);
            SolverVariable k16 = cVar.k(m11);
            float f10 = this.f2934w0;
            androidx.constraintlayout.core.b l10 = cVar.l();
            l10.f2775d.d(k15, -1.0f);
            l10.f2775d.d(k16, f10);
            cVar.c(l10);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final boolean f() {
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void j(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.j(constraintWidget, hashMap);
        f fVar = (f) constraintWidget;
        this.f2934w0 = fVar.f2934w0;
        this.f2935x0 = fVar.f2935x0;
        this.f2936y0 = fVar.f2936y0;
        V(fVar.A0);
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final ConstraintAnchor m(ConstraintAnchor.Type type) {
        int i10 = a.f2938a[type.ordinal()];
        if (i10 != 1 && i10 != 2) {
            if ((i10 == 3 || i10 == 4) && this.A0 == 0) {
                return this.f2937z0;
            }
            return null;
        } else if (this.A0 == 1) {
            return this.f2937z0;
        } else {
            return null;
        }
    }
}
