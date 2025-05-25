package com.facebook.ads.redexgen.X;

import java.util.concurrent.Executor;

/* loaded from: assets/audience_network.dex */
public final class MH {
    public static MH A02;
    public final C1199Vd A00;
    public final MJ A01;

    public MH(C1314Zs c1314Zs, Executor executor, C8W c8w) {
        this.A01 = new MJ(c1314Zs);
        this.A00 = new C1199Vd(executor, c8w, c1314Zs);
    }

    private void A00() {
        this.A01.A03(this.A00);
    }

    public static void A01(C1314Zs c1314Zs, Executor executor, C8W c8w) {
        if (!C0877Im.A1S(c1314Zs)) {
            return;
        }
        if (A02 == null) {
            A02 = new MH(c1314Zs, executor, c8w);
            A02.A00();
            return;
        }
        A02.A02(c8w);
    }

    private void A02(C8W c8w) {
        this.A00.A07(c8w);
    }
}
