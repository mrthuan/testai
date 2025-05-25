package lib.zj.office.fc.hssf.formula.function;

import androidx.appcompat.view.menu.d;
import lib.zj.office.fc.hssf.formula.TwoDEval;
import lib.zj.office.fc.hssf.formula.eval.ErrorEval;
import lib.zj.office.fc.hssf.formula.eval.EvaluationException;
import lib.zj.office.fc.hssf.formula.eval.NumberEval;
import lib.zj.office.fc.hssf.formula.eval.RefEval;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;
import lib.zj.office.fc.hssf.formula.function.LookupUtils;

/* loaded from: classes3.dex */
public abstract class XYNumericFunction extends Fixed2ArgFunction {

    /* loaded from: classes3.dex */
    public interface Accumulator {
        double accumulate(double d10, double d11);
    }

    /* loaded from: classes3.dex */
    public static final class AreaValueArray extends ValueArray {
        private final TwoDEval _ae;
        private final int _width;

        public AreaValueArray(TwoDEval twoDEval) {
            super(twoDEval.getHeight() * twoDEval.getWidth());
            this._ae = twoDEval;
            this._width = twoDEval.getWidth();
        }

        @Override // lib.zj.office.fc.hssf.formula.function.XYNumericFunction.ValueArray
        public ValueEval getItemInternal(int i10) {
            int i11 = this._width;
            return this._ae.getValue(i10 / i11, i10 % i11);
        }
    }

    /* loaded from: classes3.dex */
    public static final class RefValueArray extends ValueArray {
        private final RefEval _ref;

        public RefValueArray(RefEval refEval) {
            super(1);
            this._ref = refEval;
        }

        @Override // lib.zj.office.fc.hssf.formula.function.XYNumericFunction.ValueArray
        public ValueEval getItemInternal(int i10) {
            return this._ref.getInnerValueEval();
        }
    }

    /* loaded from: classes3.dex */
    public static final class SingleCellValueArray extends ValueArray {
        private final ValueEval _value;

        public SingleCellValueArray(ValueEval valueEval) {
            super(1);
            this._value = valueEval;
        }

        @Override // lib.zj.office.fc.hssf.formula.function.XYNumericFunction.ValueArray
        public ValueEval getItemInternal(int i10) {
            return this._value;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class ValueArray implements LookupUtils.ValueVector {
        private final int _size;

        public ValueArray(int i10) {
            this._size = i10;
        }

        @Override // lib.zj.office.fc.hssf.formula.function.LookupUtils.ValueVector
        public ValueEval getItem(int i10) {
            if (i10 >= 0 && i10 <= this._size) {
                return getItemInternal(i10);
            }
            StringBuilder e10 = d.e("Specified index ", i10, " is outside range (0..");
            e10.append(this._size - 1);
            e10.append(")");
            throw new IllegalArgumentException(e10.toString());
        }

        public abstract ValueEval getItemInternal(int i10);

        @Override // lib.zj.office.fc.hssf.formula.function.LookupUtils.ValueVector
        public final int getSize() {
            return this._size;
        }
    }

    private static LookupUtils.ValueVector createValueVector(ValueEval valueEval) {
        if (!(valueEval instanceof ErrorEval)) {
            if (valueEval instanceof TwoDEval) {
                return new AreaValueArray((TwoDEval) valueEval);
            }
            if (valueEval instanceof RefEval) {
                return new RefValueArray((RefEval) valueEval);
            }
            return new SingleCellValueArray(valueEval);
        }
        throw new EvaluationException((ErrorEval) valueEval);
    }

    private double evaluateInternal(LookupUtils.ValueVector valueVector, LookupUtils.ValueVector valueVector2, int i10) {
        Accumulator createAccumulator = createAccumulator();
        ErrorEval errorEval = null;
        double d10 = 0.0d;
        boolean z10 = false;
        ErrorEval errorEval2 = null;
        for (int i11 = 0; i11 < i10; i11++) {
            ValueEval item = valueVector.getItem(i11);
            ValueEval item2 = valueVector2.getItem(i11);
            if ((item instanceof ErrorEval) && errorEval == null) {
                errorEval = (ErrorEval) item;
            } else if ((item2 instanceof ErrorEval) && errorEval2 == null) {
                errorEval2 = (ErrorEval) item2;
            } else if ((item instanceof NumberEval) && (item2 instanceof NumberEval)) {
                z10 = true;
                d10 = createAccumulator.accumulate(((NumberEval) item).getNumberValue(), ((NumberEval) item2).getNumberValue()) + d10;
            }
        }
        if (errorEval == null) {
            if (errorEval2 == null) {
                if (z10) {
                    return d10;
                }
                throw new EvaluationException(ErrorEval.DIV_ZERO);
            }
            throw new EvaluationException(errorEval2);
        }
        throw new EvaluationException(errorEval);
    }

    public abstract Accumulator createAccumulator();

    @Override // lib.zj.office.fc.hssf.formula.function.Function2Arg
    public ValueEval evaluate(int i10, int i11, ValueEval valueEval, ValueEval valueEval2) {
        try {
            LookupUtils.ValueVector createValueVector = createValueVector(valueEval);
            LookupUtils.ValueVector createValueVector2 = createValueVector(valueEval2);
            int size = createValueVector.getSize();
            if (size != 0 && createValueVector2.getSize() == size) {
                double evaluateInternal = evaluateInternal(createValueVector, createValueVector2, size);
                if (!Double.isNaN(evaluateInternal) && !Double.isInfinite(evaluateInternal)) {
                    return new NumberEval(evaluateInternal);
                }
                return ErrorEval.NUM_ERROR;
            }
            return ErrorEval.NA;
        } catch (EvaluationException e10) {
            return e10.getErrorEval();
        }
    }
}
