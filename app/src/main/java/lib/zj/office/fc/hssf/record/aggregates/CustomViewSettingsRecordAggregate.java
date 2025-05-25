package lib.zj.office.fc.hssf.record.aggregates;

import java.util.ArrayList;
import java.util.List;
import lib.zj.office.fc.hssf.model.RecordStream;
import lib.zj.office.fc.hssf.record.Record;
import lib.zj.office.fc.hssf.record.RecordBase;
import lib.zj.office.fc.hssf.record.aggregates.RecordAggregate;

/* loaded from: classes3.dex */
public final class CustomViewSettingsRecordAggregate extends RecordAggregate {
    private final Record _begin;
    private final Record _end;
    private PageSettingsBlock _psBlock;
    private final List<RecordBase> _recs;

    public CustomViewSettingsRecordAggregate(RecordStream recordStream) {
        Record next = recordStream.getNext();
        this._begin = next;
        if (next.getSid() == 426) {
            ArrayList arrayList = new ArrayList();
            while (recordStream.peekNextSid() != 427) {
                if (PageSettingsBlock.isComponentRecord(recordStream.peekNextSid())) {
                    if (this._psBlock == null) {
                        PageSettingsBlock pageSettingsBlock = new PageSettingsBlock(recordStream);
                        this._psBlock = pageSettingsBlock;
                        arrayList.add(pageSettingsBlock);
                    } else {
                        throw new IllegalStateException("Found more than one PageSettingsBlock in custom view settings sub-stream");
                    }
                } else {
                    arrayList.add(recordStream.getNext());
                }
            }
            this._recs = arrayList;
            Record next2 = recordStream.getNext();
            this._end = next2;
            if (next2.getSid() == 427) {
                return;
            }
            throw new IllegalStateException("Bad custom view settings end record");
        }
        throw new IllegalStateException("Bad begin record");
    }

    public static boolean isBeginRecord(int i10) {
        if (i10 == 426) {
            return true;
        }
        return false;
    }

    public void append(RecordBase recordBase) {
        this._recs.add(recordBase);
    }

    @Override // lib.zj.office.fc.hssf.record.aggregates.RecordAggregate
    public void visitContainedRecords(RecordAggregate.RecordVisitor recordVisitor) {
        if (this._recs.isEmpty()) {
            return;
        }
        recordVisitor.visitRecord(this._begin);
        for (int i10 = 0; i10 < this._recs.size(); i10++) {
            RecordBase recordBase = this._recs.get(i10);
            if (recordBase instanceof RecordAggregate) {
                ((RecordAggregate) recordBase).visitContainedRecords(recordVisitor);
            } else {
                recordVisitor.visitRecord((Record) recordBase);
            }
        }
        recordVisitor.visitRecord(this._end);
    }
}
