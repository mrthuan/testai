package lib.zj.office.fc.hssf.formula.function;

import lib.zj.office.fc.hssf.formula.eval.BoolEval;
import lib.zj.office.fc.hssf.formula.eval.ErrorEval;
import lib.zj.office.fc.hssf.formula.eval.EvaluationException;
import lib.zj.office.fc.hssf.formula.eval.NumberEval;
import lib.zj.office.fc.hssf.formula.eval.OperandResolver;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;

/* loaded from: classes3.dex */
public abstract class NumericFunction implements Function {
    static final double ZERO = 0.0d;
    static final double TEN = 10.0d;
    static final double LOG_10_TO_BASE_e = Math.log(TEN);
    public static final Function ABS = new OneArg() { // from class: lib.zj.office.fc.hssf.formula.function.NumericFunction.1
        @Override // lib.zj.office.fc.hssf.formula.function.NumericFunction.OneArg
        public double evaluate(double d10) {
            return Math.abs(d10);
        }
    };
    public static final Function ACOS = new OneArg() { // from class: lib.zj.office.fc.hssf.formula.function.NumericFunction.2
        @Override // lib.zj.office.fc.hssf.formula.function.NumericFunction.OneArg
        public double evaluate(double d10) {
            return Math.acos(d10);
        }
    };
    public static final Function ACOSH = new OneArg() { // from class: lib.zj.office.fc.hssf.formula.function.NumericFunction.3
        @Override // lib.zj.office.fc.hssf.formula.function.NumericFunction.OneArg
        public double evaluate(double d10) {
            return MathX.acosh(d10);
        }
    };
    public static final Function ASIN = new OneArg() { // from class: lib.zj.office.fc.hssf.formula.function.NumericFunction.4
        @Override // lib.zj.office.fc.hssf.formula.function.NumericFunction.OneArg
        public double evaluate(double d10) {
            return Math.asin(d10);
        }
    };
    public static final Function ASINH = new OneArg() { // from class: lib.zj.office.fc.hssf.formula.function.NumericFunction.5
        @Override // lib.zj.office.fc.hssf.formula.function.NumericFunction.OneArg
        public double evaluate(double d10) {
            return MathX.asinh(d10);
        }
    };
    public static final Function ATAN = new OneArg() { // from class: lib.zj.office.fc.hssf.formula.function.NumericFunction.6
        @Override // lib.zj.office.fc.hssf.formula.function.NumericFunction.OneArg
        public double evaluate(double d10) {
            return Math.atan(d10);
        }
    };
    public static final Function ATANH = new OneArg() { // from class: lib.zj.office.fc.hssf.formula.function.NumericFunction.7
        @Override // lib.zj.office.fc.hssf.formula.function.NumericFunction.OneArg
        public double evaluate(double d10) {
            return MathX.atanh(d10);
        }
    };
    public static final Function COS = new OneArg() { // from class: lib.zj.office.fc.hssf.formula.function.NumericFunction.8
        @Override // lib.zj.office.fc.hssf.formula.function.NumericFunction.OneArg
        public double evaluate(double d10) {
            return Math.cos(d10);
        }
    };
    public static final Function COSH = new OneArg() { // from class: lib.zj.office.fc.hssf.formula.function.NumericFunction.9
        @Override // lib.zj.office.fc.hssf.formula.function.NumericFunction.OneArg
        public double evaluate(double d10) {
            return MathX.cosh(d10);
        }
    };
    public static final Function DEGREES = new OneArg() { // from class: lib.zj.office.fc.hssf.formula.function.NumericFunction.10
        @Override // lib.zj.office.fc.hssf.formula.function.NumericFunction.OneArg
        public double evaluate(double d10) {
            return Math.toDegrees(d10);
        }
    };
    static final NumberEval DOLLAR_ARG2_DEFAULT = new NumberEval(2.0d);
    public static final Function DOLLAR = new Var1or2ArgFunction() { // from class: lib.zj.office.fc.hssf.formula.function.NumericFunction.11
        @Override // lib.zj.office.fc.hssf.formula.function.Function1Arg
        public ValueEval evaluate(int i10, int i11, ValueEval valueEval) {
            return evaluate(i10, i11, valueEval, NumericFunction.DOLLAR_ARG2_DEFAULT);
        }

        @Override // lib.zj.office.fc.hssf.formula.function.Function2Arg
        public ValueEval evaluate(int i10, int i11, ValueEval valueEval, ValueEval valueEval2) {
            try {
                double singleOperandEvaluate = NumericFunction.singleOperandEvaluate(valueEval, i10, i11);
                if (((int) NumericFunction.singleOperandEvaluate(valueEval2, i10, i11)) > 127) {
                    return ErrorEval.VALUE_INVALID;
                }
                return new NumberEval(singleOperandEvaluate);
            } catch (EvaluationException e10) {
                return e10.getErrorEval();
            }
        }
    };
    public static final Function EXP = new OneArg() { // from class: lib.zj.office.fc.hssf.formula.function.NumericFunction.12
        @Override // lib.zj.office.fc.hssf.formula.function.NumericFunction.OneArg
        public double evaluate(double d10) {
            return Math.pow(2.718281828459045d, d10);
        }
    };
    public static final Function FACT = new OneArg() { // from class: lib.zj.office.fc.hssf.formula.function.NumericFunction.13
        @Override // lib.zj.office.fc.hssf.formula.function.NumericFunction.OneArg
        public double evaluate(double d10) {
            return MathX.factorial((int) d10);
        }
    };
    public static final Function INT = new OneArg() { // from class: lib.zj.office.fc.hssf.formula.function.NumericFunction.14
        @Override // lib.zj.office.fc.hssf.formula.function.NumericFunction.OneArg
        public double evaluate(double d10) {
            return Math.round(d10 - 0.5d);
        }
    };
    public static final Function LN = new OneArg() { // from class: lib.zj.office.fc.hssf.formula.function.NumericFunction.15
        @Override // lib.zj.office.fc.hssf.formula.function.NumericFunction.OneArg
        public double evaluate(double d10) {
            return Math.log(d10);
        }
    };
    public static final Function LOG10 = new OneArg() { // from class: lib.zj.office.fc.hssf.formula.function.NumericFunction.16
        @Override // lib.zj.office.fc.hssf.formula.function.NumericFunction.OneArg
        public double evaluate(double d10) {
            return Math.log(d10) / NumericFunction.LOG_10_TO_BASE_e;
        }
    };
    public static final Function RADIANS = new OneArg() { // from class: lib.zj.office.fc.hssf.formula.function.NumericFunction.17
        @Override // lib.zj.office.fc.hssf.formula.function.NumericFunction.OneArg
        public double evaluate(double d10) {
            return Math.toRadians(d10);
        }
    };
    public static final Function SIGN = new OneArg() { // from class: lib.zj.office.fc.hssf.formula.function.NumericFunction.18
        @Override // lib.zj.office.fc.hssf.formula.function.NumericFunction.OneArg
        public double evaluate(double d10) {
            return MathX.sign(d10);
        }
    };
    public static final Function SIN = new OneArg() { // from class: lib.zj.office.fc.hssf.formula.function.NumericFunction.19
        @Override // lib.zj.office.fc.hssf.formula.function.NumericFunction.OneArg
        public double evaluate(double d10) {
            return Math.sin(d10);
        }
    };
    public static final Function SINH = new OneArg() { // from class: lib.zj.office.fc.hssf.formula.function.NumericFunction.20
        @Override // lib.zj.office.fc.hssf.formula.function.NumericFunction.OneArg
        public double evaluate(double d10) {
            return MathX.sinh(d10);
        }
    };
    public static final Function SQRT = new OneArg() { // from class: lib.zj.office.fc.hssf.formula.function.NumericFunction.21
        @Override // lib.zj.office.fc.hssf.formula.function.NumericFunction.OneArg
        public double evaluate(double d10) {
            return Math.sqrt(d10);
        }
    };
    public static final Function TAN = new OneArg() { // from class: lib.zj.office.fc.hssf.formula.function.NumericFunction.22
        @Override // lib.zj.office.fc.hssf.formula.function.NumericFunction.OneArg
        public double evaluate(double d10) {
            return Math.tan(d10);
        }
    };
    public static final Function TANH = new OneArg() { // from class: lib.zj.office.fc.hssf.formula.function.NumericFunction.23
        @Override // lib.zj.office.fc.hssf.formula.function.NumericFunction.OneArg
        public double evaluate(double d10) {
            return MathX.tanh(d10);
        }
    };
    public static final Function ATAN2 = new TwoArg() { // from class: lib.zj.office.fc.hssf.formula.function.NumericFunction.24
        @Override // lib.zj.office.fc.hssf.formula.function.NumericFunction.TwoArg
        public double evaluate(double d10, double d11) {
            if (d10 == 0.0d && d11 == 0.0d) {
                throw new EvaluationException(ErrorEval.DIV_ZERO);
            }
            return Math.atan2(d11, d10);
        }
    };
    public static final Function CEILING = new TwoArg() { // from class: lib.zj.office.fc.hssf.formula.function.NumericFunction.25
        @Override // lib.zj.office.fc.hssf.formula.function.NumericFunction.TwoArg
        public double evaluate(double d10, double d11) {
            return MathX.ceiling(d10, d11);
        }
    };
    public static final Function COMBIN = new TwoArg() { // from class: lib.zj.office.fc.hssf.formula.function.NumericFunction.26
        @Override // lib.zj.office.fc.hssf.formula.function.NumericFunction.TwoArg
        public double evaluate(double d10, double d11) {
            if (d10 <= 2.147483647E9d && d11 <= 2.147483647E9d) {
                return MathX.nChooseK((int) d10, (int) d11);
            }
            throw new EvaluationException(ErrorEval.NUM_ERROR);
        }
    };
    public static final Function FLOOR = new TwoArg() { // from class: lib.zj.office.fc.hssf.formula.function.NumericFunction.27
        @Override // lib.zj.office.fc.hssf.formula.function.NumericFunction.TwoArg
        public double evaluate(double d10, double d11) {
            if (d11 == 0.0d) {
                if (d10 == 0.0d) {
                    return 0.0d;
                }
                throw new EvaluationException(ErrorEval.DIV_ZERO);
            }
            return MathX.floor(d10, d11);
        }
    };
    public static final Function MOD = new TwoArg() { // from class: lib.zj.office.fc.hssf.formula.function.NumericFunction.28
        @Override // lib.zj.office.fc.hssf.formula.function.NumericFunction.TwoArg
        public double evaluate(double d10, double d11) {
            if (d11 != 0.0d) {
                return MathX.mod(d10, d11);
            }
            throw new EvaluationException(ErrorEval.DIV_ZERO);
        }
    };
    public static final Function POWER = new TwoArg() { // from class: lib.zj.office.fc.hssf.formula.function.NumericFunction.29
        @Override // lib.zj.office.fc.hssf.formula.function.NumericFunction.TwoArg
        public double evaluate(double d10, double d11) {
            return Math.pow(d10, d11);
        }
    };
    public static final Function ROUND = new TwoArg() { // from class: lib.zj.office.fc.hssf.formula.function.NumericFunction.30
        @Override // lib.zj.office.fc.hssf.formula.function.NumericFunction.TwoArg
        public double evaluate(double d10, double d11) {
            return MathX.round(d10, (int) d11);
        }
    };
    public static final Function ROUNDDOWN = new TwoArg() { // from class: lib.zj.office.fc.hssf.formula.function.NumericFunction.31
        @Override // lib.zj.office.fc.hssf.formula.function.NumericFunction.TwoArg
        public double evaluate(double d10, double d11) {
            return MathX.roundDown(d10, (int) d11);
        }
    };
    public static final Function ROUNDUP = new TwoArg() { // from class: lib.zj.office.fc.hssf.formula.function.NumericFunction.32
        @Override // lib.zj.office.fc.hssf.formula.function.NumericFunction.TwoArg
        public double evaluate(double d10, double d11) {
            return MathX.roundUp(d10, (int) d11);
        }
    };
    static final NumberEval TRUNC_ARG2_DEFAULT = new NumberEval(0.0d);
    public static final Function TRUNC = new Var1or2ArgFunction() { // from class: lib.zj.office.fc.hssf.formula.function.NumericFunction.33
        @Override // lib.zj.office.fc.hssf.formula.function.Function1Arg
        public ValueEval evaluate(int i10, int i11, ValueEval valueEval) {
            return evaluate(i10, i11, valueEval, NumericFunction.TRUNC_ARG2_DEFAULT);
        }

        @Override // lib.zj.office.fc.hssf.formula.function.Function2Arg
        public ValueEval evaluate(int i10, int i11, ValueEval valueEval, ValueEval valueEval2) {
            try {
                double singleOperandEvaluate = NumericFunction.singleOperandEvaluate(valueEval, i10, i11);
                double pow = Math.pow(NumericFunction.TEN, NumericFunction.singleOperandEvaluate(valueEval2, i10, i11));
                double floor = Math.floor(singleOperandEvaluate * pow) / pow;
                NumericFunction.checkValue(floor);
                return new NumberEval(floor);
            } catch (EvaluationException e10) {
                return e10.getErrorEval();
            }
        }
    };
    public static final Function LOG = new Log();
    static final NumberEval PI_EVAL = new NumberEval(3.141592653589793d);
    public static final Function PI = new Fixed0ArgFunction() { // from class: lib.zj.office.fc.hssf.formula.function.NumericFunction.34
        @Override // lib.zj.office.fc.hssf.formula.function.Function0Arg
        public ValueEval evaluate(int i10, int i11) {
            return NumericFunction.PI_EVAL;
        }
    };
    public static final Function RAND = new Fixed0ArgFunction() { // from class: lib.zj.office.fc.hssf.formula.function.NumericFunction.35
        @Override // lib.zj.office.fc.hssf.formula.function.Function0Arg
        public ValueEval evaluate(int i10, int i11) {
            return new NumberEval(Math.random());
        }
    };
    public static final Function POISSON = new Fixed3ArgFunction() { // from class: lib.zj.office.fc.hssf.formula.function.NumericFunction.36
        private static final double DEFAULT_RETURN_RESULT = 1.0d;
        private final long[] FACTORIALS = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600, 6227020800L, 87178291200L, 1307674368000L, 20922789888000L, 355687428096000L, 6402373705728000L, 121645100408832000L, 2432902008176640000L};

