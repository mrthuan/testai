package lib.zj.office.java.awt.geom;

import java.util.Vector;
import lib.zj.office.java.awt.geom.Rectangle2D;
import lib.zj.office.java.awt.geom.c;

/* compiled from: Area.java */
/* loaded from: classes3.dex */
public final class b implements lib.zj.office.java.awt.b, Cloneable {
    public static final Vector c = new Vector();

    /* renamed from: a  reason: collision with root package name */
    public Vector f20742a;

    /* renamed from: b  reason: collision with root package name */
    public Rectangle2D.Double f20743b;

    public b() {
        this.f20742a = c;
    }

    public final Object clone() {
        return new b(this);
    }

    @Override // lib.zj.office.java.awt.b
    public final Rectangle2D getBounds2D() {
        Rectangle2D.Double r02 = this.f20743b;
        if (r02 == null) {
            r02 = new Rectangle2D.Double();
            if (this.f20742a.size() > 0) {
                e eVar = (e) this.f20742a.get(0);
                r02.setRect(eVar.n(), eVar.s(), 0.0d, 0.0d);
                for (int i10 = 1; i10 < this.f20742a.size(); i10++) {
                    ((e) this.f20742a.get(i10)).g(r02);
                }
            }
            this.f20743b = r02;
        }
        return r02.getBounds2D();
    }

    @Override // lib.zj.office.java.awt.b
    public final p getPathIterator(AffineTransform affineTransform) {
        return new k5.b(this.f20742a, affineTransform);
    }

    public b(lib.zj.office.java.awt.b bVar) {
        c dVar;
        double[] dArr;
        Vector vector;
        Vector vector2;
        double d10;
        double d11;
        if (bVar instanceof b) {
            this.f20742a = ((b) bVar).f20742a;
            return;
        }
        p pathIterator = bVar.getPathIterator(null);
        Vector vector3 = new Vector();
        int c10 = pathIterator.c();
        double[] dArr2 = new double[23];
        double d12 = 0.0d;
        double d13 = 0.0d;
        double d14 = 0.0d;
        double d15 = 0.0d;
        while (!pathIterator.isDone()) {
            int a10 = pathIterator.a(dArr2);
            if (a10 != 0) {
                if (a10 != 1) {
                    if (a10 == 2) {
                        vector2 = vector3;
                        dArr = dArr2;
                        d10 = dArr[2];
                        d11 = dArr[3];
                        int i10 = (d13 > d11 ? 1 : (d13 == d11 ? 0 : -1));
                        if (i10 > 0) {
                            n.B(vector2, dArr, d10, d11, dArr[0], dArr[1], d12, d13, -1);
                        } else if (i10 != 0 || d13 != dArr[1]) {
                            n.B(vector2, dArr, d12, d13, dArr[0], dArr[1], d10, d11, 1);
                        }
                    } else if (a10 == 3) {
                        d10 = dArr2[4];
                        d11 = dArr2[5];
                        int i11 = (d13 > d11 ? 1 : (d13 == d11 ? 0 : -1));
                        if (i11 > 0) {
                            Vector vector4 = vector3;
                            dArr = dArr2;
                            vector2 = vector4;
                            o.A(vector4, dArr, d10, d11, dArr2[2], dArr2[3], dArr2[0], dArr2[1], d12, d13, -1);
                        } else {
                            vector2 = vector3;
                            dArr = dArr2;
                            if (i11 != 0 || d13 != dArr[1] || d13 != dArr[3]) {
                                o.A(vector2, dArr, d12, d13, dArr[0], dArr[1], dArr[2], dArr[3], d10, d11, 1);
                            }
                        }
                    } else if (a10 != 4) {
                        vector = vector3;
                        dArr = dArr2;
                    } else {
                        e.w(vector3, d12, d13, d14, d15);
                        vector = vector3;
                        dArr = dArr2;
                        d12 = d14;
                        d13 = d15;
                    }
                    d12 = d10;
                    d13 = d11;
                } else {
                    vector2 = vector3;
                    dArr = dArr2;
                    double d16 = dArr[0];
                    double d17 = dArr[1];
                    e.w(vector2, d12, d13, d16, d17);
                    d12 = d16;
                    d13 = d17;
                }
                vector = vector2;
            } else {
                Vector vector5 = vector3;
                dArr = dArr2;
                e.w(vector5, d12, d13, d14, d15);
                double d18 = dArr[0];
                double d19 = dArr[1];
                vector = vector5;
                vector.add(new l(d18, d19));
                d12 = d18;
                d14 = d12;
                d13 = d19;
                d15 = d13;
            }
            pathIterator.next();
            vector3 = vector;
            dArr2 = dArr;
        }
        Vector vector6 = vector3;
        e.w(vector6, d12, d13, d14, d15);
        if (c10 == 0) {
            dVar = new c.C0281c();
        } else {
            dVar = new c.d();
        }
        this.f20742a = dVar.b(vector6, c);
    }
}
