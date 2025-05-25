package lib.zj.office.fc.hssf.formula.function;

import java.util.Calendar;
import java.util.GregorianCalendar;
import lib.zj.office.fc.hssf.formula.eval.EvaluationException;
import lib.zj.office.fc.hssf.formula.eval.NumberEval;
import lib.zj.office.fc.hssf.formula.eval.OperandResolver;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;
import lib.zj.office.ss.util.DateUtil;

/* loaded from: classes3.dex */
public class Days360 extends Var2or3ArgFunction {
    private static Calendar getDate(double d10) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(DateUtil.getJavaDate(d10, false));
        return gregorianCalendar;
    }

    private static Calendar getEndingDateAccordingToStartingDate(double d10, Calendar calendar) {
        Calendar date = getDate(d10);
        date.setTime(DateUtil.getJavaDate(d10, false));
        if (isLastDayOfMonth(date) && calendar.get(5) < 30) {
            return getFirstDayOfNextMonth(date);
        }
        return date;
    }

    private static Calendar getFirstDayOfNextMonth(Calendar calendar) {
        Calendar calendar2 = (Calendar) calendar.clone();
        if (calendar.get(2) < 11) {
            calendar2.set(2, calendar.get(2) + 1);
        } else {
            calendar2.set(2, 1);
            calendar2.set(1, calendar.get(1) + 1);
        }
        calendar2.set(5, 1);
        return calendar2;
    }

    private static Calendar getStartingDate(double d10) {
        Calendar date = getDate(d10);
        if (isLastDayOfMonth(date)) {
            date.set(5, 30);
        }
        return date;
    }

    private static boolean isLastDayOfMonth(Calendar calendar) {
        Calendar calendar2 = (Calendar) calendar.clone();
        calendar2.add(2, 1);
        calendar2.add(5, -1);
        if (calendar.get(5) == calendar2.get(5)) {
            return true;
        }
        return false;
    }

    @Override // lib.zj.office.fc.hssf.formula.function.Function2Arg
    public ValueEval evaluate(int i10, int i11, ValueEval valueEval, ValueEval valueEval2) {
        try {
            return new NumberEval(evaluate(NumericFunction.singleOperandEvaluate(valueEval, i10, i11), NumericFunction.singleOperandEvaluate(valueEval2, i10, i11), false));
        } catch (EvaluationException e10) {
            return e10.getErrorEval();
        }
    }

    @Override // lib.zj.office.fc.hssf.formula.function.Function3Arg
    public ValueEval evaluate(int i10, int i11, ValueEval valueEval, ValueEval valueEval2, ValueEval valueEval3) {
        try {
            double singleOperandEvaluate = NumericFunction.singleOperandEvaluate(valueEval, i10, i11);
            double singleOperandEvaluate2 = NumericFunction.singleOperandEvaluate(valueEval2, i10, i11);
            ValueEval singleValue = OperandResolver.getSingleValue(valueEval3, i10, i11);
            boolean z10 = false;
            Boolean coerceValueToBoolean = OperandResolver.coerceValueToBoolean(singleValue, false);
            if (coerceValueToBoolean != null) {
                z10 = coerceValueToBoolean.booleanValue();
            }
            return new NumberEval(evaluate(singleOperandEvaluate, singleOperandEvaluate2, z10));
        } catch (EvaluationException e10) {
            return e10.getErrorEval();
        }
    }

    private static double evaluate(double d10, double d11, boolean z10) {
        Calendar startingDate = getStartingDate(d10);
        Calendar endingDateAccordingToStartingDate = getEndingDateAccordingToStartingDate(d11, startingDate);
        int i10 = startingDate.get(5);
        int i11 = endingDateAccordingToStartingDate.get(2) * 30;
        return (endingDateAccordingToStartingDate.get(5) + (i11 + ((endingDateAccordingToStartingDate.get(1) - startingDate.get(1)) * 360))) - (i10 + (startingDate.get(2) * 30));
    }
}
