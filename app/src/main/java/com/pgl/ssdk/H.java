package com.pgl.ssdk;

import java.lang.Thread;

/* compiled from: CrashChecker.java */
/* loaded from: classes2.dex */
public class H implements Thread.UncaughtExceptionHandler {
    private static volatile H c;

    /* renamed from: b  reason: collision with root package name */
    private volatile boolean f15773b = false;

    /* renamed from: a  reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f15772a = Thread.getDefaultUncaughtExceptionHandler();

    private H() {
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    public static H b() {
        if (c == null) {
            synchronized (H.class) {
                if (c == null) {
                    c = new H();
                }
            }
        }
        return c;
    }

    public boolean a() {
        return this.f15773b;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        this.f15773b = true;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f15772a;
        if (uncaughtExceptionHandler != null && uncaughtExceptionHandler != this) {
            uncaughtExceptionHandler.uncaughtException(thread, th2);
        }
    }
}
