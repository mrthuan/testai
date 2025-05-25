package lib.zj.office.fc.hssf.formula;

import androidx.appcompat.view.menu.d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class FormulaCellCacheEntrySet {
    private static final FormulaCellCacheEntry[] EMPTY_ARRAY = new FormulaCellCacheEntry[0];
    private FormulaCellCacheEntry[] _arr = EMPTY_ARRAY;
    private int _size;

    private static boolean addInternal(CellCacheEntry[] cellCacheEntryArr, CellCacheEntry cellCacheEntry) {
        int abs = Math.abs(cellCacheEntry.hashCode() % cellCacheEntryArr.length);
        for (int i10 = abs; i10 < cellCacheEntryArr.length; i10++) {
            CellCacheEntry cellCacheEntry2 = cellCacheEntryArr[i10];
            if (cellCacheEntry2 == cellCacheEntry) {
                return false;
            }
            if (cellCacheEntry2 == null) {
                cellCacheEntryArr[i10] = cellCacheEntry;
                return true;
            }
        }
        for (int i11 = 0; i11 < abs; i11++) {
            CellCacheEntry cellCacheEntry3 = cellCacheEntryArr[i11];
            if (cellCacheEntry3 == cellCacheEntry) {
                return false;
            }
            if (cellCacheEntry3 == null) {
                cellCacheEntryArr[i11] = cellCacheEntry;
                return true;
            }
        }
        throw new IllegalStateException("No empty space found");
    }

    public void add(CellCacheEntry cellCacheEntry) {
        int i10 = this._size * 3;
        FormulaCellCacheEntry[] formulaCellCacheEntryArr = this._arr;
        if (i10 >= formulaCellCacheEntryArr.length * 2) {
            FormulaCellCacheEntry[] formulaCellCacheEntryArr2 = new FormulaCellCacheEntry[d.a(formulaCellCacheEntryArr.length, 3, 2, 4)];
            for (int i11 = 0; i11 < formulaCellCacheEntryArr.length; i11++) {
                FormulaCellCacheEntry formulaCellCacheEntry = this._arr[i11];
                if (formulaCellCacheEntry != null) {
                    addInternal(formulaCellCacheEntryArr2, formulaCellCacheEntry);
                }
            }
            this._arr = formulaCellCacheEntryArr2;
        }
        if (addInternal(this._arr, cellCacheEntry)) {
            this._size++;
        }
    }

    public boolean remove(CellCacheEntry cellCacheEntry) {
        FormulaCellCacheEntry[] formulaCellCacheEntryArr = this._arr;
        if (this._size * 3 < formulaCellCacheEntryArr.length && formulaCellCacheEntryArr.length > 8) {
            FormulaCellCacheEntry[] formulaCellCacheEntryArr2 = new FormulaCellCacheEntry[formulaCellCacheEntryArr.length / 2];
            boolean z10 = false;
            for (int i10 = 0; i10 < formulaCellCacheEntryArr.length; i10++) {
                FormulaCellCacheEntry formulaCellCacheEntry = this._arr[i10];
                if (formulaCellCacheEntry != null) {
                    if (formulaCellCacheEntry == cellCacheEntry) {
                        this._size--;
                        z10 = true;
                    } else {
                        addInternal(formulaCellCacheEntryArr2, formulaCellCacheEntry);
                    }
                }
            }
            this._arr = formulaCellCacheEntryArr2;
            return z10;
        }
        int abs = Math.abs(cellCacheEntry.hashCode() % formulaCellCacheEntryArr.length);
        for (int i11 = abs; i11 < formulaCellCacheEntryArr.length; i11++) {
            if (formulaCellCacheEntryArr[i11] == cellCacheEntry) {
                formulaCellCacheEntryArr[i11] = null;
                this._size--;
                return true;
            }
        }
        for (int i12 = 0; i12 < abs; i12++) {
            if (formulaCellCacheEntryArr[i12] == cellCacheEntry) {
                formulaCellCacheEntryArr[i12] = null;
                this._size--;
                return true;
            }
        }
        return false;
    }

    public FormulaCellCacheEntry[] toArray() {
        int i10 = this._size;
        if (i10 < 1) {
            return EMPTY_ARRAY;
        }
        FormulaCellCacheEntry[] formulaCellCacheEntryArr = new FormulaCellCacheEntry[i10];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            FormulaCellCacheEntry[] formulaCellCacheEntryArr2 = this._arr;
            if (i11 >= formulaCellCacheEntryArr2.length) {
                break;
            }
            FormulaCellCacheEntry formulaCellCacheEntry = formulaCellCacheEntryArr2[i11];
            if (formulaCellCacheEntry != null) {
                formulaCellCacheEntryArr[i12] = formulaCellCacheEntry;
                i12++;
            }
            i11++;
        }
        if (i12 == i10) {
            return formulaCellCacheEntryArr;
        }
        throw new IllegalStateException("size mismatch");
    }
}
