package lib.zj.office.fc.hssf.formula.function;

import lib.zj.office.fc.hssf.formula.eval.ErrorEval;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;

/* loaded from: classes3.dex */
abstract class Var3or4ArgFunction implements Function3Arg, Function4Arg {
    @Override // lib.zj.office.fc.hssf.formula.function.Function
    public final ValueEval evaluate(ValueEval[] valueEvalArr, int i10, int i11) {
        int length = valueEvalArr.length;
        if (length != 3) {
            if (length != 4) {
                return ErrorEval.VALUE_INVALID;
            }
            return evaluate(i10, i11, valueEvalArr[0], valueEvalArr[1], valueEvalArr[2], valueEvalArr[3]);
        }
        return evaluate(i10, i11, valueEvalArr[0], valueEvalArr[1], valueEvalArr[2]);
    }
}
