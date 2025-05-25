package kk;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* compiled from: AsyncTimeout.kt */
/* loaded from: classes3.dex */
public class a extends z {

    /* renamed from: h  reason: collision with root package name */
    public static final long f19812h;

    /* renamed from: i  reason: collision with root package name */
    public static final long f19813i;

    /* renamed from: j  reason: collision with root package name */
    public static a f19814j;

    /* renamed from: e  reason: collision with root package name */
    public boolean f19815e;

    /* renamed from: f  reason: collision with root package name */
    public a f19816f;

    /* renamed from: g  reason: collision with root package name */
    public long f19817g;

    /* compiled from: AsyncTimeout.kt */
    /* renamed from: kk.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0265a {
        public static a a() {
            a aVar = a.f19814j;
            kotlin.jvm.internal.g.b(aVar);
            a aVar2 = aVar.f19816f;
            if (aVar2 == null) {
                long nanoTime = System.nanoTime();
                a.class.wait(a.f19812h);
                a aVar3 = a.f19814j;
                kotlin.jvm.internal.g.b(aVar3);
                if (aVar3.f19816f != null || System.nanoTime() - nanoTime < a.f19813i) {
                    return null;
                }
                return a.f19814j;
            }
            long nanoTime2 = aVar2.f19817g - System.nanoTime();
            if (nanoTime2 > 0) {
                long j10 = nanoTime2 / 1000000;
                a.class.wait(j10, (int) (nanoTime2 - (1000000 * j10)));
                return null;
            }
            a aVar4 = a.f19814j;
            kotlin.jvm.internal.g.b(aVar4);
            aVar4.f19816f = aVar2.f19816f;
            aVar2.f19816f = null;
            return aVar2;
        }
    }

    /* compiled from: AsyncTimeout.kt */
    /* loaded from: classes3.dex */
    public static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            a a10;
            while (true) {
                try {
                    synchronized (a.class) {
                        a aVar = a.f19814j;
                        a10 = C0265a.a();
                        if (a10 == a.f19814j) {
                            a.f19814j = null;
                            return;
                        }
                        tf.d dVar = tf.d.f30009a;
                    }
                    if (a10 != null) {
                        a10.k();
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f19812h = millis;
        f19813i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        a aVar;
        long j10 = this.c;
        boolean z10 = this.f19859a;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 == 0 && !z10) {
            return;
        }
        synchronized (a.class) {
            if (!this.f19815e) {
                this.f19815e = true;
                if (f19814j == null) {
                    f19814j = new a();
                    new b().start();
                }
                long nanoTime = System.nanoTime();
                if (i10 != 0 && z10) {
                    this.f19817g = Math.min(j10, c() - nanoTime) + nanoTime;
                } else if (i10 != 0) {
                    this.f19817g = j10 + nanoTime;
                } else if (z10) {
                    this.f19817g = c();
                } else {
                    throw new AssertionError();
                }
                long j11 = this.f19817g - nanoTime;
                a aVar2 = f19814j;
                kotlin.jvm.internal.g.b(aVar2);
                while (true) {
                    aVar = aVar2.f19816f;
                    if (aVar == null || j11 < aVar.f19817g - nanoTime) {
                        break;
                    }
                    aVar2 = aVar;
                }
                this.f19816f = aVar;
                aVar2.f19816f = this;
                if (aVar2 == f19814j) {
                    a.class.notify();
                }
                tf.d dVar = tf.d.f30009a;
            } else {
                throw new IllegalStateException("Unbalanced enter/exit".toString());
            }
        }
    }

    public final boolean i() {
        synchronized (a.class) {
            if (!this.f19815e) {
                return false;
            }
            this.f19815e = false;
            a aVar = f19814j;
            while (aVar != null) {
                a aVar2 = aVar.f19816f;
                if (aVar2 == this) {
                    aVar.f19816f = this.f19816f;
                    this.f19816f = null;
                    return false;
                }
                aVar = aVar2;
            }
            return true;
        }
    }

    public IOException j(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public void k() {
    }
}
