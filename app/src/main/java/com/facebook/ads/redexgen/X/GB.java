package com.facebook.ads.redexgen.X;

import android.util.SparseArray;

/* loaded from: assets/audience_network.dex */
public final class GB {
    public G5 A00;
    public G7 A01;
    public final int A02;
    public final int A03;
    public final SparseArray<G9> A08 = new SparseArray<>();
    public final SparseArray<G4> A06 = new SparseArray<>();
    public final SparseArray<G6> A07 = new SparseArray<>();
    public final SparseArray<G4> A04 = new SparseArray<>();
    public final SparseArray<G6> A05 = new SparseArray<>();

    public GB(int i10, int i11) {
        this.A03 = i10;
        this.A02 = i11;
    }

    public final void A00() {
        this.A08.clear();
        this.A06.clear();
        this.A07.clear();
        this.A04.clear();
        this.A05.clear();
        this.A00 = null;
        this.A01 = null;
    }
}
