package com.apm.insight.runtime;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes.dex */
public class u {

    /* renamed from: a  reason: collision with root package name */
    static final b<d, Runnable> f6810a = new b<d, Runnable>() { // from class: com.apm.insight.runtime.u.1
    };

    /* renamed from: b  reason: collision with root package name */
    static final b<Message, Runnable> f6811b = new b<Message, Runnable>() { // from class: com.apm.insight.runtime.u.2
    };
    private final HandlerThread c;

    /* renamed from: f  reason: collision with root package name */
    private volatile Handler f6814f;

    /* renamed from: d  reason: collision with root package name */
    private final Queue<d> f6812d = new ConcurrentLinkedQueue();

    /* renamed from: e  reason: collision with root package name */
    private final Queue<Message> f6813e = new ConcurrentLinkedQueue();

    /* renamed from: g  reason: collision with root package name */
    private final Object f6815g = new Object();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        public void a() {
            while (!u.this.f6812d.isEmpty()) {
                d dVar = (d) u.this.f6812d.poll();
                if (u.this.f6814f != null) {
                    try {
                        u.this.f6814f.sendMessageAtTime(dVar.f6819a, dVar.f6820b);
                    } catch (Throwable unused) {
                    }
                }
            }
        }

        public void b() {
            while (!u.this.f6813e.isEmpty()) {
                if (u.this.f6814f != null) {
                    try {
                        u.this.f6814f.sendMessageAtFrontOfQueue((Message) u.this.f6813e.poll());
                    } catch (Throwable unused) {
                    }
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            b();
            a();
        }
    }

    /* loaded from: classes.dex */
    public interface b<A, B> {
    }

    /* loaded from: classes.dex */
    public class c extends HandlerThread {

        /* renamed from: a  reason: collision with root package name */
        volatile int f6817a;

        /* renamed from: b  reason: collision with root package name */
        volatile boolean f6818b;

        public c(String str) {
            super(str);
            this.f6817a = 0;
            this.f6818b = false;
        }

        @Override // android.os.HandlerThread
        public void onLooperPrepared() {
            super.onLooperPrepared();
            synchronized (u.this.f6815g) {
                u.this.f6814f = new Handler();
            }
            u.this.f6814f.post(new a());
            while (true) {
                try {
                    Looper.loop();
                } catch (Throwable th2) {
                    try {
                        com.apm.insight.b.g.a(com.apm.insight.i.g()).a().c();
                        if (this.f6817a < 5) {
                            com.apm.insight.c.a().a("NPTH_CATCH", th2);
                        } else if (!this.f6818b) {
                            this.f6818b = true;
                            com.apm.insight.c.a().a("NPTH_ERR_MAX", new RuntimeException());
                        }
                        this.f6817a++;
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        Message f6819a;

        /* renamed from: b  reason: collision with root package name */
        long f6820b;

        public d(Message message, long j10) {
            this.f6819a = message;
            this.f6820b = j10;
        }
    }

    public u(String str) {
        this.c = new c(str);
    }

    public Handler a() {
        return this.f6814f;
    }

    public HandlerThread c() {
        return this.c;
    }

    private Message b(Runnable runnable) {
        return Message.obtain(this.f6814f, runnable);
    }

    public void b() {
        this.c.start();
    }

    public final boolean a(Message message, long j10) {
        if (j10 < 0) {
            j10 = 0;
        }
        return b(message, SystemClock.uptimeMillis() + j10);
    }

    public final boolean b(Message message, long j10) {
        if (this.f6814f == null) {
            synchronized (this.f6815g) {
                if (this.f6814f == null) {
                    this.f6812d.add(new d(message, j10));
                    return true;
                }
            }
        }
        try {
            return this.f6814f.sendMessageAtTime(message, j10);
        } catch (Throwable unused) {
            return true;
        }
    }

    public final boolean a(Runnable runnable) {
        return a(b(runnable), 0L);
    }

    public final boolean a(Runnable runnable, long j10) {
        return a(b(runnable), j10);
    }
}
