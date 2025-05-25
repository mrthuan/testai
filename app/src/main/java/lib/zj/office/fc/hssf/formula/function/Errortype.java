package lib.zj.office.fc.hssf.formula.function;

import a0.a;
import lib.zj.office.fc.hssf.formula.eval.ErrorEval;
import lib.zj.office.fc.hssf.formula.eval.EvaluationException;
import lib.zj.office.fc.hssf.formula.eval.NumberEval;
import lib.zj.office.fc.hssf.formula.eval.OperandResolver;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;

/* loaded from: classes3.dex */
public final class Errortype extends Fixed1ArgFunction {
    private int translateErrorCodeToErrorTypeValue(int i10) {
        if (i10 != 0) {
            if (i10 != 7) {
                if (i10 != 15) {
                    if (i10 != 23) {
                        if (i10 != 29) {
                            if (i10 != 36) {
                                if (i10 == 42) {
                                    return 7;
                                }
                                throw new IllegalArgumentException(a.g("Invalid error code (", i10, ")"));
                            }
                            return 6;
                        }
                        return 5;
                    }
                    return 4;
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }

    @Override // lib.zj.office.fc.hssf.formula.function.Function1Arg
    public ValueEval evaluate(int i10, int i11, ValueEval valueEval) {
        try {
            OperandResolver.getSingleValue(valueEval, i10, i11);
            return ErrorEval.NA;
        } catch (EvaluationException e10) {
            return new NumberEval(translateErrorCodeToErrorTypeValue(e10.getErrorEval().getErrorCode()));
        }
    }
}
