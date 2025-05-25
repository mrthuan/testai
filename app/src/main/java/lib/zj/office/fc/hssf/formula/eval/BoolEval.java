package lib.zj.office.fc.hssf.formula.eval;

/* loaded from: classes3.dex */
public final class BoolEval implements NumericValueEval, StringValueEval {
    public static final BoolEval FALSE = new BoolEval(false);
    public static final BoolEval TRUE = new BoolEval(true);
    private boolean _value;

    private BoolEval(boolean z10) {
        this._value = z10;
    }

    public static final BoolEval valueOf(boolean z10) {
        if (z10) {
            return TRUE;
        }
        return FALSE;
    }

    public boolean getBooleanValue() {
        return this._value;
    }

    @Override // lib.zj.office.fc.hssf.formula.eval.NumericValueEval
    public double getNumberValue() {
        if (this._value) {
            return 1.0d;
        }
        return 0.0d;
    }

    @Override // lib.zj.office.fc.hssf.formula.eval.StringValueEval
    public String getStringValue() {
        if (this._value) {
            return "TRUE";
        }
        return "FALSE";
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(BoolEval.class.getName());
        sb2.append(" [");
        sb2.append(getStringValue());
        sb2.append("]");
        return sb2.toString();
    }
}
