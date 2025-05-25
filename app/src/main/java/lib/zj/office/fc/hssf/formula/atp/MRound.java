package lib.zj.office.fc.hssf.formula.atp;

import lib.zj.office.fc.hssf.formula.OperationEvaluationContext;
import lib.zj.office.fc.hssf.formula.eval.ErrorEval;
import lib.zj.office.fc.hssf.formula.eval.EvaluationException;
import lib.zj.office.fc.hssf.formula.eval.NumberEval;
import lib.zj.office.fc.hssf.formula.eval.OperandResolver;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;
import lib.zj.office.fc.hssf.formula.function.FreeRefFunction;
import lib.zj.office.fc.hssf.formula.function.NumericFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class MRound implements FreeRefFunction {
    public static final FreeRefFunction instance = new MRound();

    private MRound() {
    }

    @Override // lib.zj.office.fc.hssf.formula.function.FreeRefFunction
    public ValueEval evaluate(ValueEval[] valueEvalArr, OperationEvaluationContext operationEvaluationContext) {
        if (valueEvalArr.length != 2) {
            return ErrorEval.VALUE_INVALID;
        }
        try {
            double coerceValueToDouble = OperandResolver.coerceValueToDouble(OperandResolver.getSingleValue(valueEvalArr[0], operationEvaluationContext.getRowIndex(), operationEvaluationContext.getColumnIndex()));
            double coerceValueToDouble2 = OperandResolver.coerceValueToDouble(OperandResolver.getSingleValue(valueEvalArr[1], operationEvaluationContext.getRowIndex(), operationEvaluationContext.getColumnIndex()));
            double d10 = 0.0d;
            if (coerceValueToDouble2 != 0.0d) {
                if (coerceValueToDouble * coerceValueToDouble2 >= 0.0d) {
                    d10 = coerceValueToDouble2 * Math.round(coerceValueToDouble / coerceValueToDouble2);
                } else {
                    throw new EvaluationException(ErrorEval.NUM_ERROR);
                }
            }
            NumericFunction.checkValue(d10);
            return new NumberEval(d10);
        } catch (EvaluationException e10) {
            return e10.getErrorEval();
        }
    }
}
