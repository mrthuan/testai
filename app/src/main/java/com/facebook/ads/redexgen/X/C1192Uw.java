package com.facebook.ads.redexgen.X;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Uw  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1192Uw extends AbstractC05364c<TR> {
    public int A00;
    public int A01;
    public int A02;
    public MR A03;
    public C1102Rk A04;
    public String A05;
    public List<QK> A06;
    public final SparseBooleanArray A07 = new SparseBooleanArray();
    public final AbstractC1456cD A08;
    public final C05906f A09;
    public final C1314Zs A0A;
    public final J7 A0B;
    public final W7 A0C;
    public final C0957Lv A0D;
    public final C0711Bl A0E;
    public final N5 A0F;

    public C1192Uw(C1314Zs c1314Zs, List<QK> list, AbstractC1456cD abstractC1456cD, J7 j72, W7 w7, MR mr, String str, C0711Bl c0711Bl, N5 n52) {
        this.A0A = c1314Zs;
        this.A0B = j72;
        this.A0C = w7;
        this.A09 = w7.A10();
        this.A04 = w7.A1A();
        this.A0D = w7.A19();
        this.A03 = mr;
        this.A08 = abstractC1456cD;
        this.A06 = list;
        this.A05 = str;
        this.A0E = c0711Bl;
        this.A0F = n52;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC05364c
    /* renamed from: A01 */
    public final TR A0C(ViewGroup viewGroup, int i10) {
        return new TR(OI.A00(new C1025Ol(this.A0A, this.A0B, this.A03, this.A08, null, this.A04, this.A0D).A0K(this.A0F).A0H(this.A0C).A0M(), this.A0C, this.A05, this.A0E), this.A07, this.A04, this.A06.size(), this.A0A, this.A08.A1Q());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC05364c
    /* renamed from: A02 */
    public final void A0D(TR tr, int i10) {
        tr.A0k(this.A04);
        tr.A0j(this.A06.get(i10), this.A0B, this.A09, this.A0D, this.A05, this.A00, this.A02, this.A01);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC05364c
    public final int A0E() {
        return this.A06.size();
    }

    public final void A0F(int i10, int i11, int i12) {
        boolean needsUpdate = i10 != this.A00;
        this.A00 = i10;
        this.A02 = i11;
        this.A01 = i12;
        if (needsUpdate) {
            A06();
        }
    }

    public final void A0G(C1102Rk c1102Rk) {
        this.A04 = c1102Rk;
    }
}
