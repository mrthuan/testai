package lib.zj.office.fc.hssf.formula.ptg;

/* loaded from: classes3.dex */
public final class PowerPtg extends ValueOperatorPtg {
    public static final ValueOperatorPtg instance = new PowerPtg();
    public static final byte sid = 7;

    private PowerPtg() {
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.OperationPtg
    public int getNumberOfOperands() {
        return 2;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.ValueOperatorPtg
    public byte getSid() {
        return (byte) 7;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.OperationPtg
    public String toFormulaString(String[] strArr) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(strArr[0]);
        stringBuffer.append("^");
        stringBuffer.append(strArr[1]);
        return stringBuffer.toString();
    }
}
