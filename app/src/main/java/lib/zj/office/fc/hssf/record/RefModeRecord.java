package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class RefModeRecord extends StandardRecord {
    public static final short USE_A1_MODE = 1;
    public static final short USE_R1C1_MODE = 0;
    public static final short sid = 15;
    private short field_1_mode;

    public RefModeRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        RefModeRecord refModeRecord = new RefModeRecord();
        refModeRecord.field_1_mode = this.field_1_mode;
        return refModeRecord;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 2;
    }

    public short getMode() {
        return this.field_1_mode;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 15;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(getMode());
    }

    public void setMode(short s4) {
        this.field_1_mode = s4;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[REFMODE]\n    .mode           = ");
        stringBuffer.append(Integer.toHexString(getMode()));
        stringBuffer.append("\n[/REFMODE]\n");
        return stringBuffer.toString();
    }

    public RefModeRecord(RecordInputStream recordInputStream) {
        this.field_1_mode = recordInputStream.readShort();
    }
}
