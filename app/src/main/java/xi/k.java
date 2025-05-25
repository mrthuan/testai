package xi;

import android.graphics.Point;
import lib.zj.office.java.awt.Rectangle;

/* compiled from: Arc.java */
/* loaded from: classes3.dex */
public final class k extends b {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f31728f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(int i10) {
        super(45, null, null, null);
        this.f31728f = i10;
        if (i10 != 1) {
        } else {
            super(46, null, null, null);
        }
    }

    @Override // wi.e, xi.l0
    public final void a(wi.d dVar) {
        switch (this.f31728f) {
            case 0:
                dVar.e(e(dVar, 0));
                return;
            default:
                dVar.e(e(dVar, 1));
                return;
        }
    }

    @Override // wi.e
    public final wi.e c(wi.c cVar, int i10) {
        switch (this.f31728f) {
            case 0:
                return new k(cVar.m(), cVar.j(), cVar.j(), 0);
            default:
                return new k(cVar.m(), cVar.j(), cVar.j(), 1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Rectangle rectangle, Point point, Point point2, int i10) {
        super(45, rectangle, point, point2);
        this.f31728f = i10;
        if (i10 != 1) {
        } else {
            super(46, rectangle, point, point2);
        }
    }
}
