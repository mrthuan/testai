package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class InterfaceEndRecord extends StandardRecord {
    public static final InterfaceEndRecord instance = new InterfaceEndRecord();
    public static final short sid = 226;

    private InterfaceEndRecord() {
    }

    public static Record create(RecordInputStream recordInputStream) {
        int remaining = recordInputStream.remaining();
        if (remaining != 0) {
            if (remaining == 2) {
                return new InterfaceHdrRecord(recordInputStream);
            }
            throw new RecordFormatException("Invalid record data size: " + recordInputStream.remaining());
        }
        return instance;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 0;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        return "[INTERFACEEND/]\n";
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
    }
}
