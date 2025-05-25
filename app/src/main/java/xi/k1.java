package xi;

import android.graphics.Canvas;
import android.graphics.Point;
import lib.zj.office.java.awt.Rectangle;
import lib.zj.office.java.awt.geom.GeneralPath;

/* compiled from: Polyline.java */
/* loaded from: classes3.dex */
public class k1 extends h {
    public k1() {
        super(4, null, 0, null);
    }

    @Override // wi.e, xi.l0
    public final void a(wi.d dVar) {
        Point[] pointArr = this.f31708e;
        if (pointArr != null && pointArr.length > 0) {
            GeneralPath generalPath = new GeneralPath(dVar.f31243n);
            for (int i10 = 0; i10 < this.f31707d; i10++) {
                Point point = pointArr[i10];
                if (i10 > 0) {
                    generalPath.lineTo(point.x, point.y);
                } else {
                    generalPath.moveTo(point.x, point.y);
                }
            }
            Canvas canvas = dVar.f31236g;
            if (!dVar.a(generalPath)) {
                dVar.d(canvas, generalPath);
            }
        }
    }

    @Override // wi.e
    public wi.e c(wi.c cVar, int i10) {
        Rectangle m10 = cVar.m();
        int readUnsignedInt = (int) cVar.readUnsignedInt();
        return new k1(m10, readUnsignedInt, cVar.k(readUnsignedInt));
    }

    public k1(Rectangle rectangle, int i10, Point[] pointArr) {
        super(4, rectangle, i10, pointArr);
    }

    public k1(Rectangle rectangle, int i10, Point[] pointArr, int i11) {
        super(87, rectangle, i10, pointArr);
    }
}
