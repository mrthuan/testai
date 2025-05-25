package kotlinx.coroutines.scheduling;

import a0.d;
import androidx.activity.r;
import com.android.billingclient.api.a0;
import com.google.android.gms.common.api.Api;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.random.Random;
import kotlinx.coroutines.internal.o;
import kotlinx.coroutines.y;
import lg.c;
import lg.f;
import lg.g;
import lg.i;
import lg.j;
import lg.l;

/* compiled from: CoroutineScheduler.kt */
/* loaded from: classes.dex */
public final class CoroutineScheduler implements Executor, Closeable {

    /* renamed from: h  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f20232h = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "parkedWorkersStack");

    /* renamed from: i  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f20233i = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "controlState");

    /* renamed from: j  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f20234j = AtomicIntegerFieldUpdater.newUpdater(CoroutineScheduler.class, "_isTerminated");

    /* renamed from: k  reason: collision with root package name */
    public static final a0 f20235k = new a0("NOT_IN_STACK", 8);
    private volatile int _isTerminated;

    /* renamed from: a  reason: collision with root package name */
    public final int f20236a;

    /* renamed from: b  reason: collision with root package name */
    public final int f20237b;
    public final long c;
    private volatile long controlState;

    /* renamed from: d  reason: collision with root package name */
    public final String f20238d;

    /* renamed from: e  reason: collision with root package name */
    public final c f20239e;

    /* renamed from: f  reason: collision with root package name */
    public final c f20240f;

    /* renamed from: g  reason: collision with root package name */
    public final o<b> f20241g;
    private volatile long parkedWorkersStack;

    /* compiled from: CoroutineScheduler.kt */
    /* loaded from: classes.dex */
    public enum WorkerState {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    /* compiled from: CoroutineScheduler.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f20243a;

        static {
            int[] iArr = new int[WorkerState.values().length];
            try {
                iArr[WorkerState.PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WorkerState.BLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WorkerState.CPU_ACQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WorkerState.DORMANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WorkerState.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f20243a = iArr;
        }
    }

    /* compiled from: CoroutineScheduler.kt */
    /* loaded from: classes.dex */
    public final class b extends Thread {

        /* renamed from: i  reason: collision with root package name */
        public static final AtomicIntegerFieldUpdater f20244i = AtomicIntegerFieldUpdater.newUpdater(b.class, "workerCtl");

        /* renamed from: a  reason: collision with root package name */
        public final l f20245a;

        /* renamed from: b  reason: collision with root package name */
        public final Ref$ObjectRef<f> f20246b;
        public WorkerState c;

        /* renamed from: d  reason: collision with root package name */
        public long f20247d;

        /* renamed from: e  reason: collision with root package name */
        public long f20248e;

        /* renamed from: f  reason: collision with root package name */
        public int f20249f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f20250g;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        private volatile int workerCtl;

        public b() {
            throw null;
        }

