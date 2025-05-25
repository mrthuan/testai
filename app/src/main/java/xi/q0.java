package xi;

import android.graphics.Point;
import lib.zj.office.java.awt.Color;
import lib.zj.office.java.awt.Dimension;
import lib.zj.office.java.awt.geom.GeneralPath;

/* compiled from: LineTo.java */
/* loaded from: classes3.dex */
public final class q0 extends wi.e {
    public final /* synthetic */ int c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f31768d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(int i10) {
        super(54);
        this.c = i10;
        if (i10 == 1) {
            super(25);
        } else if (i10 != 2) {
        } else {
            super(11);
        }
    }

    @Override // wi.e, xi.l0
    public final void a(wi.d dVar) {
        int i10 = this.c;
        Object obj = this.f31768d;
        switch (i10) {
            case 0:
                GeneralPath generalPath = dVar.f31231a;
                if (generalPath != null) {
                    Point point = (Point) obj;
                    generalPath.lineTo(point.x, point.y);
                    dVar.d(dVar.f31236g, generalPath);
                    return;
                }
                GeneralPath generalPath2 = new GeneralPath(dVar.f31243n);
                Point point2 = (Point) obj;
                generalPath2.moveTo(point2.x, point2.y);
                dVar.f31231a = generalPath2;
                return;
            case 1:
                return;
            default:
                dVar.f31233d = (Dimension) obj;
                dVar.g();
                dVar.i(dVar.f31236g);
                return;
        }
    }

    @Override // wi.e
    public final wi.e c(wi.c cVar, int i10) {
        switch (this.c) {
            case 0:
                return new q0(cVar.j());
            case 1:
                return new q0(cVar.i());
            default:
                return new q0(cVar.n());
        }
    }

    @Override // wi.e
    public final String toString() {
        int i10 = this.c;
        Object obj = this.f31768d;
        switch (i10) {
            case 0:
                return super.toString() + "\n  point: " + ((Point) obj);
            case 1:
                return super.toString() + "\n  color: " + ((Color) obj);
            default:
                return super.toString() + "\n  size: " + ((Dimension) obj);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q0(Color color) {
        this(1);
        this.c = 1;
        this.f31768d = color;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q0(Dimension dimension) {
        this(2);
        this.c = 2;
        this.f31768d = dimension;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public q0(Point point) {
        this(0);
        this.c = 0;
        this.f31768d = point;
    }
}
