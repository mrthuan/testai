package xi;

import lib.zj.office.java.awt.Color;

/* compiled from: LogPen.java */
/* loaded from: classes3.dex */
public final class t0 extends e {

    /* renamed from: b  reason: collision with root package name */
    public final int f31796b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final Color f31797d;

    public t0(int i10, Color color) {
        this.f31796b = i10;
        this.c = 1;
        this.f31797d = color;
    }

    @Override // xi.l0
    public final void a(wi.d dVar) {
        dVar.f31245p = true;
        dVar.f31240k.setColor(this.f31797d.getRGB());
        dVar.f31238i = e.b(dVar, this.f31796b, null, this.c);
    }

    public final String toString() {
        return "  LogPen\n    penstyle: " + this.f31796b + "\n    width: " + this.c + "\n    color: " + this.f31797d;
    }

    public t0(wi.c cVar) {
        this.f31796b = (int) cVar.readUnsignedInt();
        this.c = (int) cVar.readUnsignedInt();
        cVar.readUnsignedInt();
        this.f31797d = cVar.i();
    }
}
