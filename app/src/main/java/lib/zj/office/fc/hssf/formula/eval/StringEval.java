package lib.zj.office.fc.hssf.formula.eval;

import androidx.activity.r;
import lib.zj.office.fc.hssf.formula.ptg.Ptg;
import lib.zj.office.fc.hssf.formula.ptg.StringPtg;

/* loaded from: classes3.dex */
public final class StringEval implements StringValueEval {
    public static final StringEval EMPTY_INSTANCE = new StringEval("");
    private final String _value;

    public StringEval(Ptg ptg) {
        this(((StringPtg) ptg).getValue());
    }

    @Override // lib.zj.office.fc.hssf.formula.eval.StringValueEval
    public String getStringValue() {
        return this._value;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(StringEval.class.getName());
        sb2.append(" [");
        return r.g(sb2, this._value, "]");
    }

    public StringEval(String str) {
        if (str != null) {
            this._value = str;
            return;
        }
        throw new IllegalArgumentException("value must not be null");
    }
}
