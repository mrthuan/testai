package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.Kf  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0918Kf {
    public static final AtomicReference<InterfaceC0917Ke> A00 = new AtomicReference<>(null);

    public static InterfaceC0917Ke A00() {
        InterfaceC0917Ke errorLogger = A00.get();
        if (errorLogger == null) {
            return new C1214Vs();
        }
        return errorLogger;
    }

    public static void A01(InterfaceC0917Ke interfaceC0917Ke) {
        A00.set(interfaceC0917Ke);
    }
}
