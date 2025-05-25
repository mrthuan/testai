package lib.zj.office.fc.hssf.formula.function;

import lib.zj.office.fc.hssf.formula.TwoDEval;
import lib.zj.office.fc.hssf.formula.eval.BlankEval;
import lib.zj.office.fc.hssf.formula.eval.ErrorEval;
import lib.zj.office.fc.hssf.formula.eval.NumberEval;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;
import lib.zj.office.fc.hssf.formula.function.CountUtils;

/* loaded from: classes3.dex */
public final class Counta implements Function {
    private static final CountUtils.I_MatchPredicate defaultPredicate = new CountUtils.I_MatchPredicate() { // from class: lib.zj.office.fc.hssf.formula.function.Counta.1
        @Override // lib.zj.office.fc.hssf.formula.function.CountUtils.I_MatchPredicate
        public boolean matches(ValueEval valueEval) {
            if (valueEval == BlankEval.instance) {
                return false;
            }
            return true;
        }
    };
    private static final CountUtils.I_MatchPredicate subtotalPredicate = new CountUtils.I_MatchAreaPredicate() { // from class: lib.zj.office.fc.hssf.formula.function.Counta.2
        @Override // lib.zj.office.fc.hssf.formula.function.CountUtils.I_MatchPredicate
        public boolean matches(ValueEval valueEval) {
            return Counta.defaultPredicate.matches(valueEval);
        }

        @Override // lib.zj.office.fc.hssf.formula.function.CountUtils.I_MatchAreaPredicate
        public boolean matches(TwoDEval twoDEval, int i10, int i11) {
            return !twoDEval.isSubTotal(i10, i11);
        }
    };
    private final CountUtils.I_MatchPredicate _predicate;

    public Counta() {
        this._predicate = defaultPredicate;
    }

    public static Counta subtotalInstance() {
        return new Counta(subtotalPredicate);
    }

    @Override // lib.zj.office.fc.hssf.formula.function.Function
    public ValueEval evaluate(ValueEval[] valueEvalArr, int i10, int i11) {
        int length = valueEvalArr.length;
        if (length < 1) {
            return ErrorEval.VALUE_INVALID;
        }
        if (length > 30) {
            return ErrorEval.VALUE_INVALID;
        }
        int i12 = 0;
        for (ValueEval valueEval : valueEvalArr) {
            i12 += CountUtils.countArg(valueEval, this._predicate);
        }
        return new NumberEval(i12);
    }

    private Counta(CountUtils.I_MatchPredicate i_MatchPredicate) {
        this._predicate = i_MatchPredicate;
    }
}
