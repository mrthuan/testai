package xi;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import lib.zj.office.java.awt.Color;
import lib.zj.office.java.awt.Rectangle;
import lib.zj.office.java.awt.geom.AffineTransform;

/* compiled from: BitBlt.java */
/* loaded from: classes3.dex */
public final class o extends wi.e {
    public Rectangle c;

    /* renamed from: d  reason: collision with root package name */
    public int f31740d;

    /* renamed from: e  reason: collision with root package name */
    public int f31741e;

    /* renamed from: f  reason: collision with root package name */
    public int f31742f;

    /* renamed from: g  reason: collision with root package name */
    public int f31743g;

    /* renamed from: h  reason: collision with root package name */
    public int f31744h;

    /* renamed from: i  reason: collision with root package name */
    public int f31745i;

    /* renamed from: j  reason: collision with root package name */
    public int f31746j;

    /* renamed from: k  reason: collision with root package name */
    public AffineTransform f31747k;

    /* renamed from: l  reason: collision with root package name */
    public Color f31748l;

    /* renamed from: m  reason: collision with root package name */
    public int f31749m;

    /* renamed from: n  reason: collision with root package name */
    public f2.t f31750n;

    /* renamed from: o  reason: collision with root package name */
    public Bitmap f31751o;

    public o() {
        super(76);
    }

    @Override // wi.e, xi.l0
    public final void a(wi.d dVar) {
        Bitmap bitmap = this.f31751o;
        if (bitmap != null) {
            AffineTransform affineTransform = this.f31747k;
            Matrix matrix = new Matrix();
            matrix.setValues(wi.d.c(affineTransform));
            dVar.f31236g.drawBitmap(bitmap, matrix, dVar.f31240k);
        } else if (!this.c.isEmpty() && this.f31744h == 15728673) {
            Rectangle rectangle = this.c;
            rectangle.f20688x = this.f31740d;
            rectangle.f20689y = this.f31741e;
            dVar.f(rectangle);
        }
        lib.zj.office.java.awt.b bVar = dVar.f31231a;
        if (bVar != null) {
            Paint paint = dVar.f31239j;
            Paint.Style style = paint.getStyle();
            paint.setStyle(Paint.Style.FILL);
            dVar.d(dVar.f31236g, bVar);
            paint.setStyle(style);
        }
    }

    @Override // wi.e
    public final wi.e c(wi.c cVar, int i10) {
        f2.t tVar;
        o oVar = new o();
        oVar.c = cVar.m();
        oVar.f31740d = cVar.readInt();
        oVar.f31741e = cVar.readInt();
        oVar.f31742f = cVar.readInt();
        oVar.f31743g = cVar.readInt();
        oVar.f31744h = (int) cVar.readUnsignedInt();
        oVar.f31745i = cVar.readInt();
        oVar.f31746j = cVar.readInt();
        oVar.f31747k = cVar.p();
        oVar.f31748l = cVar.i();
        oVar.f31749m = (int) cVar.readUnsignedInt();
        cVar.readUnsignedInt();
        int readUnsignedInt = (int) cVar.readUnsignedInt();
        cVar.readUnsignedInt();
        int readUnsignedInt2 = (int) cVar.readUnsignedInt();
        if (readUnsignedInt > 0) {
            oVar.f31750n = new f2.t(cVar);
        } else {
            oVar.f31750n = null;
        }
        if (readUnsignedInt2 > 0 && (tVar = oVar.f31750n) != null) {
            oVar.f31751o = wi.b.a((p) tVar.f17086b, oVar.f31742f, oVar.f31743g, cVar, readUnsignedInt2, null);
        } else {
            oVar.f31751o = null;
        }
        return oVar;
    }

    @Override // wi.e
    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("\n  bounds: ");
        sb2.append(this.c);
        sb2.append("\n  x, y, w, h: ");
        sb2.append(this.f31740d);
        sb2.append(" ");
        sb2.append(this.f31741e);
        sb2.append(" ");
        sb2.append(this.f31742f);
        sb2.append(" ");
        sb2.append(this.f31743g);
        sb2.append("\n  dwROP: 0x");
        sb2.append(Integer.toHexString(this.f31744h));
        sb2.append("\n  xSrc, ySrc: ");
        sb2.append(this.f31745i);
        sb2.append(" ");
        sb2.append(this.f31746j);
        sb2.append("\n  transform: ");
        sb2.append(this.f31747k);
        sb2.append("\n  bkg: ");
        sb2.append(this.f31748l);
        sb2.append("\n  usage: ");
        sb2.append(this.f31749m);
        sb2.append("\n");
        f2.t tVar = this.f31750n;
        if (tVar != null) {
            str = tVar.toString();
        } else {
            str = "  bitmap: null";
        }
        sb2.append(str);
        return sb2.toString();
    }
}
