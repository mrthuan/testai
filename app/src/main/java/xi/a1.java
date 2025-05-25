package xi;

import android.graphics.Point;
import lib.zj.office.java.awt.Rectangle;

/* compiled from: PolyBezierTo16.java */
/* loaded from: classes3.dex */
public final class a1 extends b1 {
    public a1() {
        super(null, 0, null, 0);
    }

    @Override // xi.b1, wi.e
    public final wi.e c(wi.c cVar, int i10) {
        Rectangle m10 = cVar.m();
        int readUnsignedInt = (int) cVar.readUnsignedInt();
        return new a1(m10, readUnsignedInt, cVar.l(readUnsignedInt));
    }

    public a1(Rectangle rectangle, int i10, Point[] pointArr) {
        super(rectangle, i10, pointArr, 0);
    }
}
