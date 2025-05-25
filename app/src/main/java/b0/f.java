package b0;

/* compiled from: LinearCurveFit.java */
/* loaded from: classes.dex */
public final class f extends b {

    /* renamed from: a  reason: collision with root package name */
    public final double[] f5222a;

    /* renamed from: b  reason: collision with root package name */
    public final double[][] f5223b;
    public final double[] c;

    public f(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.c = new double[length2];
        this.f5222a = dArr;
        this.f5223b = dArr2;
        if (length2 > 2) {
            double d10 = 0.0d;
            int i10 = 0;
            while (i10 < dArr.length) {
                double d11 = dArr2[i10][0];
                if (i10 > 0) {
                    double d12 = d11 - d10;
                    Math.hypot(d12, d12);
                }
                i10++;
                d10 = d11;
            }
        }
    }

    @Override // b0.b
    public final double b(double d10) {
        double d11;
        double d12;
        double e10;
        double[] dArr = this.f5222a;
        int length = dArr.length;
        double d13 = dArr[0];
        int i10 = (d10 > d13 ? 1 : (d10 == d13 ? 0 : -1));
        double[][] dArr2 = this.f5223b;
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
                        double d17 = (d10 - d15) / (d16 - d15);
                        return (dArr2[i13][0] * d17) + ((1.0d - d17) * dArr2[i12][0]);
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
        double[] dArr2 = this.f5222a;
        int length = dArr2.length;
        double[][] dArr3 = this.f5223b;
        int i10 = 0;
        int length2 = dArr3[0].length;
        double d11 = dArr2[0];
        int i11 = (d10 > d11 ? 1 : (d10 == d11 ? 0 : -1));
        double[] dArr4 = this.c;
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
                double d15 = (d10 - d14) / (d13 - d14);
                while (i10 < length2) {
                    dArr[i10] = (dArr3[i16][i10] * d15) + ((1.0d - d15) * dArr3[i14][i10]);
                    i10++;
                }
                return;
            }
            i14 = i16;
        }
    }

    @Override // b0.b
    public final void d(double d10, float[] fArr) {
        double[] dArr = this.f5222a;
        int length = dArr.length;
        double[][] dArr2 = this.f5223b;
        int i10 = 0;
        int length2 = dArr2[0].length;
        double d11 = dArr[0];
        int i11 = (d10 > d11 ? 1 : (d10 == d11 ? 0 : -1));
        double[] dArr3 = this.c;
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
                double d15 = (d10 - d14) / (d13 - d14);
                while (i10 < length2) {
                    fArr[i10] = (float) ((dArr2[i16][i10] * d15) + ((1.0d - d15) * dArr2[i14][i10]));
                    i10++;
                }
                return;
            }
            i14 = i16;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r9 >= r3) goto L3;
     */
    @Override // b0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final double e(double r9) {
        /*
            r8 = this;
            double[] r0 = r8.f5222a
            int r1 = r0.length
            r2 = 0
            r3 = r0[r2]
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r5 >= 0) goto Lc
        La:
            r9 = r3
            goto L15
        Lc:
            int r3 = r1 + (-1)
            r3 = r0[r3]
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r5 < 0) goto L15
            goto La
        L15:
            r3 = r2
        L16:
            int r4 = r1 + (-1)
            if (r3 >= r4) goto L34
            int r4 = r3 + 1
            r5 = r0[r4]
            int r7 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r7 > 0) goto L32
            r9 = r0[r3]
            double r5 = r5 - r9
            double[][] r9 = r8.f5223b
            r10 = r9[r3]
            r0 = r10[r2]
            r9 = r9[r4]
            r2 = r9[r2]
            double r2 = r2 - r0
            double r2 = r2 / r5
            return r2
        L32:
            r3 = r4
            goto L16
        L34:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.f.e(double):double");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
        if (r12 >= r5) goto L3;
     */
    @Override // b0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(double r12, double[] r14) {
        /*
            r11 = this;
            double[] r0 = r11.f5222a
            int r1 = r0.length
            double[][] r2 = r11.f5223b
            r3 = 0
            r4 = r2[r3]
            int r4 = r4.length
            r5 = r0[r3]
            int r7 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r7 > 0) goto L11
        Lf:
            r12 = r5
            goto L1a
        L11:
            int r5 = r1 + (-1)
            r5 = r0[r5]
            int r7 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r7 < 0) goto L1a
            goto Lf
        L1a:
            r5 = r3
        L1b:
            int r6 = r1 + (-1)
            if (r5 >= r6) goto L3d
            int r6 = r5 + 1
            r7 = r0[r6]
            int r9 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r9 > 0) goto L3b
            r12 = r0[r5]
            double r7 = r7 - r12
        L2a:
            if (r3 >= r4) goto L3d
            r12 = r2[r5]
            r0 = r12[r3]
            r12 = r2[r6]
            r9 = r12[r3]
            double r9 = r9 - r0
            double r9 = r9 / r7
            r14[r3] = r9
            int r3 = r3 + 1
            goto L2a
        L3b:
            r5 = r6
            goto L1b
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.f.f(double, double[]):void");
    }

    @Override // b0.b
    public final double[] g() {
        return this.f5222a;
    }
}
