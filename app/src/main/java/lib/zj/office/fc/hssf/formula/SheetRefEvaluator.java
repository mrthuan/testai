package lib.zj.office.fc.hssf.formula;

import a0.a;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;
import lib.zj.office.fc.hssf.formula.ptg.FuncVarPtg;
import lib.zj.office.fc.hssf.formula.ptg.Ptg;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class SheetRefEvaluator {
    private final WorkbookEvaluator _bookEvaluator;
    private EvaluationSheet _sheet;
    private final int _sheetIndex;
    private final EvaluationTracker _tracker;

    public SheetRefEvaluator(WorkbookEvaluator workbookEvaluator, EvaluationTracker evaluationTracker, int i10) {
        if (i10 >= 0) {
            this._bookEvaluator = workbookEvaluator;
            this._tracker = evaluationTracker;
            this._sheetIndex = i10;
            return;
        }
        throw new IllegalArgumentException(a.g("Invalid sheetIndex: ", i10, "."));
    }

    private EvaluationSheet getSheet() {
        if (this._sheet == null) {
            this._sheet = this._bookEvaluator.getSheet(this._sheetIndex);
        }
        return this._sheet;
    }

    public ValueEval getEvalForCell(int i10, int i11) {
        return this._bookEvaluator.evaluateReference(getSheet(), this._sheetIndex, i10, i11, this._tracker);
    }

    public String getSheetName() {
        return this._bookEvaluator.getSheetName(this._sheetIndex);
    }

    public boolean isSubTotal(int i10, int i11) {
        Ptg[] formulaTokens;
        EvaluationCell cell = getSheet().getCell(i10, i11);
        if (cell == null || cell.getCellType() != 2) {
            return false;
        }
        for (Ptg ptg : this._bookEvaluator.getWorkbook().getFormulaTokens(cell)) {
            if ((ptg instanceof FuncVarPtg) && "SUBTOTAL".equals(((FuncVarPtg) ptg).getName())) {
                return true;
            }
        }
        return false;
    }
}
