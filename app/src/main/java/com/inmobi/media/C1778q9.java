package com.inmobi.media;

import java.util.concurrent.Callable;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.inmobi.media.q9  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1778q9 extends ThreadPoolExecutor {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f15392a = 0;

    public C1778q9(TimeUnit timeUnit, PriorityBlockingQueue priorityBlockingQueue, I4 i42) {
        super(1, 1, 0L, timeUnit, priorityBlockingQueue, i42);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        kotlin.jvm.internal.g.e(callable, "callable");
        return (RunnableFuture) callable;
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        kotlin.jvm.internal.g.e(runnable, "runnable");
        return (RunnableFuture) runnable;
    }
}
