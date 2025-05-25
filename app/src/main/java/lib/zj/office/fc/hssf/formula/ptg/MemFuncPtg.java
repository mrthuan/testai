package lib.zj.office.fc.hssf.formula.ptg;

import a0.d;
import lib.zj.office.fc.util.LittleEndianInput;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class MemFuncPtg extends OperandPtg {
    public static final byte sid = 41;
    private final int field_1_len_ref_subexpression;

    public MemFuncPtg(LittleEndianInput littleEndianInput) {
        this(littleEndianInput.readUShort());
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public byte getDefaultOperandClass() {
        return (byte) 0;
    }

    public int getLenRefSubexpression() {
        return this.field_1_len_ref_subexpression;
    }

    public int getNumberOfOperands() {
        return this.field_1_len_ref_subexpression;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public int getSize() {
        return 3;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public String toFormulaString() {
        return "";
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer(64);
        d.h(MemFuncPtg.class, stringBuffer, " [len=");
        stringBuffer.append(this.field_1_len_ref_subexpression);
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public void write(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeByte(getPtgClass() + 41);
        littleEndianOutput.writeShort(this.field_1_len_ref_subexpression);
    }

    public MemFuncPtg(int i10) {
        this.field_1_len_ref_subexpression = i10;
    }
}
