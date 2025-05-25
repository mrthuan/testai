package lib.zj.office.fc.util;

/* loaded from: classes3.dex */
public class IntList {
    private static final int _default_size = 128;
    private int[] _array;
    private int _limit;
    private int fillval;

    public IntList() {
        this(128);
    }

    private void fillArray(int i10, int[] iArr, int i11) {
        while (i11 < iArr.length) {
            iArr[i11] = i10;
            i11++;
        }
    }

    private void growArray(int i10) {
        int[] iArr = this._array;
        if (i10 == iArr.length) {
            i10++;
        }
        int[] iArr2 = new int[i10];
        int i11 = this.fillval;
        if (i11 != 0) {
            fillArray(i11, iArr2, iArr.length);
        }
        System.arraycopy(this._array, 0, iArr2, 0, this._limit);
        this._array = iArr2;
    }

    public void add(int i10, int i11) {
        int i12 = this._limit;
        if (i10 > i12) {
            throw new IndexOutOfBoundsException();
        }
        if (i10 == i12) {
            add(i11);
            return;
        }
        if (i12 == this._array.length) {
            growArray(i12 * 2);
        }
        int[] iArr = this._array;
        System.arraycopy(iArr, i10, iArr, i10 + 1, this._limit - i10);
        this._array[i10] = i11;
        this._limit++;
    }

    public boolean addAll(IntList intList) {
        int i10 = intList._limit;
        if (i10 != 0) {
            int i11 = this._limit;
            if (i11 + i10 > this._array.length) {
                growArray(i11 + i10);
            }
            System.arraycopy(intList._array, 0, this._array, this._limit, intList._limit);
            this._limit += intList._limit;
            return true;
        }
        return true;
    }

    public void clear() {
        this._limit = 0;
    }

    public boolean contains(int i10) {
        boolean z10 = false;
        for (int i11 = 0; !z10 && i11 < this._limit; i11++) {
            if (this._array[i11] == i10) {
                z10 = true;
            }
        }
        return z10;
    }

    public boolean containsAll(IntList intList) {
        boolean z10 = true;
        if (this != intList) {
            for (int i10 = 0; z10 && i10 < intList._limit; i10++) {
                if (!contains(intList._array[i10])) {
                    z10 = false;
                }
            }
        }
        return z10;
    }

    public boolean equals(Object obj) {
        boolean z10;
        if (this == obj) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && obj != null && obj.getClass() == getClass()) {
            IntList intList = (IntList) obj;
            if (intList._limit == this._limit) {
                z10 = true;
                for (int i10 = 0; z10 && i10 < this._limit; i10++) {
                    if (this._array[i10] == intList._array[i10]) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            }
        }
        return z10;
    }

    public int get(int i10) {
        if (i10 < this._limit) {
            return this._array[i10];
        }
        throw new IndexOutOfBoundsException(i10 + " not accessible in a list of length " + this._limit);
    }

    public int hashCode() {
        int i10 = 0;
        for (int i11 = 0; i11 < this._limit; i11++) {
            i10 = (i10 * 31) + this._array[i11];
        }
        return i10;
    }

    public int indexOf(int i10) {
        int i11;
        int i12 = 0;
        while (true) {
            i11 = this._limit;
            if (i12 >= i11 || i10 == this._array[i12]) {
                break;
            }
            i12++;
        }
        if (i12 == i11) {
            return -1;
        }
        return i12;
    }

    public boolean isEmpty() {
        if (this._limit == 0) {
            return true;
        }
        return false;
    }

    public int lastIndexOf(int i10) {
        int i11 = this._limit - 1;
        while (i11 >= 0 && i10 != this._array[i11]) {
            i11--;
        }
        return i11;
    }

    public int remove(int i10) {
        int i11 = this._limit;
        if (i10 < i11) {
            int[] iArr = this._array;
            int i12 = iArr[i10];
            System.arraycopy(iArr, i10 + 1, iArr, i10, i11 - i10);
            this._limit--;
            return i12;
        }
        throw new IndexOutOfBoundsException();
    }

    public boolean removeAll(IntList intList) {
        boolean z10 = false;
        for (int i10 = 0; i10 < intList._limit; i10++) {
            if (removeValue(intList._array[i10])) {
                z10 = true;
            }
        }
        return z10;
    }

    public boolean removeValue(int i10) {
        boolean z10 = false;
        int i11 = 0;
        while (!z10) {
            int i12 = this._limit;
            if (i11 >= i12) {
                break;
            }
            int[] iArr = this._array;
            if (i10 == iArr[i11]) {
                int i13 = i11 + 1;
                if (i13 < i12) {
                    System.arraycopy(iArr, i13, iArr, i11, i12 - i11);
                }
                this._limit--;
                z10 = true;
            }
            i11++;
        }
        return z10;
    }

    public boolean retainAll(IntList intList) {
        int i10 = 0;
        boolean z10 = false;
        while (i10 < this._limit) {
            if (!intList.contains(this._array[i10])) {
                remove(i10);
                z10 = true;
            } else {
                i10++;
            }
        }
        return z10;
    }

    public int set(int i10, int i11) {
        if (i10 < this._limit) {
            int[] iArr = this._array;
            int i12 = iArr[i10];
            iArr[i10] = i11;
            return i12;
        }
        throw new IndexOutOfBoundsException();
    }

    public int size() {
        return this._limit;
    }

    public int[] toArray() {
        int i10 = this._limit;
        int[] iArr = new int[i10];
        System.arraycopy(this._array, 0, iArr, 0, i10);
        return iArr;
    }

    public IntList(int i10) {
        this(i10, 0);
    }

    public IntList(IntList intList) {
        this(intList._array.length);
        int[] iArr = intList._array;
        int[] iArr2 = this._array;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
        this._limit = intList._limit;
    }

    public int[] toArray(int[] iArr) {
        int length = iArr.length;
        int i10 = this._limit;
        if (length == i10) {
            System.arraycopy(this._array, 0, iArr, 0, i10);
            return iArr;
        }
        return toArray();
    }

    public IntList(int i10, int i11) {
        this.fillval = 0;
        this._array = new int[i10];
        this._limit = 0;
    }

    public boolean addAll(int i10, IntList intList) {
        int i11 = this._limit;
        if (i10 <= i11) {
            int i12 = intList._limit;
            if (i12 != 0) {
                if (i11 + i12 > this._array.length) {
                    growArray(i11 + i12);
                }
                int[] iArr = this._array;
                System.arraycopy(iArr, i10, iArr, intList._limit + i10, this._limit - i10);
                System.arraycopy(intList._array, 0, this._array, i10, intList._limit);
                this._limit += intList._limit;
                return true;
            }
            return true;
        }
        throw new IndexOutOfBoundsException();
    }

    public boolean add(int i10) {
        int i11 = this._limit;
        if (i11 == this._array.length) {
            growArray(i11 * 2);
        }
        int[] iArr = this._array;
        int i12 = this._limit;
        this._limit = i12 + 1;
        iArr[i12] = i10;
        return true;
    }
}
