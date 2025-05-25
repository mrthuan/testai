package com.bytedance.sdk.openadsdk.core;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import java.util.Locale;

/* compiled from: IdUtils.java */
/* loaded from: classes.dex */
public class zc {
    private static String CJ;
    private static String Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private static String f9296ac;
    private static String cJ;

    /* renamed from: fl  reason: collision with root package name */
    private static boolean f9297fl;

    private static Context CJ(Context context) {
        if (context == null) {
            return HzH.Qhi();
        }
        return context;
    }

    public static String Qhi(Context context) {
        if (!TextUtils.isEmpty(Qhi)) {
            return Qhi;
        }
        Tgh(context);
        return Qhi;
    }

    private static void Tgh(Context context) {
        Context CJ2 = CJ(context);
        if (CJ2 == null) {
            return;
        }
        Qhi = ac.Qhi(CJ2).cJ("did", (String) null);
    }

    public static String ac(Context context) {
        if (TextUtils.isEmpty(CJ) && !f9297fl) {
            synchronized (zc.class) {
                if (!f9297fl) {
                    fl(context);
                }
            }
        }
        return CJ;
    }

    public static String cJ(Context context) {
        if (f9296ac == null && !f9297fl) {
            synchronized (zc.class) {
                if (!f9297fl) {
                    fl(context);
                }
            }
        }
        return f9296ac;
    }

    @SuppressLint({"HardwareIds"})
    private static void fl(Context context) {
        Context CJ2;
        if (f9297fl || (CJ2 = CJ(context)) == null) {
            return;
        }
        cJ = cJ();
        f9296ac = String.valueOf(Build.TIME);
        CJ = ac.Qhi(CJ2).cJ("uuid", (String) null);
        f9297fl = true;
    }

    public static void Qhi(Context context, String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(Qhi)) {
            ac.Qhi(context).Qhi("did", str);
            Qhi = str;
        }
        if (TextUtils.isEmpty(Qhi)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.fl.ac.cJ(Qhi);
        Gm.Qhi(Qhi);
    }

    private static String cJ() {
        StringBuilder sb2 = new StringBuilder();
        try {
            if (com.bytedance.sdk.openadsdk.utils.CQU.fl()) {
                sb2.append("MIUI-");
            } else if (com.bytedance.sdk.openadsdk.utils.CQU.cJ()) {
                sb2.append("FLYME-");
            } else {
                String iMK = com.bytedance.sdk.openadsdk.utils.CQU.iMK();
                if (com.bytedance.sdk.openadsdk.utils.CQU.Qhi(iMK)) {
                    sb2.append("EMUI-");
                }
                if (!TextUtils.isEmpty(iMK)) {
                    sb2.append(iMK);
                    sb2.append("-");
                }
            }
            sb2.append(Build.VERSION.INCREMENTAL);
        } catch (Exception unused) {
        }
        return sb2.toString();
    }

    public static String Qhi() {
        Locale locale;
        LocaleList localeList;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                localeList = LocaleList.getDefault();
                locale = localeList.get(0);
            } else {
                locale = Locale.getDefault();
            }
            String language = locale != null ? locale.getLanguage() : "";
            if (locale == null || !"zh".equals(language)) {
                return language;
            }
            String locale2 = locale.toString();
            if (locale.toString().length() >= 5) {
                locale2 = locale2.substring(0, 5);
            }
            return Locale.SIMPLIFIED_CHINESE.toString().equals(locale2) ? "zh" : "zh-Hant";
        } catch (Throwable unused) {
            return "";
        }
    }
}
