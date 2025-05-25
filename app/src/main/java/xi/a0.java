package xi;

import android.graphics.Point;
import lib.zj.office.java.awt.Rectangle;
import lib.zj.office.java.awt.geom.GeneralPath;

/* compiled from: ExcludeClipRect.java */
/* loaded from: classes3.dex */
public final class a0 extends wi.e {
    public final /* synthetic */ int c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f31660d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(int i10) {
        super(29);
        this.c = i10;
        if (i10 != 1) {
        } else {
            super(27);
        }
    }

    @Override // wi.e, xi.l0
    public final void a(wi.d dVar) {
        switch (this.c) {
            case 1:
                GeneralPath generalPath = new GeneralPath(dVar.f31243n);
                Point point = (Point) this.f31660d;
                generalPath.moveTo(point.x, point.y);
                dVar.f31231a = generalPath;
                return;
            default:
                return;
        }
    }

    @Override // wi.e
    public final wi.e c(wi.c cVar, int i10) {
        switch (this.c) {
            case 0:
                return new a0(cVar.m());
            default:
                return new a0(cVar.j());
        }
    }

    @Override // wi.e
    public final String toString() {
        int i10 = this.c;
        Object obj = this.f31660d;
        switch (i10) {
            case 0:
                return super.toString() + "\n  bounds: " + ((Rectangle) obj);
            default:
                return super.toString() + "\n  point: " + ((Point) obj);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a0(Rectangle rectangle) {
        this(0);
        this.c = 0;
        this.f31660d = rectangle;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a0(Point point) {
        this(1);
        this.c = 1;
        this.f31660d = point;
    }
}
