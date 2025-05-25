package lib.zj.office.java.awt.geom;

import java.util.NoSuchElementException;

/* compiled from: RectIterator.java */
/* loaded from: classes3.dex */
public final class r implements p {

    /* renamed from: a  reason: collision with root package name */
    public final double f20828a;

    /* renamed from: b  reason: collision with root package name */
    public final double f20829b;
    public final double c;

    /* renamed from: d  reason: collision with root package name */
    public final double f20830d;

    /* renamed from: e  reason: collision with root package name */
    public final AffineTransform f20831e;

    /* renamed from: f  reason: collision with root package name */
    public int f20832f;

    public r(Rectangle2D rectangle2D, AffineTransform affineTransform) {
        this.f20828a = rectangle2D.getX();
        this.f20829b = rectangle2D.getY();
        double width = rectangle2D.getWidth();
        this.c = width;
        double height = rectangle2D.getHeight();
        this.f20830d = height;
        this.f20831e = affineTransform;
        if (width < 0.0d || height < 0.0d) {
            this.f20832f = 6;
        }
    }

    @Override // lib.zj.office.java.awt.geom.p
    public final int a(double[] dArr) {
        if (!isDone()) {
            int i10 = this.f20832f;
            if (i10 == 5) {
                return 4;
            }
            double d10 = this.f20828a;
            dArr[0] = d10;
            double d11 = this.f20829b;
            dArr[1] = d11;
            if (i10 == 1 || i10 == 2) {
                dArr[0] = d10 + this.c;
            }
            if (i10 == 2 || i10 == 3) {
                dArr[1] = d11 + this.f20830d;
            }
            AffineTransform affineTransform = this.f20831e;
            if (affineTransform != null) {
                affineTransform.transform(dArr, 0, dArr, 0, 1);
            }
            if (this.f20832f == 0) {
                return 0;
            }
            return 1;
        }
        throw new NoSuchElementException("rect iterator out of bounds");
    }

    @Override // lib.zj.office.java.awt.geom.p
    public final int b(float[] fArr) {
        if (!isDone()) {
            int i10 = this.f20832f;
            if (i10 == 5) {
                return 4;
            }
            float f10 = (float) this.f20828a;
            fArr[0] = f10;
            float f11 = (float) this.f20829b;
            fArr[1] = f11;
            if (i10 == 1 || i10 == 2) {
                fArr[0] = f10 + ((float) this.c);
            }
            if (i10 == 2 || i10 == 3) {
                fArr[1] = f11 + ((float) this.f20830d);
            }
            AffineTransform affineTransform = this.f20831e;
            if (affineTransform != null) {
                affineTransform.transform(fArr, 0, fArr, 0, 1);
            }
            if (this.f20832f == 0) {
                return 0;
            }
            return 1;
        }
        throw new NoSuchElementException("rect iterator out of bounds");
    }

    @Override // lib.zj.office.java.awt.geom.p
    public final int c() {
        return 1;
    }

    @Override // lib.zj.office.java.awt.geom.p
    public final boolean isDone() {
        if (this.f20832f > 5) {
            return true;
        }
        return false;
    }

    @Override // lib.zj.office.java.awt.geom.p
    public final void next() {
        this.f20832f++;
    }
}
