package xi;

import android.graphics.Point;
import lib.zj.office.java.awt.Rectangle;

/* compiled from: PolyPolygon.java */
/* loaded from: classes3.dex */
public final class f1 extends f {
    public f1() {
        super(8, null, null, null);
    }

    @Override // wi.e
    public final wi.e c(wi.c cVar, int i10) {
        Rectangle m10 = cVar.m();
        int readUnsignedInt = (int) cVar.readUnsignedInt();
        cVar.readUnsignedInt();
        int[] iArr = new int[readUnsignedInt];
        Point[][] pointArr = new Point[readUnsignedInt];
        for (int i11 = 0; i11 < readUnsignedInt; i11++) {
            int readUnsignedInt2 = (int) cVar.readUnsignedInt();
            iArr[i11] = readUnsignedInt2;
            pointArr[i11] = new Point[readUnsignedInt2];
        }
        for (int i12 = 0; i12 < readUnsignedInt; i12++) {
            pointArr[i12] = cVar.k(iArr[i12]);
        }
        return new f1(m10, iArr, pointArr);
    }

    public f1(Rectangle rectangle, int[] iArr, Point[][] pointArr) {
        super(8, rectangle, iArr, pointArr);
    }
}
