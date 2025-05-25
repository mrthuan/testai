package b0;

import java.util.Arrays;

/* compiled from: ArcCurveFit.java */
/* loaded from: classes.dex */
public final class a extends b {

    /* renamed from: a  reason: collision with root package name */
    public final double[] f5177a;

    /* renamed from: b  reason: collision with root package name */
    public final C0031a[] f5178b;

    /* compiled from: ArcCurveFit.java */
    /* renamed from: b0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0031a {

        /* renamed from: s  reason: collision with root package name */
        public static final double[] f5179s = new double[91];

        /* renamed from: a  reason: collision with root package name */
        public final double[] f5180a;

        /* renamed from: b  reason: collision with root package name */
        public double f5181b;
        public final double c;

        /* renamed from: d  reason: collision with root package name */
        public final double f5182d;

        /* renamed from: e  reason: collision with root package name */
        public final double f5183e;

        /* renamed from: f  reason: collision with root package name */
        public final double f5184f;

        /* renamed from: g  reason: collision with root package name */
        public final double f5185g;

        /* renamed from: h  reason: collision with root package name */
        public final double f5186h;

        /* renamed from: i  reason: collision with root package name */
        public final double f5187i;

        /* renamed from: j  reason: collision with root package name */
        public final double f5188j;

        /* renamed from: k  reason: collision with root package name */
        public final double f5189k;

        /* renamed from: l  reason: collision with root package name */
        public final double f5190l;

        /* renamed from: m  reason: collision with root package name */
        public final double f5191m;

        /* renamed from: n  reason: collision with root package name */
        public final double f5192n;

        /* renamed from: o  reason: collision with root package name */
        public double f5193o;

        /* renamed from: p  reason: collision with root package name */
        public double f5194p;

        /* renamed from: q  reason: collision with root package name */
        public final boolean f5195q;

        /* renamed from: r  reason: collision with root package name */
        public final boolean f5196r;

        public C0031a(double d10, double d11, double d12, double d13, double d14, double d15, int i10) {
            int i11;
            double d16;
            double[] dArr;
            double d17 = d12;
            this.f5196r = false;
            boolean z10 = i10 == 1;
            this.f5195q = z10;
            this.c = d10;
            this.f5182d = d11;
            double d18 = 1.0d / (d11 - d10);
            this.f5187i = d18;
            if (3 == i10) {
                this.f5196r = true;
            }
            double d19 = d14 - d17;
            double d20 = d15 - d13;
            if (!this.f5196r && Math.abs(d19) >= 0.001d && Math.abs(d20) >= 0.001d) {
                this.f5180a = new double[101];
                boolean z11 = z10;
                this.f5188j = (z10 ? -1 : 1) * d19;
                if (z11) {
                    i11 = 1;
                } else {
                    i11 = -1;
                }
                this.f5189k = d20 * i11;
                this.f5190l = z11 ? d14 : d17;
                if (z11) {
                    d16 = d13;
                } else {
                    d16 = d15;
                }
                this.f5191m = d16;
                double d21 = d13 - d15;
                int i12 = 0;
                double d22 = 0.0d;
                double d23 = 0.0d;
                double d24 = 0.0d;
                while (true) {
                    dArr = f5179s;
                    if (i12 >= 91) {
                        break;
                    }
                    double radians = Math.toRadians((i12 * 90.0d) / 90);
                    double sin = Math.sin(radians) * d19;
                    double cos = Math.cos(radians) * d21;
                    if (i12 > 0) {
                        d22 += Math.hypot(sin - d23, cos - d24);
                        dArr[i12] = d22;
                    }
                    i12++;
                    d24 = cos;
                    d23 = sin;
                }
                double[] dArr2 = dArr;
                this.f5181b = d22;
                for (int i13 = 0; i13 < 91; i13++) {
                    dArr2[i13] = dArr2[i13] / d22;
                }
                int i14 = 0;
                while (true) {
                    double[] dArr3 = this.f5180a;
                    if (i14 < dArr3.length) {
                        double length = i14 / (dArr3.length - 1);
                        double[] dArr4 = dArr2;
                        int binarySearch = Arrays.binarySearch(dArr4, length);
                        if (binarySearch >= 0) {
                            dArr3[i14] = binarySearch / 90;
                        } else if (binarySearch == -1) {
                            dArr3[i14] = 0.0d;
                        } else {
                            int i15 = -binarySearch;
                            int i16 = i15 - 2;
                            double d25 = dArr4[i16];
                            dArr3[i14] = (((length - d25) / (dArr4[i15 - 1] - d25)) + i16) / 90;
                        }
                        i14++;
                        dArr2 = dArr4;
                    } else {
                        this.f5192n = this.f5181b * this.f5187i;
                        return;
                    }
                }
            } else {
                this.f5196r = true;
                this.f5183e = d17;
                this.f5184f = d14;
                this.f5185g = d13;
                this.f5186h = d15;
                double hypot = Math.hypot(d20, d19);
                this.f5181b = hypot;
                this.f5192n = hypot * d18;
                this.f5190l = d19 / (d11 - d10);
                this.f5191m = d20 / (d11 - d10);
            }
        }

