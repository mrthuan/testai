package lib.zj.office.fc.hssf.record;

import java.util.Iterator;
import lib.zj.office.fc.hssf.record.PageBreakRecord;

/* loaded from: classes3.dex */
public final class VerticalPageBreakRecord extends PageBreakRecord {
    public static final short sid = 26;

    public VerticalPageBreakRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        VerticalPageBreakRecord verticalPageBreakRecord = new VerticalPageBreakRecord();
        Iterator<PageBreakRecord.Break> breaksIterator = getBreaksIterator();
        while (breaksIterator.hasNext()) {
            PageBreakRecord.Break next = breaksIterator.next();
            verticalPageBreakRecord.addBreak(next.main, next.subFrom, next.subTo);
        }
        return verticalPageBreakRecord;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 26;
    }

    public VerticalPageBreakRecord(RecordInputStream recordInputStream) {
        super(recordInputStream);
    }
}
