package lib.zj.office.fc.hssf.formula.ptg;

import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class RangePtg extends OperationPtg {
    public static final int SIZE = 1;
    public static final OperationPtg instance = new RangePtg();
    public static final byte sid = 17;

    private RangePtg() {
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
        return ":";
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public void write(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeByte(getPtgClass() + 17);
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.OperationPtg
    public String toFormulaString(String[] strArr) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(strArr[0]);
        stringBuffer.append(":");
        stringBuffer.append(strArr[1]);
        return stringBuffer.toString();
    }
}
