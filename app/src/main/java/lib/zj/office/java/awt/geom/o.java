package lib.zj.office.java.awt.geom;

import java.util.Vector;
import lib.zj.office.java.awt.geom.Rectangle2D;

/* compiled from: Order3.java */
/* loaded from: classes3.dex */
public final class o extends e {

    /* renamed from: b  reason: collision with root package name */
    public final double f20805b;
    public final double c;

    /* renamed from: d  reason: collision with root package name */
    public final double f20806d;

    /* renamed from: e  reason: collision with root package name */
    public final double f20807e;

    /* renamed from: f  reason: collision with root package name */
    public final double f20808f;

    /* renamed from: g  reason: collision with root package name */
    public final double f20809g;

    /* renamed from: h  reason: collision with root package name */
    public final double f20810h;

    /* renamed from: i  reason: collision with root package name */
    public final double f20811i;

    /* renamed from: j  reason: collision with root package name */
    public final double f20812j;

    /* renamed from: k  reason: collision with root package name */
    public final double f20813k;

    /* renamed from: l  reason: collision with root package name */
    public final double f20814l;

    /* renamed from: m  reason: collision with root package name */
    public final double f20815m;

    /* renamed from: n  reason: collision with root package name */
    public final double f20816n;

    /* renamed from: o  reason: collision with root package name */
    public final double f20817o;

    /* renamed from: p  reason: collision with root package name */
    public final double f20818p;

    /* renamed from: q  reason: collision with root package name */
    public final double f20819q;

    /* renamed from: r  reason: collision with root package name */
    public final double f20820r;

    /* renamed from: s  reason: collision with root package name */
    public final double f20821s;

    /* renamed from: t  reason: collision with root package name */
    public double f20822t;

    /* renamed from: u  reason: collision with root package name */
    public double f20823u;

    /* renamed from: v  reason: collision with root package name */
    public double f20824v;

    /* renamed from: w  reason: collision with root package name */
    public double f20825w;

    /* renamed from: x  reason: collision with root package name */
    public double f20826x;

