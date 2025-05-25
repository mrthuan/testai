package com.bytedance.sdk.openadsdk.multipro.CJ;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.sdk.component.cJ;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.hm;

/* compiled from: TTSaveHelper.java */
/* loaded from: classes.dex */
public class Tgh {
    private static boolean Qhi() {
        return HzH.Qhi() == null;
    }

    private static String cJ(String str) {
        return TextUtils.isEmpty(str) ? "tt_sp" : str;
    }

    public static void Qhi(String str, String str2, Boolean bool) {
        if (Qhi()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
            cJ.Qhi(cJ(str), str2, bool);
        } else {
            Qhi(cJ(str), str2, bool);
        }
    }

    public static String cJ(String str, String str2, String str3) {
        if (Qhi()) {
            return str3;
        }
        if (com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
            return cJ.cJ(cJ(str), str2, str3);
        }
        return cJ.Qhi(HzH.Qhi(), cJ(str), str2, str3);
    }

    public static void Qhi(String str, String str2, Long l10) {
        if (Qhi()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
            cJ.Qhi(cJ(str), str2, l10);
        } else {
            Qhi(cJ(str), str2, l10);
        }
    }

    public static void Qhi(String str, String str2, String str3) {
        if (Qhi()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
            cJ.Qhi(cJ(str), str2, str3);
        } else {
            Qhi(cJ(str), str2, str3);
        }
    }

    public static void Qhi(String str, String str2, Integer num) {
        if (Qhi()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
            cJ.Qhi(cJ(str), str2, num);
        } else {
            Qhi(cJ(str), str2, num);
        }
    }

    public static int Qhi(String str, String str2, int i10) {
        if (Qhi()) {
            return i10;
        }
        if (com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
            return cJ.Qhi(cJ(str), str2, i10);
        }
        return cJ.Qhi(HzH.Qhi(), cJ(str), str2, i10);
    }

    public static boolean Qhi(String str, String str2, boolean z10) {
        if (Qhi()) {
            return z10;
        }
        if (com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
            return cJ.Qhi(cJ(str), str2, z10);
        }
        return cJ.Qhi(HzH.Qhi(), cJ(str), str2, z10);
    }

    public static long Qhi(String str, String str2, long j10) {
        if (Qhi()) {
            return j10;
        }
        if (com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
            return cJ.Qhi(cJ(str), str2, j10);
        }
        return cJ.Qhi(HzH.Qhi(), cJ(str), str2, j10);
    }

    public static void Qhi(String str, String str2) {
        if (Qhi()) {
            return;
        }
        try {
            if (com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
                cJ.cJ(cJ(str), str2);
            } else {
                ac.cJ(HzH.Qhi(), cJ(str), str2);
            }
        } catch (Throwable unused) {
        }
    }

    public static void Qhi(String str) {
        if (Qhi()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
            cJ.Qhi(cJ(str));
        } else {
            ac.cJ(HzH.Qhi(), cJ(str));
        }
    }

    private static <T> void Qhi(String str, String str2, T t4) {
        String Qhi = cJ.Qhi(str, str2);
        if (hm.ROR(Qhi)) {
            cJ.ac cJ = com.bytedance.sdk.component.cJ.Qhi(HzH.Qhi(), cJ(Qhi)).cJ();
            ac.Qhi(cJ, str2, (Object) t4);
            cJ.apply();
            return;
        }
        SharedPreferences Qhi2 = ac.Qhi(HzH.Qhi(), cJ(Qhi));
        if (Qhi2 == null) {
            return;
        }
        SharedPreferences.Editor edit = Qhi2.edit();
        ac.Qhi(edit, str2, t4);
        edit.apply();
    }
}
