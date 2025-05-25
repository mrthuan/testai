package com.bykv.vk.openvk.preload.geckox.buffer.a;

import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import java.io.File;
import java.io.IOException;

/* compiled from: BufferPolicy.java */
/* loaded from: classes.dex */
public final class a {
    public static com.bykv.vk.openvk.preload.geckox.buffer.a a(File file, long j10) {
        com.bykv.vk.openvk.preload.geckox.buffer.a b10 = b(file, j10);
        GeckoLogger.d("gecko-debug-tag", "buffer type:" + b10.getClass());
        return b10;
    }

    private static com.bykv.vk.openvk.preload.geckox.buffer.a b(File file, long j10) {
        if (j10 <= 0) {
            try {
                return new b(file);
            } catch (Exception e10) {
                throw new IOException("create FileBuffer failed! file:" + file.getAbsolutePath() + " caused by:" + e10.getMessage(), e10);
            }
        }
        try {
            return new c(j10, file);
        } catch (Exception e11) {
            throw new RuntimeException("create random access file failed! file:" + file.getAbsolutePath() + " caused by:" + e11.getMessage(), e11);
        }
    }
}
