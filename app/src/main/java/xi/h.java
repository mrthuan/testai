package xi;

import android.graphics.Point;
import lib.zj.office.java.awt.Rectangle;

/* compiled from: AbstractPolygon.java */
/* loaded from: classes3.dex */
public abstract class h extends wi.e {
    public final Rectangle c;

    /* renamed from: d  reason: collision with root package name */
    public final int f31707d;

    /* renamed from: e  reason: collision with root package name */
    public final Point[] f31708e;

    public h(int i10, Rectangle rectangle, int i11, Point[] pointArr) {
        super(i10);
        this.c = rectangle;
        this.f31707d = i11;
        this.f31708e = pointArr;
    }

    @Override // wi.e
    public final String toString() {
        String str = super.toString() + "\n  bounds: " + this.c + "\n  #points: " + this.f31707d;
        Point[] pointArr = this.f31708e;
        if (pointArr != null) {
            str = a6.h.c(str, "\n  points: ");
            for (int i10 = 0; i10 < pointArr.length; i10++) {
                StringBuilder g10 = a0.d.g(str, "[");
                g10.append(pointArr[i10].x);
                g10.append(",");
                str = a6.h.g(g10, pointArr[i10].y, "]");
                if (i10 < pointArr.length - 1) {
                    str = a6.h.c(str, ", ");
                }
            }
        }
        return str;
    }
}
