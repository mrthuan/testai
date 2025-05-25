package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: Flow.java */
/* loaded from: classes.dex */
public final class e extends i {

    /* renamed from: g1  reason: collision with root package name */
    public ConstraintWidget[] f2915g1;
    public int J0 = -1;
    public int K0 = -1;
    public int L0 = -1;
    public int M0 = -1;
    public int N0 = -1;
    public int O0 = -1;
    public float P0 = 0.5f;
    public float Q0 = 0.5f;
    public float R0 = 0.5f;
    public float S0 = 0.5f;
    public float T0 = 0.5f;
    public float U0 = 0.5f;
    public int V0 = 0;
    public int W0 = 0;
    public int X0 = 2;
    public int Y0 = 2;
    public int Z0 = 0;

    /* renamed from: a1  reason: collision with root package name */
    public int f2909a1 = -1;

    /* renamed from: b1  reason: collision with root package name */
    public int f2910b1 = 0;

    /* renamed from: c1  reason: collision with root package name */
    public final ArrayList<a> f2911c1 = new ArrayList<>();

    /* renamed from: d1  reason: collision with root package name */
    public ConstraintWidget[] f2912d1 = null;

    /* renamed from: e1  reason: collision with root package name */
    public ConstraintWidget[] f2913e1 = null;

    /* renamed from: f1  reason: collision with root package name */
    public int[] f2914f1 = null;

    /* renamed from: h1  reason: collision with root package name */
    public int f2916h1 = 0;

    /* compiled from: Flow.java */
    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public int f2917a;

        /* renamed from: d  reason: collision with root package name */
        public ConstraintAnchor f2919d;

        /* renamed from: e  reason: collision with root package name */
        public ConstraintAnchor f2920e;

        /* renamed from: f  reason: collision with root package name */
        public ConstraintAnchor f2921f;

        /* renamed from: g  reason: collision with root package name */
        public ConstraintAnchor f2922g;

        /* renamed from: h  reason: collision with root package name */
        public int f2923h;

        /* renamed from: i  reason: collision with root package name */
        public int f2924i;

        /* renamed from: j  reason: collision with root package name */
        public int f2925j;

        /* renamed from: k  reason: collision with root package name */
        public int f2926k;

        /* renamed from: q  reason: collision with root package name */
        public int f2932q;

        /* renamed from: b  reason: collision with root package name */
        public ConstraintWidget f2918b = null;
        public int c = 0;

        /* renamed from: l  reason: collision with root package name */
        public int f2927l = 0;

        /* renamed from: m  reason: collision with root package name */
        public int f2928m = 0;

        /* renamed from: n  reason: collision with root package name */
        public int f2929n = 0;

        /* renamed from: o  reason: collision with root package name */
        public int f2930o = 0;

        /* renamed from: p  reason: collision with root package name */
        public int f2931p = 0;

        public a(int i10, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i11) {
            this.f2923h = 0;
            this.f2924i = 0;
            this.f2925j = 0;
            this.f2926k = 0;
            this.f2932q = 0;
            this.f2917a = i10;
            this.f2919d = constraintAnchor;
            this.f2920e = constraintAnchor2;
            this.f2921f = constraintAnchor3;
            this.f2922g = constraintAnchor4;
            this.f2923h = e.this.C0;
            this.f2924i = e.this.f2940y0;
            this.f2925j = e.this.D0;
            this.f2926k = e.this.f2941z0;
            this.f2932q = i11;
        }