    /* renamed from: y  reason: collision with root package name */
    public double f20827y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, int i10) {
        super(i10);
        double d18;
        double d19 = d17;
        if (d13 < d11) {
            d18 = d11;
        } else {
            d18 = d13;
        }
        d19 = d15 <= d19 ? d15 : d19;
        this.f20805b = d10;
        this.c = d11;
        this.f20806d = d12;
        this.f20807e = d18;
        this.f20808f = d14;
        this.f20809g = d19;
        this.f20810h = d16;
        this.f20811i = d17;
        double d20 = d18;
        this.f20812j = Math.min(Math.min(d10, d16), Math.min(d12, d14));
        this.f20813k = Math.max(Math.max(d10, d16), Math.max(d12, d14));
        this.f20814l = d10;
        this.f20815m = (d12 - d10) * 3.0d;
        double d21 = d14 - d12;
        this.f20816n = ((d21 - d12) + d10) * 3.0d;
        this.f20817o = (d16 - (d21 * 3.0d)) - d10;
        this.f20818p = d11;
        this.f20819q = (d20 - d11) * 3.0d;
        double d22 = d19 - d20;
        this.f20820r = ((d22 - d20) + d11) * 3.0d;
        this.f20821s = (d17 - (d22 * 3.0d)) - d11;
        this.f20827y = d11;
        this.f20825w = d11;
        this.f20823u = d11;
    }

    public static void A(Vector vector, double[] dArr, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, int i10) {
        int i11;
        double[] dArr2 = dArr;
        if (d11 > d13 || d13 > d15 || d15 > d17) {
            double d18 = d15 - d13;
            double d19 = d13 - d11;
            dArr2[0] = d19;
            dArr2[1] = (d18 - d19) * 2.0d;
            dArr2[2] = (((d17 - d15) - d18) - d18) + d19;
            int a10 = q.a(dArr2, dArr2);
            i11 = 0;
            for (int i12 = 0; i12 < a10; i12++) {
                double d20 = dArr2[i12];
                if (d20 > 0.0d && d20 < 1.0d) {
                    if (i11 < i12) {
                        dArr2[i11] = d20;
                    }
                    i11++;
                }
            }
        } else {
            i11 = 0;
        }
        if (i11 == 0) {
            z(vector, d10, d11, d12, d13, d14, d15, d16, d17, i10);
            return;
        }
        dArr2[3] = d10;
        dArr2[4] = d11;
        dArr2[5] = d12;
        dArr2[6] = d13;
        dArr2[7] = d14;
        dArr2[8] = d15;
        dArr2[9] = d16;
        dArr2[10] = d17;
        double d21 = dArr2[0];
        if (i11 > 1) {
            double d22 = dArr2[1];
            if (d21 > d22) {
                dArr2[0] = d22;
                dArr2[1] = d21;
                d21 = d22;
            }
        }
        C(dArr2, 3, d21);
        if (i11 > 1) {
            C(dArr2, 9, (dArr2[1] - d21) / (1.0d - d21));
        }
        int i13 = i10;
        int i14 = i13 == -1 ? 3 + (i11 * 6) : 3;
        int i15 = i11;
        while (i15 >= 0) {
            int i16 = i14 + 6;
            int i17 = i13;
            z(vector, dArr2[i14 + 0], dArr2[i14 + 1], dArr2[i14 + 2], dArr2[i14 + 3], dArr2[i14 + 4], dArr2[i14 + 5], dArr2[i16], dArr2[i14 + 7], i10);
            i15--;
            i14 = i17 == 1 ? i16 : i14 - 6;
            i13 = i17;
            dArr2 = dArr;
        }
    }

    public static void C(double[] dArr, int i10, double d10) {
        int i11 = i10 + 6;
        double d11 = dArr[i11];
        dArr[i10 + 12] = d11;
        int i12 = i10 + 7;
        double d12 = dArr[i12];
        dArr[i10 + 13] = d12;
        int i13 = i10 + 4;
        double d13 = dArr[i13];
        int i14 = i10 + 5;
        double d14 = dArr[i14];
        double e10 = androidx.activity.f.e(d11, d13, d10, d13);
        double e11 = androidx.activity.f.e(d12, d14, d10, d14);
        double d15 = dArr[i10 + 0];
        double d16 = dArr[i10 + 1];
        int i15 = i10 + 2;
        double d17 = dArr[i15];
        int i16 = i10 + 3;
        double d18 = dArr[i16];
        double e12 = androidx.activity.f.e(d17, d15, d10, d15);
        double e13 = androidx.activity.f.e(d18, d16, d10, d16);
        double e14 = androidx.activity.f.e(d13, d17, d10, d17);
        double e15 = androidx.activity.f.e(d14, d18, d10, d18);
        double e16 = androidx.activity.f.e(e10, e14, d10, e14);
        double e17 = androidx.activity.f.e(e11, e15, d10, e15);
        double e18 = androidx.activity.f.e(e14, e12, d10, e12);
        double e19 = androidx.activity.f.e(e15, e13, d10, e13);
        dArr[i15] = e12;
        dArr[i16] = e13;
        dArr[i13] = e18;
        dArr[i14] = e19;
        dArr[i11] = androidx.activity.f.e(e16, e18, d10, e18);
        dArr[i12] = androidx.activity.f.e(e17, e19, d10, e19);
        dArr[i10 + 8] = e16;
        dArr[i10 + 9] = e17;
        dArr[i10 + 10] = e10;
        dArr[i10 + 11] = e11;
    }

    public static void z(Vector vector, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, int i10) {
        if (d11 > d17) {
            vector.add(new o(d16, d17, d14, d15, d12, d13, d10, d11, -i10));
        } else if (d17 > d11) {
            vector.add(new o(d10, d11, d12, d13, d14, d15, d16, d17, i10));
        }
    }

    public final double B(double d10, double d11) {
        double d12;
        double d13;
        double d14 = d11;
        if (d14 >= -0.1d && d14 <= 1.1d) {
            double d15 = d(d14);
            if (d15 < d10) {
                d13 = d14;
                d12 = 1.0d;
            } else {
                d12 = d14;
                d13 = 0.0d;
            }
            boolean z10 = true;
            while (d15 != d10) {
                if (!z10) {
                    double d16 = (d13 + d12) / 2.0d;
                    if (d16 == d13 || d16 == d12) {
                        break;
                    }
                    d14 = d16;
                } else {
                    double d17 = (((this.f20820r * 2.0d) + (this.f20821s * 3.0d * d14)) * d14) + this.f20819q;
                    if (d17 != 0.0d) {
                        double d18 = ((d10 - d15) / d17) + d14;
                        if (d18 != d14 && d18 > d13 && d18 < d12) {
                            d14 = d18;
                        }
                    }
                    z10 = false;
                }
                d15 = d(d14);
                if (d15 < d10) {
                    d13 = d14;
                } else if (d15 <= d10) {
                    break;
                } else {
                    d12 = d14;
                }
            }
            if (d14 > 1.0d) {
                return -1.0d;
            }
            return d14;
        }
        return -1.0d;
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final double a(double d10) {
        boolean z10;
        double d11;
        double B;
        double d12;
        if (d10 <= this.c) {
            return 0.0d;
        }
        double d13 = 1.0d;
        if (d10 >= this.f20811i) {
            return 1.0d;
        }
        if (d10 == this.f20823u) {
            return this.f20822t;
        }
        if (d10 == this.f20825w) {
            return this.f20824v;
        }
        if (d10 == this.f20827y) {
            return this.f20826x;
        }
        double d14 = this.f20821s;
        if (d14 == 0.0d) {
            return n.z(d10, this.f20818p, this.f20819q, this.f20820r);
        }
        double d15 = this.f20820r / d14;
        double d16 = this.f20819q / d14;
        double d17 = (this.f20818p - d10) / d14;
        double d18 = ((d15 * d15) - (d16 * 3.0d)) / 9.0d;
        double d19 = ((d17 * 27.0d) + ((((d15 * 2.0d) * d15) * d15) - ((9.0d * d15) * d16))) / 54.0d;
        double d20 = d19 * d19;
        double d21 = d18 * d18 * d18;
        double d22 = d15 / 3.0d;
        if (d20 < d21) {
            double acos = Math.acos(d19 / Math.sqrt(d21));
            double sqrt = Math.sqrt(d18) * (-2.0d);
            B = B(d10, (Math.cos(acos / 3.0d) * sqrt) - d22);
            if (B < 0.0d) {
                B = B(d10, (Math.cos((acos + 6.283185307179586d) / 3.0d) * sqrt) - d22);
            }
            if (B < 0.0d) {
                B = B(d10, (Math.cos((acos - 6.283185307179586d) / 3.0d) * sqrt) - d22);
            }
        } else {
            if (d19 < 0.0d) {
                z10 = true;
            } else {
                z10 = false;
            }
            double sqrt2 = Math.sqrt(d20 - d21);
            if (z10) {
                d19 = -d19;
            }
            double pow = Math.pow(d19 + sqrt2, 0.3333333333333333d);
            if (!z10) {
                pow = -pow;
            }
            if (pow == 0.0d) {
                d11 = 0.0d;
            } else {
                d11 = d18 / pow;
            }
            B = B(d10, (pow + d11) - d22);
        }
        if (B < 0.0d) {
            double d23 = 0.0d;
            while (true) {
                d12 = (d23 + d13) / 2.0d;
                if (d12 != d23 && d12 != d13) {
                    double d24 = d(d12);
                    if (d24 < d10) {
                        d23 = d12;
                    } else if (d24 <= d10) {
                        break;
                    } else {
                        d13 = d12;
                    }
                } else {
                    break;
                }
            }
            B = d12;
        }
        if (B >= 0.0d) {
            this.f20826x = this.f20824v;
            this.f20827y = this.f20825w;
            this.f20824v = this.f20822t;
            this.f20825w = this.f20823u;
            this.f20822t = B;
            this.f20823u = d10;
        }
        return B;
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final double b(double d10) {
        return (((((this.f20817o * d10) + this.f20816n) * d10) + this.f20815m) * d10) + this.f20814l;
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final double c(double d10) {
        if (d10 <= this.c) {
            return this.f20805b;
        }
        if (d10 >= this.f20811i) {
            return this.f20810h;
        }
        return b(a(d10));
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final double d(double d10) {
        return (((((this.f20821s * d10) + this.f20820r) * d10) + this.f20819q) * d10) + this.f20818p;
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final String f() {
        double d10;
        double d11;
        StringBuilder sb2 = new StringBuilder("(");
        double d12 = this.f20806d;
        double d13 = this.f20808f;
        int i10 = this.f20754a;
        if (i10 == 1) {
            d10 = d12;
        } else {
            d10 = d13;
        }
        sb2.append(d10);
        sb2.append(", ");
        double d14 = this.f20807e;
        double d15 = this.f20809g;
        if (i10 == 1) {
            d11 = d14;
        } else {
            d11 = d15;
        }
        sb2.append(d11);
        sb2.append("), (");
        if (i10 != -1) {
            d12 = d13;
        }
        sb2.append(d12);
        sb2.append(", ");
        if (i10 != -1) {
            d14 = d15;
        }
        sb2.append(d14);
        sb2.append("), ");
        return sb2.toString();
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final void g(Rectangle2D.Double r82) {
        r82.add(this.f20805b, this.c);
        double[] dArr = {this.f20815m, this.f20816n * 2.0d, this.f20817o * 3.0d};
        int a10 = q.a(dArr, dArr);
        for (int i10 = 0; i10 < a10; i10++) {
            double d10 = dArr[i10];
            if (d10 > 0.0d && d10 < 1.0d) {
                r82.add(b(d10), d(d10));
            }
        }
        r82.add(this.f20810h, this.f20811i);
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final int j() {
        return 3;
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final e k() {
        return new o(this.f20805b, this.c, this.f20806d, this.f20807e, this.f20808f, this.f20809g, this.f20810h, this.f20811i, -this.f20754a);
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final int l(double[] dArr) {
        double d10 = this.f20807e;
        double d11 = this.f20806d;
        double d12 = this.f20809g;
        double d13 = this.f20808f;
        if (this.f20754a == 1) {
            dArr[0] = d11;
            dArr[1] = d10;
            dArr[2] = d13;
            dArr[3] = d12;
            dArr[4] = this.f20810h;
            dArr[5] = this.f20811i;
        } else {
            dArr[0] = d13;
            dArr[1] = d12;
            dArr[2] = d11;
            dArr[3] = d10;
            dArr[4] = this.f20805b;
            dArr[5] = this.c;
        }
        return 3;
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final e m(double d10, double d11, int i10) {
        int i11;
        double d12 = this.c;
        int i12 = (d10 > d12 ? 1 : (d10 == d12 ? 0 : -1));
        double d13 = this.f20811i;
        if (i12 <= 0 && d11 >= d13) {
            if (this.f20754a == i10) {
                return this;
            }
            return k();
        }
        double a10 = a(d10);
        double a11 = a(d11);
        double[] dArr = {this.f20805b, d12, this.f20806d, this.f20807e, this.f20808f, this.f20809g, this.f20810h, d13};
        if (a10 <= a11) {
            a10 = a11;
            a11 = a10;
        }
        if (a10 < 1.0d) {
            C(dArr, 0, a10);
        }
        if (a11 <= 0.0d) {
            i11 = 0;
        } else {
            C(dArr, 0, a11 / a10);
            i11 = 6;
        }
        return new o(dArr[i11 + 0], d10, dArr[i11 + 2], dArr[i11 + 3], dArr[i11 + 4], dArr[i11 + 5], dArr[i11 + 6], d11, i10);
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final double n() {
        if (this.f20754a == 1) {
            return this.f20805b;
        }
        return this.f20810h;
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final double o() {
        if (this.f20754a == -1) {
            return this.f20805b;
        }
        return this.f20810h;
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final double p() {
        return this.f20813k;
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final double q() {
        return this.f20812j;
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final double r() {
        return this.f20805b;
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final double s() {
        if (this.f20754a == 1) {
            return this.c;
        }
        return this.f20811i;
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final double t() {
        if (this.f20754a == -1) {
            return this.c;
        }
        return this.f20811i;
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final double u() {
        return this.f20811i;
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final double v() {
        return this.c;
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final double x(double d10, double d11) {
        double[] dArr = {this.f20815m, this.f20816n * 2.0d, this.f20817o * 3.0d};
        int a10 = q.a(dArr, dArr);
        for (int i10 = 0; i10 < a10; i10++) {
            double d12 = dArr[i10];
            if (d12 > d10 && d12 < d11) {
                d11 = d12;
            }
        }
        return d11;
    }
}
