package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class DVALRecord extends StandardRecord {
    public static final short sid = 434;
    private short field_1_options;
    private int field_2_horiz_pos;
    private int field_3_vert_pos;
    private int field_5_dv_no;
    private int field_cbo_id;

    public DVALRecord() {
        this.field_cbo_id = -1;
        this.field_5_dv_no = 0;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        DVALRecord dVALRecord = new DVALRecord();
        dVALRecord.field_1_options = this.field_1_options;
        dVALRecord.field_2_horiz_pos = this.field_2_horiz_pos;
        dVALRecord.field_3_vert_pos = this.field_3_vert_pos;
        dVALRecord.field_cbo_id = this.field_cbo_id;
        dVALRecord.field_5_dv_no = this.field_5_dv_no;
        return dVALRecord;
    }

    public int getDVRecNo() {
        return this.field_5_dv_no;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 18;
    }

    public int getHorizontalPos() {
        return this.field_2_horiz_pos;
    }

    public int getObjectID() {
        return this.field_cbo_id;
    }

    public short getOptions() {
        return this.field_1_options;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    public int getVerticalPos() {
        return this.field_3_vert_pos;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(getOptions());
        littleEndianOutput.writeInt(getHorizontalPos());
        littleEndianOutput.writeInt(getVerticalPos());
        littleEndianOutput.writeInt(getObjectID());
        littleEndianOutput.writeInt(getDVRecNo());
    }

    public void setDVRecNo(int i10) {
        this.field_5_dv_no = i10;
    }

    public void setHorizontalPos(int i10) {
        this.field_2_horiz_pos = i10;
    }

    public void setObjectID(int i10) {
        this.field_cbo_id = i10;
    }

    public void setOptions(short s4) {
        this.field_1_options = s4;
    }

    public void setVerticalPos(int i10) {
        this.field_3_vert_pos = i10;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[DVAL]\n    .options      = ");
        stringBuffer.append((int) getOptions());
        stringBuffer.append("\n    .horizPos     = ");
        stringBuffer.append(getHorizontalPos());
        stringBuffer.append("\n    .vertPos      = ");
        stringBuffer.append(getVerticalPos());
        stringBuffer.append("\n    .comboObjectID   = ");
        stringBuffer.append(Integer.toHexString(getObjectID()));
        stringBuffer.append("\n    .DVRecordsNumber = ");
        stringBuffer.append(Integer.toHexString(getDVRecNo()));
        stringBuffer.append("\n[/DVAL]\n");
        return stringBuffer.toString();
    }

    public DVALRecord(RecordInputStream recordInputStream) {
        this.field_1_options = recordInputStream.readShort();
        this.field_2_horiz_pos = recordInputStream.readInt();
        this.field_3_vert_pos = recordInputStream.readInt();
        this.field_cbo_id = recordInputStream.readInt();
        this.field_5_dv_no = recordInputStream.readInt();
    }
}
