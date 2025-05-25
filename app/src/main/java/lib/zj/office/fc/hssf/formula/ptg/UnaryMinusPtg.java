package lib.zj.office.fc.hssf.formula.ptg;

/* loaded from: classes3.dex */
public final class UnaryMinusPtg extends ValueOperatorPtg {
    private static final String MINUS = "-";
    public static final ValueOperatorPtg instance = new UnaryMinusPtg();
    public static final byte sid = 19;

    private UnaryMinusPtg() {
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.OperationPtg
    public int getNumberOfOperands() {
        return 1;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.ValueOperatorPtg
    public byte getSid() {
        return (byte) 19;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.OperationPtg
    public String toFormulaString(String[] strArr) {
        StringBuffer stringBuffer = new StringBuffer(MINUS);
        stringBuffer.append(strArr[0]);
        return stringBuffer.toString();
    }
}
