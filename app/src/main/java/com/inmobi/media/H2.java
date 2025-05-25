package com.inmobi.media;

import java.lang.Thread;

/* loaded from: classes2.dex */
public final class H2 extends W2 implements Thread.UncaughtExceptionHandler {

    /* renamed from: b  reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f14312b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H2(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, V2 listener) {
        super(listener);
        kotlin.jvm.internal.g.e(listener, "listener");
        this.f14312b = uncaughtExceptionHandler;
    }

    @Override // com.inmobi.media.W2
    public final void a() {
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override // com.inmobi.media.W2
    public final void b() {
        Thread.setDefaultUncaughtExceptionHandler(this.f14312b);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread t4, Throwable e10) {
        kotlin.jvm.internal.g.e(t4, "t");
        kotlin.jvm.internal.g.e(e10, "e");
        ((X2) this.f14771a).a(new I2(t4, e10));
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f14312b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(t4, e10);
        }
    }
}
