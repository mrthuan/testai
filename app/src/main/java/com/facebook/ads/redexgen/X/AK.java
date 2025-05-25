package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class AK {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public long A04;
    public FU A05;

    public final int A00() {
        return this.A05.A00;
    }

    public final int A01(int i10) {
        return this.A05.A04[i10].A00;
    }

    public final int A02(int i10) {
        return this.A05.A04[i10].A00();
    }

    public final int A03(int i10, int i11) {
        return this.A05.A04[i10].A01(i11);
    }

    public final int A04(long j10) {
        return this.A05.A00(j10);
    }

    public final int A05(long j10) {
        return this.A05.A01(j10);
    }

    public final long A06() {
        return this.A05.A01;
    }

    public final long A07() {
        return this.A01;
    }

    public final long A08() {
        return AbstractC06529b.A01(this.A04);
    }

    public final long A09(int i10) {
        return this.A05.A03[i10];
    }

    public final long A0A(int i10, int i11) {
        FS fs = this.A05.A04[i10];
        if (fs.A00 != -1) {
            return fs.A02[i11];
        }
        return -9223372036854775807L;
    }

    public final AK A0B(Object obj, Object obj2, int i10, long j10, long j11) {
        return A0C(obj, obj2, i10, j10, j11, FU.A06);
    }

    public final AK A0C(Object obj, Object obj2, int i10, long j10, long j11, FU fu) {
        this.A02 = obj;
        this.A03 = obj2;
        this.A00 = i10;
        this.A01 = j10;
        this.A04 = j11;
        this.A05 = fu;
        return this;
    }

    public final boolean A0D(int i10) {
        return !this.A05.A04[i10].A02();
    }

    public final boolean A0E(int i10, int i11) {
        FS fs = this.A05.A04[i10];
        return (fs.A00 == -1 || fs.A01[i11] == 0) ? false : true;
    }
}
