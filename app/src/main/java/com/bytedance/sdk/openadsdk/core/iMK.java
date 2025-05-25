package com.bytedance.sdk.openadsdk.core;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.tom_roush.fontbox.ttf.NamingTable;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: InitHelper.java */
/* loaded from: classes.dex */
public class iMK {
    public static volatile boolean Qhi = false;
    private static volatile HandlerThread ROR;

    /* renamed from: fl  reason: collision with root package name */
    public static long f9050fl;
    public static AtomicBoolean cJ = new AtomicBoolean(false);

    /* renamed from: ac  reason: collision with root package name */
    public static long f9049ac = 0;
    private static volatile int Tgh = 0;
    public static float CJ = 1.0f;
    private static volatile Handler Sf = null;

    static {
        HandlerThread handlerThread = new HandlerThread("csj_init_handle", 10);
        ROR = handlerThread;
        handlerThread.start();
        f9050fl = System.currentTimeMillis();
    }

    public static int CJ() {
        return Tgh;
    }

    public static void Qhi(long j10) {
        f9050fl = j10;
    }

    public static void ROR() {
        cJ().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.iMK.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.bytedance.sdk.openadsdk.ABk.ac.Qhi(new com.bytedance.sdk.openadsdk.ABk.fl() { // from class: com.bytedance.sdk.openadsdk.core.iMK.2.1
                        @Override // com.bytedance.sdk.openadsdk.ABk.fl
                        public com.bytedance.sdk.openadsdk.ABk.cJ.Qhi generatorModel() {
                            com.bytedance.sdk.openadsdk.ABk.cJ.Qhi qhi = new com.bytedance.sdk.openadsdk.ABk.cJ.Qhi();
                            qhi.cJ("init");
                            return qhi;
                        }
                    });
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.ABk.Qhi("InitHelper", th2.getMessage());
                }
            }
        });
    }

    public static void Tgh() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - f9049ac <= 10000) {
            return;
        }
        f9049ac = elapsedRealtime;
        com.bytedance.sdk.openadsdk.utils.lG.Qhi(new com.bytedance.sdk.component.Sf.hm("onSharedPreferenceChanged") { // from class: com.bytedance.sdk.openadsdk.core.iMK.1
            @Override // java.lang.Runnable
            public void run() {
                String ac2 = com.bytedance.sdk.openadsdk.core.settings.HzH.ac(HzH.Qhi());
                if (!TextUtils.equals(ac2, com.bytedance.sdk.openadsdk.core.settings.HzH.Qhi)) {
                    com.bytedance.sdk.openadsdk.core.settings.HzH.YD().Qhi(6, true);
                    com.bytedance.sdk.openadsdk.core.settings.HzH.Qhi = ac2;
                }
            }
        });
    }

    public static Handler ac() {
        return new Handler(Looper.getMainLooper());
    }

    public static Handler cJ() {
        if (ROR != null && ROR.isAlive()) {
            if (Sf == null) {
                synchronized (iMK.class) {
                    if (Sf == null) {
                        Sf = new Handler(ROR.getLooper());
                    }
                }
            }
        } else {
            synchronized (iMK.class) {
                if (ROR == null || !ROR.isAlive()) {
                    HandlerThread handlerThread = new HandlerThread("csj_init_handle", -1);
                    ROR = handlerThread;
                    handlerThread.start();
                    Sf = new Handler(ROR.getLooper());
                }
            }
        }
        return Sf;
    }

    public static boolean fl() {
        if (CJ() == 1) {
            return true;
        }
        return false;
    }

    public static long Qhi() {
        return f9050fl;
    }

    public static void Qhi(int i10) {
        Tgh = i10;
    }

    public static void Qhi(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(str);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                if ("mediation".equals(jSONObject.optString(NamingTable.TAG, ""))) {
                    hm.cJ().cJ(jSONObject.optString("value", ""));
                    return;
                }
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ABk.Qhi("InitHelper", th2.getMessage());
        }
    }
}
