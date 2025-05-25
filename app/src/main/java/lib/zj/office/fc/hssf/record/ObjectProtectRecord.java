package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class ObjectProtectRecord extends StandardRecord {
    public static final short sid = 99;
    private short field_1_protect;

    public ObjectProtectRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        ObjectProtectRecord objectProtectRecord = new ObjectProtectRecord();
        objectProtectRecord.field_1_protect = this.field_1_protect;
        return objectProtectRecord;
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
        return (short) 99;
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

    public ObjectProtectRecord(RecordInputStream recordInputStream) {
        this.field_1_protect = recordInputStream.readShort();
    }
}
