package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;

/* compiled from: EventLoop.common.kt */
/* loaded from: classes.dex */
public abstract class o0 extends p0 implements d0 {

    /* renamed from: f  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f20218f = AtomicReferenceFieldUpdater.newUpdater(o0.class, Object.class, "_queue");

    /* renamed from: g  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f20219g = AtomicReferenceFieldUpdater.newUpdater(o0.class, Object.class, "_delayed");

    /* renamed from: h  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f20220h = AtomicIntegerFieldUpdater.newUpdater(o0.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    /* compiled from: EventLoop.common.kt */
    /* loaded from: classes.dex */
    public final class a extends b {
        public final g<tf.d> c;

        public a(long j10, h hVar) {
            super(j10);
            this.c = hVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.c.z(o0.this, tf.d.f30009a);
        }

        @Override // kotlinx.coroutines.o0.b
        public final String toString() {
            return super.toString() + this.c;
        }
    }

    /* compiled from: EventLoop.common.kt */
    /* loaded from: classes.dex */
    public static abstract class b implements Runnable, Comparable<b>, k0, kotlinx.coroutines.internal.u {
        private volatile Object _heap;

        /* renamed from: a  reason: collision with root package name */
        public long f20222a;

        /* renamed from: b  reason: collision with root package name */
        public int f20223b = -1;

        public b(long j10) {
            this.f20222a = j10;
        }

        @Override // kotlinx.coroutines.internal.u
        public final kotlinx.coroutines.internal.t<?> a() {
            Object obj = this._heap;
            if (obj instanceof kotlinx.coroutines.internal.t) {
                return (kotlinx.coroutines.internal.t) obj;
            }
            return null;
        }

        @Override // kotlinx.coroutines.internal.u
        public final void c(c cVar) {
            boolean z10;
            if (this._heap != pdf.pdfreader.viewer.editor.free.utils.t0.f28770b) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this._heap = cVar;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        @Override // java.lang.Comparable
        public final int compareTo(b bVar) {
            int i10 = ((this.f20222a - bVar.f20222a) > 0L ? 1 : ((this.f20222a - bVar.f20222a) == 0L ? 0 : -1));
            if (i10 > 0) {
                return 1;
            }
            if (i10 < 0) {
                return -1;
            }
            return 0;
        }

        @Override // kotlinx.coroutines.internal.u
        public final void d(int i10) {
            this.f20223b = i10;
        }

        @Override // kotlinx.coroutines.k0
        public final void dispose() {
            c cVar;
            synchronized (this) {
                Object obj = this._heap;
                com.android.billingclient.api.a0 a0Var = pdf.pdfreader.viewer.editor.free.utils.t0.f28770b;
                if (obj == a0Var) {
                    return;
                }
                if (obj instanceof c) {
                    cVar = (c) obj;
                } else {
                    cVar = null;
                }
                if (cVar != null) {
                    cVar.d(this);
                }
                this._heap = a0Var;
                tf.d dVar = tf.d.f30009a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [T extends kotlinx.coroutines.internal.u & java.lang.Comparable<? super T>[]] */
        /* JADX WARN: Type inference failed for: r0v5 */
        public final int e(long j10, c cVar, o0 o0Var) {
            b bVar;
            synchronized (this) {
                if (this._heap == pdf.pdfreader.viewer.editor.free.utils.t0.f28770b) {
                    return 2;
                }
                synchronized (cVar) {
                    ?? r02 = cVar.f20201a;
                    if (r02 != 0) {
                        bVar = r02[0];
                    } else {
                        bVar = null;
                    }
                    b bVar2 = bVar;
                    if (o0.c0(o0Var)) {
                        return 1;
                    }
                    if (bVar2 == null) {
                        cVar.c = j10;
                    } else {
                        long j11 = bVar2.f20222a;
                        if (j11 - j10 < 0) {
                            j10 = j11;
                        }
                        if (j10 - cVar.c > 0) {
                            cVar.c = j10;
                        }
                    }
                    long j12 = this.f20222a;
                    long j13 = cVar.c;
                    if (j12 - j13 < 0) {
                        this.f20222a = j13;
                    }
                    cVar.a(this);
                    return 0;
                }
            }
        }

        @Override // kotlinx.coroutines.internal.u
        public final int getIndex() {
            return this.f20223b;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f20222a + ']';
        }
    }

    /* compiled from: EventLoop.common.kt */
    /* loaded from: classes.dex */
    public static final class c extends kotlinx.coroutines.internal.t<b> {
        public long c;

        public c(long j10) {
            this.c = j10;
        }
    }

    public static final boolean c0(o0 o0Var) {
        o0Var.getClass();
        if (f20220h.get(o0Var) != 0) {
            return true;
        }
        return false;
    }

    public void d0(Runnable runnable) {
        if (k0(runnable)) {
            Thread a02 = a0();
            if (Thread.currentThread() != a02) {
                LockSupport.unpark(a02);
                return;
            }
            return;
        }
        z.f20278i.d0(runnable);
    }

    @Override // kotlinx.coroutines.d0
    public final void j(long j10, h hVar) {
        long j11 = 0;
        if (j10 > 0) {
            if (j10 >= 9223372036854L) {
                j11 = Long.MAX_VALUE;
            } else {
                j11 = 1000000 * j10;
            }
        }
        if (j11 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            a aVar = new a(j11 + nanoTime, hVar);
            p0(nanoTime, aVar);
            hVar.u(new l0(aVar));
        }
    }

    public final boolean k0(Runnable runnable) {
        boolean z10;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20218f;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z11 = false;
            if (f20220h.get(this) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return false;
            }
            if (obj == null) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                        z11 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                if (z11) {
                    return true;
                }
            } else if (obj instanceof kotlinx.coroutines.internal.j) {
                kotlinx.coroutines.internal.j jVar = (kotlinx.coroutines.internal.j) obj;
                int a10 = jVar.a(runnable);
                if (a10 == 0) {
                    return true;
                }
                if (a10 != 1) {
                    if (a10 == 2) {
                        return false;
                    }
                } else {
                    kotlinx.coroutines.internal.j c10 = jVar.c();
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c10) && atomicReferenceFieldUpdater.get(this) == obj) {
                    }
                }
            } else if (obj == pdf.pdfreader.viewer.editor.free.utils.t0.c) {
                return false;
            } else {
                kotlinx.coroutines.internal.j jVar2 = new kotlinx.coroutines.internal.j(8, true);
                jVar2.a((Runnable) obj);
                jVar2.a(runnable);
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, jVar2)) {
                        z11 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                if (z11) {
                    return true;
                }
            }
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void n(CoroutineContext coroutineContext, Runnable runnable) {
        d0(runnable);
    }

