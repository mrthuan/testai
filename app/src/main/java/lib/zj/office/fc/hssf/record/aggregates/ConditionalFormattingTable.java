package lib.zj.office.fc.hssf.record.aggregates;

import androidx.appcompat.view.menu.d;
import java.util.ArrayList;
import java.util.List;
import lib.zj.office.fc.hssf.formula.FormulaShifter;
import lib.zj.office.fc.hssf.model.RecordStream;
import lib.zj.office.fc.hssf.record.CFHeaderRecord;
import lib.zj.office.fc.hssf.record.aggregates.RecordAggregate;

/* loaded from: classes3.dex */
public final class ConditionalFormattingTable extends RecordAggregate {
    private final List _cfHeaders;

    public ConditionalFormattingTable() {
        this._cfHeaders = new ArrayList();
    }

    private void checkIndex(int i10) {
        if (i10 >= 0 && i10 < this._cfHeaders.size()) {
            return;
        }
        StringBuilder e10 = d.e("Specified CF index ", i10, " is outside the allowable range (0..");
        e10.append(this._cfHeaders.size() - 1);
        e10.append(")");
        throw new IllegalArgumentException(e10.toString());
    }

    public int add(CFRecordsAggregate cFRecordsAggregate) {
        this._cfHeaders.add(cFRecordsAggregate);
        return this._cfHeaders.size() - 1;
    }

    public CFRecordsAggregate get(int i10) {
        checkIndex(i10);
        return (CFRecordsAggregate) this._cfHeaders.get(i10);
    }

    public void remove(int i10) {
        checkIndex(i10);
        this._cfHeaders.remove(i10);
    }

    public int size() {
        return this._cfHeaders.size();
    }

    public void updateFormulasAfterCellShift(FormulaShifter formulaShifter, int i10) {
        int i11 = 0;
        while (i11 < this._cfHeaders.size()) {
            if (!((CFRecordsAggregate) this._cfHeaders.get(i11)).updateFormulasAfterCellShift(formulaShifter, i10)) {
                this._cfHeaders.remove(i11);
                i11--;
            }
            i11++;
        }
    }

    @Override // lib.zj.office.fc.hssf.record.aggregates.RecordAggregate
    public void visitContainedRecords(RecordAggregate.RecordVisitor recordVisitor) {
        for (int i10 = 0; i10 < this._cfHeaders.size(); i10++) {
            ((CFRecordsAggregate) this._cfHeaders.get(i10)).visitContainedRecords(recordVisitor);
        }
    }

    public ConditionalFormattingTable(RecordStream recordStream) {
        ArrayList arrayList = new ArrayList();
        while (recordStream.peekNextClass() == CFHeaderRecord.class) {
            arrayList.add(CFRecordsAggregate.createCFAggregate(recordStream));
        }
        this._cfHeaders = arrayList;
    }
}
