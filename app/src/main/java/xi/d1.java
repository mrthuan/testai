package xi;

import android.graphics.Point;
import lib.zj.office.java.awt.Rectangle;

/* compiled from: PolyDraw.java */
/* loaded from: classes3.dex */
public final class d1 extends wi.e {
    public final Rectangle c;

    /* renamed from: d  reason: collision with root package name */
    public final Point[] f31678d;

    public d1() {
        super(56);
    }

    @Override // wi.e
    public final wi.e c(wi.c cVar, int i10) {
        Rectangle m10 = cVar.m();
        int readUnsignedInt = (int) cVar.readUnsignedInt();
        Point[] k10 = cVar.k(readUnsignedInt);
        cVar.h(readUnsignedInt);
        return new d1(m10, k10);
    }

    @Override // wi.e
    public final String toString() {
        return super.toString() + "\n  bounds: " + this.c + "\n  #points: " + this.f31678d.length;
    }

    public d1(Rectangle rectangle, Point[] pointArr) {
        this();
        this.c = rectangle;
        this.f31678d = pointArr;
    }
}
