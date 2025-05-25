package com.facebook.ads.redexgen.X;

import java.util.List;

/* loaded from: assets/audience_network.dex */
public abstract class DM extends AbstractC1291Yv implements InterfaceC0808Ft {
    public long A00;
    public InterfaceC0808Ft A01;

    public abstract void A08();

    @Override // com.facebook.ads.redexgen.X.BC
    public final void A07() {
        super.A07();
        this.A01 = null;
    }

    public final void A09(long j10, InterfaceC0808Ft interfaceC0808Ft, long j11) {
        super.A01 = j10;
        this.A01 = interfaceC0808Ft;
        if (j11 == Long.MAX_VALUE) {
            j11 = super.A01;
        }
        this.A00 = j11;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0808Ft
    public final List<C0807Fs> A6x(long j10) {
        return this.A01.A6x(j10 - this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0808Ft
    public final long A7O(int i10) {
        return this.A01.A7O(i10) + this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0808Ft
    public final int A7P() {
        return this.A01.A7P();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0808Ft
    public final int A7r(long j10) {
        return this.A01.A7r(j10 - this.A00);
    }
}
