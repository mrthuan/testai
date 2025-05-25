package lib.zj.office.fc.hssf.formula.function;

import lib.zj.office.fc.hssf.formula.eval.ErrorEval;
import lib.zj.office.fc.hssf.formula.eval.NumberEval;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;

/* loaded from: classes3.dex */
public class Weekday extends Var1or2ArgFunction {
    private static final ValueEval DEFAULT_ARG1 = new NumberEval(1.0d);

    @Override // lib.zj.office.fc.hssf.formula.function.Function1Arg
    public ValueEval evaluate(int i10, int i11, ValueEval valueEval) {
        return evaluate(i10, i11, valueEval, DEFAULT_ARG1);
    }

    @Override // lib.zj.office.fc.hssf.formula.function.Function2Arg
    public ValueEval evaluate(int i10, int i11, ValueEval valueEval, ValueEval valueEval2) {
        ValueEval evaluate = ((CalendarFieldFunction) CalendarFieldFunction.WEEKDAY).evaluate(i10, i11, valueEval);
        if (valueEval2 instanceof NumberEval) {
            int round = (int) Math.round(((NumberEval) evaluate).getNumberValue());
            int round2 = (int) Math.round(((NumberEval) valueEval2).getNumberValue());
            if (round2 != 1) {
                if (round2 == 2) {
                    int i12 = round - 1;
                    if (i12 == 0) {
                        i12 = 7;
                    }
                    return new NumberEval(i12);
                } else if (round2 != 3) {
                    return ErrorEval.valueOf(36);
                } else {
                    int i13 = round - 2;
                    if (i13 < 0) {
                        i13 = 6;
                    }
                    return new NumberEval(i13);
                }
            }
            return evaluate;
        }
        return evaluate;
    }
}
