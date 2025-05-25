package xi;

import android.graphics.Point;
import lib.zj.office.java.awt.Rectangle;
import lib.zj.office.java.awt.geom.GeneralPath;

/* compiled from: PolyBezier.java */
/* loaded from: classes3.dex */
public class z0 extends h {
    public z0() {
        super(2, null, 0, null);
    }

    @Override // wi.e, xi.l0
    public final void a(wi.d dVar) {
        Point[] pointArr = this.f31708e;
        if (pointArr != null && pointArr.length > 0) {
            GeneralPath generalPath = new GeneralPath(dVar.f31243n);
            Point point = pointArr[0];
            generalPath.moveTo(point.x, point.y);
            for (int i10 = 1; i10 < this.f31707d; i10 += 3) {
                Point point2 = pointArr[i10];
                Point point3 = pointArr[i10 + 1];
                Point point4 = pointArr[i10 + 2];
                if (i10 > 0) {
                    generalPath.curveTo(point2.x, point2.y, point3.x, point3.y, point4.x, point4.y);
                }
            }
            dVar.e(generalPath);
        }
    }

    @Override // wi.e
    public wi.e c(wi.c cVar, int i10) {
        Rectangle m10 = cVar.m();
        int readUnsignedInt = (int) cVar.readUnsignedInt();
        return new z0(m10, readUnsignedInt, cVar.k(readUnsignedInt));
    }

    public z0(Rectangle rectangle, int i10, Point[] pointArr) {
        super(2, rectangle, i10, pointArr);
    }

    public z0(Rectangle rectangle, int i10, Point[] pointArr, int i11) {
        super(85, rectangle, i10, pointArr);
    }
}
