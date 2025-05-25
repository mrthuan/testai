package lib.zj.office.fc.hssf.formula.function;

import lib.zj.office.fc.hssf.formula.eval.ErrorEval;
import lib.zj.office.fc.hssf.formula.eval.EvaluationException;
import lib.zj.office.fc.hssf.formula.eval.NumberEval;
import lib.zj.office.fc.hssf.formula.eval.OperandResolver;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;

/* loaded from: classes3.dex */
public abstract class AggregateFunction extends MultiOperandNumericFunction {
    public static final Function AVEDEV = new AggregateFunction() { // from class: lib.zj.office.fc.hssf.formula.function.AggregateFunction.2
        @Override // lib.zj.office.fc.hssf.formula.function.MultiOperandNumericFunction
        public double evaluate(double[] dArr) {
            return StatsLib.avedev(dArr);
        }
    };
    public static final Function AVERAGE = new AggregateFunction() { // from class: lib.zj.office.fc.hssf.formula.function.AggregateFunction.3
        @Override // lib.zj.office.fc.hssf.formula.function.MultiOperandNumericFunction
        public double evaluate(double[] dArr) {
            if (dArr.length >= 1) {
                return MathX.average(dArr);
            }
            throw new EvaluationException(ErrorEval.DIV_ZERO);
        }
    };
    public static final Function DEVSQ = new AggregateFunction() { // from class: lib.zj.office.fc.hssf.formula.function.AggregateFunction.4
        @Override // lib.zj.office.fc.hssf.formula.function.MultiOperandNumericFunction
        public double evaluate(double[] dArr) {
            return StatsLib.devsq(dArr);
        }
    };
    public static final Function LARGE = new LargeSmall(true);
    public static final Function MAX = new AggregateFunction() { // from class: lib.zj.office.fc.hssf.formula.function.AggregateFunction.5
        @Override // lib.zj.office.fc.hssf.formula.function.MultiOperandNumericFunction
        public double evaluate(double[] dArr) {
            if (dArr.length > 0) {
                return MathX.max(dArr);
            }
            return 0.0d;
        }
    };
    public static final Function MEDIAN = new AggregateFunction() { // from class: lib.zj.office.fc.hssf.formula.function.AggregateFunction.6
        @Override // lib.zj.office.fc.hssf.formula.function.MultiOperandNumericFunction
        public double evaluate(double[] dArr) {
            return StatsLib.median(dArr);
        }
    };
    public static final Function MIN = new AggregateFunction() { // from class: lib.zj.office.fc.hssf.formula.function.AggregateFunction.7
        @Override // lib.zj.office.fc.hssf.formula.function.MultiOperandNumericFunction
        public double evaluate(double[] dArr) {
            if (dArr.length > 0) {
                return MathX.min(dArr);
            }
            return 0.0d;
        }
    };
    public static final Function PRODUCT = new AggregateFunction() { // from class: lib.zj.office.fc.hssf.formula.function.AggregateFunction.8
        @Override // lib.zj.office.fc.hssf.formula.function.MultiOperandNumericFunction
        public double evaluate(double[] dArr) {
            return MathX.product(dArr);
        }
    };
    public static final Function SMALL = new LargeSmall(false);
    public static final Function STDEV = new AggregateFunction() { // from class: lib.zj.office.fc.hssf.formula.function.AggregateFunction.9
        @Override // lib.zj.office.fc.hssf.formula.function.MultiOperandNumericFunction
        public double evaluate(double[] dArr) {
            if (dArr.length >= 1) {
                return StatsLib.stdev(dArr);
            }
            throw new EvaluationException(ErrorEval.DIV_ZERO);
        }
    };
    public static final Function SUM = new AggregateFunction() { // from class: lib.zj.office.fc.hssf.formula.function.AggregateFunction.10
        @Override // lib.zj.office.fc.hssf.formula.function.MultiOperandNumericFunction
        public double evaluate(double[] dArr) {
            return MathX.sum(dArr);
        }
    };
    public static final Function SUMSQ = new AggregateFunction() { // from class: lib.zj.office.fc.hssf.formula.function.AggregateFunction.11
        @Override // lib.zj.office.fc.hssf.formula.function.MultiOperandNumericFunction
        public double evaluate(double[] dArr) {
            return MathX.sumsq(dArr);
        }
    };
    public static final Function VAR = new AggregateFunction() { // from class: lib.zj.office.fc.hssf.formula.function.AggregateFunction.12
        @Override // lib.zj.office.fc.hssf.formula.function.MultiOperandNumericFunction
        public double evaluate(double[] dArr) {
            if (dArr.length >= 1) {
                return StatsLib.var(dArr);
            }
            throw new EvaluationException(ErrorEval.DIV_ZERO);
        }
    };
    public static final Function VARP = new AggregateFunction() { // from class: lib.zj.office.fc.hssf.formula.function.AggregateFunction.13
        @Override // lib.zj.office.fc.hssf.formula.function.MultiOperandNumericFunction
        public double evaluate(double[] dArr) {
            if (dArr.length >= 1) {
                return StatsLib.varp(dArr);
            }
            throw new EvaluationException(ErrorEval.DIV_ZERO);
        }
    };
    public static final Function DB = new AggregateFunction() { // from class: lib.zj.office.fc.hssf.formula.function.AggregateFunction.14
        private void checkParas(double[] dArr) {
            int length = dArr.length;
            if (length != 4 && length != 5) {
                throw new EvaluationException(ErrorEval.NA);
            }
            double d10 = dArr[2];
            if (d10 > 0.0d) {
                double d11 = dArr[3];
                if (d11 > 0.0d && d11 - d10 <= 1.0d) {
                    if (length == 5) {
                        double d12 = dArr[4];
                        if (d12 > 12.0d || d12 <= 0.0d) {
                            throw new EvaluationException(ErrorEval.NA);
                        }
                        return;
                    }
                    return;
                }
            }
            throw new EvaluationException(ErrorEval.NA);
        }

        private double db(double d10, double d11, double d12, double d13, double d14) {
            double d15;
            if (Math.abs(d13 - ((int) d13)) <= 0.001d) {
                double round = Math.round(((float) (1.0d - Math.pow(d11 / d10, 1.0d / d12))) * 1000.0f) / 1000.0d;
                if (Math.abs(d13 - 1.0d) < 0.001d) {
                    d15 = d10 * round * d14;
                } else {
                    double d16 = ((d10 * round) * d14) / 12.0d;
                    double d17 = d10 - d16;
                    int i10 = 2;
                    if (d13 <= d12) {
                        while (i10 <= d13) {
                            d16 = d17 * round;
                            d17 -= d16;
                            i10++;
                        }
                        return d16;
                    } else if (d13 - d12 <= 1.0d) {
                        if (Math.abs(d14 - 12.0d) < 0.001d) {
                            return 0.0d;
                        }
                        while (i10 <= d12) {
                            d17 -= d17 * round;
                            i10++;
                        }
                        d15 = (12.0d - d14) * d17 * round;
                    } else {
                        throw new EvaluationException(ErrorEval.NA);
                    }
                }
                return d15 / 12.0d;
            }
            throw new EvaluationException(ErrorEval.NA);
        }

        @Override // lib.zj.office.fc.hssf.formula.function.MultiOperandNumericFunction
        public double evaluate(double[] dArr) {
            checkParas(dArr);
            int length = dArr.length;
            if (length == 4) {
                return db(dArr[0], dArr[1], dArr[2], dArr[3], 12.0d);
            }
            if (length == 5) {
                return db(dArr[0], dArr[1], dArr[2], dArr[3], dArr[4]);
            }
            throw new EvaluationException(ErrorEval.NA);
        }
    };
    public static final Function DDB = new AggregateFunction() { // from class: lib.zj.office.fc.hssf.formula.function.AggregateFunction.15
        private void checkParas(double[] dArr) {
            int length = dArr.length;
            if (length != 4 && length != 5) {
                throw new EvaluationException(ErrorEval.NA);
            }
            double d10 = dArr[2];
            if (d10 > 0.0d) {
                double d11 = dArr[3];
                if (d11 > 0.0d && d11 <= d10) {
                    return;
                }
            }
            throw new EvaluationException(ErrorEval.NA);
        }

        private double ddb(double d10, double d11, double d12, double d13, double d14) {
            if (Math.abs(d13 - ((int) d13)) <= 0.001d) {
                double round = Math.round(((float) (d14 / d12)) * 1000.0f) / 1000.0d;
                double min = Math.min(d10 * round, d10 - d11);
                for (int i10 = 2; i10 <= d13; i10++) {
                    min = Math.min(d10 * round, d10 - d11);
                    d10 -= min;
                }
                return min;
            }
            throw new EvaluationException(ErrorEval.NA);
        }

        @Override // lib.zj.office.fc.hssf.formula.function.MultiOperandNumericFunction
        public double evaluate(double[] dArr) {
            checkParas(dArr);
            int length = dArr.length;
            if (length == 4) {
                return ddb(dArr[0], dArr[1], dArr[2], dArr[3], 2.0d);
            }
            if (length == 5) {
                return ddb(dArr[0], dArr[1], dArr[2], dArr[3], dArr[4]);
            }
            throw new EvaluationException(ErrorEval.NA);
        }
    };

