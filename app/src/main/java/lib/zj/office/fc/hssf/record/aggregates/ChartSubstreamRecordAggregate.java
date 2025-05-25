package lib.zj.office.fc.hssf.record.aggregates;

import java.util.ArrayList;
import java.util.List;
import lib.zj.office.fc.hssf.model.RecordStream;
import lib.zj.office.fc.hssf.record.BOFRecord;
import lib.zj.office.fc.hssf.record.EOFRecord;
import lib.zj.office.fc.hssf.record.HeaderFooterRecord;
import lib.zj.office.fc.hssf.record.Record;
import lib.zj.office.fc.hssf.record.RecordBase;
import lib.zj.office.fc.hssf.record.aggregates.RecordAggregate;

/* loaded from: classes3.dex */
public final class ChartSubstreamRecordAggregate extends RecordAggregate {
    private final BOFRecord _bofRec;
    private PageSettingsBlock _psBlock;
    private final List<RecordBase> _recs;

    public ChartSubstreamRecordAggregate(RecordStream recordStream) {
        this._bofRec = (BOFRecord) recordStream.getNext();
        ArrayList arrayList = new ArrayList();
        while (recordStream.peekNextClass() != EOFRecord.class) {
            if (PageSettingsBlock.isComponentRecord(recordStream.peekNextSid())) {
                if (this._psBlock != null) {
                    if (recordStream.peekNextSid() == 2204) {
                        this._psBlock.addLateHeaderFooter((HeaderFooterRecord) recordStream.getNext());
                    } else {
                        throw new IllegalStateException("Found more than one PageSettingsBlock in chart sub-stream");
                    }
                } else {
                    PageSettingsBlock pageSettingsBlock = new PageSettingsBlock(recordStream);
                    this._psBlock = pageSettingsBlock;
                    arrayList.add(pageSettingsBlock);
                }
            } else {
                arrayList.add(recordStream.getNext());
            }
        }
        this._recs = arrayList;
        if (recordStream.getNext() instanceof EOFRecord) {
            return;
        }
        throw new IllegalStateException("Bad chart EOF");
    }

    @Override // lib.zj.office.fc.hssf.record.aggregates.RecordAggregate
    public void visitContainedRecords(RecordAggregate.RecordVisitor recordVisitor) {
        if (this._recs.isEmpty()) {
            return;
        }
        recordVisitor.visitRecord(this._bofRec);
        for (int i10 = 0; i10 < this._recs.size(); i10++) {
            RecordBase recordBase = this._recs.get(i10);
            if (recordBase instanceof RecordAggregate) {
                ((RecordAggregate) recordBase).visitContainedRecords(recordVisitor);
            } else {
                recordVisitor.visitRecord((Record) recordBase);
            }
        }
        recordVisitor.visitRecord(EOFRecord.instance);
    }
}
