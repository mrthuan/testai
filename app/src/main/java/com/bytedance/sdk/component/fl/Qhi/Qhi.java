package com.bytedance.sdk.component.fl.Qhi;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: DefaultThreadFactory.java */
/* loaded from: classes.dex */
public class Qhi implements ThreadFactory {
    private final ThreadGroup Qhi;
    private final AtomicInteger cJ = new AtomicInteger(1);

    public Qhi(String str) {
        this.Qhi = new ThreadGroup("tt_img_".concat(String.valueOf(str)));
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        ThreadGroup threadGroup = this.Qhi;
        Thread thread = new Thread(threadGroup, runnable, "tt_img_" + this.cJ.getAndIncrement());
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }
}
