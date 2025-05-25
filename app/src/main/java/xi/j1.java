package xi;

import android.graphics.Point;
import lib.zj.office.java.awt.Rectangle;

/* compiled from: Polyline16.java */
/* loaded from: classes3.dex */
public final class j1 extends k1 {
    public j1() {
        super(null, 0, null, 0);
    }

    @Override // xi.k1, wi.e
    public final wi.e c(wi.c cVar, int i10) {
        Rectangle m10 = cVar.m();
        int readUnsignedInt = (int) cVar.readUnsignedInt();
        return new j1(m10, readUnsignedInt, cVar.l(readUnsignedInt));
    }

    public j1(Rectangle rectangle, int i10, Point[] pointArr) {
        super(rectangle, i10, pointArr, 0);
    }
}
