package lib.zj.office.fc.hssf.record.aggregates;

import androidx.appcompat.view.menu.d;
import java.util.ArrayList;
import java.util.List;
import lib.zj.office.fc.hssf.model.RecordStream;
import lib.zj.office.fc.hssf.record.MergeCellsRecord;
import lib.zj.office.fc.hssf.record.aggregates.RecordAggregate;
import lib.zj.office.fc.ss.util.CellRangeAddressList;
import lib.zj.office.fc.ss.util.HSSFCellRangeAddress;

/* loaded from: classes3.dex */
public final class MergedCellsTable extends RecordAggregate {
    private static int MAX_MERGED_REGIONS = 1027;
    private final List _mergedRegions = new ArrayList();

    private void addMergeCellsRecord(MergeCellsRecord mergeCellsRecord) {
        short numAreas = mergeCellsRecord.getNumAreas();
        for (int i10 = 0; i10 < numAreas; i10++) {
            this._mergedRegions.add(mergeCellsRecord.getAreaAt(i10));
        }
    }

    private void checkIndex(int i10) {
        if (i10 >= 0 && i10 < this._mergedRegions.size()) {
            return;
        }
        StringBuilder e10 = d.e("Specified CF index ", i10, " is outside the allowable range (0..");
        e10.append(this._mergedRegions.size() - 1);
        e10.append(")");
        throw new IllegalArgumentException(e10.toString());
    }

    public void addArea(int i10, int i11, int i12, int i13) {
        this._mergedRegions.add(new HSSFCellRangeAddress(i10, i12, i11, i13));
    }

    public void addRecords(MergeCellsRecord[] mergeCellsRecordArr) {
        for (MergeCellsRecord mergeCellsRecord : mergeCellsRecordArr) {
            addMergeCellsRecord(mergeCellsRecord);
        }
    }

    public HSSFCellRangeAddress get(int i10) {
        checkIndex(i10);
        return (HSSFCellRangeAddress) this._mergedRegions.get(i10);
    }

    public int getNumberOfMergedRegions() {
        return this._mergedRegions.size();
    }

    @Override // lib.zj.office.fc.hssf.record.aggregates.RecordAggregate, lib.zj.office.fc.hssf.record.RecordBase
    public int getRecordSize() {
        int size = this._mergedRegions.size();
        if (size < 1) {
            return 0;
        }
        int i10 = MAX_MERGED_REGIONS;
        int i11 = size / i10;
        return CellRangeAddressList.getEncodedSize(size % i10) + ((CellRangeAddressList.getEncodedSize(i10) + 4) * i11) + 4;
    }

    public void read(RecordStream recordStream) {
        List list = this._mergedRegions;
        while (recordStream.peekNextClass() == MergeCellsRecord.class) {
            MergeCellsRecord mergeCellsRecord = (MergeCellsRecord) recordStream.getNext();
            short numAreas = mergeCellsRecord.getNumAreas();
            for (int i10 = 0; i10 < numAreas; i10++) {
                list.add(mergeCellsRecord.getAreaAt(i10));
            }
        }
    }

    public void remove(int i10) {
        checkIndex(i10);
        this._mergedRegions.remove(i10);
    }

    @Override // lib.zj.office.fc.hssf.record.aggregates.RecordAggregate
    public void visitContainedRecords(RecordAggregate.RecordVisitor recordVisitor) {
        int size = this._mergedRegions.size();
        if (size < 1) {
            return;
        }
        int i10 = MAX_MERGED_REGIONS;
        int i11 = size / i10;
        int i12 = size % i10;
        HSSFCellRangeAddress[] hSSFCellRangeAddressArr = new HSSFCellRangeAddress[size];
        this._mergedRegions.toArray(hSSFCellRangeAddressArr);
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = MAX_MERGED_REGIONS;
            recordVisitor.visitRecord(new MergeCellsRecord(hSSFCellRangeAddressArr, i13 * i14, i14));
        }
        if (i12 > 0) {
            recordVisitor.visitRecord(new MergeCellsRecord(hSSFCellRangeAddressArr, i11 * MAX_MERGED_REGIONS, i12));
        }
    }
}
