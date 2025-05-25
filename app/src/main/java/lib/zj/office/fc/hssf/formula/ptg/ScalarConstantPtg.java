package lib.zj.office.fc.hssf.formula.ptg;

/* loaded from: classes3.dex */
public abstract class ScalarConstantPtg extends Ptg {
    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public final byte getDefaultOperandClass() {
        return (byte) 32;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public final boolean isBaseToken() {
        return true;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer(64);
        stringBuffer.append(getClass().getName());
        stringBuffer.append(" [");
        stringBuffer.append(toFormulaString());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
