package lib.zj.office.fc.hssf.formula.atp;

import lib.zj.office.fc.hssf.formula.OperationEvaluationContext;
import lib.zj.office.fc.hssf.formula.eval.BoolEval;
import lib.zj.office.fc.hssf.formula.eval.ErrorEval;
import lib.zj.office.fc.hssf.formula.eval.EvaluationException;
import lib.zj.office.fc.hssf.formula.eval.OperandResolver;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;
import lib.zj.office.fc.hssf.formula.function.FreeRefFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ParityFunction implements FreeRefFunction {
    public static final FreeRefFunction IS_EVEN = new ParityFunction(0);
    public static final FreeRefFunction IS_ODD = new ParityFunction(1);
    private final int _desiredParity;

    private ParityFunction(int i10) {
        this._desiredParity = i10;
    }

    private static int evaluateArgParity(ValueEval valueEval, int i10, int i11) {
        double coerceValueToDouble = OperandResolver.coerceValueToDouble(OperandResolver.getSingleValue(valueEval, i10, (short) i11));
        if (coerceValueToDouble < 0.0d) {
            coerceValueToDouble = -coerceValueToDouble;
        }
        return (int) (((long) Math.floor(coerceValueToDouble)) & 1);
    }

    @Override // lib.zj.office.fc.hssf.formula.function.FreeRefFunction
    public ValueEval evaluate(ValueEval[] valueEvalArr, OperationEvaluationContext operationEvaluationContext) {
        boolean z10 = true;
        if (valueEvalArr.length != 1) {
            return ErrorEval.VALUE_INVALID;
        }
        try {
            if (evaluateArgParity(valueEvalArr[0], operationEvaluationContext.getRowIndex(), operationEvaluationContext.getColumnIndex()) != this._desiredParity) {
                z10 = false;
            }
            return BoolEval.valueOf(z10);
        } catch (EvaluationException e10) {
            return e10.getErrorEval();
        }
    }
}
