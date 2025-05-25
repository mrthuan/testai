package lib.zj.office.fc.hssf.formula.function;

import lib.zj.office.fc.hssf.formula.eval.ErrorEval;
import lib.zj.office.fc.hssf.formula.eval.EvaluationException;
import lib.zj.office.fc.hssf.formula.eval.NumberEval;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;
import lib.zj.office.fc.hssf.formula.function.AggregateFunction;

/* loaded from: classes3.dex */
public final class Npv implements Function {
    @Override // lib.zj.office.fc.hssf.formula.function.Function
    public ValueEval evaluate(ValueEval[] valueEvalArr, int i10, int i11) {
        if (valueEvalArr.length < 2) {
            return ErrorEval.VALUE_INVALID;
        }
        try {
            double singleOperandEvaluate = NumericFunction.singleOperandEvaluate(valueEvalArr[0], i10, i11);
            int length = valueEvalArr.length - 1;
            ValueEval[] valueEvalArr2 = new ValueEval[length];
            System.arraycopy(valueEvalArr, 1, valueEvalArr2, 0, length);
            double npv = FinanceLib.npv(singleOperandEvaluate, AggregateFunction.ValueCollector.collectValues(valueEvalArr2));
            NumericFunction.checkValue(npv);
            return new NumberEval(npv);
        } catch (EvaluationException e10) {
            return e10.getErrorEval();
        }
    }
}
