package lib.zj.office.fc.hssf.formula.eval;

import b.a;
import lib.zj.office.fc.hssf.formula.function.Fixed2ArgFunction;
import lib.zj.office.fc.hssf.formula.function.Function;

/* loaded from: classes3.dex */
public final class IntersectionEval extends Fixed2ArgFunction {
    public static final Function instance = new IntersectionEval();

    private IntersectionEval() {
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
        int firstColumn;
        int lastRow;
        int firstRow;
        int lastRow2;
        int firstRow2 = areaEval.getFirstRow();
        int firstColumn2 = areaEval.getFirstColumn();
        int lastColumn = areaEval2.getLastColumn();
        if (firstColumn2 > lastColumn || (firstColumn = areaEval2.getFirstColumn()) > areaEval.getLastColumn() || firstRow2 > (lastRow = areaEval2.getLastRow()) || (firstRow = areaEval2.getFirstRow()) > (lastRow2 = areaEval.getLastRow())) {
            return null;
        }
        return areaEval.offset(Math.max(firstRow2, firstRow) - firstRow2, Math.min(lastRow2, lastRow) - firstRow2, Math.max(firstColumn2, firstColumn) - firstColumn2, Math.min(areaEval.getLastColumn(), lastColumn) - firstColumn2);
    }

    @Override // lib.zj.office.fc.hssf.formula.function.Function2Arg
    public ValueEval evaluate(int i10, int i11, ValueEval valueEval, ValueEval valueEval2) {
        try {
            AreaEval resolveRange = resolveRange(evaluateRef(valueEval), evaluateRef(valueEval2));
            if (resolveRange == null) {
                return ErrorEval.NULL_INTERSECTION;
            }
            return resolveRange;
        } catch (EvaluationException e10) {
            return e10.getErrorEval();
        }
    }
}
