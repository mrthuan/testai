package com.bytedance.sdk.component.Sf;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: TTThreadFactory.java */
/* loaded from: classes.dex */
public class WAv implements ThreadFactory {
    public static final String THREAD_GROUP_NAME_PRE = "csj_g_";
    public static final String THREAD_NAME_PRE = "csj_";
    private final AtomicInteger CJ;
    protected final ThreadGroup Qhi;

    /* renamed from: ac  reason: collision with root package name */
    protected int f8033ac;
    protected final String cJ;

    public WAv(String str) {
        this(5, str);
    }

    public Thread Qhi(ThreadGroup threadGroup, Runnable runnable, String str) {
        return new Thread(threadGroup, runnable, str);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        ThreadGroup threadGroup = this.Qhi;
        Thread Qhi = Qhi(threadGroup, runnable, this.cJ + this.CJ.getAndIncrement());
        if (Qhi.isDaemon()) {
            Qhi.setDaemon(false);
        }
        int i10 = this.f8033ac;
        if (i10 > 10 || i10 <= 0) {
            this.f8033ac = 5;
        }
        Qhi.setPriority(this.f8033ac);
        return Qhi;
    }

    public WAv(int i10, String str) {
        this.CJ = new AtomicInteger(1);
        this.f8033ac = i10;
        this.Qhi = new ThreadGroup(THREAD_GROUP_NAME_PRE.concat(String.valueOf(str)));
        this.cJ = THREAD_NAME_PRE.concat(String.valueOf(str));
    }
}
