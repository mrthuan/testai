package androidx.concurrent.futures;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class AbstractResolvableFuture<V> implements y9.a<V> {

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f2730d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e  reason: collision with root package name */
    public static final Logger f2731e = Logger.getLogger(AbstractResolvableFuture.class.getName());

    /* renamed from: f  reason: collision with root package name */
    public static final a f2732f;

    /* renamed from: g  reason: collision with root package name */
    public static final Object f2733g;

    /* renamed from: a  reason: collision with root package name */
    public volatile Object f2734a;

    /* renamed from: b  reason: collision with root package name */
    public volatile c f2735b;
    public volatile g c;

    /* loaded from: classes.dex */
    public static final class Failure {

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f2736a;

        static {
            new Failure(new Throwable("Failure occurred while trying to finish a future.") { // from class: androidx.concurrent.futures.AbstractResolvableFuture.Failure.1
                @Override // java.lang.Throwable
                public synchronized Throwable fillInStackTrace() {
                    return this;
                }
            });
        }

        public Failure(Throwable th2) {
            boolean z10 = AbstractResolvableFuture.f2730d;
            th2.getClass();
            this.f2736a = th2;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract boolean a(AbstractResolvableFuture<?> abstractResolvableFuture, c cVar, c cVar2);

        public abstract boolean b(AbstractResolvableFuture<?> abstractResolvableFuture, Object obj, Object obj2);

        public abstract boolean c(AbstractResolvableFuture<?> abstractResolvableFuture, g gVar, g gVar2);

        public abstract void d(g gVar, g gVar2);

        public abstract void e(g gVar, Thread thread);
    }

    /* loaded from: classes.dex */
    public static final class b {
        public static final b c;

        /* renamed from: d  reason: collision with root package name */
        public static final b f2737d;

        /* renamed from: a  reason: collision with root package name */
        public final boolean f2738a;

        /* renamed from: b  reason: collision with root package name */
        public final Throwable f2739b;

        static {
            if (AbstractResolvableFuture.f2730d) {
                f2737d = null;
                c = null;
                return;
            }
            f2737d = new b(false, null);
            c = new b(true, null);
        }

        public b(boolean z10, Throwable th2) {
            this.f2738a = z10;
            this.f2739b = th2;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: d  reason: collision with root package name */
        public static final c f2740d = new c(null, null);

        /* renamed from: a  reason: collision with root package name */
        public final Runnable f2741a;

        /* renamed from: b  reason: collision with root package name */
        public final Executor f2742b;
        public c c;

        public c(Runnable runnable, Executor executor) {
            this.f2741a = runnable;
            this.f2742b = executor;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends a {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<g, Thread> f2743a;

        /* renamed from: b  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<g, g> f2744b;
        public final AtomicReferenceFieldUpdater<AbstractResolvableFuture, g> c;

        /* renamed from: d  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<AbstractResolvableFuture, c> f2745d;

        /* renamed from: e  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<AbstractResolvableFuture, Object> f2746e;

        public d(AtomicReferenceFieldUpdater<g, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<g, g> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractResolvableFuture, g> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractResolvableFuture, c> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractResolvableFuture, Object> atomicReferenceFieldUpdater5) {
            this.f2743a = atomicReferenceFieldUpdater;
            this.f2744b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.f2745d = atomicReferenceFieldUpdater4;
            this.f2746e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.a
        public final boolean a(AbstractResolvableFuture<?> abstractResolvableFuture, c cVar, c cVar2) {
            AtomicReferenceFieldUpdater<AbstractResolvableFuture, c> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f2745d;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractResolvableFuture, cVar, cVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractResolvableFuture) == cVar);
            return false;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.a
        public final boolean b(AbstractResolvableFuture<?> abstractResolvableFuture, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<AbstractResolvableFuture, Object> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f2746e;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractResolvableFuture, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractResolvableFuture) == obj);
            return false;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.a
        public final boolean c(AbstractResolvableFuture<?> abstractResolvableFuture, g gVar, g gVar2) {
            AtomicReferenceFieldUpdater<AbstractResolvableFuture, g> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.c;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractResolvableFuture, gVar, gVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractResolvableFuture) == gVar);
            return false;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.a
        public final void d(g gVar, g gVar2) {
            this.f2744b.lazySet(gVar, gVar2);
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.a
        public final void e(g gVar, Thread thread) {
            this.f2743a.lazySet(gVar, thread);
        }
    }

    /* loaded from: classes.dex */
    public static final class e<V> implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends a {
        @Override // androidx.concurrent.futures.AbstractResolvableFuture.a
        public final boolean a(AbstractResolvableFuture<?> abstractResolvableFuture, c cVar, c cVar2) {
            synchronized (abstractResolvableFuture) {
                if (abstractResolvableFuture.f2735b == cVar) {
                    abstractResolvableFuture.f2735b = cVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.a
        public final boolean b(AbstractResolvableFuture<?> abstractResolvableFuture, Object obj, Object obj2) {
            synchronized (abstractResolvableFuture) {
                if (abstractResolvableFuture.f2734a == obj) {
                    abstractResolvableFuture.f2734a = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.a
        public final boolean c(AbstractResolvableFuture<?> abstractResolvableFuture, g gVar, g gVar2) {
            synchronized (abstractResolvableFuture) {
                if (abstractResolvableFuture.c == gVar) {
                    abstractResolvableFuture.c = gVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.a
        public final void d(g gVar, g gVar2) {
            gVar.f2748b = gVar2;
        }

        @Override // androidx.concurrent.futures.AbstractResolvableFuture.a
        public final void e(g gVar, Thread thread) {
            gVar.f2747a = thread;
        }
    }

    /* loaded from: classes.dex */
    public static final class g {
        public static final g c = new g(0);

        /* renamed from: a  reason: collision with root package name */
        public volatile Thread f2747a;

        /* renamed from: b  reason: collision with root package name */
        public volatile g f2748b;

        public g(int i10) {
        }

        public g() {
            AbstractResolvableFuture.f2732f.e(this, Thread.currentThread());
        }
    }

    static {
        a fVar;
        try {
            fVar = new d(AtomicReferenceFieldUpdater.newUpdater(g.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(g.class, g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, g.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, Object.class, "a"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            fVar = new f();
        }
        f2732f = fVar;
        if (th != null) {
            f2731e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f2733g = new Object();
    }

    public static void c(AbstractResolvableFuture<?> abstractResolvableFuture) {
        g gVar;
        c cVar;
        do {
            gVar = abstractResolvableFuture.c;
        } while (!f2732f.c(abstractResolvableFuture, gVar, g.c));
        while (gVar != null) {
            Thread thread = gVar.f2747a;
            if (thread != null) {
                gVar.f2747a = null;
                LockSupport.unpark(thread);
            }
            gVar = gVar.f2748b;
        }
        abstractResolvableFuture.b();
        do {
            cVar = abstractResolvableFuture.f2735b;
        } while (!f2732f.a(abstractResolvableFuture, cVar, c.f2740d));
        c cVar2 = null;
        while (cVar != null) {
            c cVar3 = cVar.c;
            cVar.c = cVar2;
            cVar2 = cVar;
            cVar = cVar3;
        }
        while (cVar2 != null) {
            c cVar4 = cVar2.c;
            Runnable runnable = cVar2.f2741a;
            if (!(runnable instanceof e)) {
                d(runnable, cVar2.f2742b);
                cVar2 = cVar4;
            } else {
                ((e) runnable).getClass();
                throw null;
            }
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            Level level = Level.SEVERE;
            f2731e.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    public final void a(StringBuilder sb2) {
        V v10;
        String valueOf;
        boolean z10 = false;
        while (true) {
            try {
                try {
                    v10 = get();
                    break;
                } catch (CancellationException unused) {
                    sb2.append("CANCELLED");
                    return;
                } catch (RuntimeException e10) {
                    sb2.append("UNKNOWN, cause=[");
                    sb2.append(e10.getClass());
                    sb2.append(" thrown from get()]");
                    return;
                } catch (ExecutionException e11) {
                    sb2.append("FAILURE, cause=[");
                    sb2.append(e11.getCause());
                    sb2.append("]");
                    return;
                }
            } catch (InterruptedException unused2) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        sb2.append("SUCCESS, result=[");
        if (v10 == this) {
            valueOf = "this future";
        } else {
            valueOf = String.valueOf(v10);
        }
        sb2.append(valueOf);
        sb2.append("]");
    }

    @Override // y9.a
    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        c cVar = this.f2735b;
        c cVar2 = c.f2740d;
        if (cVar != cVar2) {
            c cVar3 = new c(runnable, executor);
            do {
                cVar3.c = cVar;
                if (f2732f.a(this, cVar, cVar3)) {
                    return;
                }
                cVar = this.f2735b;
            } while (cVar != cVar2);
            d(runnable, executor);
        }
        d(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        boolean z11;
        b bVar;
        Object obj = this.f2734a;
        if (obj == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!(z11 | (obj instanceof e))) {
            return false;
        }
        if (f2730d) {
            bVar = new b(z10, new CancellationException("Future.cancel() was called."));
        } else if (z10) {
            bVar = b.c;
        } else {
            bVar = b.f2737d;
        }
        while (!f2732f.b(this, obj, bVar)) {
            obj = this.f2734a;
            if (!(obj instanceof e)) {
                return false;
            }
        }
        c(this);
        if (!(obj instanceof e)) {
            return true;
        }
        ((e) obj).getClass();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V e(Object obj) {
        if (!(obj instanceof b)) {
            if (!(obj instanceof Failure)) {
                if (obj == f2733g) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((Failure) obj).f2736a);
        }
        Throwable th2 = ((b) obj).f2739b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th2);
        throw cancellationException;
    }

    public String f() {
        Object obj = this.f2734a;
        if (obj instanceof e) {
            StringBuilder sb2 = new StringBuilder("setFuture=[");
            ((e) obj).getClass();
            sb2.append("null");
            sb2.append("]");
            return sb2.toString();
        } else if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        } else {
            return null;
        }
    }

    public final void g(g gVar) {
        gVar.f2747a = null;
        while (true) {
            g gVar2 = this.c;
            if (gVar2 == g.c) {
                return;
            }
            g gVar3 = null;
            while (gVar2 != null) {
                g gVar4 = gVar2.f2748b;
                if (gVar2.f2747a != null) {
                    gVar3 = gVar2;
                } else if (gVar3 != null) {
                    gVar3.f2748b = gVar4;
                    if (gVar3.f2747a == null) {
                        break;
                    }
                } else if (!f2732f.c(this, gVar2, gVar4)) {
                    break;
                }
                gVar2 = gVar4;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00a7 -> B:56:0x00ad). Please submit an issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V get(long r13, java.util.concurrent.TimeUnit r15) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.concurrent.futures.AbstractResolvableFuture.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public boolean h(V v10) {
        if (v10 == null) {
            v10 = (V) f2733g;
        }
        if (f2732f.b(this, null, v10)) {
            c(this);
            return true;
        }
        return false;
    }

    public boolean i(Throwable th2) {
        th2.getClass();
        if (f2732f.b(this, null, new Failure(th2))) {
            c(this);
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f2734a instanceof b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj;
        boolean z10;
        if (this.f2734a != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        return (!(obj instanceof e)) & z10;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f2734a instanceof b) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            a(sb2);
        } else {
            try {
                str = f();
            } catch (RuntimeException e10) {
                str = "Exception thrown from implementation: " + e10.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(str);
                sb2.append("]");
            } else if (isDone()) {
                a(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public void b() {
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f2734a;
            if ((obj2 != null) & (!(obj2 instanceof e))) {
                return e(obj2);
            }
            g gVar = this.c;
            g gVar2 = g.c;
            if (gVar != gVar2) {
                g gVar3 = new g();
                do {
                    a aVar = f2732f;
                    aVar.d(gVar3, gVar);
                    if (aVar.c(this, gVar, gVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f2734a;
                            } else {
                                g(gVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof e))));
                        return e(obj);
                    }
                    gVar = this.c;
                } while (gVar != gVar2);
                return e(this.f2734a);
            }
            return e(this.f2734a);
        }
        throw new InterruptedException();
    }
}
