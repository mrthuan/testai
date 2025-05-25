package lib.zj.office.fc.hssf.formula.ptg;

import lib.zj.office.fc.hpsf.Variant;
import lib.zj.office.fc.ss.util.CellReference;
import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.BitFieldFactory;
import lib.zj.office.fc.util.LittleEndianInput;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public abstract class RefPtgBase extends OperandPtg {
    private int field_1_row;
    private int field_2_col;
    private static final BitField rowRelative = BitFieldFactory.getInstance(Variant.VT_RESERVED);
    private static final BitField colRelative = BitFieldFactory.getInstance(16384);
    private static final BitField column = BitFieldFactory.getInstance(16383);

    public RefPtgBase() {
    }

    public final String formatReferenceAsString() {
        return new CellReference(getRow(), getColumn(), !isRowRelative(), !isColRelative()).formatAsString();
    }

    public final int getColumn() {
        return column.getValue(this.field_2_col);
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public final byte getDefaultOperandClass() {
        return (byte) 0;
    }

    public final int getRow() {
        return this.field_1_row;
    }

    public final boolean isColRelative() {
        return colRelative.isSet(this.field_2_col);
    }

    public final boolean isRowRelative() {
        return rowRelative.isSet(this.field_2_col);
    }

    public final void readCoordinates(LittleEndianInput littleEndianInput) {
        this.field_1_row = littleEndianInput.readUShort();
        this.field_2_col = littleEndianInput.readUShort();
    }

    public final void setColRelative(boolean z10) {
        this.field_2_col = colRelative.setBoolean(this.field_2_col, z10);
    }

    public final void setColumn(int i10) {
        this.field_2_col = column.setValue(this.field_2_col, i10);
    }

    public final void setRow(int i10) {
        this.field_1_row = i10;
    }

    public final void setRowRelative(boolean z10) {
        this.field_2_col = rowRelative.setBoolean(this.field_2_col, z10);
    }

    public final void writeCoordinates(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this.field_1_row);
        littleEndianOutput.writeShort(this.field_2_col);
    }

    public RefPtgBase(CellReference cellReference) {
        setRow(cellReference.getRow());
        setColumn(cellReference.getCol());
        setColRelative(!cellReference.isColAbsolute());
        setRowRelative(!cellReference.isRowAbsolute());
    }
}
