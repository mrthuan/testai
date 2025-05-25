package lib.zj.office.fc.hssf.formula.function;

import lib.zj.office.fc.hssf.formula.eval.AreaEval;
import lib.zj.office.fc.hssf.formula.eval.ErrorEval;
import lib.zj.office.fc.hssf.formula.eval.EvaluationException;
import lib.zj.office.fc.hssf.formula.eval.NumberEval;
import lib.zj.office.fc.hssf.formula.eval.RefEval;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;
import lib.zj.office.fc.hssf.formula.function.CountUtils;

/* loaded from: classes3.dex */
public final class Sumif extends Var2or3ArgFunction {
    private static double accumulate(AreaEval areaEval, CountUtils.I_MatchPredicate i_MatchPredicate, AreaEval areaEval2, int i10, int i11) {
        if (!i_MatchPredicate.matches(areaEval.getRelativeValue(i10, i11))) {
            return 0.0d;
        }
        ValueEval relativeValue = areaEval2.getRelativeValue(i10, i11);
        if (!(relativeValue instanceof NumberEval)) {
            return 0.0d;
        }
        return ((NumberEval) relativeValue).getNumberValue();
    }

    private static AreaEval convertRangeArg(ValueEval valueEval) {
        if (valueEval instanceof AreaEval) {
            return (AreaEval) valueEval;
        }
        if (valueEval instanceof RefEval) {
            return ((RefEval) valueEval).offset(0, 0, 0, 0);
        }
        throw new EvaluationException(ErrorEval.VALUE_INVALID);
    }

    private static AreaEval createSumRange(ValueEval valueEval, AreaEval areaEval) {
        if (valueEval instanceof AreaEval) {
            return ((AreaEval) valueEval).offset(0, areaEval.getHeight() - 1, 0, areaEval.getWidth() - 1);
        }
        if (valueEval instanceof RefEval) {
            return ((RefEval) valueEval).offset(0, areaEval.getHeight() - 1, 0, areaEval.getWidth() - 1);
        }
        throw new EvaluationException(ErrorEval.VALUE_INVALID);
    }

    private static ValueEval eval(int i10, int i11, ValueEval valueEval, AreaEval areaEval, AreaEval areaEval2) {
        return new NumberEval(sumMatchingCells(areaEval, Countif.createCriteriaPredicate(valueEval, i10, i11), areaEval2));
    }

    private static double sumMatchingCells(AreaEval areaEval, CountUtils.I_MatchPredicate i_MatchPredicate, AreaEval areaEval2) {
        int height = areaEval.getHeight();
        int width = areaEval.getWidth();
        double d10 = 0.0d;
        for (int i10 = 0; i10 < height; i10++) {
            for (int i11 = 0; i11 < width; i11++) {
                d10 += accumulate(areaEval, i_MatchPredicate, areaEval2, i10, i11);
            }
        }
        return d10;
    }

    @Override // lib.zj.office.fc.hssf.formula.function.Function2Arg
    public ValueEval evaluate(int i10, int i11, ValueEval valueEval, ValueEval valueEval2) {
        try {
            AreaEval convertRangeArg = convertRangeArg(valueEval);
            return eval(i10, i11, valueEval2, convertRangeArg, convertRangeArg);
        } catch (EvaluationException e10) {
            return e10.getErrorEval();
        }
    }

    @Override // lib.zj.office.fc.hssf.formula.function.Function3Arg
    public ValueEval evaluate(int i10, int i11, ValueEval valueEval, ValueEval valueEval2, ValueEval valueEval3) {
        try {
            AreaEval convertRangeArg = convertRangeArg(valueEval);
            return eval(i10, i11, valueEval2, convertRangeArg, createSumRange(valueEval3, convertRangeArg));
        } catch (EvaluationException e10) {
            return e10.getErrorEval();
        }
    }
}
