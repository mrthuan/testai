package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.dm  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1540dm {
    public InterfaceC1541dn A00;

    public final void A00() {
        if (this.A00 != null) {
            this.A00.onStart();
        }
    }

    public final void A01() {
        if (this.A00 != null) {
            this.A00.onStop();
        }
    }

    public final void A02(InterfaceC1541dn interfaceC1541dn) {
        this.A00 = interfaceC1541dn;
    }
}
