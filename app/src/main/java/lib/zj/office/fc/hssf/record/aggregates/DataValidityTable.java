package lib.zj.office.fc.hssf.record.aggregates;

import java.util.ArrayList;
import java.util.List;
import lib.zj.office.fc.hssf.model.RecordStream;
import lib.zj.office.fc.hssf.record.DVALRecord;
import lib.zj.office.fc.hssf.record.DVRecord;
import lib.zj.office.fc.hssf.record.Record;
import lib.zj.office.fc.hssf.record.aggregates.RecordAggregate;

/* loaded from: classes3.dex */
public final class DataValidityTable extends RecordAggregate {
    private final DVALRecord _headerRec;
    private final List _validationList;

    public DataValidityTable(RecordStream recordStream) {
        this._headerRec = (DVALRecord) recordStream.getNext();
        ArrayList arrayList = new ArrayList();
        while (recordStream.peekNextClass() == DVRecord.class) {
            arrayList.add(recordStream.getNext());
        }
        this._validationList = arrayList;
    }

    public void addDataValidation(DVRecord dVRecord) {
        this._validationList.add(dVRecord);
        this._headerRec.setDVRecNo(this._validationList.size());
    }

    @Override // lib.zj.office.fc.hssf.record.aggregates.RecordAggregate
    public void visitContainedRecords(RecordAggregate.RecordVisitor recordVisitor) {
        if (this._validationList.isEmpty()) {
            return;
        }
        recordVisitor.visitRecord(this._headerRec);
        for (int i10 = 0; i10 < this._validationList.size(); i10++) {
            recordVisitor.visitRecord((Record) this._validationList.get(i10));
        }
    }

    public DataValidityTable() {
        this._headerRec = new DVALRecord();
        this._validationList = new ArrayList();
    }
}
