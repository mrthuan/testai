package lib.zj.office.fc.hssf.formula.ptg;

/* loaded from: classes3.dex */
public final class UnaryPlusPtg extends ValueOperatorPtg {
    private static final String ADD = "+";
    public static final ValueOperatorPtg instance = new UnaryPlusPtg();
    public static final byte sid = 18;

    private UnaryPlusPtg() {
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.OperationPtg
    public int getNumberOfOperands() {
        return 1;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.ValueOperatorPtg
    public byte getSid() {
        return (byte) 18;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.OperationPtg
    public String toFormulaString(String[] strArr) {
        StringBuffer stringBuffer = new StringBuffer(ADD);
        stringBuffer.append(strArr[0]);
        return stringBuffer.toString();
    }
}
