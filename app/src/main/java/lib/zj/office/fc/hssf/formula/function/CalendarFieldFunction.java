package lib.zj.office.fc.hssf.formula.function;

import java.util.Date;
import java.util.GregorianCalendar;
import lib.zj.office.fc.hssf.formula.eval.ErrorEval;
import lib.zj.office.fc.hssf.formula.eval.EvaluationException;
import lib.zj.office.fc.hssf.formula.eval.NumberEval;
import lib.zj.office.fc.hssf.formula.eval.OperandResolver;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;
import lib.zj.office.ss.util.DateUtil;

/* loaded from: classes3.dex */
public final class CalendarFieldFunction extends Fixed1ArgFunction {
    private final int _dateFieldId;
    public static final Function YEAR = new CalendarFieldFunction(1);
    public static final Function MONTH = new CalendarFieldFunction(2);
    public static final Function WEEKDAY = new CalendarFieldFunction(7);
    public static final Function DAY = new CalendarFieldFunction(5);
    public static final Function HOUR = new CalendarFieldFunction(11);
    public static final Function MINUTE = new CalendarFieldFunction(12);
    public static final Function SECOND = new CalendarFieldFunction(13);

    private CalendarFieldFunction(int i10) {
        this._dateFieldId = i10;
    }

    private int getCalField(double d10) {
        if (((int) d10) == 0) {
            int i10 = this._dateFieldId;
            if (i10 != 1) {
                if (i10 == 2) {
                    return 1;
                }
                if (i10 == 5) {
                    return 0;
                }
            } else {
                return 1900;
            }
        }
        Date javaDate = DateUtil.getJavaDate(d10, false);
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(javaDate);
        int i11 = gregorianCalendar.get(this._dateFieldId);
        if (this._dateFieldId == 2) {
            return i11 + 1;
        }
        return i11;
    }

    @Override // lib.zj.office.fc.hssf.formula.function.Function1Arg
    public final ValueEval evaluate(int i10, int i11, ValueEval valueEval) {
        try {
            double coerceValueToDouble = OperandResolver.coerceValueToDouble(OperandResolver.getSingleValue(valueEval, i10, i11));
            if (coerceValueToDouble < 0.0d) {
                return ErrorEval.NUM_ERROR;
            }
            return new NumberEval(getCalField(coerceValueToDouble));
        } catch (EvaluationException e10) {
            return e10.getErrorEval();
        }
    }
}
