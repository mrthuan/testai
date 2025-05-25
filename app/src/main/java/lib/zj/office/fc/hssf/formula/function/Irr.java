package lib.zj.office.fc.hssf.formula.function;

import lib.zj.office.fc.hssf.formula.eval.ErrorEval;
import lib.zj.office.fc.hssf.formula.eval.EvaluationException;
import lib.zj.office.fc.hssf.formula.eval.NumberEval;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;
import lib.zj.office.fc.hssf.formula.function.AggregateFunction;

/* loaded from: classes3.dex */
public final class Irr implements Function {
    public static double irr(double[] dArr) {
        return irr(dArr, 0.1d);
    }

    @Override // lib.zj.office.fc.hssf.formula.function.Function
    public ValueEval evaluate(ValueEval[] valueEvalArr, int i10, int i11) {
        double d10;
        if (valueEvalArr.length != 0 && valueEvalArr.length <= 2) {
            try {
                double[] collectValues = AggregateFunction.ValueCollector.collectValues(valueEvalArr[0]);
                if (valueEvalArr.length == 2) {
                    d10 = NumericFunction.singleOperandEvaluate(valueEvalArr[1], i10, i11);
                } else {
                    d10 = 0.1d;
                }
                double irr = irr(collectValues, d10);
                NumericFunction.checkValue(irr);
                return new NumberEval(irr);
            } catch (EvaluationException e10) {
                return e10.getErrorEval();
            }
        }
        return ErrorEval.VALUE_INVALID;
    }

    public static double irr(double[] dArr, double d10) {
        int i10 = 0;
        while (i10 < 20) {
            double d11 = 0.0d;
            int i11 = 0;
            double d12 = 0.0d;
            while (i11 < dArr.length) {
                double d13 = 1.0d + d10;
                d11 += dArr[i11] / Math.pow(d13, i11);
                i11++;
                d12 += ((-i11) * dArr[i11]) / Math.pow(d13, i11);
            }
            double d14 = d10 - (d11 / d12);
            if (Math.abs(d14 - d10) <= 1.0E-7d) {
                return d14;
            }
            i10++;
            d10 = d14;
        }
        return Double.NaN;
    }
}