    public final boolean n0() {
        boolean z10;
        boolean z11;
        kotlin.collections.e<g0<?>> eVar = this.f20213e;
        if (eVar != null) {
            z10 = eVar.isEmpty();
        } else {
            z10 = true;
        }
        if (!z10) {
            return false;
        }
        c cVar = (c) f20219g.get(this);
        if (cVar != null) {
            if (cVar.b() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                return false;
            }
        }
        Object obj = f20218f.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof kotlinx.coroutines.internal.j) {
            long j10 = kotlinx.coroutines.internal.j.f20188f.get((kotlinx.coroutines.internal.j) obj);
            if (((int) ((1073741823 & j10) >> 0)) == ((int) ((j10 & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == pdf.pdfreader.viewer.editor.free.utils.t0.c) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlinx.coroutines.o0, kotlinx.coroutines.n0] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v9, types: [T extends kotlinx.coroutines.internal.u & java.lang.Comparable<? super T>[]] */
    public final long o0() {
        long j10;
        b c10;
        boolean z10;
        boolean z11;
        b bVar;
        boolean z12;
        boolean z13;
        b bVar2;
        if (Y()) {
            return 0L;
        }
        c cVar = (c) f20219g.get(this);
        Runnable runnable = null;
        boolean z14 = true;
        if (cVar != null) {
            if (cVar.b() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                long nanoTime = System.nanoTime();
                do {
                    synchronized (cVar) {
                        ?? r82 = cVar.f20201a;
                        if (r82 != 0) {
                            bVar = r82[0];
                        } else {
                            bVar = null;
                        }
                        if (bVar == null) {
                            bVar2 = null;
                        } else {
                            b bVar3 = bVar;
                            if (nanoTime - bVar3.f20222a >= 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                z13 = k0(bVar3);
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                bVar2 = cVar.e(0);
                            } else {
                                bVar2 = null;
                            }
                        }
                    }
                } while (bVar2 != null);
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20218f;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                break;
            } else if (obj instanceof kotlinx.coroutines.internal.j) {
                kotlinx.coroutines.internal.j jVar = (kotlinx.coroutines.internal.j) obj;
                Object d10 = jVar.d();
                if (d10 != kotlinx.coroutines.internal.j.f20189g) {
                    runnable = (Runnable) d10;
                    break;
                }
                kotlinx.coroutines.internal.j c11 = jVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c11) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else if (obj == pdf.pdfreader.viewer.editor.free.utils.t0.c) {
                break;
            } else {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                        z10 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    runnable = (Runnable) obj;
                    break;
                }
            }
        }
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        kotlin.collections.e<g0<?>> eVar = this.f20213e;
        if (eVar == null || eVar.isEmpty()) {
            j10 = Long.MAX_VALUE;
        } else {
            j10 = 0;
        }
        if (j10 == 0) {
            return 0L;
        }
        Object obj2 = f20218f.get(this);
        if (obj2 != null) {
            if (obj2 instanceof kotlinx.coroutines.internal.j) {
                long j11 = kotlinx.coroutines.internal.j.f20188f.get((kotlinx.coroutines.internal.j) obj2);
                if (((int) ((1073741823 & j11) >> 0)) != ((int) ((j11 & 1152921503533105152L) >> 30))) {
                    z14 = false;
                }
                if (!z14) {
                    return 0L;
                }
            } else {
                if (obj2 != pdf.pdfreader.viewer.editor.free.utils.t0.c) {
                    return 0L;
                }
                return Long.MAX_VALUE;
            }
        }
        c cVar2 = (c) f20219g.get(this);
        if (cVar2 != null && (c10 = cVar2.c()) != null) {
            long nanoTime2 = c10.f20222a - System.nanoTime();
            if (nanoTime2 < 0) {
                return 0L;
            }
            return nanoTime2;
        }
        return Long.MAX_VALUE;
    }

    public final void p0(long j10, b bVar) {
        boolean z10;
        int e10;
        Thread a02;
        boolean z11 = true;
        if (f20220h.get(this) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        b bVar2 = null;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20219g;
        if (z10) {
            e10 = 1;
        } else {
            c cVar = (c) atomicReferenceFieldUpdater.get(this);
            if (cVar == null) {
                c cVar2 = new c(j10);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, cVar2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                kotlin.jvm.internal.g.b(obj);
                cVar = (c) obj;
            }
            e10 = bVar.e(j10, cVar, this);
        }
        if (e10 != 0) {
            if (e10 != 1) {
                if (e10 != 2) {
                    throw new IllegalStateException("unexpected result".toString());
                }
                return;
            }
            b0(j10, bVar);
            return;
        }
        c cVar3 = (c) atomicReferenceFieldUpdater.get(this);
        if (cVar3 != null) {
            bVar2 = cVar3.c();
        }
        if (bVar2 != bVar) {
            z11 = false;
        }
        if (z11 && Thread.currentThread() != (a02 = a0())) {
            LockSupport.unpark(a02);
        }
    }

    @Override // kotlinx.coroutines.n0
    public void shutdown() {
        boolean z10;
        b bVar;
        boolean z11;
        ThreadLocal<n0> threadLocal = o1.f20224a;
        o1.f20224a.set(null);
        f20220h.set(this, 1);
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20218f;
            Object obj = atomicReferenceFieldUpdater.get(this);
            com.android.billingclient.api.a0 a0Var = pdf.pdfreader.viewer.editor.free.utils.t0.c;
            if (obj == null) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, a0Var)) {
                        z10 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != null) {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    break;
                }
            } else if (obj instanceof kotlinx.coroutines.internal.j) {
                ((kotlinx.coroutines.internal.j) obj).b();
                break;
            } else if (obj == a0Var) {
                break;
            } else {
                kotlinx.coroutines.internal.j jVar = new kotlinx.coroutines.internal.j(8, true);
                jVar.a((Runnable) obj);
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, jVar)) {
                        z11 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                        z11 = false;
                        break;
                    }
                }
                if (z11) {
                    break;
                }
            }
        }
        do {
        } while (o0() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            c cVar = (c) f20219g.get(this);
            if (cVar != null) {
                synchronized (cVar) {
                    if (cVar.b() > 0) {
                        bVar = cVar.e(0);
                    } else {
                        bVar = null;
                    }
                }
                b bVar2 = bVar;
                if (bVar2 != null) {
                    b0(nanoTime, bVar2);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}
