package com.bytedance.sdk.openadsdk.utils;

import org.json.JSONObject;

/* compiled from: MemoryUtils.java */
/* loaded from: classes.dex */
public class kYc {
    public static final long Qhi = Qhi(0.05f);

    public static long Qhi(float f10) {
        return Double.valueOf(f10 * ((float) Runtime.getRuntime().maxMemory())).longValue();
    }

    private static void cJ(final long j10, final String str) {
        lG.cJ(new com.bytedance.sdk.component.Sf.hm("isMemoryEnough") { // from class: com.bytedance.sdk.openadsdk.utils.kYc.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("scene", str);
                    jSONObject.put("mem_size", j10);
                    com.bytedance.sdk.openadsdk.Gm.ac.Qhi().Qhi("dynamic_mem_not_enough", jSONObject);
                } catch (Exception e10) {
                    com.bytedance.sdk.component.utils.ABk.Qhi("MemoryUtils", "run: ", e10);
                }
            }
        }, 5);
    }

    public static boolean Qhi(long j10, String str) {
        if (!com.bytedance.sdk.openadsdk.core.HzH.CJ().ABk() || Runtime.getRuntime().maxMemory() - (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) >= j10) {
            return true;
        }
        cJ(j10, str);
        return false;
    }

    public static int Qhi() {
        try {
            int maxMemory = (int) (Runtime.getRuntime().maxMemory() / 33554432);
            if (maxMemory <= 2) {
                return 2;
            }
            if (maxMemory >= 5) {
                return 5;
            }
            return maxMemory;
        } catch (Throwable unused) {
            return 2;
        }
    }
}
