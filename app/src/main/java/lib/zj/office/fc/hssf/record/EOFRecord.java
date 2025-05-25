package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class EOFRecord extends StandardRecord {
    public static final int ENCODED_SIZE = 4;
    public static final EOFRecord instance = new EOFRecord();
    public static final short sid = 10;

    private EOFRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        return instance;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 0;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 10;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        return "[EOF]\n[/EOF]\n";
    }

    public EOFRecord(RecordInputStream recordInputStream) {
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
    }
}
