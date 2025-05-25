package lib.zj.office.fc.hssf.formula;

import b.a;
import lib.zj.office.fc.hssf.formula.eval.ErrorEval;
import lib.zj.office.fc.hssf.formula.eval.NameEval;
import lib.zj.office.fc.hssf.formula.eval.NameXEval;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;
import lib.zj.office.fc.hssf.formula.function.FreeRefFunction;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class UserDefinedFunction implements FreeRefFunction {
    public static final FreeRefFunction instance = new UserDefinedFunction();

    private UserDefinedFunction() {
    }

    @Override // lib.zj.office.fc.hssf.formula.function.FreeRefFunction
    public ValueEval evaluate(ValueEval[] valueEvalArr, OperationEvaluationContext operationEvaluationContext) {
        String resolveNameXText;
        int length = valueEvalArr.length;
        if (length >= 1) {
            ValueEval valueEval = valueEvalArr[0];
            if (valueEval instanceof NameEval) {
                resolveNameXText = ((NameEval) valueEval).getFunctionName();
            } else if (valueEval instanceof NameXEval) {
                resolveNameXText = operationEvaluationContext.getWorkbook().resolveNameXText(((NameXEval) valueEval).getPtg());
            } else {
                throw new RuntimeException(a.e(valueEval, new StringBuilder("First argument should be a NameEval, but got ("), ")"));
            }
            FreeRefFunction findUserDefinedFunction = operationEvaluationContext.findUserDefinedFunction(resolveNameXText);
            if (findUserDefinedFunction == null) {
                return ErrorEval.valueOf(29);
            }
            int i10 = length - 1;
            ValueEval[] valueEvalArr2 = new ValueEval[i10];
            System.arraycopy(valueEvalArr, 1, valueEvalArr2, 0, i10);
            return findUserDefinedFunction.evaluate(valueEvalArr2, operationEvaluationContext);
        }
        throw new RuntimeException("function name argument missing");
    }
}
