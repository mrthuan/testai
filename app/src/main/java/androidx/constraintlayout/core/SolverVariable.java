package androidx.constraintlayout.core;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class SolverVariable implements Comparable<SolverVariable> {

    /* renamed from: a  reason: collision with root package name */
    public boolean f2752a;

    /* renamed from: e  reason: collision with root package name */
    public float f2755e;

    /* renamed from: i  reason: collision with root package name */
    public Type f2759i;

    /* renamed from: b  reason: collision with root package name */
    public int f2753b = -1;
    public int c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f2754d = 0;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2756f = false;

    /* renamed from: g  reason: collision with root package name */
    public final float[] f2757g = new float[9];

    /* renamed from: h  reason: collision with root package name */
    public final float[] f2758h = new float[9];

    /* renamed from: j  reason: collision with root package name */
    public b[] f2760j = new b[16];

    /* renamed from: k  reason: collision with root package name */
    public int f2761k = 0;

    /* renamed from: l  reason: collision with root package name */
    public int f2762l = 0;

    /* loaded from: classes.dex */
    public enum Type {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public SolverVariable(Type type) {
        this.f2759i = type;
    }

    public final void a(b bVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.f2761k;
            if (i10 < i11) {
                if (this.f2760j[i10] == bVar) {
                    return;
                }
                i10++;
            } else {
                b[] bVarArr = this.f2760j;
                if (i11 >= bVarArr.length) {
                    this.f2760j = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f2760j;
                int i12 = this.f2761k;
                bVarArr2[i12] = bVar;
                this.f2761k = i12 + 1;
                return;
            }
        }
    }

    public final void b(b bVar) {
        int i10 = this.f2761k;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f2760j[i11] == bVar) {
                while (i11 < i10 - 1) {
                    b[] bVarArr = this.f2760j;
                    int i12 = i11 + 1;
                    bVarArr[i11] = bVarArr[i12];
                    i11 = i12;
                }
                this.f2761k--;
                return;
            }
            i11++;
        }
    }

    public final void c() {
        this.f2759i = Type.UNKNOWN;
        this.f2754d = 0;
        this.f2753b = -1;
        this.c = -1;
        this.f2755e = 0.0f;
        this.f2756f = false;
        int i10 = this.f2761k;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f2760j[i11] = null;
        }
        this.f2761k = 0;
        this.f2762l = 0;
        this.f2752a = false;
        Arrays.fill(this.f2758h, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(SolverVariable solverVariable) {
        return this.f2753b - solverVariable.f2753b;
    }

    public final void d(c cVar, float f10) {
        this.f2755e = f10;
        this.f2756f = true;
        int i10 = this.f2761k;
        this.c = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f2760j[i11].h(cVar, this, false);
        }
        this.f2761k = 0;
    }

    public final void e(c cVar, b bVar) {
        int i10 = this.f2761k;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f2760j[i11].i(cVar, bVar, false);
        }
        this.f2761k = 0;
    }

    public final String toString() {
        return "" + this.f2753b;
    }
}
