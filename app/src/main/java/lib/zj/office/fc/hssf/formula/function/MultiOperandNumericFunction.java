package lib.zj.office.fc.hssf.formula.function;

import lib.zj.office.fc.hssf.formula.TwoDEval;
import lib.zj.office.fc.hssf.formula.eval.BlankEval;
import lib.zj.office.fc.hssf.formula.eval.BoolEval;
import lib.zj.office.fc.hssf.formula.eval.ErrorEval;
import lib.zj.office.fc.hssf.formula.eval.EvaluationException;
import lib.zj.office.fc.hssf.formula.eval.NumberEval;
import lib.zj.office.fc.hssf.formula.eval.OperandResolver;
import lib.zj.office.fc.hssf.formula.eval.RefEval;
import lib.zj.office.fc.hssf.formula.eval.StringEval;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;

/* loaded from: classes3.dex */
public abstract class MultiOperandNumericFunction implements Function {
    private static final int DEFAULT_MAX_NUM_OPERANDS = 30;
    static final double[] EMPTY_DOUBLE_ARRAY = new double[0];
    private final boolean _isBlankCounted;
    private final boolean _isReferenceBoolCounted;

    /* loaded from: classes3.dex */
    public static class DoubleList {
        private double[] _array = new double[8];
        private int _count = 0;

        private void ensureCapacity(int i10) {
            double[] dArr = this._array;
            if (i10 > dArr.length) {
                double[] dArr2 = new double[(i10 * 3) / 2];
                System.arraycopy(dArr, 0, dArr2, 0, this._count);
                this._array = dArr2;
            }
        }

        public void add(double d10) {
            ensureCapacity(this._count + 1);
            double[] dArr = this._array;
            int i10 = this._count;
            dArr[i10] = d10;
            this._count = i10 + 1;
        }

        public double[] toArray() {
            int i10 = this._count;
            if (i10 < 1) {
                return MultiOperandNumericFunction.EMPTY_DOUBLE_ARRAY;
            }
            double[] dArr = new double[i10];
            System.arraycopy(this._array, 0, dArr, 0, i10);
            return dArr;
        }
    }

    public MultiOperandNumericFunction(boolean z10, boolean z11) {
        this._isReferenceBoolCounted = z10;
        this._isBlankCounted = z11;
    }

    private void collectValue(ValueEval valueEval, boolean z10, DoubleList doubleList) {
        if (valueEval != null) {
            if (valueEval instanceof NumberEval) {
                doubleList.add(((NumberEval) valueEval).getNumberValue());
                return;
            } else if (!(valueEval instanceof ErrorEval)) {
                if (valueEval instanceof StringEval) {
                    if (z10) {
                        return;
                    }
                    Double parseDouble = OperandResolver.parseDouble(((StringEval) valueEval).getStringValue());
                    if (parseDouble != null) {
                        doubleList.add(parseDouble.doubleValue());
                        return;
                    }
                    throw new EvaluationException(ErrorEval.VALUE_INVALID);
                } else if (valueEval instanceof BoolEval) {
                    if (!z10 || this._isReferenceBoolCounted) {
                        doubleList.add(((BoolEval) valueEval).getNumberValue());
                        return;
                    }
                    return;
                } else if (valueEval == BlankEval.instance) {
                    if (this._isBlankCounted) {
                        doubleList.add(0.0d);
                        return;
                    }
                    return;
                } else {
                    throw new RuntimeException("Invalid ValueEval type passed for conversion: (" + valueEval.getClass() + ")");
                }
            } else {
                throw new EvaluationException((ErrorEval) valueEval);
            }
        }
        throw new IllegalArgumentException("ve must not be null");
    }

    private void collectValues(ValueEval valueEval, DoubleList doubleList) {
        if (valueEval instanceof TwoDEval) {
            TwoDEval twoDEval = (TwoDEval) valueEval;
            int width = twoDEval.getWidth();
            int height = twoDEval.getHeight();
            for (int i10 = 0; i10 < height; i10++) {
                for (int i11 = 0; i11 < width; i11++) {
                    ValueEval value = twoDEval.getValue(i10, i11);
                    if (isSubtotalCounted() || !twoDEval.isSubTotal(i10, i11)) {
                        while (value instanceof RefEval) {
                            value = OperandResolver.getSingleValue(value, 0, 0);
                        }
                        collectValue(value, true, doubleList);
                    }
                }
            }
        } else if (valueEval instanceof RefEval) {
            collectValue(((RefEval) valueEval).getInnerValueEval(), true, doubleList);
        } else {
            collectValue(valueEval, false, doubleList);
        }
    }

    public abstract double evaluate(double[] dArr);

    @Override // lib.zj.office.fc.hssf.formula.function.Function
    public final ValueEval evaluate(ValueEval[] valueEvalArr, int i10, int i11) {
        try {
            double evaluate = evaluate(getNumberArray(valueEvalArr));
            if (!Double.isNaN(evaluate) && !Double.isInfinite(evaluate)) {
                return new NumberEval(evaluate);
            }
            return ErrorEval.NUM_ERROR;
        } catch (EvaluationException e10) {
            return e10.getErrorEval();
        }
    }

    public int getMaxNumOperands() {
        return 30;
    }

    public final double[] getNumberArray(ValueEval[] valueEvalArr) {
        if (valueEvalArr.length <= getMaxNumOperands()) {
            DoubleList doubleList = new DoubleList();
            for (ValueEval valueEval : valueEvalArr) {
                collectValues(valueEval, doubleList);
            }
            return doubleList.toArray();
        }
        throw EvaluationException.invalidValue();
    }

    public boolean isSubtotalCounted() {
        return true;
    }
}
