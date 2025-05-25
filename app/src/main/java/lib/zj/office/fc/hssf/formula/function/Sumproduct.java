package lib.zj.office.fc.hssf.formula.function;

import b.a;
import lib.zj.office.fc.hssf.formula.TwoDEval;
import lib.zj.office.fc.hssf.formula.eval.AreaEval;
import lib.zj.office.fc.hssf.formula.eval.BlankEval;
import lib.zj.office.fc.hssf.formula.eval.ErrorEval;
import lib.zj.office.fc.hssf.formula.eval.EvaluationException;
import lib.zj.office.fc.hssf.formula.eval.NumberEval;
import lib.zj.office.fc.hssf.formula.eval.NumericValueEval;
import lib.zj.office.fc.hssf.formula.eval.RefEval;
import lib.zj.office.fc.hssf.formula.eval.StringEval;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;

/* loaded from: classes3.dex */
public final class Sumproduct implements Function {
    private static boolean areasAllSameSize(TwoDEval[] twoDEvalArr, int i10, int i11) {
        for (TwoDEval twoDEval : twoDEvalArr) {
            if (twoDEval.getHeight() != i10 || twoDEval.getWidth() != i11) {
                return false;
            }
        }
        return true;
    }

    private static ValueEval evaluateAreaSumProduct(ValueEval[] valueEvalArr) {
        int length = valueEvalArr.length;
        TwoDEval[] twoDEvalArr = new TwoDEval[length];
        try {
            System.arraycopy(valueEvalArr, 0, twoDEvalArr, 0, length);
            TwoDEval twoDEval = twoDEvalArr[0];
            int height = twoDEval.getHeight();
            int width = twoDEval.getWidth();
            if (!areasAllSameSize(twoDEvalArr, height, width)) {
                for (int i10 = 1; i10 < length; i10++) {
                    throwFirstError(twoDEvalArr[i10]);
                }
                return ErrorEval.VALUE_INVALID;
            }
            double d10 = 0.0d;
            for (int i11 = 0; i11 < height; i11++) {
                for (int i12 = 0; i12 < width; i12++) {
                    double d11 = 1.0d;
                    for (int i13 = 0; i13 < length; i13++) {
                        d11 *= getProductTerm(twoDEvalArr[i13].getValue(i11, i12), false);
                    }
                    d10 += d11;
                }
            }
            return new NumberEval(d10);
        } catch (ArrayStoreException unused) {
            return ErrorEval.VALUE_INVALID;
        }
    }

    private static ValueEval evaluateSingleProduct(ValueEval[] valueEvalArr) {
        double d10 = 1.0d;
        for (ValueEval valueEval : valueEvalArr) {
            d10 *= getScalarValue(valueEval);
        }
        return new NumberEval(d10);
    }

    private static double getProductTerm(ValueEval valueEval, boolean z10) {
        if (!(valueEval instanceof BlankEval) && valueEval != null) {
            if (!(valueEval instanceof ErrorEval)) {
                if (valueEval instanceof StringEval) {
                    if (!z10) {
                        return 0.0d;
                    }
                    throw new EvaluationException(ErrorEval.VALUE_INVALID);
                } else if (valueEval instanceof NumericValueEval) {
                    return ((NumericValueEval) valueEval).getNumberValue();
                } else {
                    throw new RuntimeException(a.e(valueEval, new StringBuilder("Unexpected value eval class ("), ")"));
                }
            }
            throw new EvaluationException((ErrorEval) valueEval);
        } else if (!z10) {
            return 0.0d;
        } else {
            throw new EvaluationException(ErrorEval.VALUE_INVALID);
        }
    }

    private static double getScalarValue(ValueEval valueEval) {
        if (valueEval instanceof RefEval) {
            valueEval = ((RefEval) valueEval).getInnerValueEval();
        }
        if (valueEval != null) {
            if (valueEval instanceof AreaEval) {
                AreaEval areaEval = (AreaEval) valueEval;
                if (areaEval.isColumn() && areaEval.isRow()) {
                    valueEval = areaEval.getRelativeValue(0, 0);
                } else {
                    throw new EvaluationException(ErrorEval.VALUE_INVALID);
                }
            }
            return getProductTerm(valueEval, true);
        }
        throw new RuntimeException("parameter may not be null");
    }

    private static void throwFirstError(TwoDEval twoDEval) {
        int height = twoDEval.getHeight();
        int width = twoDEval.getWidth();
        for (int i10 = 0; i10 < height; i10++) {
            for (int i11 = 0; i11 < width; i11++) {
                ValueEval value = twoDEval.getValue(i10, i11);
                if (value instanceof ErrorEval) {
                    throw new EvaluationException((ErrorEval) value);
                }
            }
        }
    }

    @Override // lib.zj.office.fc.hssf.formula.function.Function
    public ValueEval evaluate(ValueEval[] valueEvalArr, int i10, int i11) {
        if (valueEvalArr.length < 1) {
            return ErrorEval.VALUE_INVALID;
        }
        ValueEval valueEval = valueEvalArr[0];
        try {
            if (valueEval instanceof NumericValueEval) {
                return evaluateSingleProduct(valueEvalArr);
            }
            if (valueEval instanceof RefEval) {
                return evaluateSingleProduct(valueEvalArr);
            }
            if (valueEval instanceof TwoDEval) {
                TwoDEval twoDEval = (TwoDEval) valueEval;
                if (twoDEval.isRow() && twoDEval.isColumn()) {
                    return evaluateSingleProduct(valueEvalArr);
                }
                return evaluateAreaSumProduct(valueEvalArr);
            }
            throw new RuntimeException(a.e(valueEval, new StringBuilder("Invalid arg type for SUMPRODUCT: ("), ")"));
        } catch (EvaluationException e10) {
            return e10.getErrorEval();
        }
    }
}
