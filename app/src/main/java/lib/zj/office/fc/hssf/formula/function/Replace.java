package lib.zj.office.fc.hssf.formula.function;

import lib.zj.office.fc.hssf.formula.eval.ErrorEval;
import lib.zj.office.fc.hssf.formula.eval.EvaluationException;
import lib.zj.office.fc.hssf.formula.eval.StringEval;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;

/* loaded from: classes3.dex */
public final class Replace extends Fixed4ArgFunction {
    @Override // lib.zj.office.fc.hssf.formula.function.Function4Arg
    public ValueEval evaluate(int i10, int i11, ValueEval valueEval, ValueEval valueEval2, ValueEval valueEval3, ValueEval valueEval4) {
        try {
            String evaluateStringArg = TextFunction.evaluateStringArg(valueEval, i10, i11);
            int evaluateIntArg = TextFunction.evaluateIntArg(valueEval2, i10, i11);
            int evaluateIntArg2 = TextFunction.evaluateIntArg(valueEval3, i10, i11);
            String evaluateStringArg2 = TextFunction.evaluateStringArg(valueEval4, i10, i11);
            if (evaluateIntArg >= 1 && evaluateIntArg2 >= 0) {
                StringBuffer stringBuffer = new StringBuffer(evaluateStringArg);
                if (evaluateIntArg <= evaluateStringArg.length() && evaluateIntArg2 != 0) {
                    int i12 = evaluateIntArg - 1;
                    stringBuffer.delete(i12, evaluateIntArg2 + i12);
                }
                if (evaluateIntArg > stringBuffer.length()) {
                    stringBuffer.append(evaluateStringArg2);
                } else {
                    stringBuffer.insert(evaluateIntArg - 1, evaluateStringArg2);
                }
                return new StringEval(stringBuffer.toString());
            }
            return ErrorEval.VALUE_INVALID;
        } catch (EvaluationException e10) {
            return e10.getErrorEval();
        }
    }
}
