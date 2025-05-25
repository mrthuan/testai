package lib.zj.office.fc.hssf.formula.function;

import lib.zj.office.fc.hssf.formula.TwoDEval;
import lib.zj.office.fc.hssf.formula.eval.EvaluationException;
import lib.zj.office.fc.hssf.formula.eval.OperandResolver;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;
import lib.zj.office.fc.hssf.formula.function.LookupUtils;

/* loaded from: classes3.dex */
public final class Lookup extends Var2or3ArgFunction {
    private static LookupUtils.ValueVector createVector(TwoDEval twoDEval) {
        LookupUtils.ValueVector createVector = LookupUtils.createVector(twoDEval);
        if (createVector != null) {
            return createVector;
        }
        throw new RuntimeException("non-vector lookup or result areas not supported yet");
    }

    @Override // lib.zj.office.fc.hssf.formula.function.Function2Arg
    public ValueEval evaluate(int i10, int i11, ValueEval valueEval, ValueEval valueEval2) {
        throw new RuntimeException("Two arg version of LOOKUP not supported yet");
    }

    @Override // lib.zj.office.fc.hssf.formula.function.Function3Arg
    public ValueEval evaluate(int i10, int i11, ValueEval valueEval, ValueEval valueEval2, ValueEval valueEval3) {
        try {
            ValueEval singleValue = OperandResolver.getSingleValue(valueEval, i10, i11);
            TwoDEval resolveTableArrayArg = LookupUtils.resolveTableArrayArg(valueEval2);
            TwoDEval resolveTableArrayArg2 = LookupUtils.resolveTableArrayArg(valueEval3);
            LookupUtils.ValueVector createVector = createVector(resolveTableArrayArg);
            LookupUtils.ValueVector createVector2 = createVector(resolveTableArrayArg2);
            if (createVector.getSize() <= createVector2.getSize()) {
                int lookupIndexOfValue = LookupUtils.lookupIndexOfValue(singleValue, createVector, true);
                if (lookupIndexOfValue >= 0) {
                    return createVector2.getItem(lookupIndexOfValue);
                }
                return null;
            }
            throw new RuntimeException("Lookup vector and result vector of differing sizes not supported yet");
        } catch (EvaluationException e10) {
            return e10.getErrorEval();
        }
    }
}
