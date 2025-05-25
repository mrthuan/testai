package kotlinx.coroutines.internal;

import com.google.android.play.core.assetpacks.b1;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.c;

/* compiled from: ConcurrentLinkedList.kt */
/* loaded from: classes.dex */
public abstract class c<N extends c<N>> {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f20170a = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_next");

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f20171b = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_prev");
    private volatile Object _next;
    private volatile Object _prev;

    public c(N n10) {
        this._prev = n10;
    }

    public final void a() {
        f20171b.lazySet(this, null);
    }

    public final N b() {
        Object obj = f20170a.get(this);
        if (obj == b1.f13190n) {
            return null;
        }
        return (N) obj;
    }

    public abstract boolean c();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [kotlinx.coroutines.internal.c] */
    public final void d() {
        boolean z10;
        c cVar;
        boolean z11;
        boolean z12;
        ?? b10;
        if (b() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20171b;
            c cVar2 = (c) atomicReferenceFieldUpdater.get(this);
            while (cVar2 != null && cVar2.c()) {
                cVar2 = (c) atomicReferenceFieldUpdater.get(cVar2);
            }
            N b11 = b();
            kotlin.jvm.internal.g.b(b11);
            while (b11.c() && (b10 = b11.b()) != 0) {
                b11 = b10;
            }
            do {
                Object obj = atomicReferenceFieldUpdater.get(b11);
                if (((c) obj) == null) {
                    cVar = null;
                } else {
                    cVar = cVar2;
                }
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(b11, obj, cVar)) {
                        z11 = true;
                        continue;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(b11) != obj) {
                        z11 = false;
                        continue;
                        break;
                    }
                }
            } while (!z11);
            if (cVar2 != null) {
                f20170a.set(cVar2, b11);
            }
            if (b11.c()) {
                if (b11.b() == null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z12) {
                    continue;
                }
            }
            if (cVar2 == null || !cVar2.c()) {
                return;
            }
        }
    }
}
