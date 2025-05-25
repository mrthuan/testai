package xi;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Rect;
import lib.zj.office.java.awt.Color;
import lib.zj.office.java.awt.Rectangle;
import lib.zj.office.java.awt.geom.AffineTransform;

/* compiled from: AlphaBlend.java */
/* loaded from: classes3.dex */
public final class i extends wi.e {
    public Rectangle c;

    /* renamed from: d  reason: collision with root package name */
    public int f31710d;

    /* renamed from: e  reason: collision with root package name */
    public int f31711e;

    /* renamed from: f  reason: collision with root package name */
    public int f31712f;

    /* renamed from: g  reason: collision with root package name */
    public int f31713g;

    /* renamed from: h  reason: collision with root package name */
    public q f31714h;

    /* renamed from: i  reason: collision with root package name */
    public int f31715i;

    /* renamed from: j  reason: collision with root package name */
    public int f31716j;

    /* renamed from: k  reason: collision with root package name */
    public AffineTransform f31717k;

    /* renamed from: l  reason: collision with root package name */
    public Color f31718l;

    /* renamed from: m  reason: collision with root package name */
    public int f31719m;

    /* renamed from: n  reason: collision with root package name */
    public f2.t f31720n;

    /* renamed from: o  reason: collision with root package name */
    public Bitmap f31721o;

    public i() {
        super(114);
    }

    @Override // wi.e, xi.l0
    public final void a(wi.d dVar) {
        Bitmap bitmap = this.f31721o;
        if (bitmap != null) {
            int i10 = this.f31710d;
            int i11 = this.f31711e;
            dVar.f31236g.drawBitmap(bitmap, (Rect) null, new Rect(i10, i11, this.f31712f + i10, this.f31713g + i11), (Paint) null);
        }
    }

    @Override // wi.e
    public final wi.e c(wi.c cVar, int i10) {
        f2.t tVar;
        i iVar = new i();
        iVar.c = cVar.m();
        iVar.f31710d = cVar.readInt();
        iVar.f31711e = cVar.readInt();
        iVar.f31712f = cVar.readInt();
        iVar.f31713g = cVar.readInt();
        iVar.f31714h = new q(cVar);
        iVar.f31715i = cVar.readInt();
        iVar.f31716j = cVar.readInt();
        iVar.f31717k = cVar.p();
        iVar.f31718l = cVar.i();
        iVar.f31719m = (int) cVar.readUnsignedInt();
        cVar.readUnsignedInt();
        int readUnsignedInt = (int) cVar.readUnsignedInt();
        cVar.readUnsignedInt();
        cVar.readUnsignedInt();
        cVar.readInt();
        cVar.readInt();
        if (readUnsignedInt > 0) {
            tVar = new f2.t(cVar);
        } else {
            tVar = null;
        }
        iVar.f31720n = tVar;
        iVar.f31721o = wi.b.a((p) tVar.f17086b, iVar.f31712f, iVar.f31713g, cVar, (i10 - 100) - 40, iVar.f31714h);
        return iVar;
    }

    @Override // wi.e
    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("\n  bounds: ");
        sb2.append(this.c);
        sb2.append("\n  x, y, w, h: ");
        sb2.append(this.f31710d);
        sb2.append(" ");
        sb2.append(this.f31711e);
        sb2.append(" ");
        sb2.append(this.f31712f);
        sb2.append(" ");
        sb2.append(this.f31713g);
        sb2.append("\n  dwROP: ");
        sb2.append(this.f31714h);
        sb2.append("\n  xSrc, ySrc: ");
        sb2.append(this.f31715i);
        sb2.append(" ");
        sb2.append(this.f31716j);
        sb2.append("\n  transform: ");
        sb2.append(this.f31717k);
        sb2.append("\n  bkg: ");
        sb2.append(this.f31718l);
        sb2.append("\n  usage: ");
        sb2.append(this.f31719m);
        sb2.append("\n");
        f2.t tVar = this.f31720n;
        if (tVar != null) {
            str = tVar.toString();
        } else {
            str = "  bitmap: null";
        }
        sb2.append(str);
        return sb2.toString();
    }
}
