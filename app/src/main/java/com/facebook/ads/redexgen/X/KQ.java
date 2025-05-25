package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: assets/audience_network.dex */
public abstract class KQ {
    public static final Set<Object> A00 = Collections.newSetFromMap(new WeakHashMap());
    public static final AtomicBoolean A01 = new AtomicBoolean(true);
    public static final AtomicReference<KO> A02 = new AtomicReference<>();

    public static void A00(Throwable th2, Object obj) throws Throwable {
        if (A01.get()) {
            A00.add(obj);
            AbstractC0918Kf.A00().A9s(3306, th2);
            KO contextRepairHelper = A02.get();
            if (contextRepairHelper != null) {
                contextRepairHelper.AFg(th2, obj);
                return;
            }
            return;
        }
        throw th2;
    }

    public static void A01(boolean z10, KO ko2) {
        A01.set(z10);
        A02.set(ko2);
    }

    public static boolean A02(Object obj) {
        return A00.contains(obj);
    }
}
