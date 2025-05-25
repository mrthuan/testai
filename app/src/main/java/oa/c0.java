package oa;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: ImmutableList.java */
/* loaded from: classes2.dex */
public final class c0<E> implements List<E>, RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    public final List<E> f22926a;

    public c0(List<E> list) {
        this.f22926a = Collections.unmodifiableList(list);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(E e10) {
        return this.f22926a.add(e10);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        return this.f22926a.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f22926a.clear();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f22926a.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        return this.f22926a.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        return this.f22926a.equals(obj);
    }

    @Override // java.util.List
    public final E get(int i10) {
        return this.f22926a.get(i10);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f22926a.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f22926a.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f22926a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return this.f22926a.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return this.f22926a.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator<E> listIterator() {
        return this.f22926a.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f22926a.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        return this.f22926a.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        return this.f22926a.retainAll(collection);
    }

    @Override // java.util.List
    public final E set(int i10, E e10) {
        return this.f22926a.set(i10, e10);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f22926a.size();
    }

    @Override // java.util.List
    public final List<E> subList(int i10, int i11) {
        return this.f22926a.subList(i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return this.f22926a.toArray();
    }

    @Override // java.util.List
    public final void add(int i10, E e10) {
        this.f22926a.add(i10, e10);
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        return this.f22926a.addAll(i10, collection);
    }

    @Override // java.util.List
    public final ListIterator<E> listIterator(int i10) {
        return this.f22926a.listIterator(i10);
    }

    @Override // java.util.List
    public final E remove(int i10) {
        return this.f22926a.remove(i10);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) this.f22926a.toArray(tArr);
    }
}
