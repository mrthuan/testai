package androidx.work.impl.utils.futures;

import androidx.activity.r;
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
public abstract class AbstractFuture<V> implements y9.a<V> {

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f4980d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e  reason: collision with root package name */
    public static final Logger f4981e = Logger.getLogger(AbstractFuture.class.getName());

    /* renamed from: f  reason: collision with root package name */
    public static final a f4982f;

    /* renamed from: g  reason: collision with root package name */
    public static final Object f4983g;

    /* renamed from: a  reason: collision with root package name */
    public volatile Object f4984a;

    /* renamed from: b  reason: collision with root package name */
    public volatile c f4985b;
    public volatile g c;

    /* loaded from: classes.dex */
    public static final class Failure {

        /* renamed from: b  reason: collision with root package name */
        public static final Failure f4986b = new Failure(new Throwable("Failure occurred while trying to finish a future.") { // from class: androidx.work.impl.utils.futures.AbstractFuture.Failure.1
            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        });

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f4987a;

        public Failure(Throwable th2) {
            boolean z10 = AbstractFuture.f4980d;
            th2.getClass();
            this.f4987a = th2;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract boolean a(AbstractFuture<?> abstractFuture, c cVar, c cVar2);

        public abstract boolean b(AbstractFuture<?> abstractFuture, Object obj, Object obj2);

        public abstract boolean c(AbstractFuture<?> abstractFuture, g gVar, g gVar2);

        public abstract void d(g gVar, g gVar2);

        public abstract void e(g gVar, Thread thread);
    }

    /* loaded from: classes.dex */
    public static final class b {
        public static final b c;

        /* renamed from: d  reason: collision with root package name */
        public static final b f4988d;

        /* renamed from: a  reason: collision with root package name */
        public final boolean f4989a;

        /* renamed from: b  reason: collision with root package name */
        public final Throwable f4990b;

        static {
            if (AbstractFuture.f4980d) {
                f4988d = null;
                c = null;
                return;
            }
            f4988d = new b(false, null);
            c = new b(true, null);
        }

