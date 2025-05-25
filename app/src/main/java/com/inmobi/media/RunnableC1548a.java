package com.inmobi.media;

import android.os.Debug;

/* renamed from: com.inmobi.media.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1548a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C1562b f14928a;

    public RunnableC1548a(C1562b c1562b) {
        this.f14928a = c1562b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f14928a.f14941d.get()) {
            if (this.f14928a.f14943f.hasMessages(2023)) {
                this.f14928a.f14943f.removeMessages(2023);
                this.f14928a.getClass();
                if (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger() && this.f14928a.f14942e.get()) {
                    StackTraceElement[] a10 = C1562b.a(this.f14928a);
                    V2 v22 = this.f14928a.f14771a;
                    kotlin.jvm.internal.g.b(a10);
                    ((X2) v22).a(new xc(a10));
                }
            }
            this.f14928a.f14942e.getAndSet(true);
            this.f14928a.f14943f.sendEmptyMessage(2023);
        }
    }
}
