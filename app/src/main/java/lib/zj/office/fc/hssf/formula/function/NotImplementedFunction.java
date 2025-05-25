package lib.zj.office.fc.hssf.formula.function;

import lib.zj.office.fc.hssf.formula.eval.ErrorEval;
import lib.zj.office.fc.hssf.formula.eval.ValueEval;

/* loaded from: classes3.dex */
public final class NotImplementedFunction implements Function {
    private final String _functionName;

    public NotImplementedFunction() {
        this._functionName = NotImplementedFunction.class.getName();
    }

    @Override // lib.zj.office.fc.hssf.formula.function.Function
    public ValueEval evaluate(ValueEval[] valueEvalArr, int i10, int i11) {
        return ErrorEval.valueOf(29);
    }

    public String getFunctionName() {
        return this._functionName;
    }

    public NotImplementedFunction(String str) {
        this._functionName = str;
    }
}
