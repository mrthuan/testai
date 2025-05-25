package lh;

import lib.zj.office.java.awt.Rectangle;

/* compiled from: WPAutoShape.java */
/* loaded from: classes.dex */
public class p extends o {
    public r D;

    @Override // lh.h, lh.e, lh.b, lh.g
    public void dispose() {
        r rVar = this.D;
        if (rVar != null) {
            rVar.dispose();
        }
    }

    @Override // lh.b, lh.g
    public final Rectangle getBounds() {
        r rVar = this.D;
        if (rVar != null) {
            return rVar.f20604e;
        }
        return this.f20604e;
    }

    @Override // lh.h, lh.e, lh.b, lh.g
    public short getType() {
        return (short) 2;
    }
}
