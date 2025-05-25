package b0;

import java.lang.reflect.Array;

/* compiled from: MonotonicCurveFit.java */
/* loaded from: classes.dex */
public final class g extends b {

    /* renamed from: a  reason: collision with root package name */
    public final double[] f5224a;

    /* renamed from: b  reason: collision with root package name */
    public final double[][] f5225b;
    public final double[][] c;

    /* renamed from: d  reason: collision with root package name */
    public final double[] f5226d;

    public g(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.f5226d = new double[length2];
        int i10 = length - 1;
        double[][] dArr3 = (double[][]) Array.newInstance(Double.TYPE, i10, length2);
        double[][] dArr4 = (double[][]) Array.newInstance(Double.TYPE, length, length2);
        for (int i11 = 0; i11 < length2; i11++) {
            int i12 = 0;
            while (i12 < i10) {
                int i13 = i12 + 1;
                double d10 = dArr[i13] - dArr[i12];
                double[] dArr5 = dArr3[i12];
                double d11 = (dArr2[i13][i11] - dArr2[i12][i11]) / d10;
                dArr5[i11] = d11;
                if (i12 == 0) {
                    dArr4[i12][i11] = d11;
                } else {
                    dArr4[i12][i11] = (dArr3[i12 - 1][i11] + d11) * 0.5d;
                }
                i12 = i13;
            }
            dArr4[i10][i11] = dArr3[length - 2][i11];
        }
        for (int i14 = 0; i14 < i10; i14++) {
            for (int i15 = 0; i15 < length2; i15++) {
                double d12 = dArr3[i14][i15];
                if (d12 == 0.0d) {
                    dArr4[i14][i15] = 0.0d;
                    dArr4[i14 + 1][i15] = 0.0d;
                } else {
                    double d13 = dArr4[i14][i15] / d12;
                    int i16 = i14 + 1;
                    double d14 = dArr4[i16][i15] / d12;
                    double hypot = Math.hypot(d13, d14);
                    if (hypot > 9.0d) {
                        double d15 = 3.0d / hypot;
                        double[] dArr6 = dArr4[i14];
                        double[] dArr7 = dArr3[i14];
                        dArr6[i15] = d13 * d15 * dArr7[i15];
                        dArr4[i16][i15] = d15 * d14 * dArr7[i15];
                    }
                }
            }
        }
        this.f5224a = dArr;
        this.f5225b = dArr2;
        this.c = dArr4;
    }

    public static double h(double d10, double d11, double d12, double d13, double d14, double d15) {
        double d16 = d11 * d11;
        double d17 = d11 * 6.0d;
        double d18 = 6.0d * d16 * d12;
        double d19 = 3.0d * d10;
        double d20 = d19 * d14 * d16;
        return (d10 * d14) + (((d20 + (((d19 * d15) * d16) + ((d18 + ((d17 * d13) + (((-6.0d) * d16) * d13))) - (d17 * d12)))) - (((2.0d * d10) * d15) * d11)) - (((4.0d * d10) * d14) * d11));
    }

    public static double i(double d10, double d11, double d12, double d13, double d14, double d15) {
        double d16 = d11 * d11;
        double d17 = d16 * d11;
        double d18 = 3.0d * d16;
        double d19 = d18 * d13;
        double d20 = d10 * d15;
        double d21 = d20 * d17;
        double d22 = d10 * d14;
        return (d22 * d11) + ((((d17 * d22) + (d21 + (((((d17 * 2.0d) * d12) + (d19 + (((-2.0d) * d17) * d13))) - (d18 * d12)) + d12))) - (d20 * d16)) - (((2.0d * d10) * d14) * d16));
    }

    @Override // b0.b
    public final double b(double d10) {
        double d11;
        double d12;
        double e10;
        double[] dArr = this.f5224a;
        int length = dArr.length;
        double d13 = dArr[0];
        int i10 = (d10 > d13 ? 1 : (d10 == d13 ? 0 : -1));
        double[][] dArr2 = this.f5225b;
        if (i10 <= 0) {
            d11 = dArr2[0][0];
            d12 = d10 - d13;
            e10 = e(d13);
        } else {
            int i11 = length - 1;
            double d14 = dArr[i11];
            if (d10 >= d14) {
                d11 = dArr2[i11][0];
                d12 = d10 - d14;
                e10 = e(d14);
            } else {
                int i12 = 0;
                while (i12 < i11) {
                    double d15 = dArr[i12];
                    if (d10 == d15) {
                        return dArr2[i12][0];
                    }
                    int i13 = i12 + 1;
                    double d16 = dArr[i13];
                    if (d10 < d16) {
                        double d17 = d16 - d15;
                        double d18 = (d10 - d15) / d17;
                        double d19 = dArr2[i12][0];
                        double d20 = dArr2[i13][0];
                        double[][] dArr3 = this.c;
                        return i(d17, d18, d19, d20, dArr3[i12][0], dArr3[i13][0]);
                    }
                    i12 = i13;
                }
                return 0.0d;
            }
        }
        return (e10 * d12) + d11;
    }

