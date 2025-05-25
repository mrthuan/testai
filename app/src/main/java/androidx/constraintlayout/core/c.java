package androidx.constraintlayout.core;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import java.util.Arrays;

/* compiled from: LinearSystem.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: p  reason: collision with root package name */
    public static boolean f2777p = false;

    /* renamed from: q  reason: collision with root package name */
    public static int f2778q = 1000;
    public final d c;

    /* renamed from: f  reason: collision with root package name */
    public b[] f2783f;

    /* renamed from: l  reason: collision with root package name */
    public final a0.b f2789l;

    /* renamed from: o  reason: collision with root package name */
    public b f2792o;

    /* renamed from: a  reason: collision with root package name */
    public boolean f2779a = false;

    /* renamed from: b  reason: collision with root package name */
    public int f2780b = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f2781d = 32;

    /* renamed from: e  reason: collision with root package name */
    public int f2782e = 32;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2784g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean[] f2785h = new boolean[32];

    /* renamed from: i  reason: collision with root package name */
    public int f2786i = 1;

    /* renamed from: j  reason: collision with root package name */
    public int f2787j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f2788k = 32;

    /* renamed from: m  reason: collision with root package name */
    public SolverVariable[] f2790m = new SolverVariable[f2778q];

    /* renamed from: n  reason: collision with root package name */
    public int f2791n = 0;

    /* compiled from: LinearSystem.java */
    /* loaded from: classes.dex */
    public interface a {
        SolverVariable a(boolean[] zArr);
    }

    public c() {
        this.f2783f = null;
        this.f2783f = new b[32];
        s();
        a0.b bVar = new a0.b();
        this.f2789l = bVar;
        this.c = new d(bVar);
        this.f2792o = new b(bVar);
    }

    public static int n(ConstraintAnchor constraintAnchor) {
        SolverVariable solverVariable = constraintAnchor.f2806i;
        if (solverVariable != null) {
            return (int) (solverVariable.f2755e + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final SolverVariable a(SolverVariable.Type type) {
        a0.c cVar = (a0.c) this.f2789l.c;
        int i10 = cVar.f15b;
        SolverVariable solverVariable = null;
        if (i10 > 0) {
            int i11 = i10 - 1;
            ?? r32 = cVar.f14a;
            ?? r4 = r32[i11];
            r32[i11] = 0;
            cVar.f15b = i11;
            solverVariable = r4;
        }
        SolverVariable solverVariable2 = solverVariable;
        if (solverVariable2 == null) {
            solverVariable2 = new SolverVariable(type);
            solverVariable2.f2759i = type;
        } else {
            solverVariable2.c();
            solverVariable2.f2759i = type;
        }
        int i12 = this.f2791n;
        int i13 = f2778q;
        if (i12 >= i13) {
            int i14 = i13 * 2;
            f2778q = i14;
            this.f2790m = (SolverVariable[]) Arrays.copyOf(this.f2790m, i14);
        }
        SolverVariable[] solverVariableArr = this.f2790m;
        int i15 = this.f2791n;
        this.f2791n = i15 + 1;
        solverVariableArr[i15] = solverVariable2;
        return solverVariable2;
    }

    public final void b(SolverVariable solverVariable, SolverVariable solverVariable2, int i10, float f10, SolverVariable solverVariable3, SolverVariable solverVariable4, int i11, int i12) {
        b l10 = l();
        if (solverVariable2 == solverVariable3) {
            l10.f2775d.d(solverVariable, 1.0f);
            l10.f2775d.d(solverVariable4, 1.0f);
            l10.f2775d.d(solverVariable2, -2.0f);
        } else if (f10 == 0.5f) {
            l10.f2775d.d(solverVariable, 1.0f);
            l10.f2775d.d(solverVariable2, -1.0f);
            l10.f2775d.d(solverVariable3, -1.0f);
            l10.f2775d.d(solverVariable4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                l10.f2774b = (-i10) + i11;
            }
        } else if (f10 <= 0.0f) {
            l10.f2775d.d(solverVariable, -1.0f);
            l10.f2775d.d(solverVariable2, 1.0f);
            l10.f2774b = i10;
        } else if (f10 >= 1.0f) {
            l10.f2775d.d(solverVariable4, -1.0f);
            l10.f2775d.d(solverVariable3, 1.0f);
            l10.f2774b = -i11;
        } else {
            float f11 = 1.0f - f10;
            l10.f2775d.d(solverVariable, f11 * 1.0f);
            l10.f2775d.d(solverVariable2, f11 * (-1.0f));
            l10.f2775d.d(solverVariable3, (-1.0f) * f10);
            l10.f2775d.d(solverVariable4, 1.0f * f10);
            if (i10 > 0 || i11 > 0) {
                l10.f2774b = (i11 * f10) + ((-i10) * f11);
            }
        }
        if (i12 != 8) {
            l10.b(this, i12);
        }
        c(l10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ba, code lost:
        if (r4.f2762l <= 1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c3, code lost:
        if (r4.f2762l <= 1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c6, code lost:
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00e1, code lost:
        if (r4.f2762l <= 1) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00ea, code lost:
        if (r4.f2762l <= 1) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00ed, code lost:
        r14 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(androidx.constraintlayout.core.b r17) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.c.c(androidx.constraintlayout.core.b):void");
    }

    public final void d(SolverVariable solverVariable, int i10) {
        int i11 = solverVariable.c;
        if (i11 == -1) {
            solverVariable.d(this, i10);
            for (int i12 = 0; i12 < this.f2780b + 1; i12++) {
                SolverVariable solverVariable2 = ((SolverVariable[]) this.f2789l.f13d)[i12];
            }
        } else if (i11 != -1) {
            b bVar = this.f2783f[i11];
            if (bVar.f2776e) {
                bVar.f2774b = i10;
            } else if (bVar.f2775d.a() == 0) {
                bVar.f2776e = true;
                bVar.f2774b = i10;
            } else {
                b l10 = l();
                if (i10 < 0) {
                    l10.f2774b = i10 * (-1);
                    l10.f2775d.d(solverVariable, 1.0f);
                } else {
                    l10.f2774b = i10;
                    l10.f2775d.d(solverVariable, -1.0f);
                }
                c(l10);
            }
        } else {
            b l11 = l();
            l11.f2773a = solverVariable;
            float f10 = i10;
            solverVariable.f2755e = f10;
            l11.f2774b = f10;
            l11.f2776e = true;
            c(l11);
        }
    }

    public final void e(SolverVariable solverVariable, SolverVariable solverVariable2, int i10, int i11) {
        if (i11 == 8 && solverVariable2.f2756f && solverVariable.c == -1) {
            solverVariable.d(this, solverVariable2.f2755e + i10);
            return;
        }
        b l10 = l();
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            l10.f2774b = i10;
        }
        if (!z10) {
            l10.f2775d.d(solverVariable, -1.0f);
            l10.f2775d.d(solverVariable2, 1.0f);
        } else {
            l10.f2775d.d(solverVariable, 1.0f);
            l10.f2775d.d(solverVariable2, -1.0f);
        }
        if (i11 != 8) {
            l10.b(this, i11);
        }
        c(l10);
    }

    public final void f(SolverVariable solverVariable, SolverVariable solverVariable2, int i10, int i11) {
        b l10 = l();
        SolverVariable m10 = m();
        m10.f2754d = 0;
        l10.c(solverVariable, solverVariable2, m10, i10);
        if (i11 != 8) {
            l10.f2775d.d(j(i11), (int) (l10.f2775d.j(m10) * (-1.0f)));
        }
        c(l10);
    }

    public final void g(SolverVariable solverVariable, SolverVariable solverVariable2, int i10, int i11) {
        b l10 = l();
        SolverVariable m10 = m();
        m10.f2754d = 0;
        l10.d(solverVariable, solverVariable2, m10, i10);
        if (i11 != 8) {
            l10.f2775d.d(j(i11), (int) (l10.f2775d.j(m10) * (-1.0f)));
        }
        c(l10);
    }

    public final void h(b bVar) {
        int i10;
        if (bVar.f2776e) {
            bVar.f2773a.d(this, bVar.f2774b);
        } else {
            b[] bVarArr = this.f2783f;
            int i11 = this.f2787j;
            bVarArr[i11] = bVar;
            SolverVariable solverVariable = bVar.f2773a;
            solverVariable.c = i11;
            this.f2787j = i11 + 1;
            solverVariable.e(this, bVar);
        }
        if (this.f2779a) {
            int i12 = 0;
            while (i12 < this.f2787j) {
                if (this.f2783f[i12] == null) {
                    System.out.println("WTF");
                }
                b bVar2 = this.f2783f[i12];
                if (bVar2 != null && bVar2.f2776e) {
                    bVar2.f2773a.d(this, bVar2.f2774b);
                    a0.c cVar = (a0.c) this.f2789l.f12b;
                    int i13 = cVar.f15b;
                    Object[] objArr = cVar.f14a;
                    if (i13 < objArr.length) {
                        objArr[i13] = bVar2;
                        cVar.f15b = i13 + 1;
                    }
                    this.f2783f[i12] = null;
                    int i14 = i12 + 1;
                    int i15 = i14;
                    while (true) {
                        i10 = this.f2787j;
                        if (i14 >= i10) {
                            break;
                        }
                        b[] bVarArr2 = this.f2783f;
                        int i16 = i14 - 1;
                        b bVar3 = bVarArr2[i14];
                        bVarArr2[i16] = bVar3;
                        SolverVariable solverVariable2 = bVar3.f2773a;
                        if (solverVariable2.c == i14) {
                            solverVariable2.c = i16;
                        }
                        i15 = i14;
                        i14++;
                    }
                    if (i15 < i10) {
                        this.f2783f[i15] = null;
                    }
                    this.f2787j = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.f2779a = false;
        }
    }

    public final void i() {
        for (int i10 = 0; i10 < this.f2787j; i10++) {
            b bVar = this.f2783f[i10];
            bVar.f2773a.f2755e = bVar.f2774b;
        }
    }

    public final SolverVariable j(int i10) {
        if (this.f2786i + 1 >= this.f2782e) {
            o();
        }
        SolverVariable a10 = a(SolverVariable.Type.ERROR);
        int i11 = this.f2780b + 1;
        this.f2780b = i11;
        this.f2786i++;
        a10.f2753b = i11;
        a10.f2754d = i10;
        ((SolverVariable[]) this.f2789l.f13d)[i11] = a10;
        d dVar = this.c;
        dVar.f2796i.f2797a = a10;
        float[] fArr = a10.f2758h;
        Arrays.fill(fArr, 0.0f);
        fArr[a10.f2754d] = 1.0f;
        dVar.j(a10);
        return a10;
    }

    public final SolverVariable k(Object obj) {
        SolverVariable solverVariable = null;
        if (obj == null) {
            return null;
        }
        if (this.f2786i + 1 >= this.f2782e) {
            o();
        }
        if (obj instanceof ConstraintAnchor) {
            ConstraintAnchor constraintAnchor = (ConstraintAnchor) obj;
            solverVariable = constraintAnchor.f2806i;
            if (solverVariable == null) {
                constraintAnchor.k();
                solverVariable = constraintAnchor.f2806i;
            }
            int i10 = solverVariable.f2753b;
            a0.b bVar = this.f2789l;
            if (i10 == -1 || i10 > this.f2780b || ((SolverVariable[]) bVar.f13d)[i10] == null) {
                if (i10 != -1) {
                    solverVariable.c();
                }
                int i11 = this.f2780b + 1;
                this.f2780b = i11;
                this.f2786i++;
                solverVariable.f2753b = i11;
                solverVariable.f2759i = SolverVariable.Type.UNRESTRICTED;
                ((SolverVariable[]) bVar.f13d)[i11] = solverVariable;
            }
        }
        return solverVariable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v4 */
    public final b l() {
        b bVar;
        a0.b bVar2 = this.f2789l;
        a0.c cVar = (a0.c) bVar2.f12b;
        int i10 = cVar.f15b;
        if (i10 > 0) {
            int i11 = i10 - 1;
            ?? r4 = cVar.f14a;
            ?? r52 = r4[i11];
            r4[i11] = 0;
            cVar.f15b = i11;
            bVar = r52;
        } else {
            bVar = null;
        }
        b bVar3 = bVar;
        if (bVar3 == null) {
            return new b(bVar2);
        }
        bVar3.f2773a = null;
        bVar3.f2775d.clear();
        bVar3.f2774b = 0.0f;
        bVar3.f2776e = false;
        return bVar3;
    }

    public final SolverVariable m() {
        if (this.f2786i + 1 >= this.f2782e) {
            o();
        }
        SolverVariable a10 = a(SolverVariable.Type.SLACK);
        int i10 = this.f2780b + 1;
        this.f2780b = i10;
        this.f2786i++;
        a10.f2753b = i10;
        ((SolverVariable[]) this.f2789l.f13d)[i10] = a10;
        return a10;
    }

    public final void o() {
        int i10 = this.f2781d * 2;
        this.f2781d = i10;
        this.f2783f = (b[]) Arrays.copyOf(this.f2783f, i10);
        a0.b bVar = this.f2789l;
        bVar.f13d = (SolverVariable[]) Arrays.copyOf((SolverVariable[]) bVar.f13d, this.f2781d);
        int i11 = this.f2781d;
        this.f2785h = new boolean[i11];
        this.f2782e = i11;
        this.f2788k = i11;
    }

    public final void p() {
        d dVar = this.c;
        if (dVar.e()) {
            i();
        } else if (this.f2784g) {
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 < this.f2787j) {
                    if (!this.f2783f[i10].f2776e) {
                        break;
                    }
                    i10++;
                } else {
                    z10 = true;
                    break;
                }
            }
            if (!z10) {
                q(dVar);
            } else {
                i();
            }
        } else {
            q(dVar);
        }
    }

    public final void q(d dVar) {
        float f10;
        int i10;
        boolean z10;
        int i11 = 0;
        while (true) {
            f10 = 0.0f;
            i10 = 1;
            if (i11 < this.f2787j) {
                b bVar = this.f2783f[i11];
                if (bVar.f2773a.f2759i != SolverVariable.Type.UNRESTRICTED && bVar.f2774b < 0.0f) {
                    z10 = true;
                    break;
                }
                i11++;
            } else {
                z10 = false;
                break;
            }
        }
        if (z10) {
            boolean z11 = false;
            int i12 = 0;
            while (!z11) {
                i12 += i10;
                float f11 = Float.MAX_VALUE;
                int i13 = -1;
                int i14 = -1;
                int i15 = 0;
                int i16 = 0;
                while (i15 < this.f2787j) {
                    b bVar2 = this.f2783f[i15];
                    if (bVar2.f2773a.f2759i != SolverVariable.Type.UNRESTRICTED && !bVar2.f2776e && bVar2.f2774b < f10) {
                        int a10 = bVar2.f2775d.a();
                        int i17 = 0;
                        while (i17 < a10) {
                            SolverVariable e10 = bVar2.f2775d.e(i17);
                            float j10 = bVar2.f2775d.j(e10);
                            if (j10 > f10) {
                                for (int i18 = 0; i18 < 9; i18++) {
                                    float f12 = e10.f2757g[i18] / j10;
                                    if ((f12 < f11 && i18 == i16) || i18 > i16) {
                                        i14 = e10.f2753b;
                                        i16 = i18;
                                        f11 = f12;
                                        i13 = i15;
                                    }
                                }
                            }
                            i17++;
                            f10 = 0.0f;
                        }
                    }
                    i15++;
                    f10 = 0.0f;
                }
                if (i13 != -1) {
                    b bVar3 = this.f2783f[i13];
                    bVar3.f2773a.c = -1;
                    bVar3.g(((SolverVariable[]) this.f2789l.f13d)[i14]);
                    SolverVariable solverVariable = bVar3.f2773a;
                    solverVariable.c = i13;
                    solverVariable.e(this, bVar3);
                } else {
                    z11 = true;
                }
                if (i12 > this.f2786i / 2) {
                    z11 = true;
                }
                f10 = 0.0f;
                i10 = 1;
            }
        }
        r(dVar);
        i();
    }

    public final void r(b bVar) {
        for (int i10 = 0; i10 < this.f2786i; i10++) {
            this.f2785h[i10] = false;
        }
        boolean z10 = false;
        int i11 = 0;
        while (!z10) {
            i11++;
            if (i11 >= this.f2786i * 2) {
                return;
            }
            SolverVariable solverVariable = bVar.f2773a;
            if (solverVariable != null) {
                this.f2785h[solverVariable.f2753b] = true;
            }
            SolverVariable a10 = bVar.a(this.f2785h);
            if (a10 != null) {
                boolean[] zArr = this.f2785h;
                int i12 = a10.f2753b;
                if (zArr[i12]) {
                    return;
                }
                zArr[i12] = true;
            }
            if (a10 != null) {
                float f10 = Float.MAX_VALUE;
                int i13 = -1;
                for (int i14 = 0; i14 < this.f2787j; i14++) {
                    b bVar2 = this.f2783f[i14];
                    if (bVar2.f2773a.f2759i != SolverVariable.Type.UNRESTRICTED && !bVar2.f2776e && bVar2.f2775d.b(a10)) {
                        float j10 = bVar2.f2775d.j(a10);
                        if (j10 < 0.0f) {
                            float f11 = (-bVar2.f2774b) / j10;
                            if (f11 < f10) {
                                i13 = i14;
                                f10 = f11;
                            }
                        }
                    }
                }
                if (i13 > -1) {
                    b bVar3 = this.f2783f[i13];
                    bVar3.f2773a.c = -1;
                    bVar3.g(a10);
                    SolverVariable solverVariable2 = bVar3.f2773a;
                    solverVariable2.c = i13;
                    solverVariable2.e(this, bVar3);
                }
            } else {
                z10 = true;
            }
        }
    }

    public final void s() {
        for (int i10 = 0; i10 < this.f2787j; i10++) {
            b[] bVarArr = this.f2783f;
            b bVar = bVarArr[i10];
            if (bVar != null) {
                a0.c cVar = (a0.c) this.f2789l.f12b;
                int i11 = cVar.f15b;
                Object[] objArr = cVar.f14a;
                if (i11 < objArr.length) {
                    objArr[i11] = bVar;
                    cVar.f15b = i11 + 1;
                }
            }
            bVarArr[i10] = null;
        }
    }

    public final void t() {
        a0.b bVar;
        int i10 = 0;
        while (true) {
            bVar = this.f2789l;
            SolverVariable[] solverVariableArr = (SolverVariable[]) bVar.f13d;
            if (i10 >= solverVariableArr.length) {
                break;
            }
            SolverVariable solverVariable = solverVariableArr[i10];
            if (solverVariable != null) {
                solverVariable.c();
            }
            i10++;
        }
        a0.c cVar = (a0.c) bVar.c;
        SolverVariable[] solverVariableArr2 = this.f2790m;
        int i11 = this.f2791n;
        cVar.getClass();
        if (i11 > solverVariableArr2.length) {
            i11 = solverVariableArr2.length;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            SolverVariable solverVariable2 = solverVariableArr2[i12];
            int i13 = cVar.f15b;
            Object[] objArr = cVar.f14a;
            if (i13 < objArr.length) {
                objArr[i13] = solverVariable2;
                cVar.f15b = i13 + 1;
            }
        }
        this.f2791n = 0;
        Arrays.fill((SolverVariable[]) bVar.f13d, (Object) null);
        this.f2780b = 0;
        d dVar = this.c;
        dVar.f2795h = 0;
        dVar.f2774b = 0.0f;
        this.f2786i = 1;
        for (int i14 = 0; i14 < this.f2787j; i14++) {
            b bVar2 = this.f2783f[i14];
        }
        s();
        this.f2787j = 0;
        this.f2792o = new b(bVar);
    }
}