        private boolean checkArgument(double d10) {
            NumericFunction.checkValue(d10);
            if (d10 >= 0.0d) {
                return true;
            }
            throw new EvaluationException(ErrorEval.NUM_ERROR);
        }

        private double cumulativeProbability(int i10, double d10) {
            double d11 = 0.0d;
            for (int i11 = 0; i11 <= i10; i11++) {
                d11 += probability(i11, d10);
            }
            return d11;
        }

        private boolean isDefaultResult(double d10, double d11) {
            if (d10 == 0.0d && d11 == 0.0d) {
                return true;
            }
            return false;
        }

        private double probability(int i10, double d10) {
            return (Math.exp(-d10) * Math.pow(d10, i10)) / factorial(i10);
        }

        @Override // lib.zj.office.fc.hssf.formula.function.Function3Arg
        public ValueEval evaluate(int i10, int i11, ValueEval valueEval, ValueEval valueEval2, ValueEval valueEval3) {
            double probability;
            boolean booleanValue = ((BoolEval) valueEval3).getBooleanValue();
            try {
                double singleOperandEvaluate = NumericFunction.singleOperandEvaluate(valueEval, i10, i11);
                double singleOperandEvaluate2 = NumericFunction.singleOperandEvaluate(valueEval2, i10, i11);
                if (isDefaultResult(singleOperandEvaluate, singleOperandEvaluate2)) {
                    return new NumberEval(1.0d);
                }
                checkArgument(singleOperandEvaluate);
                checkArgument(singleOperandEvaluate2);
                if (booleanValue) {
                    probability = cumulativeProbability((int) singleOperandEvaluate, singleOperandEvaluate2);
                } else {
                    probability = probability((int) singleOperandEvaluate, singleOperandEvaluate2);
                }
                NumericFunction.checkValue(probability);
                return new NumberEval(probability);
            } catch (EvaluationException e10) {
                return e10.getErrorEval();
            }
        }