        public b(boolean z10, Throwable th2) {
            this.f4989a = z10;
            this.f4990b = th2;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: d  reason: collision with root package name */
        public static final c f4991d = new c(null, null);

        /* renamed from: a  reason: collision with root package name */
        public final Runnable f4992a;

        /* renamed from: b  reason: collision with root package name */
        public final Executor f4993b;
        public c c;

        public c(Runnable runnable, Executor executor) {
            this.f4992a = runnable;
            this.f4993b = executor;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends a {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<g, Thread> f4994a;

        /* renamed from: b  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<g, g> f4995b;
        public final AtomicReferenceFieldUpdater<AbstractFuture, g> c;

        /* renamed from: d  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<AbstractFuture, c> f4996d;

        /* renamed from: e  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<AbstractFuture, Object> f4997e;

        public d(AtomicReferenceFieldUpdater<g, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<g, g> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractFuture, g> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractFuture, c> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractFuture, Object> atomicReferenceFieldUpdater5) {
            this.f4994a = atomicReferenceFieldUpdater;
            this.f4995b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.f4996d = atomicReferenceFieldUpdater4;
            this.f4997e = atomicReferenceFieldUpdater5;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.a
        public final boolean a(AbstractFuture<?> abstractFuture, c cVar, c cVar2) {
            AtomicReferenceFieldUpdater<AbstractFuture, c> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f4996d;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractFuture, cVar, cVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractFuture) == cVar);
            return false;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.a
        public final boolean b(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<AbstractFuture, Object> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.f4997e;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractFuture, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractFuture) == obj);
            return false;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.a
        public final boolean c(AbstractFuture<?> abstractFuture, g gVar, g gVar2) {
            AtomicReferenceFieldUpdater<AbstractFuture, g> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.c;
                if (atomicReferenceFieldUpdater.compareAndSet(abstractFuture, gVar, gVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(abstractFuture) == gVar);
            return false;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.a
        public final void d(g gVar, g gVar2) {
            this.f4995b.lazySet(gVar, gVar2);
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.a
        public final void e(g gVar, Thread thread) {
            this.f4994a.lazySet(gVar, thread);
        }
    }

    /* loaded from: classes.dex */
    public static final class e<V> implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final AbstractFuture<V> f4998a;

        /* renamed from: b  reason: collision with root package name */
        public final y9.a<? extends V> f4999b;

        public e(AbstractFuture<V> abstractFuture, y9.a<? extends V> aVar) {
            this.f4998a = abstractFuture;
            this.f4999b = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f4998a.f4984a != this) {
                return;
            }
            if (AbstractFuture.f4982f.b(this.f4998a, this, AbstractFuture.e(this.f4999b))) {
                AbstractFuture.b(this.f4998a);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends a {
        @Override // androidx.work.impl.utils.futures.AbstractFuture.a
        public final boolean a(AbstractFuture<?> abstractFuture, c cVar, c cVar2) {
            synchronized (abstractFuture) {
                if (abstractFuture.f4985b == cVar) {
                    abstractFuture.f4985b = cVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.a
        public final boolean b(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            synchronized (abstractFuture) {
                if (abstractFuture.f4984a == obj) {
                    abstractFuture.f4984a = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.a
        public final boolean c(AbstractFuture<?> abstractFuture, g gVar, g gVar2) {
            synchronized (abstractFuture) {
                if (abstractFuture.c == gVar) {
                    abstractFuture.c = gVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.a
        public final void d(g gVar, g gVar2) {
            gVar.f5001b = gVar2;
        }

        @Override // androidx.work.impl.utils.futures.AbstractFuture.a
        public final void e(g gVar, Thread thread) {
            gVar.f5000a = thread;
        }
    }

    /* loaded from: classes.dex */
    public static final class g {
        public static final g c = new g(0);

        /* renamed from: a  reason: collision with root package name */
        public volatile Thread f5000a;

        /* renamed from: b  reason: collision with root package name */
        public volatile g f5001b;

        public g(int i10) {
        }

        public g() {
            AbstractFuture.f4982f.e(this, Thread.currentThread());
        }
    }

    static {
        a fVar;
        try {
            fVar = new d(AtomicReferenceFieldUpdater.newUpdater(g.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(g.class, g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, g.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Object.class, "a"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            fVar = new f();
        }
        f4982f = fVar;
        if (th != null) {
            f4981e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f4983g = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.work.impl.utils.futures.AbstractFuture$a] */
    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.work.impl.utils.futures.AbstractFuture<?>] */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.work.impl.utils.futures.AbstractFuture] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v7, types: [androidx.work.impl.utils.futures.AbstractFuture, androidx.work.impl.utils.futures.AbstractFuture<V>] */
    public static void b(AbstractFuture<?> abstractFuture) {
        c cVar;
        c cVar2;
        c cVar3 = null;
        while (true) {
            g gVar = ((AbstractFuture) abstractFuture).c;
            if (f4982f.c((AbstractFuture) abstractFuture, gVar, g.c)) {
                while (gVar != null) {
                    Thread thread = gVar.f5000a;
                    if (thread != null) {
                        gVar.f5000a = null;
                        LockSupport.unpark(thread);
                    }
                    gVar = gVar.f5001b;
                }
                do {
                    cVar = ((AbstractFuture) abstractFuture).f4985b;
                } while (!f4982f.a((AbstractFuture) abstractFuture, cVar, c.f4991d));
                while (true) {
                    cVar2 = cVar3;
                    cVar3 = cVar;
                    if (cVar3 == null) {
                        break;
                    }
                    cVar = cVar3.c;
                    cVar3.c = cVar2;
                }
                while (cVar2 != null) {
                    cVar3 = cVar2.c;
                    Runnable runnable = cVar2.f4992a;
                    if (runnable instanceof e) {
                        e eVar = (e) runnable;
                        abstractFuture = eVar.f4998a;
                        if (abstractFuture.f4984a == eVar) {
                            if (f4982f.b(abstractFuture, eVar, e(eVar.f4999b))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        c(runnable, cVar2.f4993b);
                    }
                    cVar2 = cVar3;
                }
                return;
            }
        }
    }

    public static void c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            Level level = Level.SEVERE;
            f4981e.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    public static Object e(y9.a<?> aVar) {
        Object obj;
        if (aVar instanceof AbstractFuture) {
            Object obj2 = ((AbstractFuture) aVar).f4984a;
            if (obj2 instanceof b) {
                b bVar = (b) obj2;
                if (bVar.f4989a) {
                    if (bVar.f4990b != null) {
                        return new b(false, bVar.f4990b);
                    }
                    return b.f4988d;
                }
                return obj2;
            }
            return obj2;
        }
        boolean isCancelled = aVar.isCancelled();
        boolean z10 = true;
        if ((!f4980d) & isCancelled) {
            return b.f4988d;
        }
        boolean z11 = false;
        while (true) {
            try {
                try {
                    obj = aVar.get();
                    break;
                } catch (CancellationException e10) {
                    if (!isCancelled) {
                        return new Failure(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + aVar, e10));
                    }
                    return new b(false, e10);
                } catch (ExecutionException e11) {
                    return new Failure(e11.getCause());
                } catch (Throwable th2) {
                    return new Failure(th2);
                }
            } catch (InterruptedException unused) {
                z11 = z10;
            } catch (Throwable th3) {
                if (z11) {
                    Thread.currentThread().interrupt();
                }
                throw th3;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        if (obj == null) {
            return f4983g;
        }
        return obj;
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
        c cVar = this.f4985b;
        c cVar2 = c.f4991d;
        if (cVar != cVar2) {
            c cVar3 = new c(runnable, executor);
            do {
                cVar3.c = cVar;
                if (f4982f.a(this, cVar, cVar3)) {
                    return;
                }
                cVar = this.f4985b;
            } while (cVar != cVar2);
            c(runnable, executor);
        }
        c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        boolean z11;
        b bVar;
        boolean z12;
        Object obj = this.f4984a;
        if (obj == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!(z11 | (obj instanceof e))) {
            return false;
        }
        if (f4980d) {
            bVar = new b(z10, new CancellationException("Future.cancel() was called."));
        } else if (z10) {
            bVar = b.c;
        } else {
            bVar = b.f4988d;
        }
        AbstractFuture<V> abstractFuture = this;
        boolean z13 = false;
        while (true) {
            if (f4982f.b(abstractFuture, obj, bVar)) {
                b(abstractFuture);
                if (!(obj instanceof e)) {
                    return true;
                }
                y9.a<? extends V> aVar = ((e) obj).f4999b;
                if (aVar instanceof AbstractFuture) {
                    abstractFuture = (AbstractFuture) aVar;
                    obj = abstractFuture.f4984a;
                    if (obj == null) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!(z12 | (obj instanceof e))) {
                        return true;
                    }
                    z13 = true;
                } else {
                    aVar.cancel(z10);
                    return true;
                }
            } else {
                obj = abstractFuture.f4984a;
                if (!(obj instanceof e)) {
                    return z13;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V d(Object obj) {
        if (!(obj instanceof b)) {
            if (!(obj instanceof Failure)) {
                if (obj == f4983g) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((Failure) obj).f4987a);
        }
        Throwable th2 = ((b) obj).f4990b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th2);
        throw cancellationException;
    }

    public final String f() {
        String valueOf;
        Object obj = this.f4984a;
        if (obj instanceof e) {
            StringBuilder sb2 = new StringBuilder("setFuture=[");
            y9.a<? extends V> aVar = ((e) obj).f4999b;
            if (aVar == this) {
                valueOf = "this future";
            } else {
                valueOf = String.valueOf(aVar);
            }
            return r.g(sb2, valueOf, "]");
        } else if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        } else {
            return null;
        }
    }

    public final void g(g gVar) {
        gVar.f5000a = null;
        while (true) {
            g gVar2 = this.c;
            if (gVar2 == g.c) {
                return;
            }
            g gVar3 = null;
            while (gVar2 != null) {
                g gVar4 = gVar2.f5001b;
                if (gVar2.f5000a != null) {
                    gVar3 = gVar2;
                } else if (gVar3 != null) {
                    gVar3.f5001b = gVar4;
                    if (gVar3.f5000a == null) {
                        break;
                    }
                } else if (!f4982f.c(this, gVar2, gVar4)) {
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.futures.AbstractFuture.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f4984a instanceof b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj;
        boolean z10;
        if (this.f4984a != null) {
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
        if (this.f4984a instanceof b) {
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

    @Override // java.util.concurrent.Future
    public final V get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f4984a;
            if ((obj2 != null) & (!(obj2 instanceof e))) {
                return d(obj2);
            }
            g gVar = this.c;
            g gVar2 = g.c;
            if (gVar != gVar2) {
                g gVar3 = new g();
                do {
                    a aVar = f4982f;
                    aVar.d(gVar3, gVar);
                    if (aVar.c(this, gVar, gVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f4984a;
                            } else {
                                g(gVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof e))));
                        return d(obj);
                    }
                    gVar = this.c;
                } while (gVar != gVar2);
                return d(this.f4984a);
            }
            return d(this.f4984a);
        }
        throw new InterruptedException();
    }
}
