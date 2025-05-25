package lib.zj.office.fc.hssf.formula.eval;

import lib.zj.office.fc.hssf.formula.ptg.IntPtg;
import lib.zj.office.fc.hssf.formula.ptg.NumberPtg;
import lib.zj.office.fc.hssf.formula.ptg.Ptg;
import lib.zj.office.fc.ss.util.NumberToTextConverter;

/* loaded from: classes3.dex */
public final class NumberEval implements NumericValueEval, StringValueEval {
    public static final NumberEval ZERO = new NumberEval(0.0d);
    private String _stringValue;
    private final double _value;

    public NumberEval(Ptg ptg) {
        if (ptg != null) {
            if (ptg instanceof IntPtg) {
                this._value = ((IntPtg) ptg).getValue();
                return;
            } else if (ptg instanceof NumberPtg) {
                this._value = ((NumberPtg) ptg).getValue();
                return;
            } else {
                throw new IllegalArgumentException("bad argument type (" + ptg.getClass().getName() + ")");
            }
        }
        throw new IllegalArgumentException("ptg must not be null");
    }

    @Override // lib.zj.office.fc.hssf.formula.eval.NumericValueEval
    public double getNumberValue() {
        return this._value;
    }

    @Override // lib.zj.office.fc.hssf.formula.eval.StringValueEval
    public String getStringValue() {
        if (this._stringValue == null) {
            this._stringValue = NumberToTextConverter.toText(this._value);
        }
        return this._stringValue;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer(64);
        stringBuffer.append(NumberEval.class.getName());
        stringBuffer.append(" [");
        stringBuffer.append(getStringValue());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public NumberEval(double d10) {
        this._value = d10;
    }
}
