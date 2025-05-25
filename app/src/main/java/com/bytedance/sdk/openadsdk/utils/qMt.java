package com.bytedance.sdk.openadsdk.utils;

import a6.h;
import android.text.TextUtils;
import androidx.activity.f;

/* compiled from: PAGLogger.java */
/* loaded from: classes.dex */
public class qMt {
    private static boolean Qhi = false;

    public static void Qhi() {
        Qhi = true;
    }

    private static String ac(String str, String str2) {
        if (TextUtils.isEmpty("PangleSDK-6206")) {
            return str;
        }
        return Qhi(f.m(str2, "]-[", str));
    }

    public static void cJ() {
        Qhi = false;
    }

    public static void Qhi(String str, String str2, Object... objArr) {
        Qhi(ac(str, str2), objArr);
    }

    public static void cJ(String str, String str2, Object... objArr) {
        cJ(ac(str, str2), objArr);
    }

    public static void Qhi(String str, String str2) {
        if (Qhi && str2 != null) {
            Qhi(str);
        }
    }

    public static void cJ(String str, String str2) {
        if (Qhi && str2 != null) {
            Qhi(str);
        }
    }

    public static void Qhi(String str, Object... objArr) {
        if (Qhi && objArr != null) {
            Qhi(str);
            Qhi(objArr);
        }
    }

    public static void cJ(String str, Object... objArr) {
        if (Qhi && objArr != null) {
            Qhi(str);
            Qhi(objArr);
        }
    }

    private static String Qhi(String str) {
        return TextUtils.isEmpty("PangleSDK-6206") ? str : Qhi(h.d("[PangleSDK-6206]-[", str, "]"));
    }

    private static String Qhi(Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (Object obj : objArr) {
            if (obj != null) {
                sb2.append(obj.toString());
            } else {
                sb2.append(" null ");
            }
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
