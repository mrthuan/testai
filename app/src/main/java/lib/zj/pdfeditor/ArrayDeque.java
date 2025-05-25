package lib.zj.pdfeditor;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

/* loaded from: classes3.dex */
public class ArrayDeque<E> extends AbstractCollection<E> implements Queue, Cloneable, Serializable {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f21129d = 0;
    private static final long serialVersionUID = 2340985798034038923L;

    /* renamed from: a  reason: collision with root package name */
    public transient Object[] f21130a;

    /* renamed from: b  reason: collision with root package name */
    public transient int f21131b;
    public transient int c;

    /* loaded from: classes3.dex */
    public class a implements Iterator<E> {

        /* renamed from: a  reason: collision with root package name */
        public int f21132a;

        /* renamed from: b  reason: collision with root package name */
        public int f21133b;
        public int c = -1;

        public a() {
            this.f21132a = ArrayDeque.this.f21131b;
            this.f21133b = ArrayDeque.this.c;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f21132a != this.f21133b) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final E next() {
            int i10 = this.f21132a;
            int i11 = this.f21133b;
            if (i10 != i11) {
                ArrayDeque arrayDeque = ArrayDeque.this;
                Object[] objArr = arrayDeque.f21130a;
                E e10 = (E) objArr[i10];
                if (arrayDeque.c == i11 && e10 != null) {
                    this.c = i10;
                    this.f21132a = (i10 + 1) & (objArr.length - 1);
                    return e10;
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            int i10 = this.c;
            if (i10 >= 0) {
                int i11 = ArrayDeque.f21129d;
                ArrayDeque arrayDeque = ArrayDeque.this;
                if (arrayDeque.d(i10)) {
                    this.f21132a = (this.f21132a - 1) & (arrayDeque.f21130a.length - 1);
                    this.f21133b = arrayDeque.c;
                }
                this.c = -1;
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* loaded from: classes3.dex */
    public class b implements Iterator<E> {

        /* renamed from: a  reason: collision with root package name */
        public int f21135a;

        /* renamed from: b  reason: collision with root package name */
        public int f21136b;
        public int c = -1;

        public b() {
            this.f21135a = ArrayDeque.this.c;
            this.f21136b = ArrayDeque.this.f21131b;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f21135a != this.f21136b) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public final E next() {
            int i10 = this.f21135a;
            int i11 = this.f21136b;
            if (i10 != i11) {
                ArrayDeque arrayDeque = ArrayDeque.this;
                Object[] objArr = arrayDeque.f21130a;
                int length = (i10 - 1) & (objArr.length - 1);
                this.f21135a = length;
                E e10 = (E) objArr[length];
                if (arrayDeque.f21131b == i11 && e10 != null) {
                    this.c = length;
                    return e10;
                }
                throw new ConcurrentModificationException();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            int i10 = this.c;
            if (i10 >= 0) {
                int i11 = ArrayDeque.f21129d;
                ArrayDeque arrayDeque = ArrayDeque.this;
                if (!arrayDeque.d(i10)) {
                    this.f21135a = (this.f21135a + 1) & (arrayDeque.f21130a.length - 1);
                    this.f21136b = arrayDeque.f21131b;
                }
                this.c = -1;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public ArrayDeque() {
        this.f21130a = new Object[16];
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        a(readInt);
        this.f21131b = 0;
        this.c = readInt;
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f21130a[i10] = objectInputStream.readObject();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        int length = this.f21130a.length - 1;
        for (int i10 = this.f21131b; i10 != this.c; i10 = (i10 + 1) & length) {
            objectOutputStream.writeObject(this.f21130a[i10]);
        }
    }

    public final void a(int i10) {
        int i11 = 8;
        if (i10 >= 8) {
            int i12 = i10 | (i10 >>> 1);
            int i13 = i12 | (i12 >>> 2);
            int i14 = i13 | (i13 >>> 4);
            int i15 = i14 | (i14 >>> 8);
            i11 = (i15 | (i15 >>> 16)) + 1;
            if (i11 < 0) {
                i11 >>>= 1;
            }
        }
        this.f21130a = new Object[i11];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public boolean add(E e10) {
        addLast(e10);
        return true;
    }

    public void addFirst(E e10) {
        if (e10 != null) {
            Object[] objArr = this.f21130a;
            int length = (this.f21131b - 1) & (objArr.length - 1);
            this.f21131b = length;
            objArr[length] = e10;
            if (length == this.c) {
                e();
                return;
            }
            return;
        }
        throw new NullPointerException("e == null");
    }

    public void addLast(E e10) {
        if (e10 != null) {
            Object[] objArr = this.f21130a;
            int i10 = this.c;
            objArr[i10] = e10;
            int length = (objArr.length - 1) & (i10 + 1);
            this.c = length;
            if (length == this.f21131b) {
                e();
                return;
            }
            return;
        }
        throw new NullPointerException("e == null");
    }

    public final void c(Object[] objArr) {
        int i10 = this.f21131b;
        int i11 = this.c;
        if (i10 < i11) {
            System.arraycopy(this.f21130a, i10, objArr, 0, size());
        } else if (i10 > i11) {
            Object[] objArr2 = this.f21130a;
            int length = objArr2.length - i10;
            System.arraycopy(objArr2, i10, objArr, 0, length);
            System.arraycopy(this.f21130a, 0, objArr, length, this.c);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        int i10 = this.f21131b;
        int i11 = this.c;
        if (i10 != i11) {
            this.c = 0;
            this.f21131b = 0;
            int length = this.f21130a.length - 1;
            do {
                this.f21130a[i10] = null;
                i10 = (i10 + 1) & length;
            } while (i10 != i11);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        int length = this.f21130a.length - 1;
        int i10 = this.f21131b;
        while (true) {
            Object obj2 = this.f21130a[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj.equals(obj2)) {
                return true;
            }
            i10 = (i10 + 1) & length;
        }
    }

    public final boolean d(int i10) {
        Object[] objArr = this.f21130a;
        int length = objArr.length - 1;
        int i11 = this.f21131b;
        int i12 = this.c;
        int i13 = (i10 - i11) & length;
        int i14 = (i12 - i10) & length;
        if (i13 < ((i12 - i11) & length)) {
            if (i13 < i14) {
                if (i11 <= i10) {
                    System.arraycopy(objArr, i11, objArr, i11 + 1, i13);
                } else {
                    System.arraycopy(objArr, 0, objArr, 1, i10);
                    objArr[0] = objArr[length];
                    System.arraycopy(objArr, i11, objArr, i11 + 1, length - i11);
                }
                objArr[i11] = null;
                this.f21131b = (i11 + 1) & length;
                return false;
            }
            if (i10 < i12) {
                System.arraycopy(objArr, i10 + 1, objArr, i10, i14);
                this.c = i12 - 1;
            } else {
                System.arraycopy(objArr, i10 + 1, objArr, i10, length - i10);
                objArr[length] = objArr[0];
                System.arraycopy(objArr, 1, objArr, 0, i12);
                this.c = (i12 - 1) & length;
            }
            return true;
        }
        throw new ConcurrentModificationException();
    }

    public Iterator<E> descendingIterator() {
        return new b();
    }

    public final void e() {
        int i10 = this.f21131b;
        Object[] objArr = this.f21130a;
        int length = objArr.length;
        int i11 = length - i10;
        int i12 = length << 1;
        if (i12 >= 0) {
            Object[] objArr2 = new Object[i12];
            System.arraycopy(objArr, i10, objArr2, 0, i11);
            System.arraycopy(this.f21130a, 0, objArr2, i11, i10);
            this.f21130a = objArr2;
            this.f21131b = 0;
            this.c = length;
            return;
        }
        throw new IllegalStateException("Sorry, deque too big");
    }

    @Override // java.util.Queue
    public E element() {
        return getFirst();
    }

    public E getFirst() {
        E e10 = (E) this.f21130a[this.f21131b];
        if (e10 != null) {
            return e10;
        }
        throw new NoSuchElementException();
    }

    public E getLast() {
        Object[] objArr = this.f21130a;
        E e10 = (E) objArr[(this.c - 1) & (objArr.length - 1)];
        if (e10 != null) {
            return e10;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        if (this.f21131b == this.c) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new a();
    }

    @Override // java.util.Queue
    public boolean offer(E e10) {
        return offerLast(e10);
    }

    public boolean offerFirst(E e10) {
        addFirst(e10);
        return true;
    }

    public boolean offerLast(E e10) {
        addLast(e10);
        return true;
    }

    @Override // java.util.Queue
    public E peek() {
        return peekFirst();
    }

    public E peekFirst() {
        return (E) this.f21130a[this.f21131b];
    }

    public E peekLast() {
        Object[] objArr = this.f21130a;
        return (E) objArr[(this.c - 1) & (objArr.length - 1)];
    }

    @Override // java.util.Queue
    public E poll() {
        return pollFirst();
    }

    public E pollFirst() {
        int i10 = this.f21131b;
        Object[] objArr = this.f21130a;
        E e10 = (E) objArr[i10];
        if (e10 == null) {
            return null;
        }
        objArr[i10] = null;
        this.f21131b = (i10 + 1) & (objArr.length - 1);
        return e10;
    }

    public E pollLast() {
        Object[] objArr = this.f21130a;
        int length = (this.c - 1) & (objArr.length - 1);
        E e10 = (E) objArr[length];
        if (e10 == null) {
            return null;
        }
        objArr[length] = null;
        this.c = length;
        return e10;
    }

    public E pop() {
        return removeFirst();
    }

    public void push(E e10) {
        addFirst(e10);
    }

    @Override // java.util.Queue
    public E remove() {
        return removeFirst();
    }

    public E removeFirst() {
        E pollFirst = pollFirst();
        if (pollFirst != null) {
            return pollFirst;
        }
        throw new NoSuchElementException();
    }

    public boolean removeFirstOccurrence(Object obj) {
        if (obj == null) {
            return false;
        }
        int length = this.f21130a.length - 1;
        int i10 = this.f21131b;
        while (true) {
            Object obj2 = this.f21130a[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj.equals(obj2)) {
                d(i10);
                return true;
            }
            i10 = (i10 + 1) & length;
        }
    }

    public E removeLast() {
        E pollLast = pollLast();
        if (pollLast != null) {
            return pollLast;
        }
        throw new NoSuchElementException();
    }

    public boolean removeLastOccurrence(Object obj) {
        if (obj == null) {
            return false;
        }
        int length = this.f21130a.length - 1;
        int i10 = this.c - 1;
        while (true) {
            int i11 = i10 & length;
            Object obj2 = this.f21130a[i11];
            if (obj2 == null) {
                return false;
            }
            if (obj.equals(obj2)) {
                d(i11);
                return true;
            }
            i10 = i11 - 1;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return (this.c - this.f21131b) & (this.f21130a.length - 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        Object[] objArr = new Object[size()];
        c(objArr);
        return objArr;
    }

    public ArrayDeque<E> clone() {
        try {
            ArrayDeque<E> arrayDeque = (ArrayDeque) super.clone();
            Object[] objArr = this.f21130a;
            arrayDeque.f21130a = Arrays.copyOf(objArr, objArr.length);
            return arrayDeque;
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return removeFirstOccurrence(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        int size = size();
        if (tArr.length < size) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
        }
        c(tArr);
        if (tArr.length > size) {
            tArr[size] = null;
        }
        return tArr;
    }

    public ArrayDeque(int i10) {
        a(i10);
    }

    public ArrayDeque(Collection<? extends E> collection) {
        a(collection.size());
        addAll(collection);
    }
}
