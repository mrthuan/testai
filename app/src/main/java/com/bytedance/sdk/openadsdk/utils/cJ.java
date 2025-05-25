package com.bytedance.sdk.openadsdk.utils;

import java.lang.ref.SoftReference;

/* compiled from: AdUtils.java */
/* loaded from: classes.dex */
public class cJ {
    public static SoftReference<com.bytedance.sdk.openadsdk.core.model.tP> Qhi;

    public static com.bytedance.sdk.openadsdk.core.model.tP Qhi() {
        SoftReference<com.bytedance.sdk.openadsdk.core.model.tP> softReference = Qhi;
        if (softReference != null) {
            return softReference.get();
        }
        return null;
    }

    public static void Qhi(com.bytedance.sdk.openadsdk.core.model.tP tPVar) {
        if (tPVar == null) {
            return;
        }
        Qhi = new SoftReference<>(tPVar);
    }
}
