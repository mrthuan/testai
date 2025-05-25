package com.bykv.vk.openvk.preload.geckox.utils;

import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;

/* compiled from: ExceptionUtils.java */
/* loaded from: classes.dex */
public final class b {
    public static void a(Throwable th2) {
        if (!d.a()) {
            GeckoLogger.w("gecko-debug-tag", "throwIfDebug:", th2);
        } else {
            GeckoLogger.e("gecko-debug-tag", "throwIfDebug:", th2);
            throw new RuntimeException(th2);
        }
    }
}
