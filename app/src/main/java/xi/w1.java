package xi;

/* compiled from: SetICMMode.java */
/* loaded from: classes3.dex */
public final class w1 extends wi.e {
    public final /* synthetic */ int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f31814d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(int i10) {
        super(98);
        this.c = i10;
        if (i10 != 1) {
        } else {
            super(20);
        }
    }

    @Override // wi.e, xi.l0
    public final void a(wi.d dVar) {
        switch (this.c) {
            case 0:
                return;
            default:
                dVar.f31247r = this.f31814d;
                return;
        }
    }

    @Override // wi.e
    public final wi.e c(wi.c cVar, int i10) {
        switch (this.c) {
            case 0:
                return new w1((int) cVar.readUnsignedInt(), 0);
            default:
                return new w1((int) cVar.readUnsignedInt(), 1);
        }
    }

    @Override // wi.e
    public final String toString() {
        int i10 = this.c;
        int i11 = this.f31814d;
        switch (i10) {
            case 0:
                return super.toString() + "\n  mode: " + i11;
            default:
                return super.toString() + "\n  mode: " + i11;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w1(int i10, int i11) {
        this(0);
        this.c = i11;
        if (i11 != 1) {
            this.f31814d = i10;
            return;
        }
        this(1);
        this.f31814d = i10;
    }
}
