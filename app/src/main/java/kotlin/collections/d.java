package kotlin.collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: Collections.kt */
/* loaded from: classes.dex */
public final class d<T> implements Collection<T>, dg.a {

    /* renamed from: a  reason: collision with root package name */
    public final T[] f19922a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f19923b;

    public d(T[] values, boolean z10) {
        kotlin.jvm.internal.g.e(values, "values");
        this.f19922a = values;
        this.f19923b = z10;
    }

    @Override // java.util.Collection
    public final boolean add(T t4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return f.w(obj, this.f19922a);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<? extends Object> elements) {
        kotlin.jvm.internal.g.e(elements, "elements");
        Collection<? extends Object> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        if (this.f19922a.length == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        T[] array = this.f19922a;
        kotlin.jvm.internal.g.e(array, "array");
        return new kotlin.jvm.internal.a(array);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f19922a.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        T[] tArr = this.f19922a;
        kotlin.jvm.internal.g.e(tArr, "<this>");
        if (this.f19923b && kotlin.jvm.internal.g.a(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        kotlin.jvm.internal.g.d(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return copyOf;
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.g.e(array, "array");
        return (T[]) ge.a.e0(this, array);
    }
}
