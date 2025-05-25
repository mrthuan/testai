package sa;

import android.os.SystemClock;
import android.util.Log;
import androidx.appcompat.widget.i;
import com.google.android.datatransport.Priority;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import l.r;
import ma.j0;
import ma.z;
import oa.b0;
import s6.e;
import s6.g;
import v6.u;

/* compiled from: ReportQueue.java */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final double f29762a;

    /* renamed from: b  reason: collision with root package name */
    public final double f29763b;
    public final long c;

    /* renamed from: d  reason: collision with root package name */
    public final long f29764d;

    /* renamed from: e  reason: collision with root package name */
    public final int f29765e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayBlockingQueue f29766f;

    /* renamed from: g  reason: collision with root package name */
    public final ThreadPoolExecutor f29767g;

    /* renamed from: h  reason: collision with root package name */
    public final e<b0> f29768h;

    /* renamed from: i  reason: collision with root package name */
    public final i f29769i;

    /* renamed from: j  reason: collision with root package name */
    public int f29770j;

    /* renamed from: k  reason: collision with root package name */
    public long f29771k;

    /* compiled from: ReportQueue.java */
    /* loaded from: classes2.dex */
    public final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final z f29772a;

        /* renamed from: b  reason: collision with root package name */
        public final TaskCompletionSource<z> f29773b;

        public a(z zVar, TaskCompletionSource taskCompletionSource) {
            this.f29772a = zVar;
            this.f29773b = taskCompletionSource;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c cVar = c.this;
            z zVar = this.f29772a;
            cVar.b(zVar, this.f29773b);
            ((AtomicInteger) cVar.f29769i.f2601b).set(0);
            double min = Math.min(3600000.0d, Math.pow(cVar.f29763b, cVar.a()) * (60000.0d / cVar.f29762a));
            String.format(Locale.US, "%.2f", Double.valueOf(min / 1000.0d));
            zVar.c();
            Log.isLoggable("FirebaseCrashlytics", 3);
            try {
                Thread.sleep((long) min);
            } catch (InterruptedException unused) {
            }
        }
    }

    public c(e<b0> eVar, ta.c cVar, i iVar) {
        double d10 = cVar.f29979d;
        this.f29762a = d10;
        this.f29763b = cVar.f29980e;
        this.c = cVar.f29981f * 1000;
        this.f29768h = eVar;
        this.f29769i = iVar;
        this.f29764d = SystemClock.elapsedRealtime();
        int i10 = (int) d10;
        this.f29765e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f29766f = arrayBlockingQueue;
        this.f29767g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f29770j = 0;
        this.f29771k = 0L;
    }

    public final int a() {
        boolean z10;
        int max;
        if (this.f29771k == 0) {
            this.f29771k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.f29771k) / this.c);
        if (this.f29766f.size() == this.f29765e) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            max = Math.min(100, this.f29770j + currentTimeMillis);
        } else {
            max = Math.max(0, this.f29770j - currentTimeMillis);
        }
        if (this.f29770j != max) {
            this.f29770j = max;
            this.f29771k = System.currentTimeMillis();
        }
        return max;
    }

    public final void b(final z zVar, final TaskCompletionSource<z> taskCompletionSource) {
        final boolean z10;
        zVar.c();
        Log.isLoggable("FirebaseCrashlytics", 3);
        if (SystemClock.elapsedRealtime() - this.f29764d < 2000) {
            z10 = true;
        } else {
            z10 = false;
        }
        ((u) this.f29768h).a(new s6.a(zVar.a(), Priority.HIGHEST), new g() { // from class: sa.b
            @Override // s6.g
            public final void b(Exception exc) {
                c cVar = c.this;
                cVar.getClass();
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                if (exc != null) {
                    taskCompletionSource2.c(exc);
                    return;
                }
                if (z10) {
                    boolean z11 = true;
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    new Thread(new r(6, cVar, countDownLatch)).start();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    ExecutorService executorService = j0.f21911a;
                    boolean z12 = false;
                    try {
                        long nanos = timeUnit.toNanos(2L);
                        long nanoTime = System.nanoTime() + nanos;
                        while (true) {
                            try {
                                try {
                                    countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                                    break;
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (z11) {
                                        Thread.currentThread().interrupt();
                                    }
                                    throw th;
                                }
                            } catch (InterruptedException unused) {
                                nanos = nanoTime - System.nanoTime();
                                z12 = true;
                            }
                        }
                        if (z12) {
                            Thread.currentThread().interrupt();
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        z11 = z12;
                    }
                }
                taskCompletionSource2.d(zVar);
            }
        });
    }
}
