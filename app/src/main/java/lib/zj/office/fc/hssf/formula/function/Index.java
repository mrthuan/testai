package lib.zj.office.fc.hssf.formula.function;

import b.a;
import lib.zj.office.fc.hssf.formula.TwoDEval;
import lib.zj.office.fc.hssf.formula.eval.BlankEval;
import lib.zj.office.fc.hssf.formula.eval.ErrorEval;
import lib.zj.office.fc.hssf.formula.eval.EvaluationException;
import lib.zj.office.fc.hssf.formula.eval.MissingArgEval;
import lib.zj.office.fc.hssf.formula.eval.OperandResolver;
import lib.zj.office.fc.hssf.formula.eval.RefEval;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;

/* loaded from: classes3.dex */
public final class Index implements Function2Arg, Function3Arg, Function4Arg {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    private static TwoDEval convertFirstArg(ValueEval valueEval) {
        if (valueEval instanceof RefEval) {
            return ((RefEval) valueEval).offset(0, 0, 0, 0);
        }
        if (valueEval instanceof TwoDEval) {
            return (TwoDEval) valueEval;
        }
        throw new RuntimeException(a.e(valueEval, new StringBuilder("Incomplete code - cannot handle first arg of type ("), ")"));
    }

    private static ValueEval getValueFromArea(TwoDEval twoDEval, int i10, int i11) {
        TwoDEval twoDEval2;
        if (i10 != 0) {
            if (i10 <= twoDEval.getHeight()) {
                twoDEval2 = twoDEval.getRow(i10 - 1);
            } else {
                throw new EvaluationException(ErrorEval.REF_INVALID);
            }
        } else {
            twoDEval2 = twoDEval;
        }
        if (i11 != 0) {
            if (i11 <= twoDEval.getWidth()) {
                return twoDEval2.getColumn(i11 - 1);
            }
            throw new EvaluationException(ErrorEval.REF_INVALID);
        }
        return twoDEval2;
    }

    private static int resolveIndexArg(ValueEval valueEval, int i10, int i11) {
        ValueEval singleValue = OperandResolver.getSingleValue(valueEval, i10, i11);
        if (singleValue == MissingArgEval.instance || singleValue == BlankEval.instance) {
            return 0;
        }
        int coerceValueToInt = OperandResolver.coerceValueToInt(singleValue);
        if (coerceValueToInt >= 0) {
            return coerceValueToInt;
        }
        throw new EvaluationException(ErrorEval.VALUE_INVALID);
    }

    @Override // lib.zj.office.fc.hssf.formula.function.Function2Arg
    public ValueEval evaluate(int i10, int i11, ValueEval valueEval, ValueEval valueEval2) {
        TwoDEval convertFirstArg = convertFirstArg(valueEval);
        try {
            int resolveIndexArg = resolveIndexArg(valueEval2, i10, i11);
            int i12 = 0;
            if (!convertFirstArg.isColumn()) {
                if (!convertFirstArg.isRow()) {
                    return ErrorEval.REF_INVALID;
                }
                i12 = resolveIndexArg;
                resolveIndexArg = 0;
            }
            return getValueFromArea(convertFirstArg, resolveIndexArg, i12);
        } catch (EvaluationException e10) {
            return e10.getErrorEval();
        }
    }

    @Override // lib.zj.office.fc.hssf.formula.function.Function3Arg
    public ValueEval evaluate(int i10, int i11, ValueEval valueEval, ValueEval valueEval2, ValueEval valueEval3) {
        try {
            return getValueFromArea(convertFirstArg(valueEval), resolveIndexArg(valueEval2, i10, i11), resolveIndexArg(valueEval3, i10, i11));
        } catch (EvaluationException e10) {
            return e10.getErrorEval();
        }
    }

    @Override // lib.zj.office.fc.hssf.formula.function.Function4Arg
    public ValueEval evaluate(int i10, int i11, ValueEval valueEval, ValueEval valueEval2, ValueEval valueEval3, ValueEval valueEval4) {
        throw new RuntimeException("Incomplete code - don't know how to support the 'area_num' parameter yet)");
    }

    @Override // lib.zj.office.fc.hssf.formula.function.Function
    public ValueEval evaluate(ValueEval[] valueEvalArr, int i10, int i11) {
        int length = valueEvalArr.length;
        if (length != 2) {
            if (length != 3) {
                if (length != 4) {
                    return ErrorEval.VALUE_INVALID;
                }
                return evaluate(i10, i11, valueEvalArr[0], valueEvalArr[1], valueEvalArr[2], valueEvalArr[3]);
            }
            return evaluate(i10, i11, valueEvalArr[0], valueEvalArr[1], valueEvalArr[2]);
        }
        return evaluate(i10, i11, valueEvalArr[0], valueEvalArr[1]);
    }
}
