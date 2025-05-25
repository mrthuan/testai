package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class XK implements InterfaceC0808Ft {
    public final long[] A00;
    public final C0807Fs[] A01;

    public XK(C0807Fs[] c0807FsArr, long[] jArr) {
        this.A01 = c0807FsArr;
        this.A00 = jArr;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0808Ft
    public final List<C0807Fs> A6x(long j10) {
        int A0B = IK.A0B(this.A00, j10, true, false);
        if (A0B == -1 || this.A01[A0B] == null) {
            return Collections.emptyList();
        }
        return Collections.singletonList(this.A01[A0B]);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0808Ft
    public final long A7O(int i10) {
        boolean z10 = true;
        AbstractC0844Hf.A03(i10 >= 0);
        if (i10 >= this.A00.length) {
            z10 = false;
        }
        AbstractC0844Hf.A03(z10);
        return this.A00[i10];
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0808Ft
    public final int A7P() {
        return this.A00.length;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0808Ft
    public final int A7r(long j10) {
        int A0A = IK.A0A(this.A00, j10, false, false);
        int index = this.A00.length;
        if (A0A < index) {
            return A0A;
        }
        return -1;
    }
}
