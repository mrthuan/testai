package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class VCenterRecord extends StandardRecord {
    public static final short sid = 132;
    private int field_1_vcenter;

    public VCenterRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        VCenterRecord vCenterRecord = new VCenterRecord();
        vCenterRecord.field_1_vcenter = this.field_1_vcenter;
        return vCenterRecord;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 2;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 132;
    }

    public boolean getVCenter() {
        if (this.field_1_vcenter == 1) {
            return true;
        }
        return false;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this.field_1_vcenter);
    }

    public void setVCenter(boolean z10) {
        this.field_1_vcenter = z10 ? 1 : 0;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[VCENTER]\n    .vcenter        = ");
        stringBuffer.append(getVCenter());
        stringBuffer.append("\n[/VCENTER]\n");
        return stringBuffer.toString();
    }

    public VCenterRecord(RecordInputStream recordInputStream) {
        this.field_1_vcenter = recordInputStream.readShort();
    }
}
