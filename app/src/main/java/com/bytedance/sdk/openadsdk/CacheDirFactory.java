package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import androidx.activity.r;
import com.bykv.vk.openvk.component.video.Qhi.Qhi.Qhi.Qhi;
import com.bykv.vk.openvk.component.video.api.Qhi.cJ;
import com.bytedance.sdk.component.utils.ROR;
import com.bytedance.sdk.openadsdk.core.HzH;
import java.io.File;

/* loaded from: classes.dex */
public class CacheDirFactory {
    public static volatile cJ MEDIA_CACHE_DIR = null;
    private static String Qhi = null;
    public static String ROOT_DIR = null;
    public static final int SPLASH_USE_INTERNAL_STORAGE = 1;

    private static cJ Qhi() {
        if (MEDIA_CACHE_DIR == null) {
            synchronized (CacheDirFactory.class) {
                if (MEDIA_CACHE_DIR == null) {
                    Qhi qhi = new Qhi();
                    MEDIA_CACHE_DIR = qhi;
                    qhi.Qhi(getRootDir());
                    MEDIA_CACHE_DIR.CJ();
                }
            }
        }
        return MEDIA_CACHE_DIR;
    }

    public static int getCacheType() {
        return 1;
    }

    public static String getDiskCacheDirPath(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getRootDir());
        return r.g(sb2, File.separator, str);
    }

    public static cJ getICacheDir(int i10) {
        return Qhi();
    }

    public static String getImageCacheDir() {
        if (Qhi == null) {
            Qhi = getDiskCacheDirPath("image");
        }
        return Qhi;
    }

    public static String getRootDir() {
        if (!TextUtils.isEmpty(ROOT_DIR)) {
            return ROOT_DIR;
        }
        File Qhi2 = ROR.Qhi(HzH.Qhi(), com.bytedance.sdk.openadsdk.multipro.cJ.ac(), "tt_ad");
        if (Qhi2.isFile()) {
            Qhi2.delete();
        }
        if (!Qhi2.exists()) {
            Qhi2.mkdirs();
        }
        String absolutePath = Qhi2.getAbsolutePath();
        ROOT_DIR = absolutePath;
        return absolutePath;
    }
}
