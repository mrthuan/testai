package lib.zj.office.fc.hssf.formula.eval;

import b.a;
import lib.zj.office.fc.hssf.formula.function.Fixed2ArgFunction;
import lib.zj.office.fc.hssf.formula.function.Function;

/* loaded from: classes3.dex */
public final class RangeEval extends Fixed2ArgFunction {
    public static final Function instance = new RangeEval();

    private RangeEval() {
    }

    private static AreaEval evaluateRef(ValueEval valueEval) {
        if (valueEval instanceof AreaEval) {
            return (AreaEval) valueEval;
        }
        if (valueEval instanceof RefEval) {
            return ((RefEval) valueEval).offset(0, 0, 0, 0);
        }
        if (valueEval instanceof ErrorEval) {
            throw new EvaluationException((ErrorEval) valueEval);
        }
        throw new IllegalArgumentException(a.e(valueEval, new StringBuilder("Unexpected ref arg class ("), ")"));
    }

    private static AreaEval resolveRange(AreaEval areaEval, AreaEval areaEval2) {
        int firstRow = areaEval.getFirstRow();
        int firstColumn = areaEval.getFirstColumn();
        return areaEval.offset(Math.min(firstRow, areaEval2.getFirstRow()) - firstRow, Math.max(areaEval.getLastRow(), areaEval2.getLastRow()) - firstRow, Math.min(firstColumn, areaEval2.getFirstColumn()) - firstColumn, Math.max(areaEval.getLastColumn(), areaEval2.getLastColumn()) - firstColumn);
    }

    @Override // lib.zj.office.fc.hssf.formula.function.Function2Arg
    public ValueEval evaluate(int i10, int i11, ValueEval valueEval, ValueEval valueEval2) {
        try {
            return resolveRange(evaluateRef(valueEval), evaluateRef(valueEval2));
        } catch (EvaluationException e10) {
            return e10.getErrorEval();
        }
    }
}
