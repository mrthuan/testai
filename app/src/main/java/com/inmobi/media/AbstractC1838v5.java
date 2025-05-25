package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.inmobi.media.v5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1838v5 {
    public static C1851w5 a(Context context, String fileKey) {
        ConcurrentHashMap concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2;
        kotlin.jvm.internal.g.e(context, "context");
        kotlin.jvm.internal.g.e(fileKey, "fileKey");
        String concat = "com.im.keyValueStore.".concat(fileKey);
        concurrentHashMap = C1851w5.f15578b;
        C1851w5 c1851w5 = (C1851w5) concurrentHashMap.get(concat);
        if (c1851w5 == null) {
            C1851w5 c1851w52 = new C1851w5(context, concat);
            concurrentHashMap2 = C1851w5.f15578b;
            C1851w5 c1851w53 = (C1851w5) concurrentHashMap2.putIfAbsent(concat, c1851w52);
            if (c1851w53 != null) {
                return c1851w53;
            }
            return c1851w52;
        }
        return c1851w5;
    }
}
