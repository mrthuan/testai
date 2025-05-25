package lib.zj.office.fc.hssf.record.chart;

import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.hssf.record.StandardRecord;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class EndRecord extends StandardRecord {
    public static final short sid = 4148;

    public EndRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        return new EndRecord();
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
        return "[END]\n[/END]\n";
    }

    public EndRecord(RecordInputStream recordInputStream) {
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
    }
}