    /* loaded from: classes3.dex */
    public static final class LargeSmall extends Fixed2ArgFunction {
        private final boolean _isLarge;

        public LargeSmall(boolean z10) {
            this._isLarge = z10;
        }

        @Override // lib.zj.office.fc.hssf.formula.function.Function2Arg
        public ValueEval evaluate(int i10, int i11, ValueEval valueEval, ValueEval valueEval2) {
            double kthSmallest;
            try {
                double coerceValueToDouble = OperandResolver.coerceValueToDouble(OperandResolver.getSingleValue(valueEval2, i10, i11));
                if (coerceValueToDouble < 1.0d) {
                    return ErrorEval.NUM_ERROR;
                }
                int ceil = (int) Math.ceil(coerceValueToDouble);
                try {
                    double[] collectValues = ValueCollector.collectValues(valueEval);
                    if (ceil > collectValues.length) {
                        return ErrorEval.NUM_ERROR;
                    }
                    if (this._isLarge) {
                        kthSmallest = StatsLib.kthLargest(collectValues, ceil);
                    } else {
                        kthSmallest = StatsLib.kthSmallest(collectValues, ceil);
                    }
                    NumericFunction.checkValue(kthSmallest);
                    return new NumberEval(kthSmallest);
                } catch (EvaluationException e10) {
                    return e10.getErrorEval();
                }
            } catch (EvaluationException unused) {
                return ErrorEval.VALUE_INVALID;
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class ValueCollector extends MultiOperandNumericFunction {
        private static final ValueCollector instance = new ValueCollector();

        public ValueCollector() {
            super(false, false);
        }

        public static double[] collectValues(ValueEval... valueEvalArr) {
            return instance.getNumberArray(valueEvalArr);
        }

        @Override // lib.zj.office.fc.hssf.formula.function.MultiOperandNumericFunction
        public double evaluate(double[] dArr) {
            throw new IllegalStateException("should not be called");
        }
    }

    public AggregateFunction() {
        super(false, false);
    }

    public static Function subtotalInstance(Function function) {
        return new AggregateFunction() { // from class: lib.zj.office.fc.hssf.formula.function.AggregateFunction.1
            @Override // lib.zj.office.fc.hssf.formula.function.MultiOperandNumericFunction
            public double evaluate(double[] dArr) {
                return AggregateFunction.this.evaluate(dArr);
            }

            @Override // lib.zj.office.fc.hssf.formula.function.MultiOperandNumericFunction
            public boolean isSubtotalCounted() {
                return false;
            }
        };
    }
}
