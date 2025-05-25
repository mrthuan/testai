package lib.zj.office.java.awt.geom;

import java.util.Vector;
import lib.zj.office.java.awt.geom.Rectangle2D;

/* compiled from: Order2.java */
/* loaded from: classes3.dex */
public final class n extends e {

    /* renamed from: b  reason: collision with root package name */
    public final double f20792b;
    public final double c;

    /* renamed from: d  reason: collision with root package name */
    public final double f20793d;

    /* renamed from: e  reason: collision with root package name */
    public final double f20794e;

    /* renamed from: f  reason: collision with root package name */
    public final double f20795f;

    /* renamed from: g  reason: collision with root package name */
    public final double f20796g;

    /* renamed from: h  reason: collision with root package name */
    public final double f20797h;

    /* renamed from: i  reason: collision with root package name */
    public final double f20798i;

    /* renamed from: j  reason: collision with root package name */
    public final double f20799j;

    /* renamed from: k  reason: collision with root package name */
    public final double f20800k;

    /* renamed from: l  reason: collision with root package name */
    public final double f20801l;

    /* renamed from: m  reason: collision with root package name */
    public final double f20802m;

    /* renamed from: n  reason: collision with root package name */
    public final double f20803n;

    /* renamed from: o  reason: collision with root package name */
    public final double f20804o;

    public n(double d10, double d11, double d12, double d13, double d14, double d15, int i10) {
        super(i10);
        if (d13 < d11) {
            d13 = d11;
        } else if (d13 > d15) {
            d13 = d15;
        }
        this.f20792b = d10;
        this.c = d11;
        this.f20793d = d12;
        this.f20794e = d13;
        this.f20795f = d14;
        this.f20796g = d15;
        this.f20797h = Math.min(Math.min(d10, d14), d12);
        this.f20798i = Math.max(Math.max(d10, d14), d12);
        this.f20799j = d10;
        this.f20800k = ((d12 + d12) - d10) - d10;
        this.f20801l = ((d10 - d12) - d12) + d14;
        this.f20802m = d11;
        this.f20803n = ((d13 + d13) - d11) - d11;
        this.f20804o = ((d11 - d13) - d13) + d15;
    }

