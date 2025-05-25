package s;

import java.util.HashMap;
import s.b;

/* compiled from: FastSafeIterableMap.java */
/* loaded from: classes.dex */
public final class a<K, V> extends b<K, V> {

    /* renamed from: e  reason: collision with root package name */
    public final HashMap<K, b.c<K, V>> f29678e = new HashMap<>();

    @Override // s.b
    public final b.c<K, V> a(K k10) {
        return this.f29678e.get(k10);
    }

    @Override // s.b
    public final V b(K k10, V v10) {
        b.c<K, V> a10 = a(k10);
        if (a10 != null) {
            return a10.f29683b;
        }
        HashMap<K, b.c<K, V>> hashMap = this.f29678e;
        b.c<K, V> cVar = new b.c<>(k10, v10);
        this.f29681d++;
        b.c<K, V> cVar2 = this.f29680b;
        if (cVar2 == null) {
            this.f29679a = cVar;
            this.f29680b = cVar;
        } else {
            cVar2.c = cVar;
            cVar.f29684d = cVar2;
            this.f29680b = cVar;
        }
        hashMap.put(k10, cVar);
        return null;
    }

    @Override // s.b
    public final V c(K k10) {
        V v10 = (V) super.c(k10);
        this.f29678e.remove(k10);
        return v10;
    }
}
