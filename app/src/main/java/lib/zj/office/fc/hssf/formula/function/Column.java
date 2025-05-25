package lib.zj.office.fc.hssf.formula.function;

import lib.zj.office.fc.hssf.formula.eval.AreaEval;
import lib.zj.office.fc.hssf.formula.eval.ErrorEval;
import lib.zj.office.fc.hssf.formula.eval.NumberEval;
import lib.zj.office.fc.hssf.formula.eval.RefEval;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;

/* loaded from: classes3.dex */
public final class Column implements Function0Arg, Function1Arg {
    @Override // lib.zj.office.fc.hssf.formula.function.Function0Arg
    public ValueEval evaluate(int i10, int i11) {
        return new NumberEval(i11 + 1);
    }

    @Override // lib.zj.office.fc.hssf.formula.function.Function1Arg
    public ValueEval evaluate(int i10, int i11, ValueEval valueEval) {
        int column;
        if (valueEval instanceof AreaEval) {
            column = ((AreaEval) valueEval).getFirstColumn();
        } else if (valueEval instanceof RefEval) {
            column = ((RefEval) valueEval).getColumn();
        } else {
            return ErrorEval.VALUE_INVALID;
        }
        return new NumberEval(column + 1);
    }

    @Override // lib.zj.office.fc.hssf.formula.function.Function
    public ValueEval evaluate(ValueEval[] valueEvalArr, int i10, int i11) {
        int length = valueEvalArr.length;
        if (length != 0) {
            if (length != 1) {
                return ErrorEval.VALUE_INVALID;
            }
            return evaluate(i10, i11, valueEvalArr[0]);
        }
        return new NumberEval(i11 + 1);
    }
}
