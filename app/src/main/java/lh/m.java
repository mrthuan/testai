package lh;

/* compiled from: TableShape.java */
/* loaded from: classes.dex */
public final class m extends b {

    /* renamed from: m  reason: collision with root package name */
    public final l[] f20633m;

    /* renamed from: n  reason: collision with root package name */
    public final int f20634n;

    /* renamed from: o  reason: collision with root package name */
    public final int f20635o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f20636p = false;

    /* renamed from: q  reason: collision with root package name */
    public boolean f20637q = false;

    /* renamed from: r  reason: collision with root package name */
    public boolean f20638r = false;

    /* renamed from: s  reason: collision with root package name */
    public boolean f20639s = false;

    /* renamed from: t  reason: collision with root package name */
    public boolean f20640t = false;

    /* renamed from: u  reason: collision with root package name */
    public boolean f20641u = false;

    public m(int i10, int i11) {
        if (i10 >= 1) {
            if (i11 >= 1) {
                this.f20634n = i10;
                this.f20635o = i11;
                this.f20633m = new l[i10 * i11];
                return;
            }
            throw new IllegalArgumentException("The number of columns must be greater than 1");
        }
        throw new IllegalArgumentException("The number of rows must be greater than 1");
    }

    @Override // lh.b, lh.g
    public final void dispose() {
        eh.a aVar;
        l[] lVarArr = this.f20633m;
        if (lVarArr != null) {
            for (l lVar : lVarArr) {
                if (lVar != null) {
                    n nVar = lVar.f20630e;
                    if (nVar != null) {
                        nVar.dispose();
                    }
                    eh.b bVar = lVar.f20632g;
                    if (bVar != null && (aVar = bVar.f16573f) != null) {
                        aVar.b();
                    }
                }
            }
        }
    }

    @Override // lh.b, lh.g
    public final short getType() {
        return (short) 6;
    }
}
