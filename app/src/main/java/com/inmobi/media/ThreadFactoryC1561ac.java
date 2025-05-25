package com.inmobi.media;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.inmobi.media.ac  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ThreadFactoryC1561ac implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f14939a = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable r4) {
        kotlin.jvm.internal.g.e(r4, "r");
        return new Thread(r4, "VastNetworkTask #" + this.f14939a.getAndIncrement());
    }
}
