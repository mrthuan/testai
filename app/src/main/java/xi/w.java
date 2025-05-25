package xi;

import android.graphics.Point;
import lib.zj.office.java.awt.Rectangle;
import lib.zj.office.java.awt.geom.GeneralPath;

/* compiled from: EMFPolygon.java */
/* loaded from: classes3.dex */
public class w extends h {
    public w() {
        super(3, null, 0, null);
    }

    @Override // wi.e, xi.l0
    public final void a(wi.d dVar) {
        Point[] pointArr = this.f31708e;
        if (pointArr.length > 1) {
            GeneralPath generalPath = new GeneralPath(dVar.f31243n);
            Point point = pointArr[0];
            generalPath.moveTo(point.x, point.y);
            for (int i10 = 1; i10 < pointArr.length; i10++) {
                Point point2 = pointArr[i10];
                generalPath.lineTo(point2.x, point2.y);
            }
            generalPath.closePath();
            dVar.e(generalPath);
        }
    }

    @Override // wi.e
    public wi.e c(wi.c cVar, int i10) {
        Rectangle m10 = cVar.m();
        int readUnsignedInt = (int) cVar.readUnsignedInt();
        return new w(m10, readUnsignedInt, cVar.k(readUnsignedInt));
    }

    public w(Rectangle rectangle, int i10, Point[] pointArr) {
        super(3, rectangle, i10, pointArr);
    }

    public w(Rectangle rectangle, int i10, Point[] pointArr, int i11) {
        super(86, rectangle, i10, pointArr);
    }
}
