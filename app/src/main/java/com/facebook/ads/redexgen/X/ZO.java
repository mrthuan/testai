package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class ZO implements InterfaceC06388n {
    public final /* synthetic */ String[] A00;

    public ZO(String[] strArr) {
        this.A00 = strArr;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC06388n
    public final boolean A2w(String str) {
        for (String str2 : this.A00) {
            if (str2.equals(str)) {
                return false;
            }
        }
        return true;
    }
}
