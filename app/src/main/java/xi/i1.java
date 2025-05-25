package xi;

import android.graphics.Point;
import lib.zj.office.java.awt.Rectangle;

/* compiled from: Polygon16.java */
/* loaded from: classes3.dex */
public final class i1 extends w {
    public i1() {
        super(null, 0, null, 0);
    }

    @Override // xi.w, wi.e
    public final wi.e c(wi.c cVar, int i10) {
        Rectangle m10 = cVar.m();
        int readUnsignedInt = (int) cVar.readUnsignedInt();
        return new i1(m10, readUnsignedInt, cVar.l(readUnsignedInt));
    }

    public i1(Rectangle rectangle, int i10, Point[] pointArr) {
        super(rectangle, i10, pointArr, 0);
    }
}
