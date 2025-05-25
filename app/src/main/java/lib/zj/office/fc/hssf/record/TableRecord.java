package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.hssf.formula.eval.FunctionEval;
import lib.zj.office.fc.hssf.util.CellRangeAddress8Bit;
import lib.zj.office.fc.hssf.util.CellReference;
import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.BitFieldFactory;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class TableRecord extends SharedValueRecordBase {
    public static final short sid = 566;
    private int field_10_colInputCol;
    private int field_5_flags;
    private int field_6_res;
    private int field_7_rowInputRow;
    private int field_8_colInputRow;
    private int field_9_rowInputCol;
    private static final BitField alwaysCalc = BitFieldFactory.getInstance(1);
    private static final BitField calcOnOpen = BitFieldFactory.getInstance(2);
    private static final BitField rowOrColInpCell = BitFieldFactory.getInstance(4);
    private static final BitField oneOrTwoVar = BitFieldFactory.getInstance(8);
    private static final BitField rowDeleted = BitFieldFactory.getInstance(16);
    private static final BitField colDeleted = BitFieldFactory.getInstance(32);

    public TableRecord(RecordInputStream recordInputStream) {
        super(recordInputStream);
        this.field_5_flags = recordInputStream.readByte();
        this.field_6_res = recordInputStream.readByte();
        this.field_7_rowInputRow = recordInputStream.readShort();
        this.field_8_colInputRow = recordInputStream.readShort();
        this.field_9_rowInputCol = recordInputStream.readShort();
        this.field_10_colInputCol = recordInputStream.readShort();
    }

    private static CellReference cr(int i10, int i11) {
        boolean z10;
        int i12 = i11 & FunctionEval.FunctionID.EXTERNAL_FUNC;
        boolean z11 = true;
        if ((32768 & i11) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((i11 & 16384) != 0) {
            z11 = false;
        }
        return new CellReference(i10, i12, z10, z11);
    }

    public int getColInputCol() {
        return this.field_10_colInputCol;
    }

    public int getColInputRow() {
        return this.field_8_colInputRow;
    }

    @Override // lib.zj.office.fc.hssf.record.SharedValueRecordBase
    public int getExtraDataSize() {
        return 10;
    }

    public int getFlags() {
        return this.field_5_flags;
    }

    public int getRowInputCol() {
        return this.field_9_rowInputCol;
    }

    public int getRowInputRow() {
        return this.field_7_rowInputRow;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    public boolean isAlwaysCalc() {
        return alwaysCalc.isSet(this.field_5_flags);
    }

    public boolean isColDeleted() {
        return colDeleted.isSet(this.field_5_flags);
    }

    public boolean isOneNotTwoVar() {
        return oneOrTwoVar.isSet(this.field_5_flags);
    }

    public boolean isRowDeleted() {
        return rowDeleted.isSet(this.field_5_flags);
    }

    public boolean isRowOrColInpCell() {
        return rowOrColInpCell.isSet(this.field_5_flags);
    }

    @Override // lib.zj.office.fc.hssf.record.SharedValueRecordBase
    public void serializeExtraData(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeByte(this.field_5_flags);
        littleEndianOutput.writeByte(this.field_6_res);
        littleEndianOutput.writeShort(this.field_7_rowInputRow);
        littleEndianOutput.writeShort(this.field_8_colInputRow);
        littleEndianOutput.writeShort(this.field_9_rowInputCol);
        littleEndianOutput.writeShort(this.field_10_colInputCol);
    }

    public void setAlwaysCalc(boolean z10) {
        this.field_5_flags = alwaysCalc.setBoolean(this.field_5_flags, z10);
    }

    public void setColDeleted(boolean z10) {
        this.field_5_flags = colDeleted.setBoolean(this.field_5_flags, z10);
    }

    public void setColInputCol(int i10) {
        this.field_10_colInputCol = i10;
    }

    public void setColInputRow(int i10) {
        this.field_8_colInputRow = i10;
    }

    public void setFlags(int i10) {
        this.field_5_flags = i10;
    }

    public void setOneNotTwoVar(boolean z10) {
        this.field_5_flags = oneOrTwoVar.setBoolean(this.field_5_flags, z10);
    }

    public void setRowDeleted(boolean z10) {
        this.field_5_flags = rowDeleted.setBoolean(this.field_5_flags, z10);
    }

    public void setRowInputCol(int i10) {
        this.field_9_rowInputCol = i10;
    }

    public void setRowInputRow(int i10) {
        this.field_7_rowInputRow = i10;
    }

    public void setRowOrColInpCell(boolean z10) {
        this.field_5_flags = rowOrColInpCell.setBoolean(this.field_5_flags, z10);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[TABLE]\n    .range    = ");
        stringBuffer.append(getRange().toString());
        stringBuffer.append("\n    .flags    = ");
        stringBuffer.append(HexDump.byteToHex(this.field_5_flags));
        stringBuffer.append("\n    .alwaysClc= ");
        stringBuffer.append(isAlwaysCalc());
        stringBuffer.append("\n    .reserved = ");
        stringBuffer.append(HexDump.intToHex(this.field_6_res));
        stringBuffer.append("\n    .rowInput = ");
        CellReference cr = cr(this.field_7_rowInputRow, this.field_8_colInputRow);
        CellReference cr2 = cr(this.field_9_rowInputCol, this.field_10_colInputCol);
        stringBuffer.append(cr.formatAsString());
        stringBuffer.append("\n    .colInput = ");
        stringBuffer.append(cr2.formatAsString());
        stringBuffer.append("\n[/TABLE]\n");
        return stringBuffer.toString();
    }

    public TableRecord(CellRangeAddress8Bit cellRangeAddress8Bit) {
        super(cellRangeAddress8Bit);
        this.field_6_res = 0;
    }
}
