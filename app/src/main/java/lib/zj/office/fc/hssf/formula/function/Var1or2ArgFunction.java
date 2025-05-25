package lib.zj.office.fc.hssf.formula.function;

import lib.zj.office.fc.hssf.formula.eval.ErrorEval;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;

/* loaded from: classes3.dex */
abstract class Var1or2ArgFunction implements Function1Arg, Function2Arg {
    @Override // lib.zj.office.fc.hssf.formula.function.Function
    public final ValueEval evaluate(ValueEval[] valueEvalArr, int i10, int i11) {
        int length = valueEvalArr.length;
        if (length != 1) {
            if (length != 2) {
                return ErrorEval.VALUE_INVALID;
            }
            return evaluate(i10, i11, valueEvalArr[0], valueEvalArr[1]);
        }
        return evaluate(i10, i11, valueEvalArr[0]);
    }
}
