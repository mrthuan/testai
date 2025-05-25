package lib.zj.office.fc.hssf.formula.function;

import lib.zj.office.fc.hssf.formula.eval.ErrorEval;
import lib.zj.office.fc.hssf.formula.eval.EvaluationException;
import lib.zj.office.fc.hssf.formula.eval.NotImplementedException;
import lib.zj.office.fc.hssf.formula.eval.OperandResolver;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;

/* loaded from: classes3.dex */
public class Subtotal implements Function {
    private static Function findFunction(int i10) {
        switch (i10) {
            case 1:
                return AggregateFunction.subtotalInstance(AggregateFunction.AVERAGE);
            case 2:
                return Count.subtotalInstance();
            case 3:
                return Counta.subtotalInstance();
            case 4:
                return AggregateFunction.subtotalInstance(AggregateFunction.MAX);
            case 5:
                return AggregateFunction.subtotalInstance(AggregateFunction.MIN);
            case 6:
                return AggregateFunction.subtotalInstance(AggregateFunction.PRODUCT);
            case 7:
                return AggregateFunction.subtotalInstance(AggregateFunction.STDEV);
            case 8:
                throw new NotImplementedException("STDEVP");
            case 9:
                return AggregateFunction.subtotalInstance(AggregateFunction.SUM);
            case 10:
                throw new NotImplementedException("VAR");
            case 11:
                throw new NotImplementedException("VARP");
            default:
                if (i10 > 100 && i10 < 112) {
                    throw new NotImplementedException("SUBTOTAL - with 'exclude hidden values' option");
                }
                throw EvaluationException.invalidValue();
        }
    }

    @Override // lib.zj.office.fc.hssf.formula.function.Function
    public ValueEval evaluate(ValueEval[] valueEvalArr, int i10, int i11) {
        int length = valueEvalArr.length - 1;
        if (length < 1) {
            return ErrorEval.VALUE_INVALID;
        }
        try {
            Function findFunction = findFunction(OperandResolver.coerceValueToInt(OperandResolver.getSingleValue(valueEvalArr[0], i10, i11)));
            ValueEval[] valueEvalArr2 = new ValueEval[length];
            System.arraycopy(valueEvalArr, 1, valueEvalArr2, 0, length);
            return findFunction.evaluate(valueEvalArr2, i10, i11);
        } catch (EvaluationException e10) {
            return e10.getErrorEval();
        }
    }
}
