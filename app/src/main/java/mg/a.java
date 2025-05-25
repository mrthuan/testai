package mg;

import com.android.billingclient.api.a0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.collections.m;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.e;
import kotlinx.coroutines.g;
import kotlinx.coroutines.internal.q;
import kotlinx.coroutines.s1;
import o9.d;

/* compiled from: Select.kt */
/* loaded from: classes.dex */
public final class a<R> extends e implements b, s1 {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f22037a = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "state");
    private volatile Object state;

    /* compiled from: Select.kt */
    /* renamed from: mg.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0291a {
    }

    @Override // mg.b
    public final boolean a(Object obj, Object obj2) {
        if (d(obj) == 0) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.coroutines.f
    public final void c(Throwable th2) {
        boolean z10;
        do {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22037a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == d.f22762f) {
                return;
            }
            a0 a0Var = d.f22763g;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, a0Var)) {
                    z10 = true;
                    continue;
                    break;
                } else if (atomicReferenceFieldUpdater.get(this) != obj) {
                    z10 = false;
                    continue;
                    break;
                }
            }
        } while (!z10);
    }

    public final int d(Object obj) {
        boolean z10;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f22037a;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof g)) {
                if (kotlin.jvm.internal.g.a(obj2, d.f22762f)) {
                    z10 = true;
                } else {
                    z10 = obj2 instanceof C0291a;
                }
                if (z10) {
                    return 3;
                }
                if (kotlin.jvm.internal.g.a(obj2, d.f22763g)) {
                    return 2;
                }
                boolean z11 = false;
                if (kotlin.jvm.internal.g.a(obj2, d.f22761e)) {
                    List H = ge.a.H(obj);
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, H)) {
                            z11 = true;
                            break;
                        } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    if (z11) {
                        return 1;
                    }
                } else if (obj2 instanceof List) {
                    ArrayList z02 = m.z0((Collection) obj2, obj);
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, z02)) {
                            z11 = true;
                            break;
                        } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    if (z11) {
                        return 1;
                    }
                } else {
                    throw new IllegalStateException(("Unexpected state: " + obj2).toString());
                }
            }
        }
    }

    @Override // mg.b
    public final CoroutineContext getContext() {
        return null;
    }

    @Override // cg.l
    public final /* bridge */ /* synthetic */ tf.d invoke(Throwable th2) {
        c(th2);
        return tf.d.f30009a;
    }

    @Override // kotlinx.coroutines.s1
    public final void b(q<?> qVar, int i10) {
    }
}
