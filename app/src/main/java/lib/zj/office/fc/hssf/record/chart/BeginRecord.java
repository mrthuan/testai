package lib.zj.office.fc.hssf.record.chart;

import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.hssf.record.StandardRecord;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class BeginRecord extends StandardRecord {
    public static final short sid = 4147;

    public BeginRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        return new BeginRecord();
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
        return "[BEGIN]\n[/BEGIN]\n";
    }

    public BeginRecord(RecordInputStream recordInputStream) {
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
    }
}
