package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;

/* compiled from: CoroutineDispatcher.kt */
/* loaded from: classes.dex */
public abstract class CoroutineDispatcher extends kotlin.coroutines.a implements kotlin.coroutines.d {

    /* renamed from: b  reason: collision with root package name */
    public static final Key f19979b = new Key();

    /* compiled from: CoroutineDispatcher.kt */
    /* loaded from: classes.dex */
    public static final class Key extends kotlin.coroutines.b<kotlin.coroutines.d, CoroutineDispatcher> {
        public Key() {
            super(d.a.f19936a, new cg.l<CoroutineContext.a, CoroutineDispatcher>() { // from class: kotlinx.coroutines.CoroutineDispatcher.Key.1
                @Override // cg.l
                public final CoroutineDispatcher invoke(CoroutineContext.a aVar) {
                    if (aVar instanceof CoroutineDispatcher) {
                        return (CoroutineDispatcher) aVar;
                    }
                    return null;
                }
            });
        }
    }

    public CoroutineDispatcher() {
        super(d.a.f19936a);
    }

    @Override // kotlin.coroutines.d
    public final void c(kotlin.coroutines.c<?> cVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        h hVar;
        kotlinx.coroutines.internal.f fVar = (kotlinx.coroutines.internal.f) cVar;
        do {
            atomicReferenceFieldUpdater = kotlinx.coroutines.internal.f.f20174h;
        } while (atomicReferenceFieldUpdater.get(fVar) == ge.a.f17757h);
        Object obj = atomicReferenceFieldUpdater.get(fVar);
        if (obj instanceof h) {
            hVar = (h) obj;
        } else {
            hVar = null;
        }
        if (hVar != null) {
            hVar.p();
        }
    }

    @Override // kotlin.coroutines.d
    public final kotlinx.coroutines.internal.f f(kotlin.coroutines.c cVar) {
        return new kotlinx.coroutines.internal.f(this, cVar);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext
    public final <E extends CoroutineContext.a> E get(CoroutineContext.b<E> key) {
        boolean z10;
        kotlin.jvm.internal.g.e(key, "key");
        if (key instanceof kotlin.coroutines.b) {
            kotlin.coroutines.b bVar = (kotlin.coroutines.b) key;
            CoroutineContext.b<?> key2 = this.f19932a;
            kotlin.jvm.internal.g.e(key2, "key");
            if (key2 != bVar && bVar.f19934b != key2) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                E e10 = (E) bVar.f19933a.invoke(this);
                if (e10 instanceof CoroutineContext.a) {
                    return e10;
                }
            }
        } else if (d.a.f19936a == key) {
            return this;
        }
        return null;
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(CoroutineContext.b<?> key) {
        boolean z10;
        kotlin.jvm.internal.g.e(key, "key");
        if (key instanceof kotlin.coroutines.b) {
            kotlin.coroutines.b bVar = (kotlin.coroutines.b) key;
            CoroutineContext.b<?> key2 = this.f19932a;
            kotlin.jvm.internal.g.e(key2, "key");
            if (key2 != bVar && bVar.f19934b != key2) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10 && ((CoroutineContext.a) bVar.f19933a.invoke(this)) != null) {
                return EmptyCoroutineContext.INSTANCE;
            }
        } else if (d.a.f19936a == key) {
            return EmptyCoroutineContext.INSTANCE;
        }
        return this;
    }

    public abstract void n(CoroutineContext coroutineContext, Runnable runnable);

    public void o(CoroutineContext coroutineContext, Runnable runnable) {
        n(coroutineContext, runnable);
    }

    public boolean p() {
        return !(this instanceof p1);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + y.b(this);
    }
}
