package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.d0;

/* compiled from: LimitedDispatcher.kt */
/* loaded from: classes.dex */
public final class g extends CoroutineDispatcher implements d0 {

    /* renamed from: h  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f20179h = AtomicIntegerFieldUpdater.newUpdater(g.class, "runningWorkers");
    public final CoroutineDispatcher c;

    /* renamed from: d  reason: collision with root package name */
    public final int f20180d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ d0 f20181e;

    /* renamed from: f  reason: collision with root package name */
    public final i<Runnable> f20182f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f20183g;
    private volatile int runningWorkers;

    /* compiled from: LimitedDispatcher.kt */
    /* loaded from: classes.dex */
    public final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public Runnable f20184a;

        public a(Runnable runnable) {
            this.f20184a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i10 = 0;
            while (true) {
                try {
                    this.f20184a.run();
                } catch (Throwable th2) {
                    kotlinx.coroutines.v.a(EmptyCoroutineContext.INSTANCE, th2);
                }
                g gVar = g.this;
                Runnable v10 = gVar.v();
                if (v10 == null) {
                    return;
                }
                this.f20184a = v10;
                i10++;
                if (i10 >= 16) {
                    CoroutineDispatcher coroutineDispatcher = gVar.c;
                    if (coroutineDispatcher.p()) {
                        coroutineDispatcher.n(gVar, this);
                        return;
                    }
                }
            }
        }
    }

    public g(lg.k kVar, int i10) {
        d0 d0Var;
        this.c = kVar;
        this.f20180d = i10;
        if (kVar instanceof d0) {
            d0Var = (d0) kVar;
        } else {
            d0Var = null;
        }
        this.f20181e = d0Var == null ? a0.f19982a : d0Var;
        this.f20182f = new i<>();
        this.f20183g = new Object();
    }

    @Override // kotlinx.coroutines.d0
    public final void j(long j10, kotlinx.coroutines.h hVar) {
        this.f20181e.j(j10, hVar);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void n(CoroutineContext coroutineContext, Runnable runnable) {
        boolean z10;
        Runnable v10;
        this.f20182f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f20179h;
        if (atomicIntegerFieldUpdater.get(this) < this.f20180d) {
            synchronized (this.f20183g) {
                if (atomicIntegerFieldUpdater.get(this) >= this.f20180d) {
                    z10 = false;
                } else {
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                    z10 = true;
                }
            }
            if (z10 && (v10 = v()) != null) {
                this.c.n(this, new a(v10));
            }
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void o(CoroutineContext coroutineContext, Runnable runnable) {
        boolean z10;
        Runnable v10;
        this.f20182f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f20179h;
        if (atomicIntegerFieldUpdater.get(this) < this.f20180d) {
            synchronized (this.f20183g) {
                if (atomicIntegerFieldUpdater.get(this) >= this.f20180d) {
                    z10 = false;
                } else {
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                    z10 = true;
                }
            }
            if (z10 && (v10 = v()) != null) {
                this.c.o(this, new a(v10));
            }
        }
    }

    public final Runnable v() {
        while (true) {
            Runnable d10 = this.f20182f.d();
            if (d10 == null) {
                synchronized (this.f20183g) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f20179h;
                    atomicIntegerFieldUpdater.decrementAndGet(this);
                    if (this.f20182f.c() == 0) {
                        return null;
                    }
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                }
            } else {
                return d10;
            }
        }
    }
}
