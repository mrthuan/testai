package com.bytedance.sdk.openadsdk.multipro.CJ;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import androidx.activity.r;
import com.bytedance.sdk.component.Tgh.Qhi.ROR;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.hm;
import com.bytedance.sdk.openadsdk.multipro.Qhi.Qhi;
import java.util.HashSet;

/* compiled from: SPMultiHelper.java */
/* loaded from: classes.dex */
public class cJ {
    public static HashSet<String> Qhi = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.multipro.CJ.cJ.1
        {
            add("did");
            add("app_id");
            add("global_coppa");
            add("tt_gdpr");
            add("global_ccpa");
            add("keywords");
            add("extra_data");
            add("gaid");
            add("sdk_app_sha1");
            add("uuid");
            add("android_system_ua");
            add("sdk_local_web_ua");
            add("sdk_local_rom_info");
        }
    };

    private static String CJ() {
        return r.g(new StringBuilder(), com.bytedance.sdk.openadsdk.multipro.fl.cJ, "/t_sp/");
    }

    public static boolean Qhi() {
        if (HzH.Qhi() == null) {
            ABk.cJ("The context of SPHelper is null, please initialize sdk in main process");
            return false;
        }
        return true;
    }

    private static Context ac() {
        return HzH.Qhi();
    }

    private static ROR cJ() {
        try {
            if (Qhi()) {
                return Qhi.Qhi(HzH.Qhi());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static synchronized void Qhi(String str, String str2, Boolean bool) {
        synchronized (cJ.class) {
            if (Qhi()) {
                try {
                    if (!com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
                        ac.Qhi(ac(), str, str2, bool);
                        return;
                    }
                    ROR cJ = cJ();
                    if (cJ != null) {
                        Uri parse = Uri.parse(CJ() + "boolean/" + str2 + cJ(str));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("value", bool);
                        cJ.Qhi(parse, contentValues, null, null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    private static String cJ(String str) {
        return TextUtils.isEmpty(str) ? "" : "?sp_file_name=".concat(String.valueOf(str));
    }

    public static String cJ(String str, String str2, String str3) {
        if (Qhi()) {
            if (!com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
                return Qhi(ac(), str, str2, str3);
            }
            ROR cJ = cJ();
            if (cJ != null) {
                String Qhi2 = cJ.Qhi(Uri.parse(CJ() + "string/" + str2 + cJ(str)));
                if (Qhi2 != null && !Qhi2.equals("null")) {
                    return Qhi2;
                }
            }
            return str3;
        }
        return str3;
    }

    public static void cJ(String str, String str2) {
        if (Qhi()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
                    ac.cJ(ac(), str, str2);
                    return;
                }
                ROR cJ = cJ();
                if (cJ != null) {
                    cJ.Qhi(Uri.parse(CJ() + "long/" + str2 + cJ(str)), null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static synchronized void Qhi(String str, String str2, String str3) {
        synchronized (cJ.class) {
            if (Qhi()) {
                try {
                    if (!com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
                        ac.Qhi(ac(), str, str2, str3);
                        return;
                    }
                    ROR cJ = cJ();
                    if (cJ != null) {
                        Uri parse = Uri.parse(CJ() + "string/" + str2 + cJ(str));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("value", str3);
                        cJ.Qhi(parse, contentValues, null, null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static synchronized void Qhi(String str, String str2, Integer num) {
        synchronized (cJ.class) {
            if (Qhi()) {
                try {
                    if (!com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
                        ac.Qhi(ac(), str, str2, num);
                        return;
                    }
                    ROR cJ = cJ();
                    if (cJ != null) {
                        Uri parse = Uri.parse(CJ() + "int/" + str2 + cJ(str));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("value", num);
                        cJ.Qhi(parse, contentValues, null, null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static synchronized void Qhi(String str, String str2, Long l10) {
        synchronized (cJ.class) {
            if (Qhi()) {
                try {
                    if (!com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
                        ac.Qhi(ac(), str, str2, l10);
                        return;
                    }
                    ROR cJ = cJ();
                    if (cJ != null) {
                        Uri parse = Uri.parse(CJ() + "long/" + str2 + cJ(str));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("value", l10);
                        cJ.Qhi(parse, contentValues, null, null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static synchronized void Qhi(String str, String str2, Float f10) {
        synchronized (cJ.class) {
            if (Qhi()) {
                try {
                    if (!com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
                        ac.Qhi(ac(), str, str2, f10);
                        return;
                    }
                    ROR cJ = cJ();
                    if (cJ != null) {
                        Uri parse = Uri.parse(CJ() + "float/" + str2 + cJ(str));
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("value", f10);
                        cJ.Qhi(parse, contentValues, null, null);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    public static String Qhi(Context context, String str, String str2, String str3) {
        String Qhi2 = Qhi(str, str2);
        if (hm.ROR(Qhi2)) {
            return com.bytedance.sdk.component.cJ.Qhi(context, Qhi2).Qhi(str2, str3);
        }
        SharedPreferences Qhi3 = ac.Qhi(context, Qhi2);
        return Qhi3 == null ? str3 : Qhi3.getString(str2, str3);
    }

    public static String Qhi(String str, String str2) {
        return Qhi.contains(str2) ? "pag_sp_bad_par" : str;
    }

    public static int Qhi(String str, String str2, int i10) {
        if (Qhi()) {
            if (!com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
                return Qhi(ac(), str, str2, i10);
            }
            ROR cJ = cJ();
            if (cJ != null) {
                String Qhi2 = cJ.Qhi(Uri.parse(CJ() + "int/" + str2 + cJ(str)));
                if (Qhi2 != null && !Qhi2.equals("null")) {
                    return Integer.parseInt(Qhi2);
                }
            }
            return i10;
        }
        return i10;
    }

    public static int Qhi(Context context, String str, String str2, int i10) {
        String Qhi2 = Qhi(str, str2);
        if (hm.ROR(Qhi2)) {
            return com.bytedance.sdk.component.cJ.Qhi(context, Qhi2).Qhi(str2, i10);
        }
        SharedPreferences Qhi3 = ac.Qhi(context, Qhi2);
        return Qhi3 == null ? i10 : Qhi3.getInt(str2, i10);
    }

    public static float Qhi(Context context, String str, String str2, float f10) {
        String Qhi2 = Qhi(str, str2);
        if (hm.ROR(Qhi2)) {
            return com.bytedance.sdk.component.cJ.Qhi(context, Qhi2).Qhi(str2, f10);
        }
        SharedPreferences Qhi3 = ac.Qhi(context, Qhi2);
        return Qhi3 == null ? f10 : Qhi3.getFloat(str2, f10);
    }

    public static boolean Qhi(String str, String str2, boolean z10) {
        if (Qhi()) {
            if (!com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
                return Qhi(ac(), str, str2, z10);
            }
            ROR cJ = cJ();
            if (cJ != null) {
                String Qhi2 = cJ.Qhi(Uri.parse(CJ() + "boolean/" + str2 + cJ(str)));
                if (Qhi2 != null && !Qhi2.equals("null")) {
                    return Boolean.parseBoolean(Qhi2);
                }
            }
            return z10;
        }
        return z10;
    }

    public static boolean Qhi(Context context, String str, String str2, boolean z10) {
        String Qhi2 = Qhi(str, str2);
        if (hm.ROR(Qhi2)) {
            return com.bytedance.sdk.component.cJ.Qhi(context, Qhi2).Qhi(str2, z10);
        }
        SharedPreferences Qhi3 = ac.Qhi(context, Qhi2);
        return Qhi3 == null ? z10 : Qhi3.getBoolean(str2, z10);
    }

    public static long Qhi(String str, String str2, long j10) {
        if (Qhi()) {
            if (!com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
                return Qhi(ac(), str, str2, j10);
            }
            ROR cJ = cJ();
            if (cJ != null) {
                String Qhi2 = cJ.Qhi(Uri.parse(CJ() + "long/" + str2 + cJ(str)));
                if (Qhi2 != null && !Qhi2.equals("null")) {
                    return Long.parseLong(Qhi2);
                }
            }
            return j10;
        }
        return j10;
    }

    public static long Qhi(Context context, String str, String str2, long j10) {
        String Qhi2 = Qhi(str, str2);
        if (hm.ROR(Qhi2)) {
            return com.bytedance.sdk.component.cJ.Qhi(context, Qhi2).Qhi(str2, j10);
        }
        SharedPreferences Qhi3 = ac.Qhi(context, Qhi2);
        return Qhi3 == null ? j10 : Qhi3.getLong(str2, j10);
    }

    public static void Qhi(String str) {
        if (Qhi()) {
            try {
                if (!com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
                    ac.cJ(ac(), str);
                    return;
                }
                ROR cJ = cJ();
                if (cJ != null) {
                    cJ.Qhi(Uri.parse(CJ() + "clean" + cJ(str)), null, null);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
