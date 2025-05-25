package kotlinx.coroutines;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.o0;

/* compiled from: DefaultExecutor.kt */
/* loaded from: classes.dex */
public final class z extends o0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: i  reason: collision with root package name */
    public static final z f20278i;

    /* renamed from: j  reason: collision with root package name */
    public static final long f20279j;

    static {
        Long l10;
        z zVar = new z();
        f20278i = zVar;
        zVar.U(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f20279j = timeUnit.toNanos(l10.longValue());
    }

    @Override // kotlinx.coroutines.p0
    public final Thread a0() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // kotlinx.coroutines.p0
    public final void b0(long j10, o0.b bVar) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // kotlinx.coroutines.o0
    public final void d0(Runnable runnable) {
        boolean z10;
        if (debugStatus == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            super.d0(runnable);
            return;
        }
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    public final synchronized void q0() {
        boolean z10;
        int i10 = debugStatus;
        if (i10 != 2 && i10 != 3) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return;
        }
        debugStatus = 3;
        o0.f20218f.set(this, null);
        o0.f20219g.set(this, null);
        notifyAll();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        boolean z11;
        boolean z12;
        o1.f20224a.set(this);
        try {
            synchronized (this) {
                int i10 = debugStatus;
                if (i10 != 2 && i10 != 3) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    z11 = false;
                } else {
                    debugStatus = 1;
                    notifyAll();
                    z11 = true;
                }
            }
            if (!z11) {
                _thread = null;
                q0();
                if (!n0()) {
                    a0();
                    return;
                }
                return;
            }
            long j10 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long o02 = o0();
                if (o02 == Long.MAX_VALUE) {
                    long nanoTime = System.nanoTime();
                    if (j10 == Long.MAX_VALUE) {
                        j10 = f20279j + nanoTime;
                    }
                    long j11 = j10 - nanoTime;
                    if (j11 <= 0) {
                        _thread = null;
                        q0();
                        if (!n0()) {
                            a0();
                            return;
                        }
                        return;
                    } else if (o02 > j11) {
                        o02 = j11;
                    }
                } else {
                    j10 = Long.MAX_VALUE;
                }
                if (o02 > 0) {
                    int i11 = debugStatus;
                    if (i11 != 2 && i11 != 3) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if (z12) {
                        _thread = null;
                        q0();
                        if (!n0()) {
                            a0();
                            return;
                        }
                        return;
                    }
                    LockSupport.parkNanos(this, o02);
                }
            }
        } catch (Throwable th2) {
            _thread = null;
            q0();
            if (!n0()) {
                a0();
            }
            throw th2;
        }
    }

    @Override // kotlinx.coroutines.o0, kotlinx.coroutines.n0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
