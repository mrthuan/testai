package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class TN implements C5W {
    public final /* synthetic */ C5Q A00;
    public final /* synthetic */ C9Z A01;

    public TN(C9Z c9z, C5Q c5q) {
        this.A01 = c9z;
        this.A00 = c5q;
    }

    @Override // com.facebook.ads.redexgen.X.C5W
    public final boolean A9J() {
        boolean A0Z;
        boolean A0a;
        if (!this.A01.A0Y()) {
            A0Z = this.A01.A0Z();
            if (A0Z) {
                return true;
            }
            A0a = this.A01.A0a();
            return A0a;
        }
        this.A01.A0X(this.A00);
        return true;
    }
}
