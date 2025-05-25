package kotlinx.coroutines;

/* compiled from: EventLoop.common.kt */
/* loaded from: classes.dex */
public abstract class n0 extends CoroutineDispatcher {
    public long c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f20212d;

    /* renamed from: e  reason: collision with root package name */
    public kotlin.collections.e<g0<?>> f20213e;

    public final void U(boolean z10) {
        long j10;
        long j11 = this.c;
        if (z10) {
            j10 = 4294967296L;
        } else {
            j10 = 1;
        }
        this.c = j10 + j11;
        if (!z10) {
            this.f20212d = true;
        }
    }

    public final boolean W() {
        if (this.c >= 4294967296L) {
            return true;
        }
        return false;
    }

    public final boolean Y() {
        g0<?> removeFirst;
        kotlin.collections.e<g0<?>> eVar = this.f20213e;
        if (eVar == null) {
            return false;
        }
        if (eVar.isEmpty()) {
            removeFirst = null;
        } else {
            removeFirst = eVar.removeFirst();
        }
        g0<?> g0Var = removeFirst;
        if (g0Var == null) {
            return false;
        }
        g0Var.run();
        return true;
    }

    public final void v() {
        long j10 = this.c - 4294967296L;
        this.c = j10;
        if (j10 <= 0 && this.f20212d) {
            shutdown();
        }
    }

    public final void x(g0<?> g0Var) {
        kotlin.collections.e<g0<?>> eVar = this.f20213e;
        if (eVar == null) {
            eVar = new kotlin.collections.e<>();
            this.f20213e = eVar;
        }
        eVar.addLast(g0Var);
    }

    public void shutdown() {
    }
}
