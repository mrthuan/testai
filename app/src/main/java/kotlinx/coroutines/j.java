package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: JobSupport.kt */
/* loaded from: classes.dex */
public final class j extends z0 {

    /* renamed from: e  reason: collision with root package name */
    public final h<?> f20205e;

    public j(h<?> hVar) {
        this.f20205e = hVar;
    }

    @Override // cg.l
    public final /* bridge */ /* synthetic */ tf.d invoke(Throwable th2) {
        j(th2);
        return tf.d.f30009a;
    }

    @Override // kotlinx.coroutines.r
    public final void j(Throwable th2) {
        boolean z10;
        c1 k10 = k();
        h<?> hVar = this.f20205e;
        hVar.getClass();
        CancellationException i10 = k10.i();
        boolean z11 = false;
        if (hVar.w()) {
            kotlin.coroutines.c<?> cVar = hVar.f20158d;
            kotlin.jvm.internal.g.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            kotlinx.coroutines.internal.f fVar = (kotlinx.coroutines.internal.f) cVar;
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = kotlinx.coroutines.internal.f.f20174h;
                Object obj = atomicReferenceFieldUpdater.get(fVar);
                com.android.billingclient.api.a0 a0Var = ge.a.f17757h;
                boolean z12 = true;
                if (kotlin.jvm.internal.g.a(obj, a0Var)) {
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(fVar, a0Var, i10)) {
                            z10 = true;
                            break;
                        } else if (atomicReferenceFieldUpdater.get(fVar) != a0Var) {
                            z10 = false;
                            break;
                        }
                    }
                    if (z10) {
                        break;
                    }
                } else if (obj instanceof Throwable) {
                    break;
                } else {
                    while (true) {
                        if (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                            if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                                z12 = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z12) {
                        break;
                    }
                }
            }
            z11 = true;
        }
        if (!z11) {
            hVar.n(i10);
            if (!hVar.w()) {
                hVar.p();
            }
        }
    }
}
