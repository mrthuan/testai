package lib.zj.office.fc.hssf.formula.ptg;

/* loaded from: classes3.dex */
public final class GreaterThanPtg extends ValueOperatorPtg {
    private static final String GREATERTHAN = ">";
    public static final ValueOperatorPtg instance = new GreaterThanPtg();
    public static final byte sid = 13;

    private GreaterThanPtg() {
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.OperationPtg
    public int getNumberOfOperands() {
        return 2;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.ValueOperatorPtg
    public byte getSid() {
        return (byte) 13;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.OperationPtg
    public String toFormulaString(String[] strArr) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(strArr[0]);
        stringBuffer.append(GREATERTHAN);
        stringBuffer.append(strArr[1]);
        return stringBuffer.toString();
    }
}
