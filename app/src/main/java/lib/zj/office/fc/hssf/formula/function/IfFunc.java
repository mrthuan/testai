package lib.zj.office.fc.hssf.formula.function;

import lib.zj.office.fc.hssf.formula.eval.BlankEval;
import lib.zj.office.fc.hssf.formula.eval.BoolEval;
import lib.zj.office.fc.hssf.formula.eval.EvaluationException;
import lib.zj.office.fc.hssf.formula.eval.MissingArgEval;
import lib.zj.office.fc.hssf.formula.eval.OperandResolver;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;

/* loaded from: classes3.dex */
public final class IfFunc extends Var2or3ArgFunction {
    public static boolean evaluateFirstArg(ValueEval valueEval, int i10, int i11) {
        Boolean coerceValueToBoolean = OperandResolver.coerceValueToBoolean(OperandResolver.getSingleValue(valueEval, i10, i11), false);
        if (coerceValueToBoolean == null) {
            return false;
        }
        return coerceValueToBoolean.booleanValue();
    }

    @Override // lib.zj.office.fc.hssf.formula.function.Function2Arg
    public ValueEval evaluate(int i10, int i11, ValueEval valueEval, ValueEval valueEval2) {
        try {
            if (evaluateFirstArg(valueEval, i10, i11)) {
                return valueEval2 == MissingArgEval.instance ? BlankEval.instance : valueEval2;
            }
            return BoolEval.FALSE;
        } catch (EvaluationException e10) {
            return e10.getErrorEval();
        }
    }

    @Override // lib.zj.office.fc.hssf.formula.function.Function3Arg
    public ValueEval evaluate(int i10, int i11, ValueEval valueEval, ValueEval valueEval2, ValueEval valueEval3) {
        try {
            return evaluateFirstArg(valueEval, i10, i11) ? valueEval2 == MissingArgEval.instance ? BlankEval.instance : valueEval2 : valueEval3 == MissingArgEval.instance ? BlankEval.instance : valueEval3;
        } catch (EvaluationException e10) {
            return e10.getErrorEval();
        }
    }
}
