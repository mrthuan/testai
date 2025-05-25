package com.inmobi.media;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.inmobi.media.d6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1597d6 {

    /* renamed from: a  reason: collision with root package name */
    public static final ScheduledExecutorService f15014a;

    /* renamed from: b  reason: collision with root package name */
    public static final ExecutorService f15015b;
    public static final Semaphore c;

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicBoolean f15016d;

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(5, new I4("Log", true));
        kotlin.jvm.internal.g.d(newScheduledThreadPool, "newScheduledThreadPool(...)");
        f15014a = newScheduledThreadPool;
        f15015b = Executors.newSingleThreadExecutor(new I4("LogSingle", true));
        c = new Semaphore(1);
        f15016d = new AtomicBoolean(false);
    }
}
