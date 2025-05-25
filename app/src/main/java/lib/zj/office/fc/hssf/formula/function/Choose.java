package lib.zj.office.fc.hssf.formula.function;

import lib.zj.office.fc.hssf.formula.eval.BlankEval;
import lib.zj.office.fc.hssf.formula.eval.ErrorEval;
import lib.zj.office.fc.hssf.formula.eval.EvaluationException;
import lib.zj.office.fc.hssf.formula.eval.MissingArgEval;
import lib.zj.office.fc.hssf.formula.eval.OperandResolver;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;

/* loaded from: classes3.dex */
public final class Choose implements Function {
    public static int evaluateFirstArg(ValueEval valueEval, int i10, int i11) {
        return OperandResolver.coerceValueToInt(OperandResolver.getSingleValue(valueEval, i10, i11));
    }

    @Override // lib.zj.office.fc.hssf.formula.function.Function
    public ValueEval evaluate(ValueEval[] valueEvalArr, int i10, int i11) {
        if (valueEvalArr.length < 2) {
            return ErrorEval.VALUE_INVALID;
        }
        try {
            int evaluateFirstArg = evaluateFirstArg(valueEvalArr[0], i10, i11);
            if (evaluateFirstArg >= 1 && evaluateFirstArg < valueEvalArr.length) {
                ValueEval singleValue = OperandResolver.getSingleValue(valueEvalArr[evaluateFirstArg], i10, i11);
                if (singleValue == MissingArgEval.instance) {
                    return BlankEval.instance;
                }
                return singleValue;
            }
            return ErrorEval.VALUE_INVALID;
        } catch (EvaluationException e10) {
            return e10.getErrorEval();
        }
    }
}
