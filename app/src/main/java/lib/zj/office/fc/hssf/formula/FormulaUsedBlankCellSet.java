package lib.zj.office.fc.hssf.formula;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lib.zj.office.fc.ss.util.CellReference;

/* loaded from: classes3.dex */
final class FormulaUsedBlankCellSet {
    private final Map<BookSheetKey, BlankCellSheetGroup> _sheetGroupsByBookSheet = new HashMap();

    /* loaded from: classes3.dex */
    public static final class BlankCellRectangleGroup {
        private final int _firstColumnIndex;
        private final int _firstRowIndex;
        private final int _lastColumnIndex;
        private int _lastRowIndex;

        public BlankCellRectangleGroup(int i10, int i11, int i12) {
            this._firstRowIndex = i10;
            this._firstColumnIndex = i11;
            this._lastColumnIndex = i12;
            this._lastRowIndex = i10;
        }

        public boolean acceptRow(int i10, int i11, int i12) {
            if (i11 != this._firstColumnIndex || i12 != this._lastColumnIndex || i10 != this._lastRowIndex + 1) {
                return false;
            }
            this._lastRowIndex = i10;
            return true;
        }

        public boolean containsCell(int i10, int i11) {
            if (i11 < this._firstColumnIndex || i11 > this._lastColumnIndex || i10 < this._firstRowIndex || i10 > this._lastRowIndex) {
                return false;
            }
            return true;
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer(64);
            CellReference cellReference = new CellReference(this._firstRowIndex, this._firstColumnIndex, false, false);
            CellReference cellReference2 = new CellReference(this._lastRowIndex, this._lastColumnIndex, false, false);
            stringBuffer.append(BlankCellRectangleGroup.class.getName());
            stringBuffer.append(" [");
            stringBuffer.append(cellReference.formatAsString());
            stringBuffer.append(':');
            stringBuffer.append(cellReference2.formatAsString());
            stringBuffer.append("]");
            return stringBuffer.toString();
        }
    }

    /* loaded from: classes3.dex */
    public static final class BlankCellSheetGroup {
        private BlankCellRectangleGroup _currentRectangleGroup;
        private int _firstColumnIndex;
        private int _lastColumnIndex;
        private final List<BlankCellRectangleGroup> _rectangleGroups = new ArrayList();
        private int _currentRowIndex = -1;

        public void addCell(int i10, int i11) {
            int i12 = this._currentRowIndex;
            if (i12 == -1) {
                this._currentRowIndex = i10;
                this._firstColumnIndex = i11;
                this._lastColumnIndex = i11;
            } else if (i12 == i10 && this._lastColumnIndex + 1 == i11) {
                this._lastColumnIndex = i11;
            } else {
                BlankCellRectangleGroup blankCellRectangleGroup = this._currentRectangleGroup;
                if (blankCellRectangleGroup == null) {
                    this._currentRectangleGroup = new BlankCellRectangleGroup(i12, this._firstColumnIndex, this._lastColumnIndex);
                } else if (!blankCellRectangleGroup.acceptRow(i12, this._firstColumnIndex, this._lastColumnIndex)) {
                    this._rectangleGroups.add(this._currentRectangleGroup);
                    this._currentRectangleGroup = new BlankCellRectangleGroup(this._currentRowIndex, this._firstColumnIndex, this._lastColumnIndex);
                }
                this._currentRowIndex = i10;
                this._firstColumnIndex = i11;
                this._lastColumnIndex = i11;
            }
        }

        public boolean containsCell(int i10, int i11) {
            for (int size = this._rectangleGroups.size() - 1; size >= 0; size--) {
                if (this._rectangleGroups.get(size).containsCell(i10, i11)) {
                    return true;
                }
            }
            BlankCellRectangleGroup blankCellRectangleGroup = this._currentRectangleGroup;
            if (blankCellRectangleGroup != null && blankCellRectangleGroup.containsCell(i10, i11)) {
                return true;
            }
            int i12 = this._currentRowIndex;
            if (i12 != -1 && i12 == i10 && this._firstColumnIndex <= i11 && i11 <= this._lastColumnIndex) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes3.dex */
    public static final class BookSheetKey {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final int _bookIndex;
        private final int _sheetIndex;

        public BookSheetKey(int i10, int i11) {
            this._bookIndex = i10;
            this._sheetIndex = i11;
        }

        public boolean equals(Object obj) {
            BookSheetKey bookSheetKey = (BookSheetKey) obj;
            if (this._bookIndex == bookSheetKey._bookIndex && this._sheetIndex == bookSheetKey._sheetIndex) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this._bookIndex * 17) + this._sheetIndex;
        }
    }

    private BlankCellSheetGroup getSheetGroup(int i10, int i11) {
        BookSheetKey bookSheetKey = new BookSheetKey(i10, i11);
        BlankCellSheetGroup blankCellSheetGroup = this._sheetGroupsByBookSheet.get(bookSheetKey);
        if (blankCellSheetGroup == null) {
            BlankCellSheetGroup blankCellSheetGroup2 = new BlankCellSheetGroup();
            this._sheetGroupsByBookSheet.put(bookSheetKey, blankCellSheetGroup2);
            return blankCellSheetGroup2;
        }
        return blankCellSheetGroup;
    }

    public void addCell(int i10, int i11, int i12, int i13) {
        getSheetGroup(i10, i11).addCell(i12, i13);
    }

    public boolean containsCell(BookSheetKey bookSheetKey, int i10, int i11) {
        BlankCellSheetGroup blankCellSheetGroup = this._sheetGroupsByBookSheet.get(bookSheetKey);
        if (blankCellSheetGroup == null) {
            return false;
        }
        return blankCellSheetGroup.containsCell(i10, i11);
    }

    public boolean isEmpty() {
        return this._sheetGroupsByBookSheet.isEmpty();
    }
}
