package lib.zj.office.fc.ss.util;

import androidx.appcompat.view.menu.d;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import lib.zj.office.fc.ss.usermodel.CellRange;
import lib.zj.office.fc.ss.usermodel.ICell;
import lib.zj.office.fc.util.Internal;

@Internal
/* loaded from: classes3.dex */
public final class SSCellRange<K extends ICell> implements CellRange<K> {
    private final int _firstColumn;
    private final int _firstRow;
    private final K[] _flattenedArray;
    private final int _height;
    private final int _width;

    /* loaded from: classes3.dex */
    public static final class ArrayIterator<D> implements Iterator<D> {
        private final D[] _array;
        private int _index = 0;

        public ArrayIterator(D[] dArr) {
            this._array = dArr;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this._index < this._array.length) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public D next() {
            int i10 = this._index;
            D[] dArr = this._array;
            if (i10 < dArr.length) {
                this._index = i10 + 1;
                return dArr[i10];
            }
            throw new NoSuchElementException(String.valueOf(this._index));
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Cannot remove cells from this CellRange.");
        }
    }

    private SSCellRange(int i10, int i11, int i12, int i13, K[] kArr) {
        this._firstRow = i10;
        this._firstColumn = i11;
        this._height = i12;
        this._width = i13;
        this._flattenedArray = kArr;
    }

    public static <B extends ICell> SSCellRange<B> create(int i10, int i11, int i12, int i13, List<B> list, Class<B> cls) {
        int size = list.size();
        if (i12 * i13 == size) {
            ICell[] iCellArr = (ICell[]) Array.newInstance((Class<?>) cls, size);
            list.toArray(iCellArr);
            return new SSCellRange<>(i10, i11, i12, i13, iCellArr);
        }
        throw new IllegalArgumentException("Array size mismatch.");
    }

    @Override // lib.zj.office.fc.ss.usermodel.CellRange
    public K getCell(int i10, int i11) {
        int i12;
        if (i10 >= 0 && i10 < this._height) {
            if (i11 >= 0 && i11 < (i12 = this._width)) {
                return this._flattenedArray[(i12 * i10) + i11];
            }
            StringBuilder e10 = d.e("Specified colummn ", i11, " is outside the allowable range (0..");
            e10.append(this._width - 1);
            e10.append(").");
            throw new ArrayIndexOutOfBoundsException(e10.toString());
        }
        StringBuilder e11 = d.e("Specified row ", i10, " is outside the allowable range (0..");
        e11.append(this._height - 1);
        e11.append(").");
        throw new ArrayIndexOutOfBoundsException(e11.toString());
    }

    @Override // lib.zj.office.fc.ss.usermodel.CellRange
    public K[][] getCells() {
        Class<?> cls = this._flattenedArray.getClass();
        K[][] kArr = (K[][]) ((ICell[][]) Array.newInstance(cls, this._height));
        Class<?> componentType = cls.getComponentType();
        for (int i10 = this._height - 1; i10 >= 0; i10--) {
            int i11 = this._width;
            System.arraycopy(this._flattenedArray, i11 * i10, (ICell[]) Array.newInstance(componentType, this._width), 0, i11);
        }
        return kArr;
    }

    @Override // lib.zj.office.fc.ss.usermodel.CellRange
    public K[] getFlattenedCells() {
        return (K[]) ((ICell[]) this._flattenedArray.clone());
    }

    @Override // lib.zj.office.fc.ss.usermodel.CellRange
    public int getHeight() {
        return this._height;
    }

    @Override // lib.zj.office.fc.ss.usermodel.CellRange
    public String getReferenceText() {
        int i10 = this._firstRow;
        int i11 = this._firstColumn;
        return new HSSFCellRangeAddress(i10, (this._height + i10) - 1, i11, (this._width + i11) - 1).formatAsString();
    }

    @Override // lib.zj.office.fc.ss.usermodel.CellRange
    public K getTopLeftCell() {
        return this._flattenedArray[0];
    }

    @Override // lib.zj.office.fc.ss.usermodel.CellRange
    public int getWidth() {
        return this._width;
    }

    @Override // lib.zj.office.fc.ss.usermodel.CellRange, java.lang.Iterable
    public Iterator<K> iterator() {
        return new ArrayIterator(this._flattenedArray);
    }

    @Override // lib.zj.office.fc.ss.usermodel.CellRange
    public int size() {
        return this._height * this._width;
    }
}
