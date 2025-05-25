package y;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import y.h;

/* compiled from: ArraySet.java */
/* loaded from: classes.dex */
public final class d<E> implements Collection<E>, Set<E> {

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f31910e = new int[0];

    /* renamed from: f  reason: collision with root package name */
    public static final Object[] f31911f = new Object[0];

    /* renamed from: g  reason: collision with root package name */
    public static Object[] f31912g;

    /* renamed from: h  reason: collision with root package name */
    public static int f31913h;

    /* renamed from: i  reason: collision with root package name */
    public static Object[] f31914i;

    /* renamed from: j  reason: collision with root package name */
    public static int f31915j;

    /* renamed from: a  reason: collision with root package name */
    public int[] f31916a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f31917b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public c f31918d;

    public d() {
        this(0);
    }

    public static void b(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (d.class) {
                if (f31915j < 10) {
                    objArr[0] = f31914i;
                    objArr[1] = iArr;
                    for (int i11 = i10 - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    f31914i = objArr;
                    f31915j++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (d.class) {
                if (f31913h < 10) {
                    objArr[0] = f31912g;
                    objArr[1] = iArr;
                    for (int i12 = i10 - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f31912g = objArr;
                    f31913h++;
                }
            }
        }
    }

    public final void a(int i10) {
        if (i10 == 8) {
            synchronized (d.class) {
                Object[] objArr = f31914i;
                if (objArr != null) {
                    this.f31917b = objArr;
                    f31914i = (Object[]) objArr[0];
                    this.f31916a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f31915j--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (d.class) {
                Object[] objArr2 = f31912g;
                if (objArr2 != null) {
                    this.f31917b = objArr2;
                    f31912g = (Object[]) objArr2[0];
                    this.f31916a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f31913h--;
                    return;
                }
            }
        }
        this.f31916a = new int[i10];
        this.f31917b = new Object[i10];
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(E e10) {
        int i10;
        int c;
        if (e10 == null) {
            c = d();
            i10 = 0;
        } else {
            int hashCode = e10.hashCode();
            i10 = hashCode;
            c = c(hashCode, e10);
        }
        if (c >= 0) {
            return false;
        }
        int i11 = ~c;
        int i12 = this.c;
        int[] iArr = this.f31916a;
        if (i12 >= iArr.length) {
            int i13 = 8;
            if (i12 >= 8) {
                i13 = (i12 >> 1) + i12;
            } else if (i12 < 4) {
                i13 = 4;
            }
            Object[] objArr = this.f31917b;
            a(i13);
            int[] iArr2 = this.f31916a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f31917b, 0, objArr.length);
            }
            b(iArr, objArr, this.c);
        }
        int i14 = this.c;
        if (i11 < i14) {
            int[] iArr3 = this.f31916a;
            int i15 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i15, i14 - i11);
            Object[] objArr2 = this.f31917b;
            System.arraycopy(objArr2, i11, objArr2, i15, this.c - i11);
        }
        this.f31916a[i11] = i10;
        this.f31917b[i11] = e10;
        this.c++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> collection) {
        int size = collection.size() + this.c;
        int[] iArr = this.f31916a;
        boolean z10 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f31917b;
            a(size);
            int i10 = this.c;
            if (i10 > 0) {
                System.arraycopy(iArr, 0, this.f31916a, 0, i10);
                System.arraycopy(objArr, 0, this.f31917b, 0, this.c);
            }
            b(iArr, objArr, this.c);
        }
        for (E e10 : collection) {
            z10 |= add(e10);
        }
        return z10;
    }

    public final int c(int i10, Object obj) {
        int i11 = this.c;
        if (i11 == 0) {
            return -1;
        }
        int j10 = b.b.j(i11, this.f31916a, i10);
        if (j10 < 0) {
            return j10;
        }
        if (obj.equals(this.f31917b[j10])) {
            return j10;
        }
        int i12 = j10 + 1;
        while (i12 < i11 && this.f31916a[i12] == i10) {
            if (obj.equals(this.f31917b[i12])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = j10 - 1; i13 >= 0 && this.f31916a[i13] == i10; i13--) {
            if (obj.equals(this.f31917b[i13])) {
                return i13;
            }
        }
        return ~i12;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i10 = this.c;
        if (i10 != 0) {
            b(this.f31916a, this.f31917b, i10);
            this.f31916a = f31910e;
            this.f31917b = f31911f;
            this.c = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int d() {
        int i10 = this.c;
        if (i10 == 0) {
            return -1;
        }
        int j10 = b.b.j(i10, this.f31916a, 0);
        if (j10 < 0) {
            return j10;
        }
        if (this.f31917b[j10] == null) {
            return j10;
        }
        int i11 = j10 + 1;
        while (i11 < i10 && this.f31916a[i11] == 0) {
            if (this.f31917b[i11] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = j10 - 1; i12 >= 0 && this.f31916a[i12] == 0; i12--) {
            if (this.f31917b[i12] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public final void e(int i10) {
        Object[] objArr = this.f31917b;
        Object obj = objArr[i10];
        int i11 = this.c;
        if (i11 <= 1) {
            b(this.f31916a, objArr, i11);
            this.f31916a = f31910e;
            this.f31917b = f31911f;
            this.c = 0;
            return;
        }
        int[] iArr = this.f31916a;
        int i12 = 8;
        if (iArr.length > 8 && i11 < iArr.length / 3) {
            if (i11 > 8) {
                i12 = i11 + (i11 >> 1);
            }
            a(i12);
            this.c--;
            if (i10 > 0) {
                System.arraycopy(iArr, 0, this.f31916a, 0, i10);
                System.arraycopy(objArr, 0, this.f31917b, 0, i10);
            }
            int i13 = this.c;
            if (i10 < i13) {
                int i14 = i10 + 1;
                System.arraycopy(iArr, i14, this.f31916a, i10, i13 - i10);
                System.arraycopy(objArr, i14, this.f31917b, i10, this.c - i10);
                return;
            }
            return;
        }
        int i15 = i11 - 1;
        this.c = i15;
        if (i10 < i15) {
            int i16 = i10 + 1;
            System.arraycopy(iArr, i16, iArr, i10, i15 - i10);
            Object[] objArr2 = this.f31917b;
            System.arraycopy(objArr2, i16, objArr2, i10, this.c - i10);
        }
        this.f31917b[this.c] = null;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.c != set.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.c; i10++) {
                try {
                    if (!set.contains(this.f31917b[i10])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f31916a;
        int i10 = this.c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    public final int indexOf(Object obj) {
        if (obj == null) {
            return d();
        }
        return c(obj.hashCode(), obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        if (this.c <= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        if (this.f31918d == null) {
            this.f31918d = new c(this);
        }
        c cVar = this.f31918d;
        if (cVar.f31927b == null) {
            cVar.f31927b = new h.c();
        }
        return (Iterator<E>) cVar.f31927b.iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            e(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= remove(it.next());
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> collection) {
        boolean z10 = false;
        for (int i10 = this.c - 1; i10 >= 0; i10--) {
            if (!collection.contains(this.f31917b[i10])) {
                e(i10);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i10 = this.c;
        Object[] objArr = new Object[i10];
        System.arraycopy(this.f31917b, 0, objArr, 0, i10);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.c * 14);
        sb2.append('{');
        for (int i10 = 0; i10 < this.c; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object obj = this.f31917b[i10];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public d(int i10) {
        if (i10 == 0) {
            this.f31916a = f31910e;
            this.f31917b = f31911f;
        } else {
            a(i10);
        }
        this.c = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.c) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.c));
        }
        System.arraycopy(this.f31917b, 0, tArr, 0, this.c);
        int length = tArr.length;
        int i10 = this.c;
        if (length > i10) {
            tArr[i10] = null;
        }
        return tArr;
    }
}