        public final void a(ConstraintWidget constraintWidget) {
            int i10 = this.f2917a;
            int i11 = 0;
            e eVar = e.this;
            if (i10 == 0) {
                int Y = eVar.Y(this.f2932q, constraintWidget);
                if (constraintWidget.V[0] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.f2931p++;
                    Y = 0;
                }
                int i12 = eVar.V0;
                if (constraintWidget.f2827j0 != 8) {
                    i11 = i12;
                }
                this.f2927l = Y + i11 + this.f2927l;
                int X = eVar.X(this.f2932q, constraintWidget);
                if (this.f2918b == null || this.c < X) {
                    this.f2918b = constraintWidget;
                    this.c = X;
                    this.f2928m = X;
                }
            } else {
                int Y2 = eVar.Y(this.f2932q, constraintWidget);
                int X2 = eVar.X(this.f2932q, constraintWidget);
                if (constraintWidget.V[1] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.f2931p++;
                    X2 = 0;
                }
                int i13 = eVar.W0;
                if (constraintWidget.f2827j0 != 8) {
                    i11 = i13;
                }
                this.f2928m = X2 + i11 + this.f2928m;
                if (this.f2918b == null || this.c < Y2) {
                    this.f2918b = constraintWidget;
                    this.c = Y2;
                    this.f2927l = Y2;
                }
            }
            this.f2930o++;
        }

