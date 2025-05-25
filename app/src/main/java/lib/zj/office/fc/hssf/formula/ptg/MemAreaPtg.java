package lib.zj.office.fc.hssf.formula.ptg;

import a0.d;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.util.LittleEndianInput;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class MemAreaPtg extends OperandPtg {
    private static final int SIZE = 7;
    public static final short sid = 38;
    private final int field_1_reserved;
    private final int field_2_subex_len;

    public MemAreaPtg(int i10) {
        this.field_1_reserved = 0;
        this.field_2_subex_len = i10;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public byte getDefaultOperandClass() {
        return (byte) 32;
    }

    public int getLenRefSubexpression() {
        return this.field_2_subex_len;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public int getSize() {
        return 7;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public String toFormulaString() {
        return "";
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer(64);
        d.h(MemAreaPtg.class, stringBuffer, " [len=");
        stringBuffer.append(this.field_2_subex_len);
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public void write(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeByte(getPtgClass() + Field.ASK);
        littleEndianOutput.writeInt(this.field_1_reserved);
        littleEndianOutput.writeShort(this.field_2_subex_len);
    }

    public MemAreaPtg(LittleEndianInput littleEndianInput) {
        this.field_1_reserved = littleEndianInput.readInt();
        this.field_2_subex_len = littleEndianInput.readShort();
    }
}
