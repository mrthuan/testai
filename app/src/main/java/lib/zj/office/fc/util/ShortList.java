package lib.zj.office.fc.util;

/* loaded from: classes3.dex */
public class ShortList {
    private static final int _default_size = 128;
    private short[] _array;
    private int _limit;

    public ShortList() {
        this(128);
    }

    private void growArray(int i10) {
        short[] sArr = this._array;
        if (i10 == sArr.length) {
            i10++;
        }
        short[] sArr2 = new short[i10];
        System.arraycopy(sArr, 0, sArr2, 0, this._limit);
        this._array = sArr2;
    }

    public void add(int i10, short s4) {
        int i11 = this._limit;
        if (i10 > i11) {
            throw new IndexOutOfBoundsException();
        }
        if (i10 == i11) {
            add(s4);
            return;
        }
        if (i11 == this._array.length) {
            growArray(i11 * 2);
        }
        short[] sArr = this._array;
        System.arraycopy(sArr, i10, sArr, i10 + 1, this._limit - i10);
        this._array[i10] = s4;
        this._limit++;
    }

    public boolean addAll(ShortList shortList) {
        int i10 = shortList._limit;
        if (i10 != 0) {
            int i11 = this._limit;
            if (i11 + i10 > this._array.length) {
                growArray(i11 + i10);
            }
            System.arraycopy(shortList._array, 0, this._array, this._limit, shortList._limit);
            this._limit += shortList._limit;
            return true;
        }
        return true;
    }

    public void clear() {
        this._limit = 0;
    }

    public boolean contains(short s4) {
        boolean z10 = false;
        for (int i10 = 0; !z10 && i10 < this._limit; i10++) {
            if (this._array[i10] == s4) {
                z10 = true;
            }
        }
        return z10;
    }

    public boolean containsAll(ShortList shortList) {
        boolean z10 = true;
        if (this != shortList) {
            for (int i10 = 0; z10 && i10 < shortList._limit; i10++) {
                if (!contains(shortList._array[i10])) {
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
            ShortList shortList = (ShortList) obj;
            if (shortList._limit == this._limit) {
                z10 = true;
                for (int i10 = 0; z10 && i10 < this._limit; i10++) {
                    if (this._array[i10] == shortList._array[i10]) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            }
        }
        return z10;
    }

    public short get(int i10) {
        if (i10 < this._limit) {
            return this._array[i10];
        }
        throw new IndexOutOfBoundsException();
    }

    public int hashCode() {
        int i10 = 0;
        for (int i11 = 0; i11 < this._limit; i11++) {
            i10 = (i10 * 31) + this._array[i11];
        }
        return i10;
    }

    public int indexOf(short s4) {
        int i10;
        int i11 = 0;
        while (true) {
            i10 = this._limit;
            if (i11 >= i10 || s4 == this._array[i11]) {
                break;
            }
            i11++;
        }
        if (i11 == i10) {
            return -1;
        }
        return i11;
    }

    public boolean isEmpty() {
        if (this._limit == 0) {
            return true;
        }
        return false;
    }

    public int lastIndexOf(short s4) {
        int i10 = this._limit - 1;
        while (i10 >= 0 && s4 != this._array[i10]) {
            i10--;
        }
        return i10;
    }

    public short remove(int i10) {
        int i11 = this._limit;
        if (i10 < i11) {
            short[] sArr = this._array;
            short s4 = sArr[i10];
            System.arraycopy(sArr, i10 + 1, sArr, i10, i11 - i10);
            this._limit--;
            return s4;
        }
        throw new IndexOutOfBoundsException();
    }

    public boolean removeAll(ShortList shortList) {
        boolean z10 = false;
        for (int i10 = 0; i10 < shortList._limit; i10++) {
            if (removeValue(shortList._array[i10])) {
                z10 = true;
            }
        }
        return z10;
    }

    public boolean removeValue(short s4) {
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            int i11 = this._limit;
            if (i10 >= i11) {
                break;
            }
            short[] sArr = this._array;
            if (s4 == sArr[i10]) {
                System.arraycopy(sArr, i10 + 1, sArr, i10, i11 - i10);
                this._limit--;
                z10 = true;
            }
            i10++;
        }
        return z10;
    }

    public boolean retainAll(ShortList shortList) {
        int i10 = 0;
        boolean z10 = false;
        while (i10 < this._limit) {
            if (!shortList.contains(this._array[i10])) {
                remove(i10);
                z10 = true;
            } else {
                i10++;
            }
        }
        return z10;
    }

    public short set(int i10, short s4) {
        if (i10 < this._limit) {
            short[] sArr = this._array;
            short s10 = sArr[i10];
            sArr[i10] = s4;
            return s10;
        }
        throw new IndexOutOfBoundsException();
    }

    public int size() {
        return this._limit;
    }

    public short[] toArray() {
        int i10 = this._limit;
        short[] sArr = new short[i10];
        System.arraycopy(this._array, 0, sArr, 0, i10);
        return sArr;
    }

    public ShortList(ShortList shortList) {
        this(shortList._array.length);
        short[] sArr = shortList._array;
        short[] sArr2 = this._array;
        System.arraycopy(sArr, 0, sArr2, 0, sArr2.length);
        this._limit = shortList._limit;
    }

    public short[] toArray(short[] sArr) {
        int length = sArr.length;
        int i10 = this._limit;
        if (length == i10) {
            System.arraycopy(this._array, 0, sArr, 0, i10);
            return sArr;
        }
        return toArray();
    }

    public ShortList(int i10) {
        this._array = new short[i10];
        this._limit = 0;
    }

    public boolean addAll(int i10, ShortList shortList) {
        int i11 = this._limit;
        if (i10 <= i11) {
            int i12 = shortList._limit;
            if (i12 != 0) {
                if (i11 + i12 > this._array.length) {
                    growArray(i11 + i12);
                }
                short[] sArr = this._array;
                System.arraycopy(sArr, i10, sArr, shortList._limit + i10, this._limit - i10);
                System.arraycopy(shortList._array, 0, this._array, i10, shortList._limit);
                this._limit += shortList._limit;
                return true;
            }
            return true;
        }
        throw new IndexOutOfBoundsException();
    }

    public boolean add(short s4) {
        int i10 = this._limit;
        if (i10 == this._array.length) {
            growArray(i10 * 2);
        }
        short[] sArr = this._array;
        int i11 = this._limit;
        this._limit = i11 + 1;
        sArr[i11] = s4;
        return true;
    }
}
