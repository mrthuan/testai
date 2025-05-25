package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.2B  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C2B {
    public static C2A A00;
    public static final AtomicBoolean A01 = new AtomicBoolean();

    public static C2A A00(C1313Zr c1313Zr) {
        if (A00 == null) {
            A00 = new C2A(c1313Zr);
        }
        return A00;
    }

    public static void A01(C1313Zr c1313Zr) {
        if (AbstractC0879Ip.A0B(c1313Zr)) {
            A03(c1313Zr);
        }
    }

    public static void A02(C1313Zr c1313Zr) {
        if (AbstractC0879Ip.A0A(c1313Zr)) {
            A03(c1313Zr);
        }
    }

    public static void A03(C1313Zr c1313Zr) {
        if (A01.compareAndSet(false, true)) {
            ExecutorC0959Lx.A01.execute(new C1407bQ(c1313Zr));
        }
    }
}
