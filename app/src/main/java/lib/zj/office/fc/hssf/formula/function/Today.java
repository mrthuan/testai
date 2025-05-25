package lib.zj.office.fc.hssf.formula.function;

import java.util.GregorianCalendar;
import lib.zj.office.fc.hssf.formula.eval.NumberEval;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;
import lib.zj.office.ss.util.DateUtil;

/* loaded from: classes3.dex */
public final class Today extends Fixed0ArgFunction {
    @Override // lib.zj.office.fc.hssf.formula.function.Function0Arg
    public ValueEval evaluate(int i10, int i11) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5), 0, 0, 0);
        gregorianCalendar.set(14, 0);
        return new NumberEval(DateUtil.getExcelDate(gregorianCalendar.getTime()));
    }
}
