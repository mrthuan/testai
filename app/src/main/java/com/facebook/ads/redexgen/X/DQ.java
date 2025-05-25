package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class DQ extends AbstractC1248Xb implements InterfaceC0787Eq {
    public long A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final Uri A04;
    public final C0 A05;
    public final InterfaceC0837Gy A06;
    public final Object A07;
    public final String A08;

    public DQ(Uri uri, InterfaceC0837Gy interfaceC0837Gy, C0 c02, int i10, String str, int i11, Object obj) {
        this.A04 = uri;
        this.A06 = interfaceC0837Gy;
        this.A05 = c02;
        this.A03 = i10;
        this.A08 = str;
        this.A02 = i11;
        this.A00 = -9223372036854775807L;
        this.A07 = obj;
    }

    private void A00(long j10, boolean z10) {
        this.A00 = j10;
        this.A01 = z10;
        A01(new XS(this.A00, this.A01, false, this.A07), null);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1248Xb
    public final void A02() {
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1248Xb
    public final void A03(ZB zb2, boolean z10) {
        A00(this.A00, false);
    }

    @Override // com.facebook.ads.redexgen.X.Ev
    public final XU A56(Et et, InterfaceC0830Gr interfaceC0830Gr) {
        AbstractC0844Hf.A03(et.A02 == 0);
        return new C0757Dg(this.A04, this.A06.A4t(), this.A05.A4x(), this.A03, A00(et), this, interfaceC0830Gr, this.A08, this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.Ev
    public final void AAo() throws IOException {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0787Eq
    public final void ADc(long j10, boolean z10) {
        if (j10 == -9223372036854775807L) {
            j10 = this.A00;
        }
        if (this.A00 == j10 && this.A01 == z10) {
            return;
        }
        A00(j10, z10);
    }

    @Override // com.facebook.ads.redexgen.X.Ev
    public final void AF3(XU xu) {
        ((C0757Dg) xu).A0R();
    }
}
