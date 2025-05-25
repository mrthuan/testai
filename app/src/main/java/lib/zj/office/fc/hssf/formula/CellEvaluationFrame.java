package lib.zj.office.fc.hssf.formula;

import java.util.HashSet;
import java.util.Set;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;

/* loaded from: classes3.dex */
final class CellEvaluationFrame {
    private final FormulaCellCacheEntry _cce;
    private final Set<CellCacheEntry> _sensitiveInputCells = new HashSet();
    private FormulaUsedBlankCellSet _usedBlankCellGroup;

    public CellEvaluationFrame(FormulaCellCacheEntry formulaCellCacheEntry) {
        this._cce = formulaCellCacheEntry;
    }

    private CellCacheEntry[] getSensitiveInputCells() {
        int size = this._sensitiveInputCells.size();
        if (size < 1) {
            return CellCacheEntry.EMPTY_ARRAY;
        }
        CellCacheEntry[] cellCacheEntryArr = new CellCacheEntry[size];
        this._sensitiveInputCells.toArray(cellCacheEntryArr);
        return cellCacheEntryArr;
    }

    public void addSensitiveInputCell(CellCacheEntry cellCacheEntry) {
        this._sensitiveInputCells.add(cellCacheEntry);
    }

    public void addUsedBlankCell(int i10, int i11, int i12, int i13) {
        if (this._usedBlankCellGroup == null) {
            this._usedBlankCellGroup = new FormulaUsedBlankCellSet();
        }
        this._usedBlankCellGroup.addCell(i10, i11, i12, i13);
    }

    public CellCacheEntry getCCE() {
        return this._cce;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(64);
        stringBuffer.append(CellEvaluationFrame.class.getName());
        stringBuffer.append(" []");
        return stringBuffer.toString();
    }

    public void updateFormulaResult(ValueEval valueEval) {
        this._cce.updateFormulaResult(valueEval, getSensitiveInputCells(), this._usedBlankCellGroup);
    }
}
