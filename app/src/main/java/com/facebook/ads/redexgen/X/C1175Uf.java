package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Uf  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1175Uf implements O7 {
    public final WeakReference<BZ> A00;

    public C1175Uf(BZ bz) {
        this.A00 = new WeakReference<>(bz);
    }

    public /* synthetic */ C1175Uf(BZ bz, C0710Bk c0710Bk) {
        this(bz);
    }

    @Override // com.facebook.ads.redexgen.X.O7
    public final void AC8(boolean z10) {
        BZ cardLayout = this.A00.get();
        if (cardLayout != null) {
            cardLayout.A04 = z10;
            cardLayout.A04();
        }
    }
}
