package xi;

import android.graphics.Point;
import lib.zj.office.java.awt.Rectangle;

/* compiled from: PolylineTo16.java */
/* loaded from: classes3.dex */
public final class l1 extends m1 {
    public l1() {
        super(null, 0, null, 0);
    }

    @Override // xi.m1, wi.e
    public final wi.e c(wi.c cVar, int i10) {
        Rectangle m10 = cVar.m();
        int readUnsignedInt = (int) cVar.readUnsignedInt();
        return new l1(m10, readUnsignedInt, cVar.l(readUnsignedInt));
    }

    public l1(Rectangle rectangle, int i10, Point[] pointArr) {
        super(rectangle, i10, pointArr, 0);
    }
}
