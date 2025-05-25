package lib.zj.office.fc.hssf.formula;

import a0.d;
import lib.zj.office.fc.hssf.formula.eval.AreaEval;
import lib.zj.office.fc.hssf.formula.eval.RefEvalBase;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;
import lib.zj.office.fc.hssf.formula.ptg.AreaI;
import lib.zj.office.fc.ss.util.CellReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class LazyRefEval extends RefEvalBase {
    private final SheetRefEvaluator _evaluator;

    public LazyRefEval(int i10, int i11, SheetRefEvaluator sheetRefEvaluator) {
        super(i10, i11);
        if (sheetRefEvaluator != null) {
            this._evaluator = sheetRefEvaluator;
            return;
        }
        throw new IllegalArgumentException("sre must not be null");
    }

    @Override // lib.zj.office.fc.hssf.formula.eval.RefEval
    public ValueEval getInnerValueEval() {
        return this._evaluator.getEvalForCell(getRow(), getColumn());
    }

    @Override // lib.zj.office.fc.hssf.formula.eval.RefEval
    public AreaEval offset(int i10, int i11, int i12, int i13) {
        return new LazyAreaEval(new AreaI.OffsetArea(getRow(), getColumn(), i10, i11, i12, i13), this._evaluator);
    }

    public String toString() {
        CellReference cellReference = new CellReference(getRow(), getColumn());
        StringBuffer stringBuffer = new StringBuffer();
        d.h(LazyRefEval.class, stringBuffer, "[");
        stringBuffer.append(this._evaluator.getSheetName());
        stringBuffer.append('!');
        stringBuffer.append(cellReference.formatAsString());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