        public final void b(int i10, boolean z10, boolean z11) {
            e eVar;
            boolean z12;
            int i11;
            int i12;
            int i13;
            ConstraintWidget constraintWidget;
            int i14;
            int i15;
            char c;
            int i16;
            float f10;
            float f11;
            int i17;
            float f12;
            float f13;
            int i18;
            int i19;
            int i20;
            int i21 = this.f2930o;
            int i22 = 0;
            while (true) {
                eVar = e.this;
                if (i22 >= i21 || (i20 = this.f2929n + i22) >= eVar.f2916h1) {
                    break;
                }
                ConstraintWidget constraintWidget2 = eVar.f2915g1[i20];
                if (constraintWidget2 != null) {
                    constraintWidget2.H();
                }
                i22++;
            }
            if (i21 != 0 && this.f2918b != null) {
                if (z11 && i10 == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                int i23 = -1;
                int i24 = -1;
                for (int i25 = 0; i25 < i21; i25++) {
                    if (z10) {
                        i19 = (i21 - 1) - i25;
                    } else {
                        i19 = i25;
                    }
                    int i26 = this.f2929n + i19;
                    if (i26 >= eVar.f2916h1) {
                        break;
                    }
                    ConstraintWidget constraintWidget3 = eVar.f2915g1[i26];
                    if (constraintWidget3 != null && constraintWidget3.f2827j0 == 0) {
                        if (i23 == -1) {
                            i23 = i25;
                        }
                        i24 = i25;
                    }
                }
                if (this.f2917a == 0) {
                    ConstraintWidget constraintWidget4 = this.f2918b;
                    constraintWidget4.f2837o0 = eVar.K0;
                    int i27 = this.f2924i;
                    if (i10 > 0) {
                        i27 += eVar.W0;
                    }
                    ConstraintAnchor constraintAnchor = this.f2920e;
                    ConstraintAnchor constraintAnchor2 = constraintWidget4.L;
                    constraintAnchor2.a(constraintAnchor, i27);
                    ConstraintAnchor constraintAnchor3 = constraintWidget4.N;
                    if (z11) {
                        constraintAnchor3.a(this.f2922g, this.f2926k);
                    }
                    if (i10 > 0) {
                        this.f2920e.f2801d.N.a(constraintAnchor2, 0);
                    }
                    if (eVar.Y0 == 3 && !constraintWidget4.F) {
                        for (int i28 = 0; i28 < i21; i28++) {
                            if (z10) {
                                i18 = (i21 - 1) - i28;
                            } else {
                                i18 = i28;
                            }
                            int i29 = this.f2929n + i18;
                            if (i29 >= eVar.f2916h1) {
                                break;
                            }
                            constraintWidget = eVar.f2915g1[i29];
                            if (constraintWidget.F) {
                                break;
                            }
                        }
                    }
                    constraintWidget = constraintWidget4;
                    int i30 = 0;
                    ConstraintWidget constraintWidget5 = null;
                    while (i30 < i21) {
                        if (z10) {
                            i14 = (i21 - 1) - i30;
                        } else {
                            i14 = i30;
                        }
                        int i31 = this.f2929n + i14;
                        if (i31 < eVar.f2916h1) {
                            ConstraintWidget constraintWidget6 = eVar.f2915g1[i31];
                            if (constraintWidget6 == null) {
                                i15 = i21;
                                c = 3;
                            } else {
                                ConstraintAnchor constraintAnchor4 = constraintWidget6.K;
                                if (i30 == 0) {
                                    constraintWidget6.i(constraintAnchor4, this.f2919d, this.f2923h);
                                }
                                if (i14 == 0) {
                                    int i32 = eVar.J0;
                                    if (z10) {
                                        i16 = i32;
                                        f10 = 1.0f - eVar.P0;
                                    } else {
                                        i16 = i32;
                                        f10 = eVar.P0;
                                    }
                                    if (this.f2929n == 0) {
                                        int i33 = eVar.L0;
                                        f11 = f10;
                                        if (i33 != -1) {
                                            if (z10) {
                                                f13 = 1.0f - eVar.R0;
                                            } else {
                                                f13 = eVar.R0;
                                            }
                                            f12 = f13;
                                            i17 = i33;
                                            constraintWidget6.f2835n0 = i17;
                                            constraintWidget6.f2821g0 = f12;
                                        }
                                    } else {
                                        f11 = f10;
                                    }
                                    if (z11 && (i17 = eVar.N0) != -1) {
                                        if (z10) {
                                            f12 = 1.0f - eVar.T0;
                                        } else {
                                            f12 = eVar.T0;
                                        }
                                    } else {
                                        i17 = i16;
                                        f12 = f11;
                                    }
                                    constraintWidget6.f2835n0 = i17;
                                    constraintWidget6.f2821g0 = f12;
                                }
                                if (i30 == i21 - 1) {
                                    i15 = i21;
                                    constraintWidget6.i(constraintWidget6.M, this.f2921f, this.f2925j);
                                } else {
                                    i15 = i21;
                                }
                                if (constraintWidget5 != null) {
                                    int i34 = eVar.V0;
                                    ConstraintAnchor constraintAnchor5 = constraintWidget5.M;
                                    constraintAnchor4.a(constraintAnchor5, i34);
                                    if (i30 == i23) {
                                        int i35 = this.f2923h;
                                        if (constraintAnchor4.h()) {
                                            constraintAnchor4.f2805h = i35;
                                        }
                                    }
                                    constraintAnchor5.a(constraintAnchor4, 0);
                                    if (i30 == i24 + 1) {
                                        int i36 = this.f2925j;
                                        if (constraintAnchor5.h()) {
                                            constraintAnchor5.f2805h = i36;
                                        }
                                    }
                                }
                                if (constraintWidget6 != constraintWidget4) {
                                    int i37 = eVar.Y0;
                                    c = 3;
                                    if (i37 == 3 && constraintWidget.F && constraintWidget6 != constraintWidget && constraintWidget6.F) {
                                        constraintWidget6.O.a(constraintWidget.O, 0);
                                    } else {
                                        ConstraintAnchor constraintAnchor6 = constraintWidget6.L;
                                        if (i37 != 0) {
                                            ConstraintAnchor constraintAnchor7 = constraintWidget6.N;
                                            if (i37 != 1) {
                                                if (z12) {
                                                    constraintAnchor6.a(this.f2920e, this.f2924i);
                                                    constraintAnchor7.a(this.f2922g, this.f2926k);
                                                } else {
                                                    constraintAnchor6.a(constraintAnchor2, 0);
                                                    constraintAnchor7.a(constraintAnchor3, 0);
                                                }
                                            } else {
                                                constraintAnchor7.a(constraintAnchor3, 0);
                                            }
                                        } else {
                                            constraintAnchor6.a(constraintAnchor2, 0);
                                        }
                                    }
                                } else {
                                    c = 3;
                                }
                                constraintWidget5 = constraintWidget6;
                            }
                            i30++;
                            i21 = i15;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                ConstraintWidget constraintWidget7 = this.f2918b;
                constraintWidget7.f2835n0 = eVar.J0;
                int i38 = this.f2923h;
                if (i10 > 0) {
                    i38 += eVar.V0;
                }
                ConstraintAnchor constraintAnchor8 = constraintWidget7.M;
                ConstraintAnchor constraintAnchor9 = constraintWidget7.K;
                if (z10) {
                    constraintAnchor8.a(this.f2921f, i38);
                    if (z11) {
                        constraintAnchor9.a(this.f2919d, this.f2925j);
                    }
                    if (i10 > 0) {
                        this.f2921f.f2801d.K.a(constraintAnchor8, 0);
                    }
                } else {
                    constraintAnchor9.a(this.f2919d, i38);
                    if (z11) {
                        constraintAnchor8.a(this.f2921f, this.f2925j);
                    }
                    if (i10 > 0) {
                        this.f2919d.f2801d.M.a(constraintAnchor9, 0);
                    }
                }
                int i39 = 0;
                ConstraintWidget constraintWidget8 = null;
                while (i39 < i21) {
                    int i40 = this.f2929n + i39;
                    if (i40 < eVar.f2916h1) {
                        ConstraintWidget constraintWidget9 = eVar.f2915g1[i40];
                        if (constraintWidget9 == null) {
                            constraintWidget9 = constraintWidget8;
                        } else {
                            ConstraintAnchor constraintAnchor10 = constraintWidget9.L;
                            if (i39 == 0) {
                                constraintWidget9.i(constraintAnchor10, this.f2920e, this.f2924i);
                                int i41 = eVar.K0;
                                float f14 = eVar.Q0;
                                if (this.f2929n == 0) {
                                    i13 = eVar.M0;
                                    i11 = i41;
                                    i12 = -1;
                                    if (i13 != -1) {
                                        f14 = eVar.S0;
                                        constraintWidget9.f2837o0 = i13;
                                        constraintWidget9.f2823h0 = f14;
                                    }
                                } else {
                                    i11 = i41;
                                    i12 = -1;
                                }
                                if (z11 && (i13 = eVar.O0) != i12) {
                                    f14 = eVar.U0;
                                } else {
                                    i13 = i11;
                                }
                                constraintWidget9.f2837o0 = i13;
                                constraintWidget9.f2823h0 = f14;
                            }
                            if (i39 == i21 - 1) {
                                constraintWidget9.i(constraintWidget9.N, this.f2922g, this.f2926k);
                            }
                            if (constraintWidget8 != null) {
                                int i42 = eVar.W0;
                                ConstraintAnchor constraintAnchor11 = constraintWidget8.N;
                                constraintAnchor10.a(constraintAnchor11, i42);
                                if (i39 == i23) {
                                    int i43 = this.f2924i;
                                    if (constraintAnchor10.h()) {
                                        constraintAnchor10.f2805h = i43;
                                    }
                                }
                                constraintAnchor11.a(constraintAnchor10, 0);
                                if (i39 == i24 + 1) {
                                    int i44 = this.f2926k;
                                    if (constraintAnchor11.h()) {
                                        constraintAnchor11.f2805h = i44;
                                    }
                                }
                            }
                            if (constraintWidget9 != constraintWidget7) {
                                ConstraintAnchor constraintAnchor12 = constraintWidget9.M;
                                ConstraintAnchor constraintAnchor13 = constraintWidget9.K;
                                if (z10) {
                                    int i45 = eVar.X0;
                                    if (i45 != 0) {
                                        if (i45 != 1) {
                                            if (i45 == 2) {
                                                constraintAnchor13.a(constraintAnchor9, 0);
                                                constraintAnchor12.a(constraintAnchor8, 0);
                                            }
                                        } else {
                                            constraintAnchor13.a(constraintAnchor9, 0);
                                        }
                                    } else {
                                        constraintAnchor12.a(constraintAnchor8, 0);
                                    }
                                    i39++;
                                    constraintWidget8 = constraintWidget9;
                                } else {
                                    int i46 = eVar.X0;
                                    if (i46 != 0) {
                                        if (i46 != 1) {
                                            if (i46 == 2) {
                                                if (z12) {
                                                    constraintAnchor13.a(this.f2919d, this.f2923h);
                                                    constraintAnchor12.a(this.f2921f, this.f2925j);
                                                } else {
                                                    constraintAnchor13.a(constraintAnchor9, 0);
                                                    constraintAnchor12.a(constraintAnchor8, 0);
                                                }
                                            }
                                        } else {
                                            constraintAnchor12.a(constraintAnchor8, 0);
                                        }
                                    } else {
                                        constraintAnchor13.a(constraintAnchor9, 0);
                                    }
                                    i39++;
                                    constraintWidget8 = constraintWidget9;
                                }
                            }
                        }
                        i39++;
                        constraintWidget8 = constraintWidget9;
                    } else {
                        return;
                    }
                }
            }
        }

        public final int c() {
            if (this.f2917a == 1) {
                return this.f2928m - e.this.W0;
            }
            return this.f2928m;
        }

        public final int d() {
            if (this.f2917a == 0) {
                return this.f2927l - e.this.V0;
            }
            return this.f2927l;
        }

        public final void e(int i10) {
            int i11 = this.f2931p;
            if (i11 == 0) {
                return;
            }
            int i12 = this.f2930o;
            int i13 = i10 / i11;
            for (int i14 = 0; i14 < i12; i14++) {
                int i15 = this.f2929n;
                int i16 = i15 + i14;
                e eVar = e.this;
                if (i16 >= eVar.f2916h1) {
                    break;
                }
                ConstraintWidget constraintWidget = eVar.f2915g1[i15 + i14];
                if (this.f2917a == 0) {
                    if (constraintWidget != null) {
                        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.V;
                        if (dimensionBehaviourArr[0] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f2844s == 0) {
                            eVar.W(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i13, dimensionBehaviourArr[1], constraintWidget.o());
                        }
                    }
                } else if (constraintWidget != null) {
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = constraintWidget.V;
                    if (dimensionBehaviourArr2[1] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && constraintWidget.f2846t == 0) {
                        eVar.W(constraintWidget, dimensionBehaviourArr2[0], constraintWidget.u(), ConstraintWidget.DimensionBehaviour.FIXED, i13);
                    }
                }
            }
            this.f2927l = 0;
            this.f2928m = 0;
            this.f2918b = null;
            this.c = 0;
            int i17 = this.f2930o;
            for (int i18 = 0; i18 < i17; i18++) {
                int i19 = this.f2929n + i18;
                e eVar2 = e.this;
                if (i19 < eVar2.f2916h1) {
                    ConstraintWidget constraintWidget2 = eVar2.f2915g1[i19];
                    if (this.f2917a == 0) {
                        int u7 = constraintWidget2.u();
                        int i20 = eVar2.V0;
                        if (constraintWidget2.f2827j0 == 8) {
                            i20 = 0;
                        }
                        this.f2927l = u7 + i20 + this.f2927l;
                        int X = eVar2.X(this.f2932q, constraintWidget2);
                        if (this.f2918b == null || this.c < X) {
                            this.f2918b = constraintWidget2;
                            this.c = X;
                            this.f2928m = X;
                        }
                    } else {
                        int Y = eVar2.Y(this.f2932q, constraintWidget2);
                        int X2 = eVar2.X(this.f2932q, constraintWidget2);
                        int i21 = eVar2.W0;
                        if (constraintWidget2.f2827j0 == 8) {
                            i21 = 0;
                        }
                        this.f2928m = X2 + i21 + this.f2928m;
                        if (this.f2918b == null || this.c < Y) {
                            this.f2918b = constraintWidget2;
                            this.c = Y;
                            this.f2927l = Y;
                        }
                    }
                } else {
                    return;
                }
            }
        }

        public final void f(int i10, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, ConstraintAnchor constraintAnchor3, ConstraintAnchor constraintAnchor4, int i11, int i12, int i13, int i14, int i15) {
            this.f2917a = i10;
            this.f2919d = constraintAnchor;
            this.f2920e = constraintAnchor2;
            this.f2921f = constraintAnchor3;
            this.f2922g = constraintAnchor4;
            this.f2923h = i11;
            this.f2924i = i12;
            this.f2925j = i13;
            this.f2926k = i14;
            this.f2932q = i15;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0825  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0827  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0836  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0838  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0853  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0855  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:293:0x0517 -> B:294:0x0525). Please submit an issue!!! */
    @Override // androidx.constraintlayout.core.widgets.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void V(int r38, int r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 2138
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.e.V(int, int, int, int):void");
    }

    public final int X(int i10, ConstraintWidget constraintWidget) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.V[1] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i11 = constraintWidget.f2846t;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (constraintWidget.A * i10);
                if (i12 != constraintWidget.o()) {
                    constraintWidget.f2820g = true;
                    W(constraintWidget, constraintWidget.V[0], constraintWidget.u(), ConstraintWidget.DimensionBehaviour.FIXED, i12);
                }
                return i12;
            } else if (i11 == 1) {
                return constraintWidget.o();
            } else {
                if (i11 == 3) {
                    return (int) ((constraintWidget.u() * constraintWidget.Z) + 0.5f);
                }
            }
        }
        return constraintWidget.o();
    }

