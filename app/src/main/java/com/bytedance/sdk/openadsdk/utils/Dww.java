package com.bytedance.sdk.openadsdk.utils;

import android.content.SharedPreferences;

/* compiled from: PropSwitchUtils.java */
/* loaded from: classes.dex */
public class Dww {
    public static boolean Qhi = Qhi();

    private static boolean Qhi() {
        SharedPreferences sharedPreferences;
        try {
            if (com.bytedance.sdk.openadsdk.core.HzH.Qhi() != null && (sharedPreferences = com.bytedance.sdk.openadsdk.core.HzH.Qhi().getSharedPreferences("pag_sp_prop_switch", 0)) != null) {
                return sharedPreferences.getInt("perf_con_use_prop", 1) == 1;
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ABk.cJ(th2.getMessage());
        }
        return true;
    }

    public static void Qhi(int i10) {
        try {
            SharedPreferences.Editor edit = com.bytedance.sdk.openadsdk.core.HzH.Qhi().getSharedPreferences("pag_sp_prop_switch", 0).edit();
            edit.putInt("perf_con_use_prop", i10);
            edit.apply();
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ABk.cJ(th2.getMessage());
        }
    }
}
