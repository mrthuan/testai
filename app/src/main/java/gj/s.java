package gj;

import android.graphics.Canvas;
import lib.zj.office.java.awt.Rectangle;

/* compiled from: WPSTRoot.java */
/* loaded from: classes3.dex */
public final class s extends ai.a implements ai.d {

    /* renamed from: w  reason: collision with root package name */
    public static final o f17889w = new o(null);

    /* renamed from: p  reason: collision with root package name */
    public boolean f17890p;

    /* renamed from: q  reason: collision with root package name */
    public final zh.g f17891q;

    /* renamed from: u  reason: collision with root package name */
    public final xh.e f17895u;

    /* renamed from: v  reason: collision with root package name */
    public int f17896v;

    /* renamed from: t  reason: collision with root package name */
    public final ai.c f17894t = new ai.c();

    /* renamed from: s  reason: collision with root package name */
    public final ai.g f17893s = new ai.g();

    /* renamed from: r  reason: collision with root package name */
    public final ai.f f17892r = new ai.f();

    public s(xh.e eVar, zh.g gVar, int i10) {
        this.f17891q = gVar;
        this.f17895u = eVar;
    }

    @Override // ai.a, ai.e
    public final Rectangle A(long j10, Rectangle rectangle, boolean z10) {
        ai.e u7 = u(j10, 5, z10);
        if (u7 != null) {
            u7.A(j10, rectangle, z10);
        }
        rectangle.f20688x += this.f480b;
        rectangle.f20689y += this.c;
        return rectangle;
    }

    @Override // ai.a, ai.e
    public final long C(int i10, int i11, boolean z10) {
        int i12 = i10 - this.f480b;
        int i13 = i11 - this.c;
        ai.e eVar = this.f490m;
        while (eVar != null) {
            if (i13 >= eVar.getY()) {
                if (i13 < eVar.e((byte) 1) + eVar.getY()) {
                    break;
                }
            }
            eVar = eVar.o();
        }
        if (eVar != null) {
            return eVar.C(i12, i13, z10);
        }
        return -1L;
    }

    @Override // ai.a, ai.e
    public final void dispose() {
        super.dispose();
    }

    @Override // ai.a, ai.e
    public final void g(Canvas canvas, int i10, int i11, float f10) {
        canvas.save();
        float f11 = i10;
        float f12 = i11;
        ai.f fVar = this.f17892r;
        canvas.clipRect(f11, f12, (fVar.f509a * f10) + f11, ((fVar.f510b - fVar.f511d) * f10) + f12);
        super.g(canvas, i10, i11, f10);
        canvas.restore();
    }

    @Override // ai.a, ai.e
    public final lib.zj.office.system.f getControl() {
        return this.f17895u.getControl();
    }

    @Override // ai.a, ai.e
    public final zh.g getDocument() {
        return this.f17891q;
    }

    @Override // ai.e
    public final short getType() {
        return (short) 3;
    }

    @Override // ai.d
    public final ai.k m() {
        return null;
    }

    @Override // ai.a, ai.e
    public final xh.e n() {
        return this.f17895u;
    }

    @Override // ai.d
    public final boolean q() {
        return false;
    }

    @Override // ai.d
    public final void k() {
    }
}
