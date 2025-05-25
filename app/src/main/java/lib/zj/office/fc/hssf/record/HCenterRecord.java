package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class HCenterRecord extends StandardRecord {
    public static final short sid = 131;
    private short field_1_hcenter;

    public HCenterRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        HCenterRecord hCenterRecord = new HCenterRecord();
        hCenterRecord.field_1_hcenter = this.field_1_hcenter;
        return hCenterRecord;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 2;
    }

    public boolean getHCenter() {
        if (this.field_1_hcenter == 1) {
            return true;
        }
        return false;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 131;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this.field_1_hcenter);
    }

    public void setHCenter(boolean z10) {
        if (z10) {
            this.field_1_hcenter = (short) 1;
        } else {
            this.field_1_hcenter = (short) 0;
        }
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[HCENTER]\n    .hcenter        = ");
        stringBuffer.append(getHCenter());
        stringBuffer.append("\n[/HCENTER]\n");
        return stringBuffer.toString();
    }

    public HCenterRecord(RecordInputStream recordInputStream) {
        this.field_1_hcenter = recordInputStream.readShort();
    }
}
