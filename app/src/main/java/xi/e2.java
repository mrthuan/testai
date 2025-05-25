package xi;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Rect;
import lib.zj.office.java.awt.Rectangle;

/* compiled from: StretchDIBits.java */
/* loaded from: classes3.dex */
public final class e2 extends wi.e {
    public Rectangle c;

    /* renamed from: d  reason: collision with root package name */
    public int f31687d;

    /* renamed from: e  reason: collision with root package name */
    public int f31688e;

    /* renamed from: f  reason: collision with root package name */
    public int f31689f;

    /* renamed from: g  reason: collision with root package name */
    public int f31690g;

    /* renamed from: h  reason: collision with root package name */
    public int f31691h;

    /* renamed from: i  reason: collision with root package name */
    public int f31692i;

    /* renamed from: j  reason: collision with root package name */
    public int f31693j;

    /* renamed from: k  reason: collision with root package name */
    public int f31694k;

    /* renamed from: l  reason: collision with root package name */
    public int f31695l;

    /* renamed from: m  reason: collision with root package name */
    public int f31696m;

    /* renamed from: n  reason: collision with root package name */
    public f2.t f31697n;

    /* renamed from: o  reason: collision with root package name */
    public Bitmap f31698o;

    public e2() {
        super(81);
    }

    @Override // wi.e, xi.l0
    public final void a(wi.d dVar) {
        Bitmap bitmap = this.f31698o;
        if (bitmap != null) {
            int i10 = this.f31687d;
            int i11 = this.f31688e;
            dVar.f31236g.drawBitmap(bitmap, (Rect) null, new Rect(i10, i11, this.f31693j + i10, this.f31694k + i11), (Paint) null);
        }
    }

    @Override // wi.e
    public final wi.e c(wi.c cVar, int i10) {
        e2 e2Var = new e2();
        e2Var.c = cVar.m();
        e2Var.f31687d = cVar.readInt();
        e2Var.f31688e = cVar.readInt();
        e2Var.f31691h = cVar.readInt();
        e2Var.f31692i = cVar.readInt();
        e2Var.f31689f = cVar.readInt();
        e2Var.f31690g = cVar.readInt();
        cVar.readUnsignedInt();
        cVar.readUnsignedInt();
        cVar.readUnsignedInt();
        cVar.readUnsignedInt();
        e2Var.f31695l = (int) cVar.readUnsignedInt();
        e2Var.f31696m = (int) cVar.readUnsignedInt();
        e2Var.f31693j = cVar.readInt();
        e2Var.f31694k = cVar.readInt();
        f2.t tVar = new f2.t(cVar);
        e2Var.f31697n = tVar;
        e2Var.f31698o = wi.b.a((p) tVar.f17086b, e2Var.f31689f, e2Var.f31690g, cVar, (i10 - 72) - 40, null);
        return e2Var;
    }

    @Override // wi.e
    public final String toString() {
        return super.toString() + "\n  bounds: " + this.c + "\n  x, y, w, h: " + this.f31687d + " " + this.f31688e + " " + this.f31689f + " " + this.f31690g + "\n  xSrc, ySrc, widthSrc, heightSrc: " + this.f31691h + " " + this.f31692i + " " + this.f31693j + " " + this.f31694k + "\n  usage: " + this.f31695l + "\n  dwROP: " + this.f31696m + "\n  bkg: null\n" + this.f31697n.toString();
    }
}
