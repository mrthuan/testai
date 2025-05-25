package xi;

import android.graphics.Bitmap;

/* compiled from: CreateDIBPatternBrushPt.java */
/* loaded from: classes3.dex */
public final class t extends wi.e {
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public f2.t f31792d;

    /* renamed from: e  reason: collision with root package name */
    public Bitmap f31793e;

    /* renamed from: f  reason: collision with root package name */
    public int f31794f;

    /* compiled from: CreateDIBPatternBrushPt.java */
    /* loaded from: classes3.dex */
    public class a implements l0 {
        public a() {
        }

        @Override // xi.l0
        public final void a(wi.d dVar) {
            Bitmap bitmap = t.this.f31793e;
            if (bitmap != null) {
                dVar.f31236g.clipRect(0, 0, 16, 16);
                dVar.f31236g.setBitmap(bitmap);
            }
        }
    }

    public t() {
        super(94);
    }

    @Override // wi.e, xi.l0
    public final void a(wi.d dVar) {
        dVar.f31237h[this.f31794f] = new a();
    }

    @Override // wi.e
    public final wi.e c(wi.c cVar, int i10) {
        t tVar = new t();
        tVar.f31794f = (int) cVar.readUnsignedInt();
        cVar.b(24);
        tVar.f31792d = new f2.t(cVar);
        tVar.c = (int) cVar.readUnsignedInt();
        p pVar = (p) tVar.f31792d.f17086b;
        tVar.f31793e = wi.b.a(pVar, pVar.f31755a, pVar.f31756b, cVar, (((i10 - 4) - 24) - 40) - 4, null);
        return tVar;
    }

    @Override // wi.e
    public final String toString() {
        return super.toString() + "\n  usage: " + this.c + "\n" + this.f31792d.toString();
    }
}