    public static void A(Vector vector, double d10, double d11, double d12, double d13, double d14, double d15, int i10) {
        if (d11 > d15) {
            vector.add(new n(d14, d15, d12, d13, d10, d11, -i10));
        } else if (d15 > d11) {
            vector.add(new n(d10, d11, d12, d13, d14, d15, i10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void B(java.util.Vector r21, double[] r22, double r23, double r25, double r27, double r29, double r31, double r33, int r35) {
        /*
            r0 = r22
            int r1 = (r25 > r29 ? 1 : (r25 == r29 ? 0 : -1))
            r2 = 1
            r3 = 0
            if (r1 > 0) goto Ld
            int r1 = (r29 > r33 ? 1 : (r29 == r33 ? 0 : -1))
            if (r1 > 0) goto Ld
            goto L29
        Ld:
            double r4 = r25 - r29
            double r6 = r33 - r29
            double r6 = r6 + r4
            r8 = 0
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 != 0) goto L19
            goto L29
        L19:
            double r4 = r4 / r6
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 <= 0) goto L29
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 < 0) goto L25
            goto L29
        L25:
            r0[r3] = r4
            r1 = r2
            goto L2a
        L29:
            r1 = r3
        L2a:
            if (r1 != 0) goto L40
            r0 = r21
            r1 = r23
            r3 = r25
            r5 = r27
            r7 = r29
            r9 = r31
            r11 = r33
            r13 = r35
            A(r0, r1, r3, r5, r7, r9, r11, r13)
            return
        L40:
            r4 = r0[r3]
            r0[r3] = r23
            r0[r2] = r25
            r1 = 2
            r0[r1] = r27
            r1 = 3
            r0[r1] = r29
            r1 = 4
            r0[r1] = r31
            r6 = 5
            r0[r6] = r33
            C(r0, r4)
            r4 = r35
            if (r4 != r2) goto L5a
            goto L5b
        L5a:
            r3 = r1
        L5b:
            int r1 = 4 - r3
            r8 = r0[r3]
            int r2 = r3 + 1
            r10 = r0[r2]
            int r2 = r3 + 2
            r12 = r0[r2]
            int r2 = r3 + 3
            r14 = r0[r2]
            int r2 = r3 + 4
            r16 = r0[r2]
            int r3 = r3 + r6
            r18 = r0[r3]
            r7 = r21
            r20 = r35
            A(r7, r8, r10, r12, r14, r16, r18, r20)
            r2 = r0[r1]
            int r5 = r1 + 1
            r7 = r0[r5]
            int r5 = r1 + 2
            r9 = r0[r5]
            int r5 = r1 + 3
            r11 = r0[r5]
            int r5 = r1 + 4
            r13 = r0[r5]
            int r1 = r1 + r6
            r5 = r0[r1]
            r22 = r2
            r24 = r7
            r26 = r9
            r28 = r11
            r30 = r13
            r32 = r5
            r34 = r35
            A(r21, r22, r24, r26, r28, r30, r32, r34)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lib.zj.office.java.awt.geom.n.B(java.util.Vector, double[], double, double, double, double, double, double, int):void");
    }

    public static void C(double[] dArr, double d10) {
        double d11 = dArr[4];
        dArr[8] = d11;
        double d12 = dArr[5];
        dArr[9] = d12;
        double d13 = dArr[2];
        double d14 = dArr[3];
        double e10 = androidx.activity.f.e(d11, d13, d10, d13);
        double e11 = androidx.activity.f.e(d12, d14, d10, d14);
        double d15 = dArr[0];
        double d16 = dArr[1];
        double e12 = androidx.activity.f.e(d13, d15, d10, d15);
        double e13 = androidx.activity.f.e(d14, d16, d10, d16);
        double e14 = androidx.activity.f.e(e10, e12, d10, e12);
        double e15 = androidx.activity.f.e(e11, e13, d10, e13);
        dArr[2] = e12;
        dArr[3] = e13;
        dArr[4] = e14;
        dArr[5] = e15;
        dArr[6] = e10;
        dArr[7] = e11;
    }

    public static double z(double d10, double d11, double d12, double d13) {
        double d14 = d11 - d10;
        if (d13 == 0.0d) {
            double d15 = (-d14) / d12;
            if (d15 >= 0.0d && d15 <= 1.0d) {
                return d15;
            }
        } else {
            double d16 = (d12 * d12) - ((4.0d * d13) * d14);
            if (d16 >= 0.0d) {
                double sqrt = Math.sqrt(d16);
                if (d12 < 0.0d) {
                    sqrt = -sqrt;
                }
                double d17 = (sqrt + d12) / (-2.0d);
                double d18 = d17 / d13;
                if (d18 >= 0.0d && d18 <= 1.0d) {
                    return d18;
                }
                if (d17 != 0.0d) {
                    double d19 = d14 / d17;
                    if (d19 >= 0.0d && d19 <= 1.0d) {
                        return d19;
                    }
                }
            }
        }
        if (0.0d < (((d12 + d14) + d13) + d14) / 2.0d) {
            return 0.0d;
        }
        return 1.0d;
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final double a(double d10) {
        if (d10 <= this.c) {
            return 0.0d;
        }
        if (d10 >= this.f20796g) {
            return 1.0d;
        }
        return z(d10, this.f20802m, this.f20803n, this.f20804o);
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final double b(double d10) {
        return (((this.f20801l * d10) + this.f20800k) * d10) + this.f20799j;
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final double c(double d10) {
        if (d10 <= this.c) {
            return this.f20792b;
        }
        if (d10 >= this.f20796g) {
            return this.f20795f;
        }
        return b(a(d10));
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final double d(double d10) {
        return (((this.f20804o * d10) + this.f20803n) * d10) + this.f20802m;
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final String f() {
        return "(" + this.f20793d + ", " + this.f20794e + "), ";
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final void g(Rectangle2D.Double r72) {
        r72.add(this.f20792b, this.c);
        double d10 = (-this.f20800k) / (this.f20801l * 2.0d);
        if (d10 > 0.0d && d10 < 1.0d) {
            r72.add(b(d10), d(d10));
        }
        r72.add(this.f20795f, this.f20796g);
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final int j() {
        return 2;
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final e k() {
        return new n(this.f20792b, this.c, this.f20793d, this.f20794e, this.f20795f, this.f20796g, -this.f20754a);
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final int l(double[] dArr) {
        dArr[0] = this.f20793d;
        dArr[1] = this.f20794e;
        if (this.f20754a == 1) {
            dArr[2] = this.f20795f;
            dArr[3] = this.f20796g;
        } else {
            dArr[2] = this.f20792b;
            dArr[3] = this.c;
        }
        return 2;
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final e m(double d10, double d11, int i10) {
        double z10;
        double z11;
        double d12 = this.c;
        int i11 = (d10 > d12 ? 1 : (d10 == d12 ? 0 : -1));
        double d13 = this.f20796g;
        if (i11 <= 0) {
            if (d11 >= d13) {
                if (this.f20754a == i10) {
                    return this;
                }
                return k();
            }
            z10 = 0.0d;
        } else {
            z10 = z(d10, this.f20802m, this.f20803n, this.f20804o);
        }
        if (d11 >= d13) {
            z11 = 1.0d;
        } else {
            z11 = z(d11, this.f20802m, this.f20803n, this.f20804o);
        }
        int i12 = 0;
        double[] dArr = {this.f20792b, d12, this.f20793d, this.f20794e, this.f20795f, d13};
        if (z11 < 1.0d) {
            C(dArr, z11);
        }
        if (z10 > 0.0d) {
            C(dArr, z10 / z11);
            i12 = 4;
        }
        return new n(dArr[i12 + 0], d10, dArr[i12 + 2], dArr[i12 + 3], dArr[i12 + 4], d11, i10);
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final double n() {
        if (this.f20754a == 1) {
            return this.f20792b;
        }
        return this.f20795f;
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final double o() {
        if (this.f20754a == -1) {
            return this.f20792b;
        }
        return this.f20795f;
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final double p() {
        return this.f20798i;
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final double q() {
        return this.f20797h;
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final double r() {
        return this.f20792b;
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final double s() {
        if (this.f20754a == 1) {
            return this.c;
        }
        return this.f20796g;
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final double t() {
        if (this.f20754a == -1) {
            return this.c;
        }
        return this.f20796g;
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final double u() {
        return this.f20796g;
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final double v() {
        return this.c;
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final double x(double d10, double d11) {
        double d12 = (-this.f20800k) / (this.f20801l * 2.0d);
        if (d12 > d10 && d12 < d11) {
            return d12;
        }
        return d11;
    }
}
