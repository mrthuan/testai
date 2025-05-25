package androidx.constraintlayout.core;

import androidx.constraintlayout.core.SolverVariable;
import androidx.constraintlayout.core.c;
import java.util.ArrayList;

/* compiled from: ArrayRow.java */
/* loaded from: classes.dex */
public class b implements c.a {

    /* renamed from: d  reason: collision with root package name */
    public a f2775d;

    /* renamed from: a  reason: collision with root package name */
    public SolverVariable f2773a = null;

    /* renamed from: b  reason: collision with root package name */
    public float f2774b = 0.0f;
    public final ArrayList<SolverVariable> c = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    public boolean f2776e = false;

    /* compiled from: ArrayRow.java */
    /* loaded from: classes.dex */
    public interface a {
        int a();

        boolean b(SolverVariable solverVariable);

        float c(b bVar, boolean z10);

        void clear();

        void d(SolverVariable solverVariable, float f10);

        SolverVariable e(int i10);

        void f(SolverVariable solverVariable, float f10, boolean z10);

        void g();

        float h(int i10);

        float i(SolverVariable solverVariable, boolean z10);

        float j(SolverVariable solverVariable);

        void k(float f10);
    }

    public b() {
    }

    @Override // androidx.constraintlayout.core.c.a
    public SolverVariable a(boolean[] zArr) {
        return f(zArr, null);
    }

    public final void b(c cVar, int i10) {
        this.f2775d.d(cVar.j(i10), 1.0f);
        this.f2775d.d(cVar.j(i10), -1.0f);
    }

    public final void c(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f2774b = i10;
        }
        if (!z10) {
            this.f2775d.d(solverVariable, -1.0f);
            this.f2775d.d(solverVariable2, 1.0f);
            this.f2775d.d(solverVariable3, 1.0f);
            return;
        }
        this.f2775d.d(solverVariable, 1.0f);
        this.f2775d.d(solverVariable2, -1.0f);
        this.f2775d.d(solverVariable3, -1.0f);
    }

    public final void d(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f2774b = i10;
        }
        if (!z10) {
            this.f2775d.d(solverVariable, -1.0f);
            this.f2775d.d(solverVariable2, 1.0f);
            this.f2775d.d(solverVariable3, -1.0f);
            return;
        }
        this.f2775d.d(solverVariable, 1.0f);
        this.f2775d.d(solverVariable2, -1.0f);
        this.f2775d.d(solverVariable3, 1.0f);
    }

    public boolean e() {
        if (this.f2773a == null && this.f2774b == 0.0f && this.f2775d.a() == 0) {
            return true;
        }
        return false;
    }

    public final SolverVariable f(boolean[] zArr, SolverVariable solverVariable) {
        SolverVariable.Type type;
        int a10 = this.f2775d.a();
        SolverVariable solverVariable2 = null;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < a10; i10++) {
            float h10 = this.f2775d.h(i10);
            if (h10 < 0.0f) {
                SolverVariable e10 = this.f2775d.e(i10);
                if ((zArr == null || !zArr[e10.f2753b]) && e10 != solverVariable && (((type = e10.f2759i) == SolverVariable.Type.SLACK || type == SolverVariable.Type.ERROR) && h10 < f10)) {
                    f10 = h10;
                    solverVariable2 = e10;
                }
            }
        }
        return solverVariable2;
    }

    public final void g(SolverVariable solverVariable) {
        SolverVariable solverVariable2 = this.f2773a;
        if (solverVariable2 != null) {
            this.f2775d.d(solverVariable2, -1.0f);
            this.f2773a.c = -1;
            this.f2773a = null;
        }
        float i10 = this.f2775d.i(solverVariable, true) * (-1.0f);
        this.f2773a = solverVariable;
        if (i10 == 1.0f) {
            return;
        }
        this.f2774b /= i10;
        this.f2775d.k(i10);
    }

    public final void h(c cVar, SolverVariable solverVariable, boolean z10) {
        if (solverVariable != null && solverVariable.f2756f) {
            float j10 = this.f2775d.j(solverVariable);
            this.f2774b = (solverVariable.f2755e * j10) + this.f2774b;
            this.f2775d.i(solverVariable, z10);
            if (z10) {
                solverVariable.b(this);
            }
            if (this.f2775d.a() == 0) {
                this.f2776e = true;
                cVar.f2779a = true;
            }
        }
    }

    public void i(c cVar, b bVar, boolean z10) {
        float c = this.f2775d.c(bVar, z10);
        this.f2774b = (bVar.f2774b * c) + this.f2774b;
        if (z10) {
            bVar.f2773a.b(this);
        }
        if (this.f2773a != null && this.f2775d.a() == 0) {
            this.f2776e = true;
            cVar.f2779a = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r9 = this;
            androidx.constraintlayout.core.SolverVariable r0 = r9.f2773a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            androidx.constraintlayout.core.SolverVariable r1 = r9.f2773a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = a6.h.c(r0, r1)
            float r1 = r9.f2774b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L35
            java.lang.StringBuilder r0 = a0.a.k(r0)
            float r1 = r9.f2774b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r3
            goto L36
        L35:
            r1 = r4
        L36:
            androidx.constraintlayout.core.b$a r5 = r9.f2775d
            int r5 = r5.a()
        L3c:
            if (r4 >= r5) goto L9b
            androidx.constraintlayout.core.b$a r6 = r9.f2775d
            androidx.constraintlayout.core.SolverVariable r6 = r6.e(r4)
            if (r6 != 0) goto L47
            goto L98
        L47:
            androidx.constraintlayout.core.b$a r7 = r9.f2775d
            float r7 = r7.h(r4)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L52
            goto L98
        L52:
            java.lang.String r6 = r6.toString()
            if (r1 != 0) goto L63
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L75
            java.lang.String r1 = "- "
            java.lang.String r0 = a6.h.c(r0, r1)
            goto L72
        L63:
            if (r8 <= 0) goto L6c
            java.lang.String r1 = " + "
            java.lang.String r0 = a6.h.c(r0, r1)
            goto L75
        L6c:
            java.lang.String r1 = " - "
            java.lang.String r0 = a6.h.c(r0, r1)
        L72:
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r7 = r7 * r1
        L75:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L80
            java.lang.String r0 = a6.h.c(r0, r6)
            goto L97
        L80:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L97:
            r1 = r3
        L98:
            int r4 = r4 + 1
            goto L3c
        L9b:
            if (r1 != 0) goto La3
            java.lang.String r1 = "0.0"
            java.lang.String r0 = a6.h.c(r0, r1)
        La3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.b.toString():java.lang.String");
    }

    public b(a0.b bVar) {
        this.f2775d = new androidx.constraintlayout.core.a(this, bVar);
    }
}
