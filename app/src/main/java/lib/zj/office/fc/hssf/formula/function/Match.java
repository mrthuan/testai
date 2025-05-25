package lib.zj.office.fc.hssf.formula.function;

import a0.a;
import a6.h;
import lib.zj.office.fc.hssf.formula.TwoDEval;
import lib.zj.office.fc.hssf.formula.eval.ErrorEval;
import lib.zj.office.fc.hssf.formula.eval.EvaluationException;
import lib.zj.office.fc.hssf.formula.eval.NumberEval;
import lib.zj.office.fc.hssf.formula.eval.NumericValueEval;
import lib.zj.office.fc.hssf.formula.eval.OperandResolver;
import lib.zj.office.fc.hssf.formula.eval.RefEval;
import lib.zj.office.fc.hssf.formula.eval.StringEval;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;
import lib.zj.office.fc.hssf.formula.function.LookupUtils;

/* loaded from: classes3.dex */
public final class Match extends Var2or3ArgFunction {

    /* loaded from: classes3.dex */
    public static final class SingleValueVector implements LookupUtils.ValueVector {
        private final ValueEval _value;

        public SingleValueVector(ValueEval valueEval) {
            this._value = valueEval;
        }

        @Override // lib.zj.office.fc.hssf.formula.function.LookupUtils.ValueVector
        public ValueEval getItem(int i10) {
            if (i10 == 0) {
                return this._value;
            }
            throw new RuntimeException(a.g("Invalid index (", i10, ") only zero is allowed"));
        }

        @Override // lib.zj.office.fc.hssf.formula.function.LookupUtils.ValueVector
        public int getSize() {
            return 1;
        }
    }

    private static LookupUtils.LookupValueComparer createLookupComparer(ValueEval valueEval, boolean z10) {
        if (z10 && (valueEval instanceof StringEval)) {
            String stringValue = ((StringEval) valueEval).getStringValue();
            if (isLookupValueWild(stringValue)) {
                throw new RuntimeException(h.d("Wildcard lookup values '", stringValue, "' not supported yet"));
            }
        }
        return LookupUtils.createLookupComparer(valueEval);
    }

    private static ValueEval eval(int i10, int i11, ValueEval valueEval, ValueEval valueEval2, double d10) {
        boolean z10;
        int i12 = (d10 > 0.0d ? 1 : (d10 == 0.0d ? 0 : -1));
        boolean z11 = false;
        if (i12 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i12 > 0) {
            z11 = true;
        }
        try {
            return new NumberEval(findIndexOfValue(OperandResolver.getSingleValue(valueEval, i10, i11), evaluateLookupRange(valueEval2), z10, z11) + 1);
        } catch (EvaluationException e10) {
            return e10.getErrorEval();
        }
    }

    private static LookupUtils.ValueVector evaluateLookupRange(ValueEval valueEval) {
        if (valueEval instanceof RefEval) {
            return new SingleValueVector(((RefEval) valueEval).getInnerValueEval());
        }
        if (valueEval instanceof TwoDEval) {
            LookupUtils.ValueVector createVector = LookupUtils.createVector((TwoDEval) valueEval);
            if (createVector != null) {
                return createVector;
            }
            throw new EvaluationException(ErrorEval.NA);
        } else if (!(valueEval instanceof NumericValueEval)) {
            if (valueEval instanceof StringEval) {
                if (OperandResolver.parseDouble(((StringEval) valueEval).getStringValue()) == null) {
                    throw new EvaluationException(ErrorEval.VALUE_INVALID);
                }
                throw new EvaluationException(ErrorEval.NA);
            }
            throw new RuntimeException(b.a.e(valueEval, new StringBuilder("Unexpected eval type ("), ")"));
        } else {
            throw new EvaluationException(ErrorEval.NA);
        }
    }

    private static double evaluateMatchTypeArg(ValueEval valueEval, int i10, int i11) {
        ValueEval singleValue = OperandResolver.getSingleValue(valueEval, i10, i11);
        if (!(singleValue instanceof ErrorEval)) {
            if (singleValue instanceof NumericValueEval) {
                return ((NumericValueEval) singleValue).getNumberValue();
            }
            if (singleValue instanceof StringEval) {
                Double parseDouble = OperandResolver.parseDouble(((StringEval) singleValue).getStringValue());
                if (parseDouble != null) {
                    return parseDouble.doubleValue();
                }
                throw new EvaluationException(ErrorEval.VALUE_INVALID);
            }
            throw new RuntimeException(b.a.e(singleValue, new StringBuilder("Unexpected match_type type ("), ")"));
        }
        throw new EvaluationException((ErrorEval) singleValue);
    }

    private static int findIndexOfValue(ValueEval valueEval, LookupUtils.ValueVector valueVector, boolean z10, boolean z11) {
        LookupUtils.LookupValueComparer createLookupComparer = createLookupComparer(valueEval, z10);
        int size = valueVector.getSize();
        int i10 = 0;
        if (z10) {
            while (i10 < size) {
                if (createLookupComparer.compareTo(valueVector.getItem(i10)).isEqual()) {
                    return i10;
                }
                i10++;
            }
            throw new EvaluationException(ErrorEval.NA);
        } else if (z11) {
            for (int i11 = size - 1; i11 >= 0; i11--) {
                LookupUtils.CompareResult compareTo = createLookupComparer.compareTo(valueVector.getItem(i11));
                if (!compareTo.isTypeMismatch() && !compareTo.isLessThan()) {
                    return i11;
                }
            }
            throw new EvaluationException(ErrorEval.NA);
        } else {
            while (i10 < size) {
                LookupUtils.CompareResult compareTo2 = createLookupComparer.compareTo(valueVector.getItem(i10));
                if (compareTo2.isEqual()) {
                    return i10;
                }
                if (compareTo2.isGreaterThan()) {
                    if (i10 >= 1) {
                        return i10 - 1;
                    }
                    throw new EvaluationException(ErrorEval.NA);
                }
                i10++;
            }
            throw new EvaluationException(ErrorEval.NA);
        }
    }

    private static boolean isLookupValueWild(String str) {
        if (str.indexOf(63) < 0 && str.indexOf(42) < 0) {
            return false;
        }
        return true;
    }

    @Override // lib.zj.office.fc.hssf.formula.function.Function2Arg
    public ValueEval evaluate(int i10, int i11, ValueEval valueEval, ValueEval valueEval2) {
        return eval(i10, i11, valueEval, valueEval2, 1.0d);
    }

    @Override // lib.zj.office.fc.hssf.formula.function.Function3Arg
    public ValueEval evaluate(int i10, int i11, ValueEval valueEval, ValueEval valueEval2, ValueEval valueEval3) {
        try {
            return eval(i10, i11, valueEval, valueEval2, evaluateMatchTypeArg(valueEval3, i10, i11));
        } catch (EvaluationException unused) {
            return ErrorEval.REF_INVALID;
        }
    }
}
