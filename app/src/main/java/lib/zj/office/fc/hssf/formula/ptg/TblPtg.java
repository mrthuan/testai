package lib.zj.office.fc.hssf.formula.ptg;

import lib.zj.office.fc.util.LittleEndianInput;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class TblPtg extends ControlPtg {
    private static final int SIZE = 5;
    public static final short sid = 2;
    private final int field_1_first_row;
    private final int field_2_first_col;

    public TblPtg(LittleEndianInput littleEndianInput) {
        this.field_1_first_row = littleEndianInput.readUShort();
        this.field_2_first_col = littleEndianInput.readUShort();
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
        throw new RuntimeException("Table and Arrays are not yet supported");
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[Data Table - Parent cell is an interior cell in a data table]\ntop left row = ");
        stringBuffer.append(getRow());
        stringBuffer.append("\ntop left col = ");
        stringBuffer.append(getColumn());
        stringBuffer.append("\n");
        return stringBuffer.toString();
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public void write(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeByte(getPtgClass() + 2);
        littleEndianOutput.writeShort(this.field_1_first_row);
        littleEndianOutput.writeShort(this.field_2_first_col);
    }
}
