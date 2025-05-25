package com.bykv.vk.openvk.preload.geckox.f.a;

import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import java.io.File;
import java.io.InputStream;

/* compiled from: MyArchiveFileLoader.java */
/* loaded from: classes.dex */
public final class b extends a {
    public b(File file) {
        super(file);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.f.a.a
    public final InputStream a(File file, String str) {
        GeckoLogger.d("gecko-debug-tag", "MyArchiveFileLoader, file:", new File(str).getCanonicalPath());
        return null;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.f.a.a
    public final boolean b(File file, String str) {
        new File(str).getCanonicalPath();
        return false;
    }
}
