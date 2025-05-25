package lib.zj.office.java.util;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class Arrays {

    /* loaded from: classes3.dex */
    public static class ArrayList<E> extends AbstractList<E> implements RandomAccess, Serializable {
        private static final long serialVersionUID = -2764017481108945198L;

        /* renamed from: a  reason: collision with root package name */
        private final E[] f20842a;

        public ArrayList(E[] eArr) {
            eArr.getClass();
            this.f20842a = eArr;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            if (indexOf(obj) != -1) {
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public E get(int i10) {
            return this.f20842a[i10];
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int i10 = 0;
            if (obj == null) {
                while (true) {
                    E[] eArr = this.f20842a;
                    if (i10 < eArr.length) {
                        if (eArr[i10] == null) {
                            return i10;
                        }
                        i10++;
                    } else {
                        return -1;
                    }
                }
            } else {
                while (true) {
                    E[] eArr2 = this.f20842a;
                    if (i10 < eArr2.length) {
                        if (obj.equals(eArr2[i10])) {
                            return i10;
                        }
                        i10++;
                    } else {
                        return -1;
                    }
                }
            }
        }

        @Override // java.util.AbstractList, java.util.List
        public E set(int i10, E e10) {
            E[] eArr = this.f20842a;
            E e11 = eArr[i10];
            eArr[i10] = e10;
            return e11;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f20842a.length;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public Object[] toArray() {
            return (Object[]) this.f20842a.clone();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public <T> T[] toArray(T[] tArr) {
            int size = size();
            if (tArr.length < size) {
                E[] eArr = this.f20842a;
                Class<?> cls = tArr.getClass();
                T[] tArr2 = cls == Object[].class ? (T[]) new Object[size] : (T[]) ((Object[]) Array.newInstance(cls.getComponentType(), size));
                System.arraycopy(eArr, 0, tArr2, 0, Math.min(eArr.length, size));
                return tArr2;
            }
            System.arraycopy(this.f20842a, 0, tArr, 0, size);
            if (tArr.length > size) {
                tArr[size] = null;
            }
            return tArr;
        }
    }

    public static <T> List<T> a(T... tArr) {
        return new ArrayList(tArr);
    }

    public static int b(int[] iArr, int i10, int i11, int i12) {
        int i13 = iArr[i10];
        int i14 = iArr[i11];
        if (i13 < i14) {
            int i15 = iArr[i12];
            if (i14 >= i15) {
                if (i13 >= i15) {
                    return i10;
                }
                return i12;
            }
            return i11;
        }
        int i16 = iArr[i12];
        if (i14 <= i16) {
            if (i13 <= i16) {
                return i10;
            }
            return i12;
        }
        return i11;
    }

    public static void c(int i10, int[] iArr, int i11) {
        int i12;
        if (i11 < 7) {
            for (int i13 = i10; i13 < i11 + i10; i13++) {
                int i14 = i13;
                while (i14 > i10) {
                    int i15 = i14 - 1;
                    int i16 = iArr[i15];
                    int i17 = iArr[i14];
                    if (i16 > i17) {
                        iArr[i14] = i16;
                        iArr[i15] = i17;
                        i14 = i15;
                    }
                }
            }
            return;
        }
        int i18 = (i11 >> 1) + i10;
        if (i11 > 7) {
            int i19 = (i10 + i11) - 1;
            if (i11 > 40) {
                int i20 = i11 / 8;
                int i21 = i20 * 2;
                i12 = b(iArr, i10, i10 + i20, i10 + i21);
                i18 = b(iArr, i18 - i20, i18, i18 + i20);
                i19 = b(iArr, i19 - i21, i19 - i20, i19);
            } else {
                i12 = i10;
            }
            i18 = b(iArr, i12, i18, i19);
        }
        int i22 = iArr[i18];
        int i23 = i11 + i10;
        int i24 = i23 - 1;
        int i25 = i10;
        int i26 = i25;
        int i27 = i24;
        while (true) {
            if (i25 <= i24) {
                int i28 = iArr[i25];
                if (i28 <= i22) {
                    if (i28 == i22) {
                        int i29 = iArr[i26];
                        iArr[i26] = i28;
                        iArr[i25] = i29;
                        i26++;
                    }
                    i25++;
                }
            }
            while (i24 >= i25) {
                int i30 = iArr[i24];
                if (i30 < i22) {
                    break;
                }
                if (i30 == i22) {
                    iArr[i24] = iArr[i27];
                    iArr[i27] = i30;
                    i27--;
                }
                i24--;
            }
            if (i25 > i24) {
                break;
            }
            int i31 = iArr[i25];
            iArr[i25] = iArr[i24];
            iArr[i24] = i31;
            i25++;
            i24--;
        }
        int i32 = i26 - i10;
        int i33 = i25 - i26;
        int min = Math.min(i32, i33);
        int i34 = i25 - min;
        int i35 = 0;
        int i36 = i10;
        int i37 = 0;
        while (i37 < min) {
            int i38 = iArr[i36];
            iArr[i36] = iArr[i34];
            iArr[i34] = i38;
            i37++;
            i36++;
            i34++;
        }
        int i39 = i27 - i24;
        int min2 = Math.min(i39, (i23 - i27) - 1);
        int i40 = i23 - min2;
        while (i35 < min2) {
            int i41 = iArr[i25];
            iArr[i25] = iArr[i40];
            iArr[i40] = i41;
            i35++;
            i25++;
            i40++;
        }
        if (i33 > 1) {
            c(i10, iArr, i33);
        }
        if (i39 > 1) {
            c(i23 - i39, iArr, i39);
        }
    }
}
