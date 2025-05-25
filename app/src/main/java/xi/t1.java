package xi;

import lib.zj.office.java.awt.geom.AffineTransform;

/* compiled from: SelectObject.java */
/* loaded from: classes3.dex */
public final class t1 extends wi.e {
    public final /* synthetic */ int c;

    /* renamed from: d  reason: collision with root package name */
    public final int f31798d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(int i10) {
        super(37);
        this.c = i10;
        if (i10 == 1) {
            super(17);
        } else if (i10 != 2) {
        } else {
            super(21);
        }
    }

    @Override // wi.e, xi.l0
    public final void a(wi.d dVar) {
        l0 l0Var;
        int i10 = this.c;
        int i11 = 2;
        int i12 = this.f31798d;
        switch (i10) {
            case 0:
                if (i12 < 0) {
                    l0[] l0VarArr = d2.f31679a;
                    if (i12 < 0) {
                        int i13 = Integer.MIN_VALUE ^ i12;
                        if (i13 < 20) {
                            l0Var = d2.f31679a[i13];
                            if (l0Var == null) {
                                throw new UnsupportedOperationException(b.a.c("Stock object not yet supported: ", i13));
                            }
                        } else {
                            throw new IllegalArgumentException(b.a.c("Stock object is out of bounds: ", i13));
                        }
                    } else {
                        throw new IllegalArgumentException(b.a.c("Value does not represent a stock object: ", i12));
                    }
                } else {
                    l0Var = dVar.f31237h[i12];
                }
                if (l0Var != null) {
                    l0Var.a(dVar);
                    return;
                }
                return;
            case 1:
                if (i12 == 8) {
                    dVar.f31234e = false;
                    return;
                } else if (i12 == 5) {
                    AffineTransform.getScaleInstance(0.0254d, 0.0254d);
                    return;
                } else if (i12 == 3) {
                    AffineTransform.getScaleInstance(0.01d, 0.01d);
                    return;
                } else if (i12 == 7) {
                    dVar.f31234e = true;
                    dVar.g();
                    return;
                } else if (i12 == 4) {
                    AffineTransform.getScaleInstance(0.254d, 0.254d);
                    return;
                } else if (i12 == 2) {
                    AffineTransform.getScaleInstance(0.1d, 0.1d);
                    return;
                } else if (i12 == 1) {
                    AffineTransform.getScaleInstance(1.0d, -1.0d);
                    return;
                } else if (i12 == 6) {
                    double d10 = wi.d.B;
                    AffineTransform.getScaleInstance(d10, d10);
                    return;
                } else {
                    return;
                }
            default:
                if (i12 != 3) {
                    if (i12 == 4) {
                        i11 = 4;
                    } else if (i12 == 1 || i12 == 2) {
                        i11 = 8;
                    } else {
                        i11 = 1;
                    }
                }
                dVar.f31248s = i11;
                return;
        }
    }

    @Override // wi.e
    public final wi.e c(wi.c cVar, int i10) {
        switch (this.c) {
            case 0:
                return new t1((int) cVar.readUnsignedInt(), 0);
            case 1:
                return new t1((int) cVar.readUnsignedInt(), 1);
            default:
                return new t1((int) cVar.readUnsignedInt(), 2);
        }
    }

    @Override // wi.e
    public final String toString() {
        int i10 = this.c;
        int i11 = this.f31798d;
        switch (i10) {
            case 0:
                return super.toString() + "\n  index: 0x" + Integer.toHexString(i11);
            case 1:
                return super.toString() + "\n  mode: " + i11;
            default:
                return super.toString() + "\n  mode: " + i11;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t1(int i10, int i11) {
        this(0);
        this.c = i11;
        if (i11 == 1) {
            this(1);
            this.f31798d = i10;
        } else if (i11 != 2) {
            this.f31798d = i10;
        } else {
            this(2);
            this.f31798d = i10;
        }
    }
}
