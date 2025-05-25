package com.bytedance.sdk.component.cJ.Qhi.cJ;

/* compiled from: Segment.java */
/* loaded from: classes.dex */
final class Tgh {
    boolean CJ;
    final byte[] Qhi;
    Tgh ROR;
    Tgh Tgh;

    /* renamed from: ac  reason: collision with root package name */
    int f8353ac;
    int cJ;

    /* renamed from: fl  reason: collision with root package name */
    boolean f8354fl;

    public Tgh() {
        this.Qhi = new byte[8192];
        this.f8354fl = true;
        this.CJ = false;
    }

    public final Tgh Qhi() {
        this.CJ = true;
        return new Tgh(this.Qhi, this.cJ, this.f8353ac, true, false);
    }

    public final Tgh cJ() {
        Tgh tgh;
        Tgh tgh2 = this.Tgh;
        if (tgh2 != this) {
            tgh = tgh2;
        } else {
            tgh = null;
        }
        Tgh tgh3 = this.ROR;
        if (tgh3 != null) {
            tgh3.Tgh = tgh2;
        }
        Tgh tgh4 = this.Tgh;
        if (tgh4 != null) {
            tgh4.ROR = tgh3;
        }
        this.Tgh = null;
        this.ROR = null;
        return tgh;
    }

    public final Tgh Qhi(Tgh tgh) {
        tgh.ROR = this;
        tgh.Tgh = this.Tgh;
        this.Tgh.ROR = tgh;
        this.Tgh = tgh;
        return tgh;
    }

    public Tgh(byte[] bArr, int i10, int i11, boolean z10, boolean z11) {
        this.Qhi = bArr;
        this.cJ = i10;
        this.f8353ac = i11;
        this.CJ = z10;
        this.f8354fl = z11;
    }
}
