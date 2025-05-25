package lib.zj.office.fc.hssf.formula.function;

import b.a;
import lib.zj.office.fc.hssf.formula.TwoDEval;
import lib.zj.office.fc.hssf.formula.eval.BlankEval;
import lib.zj.office.fc.hssf.formula.eval.NumberEval;
import lib.zj.office.fc.hssf.formula.eval.RefEval;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;
import lib.zj.office.fc.hssf.formula.function.CountUtils;

/* loaded from: classes3.dex */
public final class Countblank extends Fixed1ArgFunction {
    private static final CountUtils.I_MatchPredicate predicate = new CountUtils.I_MatchPredicate() { // from class: lib.zj.office.fc.hssf.formula.function.Countblank.1
        @Override // lib.zj.office.fc.hssf.formula.function.CountUtils.I_MatchPredicate
        public boolean matches(ValueEval valueEval) {
            if (valueEval == BlankEval.instance) {
                return true;
            }
            return false;
        }
    };

    @Override // lib.zj.office.fc.hssf.formula.function.Function1Arg
    public ValueEval evaluate(int i10, int i11, ValueEval valueEval) {
        int countMatchingCellsInArea;
        if (valueEval instanceof RefEval) {
            countMatchingCellsInArea = CountUtils.countMatchingCell((RefEval) valueEval, predicate);
        } else if (valueEval instanceof TwoDEval) {
            countMatchingCellsInArea = CountUtils.countMatchingCellsInArea((TwoDEval) valueEval, predicate);
        } else {
            throw new IllegalArgumentException(a.e(valueEval, new StringBuilder("Bad range arg type ("), ")"));
        }
        return new NumberEval(countMatchingCellsInArea);
    }
}
