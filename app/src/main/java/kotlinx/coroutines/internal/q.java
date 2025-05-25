package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.i1;
import kotlinx.coroutines.internal.q;

/* compiled from: ConcurrentLinkedList.kt */
/* loaded from: classes.dex */
public abstract class q<S extends q<S>> extends c<S> implements i1 {

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f20197d = AtomicIntegerFieldUpdater.newUpdater(q.class, "cleanedAndPointers");
    public final long c;
    private volatile int cleanedAndPointers;

    public q(long j10, S s4, int i10) {
        super(s4);
        this.c = j10;
        this.cleanedAndPointers = i10 << 16;
    }

    @Override // kotlinx.coroutines.internal.c
    public final boolean c() {
        boolean z10;
        if (f20197d.get(this) != f()) {
            return false;
        }
        if (b() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return false;
        }
        return true;
    }

    public final boolean e() {
        boolean z10;
        if (f20197d.addAndGet(this, -65536) != f()) {
            return false;
        }
        if (b() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return false;
        }
        return true;
    }

    public abstract int f();

    public abstract void g(int i10, CoroutineContext coroutineContext);

    public final void h() {
        if (f20197d.incrementAndGet(this) == f()) {
            d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x001f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i() {
        /*
            r5 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.internal.q.f20197d
            int r1 = r0.get(r5)
            int r2 = r5.f()
            r3 = 1
            r4 = 0
            if (r1 != r2) goto L1c
            kotlinx.coroutines.internal.c r2 = r5.b()
            if (r2 != 0) goto L16
            r2 = r3
            goto L17
        L16:
            r2 = r4
        L17:
            if (r2 == 0) goto L1a
            goto L1c
        L1a:
            r2 = r4
            goto L1d
        L1c:
            r2 = r3
        L1d:
            if (r2 != 0) goto L21
            r3 = r4
            goto L2a
        L21:
            r2 = 65536(0x10000, float:9.1835E-41)
            int r2 = r2 + r1
            boolean r0 = r0.compareAndSet(r5, r1, r2)
            if (r0 == 0) goto L0
        L2a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.q.i():boolean");
    }
}
