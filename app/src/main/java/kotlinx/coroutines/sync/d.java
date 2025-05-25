package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.q;

/* compiled from: Semaphore.kt */
/* loaded from: classes.dex */
public final class d extends q<d> {

    /* renamed from: e  reason: collision with root package name */
    public final AtomicReferenceArray f20267e;

    public d(long j10, d dVar, int i10) {
        super(j10, dVar, i10);
        this.f20267e = new AtomicReferenceArray(c.f20266f);
    }

    @Override // kotlinx.coroutines.internal.q
    public final int f() {
        return c.f20266f;
    }

    @Override // kotlinx.coroutines.internal.q
    public final void g(int i10, CoroutineContext coroutineContext) {
        this.f20267e.set(i10, c.f20265e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.c + ", hashCode=" + hashCode() + ']';
    }
}
