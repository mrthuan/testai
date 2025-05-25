package com.bykv.vk.openvk.preload.a.b;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: LinkedTreeMap.java */
/* loaded from: classes.dex */
public final class h<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: f  reason: collision with root package name */
    static final /* synthetic */ boolean f7329f = true;

    /* renamed from: g  reason: collision with root package name */
    private static final Comparator<Comparable> f7330g = new Comparator<Comparable>() { // from class: com.bykv.vk.openvk.preload.a.b.h.1
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    Comparator<? super K> f7331a;

    /* renamed from: b  reason: collision with root package name */
    d<K, V> f7332b;
    int c;

    /* renamed from: d  reason: collision with root package name */
    int f7333d;

    /* renamed from: e  reason: collision with root package name */
    final d<K, V> f7334e;

    /* renamed from: h  reason: collision with root package name */
    private h<K, V>.a f7335h;

    /* renamed from: i  reason: collision with root package name */
    private h<K, V>.b f7336i;

    /* compiled from: LinkedTreeMap.java */
    /* loaded from: classes.dex */
    public class a extends AbstractSet<Map.Entry<K, V>> {
        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            h.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if ((obj instanceof Map.Entry) && h.this.a((Map.Entry) obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new h<K, V>.c<Map.Entry<K, V>>() { // from class: com.bykv.vk.openvk.preload.a.b.h.a.1
                {
                    h hVar = h.this;
                }

                @Override // java.util.Iterator
                public final /* synthetic */ Object next() {
                    return a();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            d<K, V> a10;
            if (!(obj instanceof Map.Entry) || (a10 = h.this.a((Map.Entry) obj)) == null) {
                return false;
            }
            h.this.a((d) a10, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return h.this.c;
        }
    }

    /* compiled from: LinkedTreeMap.java */
    /* loaded from: classes.dex */
    public final class b extends AbstractSet<K> {
        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            h.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return h.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new h<K, V>.c<K>() { // from class: com.bykv.vk.openvk.preload.a.b.h.b.1
                {
                    h hVar = h.this;
                }

                @Override // java.util.Iterator
                public final K next() {
                    return a().f7348f;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            if (h.this.a(obj) != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return h.this.c;
        }
    }

    /* compiled from: LinkedTreeMap.java */
    /* loaded from: classes.dex */
    public abstract class c<T> implements Iterator<T> {

        /* renamed from: b  reason: collision with root package name */
        d<K, V> f7341b;
        d<K, V> c = null;

        /* renamed from: d  reason: collision with root package name */
        int f7342d;

        public c() {
            this.f7341b = h.this.f7334e.f7346d;
            this.f7342d = h.this.f7333d;
        }

        public final d<K, V> a() {
            d<K, V> dVar = this.f7341b;
            h hVar = h.this;
            if (dVar != hVar.f7334e) {
                if (hVar.f7333d == this.f7342d) {
                    this.f7341b = dVar.f7346d;
                    this.c = dVar;
                    return dVar;
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f7341b != h.this.f7334e) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final void remove() {
            d<K, V> dVar = this.c;
            if (dVar != null) {
                h.this.a((d) dVar, true);
                this.c = null;
                this.f7342d = h.this.f7333d;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public h() {
        this(f7330g);
    }

    private d<K, V> a(K k10, boolean z10) {
        int i10;
        d<K, V> dVar;
        Comparator<? super K> comparator = this.f7331a;
        d<K, V> dVar2 = this.f7332b;
        if (dVar2 != null) {
            Comparable comparable = comparator == f7330g ? (Comparable) k10 : null;
            while (true) {
                if (comparable != null) {
                    i10 = comparable.compareTo(dVar2.f7348f);
                } else {
                    i10 = comparator.compare(k10, (K) dVar2.f7348f);
                }
                if (i10 != 0) {
                    d<K, V> dVar3 = i10 < 0 ? dVar2.f7345b : dVar2.c;
                    if (dVar3 == null) {
                        break;
                    }
                    dVar2 = dVar3;
                } else {
                    return dVar2;
                }
            }
        } else {
            i10 = 0;
        }
        if (z10) {
            d<K, V> dVar4 = this.f7334e;
            if (dVar2 == null) {
                if (comparator == f7330g && !(k10 instanceof Comparable)) {
                    throw new ClassCastException(k10.getClass().getName().concat(" is not Comparable"));
                }
                dVar = new d<>(dVar2, k10, dVar4, dVar4.f7347e);
                this.f7332b = dVar;
            } else {
                dVar = new d<>(dVar2, k10, dVar4, dVar4.f7347e);
                if (i10 < 0) {
                    dVar2.f7345b = dVar;
                } else {
                    dVar2.c = dVar;
                }
                b(dVar2, true);
            }
            this.c++;
            this.f7333d++;
            return dVar;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private d<K, V> b(Object obj) {
        if (obj != 0) {
            try {
                return a((h<K, V>) obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f7332b = null;
        this.c = 0;
        this.f7333d++;
        d<K, V> dVar = this.f7334e;
        dVar.f7347e = dVar;
        dVar.f7346d = dVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (b(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        h<K, V>.a aVar = this.f7335h;
        if (aVar != null) {
            return aVar;
        }
        h<K, V>.a aVar2 = new a();
        this.f7335h = aVar2;
        return aVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        d<K, V> b10 = b(obj);
        if (b10 != null) {
            return b10.f7349g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        h<K, V>.b bVar = this.f7336i;
        if (bVar != null) {
            return bVar;
        }
        h<K, V>.b bVar2 = new b();
        this.f7336i = bVar2;
        return bVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k10, V v10) {
        if (k10 != null) {
            d<K, V> a10 = a((h<K, V>) k10, true);
            V v11 = a10.f7349g;
            a10.f7349g = v10;
            return v11;
        }
        throw new NullPointerException("key == null");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        d<K, V> a10 = a(obj);
        if (a10 != null) {
            return a10.f7349g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c;
    }

    private h(Comparator<? super K> comparator) {
        this.c = 0;
        this.f7333d = 0;
        this.f7334e = new d<>();
        this.f7331a = comparator == null ? f7330g : comparator;
    }

    private void b(d<K, V> dVar, boolean z10) {
        while (dVar != null) {
            d<K, V> dVar2 = dVar.f7345b;
            d<K, V> dVar3 = dVar.c;
            int i10 = dVar2 != null ? dVar2.f7350h : 0;
            int i11 = dVar3 != null ? dVar3.f7350h : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                d<K, V> dVar4 = dVar3.f7345b;
                d<K, V> dVar5 = dVar3.c;
                int i13 = (dVar4 != null ? dVar4.f7350h : 0) - (dVar5 != null ? dVar5.f7350h : 0);
                if (i13 != -1 && (i13 != 0 || z10)) {
                    if (!f7329f && i13 != 1) {
                        throw new AssertionError();
                    }
                    b((d) dVar3);
                    a((d) dVar);
                } else {
                    a((d) dVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                d<K, V> dVar6 = dVar2.f7345b;
                d<K, V> dVar7 = dVar2.c;
                int i14 = (dVar6 != null ? dVar6.f7350h : 0) - (dVar7 != null ? dVar7.f7350h : 0);
                if (i14 != 1 && (i14 != 0 || z10)) {
                    if (!f7329f && i14 != -1) {
                        throw new AssertionError();
                    }
                    a((d) dVar2);
                    b((d) dVar);
                } else {
                    b((d) dVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                dVar.f7350h = i10 + 1;
                if (z10) {
                    return;
                }
            } else if (!f7329f && i12 != -1 && i12 != 1) {
                throw new AssertionError();
            } else {
                dVar.f7350h = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            dVar = dVar.f7344a;
        }
    }

    /* compiled from: LinkedTreeMap.java */
    /* loaded from: classes.dex */
    public static final class d<K, V> implements Map.Entry<K, V> {

        /* renamed from: a  reason: collision with root package name */
        d<K, V> f7344a;

        /* renamed from: b  reason: collision with root package name */
        d<K, V> f7345b;
        d<K, V> c;

        /* renamed from: d  reason: collision with root package name */
        d<K, V> f7346d;

        /* renamed from: e  reason: collision with root package name */
        d<K, V> f7347e;

        /* renamed from: f  reason: collision with root package name */
        final K f7348f;

        /* renamed from: g  reason: collision with root package name */
        V f7349g;

        /* renamed from: h  reason: collision with root package name */
        int f7350h;

        public d() {
            this.f7348f = null;
            this.f7347e = this;
            this.f7346d = this;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k10 = this.f7348f;
                if (k10 != null ? k10.equals(entry.getKey()) : entry.getKey() == null) {
                    V v10 = this.f7349g;
                    if (v10 == null) {
                        if (entry.getValue() == null) {
                            return true;
                        }
                    } else if (v10.equals(entry.getValue())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f7348f;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f7349g;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            int hashCode;
            K k10 = this.f7348f;
            int i10 = 0;
            if (k10 == null) {
                hashCode = 0;
            } else {
                hashCode = k10.hashCode();
            }
            V v10 = this.f7349g;
            if (v10 != null) {
                i10 = v10.hashCode();
            }
            return hashCode ^ i10;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            V v11 = this.f7349g;
            this.f7349g = v10;
            return v11;
        }

        public final String toString() {
            return this.f7348f + "=" + this.f7349g;
        }

        public d(d<K, V> dVar, K k10, d<K, V> dVar2, d<K, V> dVar3) {
            this.f7344a = dVar;
            this.f7348f = k10;
            this.f7350h = 1;
            this.f7346d = dVar2;
            this.f7347e = dVar3;
            dVar3.f7346d = this;
            dVar2.f7347e = this;
        }
    }

    public final d<K, V> a(Map.Entry<?, ?> entry) {
        d<K, V> b10 = b(entry.getKey());
        boolean z10 = false;
        if (b10 != null) {
            V v10 = b10.f7349g;
            Object value = entry.getValue();
            if (v10 == value || (v10 != null && v10.equals(value))) {
                z10 = true;
            }
        }
        if (z10) {
            return b10;
        }
        return null;
    }

    public final void a(d<K, V> dVar, boolean z10) {
        int i10;
        if (z10) {
            d<K, V> dVar2 = dVar.f7347e;
            dVar2.f7346d = dVar.f7346d;
            dVar.f7346d.f7347e = dVar2;
        }
        d<K, V> dVar3 = dVar.f7345b;
        d<K, V> dVar4 = dVar.c;
        d<K, V> dVar5 = dVar.f7344a;
        int i11 = 0;
        if (dVar3 != null && dVar4 != null) {
            if (dVar3.f7350h > dVar4.f7350h) {
                d<K, V> dVar6 = dVar3.c;
                while (true) {
                    d<K, V> dVar7 = dVar6;
                    dVar4 = dVar3;
                    dVar3 = dVar7;
                    if (dVar3 == null) {
                        break;
                    }
                    dVar6 = dVar3.c;
                }
            } else {
                while (true) {
                    d<K, V> dVar8 = dVar4.f7345b;
                    if (dVar8 == null) {
                        break;
                    }
                    dVar4 = dVar8;
                }
            }
            a((d) dVar4, false);
            d<K, V> dVar9 = dVar.f7345b;
            if (dVar9 != null) {
                i10 = dVar9.f7350h;
                dVar4.f7345b = dVar9;
                dVar9.f7344a = dVar4;
                dVar.f7345b = null;
            } else {
                i10 = 0;
            }
            d<K, V> dVar10 = dVar.c;
            if (dVar10 != null) {
                i11 = dVar10.f7350h;
                dVar4.c = dVar10;
                dVar10.f7344a = dVar4;
                dVar.c = null;
            }
            dVar4.f7350h = Math.max(i10, i11) + 1;
            a(dVar, dVar4);
            return;
        }
        if (dVar3 != null) {
            a(dVar, dVar3);
            dVar.f7345b = null;
        } else if (dVar4 != null) {
            a(dVar, dVar4);
            dVar.c = null;
        } else {
            a(dVar, (d) null);
        }
        b(dVar5, false);
        this.c--;
        this.f7333d++;
    }

    private void b(d<K, V> dVar) {
        d<K, V> dVar2 = dVar.f7345b;
        d<K, V> dVar3 = dVar.c;
        d<K, V> dVar4 = dVar2.f7345b;
        d<K, V> dVar5 = dVar2.c;
        dVar.f7345b = dVar5;
        if (dVar5 != null) {
            dVar5.f7344a = dVar;
        }
        a(dVar, dVar2);
        dVar2.c = dVar;
        dVar.f7344a = dVar2;
        int max = Math.max(dVar3 != null ? dVar3.f7350h : 0, dVar5 != null ? dVar5.f7350h : 0) + 1;
        dVar.f7350h = max;
        dVar2.f7350h = Math.max(max, dVar4 != null ? dVar4.f7350h : 0) + 1;
    }

    public final d<K, V> a(Object obj) {
        d<K, V> b10 = b(obj);
        if (b10 != null) {
            a((d) b10, true);
        }
        return b10;
    }

    private void a(d<K, V> dVar, d<K, V> dVar2) {
        d<K, V> dVar3 = dVar.f7344a;
        dVar.f7344a = null;
        if (dVar2 != null) {
            dVar2.f7344a = dVar3;
        }
        if (dVar3 != null) {
            if (dVar3.f7345b == dVar) {
                dVar3.f7345b = dVar2;
                return;
            } else if (!f7329f && dVar3.c != dVar) {
                throw new AssertionError();
            } else {
                dVar3.c = dVar2;
                return;
            }
        }
        this.f7332b = dVar2;
    }

    private void a(d<K, V> dVar) {
        d<K, V> dVar2 = dVar.f7345b;
        d<K, V> dVar3 = dVar.c;
        d<K, V> dVar4 = dVar3.f7345b;
        d<K, V> dVar5 = dVar3.c;
        dVar.c = dVar4;
        if (dVar4 != null) {
            dVar4.f7344a = dVar;
        }
        a(dVar, dVar3);
        dVar3.f7345b = dVar;
        dVar.f7344a = dVar3;
        int max = Math.max(dVar2 != null ? dVar2.f7350h : 0, dVar4 != null ? dVar4.f7350h : 0) + 1;
        dVar.f7350h = max;
        dVar3.f7350h = Math.max(max, dVar5 != null ? dVar5.f7350h : 0) + 1;
    }
}
