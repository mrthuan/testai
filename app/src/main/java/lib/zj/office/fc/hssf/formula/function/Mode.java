package lib.zj.office.fc.hssf.formula.function;

import b.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lib.zj.office.fc.hssf.formula.TwoDEval;
import lib.zj.office.fc.hssf.formula.eval.BlankEval;
import lib.zj.office.fc.hssf.formula.eval.BoolEval;
import lib.zj.office.fc.hssf.formula.eval.ErrorEval;
import lib.zj.office.fc.hssf.formula.eval.EvaluationException;
import lib.zj.office.fc.hssf.formula.eval.NumberEval;
import lib.zj.office.fc.hssf.formula.eval.RefEval;
import lib.zj.office.fc.hssf.formula.eval.StringEval;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;

/* loaded from: classes3.dex */
public final class Mode implements Function {
    private static void collectValue(ValueEval valueEval, List<Double> list, boolean z10) {
        if (!(valueEval instanceof ErrorEval)) {
            if (valueEval != BlankEval.instance && !(valueEval instanceof BoolEval) && !(valueEval instanceof StringEval)) {
                if (valueEval instanceof NumberEval) {
                    list.add(new Double(((NumberEval) valueEval).getNumberValue()));
                    return;
                }
                throw new RuntimeException(a.e(valueEval, new StringBuilder("Unexpected value type ("), ")"));
            } else if (!z10) {
                return;
            } else {
                throw EvaluationException.invalidValue();
            }
        }
        throw new EvaluationException((ErrorEval) valueEval);
    }

    private static void collectValues(ValueEval valueEval, List<Double> list) {
        if (valueEval instanceof TwoDEval) {
            TwoDEval twoDEval = (TwoDEval) valueEval;
            int width = twoDEval.getWidth();
            int height = twoDEval.getHeight();
            for (int i10 = 0; i10 < height; i10++) {
                for (int i11 = 0; i11 < width; i11++) {
                    collectValue(twoDEval.getValue(i10, i11), list, false);
                }
            }
        } else if (valueEval instanceof RefEval) {
            collectValue(((RefEval) valueEval).getInnerValueEval(), list, true);
        } else {
            collectValue(valueEval, list, true);
        }
    }

    public static double evaluate(double[] dArr) {
        if (dArr.length >= 2) {
            int length = dArr.length;
            int[] iArr = new int[length];
            Arrays.fill(iArr, 1);
            int length2 = dArr.length;
            int i10 = 0;
            while (i10 < length2) {
                int i11 = i10 + 1;
                int length3 = dArr.length;
                for (int i12 = i11; i12 < length3; i12++) {
                    if (dArr[i10] == dArr[i12]) {
                        iArr[i10] = iArr[i10] + 1;
                    }
                }
                i10 = i11;
            }
            double d10 = 0.0d;
            int i13 = 0;
            for (int i14 = 0; i14 < length; i14++) {
                int i15 = iArr[i14];
                if (i15 > i13) {
                    d10 = dArr[i14];
                    i13 = i15;
                }
            }
            if (i13 > 1) {
                return d10;
            }
            throw new EvaluationException(ErrorEval.NA);
        }
        throw new EvaluationException(ErrorEval.NA);
    }

    @Override // lib.zj.office.fc.hssf.formula.function.Function
    public ValueEval evaluate(ValueEval[] valueEvalArr, int i10, int i11) {
        try {
            ArrayList arrayList = new ArrayList();
            for (ValueEval valueEval : valueEvalArr) {
                collectValues(valueEval, arrayList);
            }
            int size = arrayList.size();
            double[] dArr = new double[size];
            for (int i12 = 0; i12 < size; i12++) {
                dArr[i12] = ((Double) arrayList.get(i12)).doubleValue();
            }
            return new NumberEval(evaluate(dArr));
        } catch (EvaluationException e10) {
            return e10.getErrorEval();
        }
    }
}
