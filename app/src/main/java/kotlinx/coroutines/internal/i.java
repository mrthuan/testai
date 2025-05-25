package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: LockFreeTaskQueue.kt */
/* loaded from: classes.dex */
public class i<E> {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f20186a = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_cur");
    private volatile Object _cur = new j(8, false);

    public final boolean a(E e10) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20186a;
            j jVar = (j) atomicReferenceFieldUpdater.get(this);
            int a10 = jVar.a(e10);
            if (a10 == 0) {
                return true;
            }
            if (a10 != 1) {
                if (a10 == 2) {
                    return false;
                }
            } else {
                j<E> c = jVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, jVar, c) && atomicReferenceFieldUpdater.get(this) == jVar) {
                }
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20186a;
            j jVar = (j) atomicReferenceFieldUpdater.get(this);
            if (jVar.b()) {
                return;
            }
            j<E> c = jVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, jVar, c) && atomicReferenceFieldUpdater.get(this) == jVar) {
            }
        }
    }

    public final int c() {
        j jVar = (j) f20186a.get(this);
        jVar.getClass();
        long j10 = j.f20188f.get(jVar);
        return (((int) ((j10 & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j10) >> 0))) & 1073741823;
    }

    public final E d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20186a;
            j jVar = (j) atomicReferenceFieldUpdater.get(this);
            E e10 = (E) jVar.d();
            if (e10 != j.f20189g) {
                return e10;
            }
            j<E> c = jVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, jVar, c) && atomicReferenceFieldUpdater.get(this) == jVar) {
            }
        }
    }
}
