package lib.zj.office.fc.hssf.formula.function;

import lib.zj.office.fc.hssf.formula.eval.BoolEval;
import lib.zj.office.fc.hssf.formula.eval.ErrorEval;
import lib.zj.office.fc.hssf.formula.eval.EvaluationException;
import lib.zj.office.fc.hssf.formula.eval.NumberEval;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;

/* loaded from: classes3.dex */
public abstract class FinanceFunction implements Function3Arg, Function4Arg {
    private static final ValueEval DEFAULT_ARG3 = NumberEval.ZERO;
    private static final ValueEval DEFAULT_ARG4 = BoolEval.FALSE;
    public static final Function FV = new FinanceFunction() { // from class: lib.zj.office.fc.hssf.formula.function.FinanceFunction.1
        @Override // lib.zj.office.fc.hssf.formula.function.FinanceFunction
        public double evaluate(double d10, double d11, double d12, double d13, boolean z10) {
            return FinanceLib.fv(d10, d11, d12, d13, z10);
        }
    };
    public static final Function NPER = new FinanceFunction() { // from class: lib.zj.office.fc.hssf.formula.function.FinanceFunction.2
        @Override // lib.zj.office.fc.hssf.formula.function.FinanceFunction
        public double evaluate(double d10, double d11, double d12, double d13, boolean z10) {
            return FinanceLib.nper(d10, d11, d12, d13, z10);
        }
    };
    public static final Function PMT = new FinanceFunction() { // from class: lib.zj.office.fc.hssf.formula.function.FinanceFunction.3
        @Override // lib.zj.office.fc.hssf.formula.function.FinanceFunction
        public double evaluate(double d10, double d11, double d12, double d13, boolean z10) {
            return FinanceLib.pmt(d10, d11, d12, d13, z10);
        }
    };
    public static final Function PV = new FinanceFunction() { // from class: lib.zj.office.fc.hssf.formula.function.FinanceFunction.4
        @Override // lib.zj.office.fc.hssf.formula.function.FinanceFunction
        public double evaluate(double d10, double d11, double d12, double d13, boolean z10) {
            return FinanceLib.pv(d10, d11, d12, d13, z10);
        }
    };

    public abstract double evaluate(double d10, double d11, double d12, double d13, boolean z10);

    @Override // lib.zj.office.fc.hssf.formula.function.Function3Arg
    public ValueEval evaluate(int i10, int i11, ValueEval valueEval, ValueEval valueEval2, ValueEval valueEval3) {
        return evaluate(i10, i11, valueEval, valueEval2, valueEval3, DEFAULT_ARG3);
    }

    @Override // lib.zj.office.fc.hssf.formula.function.Function4Arg
    public ValueEval evaluate(int i10, int i11, ValueEval valueEval, ValueEval valueEval2, ValueEval valueEval3, ValueEval valueEval4) {
        return evaluate(i10, i11, valueEval, valueEval2, valueEval3, valueEval4, DEFAULT_ARG4);
    }

    public ValueEval evaluate(int i10, int i11, ValueEval valueEval, ValueEval valueEval2, ValueEval valueEval3, ValueEval valueEval4, ValueEval valueEval5) {
        try {
            double evaluate = evaluate(NumericFunction.singleOperandEvaluate(valueEval, i10, i11), NumericFunction.singleOperandEvaluate(valueEval2, i10, i11), NumericFunction.singleOperandEvaluate(valueEval3, i10, i11), NumericFunction.singleOperandEvaluate(valueEval4, i10, i11), NumericFunction.singleOperandEvaluate(valueEval5, i10, i11) != 0.0d);
            NumericFunction.checkValue(evaluate);
            return new NumberEval(evaluate);
        } catch (EvaluationException e10) {
            return e10.getErrorEval();
        }
    }

    @Override // lib.zj.office.fc.hssf.formula.function.Function
    public ValueEval evaluate(ValueEval[] valueEvalArr, int i10, int i11) {
        int length = valueEvalArr.length;
        if (length != 3) {
            if (length != 4) {
                if (length != 5) {
                    return ErrorEval.VALUE_INVALID;
                }
                return evaluate(i10, i11, valueEvalArr[0], valueEvalArr[1], valueEvalArr[2], valueEvalArr[3], valueEvalArr[4]);
            }
            return evaluate(i10, i11, valueEvalArr[0], valueEvalArr[1], valueEvalArr[2], valueEvalArr[3], DEFAULT_ARG4);
        }
        return evaluate(i10, i11, valueEvalArr[0], valueEvalArr[1], valueEvalArr[2], DEFAULT_ARG3, DEFAULT_ARG4);
    }

    public double evaluate(double[] dArr) {
        double d10;
        double d11;
        int length = dArr.length;
        if (length != 3) {
            if (length == 4) {
                d10 = 0.0d;
            } else if (length == 5) {
                d10 = dArr[4];
            } else {
                throw new IllegalStateException("Wrong number of arguments");
            }
            d11 = dArr[3];
        } else {
            d10 = 0.0d;
            d11 = 0.0d;
        }
        return evaluate(dArr[0], dArr[1], dArr[2], d11, d10 != 0.0d);
    }
}
