package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class FnGroupCountRecord extends StandardRecord {
    public static final short COUNT = 14;
    public static final short sid = 156;
    private short field_1_count;

    public FnGroupCountRecord() {
    }

    public short getCount() {
        return this.field_1_count;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 2;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(getCount());
    }

    public void setCount(short s4) {
        this.field_1_count = s4;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[FNGROUPCOUNT]\n    .count            = ");
        stringBuffer.append((int) getCount());
        stringBuffer.append("\n[/FNGROUPCOUNT]\n");
        return stringBuffer.toString();
    }

    public FnGroupCountRecord(RecordInputStream recordInputStream) {
        this.field_1_count = recordInputStream.readShort();
    }
}
