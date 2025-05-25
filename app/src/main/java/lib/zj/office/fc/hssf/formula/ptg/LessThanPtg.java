package lib.zj.office.fc.hssf.formula.ptg;

/* loaded from: classes3.dex */
public final class LessThanPtg extends ValueOperatorPtg {
    private static final String LESSTHAN = "<";
    public static final ValueOperatorPtg instance = new LessThanPtg();
    public static final byte sid = 9;

    private LessThanPtg() {
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.OperationPtg
    public int getNumberOfOperands() {
        return 2;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.ValueOperatorPtg
    public byte getSid() {
        return (byte) 9;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.OperationPtg
    public String toFormulaString(String[] strArr) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(strArr[0]);
        stringBuffer.append(LESSTHAN);
        stringBuffer.append(strArr[1]);
        return stringBuffer.toString();
    }
}
