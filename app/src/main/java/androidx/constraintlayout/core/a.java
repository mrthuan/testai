package androidx.constraintlayout.core;

import a6.h;
import androidx.constraintlayout.core.b;
import java.util.Arrays;

/* compiled from: ArrayLinkedVariables.java */
/* loaded from: classes.dex */
public final class a implements b.a {

    /* renamed from: b  reason: collision with root package name */
    public final b f2765b;
    public final a0.b c;

    /* renamed from: a  reason: collision with root package name */
    public int f2764a = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f2766d = 8;

    /* renamed from: e  reason: collision with root package name */
    public int[] f2767e = new int[8];

    /* renamed from: f  reason: collision with root package name */
    public int[] f2768f = new int[8];

    /* renamed from: g  reason: collision with root package name */
    public float[] f2769g = new float[8];

    /* renamed from: h  reason: collision with root package name */
    public int f2770h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f2771i = -1;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2772j = false;

    public a(b bVar, a0.b bVar2) {
        this.f2765b = bVar;
        this.c = bVar2;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final int a() {
        return this.f2764a;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final boolean b(SolverVariable solverVariable) {
        int i10 = this.f2770h;
        if (i10 == -1) {
            return false;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f2764a; i11++) {
            if (this.f2767e[i10] == solverVariable.f2753b) {
                return true;
            }
            i10 = this.f2768f[i10];
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final float c(b bVar, boolean z10) {
        float j10 = j(bVar.f2773a);
        i(bVar.f2773a, z10);
        b.a aVar = bVar.f2775d;
        int a10 = aVar.a();
        for (int i10 = 0; i10 < a10; i10++) {
            SolverVariable e10 = aVar.e(i10);
            f(e10, aVar.j(e10) * j10, z10);
        }
        return j10;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final void clear() {
        int i10 = this.f2770h;
        for (int i11 = 0; i10 != -1 && i11 < this.f2764a; i11++) {
            SolverVariable solverVariable = ((SolverVariable[]) this.c.f13d)[this.f2767e[i10]];
            if (solverVariable != null) {
                solverVariable.b(this.f2765b);
            }
            i10 = this.f2768f[i10];
        }
        this.f2770h = -1;
        this.f2771i = -1;
        this.f2772j = false;
        this.f2764a = 0;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final void d(SolverVariable solverVariable, float f10) {
        if (f10 == 0.0f) {
            i(solverVariable, true);
            return;
        }
        int i10 = this.f2770h;
        b bVar = this.f2765b;
        if (i10 == -1) {
            this.f2770h = 0;
            this.f2769g[0] = f10;
            this.f2767e[0] = solverVariable.f2753b;
            this.f2768f[0] = -1;
            solverVariable.f2762l++;
            solverVariable.a(bVar);
            this.f2764a++;
            if (!this.f2772j) {
                int i11 = this.f2771i + 1;
                this.f2771i = i11;
                int[] iArr = this.f2767e;
                if (i11 >= iArr.length) {
                    this.f2772j = true;
                    this.f2771i = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f2764a; i13++) {
            int i14 = this.f2767e[i10];
            int i15 = solverVariable.f2753b;
            if (i14 == i15) {
                this.f2769g[i10] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f2768f[i10];
        }
        int i16 = this.f2771i;
        int i17 = i16 + 1;
        if (this.f2772j) {
            int[] iArr2 = this.f2767e;
            if (iArr2[i16] != -1) {
                i16 = iArr2.length;
            }
        } else {
            i16 = i17;
        }
        int[] iArr3 = this.f2767e;
        if (i16 >= iArr3.length && this.f2764a < iArr3.length) {
            int i18 = 0;
            while (true) {
                int[] iArr4 = this.f2767e;
                if (i18 >= iArr4.length) {
                    break;
                } else if (iArr4[i18] == -1) {
                    i16 = i18;
                    break;
                } else {
                    i18++;
                }
            }
        }
        int[] iArr5 = this.f2767e;
        if (i16 >= iArr5.length) {
            i16 = iArr5.length;
            int i19 = this.f2766d * 2;
            this.f2766d = i19;
            this.f2772j = false;
            this.f2771i = i16 - 1;
            this.f2769g = Arrays.copyOf(this.f2769g, i19);
            this.f2767e = Arrays.copyOf(this.f2767e, this.f2766d);
            this.f2768f = Arrays.copyOf(this.f2768f, this.f2766d);
        }
        this.f2767e[i16] = solverVariable.f2753b;
        this.f2769g[i16] = f10;
        if (i12 != -1) {
            int[] iArr6 = this.f2768f;
            iArr6[i16] = iArr6[i12];
            iArr6[i12] = i16;
        } else {
            this.f2768f[i16] = this.f2770h;
            this.f2770h = i16;
        }
        solverVariable.f2762l++;
        solverVariable.a(bVar);
        int i20 = this.f2764a + 1;
        this.f2764a = i20;
        if (!this.f2772j) {
            this.f2771i++;
        }
        int[] iArr7 = this.f2767e;
        if (i20 >= iArr7.length) {
            this.f2772j = true;
        }
        if (this.f2771i >= iArr7.length) {
            this.f2772j = true;
            this.f2771i = iArr7.length - 1;
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public final SolverVariable e(int i10) {
        int i11 = this.f2770h;
        for (int i12 = 0; i11 != -1 && i12 < this.f2764a; i12++) {
            if (i12 == i10) {
                return ((SolverVariable[]) this.c.f13d)[this.f2767e[i11]];
            }
            i11 = this.f2768f[i11];
        }
        return null;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final void f(SolverVariable solverVariable, float f10, boolean z10) {
        if (f10 > -0.001f && f10 < 0.001f) {
            return;
        }
        int i10 = this.f2770h;
        b bVar = this.f2765b;
        if (i10 == -1) {
            this.f2770h = 0;
            this.f2769g[0] = f10;
            this.f2767e[0] = solverVariable.f2753b;
            this.f2768f[0] = -1;
            solverVariable.f2762l++;
            solverVariable.a(bVar);
            this.f2764a++;
            if (!this.f2772j) {
                int i11 = this.f2771i + 1;
                this.f2771i = i11;
                int[] iArr = this.f2767e;
                if (i11 >= iArr.length) {
                    this.f2772j = true;
                    this.f2771i = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f2764a; i13++) {
            int i14 = this.f2767e[i10];
            int i15 = solverVariable.f2753b;
            if (i14 == i15) {
                float[] fArr = this.f2769g;
                float f11 = fArr[i10] + f10;
                if (f11 > -0.001f && f11 < 0.001f) {
                    f11 = 0.0f;
                }
                fArr[i10] = f11;
                if (f11 == 0.0f) {
                    if (i10 == this.f2770h) {
                        this.f2770h = this.f2768f[i10];
                    } else {
                        int[] iArr2 = this.f2768f;
                        iArr2[i12] = iArr2[i10];
                    }
                    if (z10) {
                        solverVariable.b(bVar);
                    }
                    if (this.f2772j) {
                        this.f2771i = i10;
                    }
                    solverVariable.f2762l--;
                    this.f2764a--;
                    return;
                }
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f2768f[i10];
        }
        int i16 = this.f2771i;
        int i17 = i16 + 1;
        if (this.f2772j) {
            int[] iArr3 = this.f2767e;
            if (iArr3[i16] != -1) {
                i16 = iArr3.length;
            }
        } else {
            i16 = i17;
        }
        int[] iArr4 = this.f2767e;
        if (i16 >= iArr4.length && this.f2764a < iArr4.length) {
            int i18 = 0;
            while (true) {
                int[] iArr5 = this.f2767e;
                if (i18 >= iArr5.length) {
                    break;
                } else if (iArr5[i18] == -1) {
                    i16 = i18;
                    break;
                } else {
                    i18++;
                }
            }
        }
        int[] iArr6 = this.f2767e;
        if (i16 >= iArr6.length) {
            i16 = iArr6.length;
            int i19 = this.f2766d * 2;
            this.f2766d = i19;
            this.f2772j = false;
            this.f2771i = i16 - 1;
            this.f2769g = Arrays.copyOf(this.f2769g, i19);
            this.f2767e = Arrays.copyOf(this.f2767e, this.f2766d);
            this.f2768f = Arrays.copyOf(this.f2768f, this.f2766d);
        }
        this.f2767e[i16] = solverVariable.f2753b;
        this.f2769g[i16] = f10;
        if (i12 != -1) {
            int[] iArr7 = this.f2768f;
            iArr7[i16] = iArr7[i12];
            iArr7[i12] = i16;
        } else {
            this.f2768f[i16] = this.f2770h;
            this.f2770h = i16;
        }
        solverVariable.f2762l++;
        solverVariable.a(bVar);
        this.f2764a++;
        if (!this.f2772j) {
            this.f2771i++;
        }
        int i20 = this.f2771i;
        int[] iArr8 = this.f2767e;
        if (i20 >= iArr8.length) {
            this.f2772j = true;
            this.f2771i = iArr8.length - 1;
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public final void g() {
        int i10 = this.f2770h;
        for (int i11 = 0; i10 != -1 && i11 < this.f2764a; i11++) {
            float[] fArr = this.f2769g;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.f2768f[i10];
        }
    }

    @Override // androidx.constraintlayout.core.b.a
    public final float h(int i10) {
        int i11 = this.f2770h;
        for (int i12 = 0; i11 != -1 && i12 < this.f2764a; i12++) {
            if (i12 == i10) {
                return this.f2769g[i11];
            }
            i11 = this.f2768f[i11];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final float i(SolverVariable solverVariable, boolean z10) {
        int i10 = this.f2770h;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f2764a) {
            if (this.f2767e[i10] == solverVariable.f2753b) {
                if (i10 == this.f2770h) {
                    this.f2770h = this.f2768f[i10];
                } else {
                    int[] iArr = this.f2768f;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    solverVariable.b(this.f2765b);
                }
                solverVariable.f2762l--;
                this.f2764a--;
                this.f2767e[i10] = -1;
                if (this.f2772j) {
                    this.f2771i = i10;
                }
                return this.f2769g[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f2768f[i10];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final float j(SolverVariable solverVariable) {
        int i10 = this.f2770h;
        for (int i11 = 0; i10 != -1 && i11 < this.f2764a; i11++) {
            if (this.f2767e[i10] == solverVariable.f2753b) {
                return this.f2769g[i10];
            }
            i10 = this.f2768f[i10];
        }
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.b.a
    public final void k(float f10) {
        int i10 = this.f2770h;
        for (int i11 = 0; i10 != -1 && i11 < this.f2764a; i11++) {
            float[] fArr = this.f2769g;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f2768f[i10];
        }
    }

    public final String toString() {
        int i10 = this.f2770h;
        String str = "";
        for (int i11 = 0; i10 != -1 && i11 < this.f2764a; i11++) {
            StringBuilder k10 = a0.a.k(h.c(str, " -> "));
            k10.append(this.f2769g[i10]);
            k10.append(" : ");
            StringBuilder k11 = a0.a.k(k10.toString());
            k11.append(((SolverVariable[]) this.c.f13d)[this.f2767e[i10]]);
            str = k11.toString();
            i10 = this.f2768f[i10];
        }
        return str;
    }
}
