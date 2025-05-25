package lib.zj.office.fc.hssf.formula.ptg;

import lib.zj.office.fc.util.LittleEndianInput;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class ExpPtg extends ControlPtg {
    private static final int SIZE = 5;
    public static final short sid = 1;
    private final int field_1_first_row;
    private final int field_2_first_col;

    public ExpPtg(LittleEndianInput littleEndianInput) {
        this.field_1_first_row = littleEndianInput.readShort();
        this.field_2_first_col = littleEndianInput.readShort();
    }

    public int getColumn() {
        return this.field_2_first_col;
    }

    public int getRow() {
        return this.field_1_first_row;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public int getSize() {
        return 5;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public String toFormulaString() {
        throw new RuntimeException("Coding Error: Expected ExpPtg to be converted from Shared to Non-Shared Formula by ValueRecordsAggregate, but it wasn't");
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[Array Formula or Shared Formula]\nrow = ");
        stringBuffer.append(getRow());
        stringBuffer.append("\ncol = ");
        stringBuffer.append(getColumn());
        stringBuffer.append("\n");
        return stringBuffer.toString();
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public void write(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeByte(getPtgClass() + 1);
        littleEndianOutput.writeShort(this.field_1_first_row);
        littleEndianOutput.writeShort(this.field_2_first_col);
    }

    public ExpPtg(int i10, int i11) {
        this.field_1_first_row = i10;
        this.field_2_first_col = i11;
    }
}
