package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class DefaultRowHeightRecord extends StandardRecord {
    public static final short DEFAULT_ROW_HEIGHT = 255;
    public static final short sid = 549;
    private short field_1_option_flags;
    private short field_2_row_height;

    public DefaultRowHeightRecord() {
        this.field_1_option_flags = (short) 0;
        this.field_2_row_height = (short) 255;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        DefaultRowHeightRecord defaultRowHeightRecord = new DefaultRowHeightRecord();
        defaultRowHeightRecord.field_1_option_flags = this.field_1_option_flags;
        defaultRowHeightRecord.field_2_row_height = this.field_2_row_height;
        return defaultRowHeightRecord;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 4;
    }

    public short getOptionFlags() {
        return this.field_1_option_flags;
    }

    public short getRowHeight() {
        return this.field_2_row_height;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(getOptionFlags());
        littleEndianOutput.writeShort(getRowHeight());
    }

    public void setOptionFlags(short s4) {
        this.field_1_option_flags = s4;
    }

    public void setRowHeight(short s4) {
        this.field_2_row_height = s4;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[DEFAULTROWHEIGHT]\n    .optionflags    = ");
        stringBuffer.append(Integer.toHexString(getOptionFlags()));
        stringBuffer.append("\n    .rowheight      = ");
        stringBuffer.append(Integer.toHexString(getRowHeight()));
        stringBuffer.append("\n[/DEFAULTROWHEIGHT]\n");
        return stringBuffer.toString();
    }

    public DefaultRowHeightRecord(RecordInputStream recordInputStream) {
        this.field_1_option_flags = recordInputStream.readShort();
        this.field_2_row_height = recordInputStream.readShort();
    }
}
