package lib.zj.office.fc.hssf.formula.function;

import java.util.GregorianCalendar;
import lib.zj.office.fc.hssf.formula.eval.ErrorEval;
import lib.zj.office.fc.hssf.formula.eval.EvaluationException;
import lib.zj.office.fc.hssf.formula.eval.NumberEval;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;
import lib.zj.office.ss.util.DateUtil;

/* loaded from: classes3.dex */
public final class DateFunc extends Fixed3ArgFunction {
    public static final Function instance = new DateFunc();

    private DateFunc() {
    }

    private static int getYear(double d10) {
        int i10 = (int) d10;
        if (i10 < 0) {
            return -1;
        }
        if (i10 < 1900) {
            return i10 + 1900;
        }
        return i10;
    }

    @Override // lib.zj.office.fc.hssf.formula.function.Function3Arg
    public ValueEval evaluate(int i10, int i11, ValueEval valueEval, ValueEval valueEval2, ValueEval valueEval3) {
        try {
            double evaluate = evaluate(getYear(NumericFunction.singleOperandEvaluate(valueEval, i10, i11)), (int) (NumericFunction.singleOperandEvaluate(valueEval2, i10, i11) - 1.0d), (int) NumericFunction.singleOperandEvaluate(valueEval3, i10, i11));
            NumericFunction.checkValue(evaluate);
            return new NumberEval(evaluate);
        } catch (EvaluationException e10) {
            return e10.getErrorEval();
        }
    }

    private static double evaluate(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < 0 || i12 < 0) {
            throw new EvaluationException(ErrorEval.VALUE_INVALID);
        }
        if (i10 == 1900 && i11 == 1 && i12 == 29) {
            return 60.0d;
        }
        if (i10 == 1900 && ((i11 == 0 && i12 >= 60) || (i11 == 1 && i12 >= 30))) {
            i12--;
        }
        int i13 = i12;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(i10, i11, i13, 0, 0, 0);
        gregorianCalendar.set(14, 0);
        return DateUtil.getExcelDate(gregorianCalendar.getTime(), false);
    }
}
