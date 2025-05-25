package com.bytedance.sdk.component.Sf.ac;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PagThreadFactory.java */
/* loaded from: classes.dex */
public class fl implements ThreadFactory {
    protected final ThreadGroup Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private final AtomicInteger f8045ac = new AtomicInteger(1);
    protected final String cJ;

    public fl(String str) {
        this.Qhi = new ThreadGroup("pag_g_".concat(String.valueOf(str)));
        this.cJ = Qhi(str);
    }

    public Thread Qhi(ThreadGroup threadGroup, Runnable runnable, String str) {
        return new Thread(threadGroup, runnable, str);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        ThreadGroup threadGroup = this.Qhi;
        Thread Qhi = Qhi(threadGroup, runnable, this.cJ + "_" + this.f8045ac.getAndIncrement());
        if (Qhi.isDaemon()) {
            Qhi.setDaemon(false);
        }
        return Qhi;
    }

    public static String Qhi(String str) {
        return "pag_".concat(String.valueOf(str));
    }
}
