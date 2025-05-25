package y;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import y.h;

/* compiled from: ArrayMap.java */
/* loaded from: classes.dex */
public class b<K, V> extends i<K, V> implements Map<K, V> {

    /* renamed from: h  reason: collision with root package name */
    public a f31908h;

    public b() {
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f31908h == null) {
            this.f31908h = new a(this);
        }
        a aVar = this.f31908h;
        if (aVar.f31926a == null) {
            aVar.f31926a = new h.b();
        }
        return aVar.f31926a;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        if (this.f31908h == null) {
            this.f31908h = new a(this);
        }
        a aVar = this.f31908h;
        if (aVar.f31927b == null) {
            aVar.f31927b = new h.c();
        }
        return aVar.f31927b;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        b(map.size() + this.c);
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        if (this.f31908h == null) {
            this.f31908h = new a(this);
        }
        a aVar = this.f31908h;
        if (aVar.c == null) {
            aVar.c = new h.e();
        }
        return aVar.c;
    }

    public b(b bVar) {
        super(bVar);
    }
}
