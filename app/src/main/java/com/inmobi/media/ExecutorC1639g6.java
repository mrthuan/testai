package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: com.inmobi.media.g6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ExecutorC1639g6 implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final Handler f15096a = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        kotlin.jvm.internal.g.e(runnable, "runnable");
        this.f15096a.post(runnable);
    }
}
