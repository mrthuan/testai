package lib.zj.office.fc.hssf.formula.eval;

import a0.d;

/* loaded from: classes3.dex */
public final class NameEval implements ValueEval {
    private final String _functionName;

    public NameEval(String str) {
        this._functionName = str;
    }

    public String getFunctionName() {
        return this._functionName;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(64);
        d.h(NameEval.class, stringBuffer, " [");
        stringBuffer.append(this._functionName);
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
