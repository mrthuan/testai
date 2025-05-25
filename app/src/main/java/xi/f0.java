package xi;

import lib.zj.office.java.awt.Rectangle;

/* compiled from: ExtSelectClipRgn.java */
/* loaded from: classes3.dex */
public final class f0 extends c {

    /* renamed from: d  reason: collision with root package name */
    public final w1.f f31701d;

    public f0() {
        super(75, 5);
    }

    @Override // wi.e, xi.l0
    public final void a(wi.d dVar) {
        Rectangle rectangle;
        w1.f fVar = this.f31701d;
        if (fVar != null && (rectangle = (Rectangle) fVar.f30907b) != null) {
            d(dVar, rectangle);
        }
    }

    @Override // wi.e
    public final wi.e c(wi.c cVar, int i10) {
        w1.f fVar;
        int readUnsignedInt = (int) cVar.readUnsignedInt();
        int readUnsignedInt2 = (int) cVar.readUnsignedInt();
        if (readUnsignedInt > 8) {
            fVar = new w1.f(cVar);
        } else {
            fVar = null;
        }
        return new f0(readUnsignedInt2, fVar);
    }

    public f0(int i10, w1.f fVar) {
        super(75, i10);
        this.f31701d = fVar;
    }
}
