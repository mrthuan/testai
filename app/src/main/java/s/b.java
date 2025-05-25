package s;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: SafeIterableMap.java */
/* loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: a  reason: collision with root package name */
    public c<K, V> f29679a;

    /* renamed from: b  reason: collision with root package name */
    public c<K, V> f29680b;
    public final WeakHashMap<f<K, V>, Boolean> c = new WeakHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public int f29681d = 0;

    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    public static class a<K, V> extends e<K, V> {
        @Override // s.b.e
        public final c<K, V> b(c<K, V> cVar) {
            return cVar.f29684d;
        }

        @Override // s.b.e
        public final c<K, V> c(c<K, V> cVar) {
            return cVar.c;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* renamed from: s.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0371b<K, V> extends e<K, V> {
        @Override // s.b.e
        public final c<K, V> b(c<K, V> cVar) {
            return cVar.c;
        }

        @Override // s.b.e
        public final c<K, V> c(c<K, V> cVar) {
            return cVar.f29684d;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final K f29682a;

        /* renamed from: b  reason: collision with root package name */
        public final V f29683b;
        public c<K, V> c;

        /* renamed from: d  reason: collision with root package name */
        public c<K, V> f29684d;

        public c(K k10, V v10) {
            this.f29682a = k10;
            this.f29683b = v10;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f29682a.equals(cVar.f29682a) && this.f29683b.equals(cVar.f29683b)) {
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f29682a;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f29683b;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            return this.f29682a.hashCode() ^ this.f29683b.hashCode();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public final String toString() {
            return this.f29682a + "=" + this.f29683b;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        public c<K, V> f29685a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f29686b = true;

        public d() {
        }

        @Override // s.b.f
        public final void a(c<K, V> cVar) {
            boolean z10;
            c<K, V> cVar2 = this.f29685a;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f29684d;
                this.f29685a = cVar3;
                if (cVar3 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f29686b = z10;
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f29686b) {
                if (b.this.f29679a != null) {
                    return true;
                }
                return false;
            }
            c<K, V> cVar = this.f29685a;
            if (cVar != null && cVar.c != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            c<K, V> cVar;
            if (this.f29686b) {
                this.f29686b = false;
                this.f29685a = b.this.f29679a;
            } else {
                c<K, V> cVar2 = this.f29685a;
                if (cVar2 != null) {
                    cVar = cVar2.c;
                } else {
                    cVar = null;
                }
                this.f29685a = cVar;
            }
            return this.f29685a;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    public static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        public c<K, V> f29687a;

        /* renamed from: b  reason: collision with root package name */
        public c<K, V> f29688b;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.f29687a = cVar2;
            this.f29688b = cVar;
        }

        @Override // s.b.f
        public final void a(c<K, V> cVar) {
            c<K, V> cVar2 = null;
            if (this.f29687a == cVar && cVar == this.f29688b) {
                this.f29688b = null;
                this.f29687a = null;
            }
            c<K, V> cVar3 = this.f29687a;
            if (cVar3 == cVar) {
                this.f29687a = b(cVar3);
            }
            c<K, V> cVar4 = this.f29688b;
            if (cVar4 == cVar) {
                c<K, V> cVar5 = this.f29687a;
                if (cVar4 != cVar5 && cVar5 != null) {
                    cVar2 = c(cVar4);
                }
                this.f29688b = cVar2;
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f29688b != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            c<K, V> cVar;
            c<K, V> cVar2 = this.f29688b;
            c<K, V> cVar3 = this.f29687a;
            if (cVar2 != cVar3 && cVar3 != null) {
                cVar = c(cVar2);
            } else {
                cVar = null;
            }
            this.f29688b = cVar;
            return cVar2;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    public static abstract class f<K, V> {
        public abstract void a(c<K, V> cVar);
    }

    public c<K, V> a(K k10) {
        c<K, V> cVar = this.f29679a;
        while (cVar != null && !cVar.f29682a.equals(k10)) {
            cVar = cVar.c;
        }
        return cVar;
    }

    public V b(K k10, V v10) {
        c<K, V> a10 = a(k10);
        if (a10 != null) {
            return a10.f29683b;
        }
        c<K, V> cVar = new c<>(k10, v10);
        this.f29681d++;
        c<K, V> cVar2 = this.f29680b;
        if (cVar2 == null) {
            this.f29679a = cVar;
            this.f29680b = cVar;
            return null;
        }
        cVar2.c = cVar;
        cVar.f29684d = cVar2;
        this.f29680b = cVar;
        return null;
    }

    public V c(K k10) {
        c<K, V> a10 = a(k10);
        if (a10 == null) {
            return null;
        }
        this.f29681d--;
        WeakHashMap<f<K, V>, Boolean> weakHashMap = this.c;
        if (!weakHashMap.isEmpty()) {
            for (f<K, V> fVar : weakHashMap.keySet()) {
                fVar.a(a10);
            }
        }
        c<K, V> cVar = a10.f29684d;
        if (cVar != null) {
            cVar.c = a10.c;
        } else {
            this.f29679a = a10.c;
        }
        c<K, V> cVar2 = a10.c;
        if (cVar2 != null) {
            cVar2.f29684d = cVar;
        } else {
            this.f29680b = cVar;
        }
        a10.c = null;
        a10.f29684d = null;
        return a10.f29683b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
        if (r3.hasNext() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
        if (((s.b.e) r7).hasNext() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof s.b
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            s.b r7 = (s.b) r7
            int r1 = r6.f29681d
            int r3 = r7.f29681d
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            s.b$e r3 = (s.b.e) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            s.b$e r4 = (s.b.e) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            s.b$e r7 = (s.b.e) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            goto L54
        L53:
            r0 = r2
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s.b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i10 = 0;
        while (true) {
            e eVar = (e) it;
            if (eVar.hasNext()) {
                i10 += ((Map.Entry) eVar.next()).hashCode();
            } else {
                return i10;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f29679a, this.f29680b);
        this.c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (true) {
            e eVar = (e) it;
            if (eVar.hasNext()) {
                sb2.append(((Map.Entry) eVar.next()).toString());
                if (eVar.hasNext()) {
                    sb2.append(", ");
                }
            } else {
                sb2.append("]");
                return sb2.toString();
            }
        }
    }
}
