package lib.zj.office.fc.hssf.formula.ptg;

import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.util.LittleEndianInput;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class MemErrPtg extends OperandPtg {
    private static final int SIZE = 7;
    public static final short sid = 39;
    private int field_1_reserved;
    private short field_2_subex_len;

    public MemErrPtg(LittleEndianInput littleEndianInput) {
        this.field_1_reserved = littleEndianInput.readInt();
        this.field_2_subex_len = littleEndianInput.readShort();
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public byte getDefaultOperandClass() {
        return (byte) 32;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public int getSize() {
        return 7;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public String toFormulaString() {
        return "ERR#";
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public void write(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeByte(getPtgClass() + Field.FILLIN);
        littleEndianOutput.writeInt(this.field_1_reserved);
        littleEndianOutput.writeShort(this.field_2_subex_len);
    }
}
