package lib.zj.office.fc.hssf.formula.eval;

import lib.zj.office.fc.hssf.formula.function.Fixed2ArgFunction;
import lib.zj.office.fc.hssf.formula.function.Function;

/* loaded from: classes3.dex */
public abstract class TwoOperandNumericOperation extends Fixed2ArgFunction {
    public static final Function AddEval = new TwoOperandNumericOperation() { // from class: lib.zj.office.fc.hssf.formula.eval.TwoOperandNumericOperation.1
        @Override // lib.zj.office.fc.hssf.formula.eval.TwoOperandNumericOperation
        public double evaluate(double d10, double d11) {
            return d10 + d11;
        }
    };
    public static final Function DivideEval = new TwoOperandNumericOperation() { // from class: lib.zj.office.fc.hssf.formula.eval.TwoOperandNumericOperation.2
        @Override // lib.zj.office.fc.hssf.formula.eval.TwoOperandNumericOperation
        public double evaluate(double d10, double d11) {
            if (d11 != 0.0d) {
                return d10 / d11;
            }
            throw new EvaluationException(ErrorEval.DIV_ZERO);
        }
    };
    public static final Function MultiplyEval = new TwoOperandNumericOperation() { // from class: lib.zj.office.fc.hssf.formula.eval.TwoOperandNumericOperation.3
        @Override // lib.zj.office.fc.hssf.formula.eval.TwoOperandNumericOperation
        public double evaluate(double d10, double d11) {
            return d10 * d11;
        }
    };
    public static final Function PowerEval = new TwoOperandNumericOperation() { // from class: lib.zj.office.fc.hssf.formula.eval.TwoOperandNumericOperation.4
        @Override // lib.zj.office.fc.hssf.formula.eval.TwoOperandNumericOperation
        public double evaluate(double d10, double d11) {
            return Math.pow(d10, d11);
        }
    };
    public static final Function SubtractEval = new SubtractEvalClass();

    /* loaded from: classes3.dex */
    public static final class SubtractEvalClass extends TwoOperandNumericOperation {
        @Override // lib.zj.office.fc.hssf.formula.eval.TwoOperandNumericOperation
        public double evaluate(double d10, double d11) {
            return d10 - d11;
        }
    }

    public abstract double evaluate(double d10, double d11);

    @Override // lib.zj.office.fc.hssf.formula.function.Function2Arg
    public ValueEval evaluate(int i10, int i11, ValueEval valueEval, ValueEval valueEval2) {
        try {
            double evaluate = evaluate(singleOperandEvaluate(valueEval, i10, i11), singleOperandEvaluate(valueEval2, i10, i11));
            if (evaluate == 0.0d && !(this instanceof SubtractEvalClass)) {
                return NumberEval.ZERO;
            }
            if (!Double.isNaN(evaluate) && !Double.isInfinite(evaluate)) {
                return new NumberEval(evaluate);
            }
            return ErrorEval.NUM_ERROR;
        } catch (EvaluationException e10) {
            return e10.getErrorEval();
        }
    }

    public final double singleOperandEvaluate(ValueEval valueEval, int i10, int i11) {
        return OperandResolver.coerceValueToDouble(OperandResolver.getSingleValue(valueEval, i10, i11));
    }
}
