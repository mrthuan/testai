package lib.zj.office.fc.hssf.formula;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import lib.zj.office.fc.hssf.formula.FormulaUsedBlankCellSet;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class FormulaCellCacheEntry extends CellCacheEntry {
    private CellCacheEntry[] _sensitiveInputCells;
    private FormulaUsedBlankCellSet _usedBlankCellGroup;

    private void changeConsumingCells(CellCacheEntry[] cellCacheEntryArr) {
        Set set;
        CellCacheEntry[] cellCacheEntryArr2 = this._sensitiveInputCells;
        int length = cellCacheEntryArr.length;
        for (CellCacheEntry cellCacheEntry : cellCacheEntryArr) {
            cellCacheEntry.addConsumingCell(this);
        }
        if (cellCacheEntryArr2 == null || (r3 = cellCacheEntryArr2.length) < 1) {
            return;
        }
        if (length < 1) {
            set = Collections.emptySet();
        } else {
            HashSet hashSet = new HashSet((length * 3) / 2);
            for (CellCacheEntry cellCacheEntry2 : cellCacheEntryArr) {
                hashSet.add(cellCacheEntry2);
            }
            set = hashSet;
        }
        for (CellCacheEntry cellCacheEntry3 : cellCacheEntryArr2) {
            if (!set.contains(cellCacheEntry3)) {
                cellCacheEntry3.clearConsumingCell(this);
            }
        }
    }

    public void clearFormulaEntry() {
        CellCacheEntry[] cellCacheEntryArr = this._sensitiveInputCells;
        if (cellCacheEntryArr != null) {
            for (int length = cellCacheEntryArr.length - 1; length >= 0; length--) {
                cellCacheEntryArr[length].clearConsumingCell(this);
            }
        }
        this._sensitiveInputCells = null;
        clearValue();
    }

    public boolean isInputSensitive() {
        CellCacheEntry[] cellCacheEntryArr = this._sensitiveInputCells;
        if (cellCacheEntryArr != null && cellCacheEntryArr.length > 0) {
            return true;
        }
        FormulaUsedBlankCellSet formulaUsedBlankCellSet = this._usedBlankCellGroup;
        if (formulaUsedBlankCellSet != null && !formulaUsedBlankCellSet.isEmpty()) {
            return true;
        }
        return false;
    }

    public void notifyUpdatedBlankCell(FormulaUsedBlankCellSet.BookSheetKey bookSheetKey, int i10, int i11, IEvaluationListener iEvaluationListener) {
        FormulaUsedBlankCellSet formulaUsedBlankCellSet = this._usedBlankCellGroup;
        if (formulaUsedBlankCellSet != null && formulaUsedBlankCellSet.containsCell(bookSheetKey, i10, i11)) {
            clearFormulaEntry();
            recurseClearCachedFormulaResults(iEvaluationListener);
        }
    }

    public void setSensitiveInputCells(CellCacheEntry[] cellCacheEntryArr) {
        CellCacheEntry[] cellCacheEntryArr2;
        if (cellCacheEntryArr == null) {
            cellCacheEntryArr2 = CellCacheEntry.EMPTY_ARRAY;
        } else {
            cellCacheEntryArr2 = cellCacheEntryArr;
        }
        changeConsumingCells(cellCacheEntryArr2);
        this._sensitiveInputCells = cellCacheEntryArr;
    }

    public void updateFormulaResult(ValueEval valueEval, CellCacheEntry[] cellCacheEntryArr, FormulaUsedBlankCellSet formulaUsedBlankCellSet) {
        updateValue(valueEval);
        setSensitiveInputCells(cellCacheEntryArr);
        this._usedBlankCellGroup = formulaUsedBlankCellSet;
    }
}
