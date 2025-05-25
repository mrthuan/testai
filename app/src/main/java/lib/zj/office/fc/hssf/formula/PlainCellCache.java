package lib.zj.office.fc.hssf.formula;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
final class PlainCellCache {
    private Map<Loc, PlainValueCellCacheEntry> _plainValueEntriesByLoc = new HashMap();

    public void clear() {
        this._plainValueEntriesByLoc.clear();
    }

    public PlainValueCellCacheEntry get(Loc loc) {
        return this._plainValueEntriesByLoc.get(loc);
    }

    public void put(Loc loc, PlainValueCellCacheEntry plainValueCellCacheEntry) {
        this._plainValueEntriesByLoc.put(loc, plainValueCellCacheEntry);
    }

    public void remove(Loc loc) {
        this._plainValueEntriesByLoc.remove(loc);
    }

    /* loaded from: classes3.dex */
    public static final class Loc {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final long _bookSheetColumn;
        private final int _rowIndex;

        public Loc(int i10, int i11, int i12, int i13) {
            this._bookSheetColumn = toBookSheetColumn(i10, i11, i13);
            this._rowIndex = i12;
        }

        public static long toBookSheetColumn(int i10, int i11, int i12) {
            return ((i10 & 65535) << 48) + ((i11 & 65535) << 32) + ((i12 & 65535) << 0);
        }

        public boolean equals(Object obj) {
            Loc loc = (Loc) obj;
            if (this._bookSheetColumn == loc._bookSheetColumn && this._rowIndex == loc._rowIndex) {
                return true;
            }
            return false;
        }

        public int getBookIndex() {
            return (int) ((this._bookSheetColumn >> 48) & 65535);
        }

        public int getColumnIndex() {
            return (int) (this._bookSheetColumn & 65535);
        }

        public int getRowIndex() {
            return this._rowIndex;
        }

        public int getSheetIndex() {
            return (int) ((this._bookSheetColumn >> 32) & 65535);
        }

        public int hashCode() {
            long j10 = this._bookSheetColumn;
            return (this._rowIndex * 17) + ((int) (j10 ^ (j10 >>> 32)));
        }

        public Loc(long j10, int i10) {
            this._bookSheetColumn = j10;
            this._rowIndex = i10;
        }
    }
}
