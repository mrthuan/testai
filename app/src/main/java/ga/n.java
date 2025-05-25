package ga;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: LazySet.java */
/* loaded from: classes2.dex */
public final class n<T> implements db.b<Set<T>> {

    /* renamed from: b  reason: collision with root package name */
    public volatile Set<T> f17736b = null;

    /* renamed from: a  reason: collision with root package name */
    public volatile Set<db.b<T>> f17735a = Collections.newSetFromMap(new ConcurrentHashMap());

    public n(Collection<db.b<T>> collection) {
        this.f17735a.addAll(collection);
    }

    public final synchronized void a() {
        for (db.b<T> bVar : this.f17735a) {
            this.f17736b.add(bVar.get());
        }
        this.f17735a = null;
    }

    @Override // db.b
    public final Object get() {
        if (this.f17736b == null) {
            synchronized (this) {
                if (this.f17736b == null) {
                    this.f17736b = Collections.newSetFromMap(new ConcurrentHashMap());
                    a();
                }
            }
        }
        return Collections.unmodifiableSet(this.f17736b);
    }
}
