package androidx.constraintlayout.core;

import androidx.constraintlayout.core.b;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: PriorityGoalRow.java */
/* loaded from: classes.dex */
public final class d extends androidx.constraintlayout.core.b {

    /* renamed from: f  reason: collision with root package name */
    public SolverVariable[] f2793f;

    /* renamed from: g  reason: collision with root package name */
    public SolverVariable[] f2794g;

    /* renamed from: h  reason: collision with root package name */
    public int f2795h;

    /* renamed from: i  reason: collision with root package name */
    public final b f2796i;

    /* compiled from: PriorityGoalRow.java */
    /* loaded from: classes.dex */
    public class a implements Comparator<SolverVariable> {
        @Override // java.util.Comparator
        public final int compare(SolverVariable solverVariable, SolverVariable solverVariable2) {
            return solverVariable.f2753b - solverVariable2.f2753b;
        }
    }

    /* compiled from: PriorityGoalRow.java */
    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public SolverVariable f2797a;

        public b() {
        }

        public final String toString() {
            String str = "[ ";
            if (this.f2797a != null) {
                for (int i10 = 0; i10 < 9; i10++) {
                    StringBuilder k10 = a0.a.k(str);
                    k10.append(this.f2797a.f2758h[i10]);
                    k10.append(" ");
                    str = k10.toString();
                }
            }
            StringBuilder g10 = a0.d.g(str, "] ");
            g10.append(this.f2797a);
            return g10.toString();
        }
    }

    public d(a0.b bVar) {
        super(bVar);
        this.f2793f = new SolverVariable[128];
        this.f2794g = new SolverVariable[128];
        this.f2795h = 0;
        this.f2796i = new b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004d, code lost:
        if (r9 < r8) goto L32;
     */
    @Override // androidx.constraintlayout.core.b, androidx.constraintlayout.core.c.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.constraintlayout.core.SolverVariable a(boolean[] r12) {
        /*
            r11 = this;
            r0 = -1
            r1 = 0
            r3 = r0
            r2 = r1
        L4:
            int r4 = r11.f2795h
            if (r2 >= r4) goto L57
            androidx.constraintlayout.core.SolverVariable[] r4 = r11.f2793f
            r5 = r4[r2]
            int r6 = r5.f2753b
            boolean r6 = r12[r6]
            if (r6 == 0) goto L13
            goto L54
        L13:
            androidx.constraintlayout.core.d$b r6 = r11.f2796i
            r6.f2797a = r5
            r5 = 1
            r7 = 8
            if (r3 != r0) goto L36
        L1c:
            if (r7 < 0) goto L32
            androidx.constraintlayout.core.SolverVariable r4 = r6.f2797a
            float[] r4 = r4.f2758h
            r4 = r4[r7]
            r8 = 0
            int r9 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r9 <= 0) goto L2a
            goto L32
        L2a:
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 >= 0) goto L2f
            goto L33
        L2f:
            int r7 = r7 + (-1)
            goto L1c
        L32:
            r5 = r1
        L33:
            if (r5 == 0) goto L54
            goto L53
        L36:
            r4 = r4[r3]
        L38:
            if (r7 < 0) goto L50
            float[] r8 = r4.f2758h
            r8 = r8[r7]
            androidx.constraintlayout.core.SolverVariable r9 = r6.f2797a
            float[] r9 = r9.f2758h
            r9 = r9[r7]
            int r10 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r10 != 0) goto L4b
            int r7 = r7 + (-1)
            goto L38
        L4b:
            int r4 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r4 >= 0) goto L50
            goto L51
        L50:
            r5 = r1
        L51:
            if (r5 == 0) goto L54
        L53:
            r3 = r2
        L54:
            int r2 = r2 + 1
            goto L4
        L57:
            if (r3 != r0) goto L5b
            r12 = 0
            return r12
        L5b:
            androidx.constraintlayout.core.SolverVariable[] r12 = r11.f2793f
            r12 = r12[r3]
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.d.a(boolean[]):androidx.constraintlayout.core.SolverVariable");
    }

    @Override // androidx.constraintlayout.core.b
    public final boolean e() {
        if (this.f2795h == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.b
    public final void i(c cVar, androidx.constraintlayout.core.b bVar, boolean z10) {
        boolean z11;
        SolverVariable solverVariable = bVar.f2773a;
        if (solverVariable == null) {
            return;
        }
        b.a aVar = bVar.f2775d;
        int a10 = aVar.a();
        for (int i10 = 0; i10 < a10; i10++) {
            SolverVariable e10 = aVar.e(i10);
            float h10 = aVar.h(i10);
            b bVar2 = this.f2796i;
            bVar2.f2797a = e10;
            boolean z12 = e10.f2752a;
            float[] fArr = solverVariable.f2758h;
            if (z12) {
                boolean z13 = true;
                for (int i11 = 0; i11 < 9; i11++) {
                    float[] fArr2 = bVar2.f2797a.f2758h;
                    float f10 = (fArr[i11] * h10) + fArr2[i11];
                    fArr2[i11] = f10;
                    if (Math.abs(f10) < 1.0E-4f) {
                        bVar2.f2797a.f2758h[i11] = 0.0f;
                    } else {
                        z13 = false;
                    }
                }
                if (z13) {
                    d.this.k(bVar2.f2797a);
                }
                z11 = false;
            } else {
                for (int i12 = 0; i12 < 9; i12++) {
                    float f11 = fArr[i12];
                    if (f11 != 0.0f) {
                        float f12 = f11 * h10;
                        if (Math.abs(f12) < 1.0E-4f) {
                            f12 = 0.0f;
                        }
                        bVar2.f2797a.f2758h[i12] = f12;
                    } else {
                        bVar2.f2797a.f2758h[i12] = 0.0f;
                    }
                }
                z11 = true;
            }
            if (z11) {
                j(e10);
            }
            this.f2774b = (bVar.f2774b * h10) + this.f2774b;
        }
        k(solverVariable);
    }

    public final void j(SolverVariable solverVariable) {
        int i10;
        int i11 = this.f2795h + 1;
        SolverVariable[] solverVariableArr = this.f2793f;
        if (i11 > solverVariableArr.length) {
            SolverVariable[] solverVariableArr2 = (SolverVariable[]) Arrays.copyOf(solverVariableArr, solverVariableArr.length * 2);
            this.f2793f = solverVariableArr2;
            this.f2794g = (SolverVariable[]) Arrays.copyOf(solverVariableArr2, solverVariableArr2.length * 2);
        }
        SolverVariable[] solverVariableArr3 = this.f2793f;
        int i12 = this.f2795h;
        solverVariableArr3[i12] = solverVariable;
        int i13 = i12 + 1;
        this.f2795h = i13;
        if (i13 > 1 && solverVariableArr3[i13 - 1].f2753b > solverVariable.f2753b) {
            int i14 = 0;
            while (true) {
                i10 = this.f2795h;
                if (i14 >= i10) {
                    break;
                }
                this.f2794g[i14] = this.f2793f[i14];
                i14++;
            }
            Arrays.sort(this.f2794g, 0, i10, new a());
            for (int i15 = 0; i15 < this.f2795h; i15++) {
                this.f2793f[i15] = this.f2794g[i15];
            }
        }
        solverVariable.f2752a = true;
        solverVariable.a(this);
    }

    public final void k(SolverVariable solverVariable) {
        int i10 = 0;
        while (i10 < this.f2795h) {
            if (this.f2793f[i10] == solverVariable) {
                while (true) {
                    int i11 = this.f2795h;
                    if (i10 < i11 - 1) {
                        SolverVariable[] solverVariableArr = this.f2793f;
                        int i12 = i10 + 1;
                        solverVariableArr[i10] = solverVariableArr[i12];
                        i10 = i12;
                    } else {
                        this.f2795h = i11 - 1;
                        solverVariable.f2752a = false;
                        return;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    @Override // androidx.constraintlayout.core.b
    public final String toString() {
        String str = " goal -> (" + this.f2774b + ") : ";
        for (int i10 = 0; i10 < this.f2795h; i10++) {
            SolverVariable solverVariable = this.f2793f[i10];
            b bVar = this.f2796i;
            bVar.f2797a = solverVariable;
            str = str + bVar + " ";
        }
        return str;
    }
}
