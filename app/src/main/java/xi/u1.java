package xi;

/* compiled from: SelectPalette.java */
/* loaded from: classes3.dex */
public final class u1 extends wi.e {
    public final /* synthetic */ int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f31802d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(int i10) {
        super(48);
        this.c = i10;
        if (i10 == 1) {
            super(16);
        } else if (i10 != 2) {
        } else {
            super(22);
        }
    }

    @Override // wi.e, xi.l0
    public final void a(wi.d dVar) {
        switch (this.c) {
            case 2:
                dVar.f31241l = this.f31802d;
                return;
            default:
                return;
        }
    }

    @Override // wi.e
    public final wi.e c(wi.c cVar, int i10) {
        switch (this.c) {
            case 0:
                return new u1((int) cVar.readUnsignedInt(), 0);
            case 1:
                return new u1((int) cVar.readUnsignedInt(), 1);
            default:
                return new u1((int) cVar.readUnsignedInt(), 2);
        }
    }

    @Override // wi.e
    public final String toString() {
        int i10 = this.c;
        int i11 = this.f31802d;
        switch (i10) {
            case 0:
                return super.toString() + "\n  index: 0x" + Integer.toHexString(i11);
            case 1:
                return super.toString() + "\n  flags: " + i11;
            default:
                return super.toString() + "\n  mode: " + i11;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public u1(int i10, int i11) {
        this(0);
        this.c = i11;
        if (i11 == 1) {
            this(1);
            this.f31802d = i10;
        } else if (i11 != 2) {
            this.f31802d = i10;
        } else {
            this(2);
            this.f31802d = i10;
        }
    }
}
