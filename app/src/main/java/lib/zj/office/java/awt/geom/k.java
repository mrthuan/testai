package lib.zj.office.java.awt.geom;

import java.util.NoSuchElementException;

/* compiled from: LineIterator.java */
/* loaded from: classes3.dex */
public final class k implements p {

    /* renamed from: a  reason: collision with root package name */
    public final Line2D f20784a;

    /* renamed from: b  reason: collision with root package name */
    public final AffineTransform f20785b;
    public int c;

    public k(Line2D line2D, AffineTransform affineTransform) {
        this.f20784a = line2D;
        this.f20785b = affineTransform;
    }

    @Override // lib.zj.office.java.awt.geom.p
    public final int a(double[] dArr) {
        if (!isDone()) {
            int i10 = this.c;
            int i11 = 1;
            Line2D line2D = this.f20784a;
            if (i10 == 0) {
                dArr[0] = line2D.getX1();
                dArr[1] = line2D.getY1();
                i11 = 0;
            } else {
                dArr[0] = line2D.getX2();
                dArr[1] = line2D.getY2();
            }
            AffineTransform affineTransform = this.f20785b;
            if (affineTransform != null) {
                affineTransform.transform(dArr, 0, dArr, 0, 1);
            }
            return i11;
        }
        throw new NoSuchElementException("line iterator out of bounds");
    }

    @Override // lib.zj.office.java.awt.geom.p
    public final int b(float[] fArr) {
        if (!isDone()) {
            int i10 = this.c;
            int i11 = 1;
            Line2D line2D = this.f20784a;
            if (i10 == 0) {
                fArr[0] = (float) line2D.getX1();
                fArr[1] = (float) line2D.getY1();
                i11 = 0;
            } else {
                fArr[0] = (float) line2D.getX2();
                fArr[1] = (float) line2D.getY2();
            }
            AffineTransform affineTransform = this.f20785b;
            if (affineTransform != null) {
                affineTransform.transform(fArr, 0, fArr, 0, 1);
            }
            return i11;
        }
        throw new NoSuchElementException("line iterator out of bounds");
    }

    @Override // lib.zj.office.java.awt.geom.p
    public final int c() {
        return 1;
    }

    @Override // lib.zj.office.java.awt.geom.p
    public final boolean isDone() {
        if (this.c > 1) {
            return true;
        }
        return false;
    }

    @Override // lib.zj.office.java.awt.geom.p
    public final void next() {
        this.c++;
    }
}
