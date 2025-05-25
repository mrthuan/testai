package gj;

import android.graphics.Rect;
import lib.zj.office.java.awt.Rectangle;

/* compiled from: RowView.java */
/* loaded from: classes3.dex */
public final class m extends ai.a {
    public m(zh.h hVar) {
        this.f479a = hVar;
    }

    @Override // ai.a, ai.e
    public final Rectangle A(long j10, Rectangle rectangle, boolean z10) {
        ai.e u7 = u(j10, 11, z10);
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
        if (eVar != null && i13 > eVar.getY()) {
            while (eVar != null) {
                if (i13 >= eVar.getY()) {
                    if (i13 < eVar.e((byte) 1) + eVar.getY() && i12 >= eVar.getX()) {
                        if (i12 <= eVar.e((byte) 0) + eVar.getX()) {
                            break;
                        }
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

    @Override // ai.a, ai.e
    public final void dispose() {
        super.dispose();
    }

    @Override // ai.e
    public final short getType() {
        return (short) 10;
    }

    @Override // ai.a, ai.e
    public final boolean h(Rect rect, int i10, int i11, float f10) {
        return true;
    }
}
