package ga;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import com.google.firebase.components.MissingDependencyException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ComponentRuntime.java */
/* loaded from: classes2.dex */
public final class i implements c, va.a {

    /* renamed from: g  reason: collision with root package name */
    public static final h f17719g = new h();

    /* renamed from: d  reason: collision with root package name */
    public final l f17722d;

    /* renamed from: f  reason: collision with root package name */
    public final f f17724f;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f17720a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f17721b = new HashMap();
    public final HashMap c = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final AtomicReference<Boolean> f17723e = new AtomicReference<>();

    public i(Executor executor, ArrayList arrayList, ArrayList arrayList2, f fVar) {
        l lVar = new l(executor);
        this.f17722d = lVar;
        this.f17724f = fVar;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(b.b(lVar, l.class, ab.d.class, ab.c.class));
        arrayList3.add(b.b(this, va.a.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar != null) {
                arrayList3.add(bVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((db.b) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.f17724f.a(componentRegistrar));
                        it3.remove();
                    }
                } catch (InvalidRegistrarException unused) {
                    it3.remove();
                }
            }
            if (this.f17720a.isEmpty()) {
                j.a(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f17720a.keySet());
                arrayList6.addAll(arrayList3);
                j.a(arrayList6);
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                final b bVar2 = (b) it4.next();
                this.f17720a.put(bVar2, new m(new db.b() { // from class: ga.g
                    @Override // db.b
                    public final Object get() {
                        i iVar = i.this;
                        iVar.getClass();
                        b bVar3 = bVar2;
                        return bVar3.f17707f.a(new r(bVar3, iVar));
                    }
                }));
            }
            arrayList5.addAll(i(arrayList3));
            arrayList5.addAll(j());
            h();
        }
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            ((Runnable) it5.next()).run();
        }
        Boolean bool = this.f17723e.get();
        if (bool != null) {
            g(this.f17720a, bool.booleanValue());
        }
    }

    @Override // ga.c
    public final Object a(Class cls) {
        return f(q.a(cls));
    }

    @Override // ga.c
    public final synchronized <T> db.b<T> b(q<T> qVar) {
        if (qVar != null) {
        } else {
            throw new NullPointerException("Null interface requested.");
        }
        return (db.b) this.f17721b.get(qVar);
    }

    @Override // ga.c
    public final Set c(q qVar) {
        return (Set) k(qVar).get();
    }

    @Override // ga.c
    public final db.b d(Class cls) {
        return b(q.a(cls));
    }

    @Override // ga.c
    public final <T> db.a<T> e(q<T> qVar) {
        db.b<T> b10 = b(qVar);
        if (b10 == null) {
            return new p(p.c, p.f17737d);
        }
        if (b10 instanceof p) {
            return (p) b10;
        }
        return new p(null, b10);
    }

    @Override // ga.c
    public final Object f(q qVar) {
        db.b b10 = b(qVar);
        if (b10 == null) {
            return null;
        }
        return b10.get();
    }

    public final void g(Map<b<?>, db.b<?>> map, boolean z10) {
        ArrayDeque<ab.a<?>> arrayDeque;
        boolean z11;
        for (Map.Entry<b<?>, db.b<?>> entry : map.entrySet()) {
            db.b<?> value = entry.getValue();
            int i10 = entry.getKey().f17705d;
            boolean z12 = false;
            if (i10 == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                if (i10 == 2) {
                    z12 = true;
                }
                if (z12 && z10) {
                }
            }
            value.get();
        }
        l lVar = this.f17722d;
        synchronized (lVar) {
            try {
                arrayDeque = lVar.f17732b;
                if (arrayDeque != null) {
                    lVar.f17732b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (arrayDeque != null) {
            for (ab.a<?> aVar : arrayDeque) {
                lVar.d(aVar);
            }
        }
    }

    public final void h() {
        boolean z10;
        boolean z11;
        for (b bVar : this.f17720a.keySet()) {
            for (k kVar : bVar.c) {
                boolean z12 = true;
                if (kVar.f17730b == 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                q<?> qVar = kVar.f17729a;
                if (z10) {
                    HashMap hashMap = this.c;
                    if (!hashMap.containsKey(qVar)) {
                        hashMap.put(qVar, new n(Collections.emptySet()));
                    }
                }
                HashMap hashMap2 = this.f17721b;
                if (hashMap2.containsKey(qVar)) {
                    continue;
                } else {
                    int i10 = kVar.f17730b;
                    if (i10 == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        if (i10 != 2) {
                            z12 = false;
                        }
                        if (!z12) {
                            hashMap2.put(qVar, new p(p.c, p.f17737d));
                        }
                    } else {
                        throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", bVar, qVar));
                    }
                }
            }
        }
    }

    public final ArrayList i(ArrayList arrayList) {
        boolean z10;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f17706e == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                db.b bVar2 = (db.b) this.f17720a.get(bVar);
                Iterator it2 = bVar.f17704b.iterator();
                while (it2.hasNext()) {
                    q qVar = (q) it2.next();
                    HashMap hashMap = this.f17721b;
                    if (!hashMap.containsKey(qVar)) {
                        hashMap.put(qVar, bVar2);
                    } else {
                        arrayList2.add(new l.r(5, (p) ((db.b) hashMap.get(qVar)), bVar2));
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList j() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        Iterator it = this.f17720a.entrySet().iterator();
        while (true) {
            boolean z10 = true;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            b bVar = (b) entry.getKey();
            if (bVar.f17706e != 0) {
                z10 = false;
            }
            if (!z10) {
                db.b bVar2 = (db.b) entry.getValue();
                Iterator it2 = bVar.f17704b.iterator();
                while (it2.hasNext()) {
                    q qVar = (q) it2.next();
                    if (!hashMap.containsKey(qVar)) {
                        hashMap.put(qVar, new HashSet());
                    }
                    ((Set) hashMap.get(qVar)).add(bVar2);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            Object key = entry2.getKey();
            HashMap hashMap2 = this.c;
            if (!hashMap2.containsKey(key)) {
                hashMap2.put((q) entry2.getKey(), new n((Set) ((Collection) entry2.getValue())));
            } else {
                n nVar = (n) hashMap2.get(entry2.getKey());
                for (db.b bVar3 : (Set) entry2.getValue()) {
                    arrayList.add(new com.facebook.appevents.g(1, nVar, bVar3));
                }
            }
        }
        return arrayList;
    }

    public final synchronized <T> db.b<Set<T>> k(q<T> qVar) {
        n nVar = (n) this.c.get(qVar);
        if (nVar != null) {
            return nVar;
        }
        return f17719g;
    }
}
