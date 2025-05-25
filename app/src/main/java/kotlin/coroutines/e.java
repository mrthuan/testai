package kotlin.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: SafeContinuationJvm.kt */
/* loaded from: classes.dex */
public final class e<T> implements c<T>, wf.b {

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater<e<?>, Object> f19937b = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "result");

    /* renamed from: a  reason: collision with root package name */
    public final c<T> f19938a;
    private volatile Object result;

    /* JADX WARN: Multi-variable type inference failed */
    public e(c<? super T> cVar) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.UNDECIDED;
        this.f19938a = cVar;
        this.result = coroutineSingletons;
    }

    public final Object b() {
        boolean z10;
        Object obj = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.UNDECIDED;
        if (obj == coroutineSingletons) {
            AtomicReferenceFieldUpdater<e<?>, Object> atomicReferenceFieldUpdater = f19937b;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, coroutineSingletons, coroutineSingletons2)) {
                    z10 = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(this) != coroutineSingletons) {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                return CoroutineSingletons.COROUTINE_SUSPENDED;
            }
            obj = this.result;
        }
        if (obj == CoroutineSingletons.RESUMED) {
            return CoroutineSingletons.COROUTINE_SUSPENDED;
        }
        if (!(obj instanceof Result.Failure)) {
            return obj;
        }
        throw ((Result.Failure) obj).exception;
    }

    @Override // wf.b
    public final wf.b getCallerFrame() {
        c<T> cVar = this.f19938a;
        if (cVar instanceof wf.b) {
            return (wf.b) cVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.c
    public final CoroutineContext getContext() {
        return this.f19938a.getContext();
    }

    @Override // kotlin.coroutines.c
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.UNDECIDED;
            boolean z10 = false;
            if (obj2 == coroutineSingletons) {
                AtomicReferenceFieldUpdater<e<?>, Object> atomicReferenceFieldUpdater = f19937b;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, coroutineSingletons, obj)) {
                        z10 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != coroutineSingletons) {
                        break;
                    }
                }
                if (z10) {
                    return;
                }
            } else {
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (obj2 == coroutineSingletons2) {
                    AtomicReferenceFieldUpdater<e<?>, Object> atomicReferenceFieldUpdater2 = f19937b;
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.RESUMED;
                    while (true) {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, coroutineSingletons2, coroutineSingletons3)) {
                            z10 = true;
                            break;
                        } else if (atomicReferenceFieldUpdater2.get(this) != coroutineSingletons2) {
                            break;
                        }
                    }
                    if (z10) {
                        this.f19938a.resumeWith(obj);
                        return;
                    }
                } else {
                    throw new IllegalStateException("Already resumed");
                }
            }
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f19938a;
    }
}
