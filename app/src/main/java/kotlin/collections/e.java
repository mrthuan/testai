package kotlin.collections;

import com.google.android.gms.common.api.Api;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.b;

/* compiled from: ArrayDeque.kt */
/* loaded from: classes.dex */
public final class e<E> extends c<E> {

    /* renamed from: d  reason: collision with root package name */
    public static final Object[] f19924d = new Object[0];

    /* renamed from: a  reason: collision with root package name */
    public int f19925a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f19926b = f19924d;
    public int c;

    public final void a(int i10, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f19926b.length;
        while (i10 < length && it.hasNext()) {
            this.f19926b[i10] = it.next();
            i10++;
        }
        int i11 = this.f19925a;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f19926b[i12] = it.next();
        }
        this.c = collection.size() + this.c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e10) {
        addLast(e10);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> elements) {
        kotlin.jvm.internal.g.e(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        b(elements.size() + this.c);
        a(d(this.f19925a + this.c), elements);
        return true;
    }

    public final void addLast(E e10) {
        b(this.c + 1);
        this.f19926b[d(this.f19925a + this.c)] = e10;
        this.c++;
    }

    public final void b(int i10) {
        if (i10 >= 0) {
            Object[] objArr = this.f19926b;
            if (i10 <= objArr.length) {
                return;
            }
            if (objArr == f19924d) {
                if (i10 < 10) {
                    i10 = 10;
                }
                this.f19926b = new Object[i10];
                return;
            }
            int length = objArr.length;
            int i11 = length + (length >> 1);
            if (i11 - i10 < 0) {
                i11 = i10;
            }
            if (i11 - 2147483639 > 0) {
                if (i10 > 2147483639) {
                    i11 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                } else {
                    i11 = 2147483639;
                }
            }
            Object[] objArr2 = new Object[i11];
            f.y(objArr, 0, objArr2, this.f19925a, objArr.length);
            Object[] objArr3 = this.f19926b;
            int length2 = objArr3.length;
            int i12 = this.f19925a;
            f.y(objArr3, length2 - i12, objArr2, 0, i12);
            this.f19925a = 0;
            this.f19926b = objArr2;
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    public final int c(int i10) {
        Object[] objArr = this.f19926b;
        kotlin.jvm.internal.g.e(objArr, "<this>");
        if (i10 == objArr.length - 1) {
            return 0;
        }
        return i10 + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int d10 = d(this.f19925a + this.c);
        int i10 = this.f19925a;
        if (i10 < d10) {
            f.A(this.f19926b, i10, d10);
        } else if (!isEmpty()) {
            Object[] objArr = this.f19926b;
            f.A(objArr, this.f19925a, objArr.length);
            f.A(this.f19926b, 0, d10);
        }
        this.f19925a = 0;
        this.c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final int d(int i10) {
        Object[] objArr = this.f19926b;
        if (i10 >= objArr.length) {
            return i10 - objArr.length;
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i10) {
        b.a aVar = b.Companion;
        int i11 = this.c;
        aVar.getClass();
        b.a.a(i10, i11);
        return (E) this.f19926b[d(this.f19925a + i10)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i10;
        int d10 = d(this.f19925a + this.c);
        int i11 = this.f19925a;
        if (i11 < d10) {
            while (i11 < d10) {
                if (kotlin.jvm.internal.g.a(obj, this.f19926b[i11])) {
                    i10 = this.f19925a;
                } else {
                    i11++;
                }
            }
            return -1;
        } else if (i11 >= d10) {
            int length = this.f19926b.length;
            while (true) {
                if (i11 < length) {
                    if (kotlin.jvm.internal.g.a(obj, this.f19926b[i11])) {
                        i10 = this.f19925a;
                        break;
                    }
                    i11++;
                } else {
                    for (int i12 = 0; i12 < d10; i12++) {
                        if (kotlin.jvm.internal.g.a(obj, this.f19926b[i12])) {
                            i11 = i12 + this.f19926b.length;
                            i10 = this.f19925a;
                        }
                    }
                    return -1;
                }
            }
        } else {
            return -1;
        }
        return i11 - i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        if (this.c == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i10;
        int d10 = d(this.f19925a + this.c);
        int i11 = this.f19925a;
        if (i11 < d10) {
            length = d10 - 1;
            if (i11 <= length) {
                while (!kotlin.jvm.internal.g.a(obj, this.f19926b[length])) {
                    if (length != i11) {
                        length--;
                    }
                }
                i10 = this.f19925a;
                return length - i10;
            }
            return -1;
        }
        if (i11 > d10) {
            int i12 = d10 - 1;
            while (true) {
                if (-1 < i12) {
                    if (kotlin.jvm.internal.g.a(obj, this.f19926b[i12])) {
                        length = i12 + this.f19926b.length;
                        i10 = this.f19925a;
                        break;
                    }
                    i12--;
                } else {
                    Object[] objArr = this.f19926b;
                    kotlin.jvm.internal.g.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i13 = this.f19925a;
                    if (i13 <= length) {
                        while (!kotlin.jvm.internal.g.a(obj, this.f19926b[length])) {
                            if (length != i13) {
                                length--;
                            }
                        }
                        i10 = this.f19925a;
                    }
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<? extends Object> elements) {
        byte b10;
        int d10;
        kotlin.jvm.internal.g.e(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty()) {
            if (this.f19926b.length == 0) {
                b10 = 1;
            } else {
                b10 = 0;
            }
            if (b10 == 0) {
                int d11 = d(this.f19925a + this.c);
                int i10 = this.f19925a;
                if (i10 < d11) {
                    d10 = i10;
                    while (i10 < d11) {
                        Object obj = this.f19926b[i10];
                        if (!elements.contains(obj)) {
                            this.f19926b[d10] = obj;
                            d10++;
                        } else {
                            z10 = true;
                        }
                        i10++;
                    }
                    f.A(this.f19926b, d10, d11);
                } else {
                    int length = this.f19926b.length;
                    boolean z11 = false;
                    int i11 = i10;
                    while (i10 < length) {
                        Object[] objArr = this.f19926b;
                        Object obj2 = objArr[i10];
                        objArr[i10] = null;
                        if (!elements.contains(obj2)) {
                            this.f19926b[i11] = obj2;
                            i11++;
                        } else {
                            z11 = true;
                        }
                        i10++;
                    }
                    d10 = d(i11);
                    for (int i12 = 0; i12 < d11; i12++) {
                        Object[] objArr2 = this.f19926b;
                        Object obj3 = objArr2[i12];
                        objArr2[i12] = null;
                        if (!elements.contains(obj3)) {
                            this.f19926b[d10] = obj3;
                            d10 = c(d10);
                        } else {
                            z11 = true;
                        }
                    }
                    z10 = z11;
                }
                if (z10) {
                    int i13 = d10 - this.f19925a;
                    if (i13 < 0) {
                        i13 += this.f19926b.length;
                    }
                    this.c = i13;
                }
            }
        }
        return z10;
    }

    public final E removeFirst() {
        if (!isEmpty()) {
            Object[] objArr = this.f19926b;
            int i10 = this.f19925a;
            E e10 = (E) objArr[i10];
            objArr[i10] = null;
            this.f19925a = c(i10);
            this.c--;
            return e10;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<? extends Object> elements) {
        byte b10;
        int d10;
        kotlin.jvm.internal.g.e(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty()) {
            if (this.f19926b.length == 0) {
                b10 = 1;
            } else {
                b10 = 0;
            }
            if (b10 == 0) {
                int d11 = d(this.f19925a + this.c);
                int i10 = this.f19925a;
                if (i10 < d11) {
                    d10 = i10;
                    while (i10 < d11) {
                        Object obj = this.f19926b[i10];
                        if (elements.contains(obj)) {
                            this.f19926b[d10] = obj;
                            d10++;
                        } else {
                            z10 = true;
                        }
                        i10++;
                    }
                    f.A(this.f19926b, d10, d11);
                } else {
                    int length = this.f19926b.length;
                    boolean z11 = false;
                    int i11 = i10;
                    while (i10 < length) {
                        Object[] objArr = this.f19926b;
                        Object obj2 = objArr[i10];
                        objArr[i10] = null;
                        if (elements.contains(obj2)) {
                            this.f19926b[i11] = obj2;
                            i11++;
                        } else {
                            z11 = true;
                        }
                        i10++;
                    }
                    d10 = d(i11);
                    for (int i12 = 0; i12 < d11; i12++) {
                        Object[] objArr2 = this.f19926b;
                        Object obj3 = objArr2[i12];
                        objArr2[i12] = null;
                        if (elements.contains(obj3)) {
                            this.f19926b[d10] = obj3;
                            d10 = c(d10);
                        } else {
                            z11 = true;
                        }
                    }
                    z10 = z11;
                }
                if (z10) {
                    int i13 = d10 - this.f19925a;
                    if (i13 < 0) {
                        i13 += this.f19926b.length;
                    }
                    this.c = i13;
                }
            }
        }
        return z10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i10, E e10) {
        b.a aVar = b.Companion;
        int i11 = this.c;
        aVar.getClass();
        b.a.a(i10, i11);
        int d10 = d(this.f19925a + i10);
        Object[] objArr = this.f19926b;
        E e11 = (E) objArr[d10];
        objArr[d10] = e10;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.c]);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, E e10) {
        b.a aVar = b.Companion;
        int i11 = this.c;
        aVar.getClass();
        b.a.b(i10, i11);
        int i12 = this.c;
        if (i10 == i12) {
            addLast(e10);
        } else if (i10 == 0) {
            b(i12 + 1);
            int i13 = this.f19925a;
            if (i13 == 0) {
                Object[] objArr = this.f19926b;
                kotlin.jvm.internal.g.e(objArr, "<this>");
                i13 = objArr.length;
            }
            int i14 = i13 - 1;
            this.f19925a = i14;
            this.f19926b[i14] = e10;
            this.c++;
        } else {
            b(i12 + 1);
            int d10 = d(this.f19925a + i10);
            int i15 = this.c;
            if (i10 < ((i15 + 1) >> 1)) {
                if (d10 == 0) {
                    Object[] objArr2 = this.f19926b;
                    kotlin.jvm.internal.g.e(objArr2, "<this>");
                    d10 = objArr2.length;
                }
                int i16 = d10 - 1;
                int i17 = this.f19925a;
                if (i17 == 0) {
                    Object[] objArr3 = this.f19926b;
                    kotlin.jvm.internal.g.e(objArr3, "<this>");
                    i17 = objArr3.length;
                }
                int i18 = i17 - 1;
                int i19 = this.f19925a;
                if (i16 >= i19) {
                    Object[] objArr4 = this.f19926b;
                    objArr4[i18] = objArr4[i19];
                    f.y(objArr4, i19, objArr4, i19 + 1, i16 + 1);
                } else {
                    Object[] objArr5 = this.f19926b;
                    f.y(objArr5, i19 - 1, objArr5, i19, objArr5.length);
                    Object[] objArr6 = this.f19926b;
                    objArr6[objArr6.length - 1] = objArr6[0];
                    f.y(objArr6, 0, objArr6, 1, i16 + 1);
                }
                this.f19926b[i16] = e10;
                this.f19925a = i18;
            } else {
                int d11 = d(this.f19925a + i15);
                if (d10 < d11) {
                    Object[] objArr7 = this.f19926b;
                    f.y(objArr7, d10 + 1, objArr7, d10, d11);
                } else {
                    Object[] objArr8 = this.f19926b;
                    f.y(objArr8, 1, objArr8, 0, d11);
                    Object[] objArr9 = this.f19926b;
                    objArr9[0] = objArr9[objArr9.length - 1];
                    f.y(objArr9, d10 + 1, objArr9, d10, objArr9.length - 1);
                }
                this.f19926b[d10] = e10;
            }
            this.c++;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.g.e(array, "array");
        int length = array.length;
        int i10 = this.c;
        if (length < i10) {
            Object newInstance = Array.newInstance(array.getClass().getComponentType(), i10);
            kotlin.jvm.internal.g.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (T[]) ((Object[]) newInstance);
        }
        int d10 = d(this.f19925a + this.c);
        int i11 = this.f19925a;
        if (i11 < d10) {
            f.y(this.f19926b, 0, array, i11, d10);
        } else if (!isEmpty()) {
            Object[] objArr = this.f19926b;
            f.y(objArr, 0, array, this.f19925a, objArr.length);
            Object[] objArr2 = this.f19926b;
            f.y(objArr2, objArr2.length - this.f19925a, array, 0, d10);
        }
        int length2 = array.length;
        int i12 = this.c;
        if (length2 > i12) {
            array[i12] = null;
        }
        return array;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection<? extends E> elements) {
        kotlin.jvm.internal.g.e(elements, "elements");
        b.a aVar = b.Companion;
        int i11 = this.c;
        aVar.getClass();
        b.a.b(i10, i11);
        if (elements.isEmpty()) {
            return false;
        }
        int i12 = this.c;
        if (i10 == i12) {
            return addAll(elements);
        }
        b(elements.size() + i12);
        int d10 = d(this.f19925a + this.c);
        int d11 = d(this.f19925a + i10);
        int size = elements.size();
        if (i10 < ((this.c + 1) >> 1)) {
            int i13 = this.f19925a;
            int i14 = i13 - size;
            if (d11 < i13) {
                Object[] objArr = this.f19926b;
                f.y(objArr, i14, objArr, i13, objArr.length);
                if (size >= d11) {
                    Object[] objArr2 = this.f19926b;
                    f.y(objArr2, objArr2.length - size, objArr2, 0, d11);
                } else {
                    Object[] objArr3 = this.f19926b;
                    f.y(objArr3, objArr3.length - size, objArr3, 0, size);
                    Object[] objArr4 = this.f19926b;
                    f.y(objArr4, 0, objArr4, size, d11);
                }
            } else if (i14 >= 0) {
                Object[] objArr5 = this.f19926b;
                f.y(objArr5, i14, objArr5, i13, d11);
            } else {
                Object[] objArr6 = this.f19926b;
                i14 += objArr6.length;
                int i15 = d11 - i13;
                int length = objArr6.length - i14;
                if (length >= i15) {
                    f.y(objArr6, i14, objArr6, i13, d11);
                } else {
                    f.y(objArr6, i14, objArr6, i13, i13 + length);
                    Object[] objArr7 = this.f19926b;
                    f.y(objArr7, 0, objArr7, this.f19925a + length, d11);
                }
            }
            this.f19925a = i14;
            int i16 = d11 - size;
            if (i16 < 0) {
                i16 += this.f19926b.length;
            }
            a(i16, elements);
        } else {
            int i17 = d11 + size;
            if (d11 < d10) {
                int i18 = size + d10;
                Object[] objArr8 = this.f19926b;
                if (i18 <= objArr8.length) {
                    f.y(objArr8, i17, objArr8, d11, d10);
                } else if (i17 >= objArr8.length) {
                    f.y(objArr8, i17 - objArr8.length, objArr8, d11, d10);
                } else {
                    int length2 = d10 - (i18 - objArr8.length);
                    f.y(objArr8, 0, objArr8, length2, d10);
                    Object[] objArr9 = this.f19926b;
                    f.y(objArr9, i17, objArr9, d11, length2);
                }
            } else {
                Object[] objArr10 = this.f19926b;
                f.y(objArr10, size, objArr10, 0, d10);
                Object[] objArr11 = this.f19926b;
                if (i17 >= objArr11.length) {
                    f.y(objArr11, i17 - objArr11.length, objArr11, d11, objArr11.length);
                } else {
                    f.y(objArr11, 0, objArr11, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f19926b;
                    f.y(objArr12, i17, objArr12, d11, objArr12.length - size);
                }
            }
            a(d11, elements);
        }
        return true;
    }
}
