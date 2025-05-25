package com.bytedance.adsdk.lottie;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: ArraySet.java */
/* loaded from: classes.dex */
public final class Qhi<E> implements Collection<E>, Set<E> {
    private static Object[] ROR;
    private static int Sf;
    private static int Tgh;

    /* renamed from: fl  reason: collision with root package name */
    private static Object[] f7699fl;
    Object[] Qhi;
    private pA<E, E> WAv;
    int cJ;

    /* renamed from: hm  reason: collision with root package name */
    private int[] f7700hm;

    /* renamed from: ac  reason: collision with root package name */
    private static final int[] f7698ac = new int[0];
    private static final Object[] CJ = new Object[0];

    public Qhi() {
        this(0);
    }

    private void CJ(int i10) {
        if (i10 == 8) {
            synchronized (Qhi.class) {
                Object[] objArr = ROR;
                if (objArr != null) {
                    this.Qhi = objArr;
                    ROR = (Object[]) objArr[0];
                    this.f7700hm = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    Sf--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (Qhi.class) {
                Object[] objArr2 = f7699fl;
                if (objArr2 != null) {
                    this.Qhi = objArr2;
                    f7699fl = (Object[]) objArr2[0];
                    this.f7700hm = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    Tgh--;
                    return;
                }
            }
        }
        this.f7700hm = new int[i10];
        this.Qhi = new Object[i10];
    }

    private int Qhi(Object obj, int i10) {
        int i11 = this.cJ;
        if (i11 == 0) {
            return -1;
        }
        int Qhi = cJ.Qhi(this.f7700hm, i11, i10);
        if (Qhi >= 0 && !obj.equals(this.Qhi[Qhi])) {
            int i12 = Qhi + 1;
            while (i12 < i11 && this.f7700hm[i12] == i10) {
                if (obj.equals(this.Qhi[i12])) {
                    return i12;
                }
                i12++;
            }
            for (int i13 = Qhi - 1; i13 >= 0 && this.f7700hm[i13] == i10; i13--) {
                if (obj.equals(this.Qhi[i13])) {
                    return i13;
                }
            }
            return ~i12;
        }
        return Qhi;
    }

    public E ac(int i10) {
        Object[] objArr = this.Qhi;
        E e10 = (E) objArr[i10];
        int i11 = this.cJ;
        if (i11 <= 1) {
            Qhi(this.f7700hm, objArr, i11);
            this.f7700hm = f7698ac;
            this.Qhi = CJ;
            this.cJ = 0;
        } else {
            int[] iArr = this.f7700hm;
            int i12 = 8;
            if (iArr.length > 8 && i11 < iArr.length / 3) {
                if (i11 > 8) {
                    i12 = i11 + (i11 >> 1);
                }
                CJ(i12);
                this.cJ--;
                if (i10 > 0) {
                    System.arraycopy(iArr, 0, this.f7700hm, 0, i10);
                    System.arraycopy(objArr, 0, this.Qhi, 0, i10);
                }
                int i13 = this.cJ;
                if (i10 < i13) {
                    int i14 = i10 + 1;
                    System.arraycopy(iArr, i14, this.f7700hm, i10, i13 - i10);
                    System.arraycopy(objArr, i14, this.Qhi, i10, this.cJ - i10);
                }
            } else {
                int i15 = i11 - 1;
                this.cJ = i15;
                if (i10 < i15) {
                    int i16 = i10 + 1;
                    System.arraycopy(iArr, i16, iArr, i10, i15 - i10);
                    Object[] objArr2 = this.Qhi;
                    System.arraycopy(objArr2, i16, objArr2, i10, this.cJ - i10);
                }
                this.Qhi[this.cJ] = null;
            }
        }
        return e10;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e10) {
        int i10;
        int Qhi;
        if (e10 == null) {
            Qhi = Qhi();
            i10 = 0;
        } else {
            int hashCode = e10.hashCode();
            i10 = hashCode;
            Qhi = Qhi(e10, hashCode);
        }
        if (Qhi >= 0) {
            return false;
        }
        int i11 = ~Qhi;
        int i12 = this.cJ;
        int[] iArr = this.f7700hm;
        if (i12 >= iArr.length) {
            int i13 = 8;
            if (i12 >= 8) {
                i13 = (i12 >> 1) + i12;
            } else if (i12 < 4) {
                i13 = 4;
            }
            Object[] objArr = this.Qhi;
            CJ(i13);
            int[] iArr2 = this.f7700hm;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.Qhi, 0, objArr.length);
            }
            Qhi(iArr, objArr, this.cJ);
        }
        int i14 = this.cJ;
        if (i11 < i14) {
            int[] iArr3 = this.f7700hm;
            int i15 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i15, i14 - i11);
            Object[] objArr2 = this.Qhi;
            System.arraycopy(objArr2, i11, objArr2, i15, this.cJ - i11);
        }
        this.f7700hm[i11] = i10;
        this.Qhi[i11] = e10;
        this.cJ++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        Qhi(collection.size() + this.cJ);
        boolean z10 = false;
        for (E e10 : collection) {
            z10 |= add(e10);
        }
        return z10;
    }

    public E cJ(int i10) {
        return (E) this.Qhi[i10];
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i10 = this.cJ;
        if (i10 != 0) {
            Qhi(this.f7700hm, this.Qhi, i10);
            this.f7700hm = f7698ac;
            this.Qhi = CJ;
            this.cJ = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (Qhi(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.cJ; i10++) {
                try {
                    if (!set.contains(cJ(i10))) {
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
    public int hashCode() {
        int[] iArr = this.f7700hm;
        int i10 = this.cJ;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        if (this.cJ <= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return cJ().CJ().iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int Qhi = Qhi(obj);
        if (Qhi >= 0) {
            ac(Qhi);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= remove(it.next());
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z10 = false;
        for (int i10 = this.cJ - 1; i10 >= 0; i10--) {
            if (!collection.contains(this.Qhi[i10])) {
                ac(i10);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.cJ;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i10 = this.cJ;
        Object[] objArr = new Object[i10];
        System.arraycopy(this.Qhi, 0, objArr, 0, i10);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.cJ * 14);
        sb2.append('{');
        for (int i10 = 0; i10 < this.cJ; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            E cJ = cJ(i10);
            if (cJ != this) {
                sb2.append(cJ);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public Qhi(int i10) {
        if (i10 == 0) {
            this.f7700hm = f7698ac;
            this.Qhi = CJ;
        } else {
            CJ(i10);
        }
        this.cJ = 0;
    }

    private pA<E, E> cJ() {
        if (this.WAv == null) {
            this.WAv = new pA<E, E>() { // from class: com.bytedance.adsdk.lottie.Qhi.1
                @Override // com.bytedance.adsdk.lottie.pA
                public int Qhi() {
                    return Qhi.this.cJ;
                }

                @Override // com.bytedance.adsdk.lottie.pA
                public void ac() {
                    Qhi.this.clear();
                }

                @Override // com.bytedance.adsdk.lottie.pA
                public Map<E, E> cJ() {
                    throw new UnsupportedOperationException("not a map");
                }

                @Override // com.bytedance.adsdk.lottie.pA
                public Object Qhi(int i10, int i11) {
                    return Qhi.this.Qhi[i10];
                }

                @Override // com.bytedance.adsdk.lottie.pA
                public int Qhi(Object obj) {
                    return Qhi.this.Qhi(obj);
                }

                @Override // com.bytedance.adsdk.lottie.pA
                public void Qhi(int i10) {
                    Qhi.this.ac(i10);
                }
            };
        }
        return this.WAv;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.cJ) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.cJ));
        }
        System.arraycopy(this.Qhi, 0, tArr, 0, this.cJ);
        int length = tArr.length;
        int i10 = this.cJ;
        if (length > i10) {
            tArr[i10] = null;
        }
        return tArr;
    }

    private int Qhi() {
        int i10 = this.cJ;
        if (i10 == 0) {
            return -1;
        }
        int Qhi = cJ.Qhi(this.f7700hm, i10, 0);
        if (Qhi >= 0 && this.Qhi[Qhi] != null) {
            int i11 = Qhi + 1;
            while (i11 < i10 && this.f7700hm[i11] == 0) {
                if (this.Qhi[i11] == null) {
                    return i11;
                }
                i11++;
            }
            for (int i12 = Qhi - 1; i12 >= 0 && this.f7700hm[i12] == 0; i12--) {
                if (this.Qhi[i12] == null) {
                    return i12;
                }
            }
            return ~i11;
        }
        return Qhi;
    }

    private static void Qhi(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (Qhi.class) {
                if (Sf < 10) {
                    objArr[0] = ROR;
                    objArr[1] = iArr;
                    for (int i11 = i10 - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    ROR = objArr;
                    Sf++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (Qhi.class) {
                if (Tgh < 10) {
                    objArr[0] = f7699fl;
                    objArr[1] = iArr;
                    for (int i12 = i10 - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f7699fl = objArr;
                    Tgh++;
                }
            }
        }
    }

    public void Qhi(int i10) {
        int[] iArr = this.f7700hm;
        if (iArr.length < i10) {
            Object[] objArr = this.Qhi;
            CJ(i10);
            int i11 = this.cJ;
            if (i11 > 0) {
                System.arraycopy(iArr, 0, this.f7700hm, 0, i11);
                System.arraycopy(objArr, 0, this.Qhi, 0, this.cJ);
            }
            Qhi(iArr, objArr, this.cJ);
        }
    }

    public int Qhi(Object obj) {
        return obj == null ? Qhi() : Qhi(obj, obj.hashCode());
    }
}
