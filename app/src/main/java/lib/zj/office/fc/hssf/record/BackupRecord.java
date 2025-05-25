package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class BackupRecord extends StandardRecord {
    public static final short sid = 64;
    private short field_1_backup;

    public BackupRecord() {
    }

    public short getBackup() {
        return this.field_1_backup;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 2;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 64;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(getBackup());
    }

    public void setBackup(short s4) {
        this.field_1_backup = s4;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[BACKUP]\n    .backup          = ");
        stringBuffer.append(Integer.toHexString(getBackup()));
        stringBuffer.append("\n[/BACKUP]\n");
        return stringBuffer.toString();
    }

    public BackupRecord(RecordInputStream recordInputStream) {
        this.field_1_backup = recordInputStream.readShort();
    }
}
