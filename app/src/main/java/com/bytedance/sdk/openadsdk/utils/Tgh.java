package com.bytedance.sdk.openadsdk.utils;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;

/* compiled from: BatteryDataWatcher.java */
/* loaded from: classes.dex */
public class Tgh {
    static int Qhi = -1;

    /* renamed from: ac  reason: collision with root package name */
    private static long f9375ac;
    static float cJ;

    /* compiled from: BatteryDataWatcher.java */
    /* loaded from: classes.dex */
    public static class Qhi {
        public final int Qhi;
        public final float cJ;

        public Qhi(int i10, float f10) {
            this.Qhi = i10;
            this.cJ = f10;
        }
    }

    private static void Qhi(Intent intent) {
        if (intent.getIntExtra("status", -1) == 2) {
            Qhi = 1;
        } else {
            Qhi = 0;
        }
        cJ = (intent.getIntExtra("level", -1) * 100) / intent.getIntExtra("scale", -1);
    }

    public static Qhi Qhi() {
        if (f9375ac == 0 || SystemClock.elapsedRealtime() - f9375ac > 60000) {
            Intent registerReceiver = com.bytedance.sdk.openadsdk.core.HzH.Qhi().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            "obtainCurrentState: registerReceiver result is ".concat(String.valueOf(registerReceiver));
            if (registerReceiver != null) {
                Qhi(registerReceiver);
                f9375ac = SystemClock.elapsedRealtime();
            }
        }
        return new Qhi(Qhi, cJ);
    }
}
