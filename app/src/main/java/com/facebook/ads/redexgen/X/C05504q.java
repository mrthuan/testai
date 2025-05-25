package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.4q  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C05504q extends DO implements Comparable<C05504q> {
    public long A00;

    public C05504q() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00 */
    public final int compareTo(C05504q c05504q) {
        if (A04() != c05504q.A04()) {
            return A04() ? 1 : -1;
        }
        long j10 = ((C1292Yw) this).A00 - ((C1292Yw) c05504q).A00;
        if (j10 == 0) {
            long j11 = this.A00;
            long delta = c05504q.A00;
            j10 = j11 - delta;
            if (j10 == 0) {
                return 0;
            }
        }
        return j10 > 0 ? 1 : -1;
    }
}
