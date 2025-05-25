package lib.zj.office.fc.hssf.eventusermodel.dummyrecord;

import lib.zj.office.fc.hssf.record.Record;
import lib.zj.office.fc.hssf.record.RecordFormatException;

/* loaded from: classes3.dex */
abstract class DummyRecordBase extends Record {
    @Override // lib.zj.office.fc.hssf.record.RecordBase
    public final int getRecordSize() {
        throw new RecordFormatException("Cannot serialize a dummy record");
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public final short getSid() {
        return (short) -1;
    }

    @Override // lib.zj.office.fc.hssf.record.RecordBase
    public int serialize(int i10, byte[] bArr) {
        throw new RecordFormatException("Cannot serialize a dummy record");
    }
}
