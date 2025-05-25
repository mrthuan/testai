package y;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: SimpleArrayMap.java */
/* loaded from: classes.dex */
public class i<K, V> {

    /* renamed from: d  reason: collision with root package name */
    public static Object[] f31938d;

    /* renamed from: e  reason: collision with root package name */
    public static int f31939e;

    /* renamed from: f  reason: collision with root package name */
    public static Object[] f31940f;

    /* renamed from: g  reason: collision with root package name */
    public static int f31941g;

    /* renamed from: a  reason: collision with root package name */
    public int[] f31942a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f31943b;
    public int c;

    public i() {
        this.f31942a = b.b.f5174g;
        this.f31943b = b.b.f5176i;
        this.c = 0;
    }

    private void a(int i10) {
        if (i10 == 8) {
            synchronized (i.class) {
                Object[] objArr = f31940f;
                if (objArr != null) {
                    this.f31943b = objArr;
                    f31940f = (Object[]) objArr[0];
                    this.f31942a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f31941g--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (i.class) {
                Object[] objArr2 = f31938d;
                if (objArr2 != null) {
                    this.f31943b = objArr2;
                    f31938d = (Object[]) objArr2[0];
                    this.f31942a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f31939e--;
                    return;
                }
            }
        }
        this.f31942a = new int[i10];
        this.f31943b = new Object[i10 << 1];
    }

    public static void c(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (i.class) {
                if (f31941g < 10) {
                    objArr[0] = f31940f;
                    objArr[1] = iArr;
                    for (int i11 = (i10 << 1) - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    f31940f = objArr;
                    f31941g++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (i.class) {
                if (f31939e < 10) {
                    objArr[0] = f31938d;
                    objArr[1] = iArr;
                    for (int i12 = (i10 << 1) - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f31938d = objArr;
                    f31939e++;
                }
            }
        }
    }

    public final void b(int i10) {
        int i11 = this.c;
        int[] iArr = this.f31942a;
        if (iArr.length < i10) {
            Object[] objArr = this.f31943b;
            a(i10);
            if (this.c > 0) {
                System.arraycopy(iArr, 0, this.f31942a, 0, i11);
                System.arraycopy(objArr, 0, this.f31943b, 0, i11 << 1);
            }
            c(iArr, objArr, i11);
        }
        if (this.c == i11) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public void clear() {
        int i10 = this.c;
        if (i10 > 0) {
            int[] iArr = this.f31942a;
            Object[] objArr = this.f31943b;
            this.f31942a = b.b.f5174g;
            this.f31943b = b.b.f5176i;
            this.c = 0;
            c(iArr, objArr, i10);
        }
        if (this.c <= 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public final boolean containsKey(Object obj) {
        if (e(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean containsValue(Object obj) {
        if (g(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final int d(int i10, Object obj) {
        int i11 = this.c;
        if (i11 == 0) {
            return -1;
        }
        try {
            int j10 = b.b.j(i11, this.f31942a, i10);
            if (j10 < 0) {
                return j10;
            }
            if (obj.equals(this.f31943b[j10 << 1])) {
                return j10;
            }
            int i12 = j10 + 1;
            while (i12 < i11 && this.f31942a[i12] == i10) {
                if (obj.equals(this.f31943b[i12 << 1])) {
                    return i12;
                }
                i12++;
            }
            for (int i13 = j10 - 1; i13 >= 0 && this.f31942a[i13] == i10; i13--) {
                if (obj.equals(this.f31943b[i13 << 1])) {
                    return i13;
                }
            }
            return ~i12;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int e(Object obj) {
        if (obj == null) {
            return f();
        }
        return d(obj.hashCode(), obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.c != iVar.c) {
                return false;
            }
            for (int i10 = 0; i10 < this.c; i10++) {
                try {
                    K h10 = h(i10);
                    V l10 = l(i10);
                    Object orDefault = iVar.getOrDefault(h10, null);
                    if (l10 == null) {
                        if (orDefault != null || !iVar.containsKey(h10)) {
                            return false;
                        }
                    } else if (!l10.equals(orDefault)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.c != map.size()) {
                return false;
            }
            for (int i11 = 0; i11 < this.c; i11++) {
                try {
                    K h11 = h(i11);
                    V l11 = l(i11);
                    Object obj2 = map.get(h11);
                    if (l11 == null) {
                        if (obj2 != null || !map.containsKey(h11)) {
                            return false;
                        }
                    } else if (!l11.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f() {
        int i10 = this.c;
        if (i10 == 0) {
            return -1;
        }
        try {
            int j10 = b.b.j(i10, this.f31942a, 0);
            if (j10 < 0) {
                return j10;
            }
            if (this.f31943b[j10 << 1] == null) {
                return j10;
            }
            int i11 = j10 + 1;
            while (i11 < i10 && this.f31942a[i11] == 0) {
                if (this.f31943b[i11 << 1] == null) {
                    return i11;
                }
                i11++;
            }
            for (int i12 = j10 - 1; i12 >= 0 && this.f31942a[i12] == 0; i12--) {
                if (this.f31943b[i12 << 1] == null) {
                    return i12;
                }
            }
            return ~i11;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int g(Object obj) {
        int i10 = this.c * 2;
        Object[] objArr = this.f31943b;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (obj.equals(objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public final V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final V getOrDefault(Object obj, V v10) {
        int e10 = e(obj);
        if (e10 >= 0) {
            return (V) this.f31943b[(e10 << 1) + 1];
        }
        return v10;
    }

    public final K h(int i10) {
        return (K) this.f31943b[i10 << 1];
    }

    public int hashCode() {
        int hashCode;
        int[] iArr = this.f31942a;
        Object[] objArr = this.f31943b;
        int i10 = this.c;
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            int i14 = iArr[i12];
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            i13 += hashCode ^ i14;
            i12++;
            i11 += 2;
        }
        return i13;
    }

    public void i(i<? extends K, ? extends V> iVar) {
        int i10 = iVar.c;
        b(this.c + i10);
        if (this.c == 0) {
            if (i10 > 0) {
                System.arraycopy(iVar.f31942a, 0, this.f31942a, 0, i10);
                System.arraycopy(iVar.f31943b, 0, this.f31943b, 0, i10 << 1);
                this.c = i10;
                return;
            }
            return;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            put(iVar.h(i11), iVar.l(i11));
        }
    }

    public final boolean isEmpty() {
        if (this.c <= 0) {
            return true;
        }
        return false;
    }

    public V j(int i10) {
        Object[] objArr = this.f31943b;
        int i11 = i10 << 1;
        V v10 = (V) objArr[i11 + 1];
        int i12 = this.c;
        int i13 = 0;
        if (i12 <= 1) {
            c(this.f31942a, objArr, i12);
            this.f31942a = b.b.f5174g;
            this.f31943b = b.b.f5176i;
        } else {
            int i14 = i12 - 1;
            int[] iArr = this.f31942a;
            int i15 = 8;
            if (iArr.length > 8 && i12 < iArr.length / 3) {
                if (i12 > 8) {
                    i15 = i12 + (i12 >> 1);
                }
                a(i15);
                if (i12 == this.c) {
                    if (i10 > 0) {
                        System.arraycopy(iArr, 0, this.f31942a, 0, i10);
                        System.arraycopy(objArr, 0, this.f31943b, 0, i11);
                    }
                    if (i10 < i14) {
                        int i16 = i10 + 1;
                        int i17 = i14 - i10;
                        System.arraycopy(iArr, i16, this.f31942a, i10, i17);
                        System.arraycopy(objArr, i16 << 1, this.f31943b, i11, i17 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (i10 < i14) {
                    int i18 = i10 + 1;
                    int i19 = i14 - i10;
                    System.arraycopy(iArr, i18, iArr, i10, i19);
                    Object[] objArr2 = this.f31943b;
                    System.arraycopy(objArr2, i18 << 1, objArr2, i11, i19 << 1);
                }
                Object[] objArr3 = this.f31943b;
                int i20 = i14 << 1;
                objArr3[i20] = null;
                objArr3[i20 + 1] = null;
            }
            i13 = i14;
        }
        if (i12 == this.c) {
            this.c = i13;
            return v10;
        }
        throw new ConcurrentModificationException();
    }

    public V k(int i10, V v10) {
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f31943b;
        V v11 = (V) objArr[i11];
        objArr[i11] = v10;
        return v11;
    }

    public final V l(int i10) {
        return (V) this.f31943b[(i10 << 1) + 1];
    }

    public V put(K k10, V v10) {
        int i10;
        int d10;
        int i11 = this.c;
        if (k10 == null) {
            d10 = f();
            i10 = 0;
        } else {
            int hashCode = k10.hashCode();
            i10 = hashCode;
            d10 = d(hashCode, k10);
        }
        if (d10 >= 0) {
            int i12 = (d10 << 1) + 1;
            Object[] objArr = this.f31943b;
            V v11 = (V) objArr[i12];
            objArr[i12] = v10;
            return v11;
        }
        int i13 = ~d10;
        int[] iArr = this.f31942a;
        if (i11 >= iArr.length) {
            int i14 = 8;
            if (i11 >= 8) {
                i14 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i14 = 4;
            }
            Object[] objArr2 = this.f31943b;
            a(i14);
            if (i11 == this.c) {
                int[] iArr2 = this.f31942a;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.f31943b, 0, objArr2.length);
                }
                c(iArr, objArr2, i11);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i13 < i11) {
            int[] iArr3 = this.f31942a;
            int i15 = i13 + 1;
            System.arraycopy(iArr3, i13, iArr3, i15, i11 - i13);
            Object[] objArr3 = this.f31943b;
            System.arraycopy(objArr3, i13 << 1, objArr3, i15 << 1, (this.c - i13) << 1);
        }
        int i16 = this.c;
        if (i11 == i16) {
            int[] iArr4 = this.f31942a;
            if (i13 < iArr4.length) {
                iArr4[i13] = i10;
                Object[] objArr4 = this.f31943b;
                int i17 = i13 << 1;
                objArr4[i17] = k10;
                objArr4[i17 + 1] = v10;
                this.c = i16 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final V putIfAbsent(K k10, V v10) {
        V orDefault = getOrDefault(k10, null);
        if (orDefault == null) {
            return put(k10, v10);
        }
        return orDefault;
    }

    public final V remove(Object obj) {
        int e10 = e(obj);
        if (e10 >= 0) {
            return j(e10);
        }
        return null;
    }

    public final V replace(K k10, V v10) {
        int e10 = e(k10);
        if (e10 >= 0) {
            return k(e10, v10);
        }
        return null;
    }

    public final int size() {
        return this.c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.c * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.c; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            K h10 = h(i10);
            if (h10 != this) {
                sb2.append(h10);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            V l10 = l(i10);
            if (l10 != this) {
                sb2.append(l10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public final boolean remove(Object obj, Object obj2) {
        int e10 = e(obj);
        if (e10 >= 0) {
            V l10 = l(e10);
            if (obj2 == l10 || (obj2 != null && obj2.equals(l10))) {
                j(e10);
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean replace(K k10, V v10, V v11) {
        int e10 = e(k10);
        if (e10 >= 0) {
            V l10 = l(e10);
            if (l10 == v10 || (v10 != null && v10.equals(l10))) {
                k(e10, v11);
                return true;
            }
            return false;
        }
        return false;
    }

    public i(int i10) {
        if (i10 == 0) {
            this.f31942a = b.b.f5174g;
            this.f31943b = b.b.f5176i;
        } else {
            a(i10);
        }
        this.c = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(i<K, V> iVar) {
        this();
        if (iVar != 0) {
            i(iVar);
        }
    }
}
