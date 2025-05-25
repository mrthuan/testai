package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class GutsRecord extends StandardRecord {
    public static final short sid = 128;
    private short field_1_left_row_gutter;
    private short field_2_top_col_gutter;
    private short field_3_row_level_max;
    private short field_4_col_level_max;

    public GutsRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        GutsRecord gutsRecord = new GutsRecord();
        gutsRecord.field_1_left_row_gutter = this.field_1_left_row_gutter;
        gutsRecord.field_2_top_col_gutter = this.field_2_top_col_gutter;
        gutsRecord.field_3_row_level_max = this.field_3_row_level_max;
        gutsRecord.field_4_col_level_max = this.field_4_col_level_max;
        return gutsRecord;
    }

    public short getColLevelMax() {
        return this.field_4_col_level_max;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 8;
    }

    public short getLeftRowGutter() {
        return this.field_1_left_row_gutter;
    }

    public short getRowLevelMax() {
        return this.field_3_row_level_max;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 128;
    }

    public short getTopColGutter() {
        return this.field_2_top_col_gutter;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(getLeftRowGutter());
        littleEndianOutput.writeShort(getTopColGutter());
        littleEndianOutput.writeShort(getRowLevelMax());
        littleEndianOutput.writeShort(getColLevelMax());
    }

    public void setColLevelMax(short s4) {
        this.field_4_col_level_max = s4;
    }

    public void setLeftRowGutter(short s4) {
        this.field_1_left_row_gutter = s4;
    }

    public void setRowLevelMax(short s4) {
        this.field_3_row_level_max = s4;
    }

    public void setTopColGutter(short s4) {
        this.field_2_top_col_gutter = s4;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[GUTS]\n    .leftgutter     = ");
        stringBuffer.append(Integer.toHexString(getLeftRowGutter()));
        stringBuffer.append("\n    .topgutter      = ");
        stringBuffer.append(Integer.toHexString(getTopColGutter()));
        stringBuffer.append("\n    .rowlevelmax    = ");
        stringBuffer.append(Integer.toHexString(getRowLevelMax()));
        stringBuffer.append("\n    .collevelmax    = ");
        stringBuffer.append(Integer.toHexString(getColLevelMax()));
        stringBuffer.append("\n[/GUTS]\n");
        return stringBuffer.toString();
    }

    public GutsRecord(RecordInputStream recordInputStream) {
        this.field_1_left_row_gutter = recordInputStream.readShort();
        this.field_2_top_col_gutter = recordInputStream.readShort();
        this.field_3_row_level_max = recordInputStream.readShort();
        this.field_4_col_level_max = recordInputStream.readShort();
    }
}
