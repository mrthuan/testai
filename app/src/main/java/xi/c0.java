package xi;

import android.graphics.Point;
import lib.zj.office.java.awt.Color;

/* compiled from: ExtFloodFill.java */
/* loaded from: classes3.dex */
public final class c0 extends wi.e {
    public final Point c;

    /* renamed from: d  reason: collision with root package name */
    public final Color f31664d;

    /* renamed from: e  reason: collision with root package name */
    public final int f31665e;

    public c0() {
        super(53);
    }

    @Override // wi.e
    public final wi.e c(wi.c cVar, int i10) {
        return new c0(cVar.j(), cVar.i(), (int) cVar.readUnsignedInt());
    }

    @Override // wi.e
    public final String toString() {
        return super.toString() + "\n  start: " + this.c + "\n  color: " + this.f31664d + "\n  mode: " + this.f31665e;
    }

    public c0(Point point, Color color, int i10) {
        this();
        this.c = point;
        this.f31664d = color;
        this.f31665e = i10;
    }
}
