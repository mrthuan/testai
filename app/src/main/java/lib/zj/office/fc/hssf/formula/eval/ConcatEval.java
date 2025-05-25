package lib.zj.office.fc.hssf.formula.eval;

import b.a;
import lib.zj.office.fc.hssf.formula.function.Fixed2ArgFunction;
import lib.zj.office.fc.hssf.formula.function.Function;

/* loaded from: classes3.dex */
public final class ConcatEval extends Fixed2ArgFunction {
    public static final Function instance = new ConcatEval();

    private ConcatEval() {
    }

    private Object getText(ValueEval valueEval) {
        if (valueEval instanceof StringValueEval) {
            return ((StringValueEval) valueEval).getStringValue();
        }
        if (valueEval == BlankEval.instance) {
            return "";
        }
        throw new IllegalAccessError(a.e(valueEval, new StringBuilder("Unexpected value type ("), ")"));
    }

    @Override // lib.zj.office.fc.hssf.formula.function.Function2Arg
    public ValueEval evaluate(int i10, int i11, ValueEval valueEval, ValueEval valueEval2) {
        try {
            ValueEval singleValue = OperandResolver.getSingleValue(valueEval, i10, i11);
            ValueEval singleValue2 = OperandResolver.getSingleValue(valueEval2, i10, i11);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getText(singleValue));
            sb2.append(getText(singleValue2));
            return new StringEval(sb2.toString());
        } catch (EvaluationException e10) {
            return e10.getErrorEval();
        }
    }
}
