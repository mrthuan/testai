package xi;

import android.graphics.Point;
import lib.zj.office.java.awt.Color;

/* compiled from: SetPixelV.java */
/* loaded from: classes3.dex */
public final class y1 extends wi.e {
    public final Point c;

    /* renamed from: d  reason: collision with root package name */
    public final Color f31816d;

    public y1() {
        super(15);
    }

    @Override // wi.e
    public final wi.e c(wi.c cVar, int i10) {
        return new y1(cVar.j(), cVar.i());
    }

    @Override // wi.e
    public final String toString() {
        return super.toString() + "\n  point: " + this.c + "\n  color: " + this.f31816d;
    }

    public y1(Point point, Color color) {
        this();
        this.c = point;
        this.f31816d = color;
    }
}
