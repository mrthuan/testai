package lib.zj.office.fc.hssf.record;

import java.util.Iterator;
import lib.zj.office.fc.hssf.record.PageBreakRecord;

/* loaded from: classes3.dex */
public final class HorizontalPageBreakRecord extends PageBreakRecord {
    public static final short sid = 27;

    public HorizontalPageBreakRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        HorizontalPageBreakRecord horizontalPageBreakRecord = new HorizontalPageBreakRecord();
        Iterator<PageBreakRecord.Break> breaksIterator = getBreaksIterator();
        while (breaksIterator.hasNext()) {
            PageBreakRecord.Break next = breaksIterator.next();
            horizontalPageBreakRecord.addBreak(next.main, next.subFrom, next.subTo);
        }
        return horizontalPageBreakRecord;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 27;
    }

    public HorizontalPageBreakRecord(RecordInputStream recordInputStream) {
        super(recordInputStream);
    }
}
