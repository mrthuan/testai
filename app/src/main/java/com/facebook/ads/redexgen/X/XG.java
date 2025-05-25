package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class XG implements InterfaceC0808Ft {
    public final List<C0807Fs> A00;

    public XG(List<C0807Fs> list) {
        this.A00 = Collections.unmodifiableList(list);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0808Ft
    public final List<C0807Fs> A6x(long j10) {
        return j10 >= 0 ? this.A00 : Collections.emptyList();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0808Ft
    public final long A7O(int i10) {
        AbstractC0844Hf.A03(i10 == 0);
        return 0L;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0808Ft
    public final int A7P() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0808Ft
    public final int A7r(long j10) {
        return j10 < 0 ? 0 : -1;
    }
}
