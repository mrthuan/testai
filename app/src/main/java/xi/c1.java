package xi;

import android.graphics.Point;
import lib.zj.office.java.awt.Rectangle;

/* compiled from: PolyDraw16.java */
/* loaded from: classes3.dex */
public final class c1 extends wi.e {
    public final Rectangle c;

    /* renamed from: d  reason: collision with root package name */
    public final Point[] f31666d;

    public c1() {
        super(92);
    }

    @Override // wi.e
    public final wi.e c(wi.c cVar, int i10) {
        Rectangle m10 = cVar.m();
        int readUnsignedInt = (int) cVar.readUnsignedInt();
        Point[] l10 = cVar.l(readUnsignedInt);
        cVar.h(readUnsignedInt);
        return new c1(m10, l10);
    }

    @Override // wi.e
    public final String toString() {
        return super.toString() + "\n  bounds: " + this.c + "\n  #points: " + this.f31666d.length;
    }

    public c1(Rectangle rectangle, Point[] pointArr) {
        this();
        this.c = rectangle;
        this.f31666d = pointArr;
    }
}