    @Override // b0.b
    public final void c(double d10, double[] dArr) {
        double[] dArr2 = this.f5224a;
        int length = dArr2.length;
        double[][] dArr3 = this.f5225b;
        int i10 = 0;
        int length2 = dArr3[0].length;
        double d11 = dArr2[0];
        int i11 = (d10 > d11 ? 1 : (d10 == d11 ? 0 : -1));
        double[] dArr4 = this.f5226d;
        if (i11 <= 0) {
            f(d11, dArr4);
            for (int i12 = 0; i12 < length2; i12++) {
                dArr[i12] = ((d10 - dArr2[0]) * dArr4[i12]) + dArr3[0][i12];
            }
            return;
        }
        int i13 = length - 1;
        double d12 = dArr2[i13];
        if (d10 >= d12) {
            f(d12, dArr4);
            while (i10 < length2) {
                dArr[i10] = ((d10 - dArr2[i13]) * dArr4[i10]) + dArr3[i13][i10];
                i10++;
            }
            return;
        }
        int i14 = 0;
        while (i14 < length - 1) {
            if (d10 == dArr2[i14]) {
                for (int i15 = 0; i15 < length2; i15++) {
                    dArr[i15] = dArr3[i14][i15];
                }
            }
            int i16 = i14 + 1;
            double d13 = dArr2[i16];
            if (d10 < d13) {
                double d14 = dArr2[i14];
                double d15 = d13 - d14;
                double d16 = (d10 - d14) / d15;
                while (i10 < length2) {
                    double d17 = dArr3[i14][i10];
                    double d18 = dArr3[i16][i10];
                    double[][] dArr5 = this.c;
                    dArr[i10] = i(d15, d16, d17, d18, dArr5[i14][i10], dArr5[i16][i10]);
                    i10++;
                }
                return;
            }
            i14 = i16;
        }
    }

    @Override // b0.b
    public final void d(double d10, float[] fArr) {
        double[] dArr = this.f5224a;
        int length = dArr.length;
        double[][] dArr2 = this.f5225b;
        int i10 = 0;
        int length2 = dArr2[0].length;
        double d11 = dArr[0];
        int i11 = (d10 > d11 ? 1 : (d10 == d11 ? 0 : -1));
        double[] dArr3 = this.f5226d;
        if (i11 <= 0) {
            f(d11, dArr3);
            for (int i12 = 0; i12 < length2; i12++) {
                fArr[i12] = (float) (((d10 - dArr[0]) * dArr3[i12]) + dArr2[0][i12]);
            }
            return;
        }
        int i13 = length - 1;
        double d12 = dArr[i13];
        if (d10 >= d12) {
            f(d12, dArr3);
            while (i10 < length2) {
                fArr[i10] = (float) (((d10 - dArr[i13]) * dArr3[i10]) + dArr2[i13][i10]);
                i10++;
            }
            return;
        }
        int i14 = 0;
        while (i14 < i13) {
            if (d10 == dArr[i14]) {
                for (int i15 = 0; i15 < length2; i15++) {
                    fArr[i15] = (float) dArr2[i14][i15];
                }
            }
            int i16 = i14 + 1;
            double d13 = dArr[i16];
            if (d10 < d13) {
                double d14 = dArr[i14];
                double d15 = d13 - d14;
                double d16 = (d10 - d14) / d15;
                while (i10 < length2) {
                    double d17 = dArr2[i14][i10];
                    double d18 = dArr2[i16][i10];
                    double[][] dArr4 = this.c;
                    fArr[i10] = (float) i(d15, d16, d17, d18, dArr4[i14][i10], dArr4[i16][i10]);
                    i10++;
                }
                return;
            }
            i14 = i16;
        }
    }

    @Override // b0.b
    public final double e(double d10) {
        double[] dArr = this.f5224a;
        int length = dArr.length;
        double d11 = dArr[0];
        if (d10 >= d11) {
            d11 = dArr[length - 1];
            if (d10 < d11) {
                d11 = d10;
            }
        }
        int i10 = 0;
        while (i10 < length - 1) {
            int i11 = i10 + 1;
            double d12 = dArr[i11];
            if (d11 <= d12) {
                double d13 = dArr[i10];
                double d14 = d12 - d13;
                double[][] dArr2 = this.f5225b;
                double d15 = dArr2[i10][0];
                double d16 = dArr2[i11][0];
                double[][] dArr3 = this.c;
                return h(d14, (d11 - d13) / d14, d15, d16, dArr3[i10][0], dArr3[i11][0]) / d14;
            }
            i10 = i11;
        }
        return 0.0d;
    }

    @Override // b0.b
    public final void f(double d10, double[] dArr) {
        double[] dArr2 = this.f5224a;
        int length = dArr2.length;
        double[][] dArr3 = this.f5225b;
        int length2 = dArr3[0].length;
        double d11 = dArr2[0];
        if (d10 > d11) {
            d11 = dArr2[length - 1];
            if (d10 < d11) {
                d11 = d10;
            }
        }
        int i10 = 0;
        while (i10 < length - 1) {
            int i11 = i10 + 1;
            double d12 = dArr2[i11];
            if (d11 <= d12) {
                double d13 = dArr2[i10];
                double d14 = d12 - d13;
                double d15 = (d11 - d13) / d14;
                for (int i12 = 0; i12 < length2; i12++) {
                    double d16 = dArr3[i10][i12];
                    double d17 = dArr3[i11][i12];
                    double[][] dArr4 = this.c;
                    dArr[i12] = h(d14, d15, d16, d17, dArr4[i10][i12], dArr4[i11][i12]) / d14;
                }
                return;
            }
            i10 = i11;
        }
    }

    @Override // b0.b
    public final double[] g() {
        return this.f5224a;
    }
}
