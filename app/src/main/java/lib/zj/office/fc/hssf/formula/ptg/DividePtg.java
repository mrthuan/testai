package lib.zj.office.fc.hssf.formula.ptg;

import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;

/* loaded from: classes3.dex */
public final class DividePtg extends ValueOperatorPtg {
    public static final ValueOperatorPtg instance = new DividePtg();
    public static final byte sid = 6;

    private DividePtg() {
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.OperationPtg
    public int getNumberOfOperands() {
        return 2;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.ValueOperatorPtg
    public byte getSid() {
        return (byte) 6;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.OperationPtg
    public String toFormulaString(String[] strArr) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(strArr[0]);
        stringBuffer.append(PackagingURIHelper.FORWARD_SLASH_STRING);
        stringBuffer.append(strArr[1]);
        return stringBuffer.toString();
    }
}
