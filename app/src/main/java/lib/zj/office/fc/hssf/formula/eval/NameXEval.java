package lib.zj.office.fc.hssf.formula.eval;

import a0.d;
import lib.zj.office.fc.hssf.formula.ptg.NameXPtg;

/* loaded from: classes3.dex */
public final class NameXEval implements ValueEval {
    private final NameXPtg _ptg;

    public NameXEval(NameXPtg nameXPtg) {
        this._ptg = nameXPtg;
    }

    public NameXPtg getPtg() {
        return this._ptg;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(64);
        d.h(NameXEval.class, stringBuffer, " [");
        stringBuffer.append(this._ptg.getSheetRefIndex());
        stringBuffer.append(", ");
        stringBuffer.append(this._ptg.getNameIndex());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
