package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class ScenarioProtectRecord extends StandardRecord {
    public static final short sid = 221;
    private short field_1_protect;

    public ScenarioProtectRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        ScenarioProtectRecord scenarioProtectRecord = new ScenarioProtectRecord();
        scenarioProtectRecord.field_1_protect = this.field_1_protect;
        return scenarioProtectRecord;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 2;
    }

    public boolean getProtect() {
        if (this.field_1_protect == 1) {
            return true;
        }
        return false;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this.field_1_protect);
    }

    public void setProtect(boolean z10) {
        if (z10) {
            this.field_1_protect = (short) 1;
        } else {
            this.field_1_protect = (short) 0;
        }
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[SCENARIOPROTECT]\n    .protect         = ");
        stringBuffer.append(getProtect());
        stringBuffer.append("\n[/SCENARIOPROTECT]\n");
        return stringBuffer.toString();
    }

    public ScenarioProtectRecord(RecordInputStream recordInputStream) {
        this.field_1_protect = recordInputStream.readShort();
    }
}
