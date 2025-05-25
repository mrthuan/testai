package com.facebook.ads.redexgen.X;

import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: com.facebook.ads.redexgen.X.bB  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1392bB<K, V> extends AbstractC05072y<K, V> {
    public final /* synthetic */ C1391bA A00;

    public C1392bB(C1391bA c1391bA) {
        this.A00 = c1391bA;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05072y
    public final int A04() {
        return ((AnonymousClass31) this.A00).A00;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05072y
    public final int A05(Object obj) {
        return this.A00.A08(obj);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05072y
    public final int A06(Object obj) {
        return this.A00.A07(obj);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05072y
    public final Map<K, V> A07() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05072y
    public final Object A0B(int i10, int i11) {
        return this.A00.A02[(i10 << 1) + i11];
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05072y
    public final V A0C(int i10, V value) {
        return this.A00.A0C(i10, value);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05072y
    public final void A0D() {
        this.A00.clear();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05072y
    public final void A0E(int i10) {
        this.A00.A0A(i10);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05072y
    public final void A0F(K key, V value) {
        this.A00.put(key, value);
    }
}
