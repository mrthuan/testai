package com.bykv.vk.openvk.preload.geckox.f.a;

import androidx.activity.r;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: NormalFileLoader.java */
/* loaded from: classes.dex */
public final class c extends a {
    public c(File file) {
        super(file);
    }

    @Override // com.bykv.vk.openvk.preload.geckox.f.a.a
    public final InputStream a(File file, String str) {
        File file2 = new File(file, r.g(new StringBuilder("res"), File.separator, str));
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            GeckoLogger.d("gecko-debug-tag", "NormalFileLoader, file:", file2.getAbsolutePath());
            return new FileInputStream(file2.getCanonicalFile());
        }
        throw new IOException("file not found");
    }

    @Override // com.bykv.vk.openvk.preload.geckox.f.a.a
    public final boolean b(File file, String str) {
        return new File(file, r.g(new StringBuilder("res"), File.separator, str)).exists();
    }
}
