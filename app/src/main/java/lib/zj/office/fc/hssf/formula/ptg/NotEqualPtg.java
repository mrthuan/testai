package lib.zj.office.fc.hssf.formula.ptg;

/* loaded from: classes3.dex */
public final class NotEqualPtg extends ValueOperatorPtg {
    public static final ValueOperatorPtg instance = new NotEqualPtg();
    public static final byte sid = 14;

    private NotEqualPtg() {
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.OperationPtg
    public int getNumberOfOperands() {
        return 2;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.ValueOperatorPtg
    public byte getSid() {
        return (byte) 14;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.OperationPtg
    public String toFormulaString(String[] strArr) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(strArr[0]);
        stringBuffer.append("<>");
        stringBuffer.append(strArr[1]);
        return stringBuffer.toString();
    }
}
