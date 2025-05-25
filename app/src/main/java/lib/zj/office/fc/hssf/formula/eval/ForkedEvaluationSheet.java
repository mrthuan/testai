package lib.zj.office.fc.hssf.formula.eval;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import lib.zj.office.fc.hssf.formula.EvaluationCell;
import lib.zj.office.fc.hssf.formula.EvaluationSheet;
import lib.zj.office.fc.hssf.formula.EvaluationWorkbook;
import lib.zj.office.fc.ss.usermodel.Sheet;
import lib.zj.office.fc.ss.util.CellReference;

/* loaded from: classes3.dex */
final class ForkedEvaluationSheet implements EvaluationSheet {
    private final EvaluationSheet _masterSheet;
    private final Map<RowColKey, ForkedEvaluationCell> _sharedCellsByRowCol = new HashMap();

    /* loaded from: classes3.dex */
    public static final class RowColKey implements Comparable<RowColKey> {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final int _columnIndex;
        private final int _rowIndex;

        public RowColKey(int i10, int i11) {
            this._rowIndex = i10;
            this._columnIndex = i11;
        }

        public boolean equals(Object obj) {
            RowColKey rowColKey = (RowColKey) obj;
            if (this._rowIndex == rowColKey._rowIndex && this._columnIndex == rowColKey._columnIndex) {
                return true;
            }
            return false;
        }

        public int getColumnIndex() {
            return this._columnIndex;
        }

        public int getRowIndex() {
            return this._rowIndex;
        }

        public int hashCode() {
            return this._rowIndex ^ this._columnIndex;
        }

        @Override // java.lang.Comparable
        public int compareTo(RowColKey rowColKey) {
            int i10 = this._rowIndex - rowColKey._rowIndex;
            return i10 != 0 ? i10 : this._columnIndex - rowColKey._columnIndex;
        }
    }

    public ForkedEvaluationSheet(EvaluationSheet evaluationSheet) {
        this._masterSheet = evaluationSheet;
    }

    public void copyUpdatedCells(Sheet sheet) {
        RowColKey[] rowColKeyArr = new RowColKey[this._sharedCellsByRowCol.size()];
        this._sharedCellsByRowCol.keySet().toArray(rowColKeyArr);
        Arrays.sort(rowColKeyArr);
    }

    @Override // lib.zj.office.fc.hssf.formula.EvaluationSheet
    public EvaluationCell getCell(int i10, int i11) {
        ForkedEvaluationCell forkedEvaluationCell = this._sharedCellsByRowCol.get(new RowColKey(i10, i11));
        if (forkedEvaluationCell == null) {
            return this._masterSheet.getCell(i10, i11);
        }
        return forkedEvaluationCell;
    }

    public ForkedEvaluationCell getOrCreateUpdatableCell(int i10, int i11) {
        RowColKey rowColKey = new RowColKey(i10, i11);
        ForkedEvaluationCell forkedEvaluationCell = this._sharedCellsByRowCol.get(rowColKey);
        if (forkedEvaluationCell == null) {
            EvaluationCell cell = this._masterSheet.getCell(i10, i11);
            if (cell != null) {
                ForkedEvaluationCell forkedEvaluationCell2 = new ForkedEvaluationCell(this, cell);
                this._sharedCellsByRowCol.put(rowColKey, forkedEvaluationCell2);
                return forkedEvaluationCell2;
            }
            CellReference cellReference = new CellReference(i10, i11);
            throw new UnsupportedOperationException("Underlying cell '" + cellReference.formatAsString() + "' is missing in master sheet.");
        }
        return forkedEvaluationCell;
    }

    public int getSheetIndex(EvaluationWorkbook evaluationWorkbook) {
        return evaluationWorkbook.getSheetIndex(this._masterSheet);
    }
}
