package com.bytedance.sdk.openadsdk.multipro.CJ;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.component.cJ;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.openadsdk.core.hm;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SPMultiHelperImpl.java */
/* loaded from: classes.dex */
public class ac {
    private static SoftReference<ConcurrentHashMap<String, Map<String, Object>>> Qhi;

    public static SharedPreferences Qhi(Context context, String str) {
        if (context == null) {
            return null;
        }
        try {
            return context.getSharedPreferences(Qhi(str), 0);
        } catch (Throwable th2) {
            ABk.Qhi("SPMultiHelperImpl", "getSharedPreferences error ", th2.getMessage());
            return null;
        }
    }

    public static Map<String, ?> ac(Context context, String str) {
        SharedPreferences Qhi2 = Qhi(context, str);
        if (Qhi2 == null) {
            return null;
        }
        return Qhi2.getAll();
    }

    private static void cJ(String str) {
        Map<String, Object> map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = Qhi;
        if (softReference == null || softReference.get() == null || (map = Qhi.get().get(Qhi(str))) == null) {
            return;
        }
        map.clear();
    }

    private static String Qhi(String str) {
        return TextUtils.isEmpty(str) ? "sphelper_ttopenadsdk" : str;
    }

    private static Object Qhi(String str, String str2) {
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap;
        Map<String, Object> map;
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = Qhi;
        if (softReference == null || (concurrentHashMap = softReference.get()) == null || (map = concurrentHashMap.get(Qhi(str))) == null) {
            return null;
        }
        return map.get(str2);
    }

    private static Object cJ(Context context, String str, String str2, String str3) {
        String Qhi2 = Qhi(str);
        if (Qhi(context, Qhi2, str2)) {
            if (str3.equalsIgnoreCase("string")) {
                return cJ.Qhi(context, Qhi2, str2, (String) null);
            }
            if (str3.equalsIgnoreCase("boolean")) {
                return Boolean.valueOf(cJ.Qhi(context, Qhi2, str2, false));
            }
            if (str3.equalsIgnoreCase("int")) {
                return Integer.valueOf(cJ.Qhi(context, Qhi2, str2, 0));
            }
            if (str3.equalsIgnoreCase(Constants.LONG)) {
                return Long.valueOf(cJ.Qhi(context, Qhi2, str2, 0L));
            }
            if (str3.equalsIgnoreCase("float")) {
                return Float.valueOf(cJ.Qhi(context, Qhi2, str2, 0.0f));
            }
            if (str3.equalsIgnoreCase("string_set")) {
                return cJ.Qhi(context, Qhi2, str2, (String) null);
            }
            return null;
        }
        return null;
    }

    private static void Qhi(String str, String str2, Object obj) {
        SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = Qhi;
        if (softReference == null || softReference.get() == null) {
            Qhi = new SoftReference<>(new ConcurrentHashMap());
        }
        String Qhi2 = Qhi(str);
        ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap = Qhi.get();
        if (concurrentHashMap.get(Qhi2) == null) {
            concurrentHashMap.put(Qhi2, new HashMap());
        }
        concurrentHashMap.get(Qhi2).put(str2, obj);
    }

    public static synchronized <T> void Qhi(Context context, String str, String str2, T t4) {
        synchronized (ac.class) {
            String Qhi2 = cJ.Qhi(str, str2);
            if (hm.ROR(Qhi2)) {
                com.bytedance.sdk.component.cJ Qhi3 = com.bytedance.sdk.component.cJ.Qhi(context, Qhi2);
                if (t4.equals(Qhi(Qhi2, str2))) {
                    return;
                }
                cJ.ac cJ = Qhi3.cJ();
                Qhi(cJ, str2, (Object) t4);
                cJ.apply();
                Qhi(Qhi2, str2, t4);
                return;
            }
            SharedPreferences Qhi4 = Qhi(context, Qhi2);
            if (Qhi4 == null) {
                return;
            }
            if (t4.equals(Qhi(Qhi2, str2))) {
                return;
            }
            SharedPreferences.Editor edit = Qhi4.edit();
            Qhi(edit, str2, t4);
            edit.apply();
            Qhi(Qhi2, str2, t4);
        }
    }

    public static void cJ(Context context, String str, String str2) {
        try {
            String Qhi2 = cJ.Qhi(str, str2);
            if (hm.ROR(Qhi2)) {
                com.bytedance.sdk.component.cJ.Qhi(context, Qhi2).cJ().remove(str2).apply();
                return;
            }
            SharedPreferences Qhi3 = Qhi(context, Qhi2);
            if (Qhi3 == null) {
                return;
            }
            SharedPreferences.Editor edit = Qhi3.edit();
            edit.remove(str2);
            edit.apply();
            SoftReference<ConcurrentHashMap<String, Map<String, Object>>> softReference = Qhi;
            if (softReference == null || softReference.get() == null) {
                return;
            }
            Map<String, Object> map = Qhi.get().get(Qhi(Qhi2));
            if (map != null && map.size() != 0) {
                map.remove(str2);
            }
        } catch (Throwable unused) {
        }
    }

    public static void cJ(Context context, String str) {
        if (hm.ROR(str)) {
            com.bytedance.sdk.component.cJ.Qhi(context, str).cJ().clear().apply();
            cJ(str);
            return;
        }
        SharedPreferences Qhi2 = Qhi(context, str);
        if (Qhi2 == null) {
            return;
        }
        SharedPreferences.Editor edit = Qhi2.edit();
        edit.clear();
        edit.apply();
        cJ(str);
    }

    public static <T> void Qhi(SharedPreferences.Editor editor, String str, T t4) {
        if (t4 instanceof Integer) {
            editor.putInt(str, ((Integer) t4).intValue());
        }
        if (t4 instanceof Long) {
            editor.putLong(str, ((Long) t4).longValue());
        }
        if (t4 instanceof Float) {
            editor.putFloat(str, ((Float) t4).floatValue());
        }
        if (t4 instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) t4).booleanValue());
        }
        if (t4 instanceof String) {
            editor.putString(str, (String) t4);
        }
    }

    public static <T> void Qhi(cJ.ac acVar, String str, T t4) {
        if (t4 instanceof Integer) {
            acVar.putInt(str, ((Integer) t4).intValue());
        }
        if (t4 instanceof Long) {
            acVar.putLong(str, ((Long) t4).longValue());
        }
        if (t4 instanceof Float) {
            acVar.putFloat(str, ((Float) t4).floatValue());
        }
        if (t4 instanceof Boolean) {
            acVar.putBoolean(str, ((Boolean) t4).booleanValue());
        }
        if (t4 instanceof String) {
            acVar.putString(str, (String) t4);
        }
    }

    public static String Qhi(Context context, String str, String str2, String str3) {
        Object Qhi2 = Qhi(str, str2);
        if (Qhi2 != null) {
            return String.valueOf(Qhi2);
        }
        Object cJ = cJ(context, str, str2, str3);
        Qhi(str, str2, cJ);
        return String.valueOf(cJ);
    }

    public static boolean Qhi(Context context, String str, String str2) {
        String Qhi2 = cJ.Qhi(str, str2);
        if (hm.ROR(Qhi2)) {
            return com.bytedance.sdk.component.cJ.Qhi(context, Qhi2).Qhi(str2);
        }
        SharedPreferences Qhi3 = Qhi(context, Qhi2);
        return Qhi3 != null && Qhi3.contains(str2);
    }
}
