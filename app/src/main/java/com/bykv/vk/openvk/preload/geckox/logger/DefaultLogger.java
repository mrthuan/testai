package com.bykv.vk.openvk.preload.geckox.logger;

import com.bykv.vk.openvk.preload.geckox.c.b;

/* loaded from: classes.dex */
class DefaultLogger implements Logger {
    @Override // com.bykv.vk.openvk.preload.geckox.logger.Logger
    public void d(String str, Object... objArr) {
        if (objArr == null) {
            return;
        }
        try {
            b.a().f7555a.a(objArr);
        } catch (Throwable unused) {
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.logger.Logger
    public void w(String str, String str2) {
    }

    @Override // com.bykv.vk.openvk.preload.geckox.logger.Logger
    public void w(String str, String str2, Throwable th2) {
    }

    @Override // com.bykv.vk.openvk.preload.geckox.logger.Logger
    public void e(String str, String str2, Throwable th2) {
    }
}
