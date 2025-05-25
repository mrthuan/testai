package lib.zj.office.fc.hssf.formula.ptg;

/* loaded from: classes3.dex */
public final class SubtractPtg extends ValueOperatorPtg {
    public static final ValueOperatorPtg instance = new SubtractPtg();
    public static final byte sid = 4;

    private SubtractPtg() {
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.OperationPtg
    public int getNumberOfOperands() {
        return 2;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.ValueOperatorPtg
    public byte getSid() {
        return (byte) 4;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.OperationPtg
    public String toFormulaString(String[] strArr) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(strArr[0]);
        stringBuffer.append("-");
        stringBuffer.append(strArr[1]);
        return stringBuffer.toString();
    }
}
