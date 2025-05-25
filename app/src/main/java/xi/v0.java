package xi;

import android.graphics.Point;
import lib.zj.office.java.awt.Color;

/* compiled from: OffsetClipRgn.java */
/* loaded from: classes3.dex */
public final class v0 extends wi.e {
    public final /* synthetic */ int c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f31804d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(int i10) {
        super(26);
        this.c = i10;
        if (i10 != 1) {
        } else {
            super(24);
        }
    }

    @Override // wi.e, xi.l0
    public final void a(wi.d dVar) {
        switch (this.c) {
            case 1:
                dVar.f31242m = (Color) this.f31804d;
                return;
            default:
                return;
        }
    }

    @Override // wi.e
    public final wi.e c(wi.c cVar, int i10) {
        switch (this.c) {
            case 0:
                return new v0(cVar.j());
            default:
                return new v0(cVar.i());
        }
    }

    @Override // wi.e
    public final String toString() {
        int i10 = this.c;
        Object obj = this.f31804d;
        switch (i10) {
            case 0:
                return super.toString() + "\n  offset: " + ((Point) obj);
            default:
                return super.toString() + "\n  color: " + ((Color) obj);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v0(Point point) {
        this(0);
        this.c = 0;
        this.f31804d = point;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v0(Color color) {
        this(1);
        this.c = 1;
        this.f31804d = color;
    }
}
