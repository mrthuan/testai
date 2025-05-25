package lib.zj.office.fc.hssf.eventusermodel;

import lib.zj.office.fc.hssf.record.Record;

/* loaded from: classes3.dex */
public abstract class AbortableHSSFListener implements HSSFListener {
    public abstract short abortableProcessRecord(Record record);

    @Override // lib.zj.office.fc.hssf.eventusermodel.HSSFListener
    public void processRecord(Record record) {
    }
}
