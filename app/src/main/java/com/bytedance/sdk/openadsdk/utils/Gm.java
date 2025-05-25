package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import androidx.activity.r;
import java.io.Closeable;
import java.io.File;

/* compiled from: FileCacheUtils.java */
/* loaded from: classes.dex */
public class Gm {
    private static String Qhi;

    public static String Qhi() {
        if (TextUtils.isEmpty(Qhi)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(com.bykv.vk.openvk.component.video.api.ac.Qhi().getCacheDir());
            Qhi = r.g(sb2, File.separator, "proxy_cache");
        }
        return Qhi;
    }

    public static void Qhi(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th2) {
                th2.getMessage();
            }
        }
    }
}
