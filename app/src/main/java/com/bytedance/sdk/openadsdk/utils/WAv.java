package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;

/* compiled from: ExternalSpUtils.java */
/* loaded from: classes.dex */
public class WAv {
    public static void Qhi(String str) {
        Qhi("any_door_id", str);
    }

    private static String cJ(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.cJ(null, str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    public static String Qhi() {
        return cJ("any_door_id", null);
    }

    private static void Qhi(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi((String) null, str, str2);
        } catch (Throwable unused) {
        }
    }
}
