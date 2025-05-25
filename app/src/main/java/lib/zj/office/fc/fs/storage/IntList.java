package lib.zj.office.fc.fs.storage;

/* loaded from: classes3.dex */
public class IntList {
    private static final int _default_size = 128;
    private int[] _array;
    private int _limit;
    private int fillval;

    public IntList() {
        this(128, 0);
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

    public int get(int i10) {
        if (i10 >= this._limit) {
            return -2;
        }
        return this._array[i10];
    }

    public int size() {
        return this._limit;
    }

    public IntList(int i10, int i11) {
        this.fillval = 0;
        this._array = new int[i10];
        this._limit = 0;
    }
}
