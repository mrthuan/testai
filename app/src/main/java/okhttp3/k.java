package okhttp3;

import com.google.android.gms.common.api.Api;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.connection.e;

/* compiled from: Dispatcher.kt */
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public ThreadPoolExecutor f23352a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque<e.a> f23353b = new ArrayDeque<>();
    public final ArrayDeque<e.a> c = new ArrayDeque<>();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayDeque<okhttp3.internal.connection.e> f23354d = new ArrayDeque<>();

    public final synchronized ExecutorService a() {
        ThreadPoolExecutor threadPoolExecutor;
        if (this.f23352a == null) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            SynchronousQueue synchronousQueue = new SynchronousQueue();
            String name = kotlin.jvm.internal.g.h(" Dispatcher", ak.b.f670g);
            kotlin.jvm.internal.g.e(name, "name");
            this.f23352a = new ThreadPoolExecutor(0, (int) Api.BaseClientBuilder.API_PRIORITY_OTHER, 60L, timeUnit, synchronousQueue, new ak.a(name, false));
        }
        threadPoolExecutor = this.f23352a;
        kotlin.jvm.internal.g.b(threadPoolExecutor);
        return threadPoolExecutor;
    }

    public final void b(e.a call) {
        kotlin.jvm.internal.g.e(call, "call");
        call.f23311b.decrementAndGet();
        ArrayDeque<e.a> arrayDeque = this.c;
        synchronized (this) {
            if (arrayDeque.remove(call)) {
                d();
                tf.d dVar = tf.d.f30009a;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        g();
    }

    public final void c(okhttp3.internal.connection.e eVar) {
        ArrayDeque<okhttp3.internal.connection.e> arrayDeque = this.f23354d;
        synchronized (this) {
            if (arrayDeque.remove(eVar)) {
                d();
                tf.d dVar = tf.d.f30009a;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        g();
    }

    public final synchronized void d() {
    }

    public final synchronized void e() {
    }

    public final synchronized void f() {
    }

    public final void g() {
        byte[] bArr = ak.b.f665a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<e.a> it = this.f23353b.iterator();
            kotlin.jvm.internal.g.d(it, "readyAsyncCalls.iterator()");
            while (it.hasNext()) {
                e.a next = it.next();
                int size = this.c.size();
                e();
                if (size >= 64) {
                    break;
                }
                int i10 = next.f23311b.get();
                f();
                if (i10 < 5) {
                    it.remove();
                    next.f23311b.incrementAndGet();
                    arrayList.add(next);
                    this.c.add(next);
                }
            }
            h();
            tf.d dVar = tf.d.f30009a;
        }
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            int i12 = i11 + 1;
            e.a aVar = (e.a) arrayList.get(i11);
            ExecutorService a10 = a();
            aVar.getClass();
            okhttp3.internal.connection.e eVar = aVar.c;
            k kVar = eVar.f23293a.f23383a;
            byte[] bArr2 = ak.b.f665a;
            try {
                try {
                    ((ThreadPoolExecutor) a10).execute(aVar);
                } catch (RejectedExecutionException e10) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e10);
                    eVar.i(interruptedIOException);
                    aVar.f23310a.b(eVar, interruptedIOException);
                    eVar.f23293a.f23383a.b(aVar);
                }
                i11 = i12;
            } catch (Throwable th2) {
                eVar.f23293a.f23383a.b(aVar);
                throw th2;
            }
        }
    }

    public final synchronized int h() {
        return this.c.size() + this.f23354d.size();
    }
}
