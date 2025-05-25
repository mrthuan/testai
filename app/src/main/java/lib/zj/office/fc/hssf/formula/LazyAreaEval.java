package lib.zj.office.fc.hssf.formula;

import a0.d;
import lib.zj.office.fc.hssf.formula.eval.AreaEval;
import lib.zj.office.fc.hssf.formula.eval.AreaEvalBase;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;
import lib.zj.office.fc.hssf.formula.ptg.AreaI;
import lib.zj.office.fc.ss.util.CellReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class LazyAreaEval extends AreaEvalBase {
    private final SheetRefEvaluator _evaluator;

    public LazyAreaEval(AreaI areaI, SheetRefEvaluator sheetRefEvaluator) {
        super(areaI);
        this._evaluator = sheetRefEvaluator;
    }

    @Override // lib.zj.office.fc.hssf.formula.eval.AreaEvalBase, lib.zj.office.fc.hssf.formula.eval.AreaEval
    public ValueEval getRelativeValue(int i10, int i11) {
        return this._evaluator.getEvalForCell(65535 & (getFirstRow() + i10), (getFirstColumn() + i11) & FunctionEval.FunctionID.EXTERNAL_FUNC);
    }

    @Override // lib.zj.office.fc.hssf.formula.eval.AreaEvalBase, lib.zj.office.fc.hssf.formula.TwoDEval
    public boolean isSubTotal(int i10, int i11) {
        return this._evaluator.isSubTotal(i10, i11);
    }

    @Override // lib.zj.office.fc.hssf.formula.eval.AreaEval
    public AreaEval offset(int i10, int i11, int i12, int i13) {
        return new LazyAreaEval(new AreaI.OffsetArea(getFirstRow(), getFirstColumn(), i10, i11, i12, i13), this._evaluator);
    }

    public String toString() {
        CellReference cellReference = new CellReference(getFirstRow(), getFirstColumn());
        CellReference cellReference2 = new CellReference(getLastRow(), getLastColumn());
        StringBuffer stringBuffer = new StringBuffer();
        d.h(LazyAreaEval.class, stringBuffer, "[");
        stringBuffer.append(this._evaluator.getSheetName());
        stringBuffer.append('!');
        stringBuffer.append(cellReference.formatAsString());
        stringBuffer.append(':');
        stringBuffer.append(cellReference2.formatAsString());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    @Override // lib.zj.office.fc.hssf.formula.TwoDEval
    public LazyAreaEval getColumn(int i10) {
        if (i10 < getWidth()) {
            int firstColumn = getFirstColumn() + i10;
            return new LazyAreaEval(getFirstRow(), firstColumn, getLastRow(), firstColumn, this._evaluator);
        }
        StringBuilder e10 = androidx.appcompat.view.menu.d.e("Invalid columnIndex ", i10, ".  Allowable range is (0..");
        e10.append(getWidth());
        e10.append(").");
        throw new IllegalArgumentException(e10.toString());
    }

    @Override // lib.zj.office.fc.hssf.formula.TwoDEval
    public LazyAreaEval getRow(int i10) {
        if (i10 < getHeight()) {
            int firstRow = getFirstRow() + i10;
            return new LazyAreaEval(firstRow, getFirstColumn(), firstRow, getLastColumn(), this._evaluator);
        }
        StringBuilder e10 = androidx.appcompat.view.menu.d.e("Invalid rowIndex ", i10, ".  Allowable range is (0..");
        e10.append(getHeight());
        e10.append(").");
        throw new IllegalArgumentException(e10.toString());
    }

    public LazyAreaEval(int i10, int i11, int i12, int i13, SheetRefEvaluator sheetRefEvaluator) {
        super(i10, i11, i12, i13);
        this._evaluator = sheetRefEvaluator;
    }
}
