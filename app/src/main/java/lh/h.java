package lh;

/* compiled from: LineShape.java */
/* loaded from: classes.dex */
public class h extends e {

    /* renamed from: p  reason: collision with root package name */
    public d f20621p;

    /* renamed from: q  reason: collision with root package name */
    public d f20622q;

    @Override // lh.e, lh.b, lh.g
    public short getType() {
        return (short) 4;
    }

    public final void q(byte b10, int i10, int i11) {
        d dVar = this.f20622q;
        if (dVar == null) {
            this.f20622q = new d(b10, i10, i11);
            return;
        }
        dVar.c = b10;
        dVar.f20613a = i10;
        dVar.f20614b = i11;
    }

    public final void r(byte b10, int i10, int i11) {
        d dVar = this.f20621p;
        if (dVar == null) {
            this.f20621p = new d(b10, i10, i11);
            return;
        }
        dVar.c = b10;
        dVar.f20613a = i10;
        dVar.f20614b = i11;
    }

    public final boolean s() {
        if (this.f20622q != null) {
            return true;
        }
        return false;
    }

    public final boolean t() {
        if (this.f20621p != null) {
            return true;
        }
        return false;
    }

    @Override // lh.e, lh.b, lh.g
    public void dispose() {
    }
}
