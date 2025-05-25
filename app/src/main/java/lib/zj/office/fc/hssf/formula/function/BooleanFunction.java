package lib.zj.office.fc.hssf.formula.function;

import lib.zj.office.fc.hssf.formula.TwoDEval;
import lib.zj.office.fc.hssf.formula.eval.BoolEval;
import lib.zj.office.fc.hssf.formula.eval.ErrorEval;
import lib.zj.office.fc.hssf.formula.eval.EvaluationException;
import lib.zj.office.fc.hssf.formula.eval.OperandResolver;
import lib.zj.office.fc.hssf.formula.eval.RefEval;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;

/* loaded from: classes3.dex */
public abstract class BooleanFunction implements Function {
    public static final Function AND = new BooleanFunction() { // from class: lib.zj.office.fc.hssf.formula.function.BooleanFunction.1
        @Override // lib.zj.office.fc.hssf.formula.function.BooleanFunction
        public boolean getInitialResultValue() {
            return true;
        }

        @Override // lib.zj.office.fc.hssf.formula.function.BooleanFunction
        public boolean partialEvaluate(boolean z10, boolean z11) {
            if (z10 && z11) {
                return true;
            }
            return false;
        }
    };
    public static final Function OR = new BooleanFunction() { // from class: lib.zj.office.fc.hssf.formula.function.BooleanFunction.2
        @Override // lib.zj.office.fc.hssf.formula.function.BooleanFunction
        public boolean getInitialResultValue() {
            return false;
        }

        @Override // lib.zj.office.fc.hssf.formula.function.BooleanFunction
        public boolean partialEvaluate(boolean z10, boolean z11) {
            if (!z10 && !z11) {
                return false;
            }
            return true;
        }
    };
    public static final Function FALSE = new Fixed0ArgFunction() { // from class: lib.zj.office.fc.hssf.formula.function.BooleanFunction.3
        @Override // lib.zj.office.fc.hssf.formula.function.Function0Arg
        public ValueEval evaluate(int i10, int i11) {
            return BoolEval.FALSE;
        }
    };
    public static final Function TRUE = new Fixed0ArgFunction() { // from class: lib.zj.office.fc.hssf.formula.function.BooleanFunction.4
        @Override // lib.zj.office.fc.hssf.formula.function.Function0Arg
        public ValueEval evaluate(int i10, int i11) {
            return BoolEval.TRUE;
        }
    };
    public static final Function NOT = new Fixed1ArgFunction() { // from class: lib.zj.office.fc.hssf.formula.function.BooleanFunction.5
        @Override // lib.zj.office.fc.hssf.formula.function.Function1Arg
        public ValueEval evaluate(int i10, int i11, ValueEval valueEval) {
            try {
                ValueEval singleValue = OperandResolver.getSingleValue(valueEval, i10, i11);
                boolean z10 = false;
                Boolean coerceValueToBoolean = OperandResolver.coerceValueToBoolean(singleValue, false);
                if (coerceValueToBoolean != null) {
                    z10 = coerceValueToBoolean.booleanValue();
                }
                return BoolEval.valueOf(!z10);
            } catch (EvaluationException e10) {
                return e10.getErrorEval();
            }
        }
    };

    private boolean calculate(ValueEval[] valueEvalArr) {
        Boolean coerceValueToBoolean;
        boolean initialResultValue = getInitialResultValue();
        boolean z10 = false;
        for (ValueEval valueEval : valueEvalArr) {
            if (valueEval instanceof TwoDEval) {
                TwoDEval twoDEval = (TwoDEval) valueEval;
                int height = twoDEval.getHeight();
                int width = twoDEval.getWidth();
                for (int i10 = 0; i10 < height; i10++) {
                    for (int i11 = 0; i11 < width; i11++) {
                        Boolean coerceValueToBoolean2 = OperandResolver.coerceValueToBoolean(twoDEval.getValue(i10, i11), true);
                        if (coerceValueToBoolean2 != null) {
                            initialResultValue = partialEvaluate(initialResultValue, coerceValueToBoolean2.booleanValue());
                            z10 = true;
                        }
                    }
                }
            } else {
                if (valueEval instanceof RefEval) {
                    coerceValueToBoolean = OperandResolver.coerceValueToBoolean(((RefEval) valueEval).getInnerValueEval(), true);
                } else {
                    coerceValueToBoolean = OperandResolver.coerceValueToBoolean(valueEval, false);
                }
                if (coerceValueToBoolean != null) {
                    initialResultValue = partialEvaluate(initialResultValue, coerceValueToBoolean.booleanValue());
                    z10 = true;
                }
            }
        }
        if (z10) {
            return initialResultValue;
        }
        throw new EvaluationException(ErrorEval.VALUE_INVALID);
    }

    @Override // lib.zj.office.fc.hssf.formula.function.Function
    public final ValueEval evaluate(ValueEval[] valueEvalArr, int i10, int i11) {
        if (valueEvalArr.length < 1) {
            return ErrorEval.VALUE_INVALID;
        }
        try {
            return BoolEval.valueOf(calculate(valueEvalArr));
        } catch (EvaluationException e10) {
            return e10.getErrorEval();
        }
    }

    public abstract boolean getInitialResultValue();

    public abstract boolean partialEvaluate(boolean z10, boolean z11);
}
