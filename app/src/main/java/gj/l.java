package gj;

import android.graphics.Canvas;
import lib.zj.office.java.awt.Rectangle;

/* compiled from: ParagraphView.java */
/* loaded from: classes3.dex */
public class l extends ai.a {

    /* renamed from: p  reason: collision with root package name */
    public a f17862p;

    public l(zh.h hVar) {
        this.f479a = hVar;
    }

    @Override // ai.a, ai.e
    public Rectangle A(long j10, Rectangle rectangle, boolean z10) {
        if (this.f490m == null) {
            getDocument();
        }
        ai.e u7 = u(j10, 6, z10);
        if (u7 != null) {
            u7.A(j10, rectangle, z10);
        }
        rectangle.f20688x += this.f480b;
        rectangle.f20689y += this.c;
        return rectangle;
    }

    @Override // ai.a, ai.e
    public long C(int i10, int i11, boolean z10) {
        if (this.f490m == null) {
            getDocument();
        }
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
        if (eVar != null) {
            return eVar.C(i12, i13, z10);
        }
        return -1L;
    }

    @Override // ai.a, ai.e
    public void dispose() {
        super.dispose();
        a aVar = this.f17862p;
        if (aVar != null) {
            aVar.dispose();
        }
    }

    @Override // ai.a, ai.e
    public void g(Canvas canvas, int i10, int i11, float f10) {
        if (this.f490m == null) {
            getDocument();
        }
        int i12 = ((int) (this.f480b * f10)) + i10;
        int i13 = ((int) (this.c * f10)) + i11;
        a aVar = this.f17862p;
        if (aVar != null) {
            aVar.g(canvas, i12, i13, f10);
        }
        super.g(canvas, i10, i11, f10);
    }

    @Override // ai.e
    public short getType() {
        return (short) 5;
    }
}
