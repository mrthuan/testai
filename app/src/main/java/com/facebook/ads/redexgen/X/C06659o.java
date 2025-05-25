package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.9o  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C06659o implements Comparable<C06659o> {
    public int A00;
    public long A01;
    public Object A02;
    public final AD A03;

    public C06659o(AD ad2) {
        this.A03 = ad2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00 */
    public final int compareTo(C06659o c06659o) {
        if ((this.A02 == null) != (c06659o.A02 == null)) {
            return this.A02 != null ? -1 : 1;
        } else if (this.A02 == null) {
            return 0;
        } else {
            int i10 = this.A00 - c06659o.A00;
            if (i10 != 0) {
                return i10;
            }
            int comparePeriodIndex = IK.A07(this.A01, c06659o.A01);
            return comparePeriodIndex;
        }
    }

    public final void A01(int i10, long j10, Object obj) {
        this.A00 = i10;
        this.A01 = j10;
        this.A02 = obj;
    }
}
