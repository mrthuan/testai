package kotlinx.coroutines.internal;

import com.android.billingclient.api.a0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: Atomic.kt */
/* loaded from: classes.dex */
public abstract class a<T> extends m {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f20168a = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_consensus");
    private volatile Object _consensus = t0.f28773f;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.m
    public final Object a(Object obj) {
        boolean z10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20168a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        a0 a0Var = t0.f28773f;
        if (obj2 == a0Var) {
            a0 c = c(obj);
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 == a0Var) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, a0Var, c)) {
                        z10 = true;
                        break;
                    } else if (atomicReferenceFieldUpdater.get(this) != a0Var) {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    obj2 = c;
                } else {
                    obj2 = atomicReferenceFieldUpdater.get(this);
                }
            }
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(T t4, Object obj);

    public abstract a0 c(Object obj);
}