        public long factorial(int i10) {
            if (i10 >= 0 && i10 <= 20) {
                return this.FACTORIALS[i10];
            }
            throw new IllegalArgumentException("Valid argument should be in the range [0..20]");
        }
    };

    /* loaded from: classes3.dex */
    public static abstract class OneArg extends Fixed1ArgFunction {
        public final double eval(ValueEval[] valueEvalArr, int i10, int i11) {
            if (valueEvalArr.length == 1) {
                return evaluate(NumericFunction.singleOperandEvaluate(valueEvalArr[0], i10, i11));
            }
            throw new EvaluationException(ErrorEval.VALUE_INVALID);
        }

        public abstract double evaluate(double d10);

        @Override // lib.zj.office.fc.hssf.formula.function.Function1Arg
        public ValueEval evaluate(int i10, int i11, ValueEval valueEval) {
            try {
                double evaluate = evaluate(NumericFunction.singleOperandEvaluate(valueEval, i10, i11));
                NumericFunction.checkValue(evaluate);
                return new NumberEval(evaluate);
            } catch (EvaluationException e10) {
                return e10.getErrorEval();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class TwoArg extends Fixed2ArgFunction {
        public abstract double evaluate(double d10, double d11);

        @Override // lib.zj.office.fc.hssf.formula.function.Function2Arg
        public ValueEval evaluate(int i10, int i11, ValueEval valueEval, ValueEval valueEval2) {
            try {
                double evaluate = evaluate(NumericFunction.singleOperandEvaluate(valueEval, i10, i11), NumericFunction.singleOperandEvaluate(valueEval2, i10, i11));
                NumericFunction.checkValue(evaluate);
                return new NumberEval(evaluate);
            } catch (EvaluationException e10) {
                return e10.getErrorEval();
            }
        }
    }

    public static final void checkValue(double d10) {
        if (!Double.isNaN(d10) && !Double.isInfinite(d10)) {
            return;
        }
        throw new EvaluationException(ErrorEval.NUM_ERROR);
    }

    public static final double singleOperandEvaluate(ValueEval valueEval, int i10, int i11) {
        if (valueEval != null) {
            double coerceValueToDouble = OperandResolver.coerceValueToDouble(OperandResolver.getSingleValue(valueEval, i10, i11));
            checkValue(coerceValueToDouble);
            return coerceValueToDouble;
        }
        throw new IllegalArgumentException("arg must not be null");
    }

    public abstract double eval(ValueEval[] valueEvalArr, int i10, int i11);

    @Override // lib.zj.office.fc.hssf.formula.function.Function
    public final ValueEval evaluate(ValueEval[] valueEvalArr, int i10, int i11) {
        try {
            double eval = eval(valueEvalArr, i10, i11);
            checkValue(eval);
            return new NumberEval(eval);
        } catch (EvaluationException e10) {
            return e10.getErrorEval();
        }
    }

    /* loaded from: classes3.dex */
    public static final class Log extends Var1or2ArgFunction {
        @Override // lib.zj.office.fc.hssf.formula.function.Function1Arg
        public ValueEval evaluate(int i10, int i11, ValueEval valueEval) {
            try {
                double log = Math.log(NumericFunction.singleOperandEvaluate(valueEval, i10, i11)) / NumericFunction.LOG_10_TO_BASE_e;
                NumericFunction.checkValue(log);
                return new NumberEval(log);
            } catch (EvaluationException e10) {
                return e10.getErrorEval();
            }
        }

        @Override // lib.zj.office.fc.hssf.formula.function.Function2Arg
        public ValueEval evaluate(int i10, int i11, ValueEval valueEval, ValueEval valueEval2) {
            try {
                double singleOperandEvaluate = NumericFunction.singleOperandEvaluate(valueEval, i10, i11);
                double singleOperandEvaluate2 = NumericFunction.singleOperandEvaluate(valueEval2, i10, i11);
                double log = Math.log(singleOperandEvaluate);
                if (singleOperandEvaluate2 != 2.718281828459045d) {
                    log /= Math.log(singleOperandEvaluate2);
                }
                NumericFunction.checkValue(log);
                return new NumberEval(log);
            } catch (EvaluationException e10) {
                return e10.getErrorEval();
            }
        }
    }
}
