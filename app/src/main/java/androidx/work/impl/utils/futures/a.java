package androidx.work.impl.utils.futures;

import androidx.work.impl.utils.futures.AbstractFuture;

/* compiled from: SettableFuture.java */
/* loaded from: classes.dex */
public final class a<V> extends AbstractFuture<V> {
    public final boolean h(V v10) {
        if (v10 == null) {
            v10 = (V) AbstractFuture.f4983g;
        }
        if (AbstractFuture.f4982f.b(this, null, v10)) {
            AbstractFuture.b(this);
            return true;
        }
        return false;
    }

    public final boolean i(Throwable th2) {
        th2.getClass();
        if (AbstractFuture.f4982f.b(this, null, new AbstractFuture.Failure(th2))) {
            AbstractFuture.b(this);
            return true;
        }
        return false;
    }

    public final boolean j(y9.a<? extends V> aVar) {
        AbstractFuture.Failure failure;
        aVar.getClass();
        Object obj = this.f4984a;
        if (obj == null) {
            if (aVar.isDone()) {
                if (!AbstractFuture.f4982f.b(this, null, AbstractFuture.e(aVar))) {
                    return false;
                }
                AbstractFuture.b(this);
            } else {
                AbstractFuture.e eVar = new AbstractFuture.e(this, aVar);
                if (AbstractFuture.f4982f.b(this, null, eVar)) {
                    try {
                        aVar.addListener(eVar, DirectExecutor.INSTANCE);
                    } catch (Throwable th2) {
                        try {
                            failure = new AbstractFuture.Failure(th2);
                        } catch (Throwable unused) {
                            failure = AbstractFuture.Failure.f4986b;
                        }
                        AbstractFuture.f4982f.b(this, eVar, failure);
                    }
                } else {
                    obj = this.f4984a;
                }
            }
            return true;
        }
        if (!(obj instanceof AbstractFuture.b)) {
            return false;
        }
        aVar.cancel(((AbstractFuture.b) obj).f4989a);
        return false;
    }
}
