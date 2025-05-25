package lib.zj.office.java.awt.geom;

import java.util.NoSuchElementException;

/* compiled from: FlatteningPathIterator.java */
/* loaded from: classes3.dex */
public final class j implements p {

    /* renamed from: a  reason: collision with root package name */
    public final p f20772a;

    /* renamed from: b  reason: collision with root package name */
    public final double f20773b;
    public double[] c = new double[14];

    /* renamed from: d  reason: collision with root package name */
    public double f20774d;

    /* renamed from: e  reason: collision with root package name */
    public double f20775e;

    /* renamed from: f  reason: collision with root package name */
    public double f20776f;

    /* renamed from: g  reason: collision with root package name */
    public double f20777g;

    /* renamed from: h  reason: collision with root package name */
    public int f20778h;

    /* renamed from: i  reason: collision with root package name */
    public int f20779i;

    /* renamed from: j  reason: collision with root package name */
    public int f20780j;

    /* renamed from: k  reason: collision with root package name */
    public final int[] f20781k;

    /* renamed from: l  reason: collision with root package name */
    public int f20782l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f20783m;

    public j(p pVar, double d10) {
        if (d10 >= 0.0d) {
            this.f20772a = pVar;
            this.f20773b = d10 * d10;
            this.f20781k = new int[11];
            e(false);
            return;
        }
        throw new IllegalArgumentException("flatness must be >= 0");
    }

    @Override // lib.zj.office.java.awt.geom.p
    public final int a(double[] dArr) {
        if (!this.f20783m) {
            int i10 = this.f20778h;
            if (i10 != 4) {
                double[] dArr2 = this.c;
                int i11 = this.f20780j;
                dArr[0] = dArr2[i11 + 0];
                dArr[1] = dArr2[i11 + 1];
                if (i10 != 0) {
                    return 1;
                }
                return i10;
            }
            return i10;
        }
        throw new NoSuchElementException("flattening iterator out of bounds");
    }

    @Override // lib.zj.office.java.awt.geom.p
    public final int b(float[] fArr) {
        if (!this.f20783m) {
            int i10 = this.f20778h;
            if (i10 != 4) {
                double[] dArr = this.c;
                int i11 = this.f20780j;
                fArr[0] = (float) dArr[i11 + 0];
                fArr[1] = (float) dArr[i11 + 1];
                if (i10 != 0) {
                    return 1;
                }
                return i10;
            }
            return i10;
        }
        throw new NoSuchElementException("flattening iterator out of bounds");
    }

    @Override // lib.zj.office.java.awt.geom.p
    public final int c() {
        return this.f20772a.c();
    }

    public final void d(int i10) {
        int i11 = this.f20780j;
        if (i11 - i10 < 0) {
            double[] dArr = this.c;
            double[] dArr2 = new double[dArr.length + 24];
            System.arraycopy(dArr, i11, dArr2, i11 + 24, dArr.length - i11);
            this.c = dArr2;
            this.f20780j += 24;
            this.f20779i += 24;
        }
    }

