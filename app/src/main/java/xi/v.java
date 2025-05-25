package xi;

/* compiled from: DeleteObject.java */
/* loaded from: classes3.dex */
public final class v extends wi.e {
    public final /* synthetic */ int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f31803d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(int i10) {
        super(40);
        this.c = i10;
        if (i10 != 1) {
        } else {
            super(58);
        }
    }

    @Override // wi.e, xi.l0
    public final void a(wi.d dVar) {
        int i10 = this.c;
        int i11 = this.f31803d;
        switch (i10) {
            case 0:
                dVar.f31237h[i11] = null;
                return;
            default:
                dVar.f31246q = i11;
                return;
        }
    }

    @Override // wi.e
    public final wi.e c(wi.c cVar, int i10) {
        switch (this.c) {
            case 0:
                return new v((int) cVar.readUnsignedInt(), 0);
            default:
                return new v((int) cVar.readUnsignedInt(), 1);
        }
    }

    @Override // wi.e
    public final String toString() {
        int i10 = this.c;
        int i11 = this.f31803d;
        switch (i10) {
            case 0:
                return super.toString() + "\n  index: 0x" + Integer.toHexString(i11);
            default:
                return super.toString() + "\n  limit: " + i11;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v(int i10, int i11) {
        this(0);
        this.c = i11;
        if (i11 != 1) {
            this.f31803d = i10;
            return;
        }
        this(1);
        this.f31803d = i10;
    }
}
