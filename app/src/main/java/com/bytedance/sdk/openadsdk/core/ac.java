package com.bytedance.sdk.openadsdk.core;

import android.content.Context;

/* compiled from: AdPreference.java */
/* loaded from: classes.dex */
public class ac {
    private static volatile ac Qhi;

    private ac() {
    }

    public static ac Qhi(Context context) {
        if (Qhi == null) {
            synchronized (ac.class) {
                if (Qhi == null) {
                    Qhi = new ac();
                }
            }
        }
        return Qhi;
    }

    public String cJ(String str, String str2) {
        return com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.cJ("ttopenadsdk", str, str2);
    }

    public int cJ(String str, int i10) {
        return com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("ttopenadsdk", str, i10);
    }

    public Long cJ(String str, long j10) {
        return Long.valueOf(com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("ttopenadsdk", str, j10));
    }

    public void Qhi(String str, String str2) {
        com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("ttopenadsdk", str, str2);
    }

    public void Qhi(String str, int i10) {
        com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("ttopenadsdk", str, Integer.valueOf(i10));
    }

    public void Qhi(String str, long j10) {
        com.bytedance.sdk.openadsdk.multipro.CJ.Tgh.Qhi("ttopenadsdk", str, Long.valueOf(j10));
    }
}
