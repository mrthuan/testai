package gj;

import android.graphics.Canvas;
import lib.zj.office.java.awt.Rectangle;

/* compiled from: CellView.java */
/* loaded from: classes3.dex */
public final class c extends ai.a {

    /* renamed from: p  reason: collision with root package name */
    public boolean f17814p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f17815q;

    /* renamed from: r  reason: collision with root package name */
    public short f17816r;

    /* renamed from: s  reason: collision with root package name */
    public int f17817s = -1;

    /* renamed from: t  reason: collision with root package name */
    public int f17818t = -16777216;

    /* renamed from: u  reason: collision with root package name */
    public int f17819u = -16777216;

    /* renamed from: v  reason: collision with root package name */
    public int f17820v = -16777216;

    /* renamed from: w  reason: collision with root package name */
    public int f17821w = -16777216;

    public c(zh.h hVar) {
        this.f479a = hVar;
    }

    @Override // ai.a, ai.e
    public final Rectangle A(long j10, Rectangle rectangle, boolean z10) {
        ai.e u7 = u(j10, 6, z10);
        if (u7 != null) {
            u7.A(j10, rectangle, z10);
        }
        rectangle.f20688x = this.f480b + this.f485h + rectangle.f20688x;
        rectangle.f20689y = this.c + this.f483f + rectangle.f20689y;
        return rectangle;
    }

    @Override // ai.a, ai.e
    public final long C(int i10, int i11, boolean z10) {
        int i12 = i10 - this.f480b;
        int i13 = i11 - this.c;
        ai.e eVar = this.f490m;
        if (eVar != null && i13 > eVar.getY()) {
            while (eVar != null) {
                if (i13 >= eVar.getY()) {
                    if (i13 < eVar.e((byte) 1) + eVar.getY()) {
                        break;
                    }
                }
                eVar = eVar.o();
            }
        }
        if (eVar == null) {
            eVar = this.f490m;
        }
        if (eVar != null) {
            return eVar.C(i12, i13, z10);
        }
        return -1L;
    }

    public final boolean G() {
        ai.e eVar = this.f492o;
        if (eVar == null) {
            return true;
        }
        c cVar = (c) eVar;
        if (this.f17815q) {
            return cVar.G();
        }
        if (cVar.f487j == 0 && cVar.f488k == 0) {
            return cVar.G();
        }
        return false;
    }

    @Override // ai.a, ai.e
    public final void dispose() {
        super.dispose();
    }

    @Override // ai.a, ai.e
    public final void g(Canvas canvas, int i10, int i11, float f10) {
        super.g(canvas, i10, i11, f10);
    }

    @Override // ai.e
    public final short getType() {
        return (short) 11;
    }
}
