package lib.zj.office.fc.hssf.formula.function;

import java.util.Date;
import lib.zj.office.fc.hssf.formula.eval.NumberEval;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;
import lib.zj.office.ss.util.DateUtil;

/* loaded from: classes3.dex */
public final class Now extends Fixed0ArgFunction {
    @Override // lib.zj.office.fc.hssf.formula.function.Function0Arg
    public ValueEval evaluate(int i10, int i11) {
        return new NumberEval(DateUtil.getExcelDate(new Date(System.currentTimeMillis())));
    }
}
