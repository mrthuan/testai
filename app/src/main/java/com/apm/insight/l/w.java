package com.apm.insight.l;

/* loaded from: classes.dex */
public final class w {
    public static Thread a(Runnable runnable, String str) {
        Thread thread;
        if (runnable != null) {
            if (str == null) {
                thread = new Thread(runnable);
            } else {
                thread = new Thread(runnable, str);
            }
            thread.start();
            return thread;
        }
        return null;
    }
}
