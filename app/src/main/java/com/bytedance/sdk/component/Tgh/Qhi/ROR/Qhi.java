package com.bytedance.sdk.component.Tgh.Qhi.ROR;

import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: TimerUtils.java */
/* loaded from: classes.dex */
public class Qhi {
    private static volatile HandlerThread Qhi = null;

    /* renamed from: ac  reason: collision with root package name */
    private static int f8076ac = 3000;
    private static volatile Handler cJ;

    static {
        HandlerThread handlerThread = new HandlerThread("csj_ad_log", 10);
        Qhi = handlerThread;
        handlerThread.start();
    }

    public static Handler Qhi() {
        if (Qhi != null && Qhi.isAlive()) {
            if (cJ == null) {
                synchronized (Qhi.class) {
                    if (cJ == null) {
                        cJ = new Handler(Qhi.getLooper());
                    }
                }
            }
        } else {
            synchronized (Qhi.class) {
                if (Qhi == null || !Qhi.isAlive()) {
                    HandlerThread handlerThread = new HandlerThread("csj_init_handle", -1);
                    Qhi = handlerThread;
                    handlerThread.start();
                    cJ = new Handler(Qhi.getLooper());
                }
            }
        }
        return cJ;
    }

    public static int cJ() {
        if (f8076ac <= 0) {
            f8076ac = 3000;
        }
        return f8076ac;
    }
}
