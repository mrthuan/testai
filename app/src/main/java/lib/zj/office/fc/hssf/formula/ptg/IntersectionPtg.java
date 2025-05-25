package lib.zj.office.fc.hssf.formula.ptg;

import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class IntersectionPtg extends OperationPtg {
    public static final OperationPtg instance = new IntersectionPtg();
    public static final byte sid = 15;

    private IntersectionPtg() {
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.OperationPtg
    public int getNumberOfOperands() {
        return 2;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public int getSize() {
        return 1;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public final boolean isBaseToken() {
        return true;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public String toFormulaString() {
        return " ";
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public void write(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeByte(getPtgClass() + 15);
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.OperationPtg
    public String toFormulaString(String[] strArr) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(strArr[0]);
        stringBuffer.append(" ");
        stringBuffer.append(strArr[1]);
        return stringBuffer.toString();
    }
}