        public b(int i10) {
            setDaemon(true);
            this.f20245a = new l();
            this.f20246b = new Ref$ObjectRef<>();
            this.c = WorkerState.DORMANT;
            this.nextParkedWorker = CoroutineScheduler.f20235k;
            this.f20249f = Random.Default.nextInt();
            f(i10);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final lg.f a(boolean r11) {
            /*
                Method dump skipped, instructions count: 224
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.CoroutineScheduler.b.a(boolean):lg.f");
        }

        public final int b() {
            return this.indexInArray;
        }

        public final Object c() {
            return this.nextParkedWorker;
        }

        public final int d(int i10) {
            int i11 = this.f20249f;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.f20249f = i14;
            int i15 = i10 - 1;
            if ((i15 & i10) == 0) {
                return i14 & i15;
            }
            return (i14 & Api.BaseClientBuilder.API_PRIORITY_OTHER) % i10;
        }

        public final f e() {
            int d10 = d(2);
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            if (d10 == 0) {
                f d11 = coroutineScheduler.f20239e.d();
                if (d11 != null) {
                    return d11;
                }
                return coroutineScheduler.f20240f.d();
            }
            f d12 = coroutineScheduler.f20240f.d();
            if (d12 != null) {
                return d12;
            }
            return coroutineScheduler.f20239e.d();
        }

        public final void f(int i10) {
            String valueOf;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(CoroutineScheduler.this.f20238d);
            sb2.append("-worker-");
            if (i10 == 0) {
                valueOf = "TERMINATED";
            } else {
                valueOf = String.valueOf(i10);
            }
            sb2.append(valueOf);
            setName(sb2.toString());
            this.indexInArray = i10;
        }

        public final void g(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean h(WorkerState workerState) {
            boolean z10;
            WorkerState workerState2 = this.c;
            if (workerState2 == WorkerState.CPU_ACQUIRED) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                CoroutineScheduler.f20233i.addAndGet(CoroutineScheduler.this, 4398046511104L);
            }
            if (workerState2 != workerState) {
                this.c = workerState;
            }
            return z10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:44:0x0090, code lost:
            r7 = -2;
            r18 = r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0094, code lost:
            r5 = -1;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r14v1, types: [lg.f, T, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v4 */
        /* JADX WARN: Type inference failed for: r9v5, types: [lg.f] */
        /* JADX WARN: Type inference failed for: r9v9, types: [lg.f] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final lg.f i(int r21) {
            /*
                Method dump skipped, instructions count: 258
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.CoroutineScheduler.b.i(int):lg.f");
        }

        /* JADX WARN: Code restructure failed: missing block: B:127:0x0004, code lost:
            continue;
         */
        /* JADX WARN: Code restructure failed: missing block: B:128:0x0004, code lost:
            continue;
         */
        /* JADX WARN: Code restructure failed: missing block: B:129:0x0004, code lost:
            continue;
         */
        /* JADX WARN: Code restructure failed: missing block: B:130:0x0004, code lost:
            continue;
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 428
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.CoroutineScheduler.b.run():void");
        }
    }

    public CoroutineScheduler(int i10, int i11, long j10, String str) {
        boolean z10;
        boolean z11;
        boolean z12;
        this.f20236a = i10;
        this.f20237b = i11;
        this.c = j10;
        this.f20238d = str;
        if (i10 >= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i11 >= i10) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (i11 <= 2097150) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    if (j10 > 0) {
                        this.f20239e = new c();
                        this.f20240f = new c();
                        this.f20241g = new o<>((i10 + 1) * 2);
                        this.controlState = i10 << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
                }
                throw new IllegalArgumentException(a0.a.g("Max pool size ", i11, " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(d.b("Max pool size ", i11, " should be greater than or equals to core pool size ", i10).toString());
        }
        throw new IllegalArgumentException(a0.a.g("Core pool size ", i10, " should be at least 1").toString());
    }

    public final int a() {
        boolean z10;
        boolean z11;
        synchronized (this.f20241g) {
            boolean z12 = false;
            if (f20234j.get(this) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return -1;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater = f20233i;
            long j10 = atomicLongFieldUpdater.get(this);
            int i10 = (int) (j10 & 2097151);
            int i11 = i10 - ((int) ((j10 & 4398044413952L) >> 21));
            if (i11 < 0) {
                i11 = 0;
            }
            if (i11 >= this.f20236a) {
                return 0;
            }
            if (i10 >= this.f20237b) {
                return 0;
            }
            int i12 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
            if (i12 > 0 && this.f20241g.b(i12) == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                b bVar = new b(i12);
                this.f20241g.c(i12, bVar);
                if (i12 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    z12 = true;
                }
                if (z12) {
                    int i13 = i11 + 1;
                    bVar.start();
                    return i13;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public final void b(Runnable runnable, g gVar, boolean z10) {
        f iVar;
        boolean z11;
        long j10;
        b bVar;
        boolean z12;
        boolean a10;
        j.f20593f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof f) {
            iVar = (f) runnable;
            iVar.f20586a = nanoTime;
            iVar.f20587b = gVar;
        } else {
            iVar = new i(runnable, nanoTime, gVar);
        }
        boolean z13 = false;
        if (iVar.f20587b.b() == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f20233i;
        if (z11) {
            j10 = atomicLongFieldUpdater.addAndGet(this, 2097152L);
        } else {
            j10 = 0;
        }
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof b) {
            bVar = (b) currentThread;
        } else {
            bVar = null;
        }
        if (bVar == null || !kotlin.jvm.internal.g.a(CoroutineScheduler.this, this)) {
            bVar = null;
        }
        if (bVar != null && bVar.c != WorkerState.TERMINATED && (iVar.f20587b.b() != 0 || bVar.c != WorkerState.BLOCKING)) {
            bVar.f20250g = true;
            l lVar = bVar.f20245a;
            if (z10) {
                iVar = lVar.a(iVar);
            } else {
                lVar.getClass();
                f fVar = (f) l.f20596b.getAndSet(lVar, iVar);
                if (fVar == null) {
                    iVar = null;
                } else {
                    iVar = lVar.a(fVar);
                }
            }
        }
        if (iVar != null) {
            if (iVar.f20587b.b() == 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                a10 = this.f20240f.a(iVar);
            } else {
                a10 = this.f20239e.a(iVar);
            }
            if (!a10) {
                throw new RejectedExecutionException(r.g(new StringBuilder(), this.f20238d, " was terminated"));
            }
        }
        if (z10 && bVar != null) {
            z13 = true;
        }
        if (z11) {
            if (!z13 && !f() && !d(j10)) {
                f();
            }
        } else if (!z13 && !f() && !d(atomicLongFieldUpdater.get(this))) {
            f();
        }
    }

    public final void c(b bVar, int i10, int i11) {
        while (true) {
            long j10 = f20232h.get(this);
            int i12 = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & (-2097152);
            if (i12 == i10) {
                if (i11 == 0) {
                    Object c = bVar.c();
                    while (true) {
                        if (c == f20235k) {
                            i12 = -1;
                            break;
                        } else if (c == null) {
                            i12 = 0;
                            break;
                        } else {
                            b bVar2 = (b) c;
                            int b10 = bVar2.b();
                            if (b10 != 0) {
                                i12 = b10;
                                break;
                            }
                            c = bVar2.c();
                        }
                    }
                } else {
                    i12 = i11;
                }
            }
            if (i12 >= 0 && f20232h.compareAndSet(this, j10, i12 | j11)) {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
        if (r1 == null) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077 A[LOOP:0: B:21:0x0037->B:35:0x0077, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x007a A[EDGE_INSN: B:59:0x007a->B:36:0x007a ?: BREAK  , SYNTHETIC] */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.f20234j
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r9, r1, r2)
            if (r0 != 0) goto Lc
            goto Lb3
        Lc:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r3 = r0 instanceof kotlinx.coroutines.scheduling.CoroutineScheduler.b
            r4 = 0
            if (r3 == 0) goto L18
            kotlinx.coroutines.scheduling.CoroutineScheduler$b r0 = (kotlinx.coroutines.scheduling.CoroutineScheduler.b) r0
            goto L19
        L18:
            r0 = r4
        L19:
            if (r0 == 0) goto L24
            kotlinx.coroutines.scheduling.CoroutineScheduler r3 = kotlinx.coroutines.scheduling.CoroutineScheduler.this
            boolean r3 = kotlin.jvm.internal.g.a(r3, r9)
            if (r3 == 0) goto L24
            goto L25
        L24:
            r0 = r4
        L25:
            kotlinx.coroutines.internal.o<kotlinx.coroutines.scheduling.CoroutineScheduler$b> r3 = r9.f20241g
            monitor-enter(r3)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r5 = kotlinx.coroutines.scheduling.CoroutineScheduler.f20233i     // Catch: java.lang.Throwable -> Lc5
            long r5 = r5.get(r9)     // Catch: java.lang.Throwable -> Lc5
            r7 = 2097151(0x1fffff, double:1.0361303E-317)
            long r5 = r5 & r7
            int r5 = (int) r5
            monitor-exit(r3)
            if (r2 > r5) goto L7a
            r3 = r2
        L37:
            kotlinx.coroutines.internal.o<kotlinx.coroutines.scheduling.CoroutineScheduler$b> r6 = r9.f20241g
            java.lang.Object r6 = r6.b(r3)
            kotlin.jvm.internal.g.b(r6)
            kotlinx.coroutines.scheduling.CoroutineScheduler$b r6 = (kotlinx.coroutines.scheduling.CoroutineScheduler.b) r6
            if (r6 == r0) goto L75
        L44:
            boolean r7 = r6.isAlive()
            if (r7 == 0) goto L53
            java.util.concurrent.locks.LockSupport.unpark(r6)
            r7 = 10000(0x2710, double:4.9407E-320)
            r6.join(r7)
            goto L44
        L53:
            lg.l r6 = r6.f20245a
            lg.c r7 = r9.f20240f
            r6.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = lg.l.f20596b
            java.lang.Object r8 = r8.getAndSet(r6, r4)
            lg.f r8 = (lg.f) r8
            if (r8 == 0) goto L67
            r7.a(r8)
        L67:
            lg.f r8 = r6.c()
            if (r8 != 0) goto L6f
            r8 = r1
            goto L73
        L6f:
            r7.a(r8)
            r8 = r2
        L73:
            if (r8 != 0) goto L67
        L75:
            if (r3 == r5) goto L7a
            int r3 = r3 + 1
            goto L37
        L7a:
            lg.c r1 = r9.f20240f
            r1.b()
            lg.c r1 = r9.f20239e
            r1.b()
        L84:
            if (r0 == 0) goto L8c
            lg.f r1 = r0.a(r2)
            if (r1 != 0) goto Lb4
        L8c:
            lg.c r1 = r9.f20239e
            java.lang.Object r1 = r1.d()
            lg.f r1 = (lg.f) r1
            if (r1 != 0) goto Lb4
            lg.c r1 = r9.f20240f
            java.lang.Object r1 = r1.d()
            lg.f r1 = (lg.f) r1
            if (r1 != 0) goto Lb4
            if (r0 == 0) goto La7
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED
            r0.h(r1)
        La7:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.f20232h
            r1 = 0
            r0.set(r9, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.f20233i
            r0.set(r9, r1)
        Lb3:
            return
        Lb4:
            r1.run()     // Catch: java.lang.Throwable -> Lb8
            goto L84
        Lb8:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L84
        Lc5:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.CoroutineScheduler.close():void");
    }

    public final boolean d(long j10) {
        int i10 = ((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21));
        if (i10 < 0) {
            i10 = 0;
        }
        int i11 = this.f20236a;
        if (i10 < i11) {
            int a10 = a();
            if (a10 == 1 && i11 > 1) {
                a();
            }
            if (a10 > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable, j.f20594g, false);
    }

    public final boolean f() {
        a0 a0Var;
        int i10;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f20232h;
            long j10 = atomicLongFieldUpdater.get(this);
            b b10 = this.f20241g.b((int) (2097151 & j10));
            if (b10 == null) {
                b10 = null;
            } else {
                long j11 = (2097152 + j10) & (-2097152);
                Object c = b10.c();
                while (true) {
                    a0Var = f20235k;
                    if (c == a0Var) {
                        i10 = -1;
                        break;
                    } else if (c == null) {
                        i10 = 0;
                        break;
                    } else {
                        b bVar = (b) c;
                        i10 = bVar.b();
                        if (i10 != 0) {
                            break;
                        }
                        c = bVar.c();
                    }
                }
                if (i10 >= 0 && atomicLongFieldUpdater.compareAndSet(this, j10, j11 | i10)) {
                    b10.g(a0Var);
                }
            }
            if (b10 == null) {
                return false;
            }
            if (b.f20244i.compareAndSet(b10, -1, 0)) {
                LockSupport.unpark(b10);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        o<b> oVar = this.f20241g;
        int a10 = oVar.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < a10; i15++) {
            b b10 = oVar.b(i15);
            if (b10 != null) {
                l lVar = b10.f20245a;
                lVar.getClass();
                Object obj = l.f20596b.get(lVar);
                int b11 = lVar.b();
                if (obj != null) {
                    b11++;
                }
                int i16 = a.f20243a[b10.c.ordinal()];
                if (i16 != 1) {
                    if (i16 != 2) {
                        if (i16 != 3) {
                            if (i16 != 4) {
                                if (i16 == 5) {
                                    i14++;
                                }
                            } else {
                                i13++;
                                if (b11 > 0) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(b11);
                                    sb2.append('d');
                                    arrayList.add(sb2.toString());
                                }
                            }
                        } else {
                            i10++;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(b11);
                            sb3.append('c');
                            arrayList.add(sb3.toString());
                        }
                    } else {
                        i11++;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(b11);
                        sb4.append('b');
                        arrayList.add(sb4.toString());
                    }
                } else {
                    i12++;
                }
            }
        }
        long j10 = f20233i.get(this);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.f20238d);
        sb5.append('@');
        sb5.append(y.b(this));
        sb5.append("[Pool Size {core = ");
        int i17 = this.f20236a;
        sb5.append(i17);
        sb5.append(", max = ");
        sb5.append(this.f20237b);
        sb5.append("}, Worker States {CPU = ");
        sb5.append(i10);
        sb5.append(", blocking = ");
        sb5.append(i11);
        sb5.append(", parked = ");
        sb5.append(i12);
        sb5.append(", dormant = ");
        sb5.append(i13);
        sb5.append(", terminated = ");
        sb5.append(i14);
        sb5.append("}, running workers queues = ");
        sb5.append(arrayList);
        sb5.append(", global CPU queue size = ");
        sb5.append(this.f20239e.c());
        sb5.append(", global blocking queue size = ");
        sb5.append(this.f20240f.c());
        sb5.append(", Control State {created workers= ");
        sb5.append((int) (2097151 & j10));
        sb5.append(", blocking tasks = ");
        sb5.append((int) ((4398044413952L & j10) >> 21));
        sb5.append(", CPUs acquired = ");
        sb5.append(i17 - ((int) ((j10 & 9223367638808264704L) >> 42)));
        sb5.append("}]");
        return sb5.toString();
    }
}
