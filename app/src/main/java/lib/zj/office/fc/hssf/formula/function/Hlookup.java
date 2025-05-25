package lib.zj.office.fc.hssf.formula.function;

import lib.zj.office.fc.hssf.formula.TwoDEval;
import lib.zj.office.fc.hssf.formula.eval.BoolEval;
import lib.zj.office.fc.hssf.formula.eval.EvaluationException;
import lib.zj.office.fc.hssf.formula.eval.OperandResolver;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;
import lib.zj.office.fc.hssf.formula.function.LookupUtils;

/* loaded from: classes3.dex */
public final class Hlookup extends Var3or4ArgFunction {
    private static final ValueEval DEFAULT_ARG3 = BoolEval.TRUE;

    private LookupUtils.ValueVector createResultColumnVector(TwoDEval twoDEval, int i10) {
        if (i10 < twoDEval.getHeight()) {
            return LookupUtils.createRowVector(twoDEval, i10);
        }
        throw EvaluationException.invalidRef();
    }

    @Override // lib.zj.office.fc.hssf.formula.function.Function3Arg
    public ValueEval evaluate(int i10, int i11, ValueEval valueEval, ValueEval valueEval2, ValueEval valueEval3) {
        return evaluate(i10, i11, valueEval, valueEval2, valueEval3, DEFAULT_ARG3);
    }

    @Override // lib.zj.office.fc.hssf.formula.function.Function4Arg
    public ValueEval evaluate(int i10, int i11, ValueEval valueEval, ValueEval valueEval2, ValueEval valueEval3, ValueEval valueEval4) {
        try {
            ValueEval singleValue = OperandResolver.getSingleValue(valueEval, i10, i11);
            TwoDEval resolveTableArrayArg = LookupUtils.resolveTableArrayArg(valueEval2);
            return createResultColumnVector(resolveTableArrayArg, LookupUtils.resolveRowOrColIndexArg(valueEval3, i10, i11)).getItem(LookupUtils.lookupIndexOfValue(singleValue, LookupUtils.createRowVector(resolveTableArrayArg, 0), LookupUtils.resolveRangeLookupArg(valueEval4, i10, i11)));
        } catch (EvaluationException e10) {
            return e10.getErrorEval();
        }
    }
}