    public final int Y(int i10, ConstraintWidget constraintWidget) {
        if (constraintWidget == null) {
            return 0;
        }
        if (constraintWidget.V[0] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            int i11 = constraintWidget.f2844s;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (constraintWidget.f2853x * i10);
                if (i12 != constraintWidget.u()) {
                    constraintWidget.f2820g = true;
                    W(constraintWidget, ConstraintWidget.DimensionBehaviour.FIXED, i12, constraintWidget.V[1], constraintWidget.o());
                }
                return i12;
            } else if (i11 == 1) {
                return constraintWidget.u();
            } else {
                if (i11 == 3) {
                    return (int) ((constraintWidget.o() * constraintWidget.Z) + 0.5f);
                }
            }
        }
        return constraintWidget.u();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void e(androidx.constraintlayout.core.c cVar, boolean z10) {
        boolean z11;
        boolean z12;
        ConstraintWidget constraintWidget;
        float f10;
        int i10;
        boolean z13;
        super.e(cVar, z10);
        ConstraintWidget constraintWidget2 = this.W;
        if (constraintWidget2 != null && ((d) constraintWidget2).B0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i11 = this.Z0;
        ArrayList<a> arrayList = this.f2911c1;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        int size = arrayList.size();
                        for (int i12 = 0; i12 < size; i12++) {
                            a aVar = arrayList.get(i12);
                            if (i12 == size - 1) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            aVar.b(i12, z11, z13);
                        }
                    }
                } else if (this.f2914f1 != null && this.f2913e1 != null && this.f2912d1 != null) {
                    for (int i13 = 0; i13 < this.f2916h1; i13++) {
                        this.f2915g1[i13].H();
                    }
                    int[] iArr = this.f2914f1;
                    int i14 = iArr[0];
                    int i15 = iArr[1];
                    float f11 = this.P0;
                    ConstraintWidget constraintWidget3 = null;
                    int i16 = 0;
                    while (i16 < i14) {
                        if (z11) {
                            i10 = (i14 - i16) - 1;
                            f10 = 1.0f - this.P0;
                        } else {
                            f10 = f11;
                            i10 = i16;
                        }
                        ConstraintWidget constraintWidget4 = this.f2913e1[i10];
                        if (constraintWidget4 != null && constraintWidget4.f2827j0 != 8) {
                            ConstraintAnchor constraintAnchor = constraintWidget4.K;
                            if (i16 == 0) {
                                constraintWidget4.i(constraintAnchor, this.K, this.C0);
                                constraintWidget4.f2835n0 = this.J0;
                                constraintWidget4.f2821g0 = f10;
                            }
                            if (i16 == i14 - 1) {
                                constraintWidget4.i(constraintWidget4.M, this.M, this.D0);
                            }
                            if (i16 > 0 && constraintWidget3 != null) {
                                int i17 = this.V0;
                                ConstraintAnchor constraintAnchor2 = constraintWidget3.M;
                                constraintWidget4.i(constraintAnchor, constraintAnchor2, i17);
                                constraintWidget3.i(constraintAnchor2, constraintAnchor, 0);
                            }
                            constraintWidget3 = constraintWidget4;
                        }
                        i16++;
                        f11 = f10;
                    }
                    for (int i18 = 0; i18 < i15; i18++) {
                        ConstraintWidget constraintWidget5 = this.f2912d1[i18];
                        if (constraintWidget5 != null && constraintWidget5.f2827j0 != 8) {
                            ConstraintAnchor constraintAnchor3 = constraintWidget5.L;
                            if (i18 == 0) {
                                constraintWidget5.i(constraintAnchor3, this.L, this.f2940y0);
                                constraintWidget5.f2837o0 = this.K0;
                                constraintWidget5.f2823h0 = this.Q0;
                            }
                            if (i18 == i15 - 1) {
                                constraintWidget5.i(constraintWidget5.N, this.N, this.f2941z0);
                            }
                            if (i18 > 0 && constraintWidget3 != null) {
                                int i19 = this.W0;
                                ConstraintAnchor constraintAnchor4 = constraintWidget3.N;
                                constraintWidget5.i(constraintAnchor3, constraintAnchor4, i19);
                                constraintWidget3.i(constraintAnchor4, constraintAnchor3, 0);
                            }
                            constraintWidget3 = constraintWidget5;
                        }
                    }
                    for (int i20 = 0; i20 < i14; i20++) {
                        for (int i21 = 0; i21 < i15; i21++) {
                            int i22 = (i21 * i14) + i20;
                            if (this.f2910b1 == 1) {
                                i22 = (i20 * i15) + i21;
                            }
                            ConstraintWidget[] constraintWidgetArr = this.f2915g1;
                            if (i22 < constraintWidgetArr.length && (constraintWidget = constraintWidgetArr[i22]) != null && constraintWidget.f2827j0 != 8) {
                                ConstraintWidget constraintWidget6 = this.f2913e1[i20];
                                ConstraintWidget constraintWidget7 = this.f2912d1[i21];
                                if (constraintWidget != constraintWidget6) {
                                    constraintWidget.i(constraintWidget.K, constraintWidget6.K, 0);
                                    constraintWidget.i(constraintWidget.M, constraintWidget6.M, 0);
                                }
                                if (constraintWidget != constraintWidget7) {
                                    constraintWidget.i(constraintWidget.L, constraintWidget7.L, 0);
                                    constraintWidget.i(constraintWidget.N, constraintWidget7.N, 0);
                                }
                            }
                        }
                    }
                }
            } else {
                int size2 = arrayList.size();
                for (int i23 = 0; i23 < size2; i23++) {
                    a aVar2 = arrayList.get(i23);
                    if (i23 == size2 - 1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    aVar2.b(i23, z11, z12);
                }
            }
        } else if (arrayList.size() > 0) {
            arrayList.get(0).b(0, z11, true);
        }
        this.E0 = false;
    }

    @Override // c0.b, androidx.constraintlayout.core.widgets.ConstraintWidget
    public final void j(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.j(constraintWidget, hashMap);
        e eVar = (e) constraintWidget;
        this.J0 = eVar.J0;
        this.K0 = eVar.K0;
        this.L0 = eVar.L0;
        this.M0 = eVar.M0;
        this.N0 = eVar.N0;
        this.O0 = eVar.O0;
        this.P0 = eVar.P0;
        this.Q0 = eVar.Q0;
        this.R0 = eVar.R0;
        this.S0 = eVar.S0;
        this.T0 = eVar.T0;
        this.U0 = eVar.U0;
        this.V0 = eVar.V0;
        this.W0 = eVar.W0;
        this.X0 = eVar.X0;
        this.Y0 = eVar.Y0;
        this.Z0 = eVar.Z0;
        this.f2909a1 = eVar.f2909a1;
        this.f2910b1 = eVar.f2910b1;
    }
}
