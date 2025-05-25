package lib.zj.office.fc.hssf.record.chart;

import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.hssf.record.StandardRecord;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class PlotAreaRecord extends StandardRecord {
    public static final short sid = 4149;

    public PlotAreaRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        return new PlotAreaRecord();
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
        return "[PLOTAREA]\n[/PLOTAREA]\n";
    }

    public PlotAreaRecord(RecordInputStream recordInputStream) {
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
    }
}
