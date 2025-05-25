package com.bykv.vk.openvk.preload.a.b.a;

import com.bykv.vk.openvk.preload.a.p;
import com.bykv.vk.openvk.preload.a.r;
import com.bykv.vk.openvk.preload.a.t;
import com.bykv.vk.openvk.preload.a.u;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: MapTypeAdapterFactory.java */
/* loaded from: classes.dex */
public final class g implements u {

    /* renamed from: a  reason: collision with root package name */
    final boolean f7206a;

    /* renamed from: b  reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.b.c f7207b;

    public g(com.bykv.vk.openvk.preload.a.b.c cVar, boolean z10) {
        this.f7207b = cVar;
        this.f7206a = z10;
    }

    @Override // com.bykv.vk.openvk.preload.a.u
    public final <T> t<T> a(com.bykv.vk.openvk.preload.a.f fVar, com.bykv.vk.openvk.preload.a.c.a<T> aVar) {
        t<Boolean> tVar;
        Type type = aVar.c;
        if (!Map.class.isAssignableFrom(aVar.f7360b)) {
            return null;
        }
        Type[] b10 = com.bykv.vk.openvk.preload.a.b.b.b(type, com.bykv.vk.openvk.preload.a.b.b.b(type));
        Type type2 = b10[0];
        if (type2 != Boolean.TYPE && type2 != Boolean.class) {
            tVar = fVar.a((com.bykv.vk.openvk.preload.a.c.a) com.bykv.vk.openvk.preload.a.c.a.a(type2));
        } else {
            tVar = n.f7246f;
        }
        t<T> a10 = fVar.a((com.bykv.vk.openvk.preload.a.c.a) com.bykv.vk.openvk.preload.a.c.a.a(b10[1]));
        com.bykv.vk.openvk.preload.a.b.i<T> a11 = this.f7207b.a(aVar);
        return new a(fVar, b10[0], tVar, b10[1], a10, a11);
    }

    /* compiled from: MapTypeAdapterFactory.java */
    /* loaded from: classes.dex */
    public final class a<K, V> extends t<Map<K, V>> {

        /* renamed from: b  reason: collision with root package name */
        private final t<K> f7209b;
        private final t<V> c;

        /* renamed from: d  reason: collision with root package name */
        private final com.bykv.vk.openvk.preload.a.b.i<? extends Map<K, V>> f7210d;

        public a(com.bykv.vk.openvk.preload.a.f fVar, Type type, t<K> tVar, Type type2, t<V> tVar2, com.bykv.vk.openvk.preload.a.b.i<? extends Map<K, V>> iVar) {
            this.f7209b = new m(fVar, tVar, type);
            this.c = new m(fVar, tVar2, type2);
            this.f7210d = iVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.bykv.vk.openvk.preload.a.t
        public final /* synthetic */ void a(com.bykv.vk.openvk.preload.a.d.c cVar, Object obj) {
            String str;
            Map map = (Map) obj;
            if (map == null) {
                cVar.e();
            } else if (!g.this.f7206a) {
                cVar.c();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    cVar.a(String.valueOf(entry.getKey()));
                    this.c.a(cVar, entry.getValue());
                }
                cVar.d();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i10 = 0;
                boolean z10 = false;
                for (Map.Entry<K, V> entry2 : map.entrySet()) {
                    com.bykv.vk.openvk.preload.a.k a10 = this.f7209b.a((t<K>) entry2.getKey());
                    arrayList.add(a10);
                    arrayList2.add(entry2.getValue());
                    z10 |= (a10 instanceof com.bykv.vk.openvk.preload.a.i) || (a10 instanceof com.bykv.vk.openvk.preload.a.n);
                }
                if (z10) {
                    cVar.a();
                    int size = arrayList.size();
                    while (i10 < size) {
                        cVar.a();
                        com.bykv.vk.openvk.preload.a.b.k.a((com.bykv.vk.openvk.preload.a.k) arrayList.get(i10), cVar);
                        this.c.a(cVar, arrayList2.get(i10));
                        cVar.b();
                        i10++;
                    }
                    cVar.b();
                    return;
                }
                cVar.c();
                int size2 = arrayList.size();
                while (i10 < size2) {
                    com.bykv.vk.openvk.preload.a.k kVar = (com.bykv.vk.openvk.preload.a.k) arrayList.get(i10);
                    if (kVar instanceof p) {
                        p g10 = kVar.g();
                        Object obj2 = g10.f7446a;
                        if (obj2 instanceof Number) {
                            str = String.valueOf(g10.a());
                        } else if (obj2 instanceof Boolean) {
                            str = Boolean.toString(g10.f());
                        } else if (obj2 instanceof String) {
                            str = g10.b();
                        } else {
                            throw new AssertionError();
                        }
                    } else if (!(kVar instanceof com.bykv.vk.openvk.preload.a.m)) {
                        throw new AssertionError();
                    } else {
                        str = "null";
                    }
                    cVar.a(str);
                    this.c.a(cVar, arrayList2.get(i10));
                    i10++;
                }
                cVar.d();
            }
        }

        @Override // com.bykv.vk.openvk.preload.a.t
        public final /* synthetic */ Object a(com.bykv.vk.openvk.preload.a.d.a aVar) {
            com.bykv.vk.openvk.preload.a.d.b f10 = aVar.f();
            if (f10 == com.bykv.vk.openvk.preload.a.d.b.NULL) {
                aVar.k();
                return null;
            }
            Map<K, V> a10 = this.f7210d.a();
            if (f10 == com.bykv.vk.openvk.preload.a.d.b.BEGIN_ARRAY) {
                aVar.a();
                while (aVar.e()) {
                    aVar.a();
                    K a11 = this.f7209b.a(aVar);
                    if (a10.put(a11, this.c.a(aVar)) == null) {
                        aVar.b();
                    } else {
                        throw new r("duplicate key: ".concat(String.valueOf(a11)));
                    }
                }
                aVar.b();
            } else {
                aVar.c();
                while (aVar.e()) {
                    com.bykv.vk.openvk.preload.a.b.f.f7327a.a(aVar);
                    K a12 = this.f7209b.a(aVar);
                    if (a10.put(a12, this.c.a(aVar)) != null) {
                        throw new r("duplicate key: ".concat(String.valueOf(a12)));
                    }
                }
                aVar.d();
            }
            return a10;
        }
    }
}
