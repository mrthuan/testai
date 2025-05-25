package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class BlankRecord extends StandardRecord implements CellValueRecordInterface {
    public static final short sid = 513;
    private int field_1_row;
    private short field_2_col;
    private short field_3_xf;

    public BlankRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        BlankRecord blankRecord = new BlankRecord();
        blankRecord.field_1_row = this.field_1_row;
        blankRecord.field_2_col = this.field_2_col;
        blankRecord.field_3_xf = this.field_3_xf;
        return blankRecord;
    }

    @Override // lib.zj.office.fc.hssf.record.CellValueRecordInterface
    public short getColumn() {
        return this.field_2_col;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 6;
    }

    @Override // lib.zj.office.fc.hssf.record.CellValueRecordInterface
    public int getRow() {
        return this.field_1_row;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 513;
    }

    @Override // lib.zj.office.fc.hssf.record.CellValueRecordInterface
    public short getXFIndex() {
        return this.field_3_xf;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(getRow());
        littleEndianOutput.writeShort(getColumn());
        littleEndianOutput.writeShort(getXFIndex());
    }

    @Override // lib.zj.office.fc.hssf.record.CellValueRecordInterface
    public void setColumn(short s4) {
        this.field_2_col = s4;
    }

    @Override // lib.zj.office.fc.hssf.record.CellValueRecordInterface
    public void setRow(int i10) {
        this.field_1_row = i10;
    }

    @Override // lib.zj.office.fc.hssf.record.CellValueRecordInterface
    public void setXFIndex(short s4) {
        this.field_3_xf = s4;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[BLANK]\n    row= ");
        stringBuffer.append(HexDump.shortToHex(getRow()));
        stringBuffer.append("\n    col= ");
        stringBuffer.append(HexDump.shortToHex(getColumn()));
        stringBuffer.append("\n    xf = ");
        stringBuffer.append(HexDump.shortToHex(getXFIndex()));
        stringBuffer.append("\n[/BLANK]\n");
        return stringBuffer.toString();
    }

    public BlankRecord(RecordInputStream recordInputStream) {
        this.field_1_row = recordInputStream.readUShort();
        this.field_2_col = recordInputStream.readShort();
        this.field_3_xf = recordInputStream.readShort();
    }
}
