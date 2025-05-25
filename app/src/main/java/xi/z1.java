package xi;

/* compiled from: SetPolyFillMode.java */
/* loaded from: classes3.dex */
public final class z1 extends wi.e {
    public final int c;

    public z1() {
        super(19);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0007, code lost:
        if (r0 == 1) goto L5;
     */
    @Override // wi.e, xi.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(wi.d r3) {
        /*
            r2 = this;
            int r0 = r2.c
            r1 = 2
            if (r0 != r1) goto L6
            goto La
        L6:
            r1 = 1
            if (r0 != r1) goto La
            goto Lb
        La:
            r1 = 0
        Lb:
            r3.f31243n = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xi.z1.a(wi.d):void");
    }

    @Override // wi.e
    public final wi.e c(wi.c cVar, int i10) {
        return new z1((int) cVar.readUnsignedInt());
    }

    @Override // wi.e
    public final String toString() {
        return super.toString() + "\n  mode: " + this.c;
    }

    public z1(int i10) {
        this();
        this.c = i10;
    }
}
