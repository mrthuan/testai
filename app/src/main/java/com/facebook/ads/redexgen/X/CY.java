package com.facebook.ads.redexgen.X;

import java.util.Comparator;
import java.util.TreeSet;

/* loaded from: assets/audience_network.dex */
public final class CY implements InterfaceC1234Wn, Comparator<HT> {
    public long A00;
    public final long A01;
    public final TreeSet<HT> A02 = new TreeSet<>(this);

    public CY(long j10) {
        this.A01 = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* renamed from: A00 */
    public final int compare(HT ht, HT ht2) {
        if (ht.A00 - ht2.A00 == 0) {
            return ht.compareTo(ht2);
        }
        return ht.A00 < ht2.A00 ? -1 : 1;
    }

    private void A01(HP hp2, long j10) {
        while (this.A00 + j10 > this.A01 && !this.A02.isEmpty()) {
            try {
                hp2.AFc(this.A02.first());
            } catch (HN unused) {
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.HO
    public final void ADe(HP hp2, HT ht) {
        this.A02.add(ht);
        this.A00 += ht.A01;
        A01(hp2, 0L);
    }

    @Override // com.facebook.ads.redexgen.X.HO
    public final void ADf(HP hp2, HT ht) {
        this.A02.remove(ht);
        this.A00 -= ht.A01;
    }

    @Override // com.facebook.ads.redexgen.X.HO
    public final void ADg(HP hp2, HT ht, HT ht2) {
        ADf(hp2, ht);
        ADe(hp2, ht2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1234Wn
    public final void ADh(HP hp2, String str, long j10, long j11) {
        A01(hp2, j11);
    }
}
