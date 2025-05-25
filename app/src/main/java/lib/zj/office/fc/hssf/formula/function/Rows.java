package lib.zj.office.fc.hssf.formula.function;

import lib.zj.office.fc.hssf.formula.TwoDEval;
import lib.zj.office.fc.hssf.formula.eval.ErrorEval;
import lib.zj.office.fc.hssf.formula.eval.NumberEval;
import lib.zj.office.fc.hssf.formula.eval.RefEval;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;

/* loaded from: classes3.dex */
public final class Rows extends Fixed1ArgFunction {
    @Override // lib.zj.office.fc.hssf.formula.function.Function1Arg
    public ValueEval evaluate(int i10, int i11, ValueEval valueEval) {
        int i12;
        if (valueEval instanceof TwoDEval) {
            i12 = ((TwoDEval) valueEval).getHeight();
        } else if (valueEval instanceof RefEval) {
            i12 = 1;
        } else {
            return ErrorEval.VALUE_INVALID;
        }
        return new NumberEval(i12);
    }
}
