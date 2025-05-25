package lh;

/* compiled from: WPPictureShape.java */
/* loaded from: classes.dex */
public final class s extends p {
    public i E;

    @Override // lh.p, lh.h, lh.e, lh.b, lh.g
    public final void dispose() {
        i iVar = this.E;
        if (iVar != null) {
            iVar.dispose();
        }
    }

    @Override // lh.p, lh.h, lh.e, lh.b, lh.g
    public final short getType() {
        return (short) 0;
    }

    public final void v(i iVar) {
        this.E = iVar;
        if (this.f20604e == null) {
            this.f20604e = iVar.f20604e;
        }
    }
}
