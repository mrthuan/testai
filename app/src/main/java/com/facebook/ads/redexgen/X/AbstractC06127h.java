package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.7h  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract /* synthetic */ class AbstractC06127h {
    public static String[] A00 = {"eg92fcTjjit3knujFNeF3jCgE", "wQI", "H4QQen54nNBlohKLmxn", "uQLRt", "", "7rMeuqy2Hxf60lom92u6Rd8CNEVHdO75", "nQvnpoALZKO0zXY3RitAVIcIBau4iEu2", "QVqJZlmp68WGEVHWqur9ZFJ1n6Qx3EE6"};

    public static /* synthetic */ boolean A00(AtomicReference atomicReference, Object obj, Object obj2) {
        do {
            boolean compareAndSet = atomicReference.compareAndSet(obj, obj2);
            String[] strArr = A00;
            if (strArr[0].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A00;
            strArr2[0] = "d3mP1dLinypQOVfqy5TgVscMj";
            strArr2[4] = "";
            if (compareAndSet) {
                return true;
            }
        } while (atomicReference.get() == obj);
        return false;
    }
}
