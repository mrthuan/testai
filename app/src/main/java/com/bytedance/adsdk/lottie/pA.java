package com.bytedance.adsdk.lottie;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: MapCollections.java */
/* loaded from: classes.dex */
abstract class pA<K, V> {
    pA<K, V>.cJ cJ;

    /* compiled from: MapCollections.java */
    /* loaded from: classes.dex */
    public final class Qhi<T> implements Iterator<T> {
        boolean CJ = false;
        final int Qhi;

        /* renamed from: ac  reason: collision with root package name */
        int f7868ac;
        int cJ;

        public Qhi(int i10) {
            this.Qhi = i10;
            this.cJ = pA.this.Qhi();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f7868ac < this.cJ) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                T t4 = (T) pA.this.Qhi(this.f7868ac, this.Qhi);
                this.f7868ac++;
                this.CJ = true;
                return t4;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.CJ) {
                int i10 = this.f7868ac - 1;
                this.f7868ac = i10;
                this.cJ--;
                this.CJ = false;
                pA.this.Qhi(i10);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* compiled from: MapCollections.java */
    /* loaded from: classes.dex */
    public final class cJ implements Set<K> {
        public cJ() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            pA.this.ac();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (pA.this.Qhi(obj) >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return pA.Qhi(pA.this.cJ(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return pA.Qhi(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int hashCode;
            int i10 = 0;
            for (int Qhi = pA.this.Qhi() - 1; Qhi >= 0; Qhi--) {
                Object Qhi2 = pA.this.Qhi(Qhi, 0);
                if (Qhi2 == null) {
                    hashCode = 0;
                } else {
                    hashCode = Qhi2.hashCode();
                }
                i10 += hashCode;
            }
            return i10;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            if (pA.this.Qhi() == 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new Qhi(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int Qhi = pA.this.Qhi(obj);
            if (Qhi >= 0) {
                pA.this.Qhi(Qhi);
                return true;
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return pA.cJ(pA.this.cJ(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return pA.ac(pA.this.cJ(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return pA.this.Qhi();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return pA.this.cJ(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) pA.this.Qhi(tArr, 0);
        }
    }

    public static <K, V> boolean Qhi(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <K, V> boolean ac(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public static <K, V> boolean cJ(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    public Set<K> CJ() {
        if (this.cJ == null) {
            this.cJ = new cJ();
        }
        return this.cJ;
    }

    public abstract int Qhi();

    public abstract int Qhi(Object obj);

    public abstract Object Qhi(int i10, int i11);

    public abstract void Qhi(int i10);

    public abstract void ac();

    public abstract Map<K, V> cJ();

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T[] Qhi(T[] tArr, int i10) {
        int Qhi2 = Qhi();
        if (tArr.length < Qhi2) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), Qhi2));
        }
        for (int i11 = 0; i11 < Qhi2; i11++) {
            tArr[i11] = Qhi(i11, i10);
        }
        if (tArr.length > Qhi2) {
            tArr[Qhi2] = null;
        }
        return tArr;
    }

    public Object[] cJ(int i10) {
        int Qhi2 = Qhi();
        Object[] objArr = new Object[Qhi2];
        for (int i11 = 0; i11 < Qhi2; i11++) {
            objArr[i11] = Qhi(i11, i10);
        }
        return objArr;
    }

    public static <T> boolean Qhi(Set<T> set, Object obj) {
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
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }
}
