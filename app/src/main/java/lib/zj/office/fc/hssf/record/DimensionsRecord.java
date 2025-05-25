package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class DimensionsRecord extends StandardRecord {
    public static final short sid = 512;
    private int field_1_first_row;
    private int field_2_last_row;
    private short field_3_first_col;
    private short field_4_last_col;
    private short field_5_zero;

    public DimensionsRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        DimensionsRecord dimensionsRecord = new DimensionsRecord();
        dimensionsRecord.field_1_first_row = this.field_1_first_row;
        dimensionsRecord.field_2_last_row = this.field_2_last_row;
        dimensionsRecord.field_3_first_col = this.field_3_first_col;
        dimensionsRecord.field_4_last_col = this.field_4_last_col;
        dimensionsRecord.field_5_zero = this.field_5_zero;
        return dimensionsRecord;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 14;
    }

    public short getFirstCol() {
        return this.field_3_first_col;
    }

    public int getFirstRow() {
        return this.field_1_first_row;
    }

    public short getLastCol() {
        return this.field_4_last_col;
    }

    public int getLastRow() {
        return this.field_2_last_row;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 512;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeInt(getFirstRow());
        littleEndianOutput.writeInt(getLastRow());
        littleEndianOutput.writeShort(getFirstCol());
        littleEndianOutput.writeShort(getLastCol());
        littleEndianOutput.writeShort(0);
    }

    public void setFirstCol(short s4) {
        this.field_3_first_col = s4;
    }

    public void setFirstRow(int i10) {
        this.field_1_first_row = i10;
    }

    public void setLastCol(short s4) {
        this.field_4_last_col = s4;
    }

    public void setLastRow(int i10) {
        this.field_2_last_row = i10;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[DIMENSIONS]\n    .firstrow       = ");
        stringBuffer.append(Integer.toHexString(getFirstRow()));
        stringBuffer.append("\n    .lastrow        = ");
        stringBuffer.append(Integer.toHexString(getLastRow()));
        stringBuffer.append("\n    .firstcol       = ");
        stringBuffer.append(Integer.toHexString(getFirstCol()));
        stringBuffer.append("\n    .lastcol        = ");
        stringBuffer.append(Integer.toHexString(getLastCol()));
        stringBuffer.append("\n    .zero           = ");
        stringBuffer.append(Integer.toHexString(this.field_5_zero));
        stringBuffer.append("\n[/DIMENSIONS]\n");
        return stringBuffer.toString();
    }

    public DimensionsRecord(RecordInputStream recordInputStream) {
        this.field_1_first_row = recordInputStream.readInt();
        this.field_2_last_row = recordInputStream.readInt();
        this.field_3_first_col = recordInputStream.readShort();
        this.field_4_last_col = recordInputStream.readShort();
        this.field_5_zero = recordInputStream.readShort();
    }
}
