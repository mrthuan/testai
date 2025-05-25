package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Gp  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0828Gp {
    public final int A00;
    public final C0825Gm A01;
    public final Object A02;
    public final AG[] A03;

    public C0828Gp(AG[] agArr, InterfaceC0824Gl[] interfaceC0824GlArr, Object obj) {
        this.A03 = agArr;
        this.A01 = new C0825Gm(interfaceC0824GlArr);
        this.A02 = obj;
        this.A00 = agArr.length;
    }

    public final boolean A00(int i10) {
        return this.A03[i10] != null;
    }

    public final boolean A01(C0828Gp c0828Gp) {
        if (c0828Gp == null || c0828Gp.A01.A01 != this.A01.A01) {
            return false;
        }
        for (int i10 = 0; i10 < this.A01.A01; i10++) {
            if (!A02(c0828Gp, i10)) {
                return false;
            }
        }
        return true;
    }

    public final boolean A02(C0828Gp c0828Gp, int i10) {
        return c0828Gp != null && IK.A0g(this.A03[i10], c0828Gp.A03[i10]) && IK.A0g(this.A01.A00(i10), c0828Gp.A01.A00(i10));
    }
}