    public final void e(boolean z10) {
        int[] iArr;
        int i10 = this.f20780j;
        int i11 = this.f20779i;
        int[] iArr2 = this.f20781k;
        if (i10 >= i11) {
            p pVar = this.f20772a;
            if (z10) {
                pVar.next();
            }
            if (pVar.isDone()) {
                this.f20783m = true;
                return;
            }
            this.f20778h = pVar.a(this.c);
            this.f20782l = 0;
            iArr2[0] = 0;
        }
        int i12 = this.f20778h;
        if (i12 != 0 && i12 != 1) {
            double d10 = this.f20773b;
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 == 4) {
                        this.f20774d = this.f20776f;
                        this.f20775e = this.f20777g;
                        this.f20780j = 0;
                        this.f20779i = 0;
                        return;
                    }
                    return;
                }
                if (this.f20780j >= this.f20779i) {
                    double[] dArr = this.c;
                    int length = dArr.length - 8;
                    this.f20780j = length;
                    this.f20779i = dArr.length - 2;
                    iArr = iArr2;
                    dArr[length + 0] = this.f20774d;
                    dArr[length + 1] = this.f20775e;
                    dArr[length + 2] = dArr[0];
                    dArr[length + 3] = dArr[1];
                    dArr[length + 4] = dArr[2];
                    dArr[length + 5] = dArr[3];
                    double d11 = dArr[4];
                    this.f20774d = d11;
                    dArr[length + 6] = d11;
                    double d12 = dArr[5];
                    this.f20775e = d12;
                    dArr[length + 7] = d12;
                } else {
                    iArr = iArr2;
                }
                int i13 = iArr[this.f20782l];
                for (int i14 = 10; i13 < i14; i14 = 10) {
                    double[] dArr2 = this.c;
                    int i15 = this.f20780j;
                    double d13 = dArr2[i15 + 0];
                    double d14 = dArr2[i15 + 1];
                    double d15 = dArr2[i15 + 2];
                    double d16 = dArr2[i15 + 3];
                    double d17 = dArr2[i15 + 4];
                    double d18 = dArr2[i15 + 5];
                    double d19 = dArr2[i15 + 6];
                    double d20 = dArr2[i15 + 7];
                    if (Math.max(Line2D.ptSegDistSq(d13, d14, d19, d20, d15, d16), Line2D.ptSegDistSq(d13, d14, d19, d20, d17, d18)) < d10) {
                        break;
                    }
                    d(6);
                    double[] dArr3 = this.c;
                    int i16 = this.f20780j;
                    int i17 = i16 - 6;
                    int i18 = i16 + 0;
                    double d21 = dArr3[i18];
                    int i19 = i16 + 1;
                    double d22 = dArr3[i19];
                    int i20 = i16 + 2;
                    double d23 = dArr3[i20];
                    int i21 = i16 + 3;
                    double d24 = dArr3[i21];
                    int i22 = i16 + 4;
                    double d25 = dArr3[i22];
                    int i23 = i16 + 5;
                    double d26 = dArr3[i23];
                    int i24 = i16 + 6;
                    double d27 = dArr3[i24];
                    int i25 = i16 + 7;
                    double d28 = dArr3[i25];
                    dArr3[i17 + 0] = d21;
                    dArr3[i17 + 1] = d22;
                    dArr3[i24] = d27;
                    dArr3[i25] = d28;
                    double d29 = (d21 + d23) / 2.0d;
                    double d30 = (d22 + d24) / 2.0d;
                    double d31 = (d27 + d25) / 2.0d;
                    double d32 = (d28 + d26) / 2.0d;
                    double d33 = (d23 + d25) / 2.0d;
                    double d34 = (d24 + d26) / 2.0d;
                    double d35 = (d29 + d33) / 2.0d;
                    double d36 = (d30 + d34) / 2.0d;
                    double d37 = (d33 + d31) / 2.0d;
                    double d38 = (d34 + d32) / 2.0d;
                    double d39 = (d35 + d37) / 2.0d;
                    double d40 = (d36 + d38) / 2.0d;
                    dArr3[i17 + 2] = d29;
                    dArr3[i17 + 3] = d30;
                    dArr3[i17 + 4] = d35;
                    dArr3[i17 + 5] = d36;
                    dArr3[i17 + 6] = d39;
                    dArr3[i17 + 7] = d40;
                    dArr3[i18] = d39;
                    dArr3[i19] = d40;
                    dArr3[i20] = d37;
                    dArr3[i21] = d38;
                    dArr3[i22] = d31;
                    dArr3[i23] = d32;
                    this.f20780j = i17;
                    i13++;
                    int i26 = this.f20782l;
                    iArr[i26] = i13;
                    int i27 = i26 + 1;
                    this.f20782l = i27;
                    iArr[i27] = i13;
                }
                this.f20780j += 6;
                this.f20782l--;
                return;
            }
            if (this.f20780j >= this.f20779i) {
                double[] dArr4 = this.c;
                int length2 = dArr4.length - 6;
                this.f20780j = length2;
                this.f20779i = dArr4.length - 2;
                dArr4[length2 + 0] = this.f20774d;
                dArr4[length2 + 1] = this.f20775e;
                dArr4[length2 + 2] = dArr4[0];
                dArr4[length2 + 3] = dArr4[1];
                double d41 = dArr4[2];
                this.f20774d = d41;
                dArr4[length2 + 4] = d41;
                double d42 = dArr4[3];
                this.f20775e = d42;
                dArr4[length2 + 5] = d42;
            }
            int i28 = iArr2[this.f20782l];
            while (i28 < 10) {
                double[] dArr5 = this.c;
                int i29 = this.f20780j;
                if (Line2D.ptSegDistSq(dArr5[i29 + 0], dArr5[i29 + 1], dArr5[i29 + 4], dArr5[i29 + 5], dArr5[i29 + 2], dArr5[i29 + 3]) < d10) {
                    break;
                }
                d(4);
                double[] dArr6 = this.c;
                int i30 = this.f20780j;
                int i31 = i30 - 4;
                int i32 = i30 + 0;
                double d43 = dArr6[i32];
                int i33 = i30 + 1;
                double d44 = dArr6[i33];
                int i34 = i30 + 2;
                double d45 = dArr6[i34];
                int i35 = i30 + 3;
                double d46 = dArr6[i35];
                int i36 = i30 + 4;
                double d47 = dArr6[i36];
                int i37 = i30 + 5;
                double d48 = dArr6[i37];
                dArr6[i31 + 0] = d43;
                dArr6[i31 + 1] = d44;
                dArr6[i36] = d47;
                dArr6[i37] = d48;
                double d49 = (d43 + d45) / 2.0d;
                double d50 = (d44 + d46) / 2.0d;
                double d51 = (d47 + d45) / 2.0d;
                double d52 = (d48 + d46) / 2.0d;
                double d53 = (d49 + d51) / 2.0d;
                double d54 = (d50 + d52) / 2.0d;
                dArr6[i31 + 2] = d49;
                dArr6[i31 + 3] = d50;
                dArr6[i31 + 4] = d53;
                dArr6[i31 + 5] = d54;
                dArr6[i32] = d53;
                dArr6[i33] = d54;
                dArr6[i34] = d51;
                dArr6[i35] = d52;
                this.f20780j = i31;
                i28++;
                int i38 = this.f20782l;
                iArr2[i38] = i28;
                int i39 = i38 + 1;
                this.f20782l = i39;
                iArr2[i39] = i28;
            }
            this.f20780j += 4;
            this.f20782l--;
            return;
        }
        double[] dArr7 = this.c;
        double d55 = dArr7[0];
        this.f20774d = d55;
        double d56 = dArr7[1];
        this.f20775e = d56;
        if (i12 == 0) {
            this.f20776f = d55;
            this.f20777g = d56;
        }
        this.f20780j = 0;
        this.f20779i = 0;
    }

    @Override // lib.zj.office.java.awt.geom.p
    public final boolean isDone() {
        return this.f20783m;
    }

    @Override // lib.zj.office.java.awt.geom.p
    public final void next() {
        e(true);
    }
}
