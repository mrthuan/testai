package com.android.billingclient.api;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes.dex */
public final class r implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final ThreadFactory f6277a = Executors.defaultThreadFactory();

    /* renamed from: b  reason: collision with root package name */
    public final AtomicInteger f6278b = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        AtomicInteger atomicInteger = this.f6278b;
        Thread newThread = this.f6277a.newThread(runnable);
        int andIncrement = atomicInteger.getAndIncrement();
        newThread.setName("PlayBillingLibrary-" + andIncrement);
        return newThread;
    }
}
