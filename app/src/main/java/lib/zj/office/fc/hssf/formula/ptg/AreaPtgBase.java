package lib.zj.office.fc.hssf.formula.ptg;

import lib.zj.office.fc.hpsf.Variant;
import lib.zj.office.fc.ss.util.AreaReference;
import lib.zj.office.fc.ss.util.CellReference;
import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.BitFieldFactory;
import lib.zj.office.fc.util.LittleEndianInput;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public abstract class AreaPtgBase extends OperandPtg implements AreaI {
    private int field_1_first_row;
    private int field_2_last_row;
    private int field_3_first_column;
    private int field_4_last_column;
    private static final BitField rowRelative = BitFieldFactory.getInstance(Variant.VT_RESERVED);
    private static final BitField colRelative = BitFieldFactory.getInstance(16384);
    private static final BitField columnMask = BitFieldFactory.getInstance(16383);

    public AreaPtgBase() {
    }

    public final String formatReferenceAsString() {
        CellReference cellReference = new CellReference(getFirstRow(), getFirstColumn(), !isFirstRowRelative(), !isFirstColRelative());
        CellReference cellReference2 = new CellReference(getLastRow(), getLastColumn(), !isLastRowRelative(), !isLastColRelative());
        if (AreaReference.isWholeColumnReference(cellReference, cellReference2)) {
            return new AreaReference(cellReference, cellReference2).formatAsString();
        }
        return cellReference.formatAsString() + ":" + cellReference2.formatAsString();
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public byte getDefaultOperandClass() {
        return (byte) 0;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.AreaI
    public final int getFirstColumn() {
        return columnMask.getValue(this.field_3_first_column);
    }

    public final short getFirstColumnRaw() {
        return (short) this.field_3_first_column;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.AreaI
    public final int getFirstRow() {
        return this.field_1_first_row;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.AreaI
    public final int getLastColumn() {
        return columnMask.getValue(this.field_4_last_column);
    }

    public final short getLastColumnRaw() {
        return (short) this.field_4_last_column;
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.AreaI
    public final int getLastRow() {
        return this.field_2_last_row;
    }

    public final boolean isFirstColRelative() {
        return colRelative.isSet(this.field_3_first_column);
    }

    public final boolean isFirstRowRelative() {
        return rowRelative.isSet(this.field_3_first_column);
    }

    public final boolean isLastColRelative() {
        return colRelative.isSet(this.field_4_last_column);
    }

    public final boolean isLastRowRelative() {
        return rowRelative.isSet(this.field_4_last_column);
    }

    public final RuntimeException notImplemented() {
        return new RuntimeException("Coding Error: This method should never be called. This ptg should be converted");
    }

    public final void readCoordinates(LittleEndianInput littleEndianInput) {
        this.field_1_first_row = littleEndianInput.readUShort();
        this.field_2_last_row = littleEndianInput.readUShort();
        this.field_3_first_column = littleEndianInput.readUShort();
        this.field_4_last_column = littleEndianInput.readUShort();
    }

    public final void setFirstColRelative(boolean z10) {
        this.field_3_first_column = colRelative.setBoolean(this.field_3_first_column, z10);
    }

    public final void setFirstColumn(int i10) {
        this.field_3_first_column = columnMask.setValue(this.field_3_first_column, i10);
    }

    public final void setFirstColumnRaw(int i10) {
        this.field_3_first_column = i10;
    }

    public final void setFirstRow(int i10) {
        this.field_1_first_row = i10;
    }

    public final void setFirstRowRelative(boolean z10) {
        this.field_3_first_column = rowRelative.setBoolean(this.field_3_first_column, z10);
    }

    public final void setLastColRelative(boolean z10) {
        this.field_4_last_column = colRelative.setBoolean(this.field_4_last_column, z10);
    }

    public final void setLastColumn(int i10) {
        this.field_4_last_column = columnMask.setValue(this.field_4_last_column, i10);
    }

    public final void setLastColumnRaw(short s4) {
        this.field_4_last_column = s4;
    }

    public final void setLastRow(int i10) {
        this.field_2_last_row = i10;
    }

    public final void setLastRowRelative(boolean z10) {
        this.field_4_last_column = rowRelative.setBoolean(this.field_4_last_column, z10);
    }

    @Override // lib.zj.office.fc.hssf.formula.ptg.Ptg
    public String toFormulaString() {
        return formatReferenceAsString();
    }

    public final void writeCoordinates(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this.field_1_first_row);
        littleEndianOutput.writeShort(this.field_2_last_row);
        littleEndianOutput.writeShort(this.field_3_first_column);
        littleEndianOutput.writeShort(this.field_4_last_column);
    }

    public AreaPtgBase(AreaReference areaReference) {
        CellReference firstCell = areaReference.getFirstCell();
        CellReference lastCell = areaReference.getLastCell();
        setFirstRow(firstCell.getRow());
        setFirstColumn(firstCell.getCol() == -1 ? (short) 0 : firstCell.getCol());
        setLastRow(lastCell.getRow());
        setLastColumn(lastCell.getCol() == -1 ? (short) 255 : lastCell.getCol());
        setFirstColRelative(!firstCell.isColAbsolute());
        setLastColRelative(!lastCell.isColAbsolute());
        setFirstRowRelative(!firstCell.isRowAbsolute());
        setLastRowRelative(!lastCell.isRowAbsolute());
    }

    public AreaPtgBase(int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, boolean z13) {
        if (i11 > i10) {
            setFirstRow(i10);
            setLastRow(i11);
            setFirstRowRelative(z10);
            setLastRowRelative(z11);
        } else {
            setFirstRow(i11);
            setLastRow(i10);
            setFirstRowRelative(z11);
            setLastRowRelative(z10);
        }
        if (i13 > i12) {
            setFirstColumn(i12);
            setLastColumn(i13);
            setFirstColRelative(z12);
            setLastColRelative(z13);
            return;
        }
        setFirstColumn(i13);
        setLastColumn(i12);
        setFirstColRelative(z13);
        setLastColRelative(z12);
    }
}