        public final double a() {
            double d10 = this.f5188j * this.f5194p;
            double hypot = this.f5192n / Math.hypot(d10, (-this.f5189k) * this.f5193o);
            if (this.f5195q) {
                d10 = -d10;
            }
            return d10 * hypot;
        }

        public final double b() {
            double d10 = this.f5188j * this.f5194p;
            double d11 = (-this.f5189k) * this.f5193o;
            double hypot = this.f5192n / Math.hypot(d10, d11);
            if (this.f5195q) {
                return (-d11) * hypot;
            }
            return d11 * hypot;
        }

        public final double c(double d10) {
            double d11 = this.f5184f;
            double d12 = this.f5183e;
            return androidx.activity.f.e(d11, d12, (d10 - this.c) * this.f5187i, d12);
        }

        public final double d(double d10) {
            double d11 = this.f5186h;
            double d12 = this.f5185g;
            return androidx.activity.f.e(d11, d12, (d10 - this.c) * this.f5187i, d12);
        }

        public final double e() {
            return (this.f5188j * this.f5193o) + this.f5190l;
        }

        public final double f() {
            return (this.f5189k * this.f5194p) + this.f5191m;
        }

        public final void g(double d10) {
            double d11;
            if (this.f5195q) {
                d11 = this.f5182d - d10;
            } else {
                d11 = d10 - this.c;
            }
            double d12 = d11 * this.f5187i;
            double d13 = 0.0d;
            if (d12 > 0.0d) {
                d13 = 1.0d;
                if (d12 < 1.0d) {
                    double[] dArr = this.f5180a;
                    double length = d12 * (dArr.length - 1);
                    int i10 = (int) length;
                    double d14 = dArr[i10];
                    d13 = androidx.activity.f.e(dArr[i10 + 1], d14, length - i10, d14);
                }
            }
            double d15 = d13 * 1.5707963267948966d;
            this.f5193o = Math.sin(d15);
            this.f5194p = Math.cos(d15);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
        if (r5 == 1) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(int[] r25, double[] r26, double[][] r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = r26
            r24.<init>()
            r0.f5177a = r1
            int r2 = r1.length
            r3 = 1
            int r2 = r2 - r3
            b0.a$a[] r2 = new b0.a.C0031a[r2]
            r0.f5178b = r2
            r2 = 0
            r4 = r2
            r5 = r3
            r6 = r5
        L14:
            b0.a$a[] r7 = r0.f5178b
            int r8 = r7.length
            if (r4 >= r8) goto L4e
            r8 = r25[r4]
            r9 = 3
            if (r8 == 0) goto L2d
            if (r8 == r3) goto L2a
            r10 = 2
            if (r8 == r10) goto L28
            if (r8 == r9) goto L26
            goto L2e
        L26:
            if (r5 != r3) goto L2a
        L28:
            r5 = r10
            goto L2b
        L2a:
            r5 = r3
        L2b:
            r6 = r5
            goto L2e
        L2d:
            r6 = r9
        L2e:
            b0.a$a r22 = new b0.a$a
            r9 = r1[r4]
            int r23 = r4 + 1
            r11 = r1[r23]
            r8 = r27[r4]
            r13 = r8[r2]
            r15 = r8[r3]
            r8 = r27[r23]
            r17 = r8[r2]
            r19 = r8[r3]
            r8 = r22
            r21 = r6
            r8.<init>(r9, r11, r13, r15, r17, r19, r21)
            r7[r4] = r22
            r4 = r23
            goto L14
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.a.<init>(int[], double[], double[][]):void");
    }

    @Override // b0.b
    public final double b(double d10) {
        C0031a[] c0031aArr = this.f5178b;
        C0031a c0031a = c0031aArr[0];
        double d11 = c0031a.c;
        if (d10 < d11) {
            double d12 = d10 - d11;
            if (c0031a.f5196r) {
                return (d12 * c0031aArr[0].f5190l) + c0031a.c(d11);
            }
            c0031a.g(d11);
            return (c0031aArr[0].a() * d12) + c0031aArr[0].e();
        } else if (d10 > c0031aArr[c0031aArr.length - 1].f5182d) {
            double d13 = c0031aArr[c0031aArr.length - 1].f5182d;
            double d14 = d10 - d13;
            int length = c0031aArr.length - 1;
            return (d14 * c0031aArr[length].f5190l) + c0031aArr[length].c(d13);
        } else {
            for (int i10 = 0; i10 < c0031aArr.length; i10++) {
                C0031a c0031a2 = c0031aArr[i10];
                if (d10 <= c0031a2.f5182d) {
                    if (c0031a2.f5196r) {
                        return c0031a2.c(d10);
                    }
                    c0031a2.g(d10);
                    return c0031aArr[i10].e();
                }
            }
            return Double.NaN;
        }
    }

    @Override // b0.b
    public final void c(double d10, double[] dArr) {
        C0031a[] c0031aArr = this.f5178b;
        C0031a c0031a = c0031aArr[0];
        double d11 = c0031a.c;
        if (d10 < d11) {
            double d12 = d10 - d11;
            if (c0031a.f5196r) {
                double c = c0031a.c(d11);
                C0031a c0031a2 = c0031aArr[0];
                dArr[0] = (c0031a2.f5190l * d12) + c;
                dArr[1] = (d12 * c0031aArr[0].f5191m) + c0031a2.d(d11);
                return;
            }
            c0031a.g(d11);
            dArr[0] = (c0031aArr[0].a() * d12) + c0031aArr[0].e();
            dArr[1] = (c0031aArr[0].b() * d12) + c0031aArr[0].f();
        } else if (d10 > c0031aArr[c0031aArr.length - 1].f5182d) {
            double d13 = c0031aArr[c0031aArr.length - 1].f5182d;
            double d14 = d10 - d13;
            int length = c0031aArr.length - 1;
            C0031a c0031a3 = c0031aArr[length];
            if (c0031a3.f5196r) {
                double c10 = c0031a3.c(d13);
                C0031a c0031a4 = c0031aArr[length];
                dArr[0] = (c0031a4.f5190l * d14) + c10;
                dArr[1] = (d14 * c0031aArr[length].f5191m) + c0031a4.d(d13);
                return;
            }
            c0031a3.g(d10);
            dArr[0] = (c0031aArr[length].a() * d14) + c0031aArr[length].e();
            dArr[1] = (c0031aArr[length].b() * d14) + c0031aArr[length].f();
        } else {
            for (int i10 = 0; i10 < c0031aArr.length; i10++) {
                C0031a c0031a5 = c0031aArr[i10];
                if (d10 <= c0031a5.f5182d) {
                    if (c0031a5.f5196r) {
                        dArr[0] = c0031a5.c(d10);
                        dArr[1] = c0031aArr[i10].d(d10);
                        return;
                    }
                    c0031a5.g(d10);
                    dArr[0] = c0031aArr[i10].e();
                    dArr[1] = c0031aArr[i10].f();
                    return;
                }
            }
        }
    }

    @Override // b0.b
    public final void d(double d10, float[] fArr) {
        C0031a[] c0031aArr = this.f5178b;
        C0031a c0031a = c0031aArr[0];
        double d11 = c0031a.c;
        if (d10 < d11) {
            double d12 = d10 - d11;
            if (c0031a.f5196r) {
                double c = c0031a.c(d11);
                C0031a c0031a2 = c0031aArr[0];
                fArr[0] = (float) ((c0031a2.f5190l * d12) + c);
                fArr[1] = (float) ((d12 * c0031aArr[0].f5191m) + c0031a2.d(d11));
                return;
            }
            c0031a.g(d11);
            fArr[0] = (float) ((c0031aArr[0].a() * d12) + c0031aArr[0].e());
            fArr[1] = (float) ((c0031aArr[0].b() * d12) + c0031aArr[0].f());
        } else if (d10 > c0031aArr[c0031aArr.length - 1].f5182d) {
            double d13 = c0031aArr[c0031aArr.length - 1].f5182d;
            double d14 = d10 - d13;
            int length = c0031aArr.length - 1;
            C0031a c0031a3 = c0031aArr[length];
            if (c0031a3.f5196r) {
                double c10 = c0031a3.c(d13);
                C0031a c0031a4 = c0031aArr[length];
                fArr[0] = (float) ((c0031a4.f5190l * d14) + c10);
                fArr[1] = (float) ((d14 * c0031aArr[length].f5191m) + c0031a4.d(d13));
                return;
            }
            c0031a3.g(d10);
            fArr[0] = (float) c0031aArr[length].e();
            fArr[1] = (float) c0031aArr[length].f();
        } else {
            for (int i10 = 0; i10 < c0031aArr.length; i10++) {
                C0031a c0031a5 = c0031aArr[i10];
                if (d10 <= c0031a5.f5182d) {
                    if (c0031a5.f5196r) {
                        fArr[0] = (float) c0031a5.c(d10);
                        fArr[1] = (float) c0031aArr[i10].d(d10);
                        return;
                    }
                    c0031a5.g(d10);
                    fArr[0] = (float) c0031aArr[i10].e();
                    fArr[1] = (float) c0031aArr[i10].f();
                    return;
                }
            }
        }
    }

    @Override // b0.b
    public final double e(double d10) {
        C0031a[] c0031aArr = this.f5178b;
        double d11 = c0031aArr[0].c;
        if (d10 < d11) {
            d10 = d11;
        }
        if (d10 > c0031aArr[c0031aArr.length - 1].f5182d) {
            d10 = c0031aArr[c0031aArr.length - 1].f5182d;
        }
        for (int i10 = 0; i10 < c0031aArr.length; i10++) {
            C0031a c0031a = c0031aArr[i10];
            if (d10 <= c0031a.f5182d) {
                if (c0031a.f5196r) {
                    return c0031a.f5190l;
                }
                c0031a.g(d10);
                return c0031aArr[i10].a();
            }
        }
        return Double.NaN;
    }

    @Override // b0.b
    public final void f(double d10, double[] dArr) {
        C0031a[] c0031aArr = this.f5178b;
        double d11 = c0031aArr[0].c;
        if (d10 < d11) {
            d10 = d11;
        } else if (d10 > c0031aArr[c0031aArr.length - 1].f5182d) {
            d10 = c0031aArr[c0031aArr.length - 1].f5182d;
        }
        for (int i10 = 0; i10 < c0031aArr.length; i10++) {
            C0031a c0031a = c0031aArr[i10];
            if (d10 <= c0031a.f5182d) {
                if (c0031a.f5196r) {
                    dArr[0] = c0031a.f5190l;
                    dArr[1] = c0031a.f5191m;
                    return;
                }
                c0031a.g(d10);
                dArr[0] = c0031aArr[i10].a();
                dArr[1] = c0031aArr[i10].b();
                return;
            }
        }
    }

    @Override // b0.b
    public final double[] g() {
        return this.f5177a;
    }
}
