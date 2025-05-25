package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.hpZ;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.zc;
import com.bytedance.sdk.openadsdk.utils.js;

/* compiled from: AppInfo.java */
/* loaded from: classes.dex */
public class Qhi {
    private static String Qhi;

    public static String CJ() {
        return js.ROR();
    }

    public static String Qhi() {
        return "open_news";
    }

    public static String ROR() {
        if (!TextUtils.isEmpty(Qhi)) {
            return Qhi;
        }
        String Qhi2 = com.bytedance.sdk.openadsdk.core.hm.Qhi("sdk_app_sha1", 259200000L);
        Qhi = Qhi2;
        if (Qhi(Qhi2)) {
            return Qhi;
        }
        String Qhi3 = com.bytedance.sdk.component.utils.ac.Qhi(HzH.Qhi());
        Qhi = Qhi3;
        if (Qhi(Qhi3)) {
            String upperCase = Qhi.toUpperCase();
            Qhi = upperCase;
            com.bytedance.sdk.openadsdk.core.hm.Qhi("sdk_app_sha1", upperCase);
            return Qhi;
        }
        return "";
    }

    public static String Tgh() {
        return hpZ.ROR(HzH.Qhi());
    }

    public static String ac() {
        return BuildConfig.VERSION_NAME;
    }

    public static String cJ() {
        return "1371";
    }

    public static String fl() {
        return com.bytedance.sdk.openadsdk.core.hm.cJ().Tgh();
    }

    public static String Qhi(Context context) {
        return zc.Qhi(context);
    }

    private static boolean Qhi(String str) {
        String[] split;
        if (TextUtils.isEmpty(str) || (split = str.split(":")) == null || split.length < 20) {
            return false;
        }
        for (String str2 : split) {
            if (!"00".equals(str2)) {
                return true;
            }
        }
        return false;
    }
}
