package xi;

import android.graphics.Point;
import lib.zj.office.java.awt.Rectangle;
import lib.zj.office.java.awt.geom.GeneralPath;

/* compiled from: PolylineTo.java */
/* loaded from: classes3.dex */
public class m1 extends h {
    public m1() {
        super(6, null, 0, null);
    }

    @Override // wi.e, xi.l0
    public final void a(wi.d dVar) {
        GeneralPath generalPath = dVar.f31231a;
        Point[] pointArr = this.f31708e;
        if (pointArr != null) {
            for (int i10 = 0; i10 < this.f31707d; i10++) {
                Point point = pointArr[i10];
                generalPath.lineTo(point.x, point.y);
            }
        }
    }

    @Override // wi.e
    public wi.e c(wi.c cVar, int i10) {
        Rectangle m10 = cVar.m();
        int readUnsignedInt = (int) cVar.readUnsignedInt();
        return new m1(m10, readUnsignedInt, cVar.k(readUnsignedInt));
    }

    public m1(Rectangle rectangle, int i10, Point[] pointArr) {
        super(6, rectangle, i10, pointArr);
    }

    public m1(Rectangle rectangle, int i10, Point[] pointArr, int i11) {
        super(89, rectangle, i10, pointArr);
    }
}
