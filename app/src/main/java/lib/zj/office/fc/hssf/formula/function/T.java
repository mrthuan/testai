package lib.zj.office.fc.hssf.formula.function;

import lib.zj.office.fc.hssf.formula.eval.AreaEval;
import lib.zj.office.fc.hssf.formula.eval.ErrorEval;
import lib.zj.office.fc.hssf.formula.eval.RefEval;
import lib.zj.office.fc.hssf.formula.eval.StringEval;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;

/* loaded from: classes3.dex */
public final class T extends Fixed1ArgFunction {
    @Override // lib.zj.office.fc.hssf.formula.function.Function1Arg
    public ValueEval evaluate(int i10, int i11, ValueEval valueEval) {
        if (valueEval instanceof RefEval) {
            valueEval = ((RefEval) valueEval).getInnerValueEval();
        } else if (valueEval instanceof AreaEval) {
            valueEval = ((AreaEval) valueEval).getRelativeValue(0, 0);
        }
        if (valueEval instanceof StringEval) {
            return valueEval;
        }
        if (valueEval instanceof ErrorEval) {
            return valueEval;
        }
        return StringEval.EMPTY_INSTANCE;
    }
}
