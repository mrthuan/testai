package com.facebook.ads.redexgen.X;

import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.8q  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C06418q {
    public static C06418q A00 = new C06418q();

    public static C06418q A00() {
        return A00;
    }

    public final ZN A01(C7j c7j, boolean z10) {
        return new ZN(c7j, z10, new C6V());
    }

    public final Map<String, String> A02(C7j c7j) {
        try {
            return A01(c7j, false).A05();
        } catch (Throwable th2) {
            c7j.A07().A3y(th2);
            return C06338i.A01(c7j);
        }
    }
}
