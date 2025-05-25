package lib.zj.office.fc.hssf.formula.function;

import lib.zj.office.fc.hssf.formula.eval.ErrorEval;
import lib.zj.office.fc.hssf.formula.eval.EvaluationException;
import lib.zj.office.fc.hssf.formula.eval.MissingArgEval;
import lib.zj.office.fc.hssf.formula.eval.NumberEval;
import lib.zj.office.fc.hssf.formula.eval.OperandResolver;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;

/* loaded from: classes3.dex */
public final class TimeFunc extends Fixed3ArgFunction {
    private static final int HOURS_PER_DAY = 24;
    private static final int SECONDS_PER_DAY = 86400;
    private static final int SECONDS_PER_HOUR = 3600;
    private static final int SECONDS_PER_MINUTE = 60;

    private static int evalArg(ValueEval valueEval, int i10, int i11) {
        if (valueEval == MissingArgEval.instance) {
            return 0;
        }
        return OperandResolver.coerceValueToInt(OperandResolver.getSingleValue(valueEval, i10, i11));
    }

    @Override // lib.zj.office.fc.hssf.formula.function.Function3Arg
    public ValueEval evaluate(int i10, int i11, ValueEval valueEval, ValueEval valueEval2, ValueEval valueEval3) {
        try {
            return new NumberEval(evaluate(evalArg(valueEval, i10, i11), evalArg(valueEval2, i10, i11), evalArg(valueEval3, i10, i11)));
        } catch (EvaluationException e10) {
            return e10.getErrorEval();
        }
    }

    private static double evaluate(int i10, int i11, int i12) {
        if (i10 > 32767 || i11 > 32767 || i12 > 32767) {
            throw new EvaluationException(ErrorEval.VALUE_INVALID);
        }
        int i13 = (i11 * 60) + (i10 * SECONDS_PER_HOUR) + i12;
        if (i13 >= 0) {
            return (i13 % 86400) / 86400.0d;
        }
        throw new EvaluationException(ErrorEval.VALUE_INVALID);
    }
}
