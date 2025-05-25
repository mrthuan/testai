package xi;

import android.graphics.Point;
import lib.zj.office.java.awt.Rectangle;

/* compiled from: PolyBezier16.java */
/* loaded from: classes3.dex */
public final class y0 extends z0 {
    public y0() {
        super(null, 0, null, 0);
    }

    @Override // xi.z0, wi.e
    public final wi.e c(wi.c cVar, int i10) {
        Rectangle m10 = cVar.m();
        int readUnsignedInt = (int) cVar.readUnsignedInt();
        return new y0(m10, readUnsignedInt, cVar.l(readUnsignedInt));
    }

    public y0(Rectangle rectangle, int i10, Point[] pointArr) {
        super(rectangle, i10, pointArr, 0);
    }
}
