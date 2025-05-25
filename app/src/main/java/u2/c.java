package u2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import x2.p;

/* compiled from: ConstraintController.java */
/* loaded from: classes.dex */
public abstract class c<T> implements t2.a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f30141a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public T f30142b;
    public final v2.d<T> c;

    /* renamed from: d  reason: collision with root package name */
    public a f30143d;

    /* compiled from: ConstraintController.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    public c(v2.d<T> dVar) {
        this.c = dVar;
    }

    @Override // t2.a
    public final void a(T t4) {
        this.f30142b = t4;
        e(this.f30143d, t4);
    }

    public abstract boolean b(p pVar);

    public abstract boolean c(T t4);

    public final void d(Collection collection) {
        this.f30141a.clear();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            if (b(pVar)) {
                this.f30141a.add(pVar.f31558a);
            }
        }
        if (this.f30141a.isEmpty()) {
            this.c.b(this);
        } else {
            v2.d<T> dVar = this.c;
            synchronized (dVar.c) {
                if (dVar.f30486d.add(this)) {
                    if (dVar.f30486d.size() == 1) {
                        dVar.f30487e = dVar.a();
                        o2.h c = o2.h.c();
                        int i10 = v2.d.f30483f;
                        String.format("%s: initial state = %s", dVar.getClass().getSimpleName(), dVar.f30487e);
                        c.a(new Throwable[0]);
                        dVar.d();
                    }
                    a(dVar.f30487e);
                }
            }
        }
        e(this.f30143d, this.f30142b);
    }

    public final void e(a aVar, T t4) {
        if (!this.f30141a.isEmpty() && aVar != null) {
            if (t4 != null && !c(t4)) {
                ((t2.d) aVar).b(this.f30141a);
                return;
            }
            ArrayList arrayList = this.f30141a;
            t2.d dVar = (t2.d) aVar;
            synchronized (dVar.c) {
                t2.c cVar = dVar.f29915a;
                if (cVar != null) {
                    cVar.d(arrayList);
                }
            }
        }
    }
}
