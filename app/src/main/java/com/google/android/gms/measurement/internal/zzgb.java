package com.google.android.gms.measurement.internal;

import a8.l0;
import a8.x;
import a8.y;
import a8.z;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzgb extends l0 {

    /* renamed from: k  reason: collision with root package name */
    public static final AtomicLong f11764k = new AtomicLong(Long.MIN_VALUE);
    public z c;

    /* renamed from: d  reason: collision with root package name */
    public z f11765d;

    /* renamed from: e  reason: collision with root package name */
    public final PriorityBlockingQueue f11766e;

    /* renamed from: f  reason: collision with root package name */
    public final LinkedBlockingQueue f11767f;

    /* renamed from: g  reason: collision with root package name */
    public final x f11768g;

    /* renamed from: h  reason: collision with root package name */
    public final x f11769h;

    /* renamed from: i  reason: collision with root package name */
    public final Object f11770i;

    /* renamed from: j  reason: collision with root package name */
    public final Semaphore f11771j;

    public zzgb(zzge zzgeVar) {
        super(zzgeVar);
        this.f11770i = new Object();
        this.f11771j = new Semaphore(2);
        this.f11766e = new PriorityBlockingQueue();
        this.f11767f = new LinkedBlockingQueue();
        this.f11768g = new x(this, "Thread death: Uncaught exception on worker thread");
        this.f11769h = new x(this, "Thread death: Uncaught exception on network thread");
    }

    @Override // androidx.core.content.e
    public final void m() {
        if (Thread.currentThread() == this.c) {
            return;
        }
        throw new IllegalStateException("Call expected from worker thread");
    }

    @Override // a8.l0
    public final boolean n() {
        return false;
    }

    public final void q() {
        if (Thread.currentThread() == this.f11765d) {
            return;
        }
        throw new IllegalStateException("Call expected from network thread");
    }

    public final Object r(AtomicReference atomicReference, long j10, String str, Runnable runnable) {
        synchronized (atomicReference) {
            zzgb zzgbVar = ((zzge) this.f3529a).f11781j;
            zzge.f(zzgbVar);
            zzgbVar.u(runnable);
            try {
                atomicReference.wait(j10);
            } catch (InterruptedException unused) {
                zzeu zzeuVar = ((zzge) this.f3529a).f11780i;
                zzge.f(zzeuVar);
                zzeuVar.f11715i.a("Interrupted waiting for ".concat(str));
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            zzeu zzeuVar2 = ((zzge) this.f3529a).f11780i;
            zzge.f(zzeuVar2);
            zzeuVar2.f11715i.a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final y s(Callable callable) {
        o();
        y yVar = new y(this, callable, false);
        if (Thread.currentThread() == this.c) {
            if (!this.f11766e.isEmpty()) {
                zzeu zzeuVar = ((zzge) this.f3529a).f11780i;
                zzge.f(zzeuVar);
                zzeuVar.f11715i.a("Callable skipped the worker queue.");
            }
            yVar.run();
        } else {
            x(yVar);
        }
        return yVar;
    }

    public final void t(Runnable runnable) {
        o();
        y yVar = new y(this, runnable, false, "Task exception on network thread");
        synchronized (this.f11770i) {
            this.f11767f.add(yVar);
            z zVar = this.f11765d;
            if (zVar == null) {
                z zVar2 = new z(this, "Measurement Network", this.f11767f);
                this.f11765d = zVar2;
                zVar2.setUncaughtExceptionHandler(this.f11769h);
                this.f11765d.start();
            } else {
                zVar.a();
            }
        }
    }

    public final void u(Runnable runnable) {
        o();
        Preconditions.j(runnable);
        x(new y(this, runnable, false, "Task exception on worker thread"));
    }

    public final void v(Runnable runnable) {
        o();
        x(new y(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean w() {
        if (Thread.currentThread() == this.c) {
            return true;
        }
        return false;
    }

    public final void x(y yVar) {
        synchronized (this.f11770i) {
            this.f11766e.add(yVar);
            z zVar = this.c;
            if (zVar == null) {
                z zVar2 = new z(this, "Measurement Worker", this.f11766e);
                this.c = zVar2;
                zVar2.setUncaughtExceptionHandler(this.f11768g);
                this.c.start();
            } else {
                zVar.a();
            }
        }
    }
}
