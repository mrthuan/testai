package xi;

/* compiled from: EOF.java */
/* loaded from: classes3.dex */
public final class y extends wi.e {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(int i10) {
        super(14);
        this.c = i10;
        if (i10 != 1) {
        } else {
            super(52);
        }
    }

    @Override // wi.e
    public final wi.e c(wi.c cVar, int i10) {
        switch (this.c) {
            case 0:
                cVar.c(i10);
                return new y(0);
            default:
                return this;
        }
    }

    @Override // wi.e, xi.l0
    public final void a(wi.d dVar) {
    }
}
