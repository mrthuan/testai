package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* compiled from: TempSPUtils.java */
/* loaded from: classes.dex */
public class sDy {
    private static final Map<String, sDy> Qhi = new HashMap();
    private SharedPreferences cJ;

    private sDy(String str, Context context) {
        if (context != null) {
            this.cJ = context.getSharedPreferences(str, 0);
        }
    }

    public static sDy Qhi(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            str = "tt_ad_sdk_sp";
        }
        Map<String, sDy> map = Qhi;
        sDy sdy = map.get(str);
        if (sdy == null) {
            sDy sdy2 = new sDy(str, context);
            map.put(str, sdy2);
            return sdy2;
        }
        return sdy;
    }

    public String Qhi(String str, String str2) {
        try {
            return this.cJ.getString(str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    public void Qhi(String str) {
        try {
            this.cJ.edit().remove(str).apply();
        } catch (Throwable unused) {
        }
    }
}
