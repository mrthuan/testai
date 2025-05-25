package com.bykv.vk.openvk.preload.falconx.loader;

import android.content.Context;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.geckox.f.b;
import com.bykv.vk.openvk.preload.geckox.g.c;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import java.io.File;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: GeckoResLoader.java */
/* loaded from: classes.dex */
public final class a implements ILoader {

    /* renamed from: a  reason: collision with root package name */
    public b f7477a;

    /* renamed from: b  reason: collision with root package name */
    public AtomicBoolean f7478b = new AtomicBoolean(false);

    public a(Context context, String str, File file) {
        if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                if (file != null) {
                    this.f7477a = new b(context, str, file);
                    return;
                }
                throw new RuntimeException("resRootDir == null");
            }
            throw new RuntimeException("access key empty");
        }
        throw new RuntimeException("context == null");
    }

    @Override // com.bykv.vk.openvk.preload.falconx.loader.ILoader
    public final boolean exist(String str) {
        if (!this.f7478b.get()) {
            b bVar = this.f7477a;
            if (!bVar.f7590b.get()) {
                if (!TextUtils.isEmpty(str)) {
                    com.bykv.vk.openvk.preload.geckox.f.a a10 = bVar.a(str.trim());
                    return a10.a(a10.f7584b).b(com.bykv.vk.openvk.preload.geckox.f.a.a(a10.f7584b, str));
                }
                throw new RuntimeException("relativePath empty");
            }
            throw new RuntimeException("released");
        }
        throw new RuntimeException("released!");
    }

    @Override // com.bykv.vk.openvk.preload.falconx.loader.ILoader
    public final Map<String, Long> getChannelVersion() {
        return this.f7477a.a();
    }

    @Override // com.bykv.vk.openvk.preload.falconx.loader.ILoader
    public final InputStream getInputStream(String str) {
        if (!this.f7478b.get()) {
            GeckoLogger.d("WebOffline-falcon", "GeckoResLoader ready to load, file:", str);
            b bVar = this.f7477a;
            if (!bVar.f7590b.get()) {
                if (!TextUtils.isEmpty(str)) {
                    com.bykv.vk.openvk.preload.geckox.f.a a10 = bVar.a(str.trim());
                    return a10.a(a10.f7584b).a(com.bykv.vk.openvk.preload.geckox.f.a.a(a10.f7584b, str));
                }
                throw new RuntimeException("relativePath empty");
            }
            throw new RuntimeException("released");
        }
        throw new RuntimeException("released!");
    }

    @Override // com.bykv.vk.openvk.preload.falconx.loader.ILoader
    public final String getResRootDir() {
        return this.f7477a.c;
    }

    @Override // com.bykv.vk.openvk.preload.falconx.loader.ILoader
    public final void release() {
        if (this.f7478b.getAndSet(true)) {
            return;
        }
        b bVar = this.f7477a;
        if (!bVar.f7590b.getAndSet(true)) {
            GeckoLogger.d("Loader", "release version res loader");
            synchronized (bVar.f7589a) {
                for (com.bykv.vk.openvk.preload.geckox.f.a aVar : bVar.f7589a.values()) {
                    if (!aVar.f7586e.getAndSet(true)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(aVar.f7583a);
                        String str = File.separator;
                        sb2.append(str);
                        sb2.append(aVar.f7584b);
                        sb2.append(str);
                        sb2.append("select.lock");
                        com.bykv.vk.openvk.preload.geckox.g.b a10 = com.bykv.vk.openvk.preload.geckox.g.b.a(sb2.toString());
                        GeckoLogger.d("gecko-file-lock", "channel version loader clean");
                        if (aVar.c == null) {
                            a10.a();
                        } else {
                            c.b(aVar.c.getAbsolutePath() + str + "using.lock");
                            a10.a();
                            com.bykv.vk.openvk.preload.geckox.a.c.a(aVar.f7583a + str + aVar.f7584b);
                        }
                    }
                }
                bVar.f7589a.clear();
            }
        }
    }
}
