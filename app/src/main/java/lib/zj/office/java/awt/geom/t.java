package lib.zj.office.java.awt.geom;

import java.util.NoSuchElementException;

/* compiled from: RoundRectIterator.java */
/* loaded from: classes3.dex */
public final class t implements p {

    /* renamed from: i  reason: collision with root package name */
    public static final double[][] f20833i;

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f20834j;

    /* renamed from: a  reason: collision with root package name */
    public final double f20835a;

    /* renamed from: b  reason: collision with root package name */
    public final double f20836b;
    public final double c;

    /* renamed from: d  reason: collision with root package name */
    public final double f20837d;

    /* renamed from: e  reason: collision with root package name */
    public final double f20838e;

    /* renamed from: f  reason: collision with root package name */
    public final double f20839f;

    /* renamed from: g  reason: collision with root package name */
    public final AffineTransform f20840g;

    /* renamed from: h  reason: collision with root package name */
    public int f20841h;

    static {
        double cos = 1.0d - Math.cos(0.7853981633974483d);
        double tan = Math.tan(0.7853981633974483d);
        double sqrt = (1.0d - (((cos * 1.3333333333333333d) * tan) / ((Math.sqrt((tan * tan) + 1.0d) - 1.0d) + cos))) / 2.0d;
        double d10 = -sqrt;
        f20833i = new double[][]{new double[]{0.0d, 0.0d, 0.0d, 0.5d}, new double[]{0.0d, 0.0d, 1.0d, -0.5d}, new double[]{0.0d, 0.0d, 1.0d, d10, 0.0d, sqrt, 1.0d, 0.0d, 0.0d, 0.5d, 1.0d, 0.0d}, new double[]{1.0d, -0.5d, 1.0d, 0.0d}, new double[]{1.0d, d10, 1.0d, 0.0d, 1.0d, 0.0d, 1.0d, d10, 1.0d, 0.0d, 1.0d, -0.5d}, new double[]{1.0d, 0.0d, 0.0d, 0.5d}, new double[]{1.0d, 0.0d, 0.0d, sqrt, 1.0d, d10, 0.0d, 0.0d, 1.0d, -0.5d, 0.0d, 0.0d}, new double[]{0.0d, 0.5d, 0.0d, 0.0d}, new double[]{0.0d, sqrt, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, sqrt, 0.0d, 0.0d, 0.0d, 0.5d}, new double[0]};
        f20834j = new int[]{0, 1, 3, 1, 3, 1, 3, 1, 3, 4};
    }

    public t(RoundRectangle2D roundRectangle2D, AffineTransform affineTransform) {
        this.f20835a = roundRectangle2D.getX();
        this.f20836b = roundRectangle2D.getY();
        double width = roundRectangle2D.getWidth();
        this.c = width;
        double height = roundRectangle2D.getHeight();
        this.f20837d = height;
        double min = Math.min(width, Math.abs(roundRectangle2D.getArcWidth()));
        this.f20838e = min;
        double min2 = Math.min(height, Math.abs(roundRectangle2D.getArcHeight()));
        this.f20839f = min2;
        this.f20840g = affineTransform;
        if (min < 0.0d || min2 < 0.0d) {
            this.f20841h = f20833i.length;
        }
    }

    @Override // lib.zj.office.java.awt.geom.p
    public final int a(double[] dArr) {
        if (!isDone()) {
            double[] dArr2 = f20833i[this.f20841h];
            int i10 = 0;
            for (int i11 = 0; i11 < dArr2.length; i11 += 4) {
                int i12 = i10 + 1;
                dArr[i10] = (dArr2[i11 + 1] * this.f20838e) + (dArr2[i11 + 0] * this.c) + this.f20835a;
                i10 = i12 + 1;
                dArr[i12] = (dArr2[i11 + 3] * this.f20839f) + (dArr2[i11 + 2] * this.f20837d) + this.f20836b;
            }
            AffineTransform affineTransform = this.f20840g;
            if (affineTransform != null) {
                affineTransform.transform(dArr, 0, dArr, 0, i10 / 2);
            }
            return f20834j[this.f20841h];
        }
        throw new NoSuchElementException("roundrect iterator out of bounds");
    }

    @Override // lib.zj.office.java.awt.geom.p
    public final int b(float[] fArr) {
        if (!isDone()) {
            double[] dArr = f20833i[this.f20841h];
            int i10 = 0;
            for (int i11 = 0; i11 < dArr.length; i11 += 4) {
                int i12 = i10 + 1;
                fArr[i10] = (float) ((dArr[i11 + 1] * this.f20838e) + (dArr[i11 + 0] * this.c) + this.f20835a);
                i10 = i12 + 1;
                fArr[i12] = (float) ((dArr[i11 + 3] * this.f20839f) + (dArr[i11 + 2] * this.f20837d) + this.f20836b);
            }
            AffineTransform affineTransform = this.f20840g;
            if (affineTransform != null) {
                affineTransform.transform(fArr, 0, fArr, 0, i10 / 2);
            }
            return f20834j[this.f20841h];
        }
        throw new NoSuchElementException("roundrect iterator out of bounds");
    }

    @Override // lib.zj.office.java.awt.geom.p
    public final int c() {
        return 1;
    }

    @Override // lib.zj.office.java.awt.geom.p
    public final boolean isDone() {
        if (this.f20841h >= f20833i.length) {
            return true;
        }
        return false;
    }

    @Override // lib.zj.office.java.awt.geom.p
    public final void next() {
        this.f20841h++;
    }
}
