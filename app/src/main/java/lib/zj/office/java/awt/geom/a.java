package lib.zj.office.java.awt.geom;

import java.util.NoSuchElementException;

/* compiled from: ArcIterator.java */
/* loaded from: classes3.dex */
public final class a implements p {

    /* renamed from: a  reason: collision with root package name */
    public final double f20732a;

    /* renamed from: b  reason: collision with root package name */
    public final double f20733b;
    public final double c;

    /* renamed from: d  reason: collision with root package name */
    public final double f20734d;

    /* renamed from: e  reason: collision with root package name */
    public final double f20735e;

    /* renamed from: f  reason: collision with root package name */
    public final double f20736f;

    /* renamed from: g  reason: collision with root package name */
    public final double f20737g;

    /* renamed from: h  reason: collision with root package name */
    public final AffineTransform f20738h;

    /* renamed from: i  reason: collision with root package name */
    public int f20739i;

    /* renamed from: j  reason: collision with root package name */
    public final int f20740j;

    /* renamed from: k  reason: collision with root package name */
    public final int f20741k;

    public a(Arc2D arc2D, AffineTransform affineTransform) {
        double width = arc2D.getWidth() / 2.0d;
        this.c = width;
        double height = arc2D.getHeight() / 2.0d;
        this.f20734d = height;
        this.f20732a = arc2D.getX() + width;
        this.f20733b = arc2D.getY() + height;
        this.f20735e = -Math.toRadians(arc2D.getAngleStart());
        this.f20738h = affineTransform;
        double d10 = -arc2D.getAngleExtent();
        if (d10 < 360.0d && d10 > -360.0d) {
            int ceil = (int) Math.ceil(Math.abs(d10) / 90.0d);
            this.f20740j = ceil;
            double radians = Math.toRadians(d10 / ceil);
            this.f20736f = radians;
            double d11 = radians / 2.0d;
            double sin = (Math.sin(d11) * 1.3333333333333333d) / (Math.cos(d11) + 1.0d);
            this.f20737g = sin;
            if (sin == 0.0d) {
                this.f20740j = 0;
            }
        } else {
            this.f20740j = 4;
            this.f20736f = 1.5707963267948966d;
            this.f20737g = 0.5522847498307933d;
            if (d10 < 0.0d) {
                this.f20736f = -1.5707963267948966d;
                this.f20737g = -0.5522847498307933d;
            }
        }
        int arcType = arc2D.getArcType();
        if (arcType != 0) {
            if (arcType != 1) {
                if (arcType == 2) {
                    this.f20741k = 2;
                }
            } else {
                this.f20741k = 1;
            }
        } else {
            this.f20741k = 0;
        }
        if (width < 0.0d || height < 0.0d) {
            this.f20741k = -1;
            this.f20740j = -1;
        }
    }

    @Override // lib.zj.office.java.awt.geom.p
    public final int a(double[] dArr) {
        if (!isDone()) {
            int i10 = this.f20739i;
            double d10 = this.f20734d;
            double d11 = this.c;
            double d12 = this.f20733b;
            double d13 = this.f20732a;
            double d14 = this.f20735e;
            if (i10 == 0) {
                dArr[0] = (Math.cos(d14) * d11) + d13;
                dArr[1] = (Math.sin(d14) * d10) + d12;
                AffineTransform affineTransform = this.f20738h;
                if (affineTransform != null) {
                    affineTransform.transform(dArr, 0, dArr, 0, 1);
                }
                return 0;
            }
            int i11 = this.f20740j;
            if (i10 > i11) {
                if (i10 == i11 + this.f20741k) {
                    return 4;
                }
                dArr[0] = d13;
                dArr[1] = d12;
                AffineTransform affineTransform2 = this.f20738h;
                if (affineTransform2 != null) {
                    affineTransform2.transform(dArr, 0, dArr, 0, 1);
                }
                return 1;
            }
            double d15 = this.f20736f;
            double d16 = ((i10 - 1) * d15) + d14;
            double cos = Math.cos(d16);
            double sin = Math.sin(d16);
            double d17 = this.f20737g;
            dArr[0] = ((cos - (d17 * sin)) * d11) + d13;
            dArr[1] = (((cos * d17) + sin) * d10) + d12;
            double d18 = d16 + d15;
            double cos2 = Math.cos(d18);
            double sin2 = Math.sin(d18);
            dArr[2] = (((d17 * sin2) + cos2) * d11) + d13;
            dArr[3] = ((sin2 - (d17 * cos2)) * d10) + d12;
            dArr[4] = (cos2 * d11) + d13;
            dArr[5] = (sin2 * d10) + d12;
            AffineTransform affineTransform3 = this.f20738h;
            if (affineTransform3 != null) {
                affineTransform3.transform(dArr, 0, dArr, 0, 3);
            }
            return 3;
        }
        throw new NoSuchElementException("arc iterator out of bounds");
    }

    @Override // lib.zj.office.java.awt.geom.p
    public final int b(float[] fArr) {
        if (!isDone()) {
            int i10 = this.f20739i;
            AffineTransform affineTransform = this.f20738h;
            double d10 = this.f20734d;
            double d11 = this.c;
            double d12 = this.f20733b;
            double d13 = this.f20732a;
            double d14 = this.f20735e;
            if (i10 == 0) {
                fArr[0] = (float) ((Math.cos(d14) * d11) + d13);
                fArr[1] = (float) android.support.v4.media.session.h.a(d14, d10, d12);
                if (affineTransform != null) {
                    affineTransform.transform(fArr, 0, fArr, 0, 1);
                }
                return 0;
            }
            int i11 = this.f20740j;
            if (i10 > i11) {
                if (i10 == i11 + this.f20741k) {
                    return 4;
                }
                fArr[0] = (float) d13;
                fArr[1] = (float) d12;
                if (affineTransform != null) {
                    affineTransform.transform(fArr, 0, fArr, 0, 1);
                    return 1;
                }
                return 1;
            }
            double d15 = this.f20736f;
            double d16 = ((i10 - 1) * d15) + d14;
            double cos = Math.cos(d16);
            double sin = Math.sin(d16);
            double d17 = this.f20737g;
            fArr[0] = (float) (((cos - (d17 * sin)) * d11) + d13);
            fArr[1] = (float) ((((cos * d17) + sin) * d10) + d12);
            double d18 = d16 + d15;
            double cos2 = Math.cos(d18);
            double sin2 = Math.sin(d18);
            fArr[2] = (float) ((((d17 * sin2) + cos2) * d11) + d13);
            fArr[3] = (float) (((sin2 - (d17 * cos2)) * d10) + d12);
            fArr[4] = (float) ((cos2 * d11) + d13);
            fArr[5] = (float) ((sin2 * d10) + d12);
            if (affineTransform != null) {
                affineTransform.transform(fArr, 0, fArr, 0, 3);
            }
            return 3;
        }
        throw new NoSuchElementException("arc iterator out of bounds");
    }

    @Override // lib.zj.office.java.awt.geom.p
    public final int c() {
        return 1;
    }

    @Override // lib.zj.office.java.awt.geom.p
    public final boolean isDone() {
        if (this.f20739i > this.f20740j + this.f20741k) {
            return true;
        }
        return false;
    }

    @Override // lib.zj.office.java.awt.geom.p
    public final void next() {
        this.f20739i++;
    }
}
