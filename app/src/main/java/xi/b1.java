package xi;

import android.graphics.Point;
import lib.zj.office.java.awt.Rectangle;
import lib.zj.office.java.awt.geom.GeneralPath;

/* compiled from: PolyBezierTo.java */
/* loaded from: classes3.dex */
public class b1 extends h {
    public b1() {
        super(5, null, 0, null);
    }

    @Override // wi.e, xi.l0
    public final void a(wi.d dVar) {
        GeneralPath generalPath = dVar.f31231a;
        Point[] pointArr = this.f31708e;
        if (pointArr != null && pointArr.length > 0) {
            for (int i10 = 0; i10 < this.f31707d; i10 += 3) {
                Point point = pointArr[i10];
                Point point2 = pointArr[i10 + 1];
                Point point3 = pointArr[i10 + 2];
                generalPath.curveTo(point.x, point.y, point2.x, point2.y, point3.x, point3.y);
            }
        }
    }

    @Override // wi.e
    public wi.e c(wi.c cVar, int i10) {
        Rectangle m10 = cVar.m();
        int readUnsignedInt = (int) cVar.readUnsignedInt();
        return new b1(m10, readUnsignedInt, cVar.k(readUnsignedInt));
    }

    public b1(Rectangle rectangle, int i10, Point[] pointArr) {
        super(5, rectangle, i10, pointArr);
    }

    public b1(Rectangle rectangle, int i10, Point[] pointArr, int i11) {
        super(88, rectangle, i10, pointArr);
    }
}
