package lib.zj.office.java.awt.geom;

import java.util.NoSuchElementException;

/* compiled from: EllipseIterator.java */
/* loaded from: classes3.dex */
public final class i implements p {

    /* renamed from: g  reason: collision with root package name */
    public static final double[][] f20766g = {new double[]{1.0d, 0.7761423749153966d, 0.7761423749153966d, 1.0d, 0.5d, 1.0d}, new double[]{0.22385762508460333d, 1.0d, 0.0d, 0.7761423749153966d, 0.0d, 0.5d}, new double[]{0.0d, 0.22385762508460333d, 0.22385762508460333d, 0.0d, 0.5d, 0.0d}, new double[]{0.7761423749153966d, 0.0d, 1.0d, 0.22385762508460333d, 1.0d, 0.5d}};

    /* renamed from: a  reason: collision with root package name */
    public final double f20767a;

    /* renamed from: b  reason: collision with root package name */
    public final double f20768b;
    public final double c;

    /* renamed from: d  reason: collision with root package name */
    public final double f20769d;

    /* renamed from: e  reason: collision with root package name */
    public final AffineTransform f20770e;

    /* renamed from: f  reason: collision with root package name */
    public int f20771f;

    public i(Ellipse2D ellipse2D, AffineTransform affineTransform) {
        this.f20767a = ellipse2D.getX();
        this.f20768b = ellipse2D.getY();
        double width = ellipse2D.getWidth();
        this.c = width;
        double height = ellipse2D.getHeight();
        this.f20769d = height;
        this.f20770e = affineTransform;
        if (width < 0.0d || height < 0.0d) {
            this.f20771f = 6;
        }
    }

    @Override // lib.zj.office.java.awt.geom.p
    public final int a(double[] dArr) {
        if (!isDone()) {
            int i10 = this.f20771f;
            if (i10 == 5) {
                return 4;
            }
            double d10 = this.f20769d;
            double d11 = this.f20768b;
            double d12 = this.c;
            double d13 = this.f20767a;
            double[][] dArr2 = f20766g;
            if (i10 == 0) {
                double[] dArr3 = dArr2[3];
                dArr[0] = (dArr3[4] * d12) + d13;
                dArr[1] = (dArr3[5] * d10) + d11;
                AffineTransform affineTransform = this.f20770e;
                if (affineTransform != null) {
                    affineTransform.transform(dArr, 0, dArr, 0, 1);
                }
                return 0;
            }
            double[] dArr4 = dArr2[i10 - 1];
            dArr[0] = (dArr4[0] * d12) + d13;
            dArr[1] = (dArr4[1] * d10) + d11;
            dArr[2] = (dArr4[2] * d12) + d13;
            dArr[3] = (dArr4[3] * d10) + d11;
            dArr[4] = (dArr4[4] * d12) + d13;
            dArr[5] = (dArr4[5] * d10) + d11;
            AffineTransform affineTransform2 = this.f20770e;
            if (affineTransform2 != null) {
                affineTransform2.transform(dArr, 0, dArr, 0, 3);
            }
            return 3;
        }
        throw new NoSuchElementException("ellipse iterator out of bounds");
    }

    @Override // lib.zj.office.java.awt.geom.p
    public final int b(float[] fArr) {
        if (!isDone()) {
            int i10 = this.f20771f;
            if (i10 == 5) {
                return 4;
            }
            double[][] dArr = f20766g;
            AffineTransform affineTransform = this.f20770e;
            double d10 = this.f20769d;
            double d11 = this.f20768b;
            double d12 = this.c;
            double d13 = this.f20767a;
            if (i10 == 0) {
                double[] dArr2 = dArr[3];
                fArr[0] = (float) ((dArr2[4] * d12) + d13);
                fArr[1] = (float) ((dArr2[5] * d10) + d11);
                if (affineTransform != null) {
                    affineTransform.transform(fArr, 0, fArr, 0, 1);
                }
                return 0;
            }
            double[] dArr3 = dArr[i10 - 1];
            fArr[0] = (float) ((dArr3[0] * d12) + d13);
            fArr[1] = (float) ((dArr3[1] * d10) + d11);
            fArr[2] = (float) ((dArr3[2] * d12) + d13);
            fArr[3] = (float) ((dArr3[3] * d10) + d11);
            fArr[4] = (float) ((dArr3[4] * d12) + d13);
            fArr[5] = (float) ((dArr3[5] * d10) + d11);
            if (affineTransform != null) {
                affineTransform.transform(fArr, 0, fArr, 0, 3);
            }
            return 3;
        }
        throw new NoSuchElementException("ellipse iterator out of bounds");
    }

    @Override // lib.zj.office.java.awt.geom.p
    public final int c() {
        return 1;
    }

    @Override // lib.zj.office.java.awt.geom.p
    public final boolean isDone() {
        if (this.f20771f > 5) {
            return true;
        }
        return false;
    }

    @Override // lib.zj.office.java.awt.geom.p
    public final void next() {
        this.f20771f++;
    }
}
