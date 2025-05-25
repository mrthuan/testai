package lib.zj.office.fc.hssf.formula.eval;

import lib.zj.office.fc.hssf.formula.function.Fixed1ArgFunction;
import lib.zj.office.fc.hssf.formula.function.Function;

/* loaded from: classes3.dex */
public final class UnaryMinusEval extends Fixed1ArgFunction {
    public static final Function instance = new UnaryMinusEval();

    private UnaryMinusEval() {
    }

    @Override // lib.zj.office.fc.hssf.formula.function.Function1Arg
    public ValueEval evaluate(int i10, int i11, ValueEval valueEval) {
        try {
            double coerceValueToDouble = OperandResolver.coerceValueToDouble(OperandResolver.getSingleValue(valueEval, i10, i11));
            if (coerceValueToDouble == 0.0d) {
                return NumberEval.ZERO;
            }
            return new NumberEval(-coerceValueToDouble);
        } catch (EvaluationException e10) {
            return e10.getErrorEval();
        }
    }
}
