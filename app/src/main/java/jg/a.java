package jg;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SequencesJVM.kt */
/* loaded from: classes.dex */
public final class a<T> implements f<T> {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<f<T>> f19207a;

    public a(j jVar) {
        this.f19207a = new AtomicReference<>(jVar);
    }

    @Override // jg.f
    public final Iterator<T> iterator() {
        f<T> andSet = this.f19207a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
