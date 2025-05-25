package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* compiled from: AbstractList.kt */
/* loaded from: classes.dex */
public abstract class b<E> extends AbstractCollection<E> implements List<E> {
    public static final a Companion = new a();

    /* compiled from: AbstractList.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static void a(int i10, int i11) {
            if (i10 >= 0 && i10 < i11) {
                return;
            }
            throw new IndexOutOfBoundsException(a0.d.b("index: ", i10, ", size: ", i11));
        }

        public static void b(int i10, int i11) {
            if (i10 >= 0 && i10 <= i11) {
                return;
            }
            throw new IndexOutOfBoundsException(a0.d.b("index: ", i10, ", size: ", i11));
        }
    }

    /* compiled from: AbstractList.kt */
    /* renamed from: kotlin.collections.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0270b implements Iterator<E>, dg.a {

        /* renamed from: a  reason: collision with root package name */
        public int f19918a;

        public C0270b() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f19918a < b.this.size()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final E next() {
            if (hasNext()) {
                int i10 = this.f19918a;
                this.f19918a = i10 + 1;
                return b.this.get(i10);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* compiled from: AbstractList.kt */
    /* loaded from: classes.dex */
    public class c extends b<E>.C0270b implements ListIterator<E> {
        public c(int i10) {
            super();
            a aVar = b.Companion;
            int size = b.this.size();
            aVar.getClass();
            a.b(i10, size);
            this.f19918a = i10;
        }

        @Override // java.util.ListIterator
        public final void add(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            if (this.f19918a > 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.f19918a;
        }

        @Override // java.util.ListIterator
        public final E previous() {
            if (hasPrevious()) {
                int i10 = this.f19918a - 1;
                this.f19918a = i10;
                return b.this.get(i10);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.f19918a - 1;
        }

        @Override // java.util.ListIterator
        public final void set(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* compiled from: AbstractList.kt */
    /* loaded from: classes.dex */
    public static final class d<E> extends b<E> implements RandomAccess {

        /* renamed from: a  reason: collision with root package name */
        public final b<E> f19920a;

        /* renamed from: b  reason: collision with root package name */
        public final int f19921b;
        public final int c;

        /* JADX WARN: Multi-variable type inference failed */
        public d(b<? extends E> list, int i10, int i11) {
            kotlin.jvm.internal.g.e(list, "list");
            this.f19920a = list;
            this.f19921b = i10;
            a aVar = b.Companion;
            int size = list.size();
            aVar.getClass();
            if (i10 >= 0 && i11 <= size) {
                if (i10 <= i11) {
                    this.c = i11 - i10;
                    return;
                }
                throw new IllegalArgumentException(a0.d.b("fromIndex: ", i10, " > toIndex: ", i11));
            }
            StringBuilder f10 = a0.d.f("fromIndex: ", i10, ", toIndex: ", i11, ", size: ");
            f10.append(size);
            throw new IndexOutOfBoundsException(f10.toString());
        }

        @Override // kotlin.collections.b, java.util.List
        public final E get(int i10) {
            b.Companion.getClass();
            a.a(i10, this.c);
            return this.f19920a.get(this.f19921b + i10);
        }

        @Override // kotlin.collections.b, kotlin.collections.AbstractCollection
        public final int getSize() {
            return this.c;
        }
    }

    @Override // java.util.List
    public void add(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection other = (Collection) obj;
        Companion.getClass();
        kotlin.jvm.internal.g.e(other, "other");
        if (size() != other.size()) {
            return false;
        }
        Iterator<E> it = other.iterator();
        for (E e10 : this) {
            if (!kotlin.jvm.internal.g.a(e10, it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract E get(int i10);

    @Override // kotlin.collections.AbstractCollection
    public abstract int getSize();

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int i10;
        Companion.getClass();
        int i11 = 1;
        for (E e10 : this) {
            int i12 = i11 * 31;
            if (e10 != null) {
                i10 = e10.hashCode();
            } else {
                i10 = 0;
            }
            i11 = i12 + i10;
        }
        return i11;
    }

    public int indexOf(E e10) {
        int i10 = 0;
        for (E e11 : this) {
            if (!kotlin.jvm.internal.g.a(e11, e10)) {
                i10++;
            } else {
                return i10;
            }
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new C0270b();
    }

    public int lastIndexOf(E e10) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (kotlin.jvm.internal.g.a(listIterator.previous(), e10)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return new c(0);
    }

    @Override // java.util.List
    public E remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public E set(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<E> subList(int i10, int i11) {
        return new d(this, i10, i11);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i10) {
        return new c(i10);
    }
}
