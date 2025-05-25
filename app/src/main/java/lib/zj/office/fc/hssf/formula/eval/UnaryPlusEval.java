package lib.zj.office.fc.hssf.formula.eval;

import lib.zj.office.fc.hssf.formula.function.Fixed1ArgFunction;
import lib.zj.office.fc.hssf.formula.function.Function;

/* loaded from: classes3.dex */
public final class UnaryPlusEval extends Fixed1ArgFunction {
    public static final Function instance = new UnaryPlusEval();

    private UnaryPlusEval() {
    }

    @Override // lib.zj.office.fc.hssf.formula.function.Function1Arg
    public ValueEval evaluate(int i10, int i11, ValueEval valueEval) {
        try {
            ValueEval singleValue = OperandResolver.getSingleValue(valueEval, i10, i11);
            if (singleValue instanceof StringEval) {
                return singleValue;
            }
            return new NumberEval(OperandResolver.coerceValueToDouble(singleValue));
        } catch (EvaluationException e10) {
            return e10.getErrorEval();
        }
    }
}
