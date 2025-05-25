package com.facebook.ads.redexgen.X;

import android.util.SparseArray;

/* loaded from: assets/audience_network.dex */
public final class QD {
    public final SparseArray<int[]> A00 = new SparseArray<>();

    public final void A00(int i10, int[] iArr) {
        this.A00.put(i10, iArr);
    }

    public final boolean A01(int i10) {
        return this.A00.indexOfKey(i10) >= 0;
    }

    public final int[] A02(int i10) {
        return this.A00.get(i10);
    }
}
