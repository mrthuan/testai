package lib.zj.office.fc.hssf.formula.function;

import lib.zj.office.fc.hssf.formula.TwoDEval;
import lib.zj.office.fc.hssf.formula.eval.RefEval;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;

/* loaded from: classes3.dex */
final class CountUtils {

    /* loaded from: classes3.dex */
    public interface I_MatchAreaPredicate extends I_MatchPredicate {
        boolean matches(TwoDEval twoDEval, int i10, int i11);
    }

    /* loaded from: classes3.dex */
    public interface I_MatchPredicate {
        boolean matches(ValueEval valueEval);
    }

    private CountUtils() {
    }

    public static int countArg(ValueEval valueEval, I_MatchPredicate i_MatchPredicate) {
        if (valueEval != null) {
            if (valueEval instanceof TwoDEval) {
                return countMatchingCellsInArea((TwoDEval) valueEval, i_MatchPredicate);
            }
            if (valueEval instanceof RefEval) {
                return countMatchingCell((RefEval) valueEval, i_MatchPredicate);
            }
            return i_MatchPredicate.matches(valueEval) ? 1 : 0;
        }
        throw new IllegalArgumentException("eval must not be null");
    }

    public static int countMatchingCell(RefEval refEval, I_MatchPredicate i_MatchPredicate) {
        if (i_MatchPredicate.matches(refEval.getInnerValueEval())) {
            return 1;
        }
        return 0;
    }

    public static int countMatchingCellsInArea(TwoDEval twoDEval, I_MatchPredicate i_MatchPredicate) {
        int height = twoDEval.getHeight();
        int width = twoDEval.getWidth();
        int i10 = 0;
        for (int i11 = 0; i11 < height; i11++) {
            for (int i12 = 0; i12 < width; i12++) {
                ValueEval value = twoDEval.getValue(i11, i12);
                if ((!(i_MatchPredicate instanceof I_MatchAreaPredicate) || ((I_MatchAreaPredicate) i_MatchPredicate).matches(twoDEval, i11, i12)) && i_MatchPredicate.matches(value)) {
                    i10++;
                }
            }
        }
        return i10;
    }
}
