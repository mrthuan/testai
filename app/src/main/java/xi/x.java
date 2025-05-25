package xi;

import android.graphics.Point;
import lib.zj.office.java.awt.Dimension;
import lib.zj.office.java.awt.Rectangle;

/* compiled from: EMFRectangle.java */
/* loaded from: classes3.dex */
public final class x extends wi.e {
    public final /* synthetic */ int c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f31815d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(int i10) {
        super(43);
        this.c = i10;
        if (i10 == 1) {
            super(13);
        } else if (i10 != 2) {
        } else {
            super(9);
        }
    }

    @Override // wi.e, xi.l0
    public final void a(wi.d dVar) {
        int i10 = this.c;
        Object obj = this.f31815d;
        switch (i10) {
            case 0:
                dVar.e((Rectangle) obj);
                return;
            case 1:
                return;
            default:
                dVar.c = (Dimension) obj;
                dVar.g();
                dVar.i(dVar.f31236g);
                return;
        }
    }

    @Override // wi.e
    public final wi.e c(wi.c cVar, int i10) {
        switch (this.c) {
            case 0:
                return new x(cVar.m());
            case 1:
                return new x(cVar.j());
            default:
                return new x(cVar.n());
        }
    }

    @Override // wi.e
    public final String toString() {
        int i10 = this.c;
        Object obj = this.f31815d;
        switch (i10) {
            case 0:
                return super.toString() + "\n  bounds: " + ((Rectangle) obj);
            case 1:
                return super.toString() + "\n  point: " + ((Point) obj);
            default:
                return super.toString() + "\n  size: " + ((Dimension) obj);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x(Point point) {
        this(1);
        this.c = 1;
        this.f31815d = point;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x(Dimension dimension) {
        this(2);
        this.c = 2;
        this.f31815d = dimension;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x(Rectangle rectangle) {
        this(0);
        this.c = 0;
        this.f31815d = rectangle;
    }
}
