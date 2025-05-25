package ga;

import f0.s;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: EventBus.java */
/* loaded from: classes2.dex */
public final class l implements ab.d, ab.c {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f17731a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public ArrayDeque f17732b = new ArrayDeque();
    public final Executor c;

    public l(Executor executor) {
        this.c = executor;
    }

    @Override // ab.d
    public final synchronized void a(Executor executor, ab.b bVar) {
        executor.getClass();
        if (!this.f17731a.containsKey(z9.b.class)) {
            this.f17731a.put(z9.b.class, new ConcurrentHashMap());
        }
        ((ConcurrentHashMap) this.f17731a.get(z9.b.class)).put(bVar, executor);
    }

    @Override // ab.d
    public final void b(jb.l lVar) {
        a(this.c, lVar);
    }

    public final synchronized Set<Map.Entry<ab.b<Object>, Executor>> c(ab.a<?> aVar) {
        Set<Map.Entry<ab.b<Object>, Executor>> entrySet;
        HashMap hashMap = this.f17731a;
        aVar.getClass();
        Map map = (Map) hashMap.get(null);
        if (map == null) {
            entrySet = Collections.emptySet();
        } else {
            entrySet = map.entrySet();
        }
        return entrySet;
    }

    public final void d(ab.a<?> aVar) {
        aVar.getClass();
        synchronized (this) {
            ArrayDeque arrayDeque = this.f17732b;
            if (arrayDeque != null) {
                arrayDeque.add(aVar);
                return;
            }
            for (Map.Entry<ab.b<Object>, Executor> entry : c(aVar)) {
                entry.getValue().execute(new s(5, entry, aVar));
            }
        }
    }
}
