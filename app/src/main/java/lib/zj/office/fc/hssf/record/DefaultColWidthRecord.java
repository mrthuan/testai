package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class DefaultColWidthRecord extends StandardRecord {
    public static final int DEFAULT_COLUMN_WIDTH = 8;
    public static final short sid = 85;
    private int field_1_col_width;

    public DefaultColWidthRecord() {
        this.field_1_col_width = 8;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        DefaultColWidthRecord defaultColWidthRecord = new DefaultColWidthRecord();
        defaultColWidthRecord.field_1_col_width = this.field_1_col_width;
        return defaultColWidthRecord;
    }

    public int getColWidth() {
        return this.field_1_col_width;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 2;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 85;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(getColWidth());
    }

    public void setColWidth(int i10) {
        this.field_1_col_width = i10;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[DEFAULTCOLWIDTH]\n    .colwidth      = ");
        stringBuffer.append(Integer.toHexString(getColWidth()));
        stringBuffer.append("\n[/DEFAULTCOLWIDTH]\n");
        return stringBuffer.toString();
    }

    public DefaultColWidthRecord(RecordInputStream recordInputStream) {
        this.field_1_col_width = recordInputStream.readUShort();
    }
}
