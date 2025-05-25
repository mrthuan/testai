package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class GridsetRecord extends StandardRecord {
    public static final short sid = 130;
    public short field_1_gridset_flag;

    public GridsetRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        GridsetRecord gridsetRecord = new GridsetRecord();
        gridsetRecord.field_1_gridset_flag = this.field_1_gridset_flag;
        return gridsetRecord;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 2;
    }

    public boolean getGridset() {
        if (this.field_1_gridset_flag == 1) {
            return true;
        }
        return false;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 130;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this.field_1_gridset_flag);
    }

    public void setGridset(boolean z10) {
        if (z10) {
            this.field_1_gridset_flag = (short) 1;
        } else {
            this.field_1_gridset_flag = (short) 0;
        }
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[GRIDSET]\n    .gridset        = ");
        stringBuffer.append(getGridset());
        stringBuffer.append("\n[/GRIDSET]\n");
        return stringBuffer.toString();
    }

    public GridsetRecord(RecordInputStream recordInputStream) {
        this.field_1_gridset_flag = recordInputStream.readShort();
    }
}
