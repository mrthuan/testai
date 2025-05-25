package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class WriteProtectRecord extends StandardRecord {
    public static final short sid = 134;

    public WriteProtectRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 0;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 134;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        return "[WRITEPROTECT]\n[/WRITEPROTECT]\n";
    }

    public WriteProtectRecord(RecordInputStream recordInputStream) {
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
    }
}
