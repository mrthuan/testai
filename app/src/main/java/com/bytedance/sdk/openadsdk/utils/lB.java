package com.bytedance.sdk.openadsdk.utils;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;

/* compiled from: TestHelperUtils.java */
/* loaded from: classes.dex */
public class lB {
    private static String Qhi;

    public static boolean Qhi() {
        return com.bytedance.sdk.component.utils.ABk.CJ() && com.bytedance.sdk.openadsdk.core.hm.cJ().HzH() && com.bytedance.sdk.openadsdk.core.hm.cJ().kYc();
    }

    public static boolean ac() {
        return false;
    }

    public static String cJ() {
        if (TextUtils.isEmpty(Qhi)) {
            Qhi = new String(Base64.decode("ZGV2aWNlX2lk", 0));
        }
        return Qhi;
    }

    public static String Qhi(String str) {
        try {
            if (Qhi()) {
                String tP = com.bytedance.sdk.openadsdk.core.hm.cJ().tP();
                if (TextUtils.isEmpty(tP)) {
                    return str;
                }
                "AnyDoorId=".concat(String.valueOf(tP));
                return Uri.parse(str).buildUpon().appendQueryParameter(cJ(), tP).appendQueryParameter("aid", "5001121").toString();
            }
            return str;
        } catch (Throwable unused) {
            return str;
        }
    }
}
