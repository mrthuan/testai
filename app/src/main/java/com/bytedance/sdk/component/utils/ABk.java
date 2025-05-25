package com.bytedance.sdk.component.utils;

import android.text.TextUtils;
import androidx.activity.f;

/* compiled from: Logger.java */
/* loaded from: classes.dex */
public class ABk {
    private static String CJ = "";
    private static boolean Qhi = false;

    /* renamed from: ac  reason: collision with root package name */
    private static com.bytedance.sdk.component.Qhi f8422ac = null;
    private static int cJ = 4;

    public static boolean CJ() {
        return Qhi;
    }

    public static void Qhi(String str) {
        CJ = str;
    }

    public static void ac() {
        Qhi = false;
        Qhi(7);
    }

    public static void cJ() {
        Qhi = true;
        Qhi(3);
    }

    public static void Qhi(int i10) {
        cJ = i10;
    }

    public static boolean Qhi() {
        return cJ <= 3;
    }

    public static String ac(String str) {
        if (TextUtils.isEmpty(CJ)) {
            return str;
        }
        return Qhi("[" + CJ + "]-[" + str + "]");
    }

    public static void cJ(String str) {
        if (Qhi) {
            Qhi("Logger", str);
        }
    }

    public static void Qhi(String str, String str2) {
        if (f8422ac != null) {
            ac(str);
        }
        if (Qhi && str2 != null && cJ <= 6) {
            ac(str);
        }
    }

    public static String cJ(String str, String str2) {
        return TextUtils.isEmpty(CJ) ? str : Qhi(f.m(str2, "]-[", str));
    }

    public static void Qhi(String str, String str2, String str3, Throwable th2) {
        if (Qhi) {
            Qhi(cJ(str, str2), str3, th2);
        }
    }

    public static void Qhi(String str, String str2, Throwable th2) {
        if (f8422ac != null) {
            ac(str);
        }
        if (Qhi) {
            if (!(str2 == null && th2 == null) && cJ <= 6) {
                ac(str);
            }
        }
    }

    public static void Qhi(String str, Object... objArr) {
        if (f8422ac != null) {
            ac(str);
            Qhi(objArr);
        }
        if (Qhi && objArr != null && cJ <= 6) {
            ac(str);
            Qhi(objArr);
        }
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
