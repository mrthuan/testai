package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.Looper;

/* compiled from: HandlerUtils.java */
/* loaded from: classes.dex */
public class Sf {
    private static volatile Handler Qhi;

    public static Handler Qhi() {
        return com.bytedance.sdk.component.Sf.Qhi.Qhi.Qhi().cJ();
    }

    public static Handler cJ() {
        if (Qhi == null) {
            synchronized (Sf.class) {
                if (Qhi == null) {
                    Qhi = new Handler(Looper.getMainLooper());
                }
            }
        }
        return Qhi;
    }
}
