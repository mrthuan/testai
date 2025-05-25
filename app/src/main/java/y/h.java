package y;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: MapCollections.java */
/* loaded from: classes.dex */
public abstract class h<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public h<K, V>.b f31926a;

    /* renamed from: b  reason: collision with root package name */
    public h<K, V>.c f31927b;
    public h<K, V>.e c;

    /* compiled from: MapCollections.java */
    /* loaded from: classes.dex */
    public final class a<T> implements Iterator<T> {

        /* renamed from: a  reason: collision with root package name */
        public final int f31928a;

        /* renamed from: b  reason: collision with root package name */
        public int f31929b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f31930d = false;

        public a(int i10) {
            this.f31928a = i10;
            this.f31929b = h.this.d();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.c < this.f31929b) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (hasNext()) {
                T t4 = (T) h.this.b(this.c, this.f31928a);
                this.c++;
                this.f31930d = true;
                return t4;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (this.f31930d) {
                int i10 = this.c - 1;
                this.c = i10;
                this.f31929b--;
                this.f31930d = false;
                h.this.h(i10);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* compiled from: MapCollections.java */
    /* loaded from: classes.dex */
    public final class b implements Set<Map.Entry<K, V>> {
        public b() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            h hVar = h.this;
            int d10 = hVar.d();
            for (Map.Entry<K, V> entry : collection) {
                hVar.g(entry.getKey(), entry.getValue());
            }
            if (d10 != hVar.d()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            h.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            h hVar = h.this;
            int e10 = hVar.e(key);
            if (e10 < 0) {
                return false;
            }
            Object b10 = hVar.b(e10, 1);
            Object value = entry.getValue();
            if (b10 != value && (b10 == null || !b10.equals(value))) {
                return false;
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            return h.j(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            int hashCode;
            int hashCode2;
            h hVar = h.this;
            int i10 = 0;
            for (int d10 = hVar.d() - 1; d10 >= 0; d10--) {
                Object b10 = hVar.b(d10, 0);
                Object b11 = hVar.b(d10, 1);
                if (b10 == null) {
                    hashCode = 0;
                } else {
                    hashCode = b10.hashCode();
                }
                if (b11 == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = b11.hashCode();
                }
                i10 += hashCode ^ hashCode2;
            }
            return i10;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            if (h.this.d() == 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return h.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: MapCollections.java */
    /* loaded from: classes.dex */
    public final class c implements Set<K> {
        public c() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(K k10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            h.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            if (h.this.e(obj) >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Map<K, V> c = h.this.c();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!c.containsKey(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            return h.j(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            int hashCode;
            h hVar = h.this;
            int i10 = 0;
            for (int d10 = hVar.d() - 1; d10 >= 0; d10--) {
                Object b10 = hVar.b(d10, 0);
                if (b10 == null) {
                    hashCode = 0;
                } else {
                    hashCode = b10.hashCode();
                }
                i10 += hashCode;
            }
            return i10;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            if (h.this.d() == 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator<K> iterator() {
            return new a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            h hVar = h.this;
            int e10 = hVar.e(obj);
            if (e10 >= 0) {
                hVar.h(e10);
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            Map<K, V> c = h.this.c();
            int size = c.size();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                c.remove(it.next());
            }
            if (size != c.size()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            return h.k(h.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return h.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) h.this.l(0, tArr);
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            h hVar = h.this;
            int d10 = hVar.d();
            Object[] objArr = new Object[d10];
            for (int i10 = 0; i10 < d10; i10++) {
                objArr[i10] = hVar.b(i10, 0);
            }
            return objArr;
        }
    }

    /* compiled from: MapCollections.java */
    /* loaded from: classes.dex */
    public final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public int f31934a;
        public boolean c = false;

        /* renamed from: b  reason: collision with root package name */
        public int f31935b = -1;

        public d() {
            this.f31934a = h.this.d() - 1;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            boolean z10;
            boolean z11;
            if (this.c) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                int i10 = this.f31935b;
                h hVar = h.this;
                Object b10 = hVar.b(i10, 0);
                if (key != b10 && (key == null || !key.equals(b10))) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!z10) {
                    return false;
                }
                Object value = entry.getValue();
                Object b11 = hVar.b(this.f31935b, 1);
                if (value != b11 && (value == null || !value.equals(b11))) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z11) {
                    return false;
                }
                return true;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            if (this.c) {
                return (K) h.this.b(this.f31935b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            if (this.c) {
                return (V) h.this.b(this.f31935b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f31935b < this.f31934a) {
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            int hashCode;
            if (this.c) {
                int i10 = this.f31935b;
                h hVar = h.this;
                int i11 = 0;
                Object b10 = hVar.b(i10, 0);
                Object b11 = hVar.b(this.f31935b, 1);
                if (b10 == null) {
                    hashCode = 0;
                } else {
                    hashCode = b10.hashCode();
                }
                if (b11 != null) {
                    i11 = b11.hashCode();
                }
                return hashCode ^ i11;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (hasNext()) {
                this.f31935b++;
                this.c = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (this.c) {
                h.this.h(this.f31935b);
                this.f31935b--;
                this.f31934a--;
                this.c = false;
                return;
            }
            throw new IllegalStateException();
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            if (this.c) {
                return (V) h.this.i(this.f31935b, v10);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* compiled from: MapCollections.java */
    /* loaded from: classes.dex */
    public final class e implements Collection<V> {
        public e() {
        }

        @Override // java.util.Collection
        public final boolean add(V v10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final void clear() {
            h.this.a();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            if (h.this.f(obj) >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            if (h.this.d() == 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new a(1);
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            h hVar = h.this;
            int f10 = hVar.f(obj);
            if (f10 >= 0) {
                hVar.h(f10);
                return true;
            }
            return false;
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            h hVar = h.this;
            int d10 = hVar.d();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < d10) {
                if (collection.contains(hVar.b(i10, 1))) {
                    hVar.h(i10);
                    i10--;
                    d10--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            h hVar = h.this;
            int d10 = hVar.d();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < d10) {
                if (!collection.contains(hVar.b(i10, 1))) {
                    hVar.h(i10);
                    i10--;
                    d10--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public final int size() {
            return h.this.d();
        }

        @Override // java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) h.this.l(1, tArr);
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            h hVar = h.this;
            int d10 = hVar.d();
            Object[] objArr = new Object[d10];
            for (int i10 = 0; i10 < d10; i10++) {
                objArr[i10] = hVar.b(i10, 1);
            }
            return objArr;
        }
    }

    public static <T> boolean j(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <K, V> boolean k(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        if (size != map.size()) {
            return true;
        }
        return false;
    }

    public abstract void a();

    public abstract Object b(int i10, int i11);

    public abstract Map<K, V> c();

    public abstract int d();

    public abstract int e(Object obj);

    public abstract int f(Object obj);

    public abstract void g(K k10, V v10);

    public abstract void h(int i10);

    public abstract V i(int i10, V v10);

    public final Object[] l(int i10, Object[] objArr) {
        int d10 = d();
        if (objArr.length < d10) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), d10);
        }
        for (int i11 = 0; i11 < d10; i11++) {
            objArr[i11] = b(i11, i10);
        }
        if (objArr.length > d10) {
            objArr[d10] = null;
        }
        return objArr;
    }
}
