package ga;

import com.google.firebase.components.DependencyException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: RestrictedComponentContainer.java */
/* loaded from: classes2.dex */
public final class r implements c {

    /* renamed from: a  reason: collision with root package name */
    public final Set<q<?>> f17742a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<q<?>> f17743b;
    public final Set<q<?>> c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<q<?>> f17744d;

    /* renamed from: e  reason: collision with root package name */
    public final c f17745e;

    /* compiled from: RestrictedComponentContainer.java */
    /* loaded from: classes2.dex */
    public static class a implements ab.c {

        /* renamed from: a  reason: collision with root package name */
        public final ab.c f17746a;

        public a(ab.c cVar) {
            this.f17746a = cVar;
        }
    }

    public r(b bVar, i iVar) {
        boolean z10;
        boolean z11;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (k kVar : bVar.c) {
            int i10 = kVar.c;
            if (i10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i11 = kVar.f17730b;
            q<?> qVar = kVar.f17729a;
            if (z10) {
                if (i11 == 2) {
                    hashSet4.add(qVar);
                } else {
                    hashSet.add(qVar);
                }
            } else {
                if (i10 == 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    hashSet3.add(qVar);
                } else if (i11 == 2) {
                    hashSet5.add(qVar);
                } else {
                    hashSet2.add(qVar);
                }
            }
        }
        if (!bVar.f17708g.isEmpty()) {
            hashSet.add(q.a(ab.c.class));
        }
        this.f17742a = Collections.unmodifiableSet(hashSet);
        this.f17743b = Collections.unmodifiableSet(hashSet2);
        this.c = Collections.unmodifiableSet(hashSet3);
        this.f17744d = Collections.unmodifiableSet(hashSet4);
        Collections.unmodifiableSet(hashSet5);
        this.f17745e = iVar;
    }

    @Override // ga.c
    public final <T> T a(Class<T> cls) {
        if (this.f17742a.contains(q.a(cls))) {
            T t4 = (T) this.f17745e.a(cls);
            if (!cls.equals(ab.c.class)) {
                return t4;
            }
            return (T) new a((ab.c) t4);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", cls));
    }

    @Override // ga.c
    public final <T> db.b<T> b(q<T> qVar) {
        if (this.f17743b.contains(qVar)) {
            return this.f17745e.b(qVar);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", qVar));
    }

    @Override // ga.c
    public final <T> Set<T> c(q<T> qVar) {
        if (this.f17744d.contains(qVar)) {
            return this.f17745e.c(qVar);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", qVar));
    }

    @Override // ga.c
    public final <T> db.b<T> d(Class<T> cls) {
        return b(q.a(cls));
    }

    @Override // ga.c
    public final <T> db.a<T> e(q<T> qVar) {
        if (this.c.contains(qVar)) {
            return this.f17745e.e(qVar);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Deferred<%s>.", qVar));
    }

    @Override // ga.c
    public final <T> T f(q<T> qVar) {
        if (this.f17742a.contains(qVar)) {
            return (T) this.f17745e.f(qVar);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", qVar));
    }

    public final <T> db.a<T> g(Class<T> cls) {
        return e(q.a(cls));
    }

    public final Set h(Class cls) {
        return c(q.a(cls));
    }
}
