package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.inmobi.media.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1562b extends W2 {

    /* renamed from: b  reason: collision with root package name */
    public final long f14940b;
    public final RunnableC1548a c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicBoolean f14941d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f14942e;

    /* renamed from: f  reason: collision with root package name */
    public final Handler f14943f;

    /* renamed from: g  reason: collision with root package name */
    public ScheduledExecutorService f14944g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1562b(long j10, V2 listener) {
        super(listener);
        kotlin.jvm.internal.g.e(listener, "listener");
        this.f14940b = j10;
        this.c = new RunnableC1548a(this);
        this.f14941d = new AtomicBoolean(false);
        this.f14942e = new AtomicBoolean(false);
        this.f14943f = new Handler(Looper.getMainLooper());
    }

    public static final StackTraceElement[] a(C1562b c1562b) {
        c1562b.getClass();
        return Looper.getMainLooper().getThread().getStackTrace();
    }

    public static final void b(C1562b this$0) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        if (this$0.f14941d.getAndSet(true)) {
            return;
        }
        ScheduledExecutorService scheduledExecutorService = this$0.f14944g;
        if (scheduledExecutorService == null || scheduledExecutorService.scheduleAtFixedRate(this$0.c, 0L, this$0.f14940b, TimeUnit.MILLISECONDS) == null) {
            ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new I4("ANRWatchDog"));
            this$0.f14944g = newSingleThreadScheduledExecutor;
            if (newSingleThreadScheduledExecutor != null) {
                newSingleThreadScheduledExecutor.scheduleAtFixedRate(this$0.c, 0L, this$0.f14940b, TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // com.inmobi.media.W2
    public final void a() {
        Vb.f14759a.execute(new androidx.appcompat.widget.y0(this, 11));
    }

    @Override // com.inmobi.media.W2
    public final void b() {
        if (this.f14941d.getAndSet(false)) {
            this.f14941d.set(false);
            this.f14942e.set(false);
            ScheduledExecutorService scheduledExecutorService = this.f14944g;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdown();
            }
            this.f14944g = null;
        }
    }
}
