package lib.zj.office.java.awt.geom;

import lib.zj.office.java.awt.geom.Rectangle2D;

/* compiled from: Order1.java */
/* loaded from: classes3.dex */
public final class m extends e {

    /* renamed from: b  reason: collision with root package name */
    public final double f20787b;
    public final double c;

    /* renamed from: d  reason: collision with root package name */
    public final double f20788d;

    /* renamed from: e  reason: collision with root package name */
    public final double f20789e;

    /* renamed from: f  reason: collision with root package name */
    public final double f20790f;

    /* renamed from: g  reason: collision with root package name */
    public final double f20791g;

    public m(double d10, double d11, double d12, double d13, int i10) {
        super(i10);
        this.f20787b = d10;
        this.c = d11;
        this.f20788d = d12;
        this.f20789e = d13;
        if (d10 < d12) {
            this.f20790f = d10;
            this.f20791g = d12;
            return;
        }
        this.f20790f = d12;
        this.f20791g = d10;
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final double a(double d10) {
        double d11 = this.c;
        if (d10 <= d11) {
            return 0.0d;
        }
        double d12 = this.f20789e;
        if (d10 >= d12) {
            return 1.0d;
        }
        return (d10 - d11) / (d12 - d11);
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final double b(double d10) {
        double d11 = this.f20788d;
        double d12 = this.f20787b;
        return androidx.activity.f.e(d11, d12, d10, d12);
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final double c(double d10) {
        double d11 = this.f20787b;
        double d12 = this.f20788d;
        if (d11 != d12) {
            double d13 = this.c;
            if (d10 > d13) {
                double d14 = this.f20789e;
                if (d10 >= d14) {
                    return d12;
                }
                return (((d12 - d11) * (d10 - d13)) / (d14 - d13)) + d11;
            }
        }
        return d11;
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final double d(double d10) {
        double d11 = this.f20789e;
        double d12 = this.c;
        return androidx.activity.f.e(d11, d12, d10, d12);
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final int e(e eVar, double[] dArr) {
        double max;
        if (!(eVar instanceof m)) {
            return super.e(eVar, dArr);
        }
        m mVar = (m) eVar;
        double d10 = dArr[1];
        if (d10 > dArr[0]) {
            double d11 = this.f20789e;
            double min = Math.min(Math.min(d10, d11), mVar.f20789e);
            dArr[1] = min;
            double d12 = dArr[0];
            if (min > d12) {
                int i10 = (this.f20791g > mVar.f20790f ? 1 : (this.f20791g == mVar.f20790f ? 0 : -1));
                double d13 = this.f20790f;
                double d14 = mVar.f20791g;
                if (i10 <= 0) {
                    if (d13 == d14) {
                        return 0;
                    }
                    return -1;
                } else if (d13 >= d14) {
                    return 1;
                } else {
                    double d15 = this.f20788d;
                    double d16 = this.f20787b;
                    double d17 = d15 - d16;
                    double d18 = this.c;
                    double d19 = d11 - d18;
                    double d20 = mVar.f20788d;
                    double d21 = mVar.f20787b;
                    double d22 = d20 - d21;
                    double d23 = mVar.f20789e;
                    double d24 = mVar.c;
                    double d25 = d23 - d24;
                    double d26 = (d22 * d19) - (d17 * d25);
                    if (d26 != 0.0d) {
                        double d27 = (((d22 * d24) * d19) + ((((d16 - d21) * d19) * d25) - ((d17 * d18) * d25))) / d26;
                        if (d27 <= d12) {
                            max = Math.min(d11, d23);
                        } else {
                            if (d27 < min) {
                                dArr[1] = d27;
                            }
                            max = Math.max(d18, d24);
                        }
                    } else {
                        max = Math.max(d18, d24);
                    }
                    double c = c(max);
                    double c10 = mVar.c(max);
                    if (c < c10) {
                        return -1;
                    }
                    if (c > c10) {
                        return 1;
                    }
                    return 0;
                }
            }
            throw new InternalError("backstepping from " + dArr[0] + " to " + dArr[1]);
        }
        throw new InternalError("yrange already screwed up...");
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final void g(Rectangle2D.Double r52) {
        r52.add(this.f20787b, this.c);
        r52.add(this.f20788d, this.f20789e);
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final int j() {
        return 1;
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final e k() {
        return new m(this.f20787b, this.c, this.f20788d, this.f20789e, -this.f20754a);
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final int l(double[] dArr) {
        if (this.f20754a == 1) {
            dArr[0] = this.f20788d;
            dArr[1] = this.f20789e;
        } else {
            dArr[0] = this.f20787b;
            dArr[1] = this.c;
        }
        return 1;
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final e m(double d10, double d11, int i10) {
        double d12 = this.c;
        int i11 = (d10 > d12 ? 1 : (d10 == d12 ? 0 : -1));
        double d13 = this.f20789e;
        if (i11 == 0 && d11 == d13) {
            if (this.f20754a == i10) {
                return this;
            }
            return k();
        }
        double d14 = this.f20787b;
        double d15 = this.f20788d;
        if (d14 == d15) {
            return new m(d14, d10, d15, d11, i10);
        }
        double d16 = d14 - d15;
        double d17 = d12 - d13;
        return new m((((d10 - d12) * d16) / d17) + d14, d10, d14 + (((d11 - d12) * d16) / d17), d11, i10);
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final double n() {
        if (this.f20754a == 1) {
            return this.f20787b;
        }
        return this.f20788d;
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final double o() {
        if (this.f20754a == -1) {
            return this.f20787b;
        }
        return this.f20788d;
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final double p() {
        return this.f20791g;
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final double q() {
        return this.f20790f;
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final double r() {
        return this.f20787b;
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final double s() {
        if (this.f20754a == 1) {
            return this.c;
        }
        return this.f20789e;
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final double t() {
        if (this.f20754a == -1) {
            return this.c;
        }
        return this.f20789e;
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final double u() {
        return this.f20789e;
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final double v() {
        return this.c;
    }

    @Override // lib.zj.office.java.awt.geom.e
    public final double x(double d10, double d11) {
        return d11;
    }
}
