package lib.zj.office.fc.hssf.record.aggregates;

import b.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import lib.zj.office.fc.hssf.formula.FormulaShifter;
import lib.zj.office.fc.hssf.model.RecordStream;
import lib.zj.office.fc.hssf.record.CellValueRecordInterface;
import lib.zj.office.fc.hssf.record.DBCellRecord;
import lib.zj.office.fc.hssf.record.DimensionsRecord;
import lib.zj.office.fc.hssf.record.FormulaRecord;
import lib.zj.office.fc.hssf.record.IndexRecord;
import lib.zj.office.fc.hssf.record.MulBlankRecord;
import lib.zj.office.fc.hssf.record.Record;
import lib.zj.office.fc.hssf.record.RowRecord;
import lib.zj.office.fc.hssf.record.UnknownRecord;
import lib.zj.office.fc.hssf.record.aggregates.RecordAggregate;
import lib.zj.office.fc.ss.SpreadsheetVersion;

/* loaded from: classes3.dex */
public final class RowRecordsAggregate extends RecordAggregate {
    private int _firstrow;
    private int _lastrow;
    private RowRecord[] _rowRecordValues;
    private final Map<Integer, RowRecord> _rowRecords;
    private final SharedValueManager _sharedValueManager;
    private final List<Record> _unknownRecords;
    private final ValueRecordsAggregate _valuesAgg;

    public RowRecordsAggregate() {
        this(SharedValueManager.createEmpty());
    }

    private void addUnknownRecord(Record record) {
        this._unknownRecords.add(record);
    }

    public static RowRecord createRow(int i10) {
        return new RowRecord(i10);
    }

    private int getEndRowNumberForBlock(int i10) {
        int i11 = ((i10 + 1) * 32) - 1;
        if (i11 >= this._rowRecords.size()) {
            i11 = this._rowRecords.size() - 1;
        }
        if (this._rowRecordValues == null) {
            this._rowRecordValues = (RowRecord[]) this._rowRecords.values().toArray(new RowRecord[this._rowRecords.size()]);
        }
        try {
            return this._rowRecordValues[i11].getRowNumber();
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new RuntimeException(a.c("Did not find end row for block ", i10));
        }
    }

    private int getRowBlockSize(int i10) {
        return getRowCountForBlock(i10) * 20;
    }

    private int getStartRowNumberForBlock(int i10) {
        int i11 = i10 * 32;
        if (this._rowRecordValues == null) {
            this._rowRecordValues = (RowRecord[]) this._rowRecords.values().toArray(new RowRecord[this._rowRecords.size()]);
        }
        try {
            return this._rowRecordValues[i11].getRowNumber();
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new RuntimeException(a.c("Did not find start row for block ", i10));
        }
    }

    private int visitRowRecordsForBlock(int i10, RecordAggregate.RecordVisitor recordVisitor) {
        int i11 = i10 * 32;
        int i12 = i11 + 32;
        Iterator<RowRecord> it = this._rowRecords.values().iterator();
        int i13 = 0;
        int i14 = 0;
        while (i14 < i11) {
            it.next();
            i14++;
        }
        while (it.hasNext()) {
            int i15 = i14 + 1;
            if (i14 >= i12) {
                break;
            }
            RowRecord next = it.next();
            i13 += next.getRecordSize();
            recordVisitor.visitRecord(next);
            i14 = i15;
        }
        return i13;
    }

    private int writeHidden(RowRecord rowRecord, int i10) {
        short outlineLevel = rowRecord.getOutlineLevel();
        while (rowRecord != null && getRow(i10).getOutlineLevel() >= outlineLevel) {
            rowRecord.setZeroHeight(true);
            i10++;
            rowRecord = getRow(i10);
        }
        return i10;
    }

    public void collapseRow(int i10) {
        int findStartOfRowOutlineGroup = findStartOfRowOutlineGroup(i10);
        int writeHidden = writeHidden(getRow(findStartOfRowOutlineGroup), findStartOfRowOutlineGroup);
        RowRecord row = getRow(writeHidden);
        if (row == null) {
            row = createRow(writeHidden);
            insertRow(row);
        }
        row.setColapsed(true);
    }

    public DimensionsRecord createDimensions() {
        DimensionsRecord dimensionsRecord = new DimensionsRecord();
        dimensionsRecord.setFirstRow(this._firstrow);
        dimensionsRecord.setLastRow(this._lastrow);
        dimensionsRecord.setFirstCol((short) this._valuesAgg.getFirstCellNum());
        dimensionsRecord.setLastCol((short) this._valuesAgg.getLastCellNum());
        return dimensionsRecord;
    }

    public FormulaRecordAggregate createFormula(int i10, int i11) {
        FormulaRecord formulaRecord = new FormulaRecord();
        formulaRecord.setRow(i10);
        formulaRecord.setColumn((short) i11);
        return new FormulaRecordAggregate(formulaRecord, null, this._sharedValueManager);
    }

    public IndexRecord createIndexRecord(int i10, int i11) {
        IndexRecord indexRecord = new IndexRecord();
        indexRecord.setFirstRow(this._firstrow);
        indexRecord.setLastRowAdd1(this._lastrow + 1);
        int rowBlockCount = getRowBlockCount();
        int recordSizeForBlockCount = IndexRecord.getRecordSizeForBlockCount(rowBlockCount) + i10 + i11;
        for (int i12 = 0; i12 < rowBlockCount; i12++) {
            int rowCellBlockSize = this._valuesAgg.getRowCellBlockSize(getStartRowNumberForBlock(i12), getEndRowNumberForBlock(i12)) + recordSizeForBlockCount + getRowBlockSize(i12);
            indexRecord.addDbcell(rowCellBlockSize);
            recordSizeForBlockCount = (getRowCountForBlock(i12) * 2) + 8 + rowCellBlockSize;
        }
        return indexRecord;
    }

    public void dispose() {
        this._rowRecords.clear();
        this._valuesAgg.dispose();
        this._unknownRecords.clear();
    }

    public void expandRow(int i10) {
        if (i10 == -1 || !isRowGroupCollapsed(i10)) {
            return;
        }
        int findStartOfRowOutlineGroup = findStartOfRowOutlineGroup(i10);
        RowRecord row = getRow(findStartOfRowOutlineGroup);
        int findEndOfRowOutlineGroup = findEndOfRowOutlineGroup(i10);
        if (!isRowGroupHiddenByParent(i10)) {
            while (findStartOfRowOutlineGroup <= findEndOfRowOutlineGroup) {
                RowRecord row2 = getRow(findStartOfRowOutlineGroup);
                if (row.getOutlineLevel() == row2.getOutlineLevel() || !isRowGroupCollapsed(findStartOfRowOutlineGroup)) {
                    row2.setZeroHeight(false);
                }
                findStartOfRowOutlineGroup++;
            }
        }
        getRow(findEndOfRowOutlineGroup + 1).setColapsed(false);
    }

    public int findEndOfRowOutlineGroup(int i10) {
        short outlineLevel = getRow(i10).getOutlineLevel();
        while (i10 < getLastRowNum() && getRow(i10) != null && getRow(i10).getOutlineLevel() >= outlineLevel) {
            i10++;
        }
        return i10 - 1;
    }

    public int findStartOfRowOutlineGroup(int i10) {
        short outlineLevel = getRow(i10).getOutlineLevel();
        while (getRow(i10) != null) {
            if (getRow(i10).getOutlineLevel() < outlineLevel) {
                return i10 + 1;
            }
            i10--;
        }
        return i10 + 1;
    }

    public Iterator<CellValueRecordInterface> getCellValueIterator() {
        return this._valuesAgg.iterator();
    }

    public int getFirstRowNum() {
        return this._firstrow;
    }

    public Iterator<RowRecord> getIterator() {
        return this._rowRecords.values().iterator();
    }

    public int getLastRowNum() {
        return this._lastrow;
    }

    public int getPhysicalNumberOfRows() {
        return this._rowRecords.size();
    }

    public RowRecord getRow(int i10) {
        int lastRowIndex = SpreadsheetVersion.EXCEL97.getLastRowIndex();
        if (i10 >= 0 && i10 <= lastRowIndex) {
            return this._rowRecords.get(Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(a.c("The row number must be between 0 and ", lastRowIndex));
    }

    public int getRowBlockCount() {
        int size = this._rowRecords.size() / 32;
        if (this._rowRecords.size() % 32 != 0) {
            return size + 1;
        }
        return size;
    }

    public int getRowCountForBlock(int i10) {
        int i11 = i10 * 32;
        int i12 = (i11 + 32) - 1;
        if (i12 >= this._rowRecords.size()) {
            i12 = this._rowRecords.size() - 1;
        }
        return (i12 - i11) + 1;
    }

    public CellValueRecordInterface[] getValueRecords() {
        return this._valuesAgg.getValueRecords();
    }

    public void insertCell(CellValueRecordInterface cellValueRecordInterface) {
        this._valuesAgg.insertCell(cellValueRecordInterface);
    }

    public void insertRow(RowRecord rowRecord) {
        this._rowRecords.put(Integer.valueOf(rowRecord.getRowNumber()), rowRecord);
        this._rowRecordValues = null;
        int rowNumber = rowRecord.getRowNumber();
        int i10 = this._firstrow;
        if (rowNumber < i10 || i10 == -1) {
            this._firstrow = rowRecord.getRowNumber();
        }
        int rowNumber2 = rowRecord.getRowNumber();
        int i11 = this._lastrow;
        if (rowNumber2 > i11 || i11 == -1) {
            this._lastrow = rowRecord.getRowNumber();
        }
    }

    public boolean isRowGroupCollapsed(int i10) {
        int findEndOfRowOutlineGroup = findEndOfRowOutlineGroup(i10) + 1;
        if (getRow(findEndOfRowOutlineGroup) == null) {
            return false;
        }
        return getRow(findEndOfRowOutlineGroup).getColapsed();
    }

    public boolean isRowGroupHiddenByParent(int i10) {
        short outlineLevel;
        boolean zeroHeight;
        boolean z10;
        int findEndOfRowOutlineGroup = findEndOfRowOutlineGroup(i10) + 1;
        short s4 = 0;
        if (getRow(findEndOfRowOutlineGroup) == null) {
            zeroHeight = false;
            outlineLevel = 0;
        } else {
            outlineLevel = getRow(findEndOfRowOutlineGroup).getOutlineLevel();
            zeroHeight = getRow(findEndOfRowOutlineGroup).getZeroHeight();
        }
        int findStartOfRowOutlineGroup = findStartOfRowOutlineGroup(i10) - 1;
        if (findStartOfRowOutlineGroup >= 0 && getRow(findStartOfRowOutlineGroup) != null) {
            s4 = getRow(findStartOfRowOutlineGroup).getOutlineLevel();
            z10 = getRow(findStartOfRowOutlineGroup).getZeroHeight();
        } else {
            z10 = false;
        }
        if (outlineLevel > s4) {
            return zeroHeight;
        }
        return z10;
    }

    public void removeCell(CellValueRecordInterface cellValueRecordInterface) {
        if (cellValueRecordInterface instanceof FormulaRecordAggregate) {
            ((FormulaRecordAggregate) cellValueRecordInterface).notifyFormulaChanging();
        }
        this._valuesAgg.removeCell(cellValueRecordInterface);
    }

    public void removeRow(RowRecord rowRecord) {
        int rowNumber = rowRecord.getRowNumber();
        this._valuesAgg.removeAllCellsValuesForRow(rowNumber);
        Integer valueOf = Integer.valueOf(rowNumber);
        RowRecord remove = this._rowRecords.remove(valueOf);
        if (remove != null) {
            if (rowRecord == remove) {
                this._rowRecordValues = null;
                return;
            } else {
                this._rowRecords.put(valueOf, remove);
                throw new RuntimeException("Attempt to remove row that does not belong to this sheet");
            }
        }
        throw new RuntimeException("Invalid row index (" + valueOf.intValue() + ")");
    }

    public void updateFormulasAfterRowShift(FormulaShifter formulaShifter, int i10) {
        this._valuesAgg.updateFormulasAfterRowShift(formulaShifter, i10);
    }

    @Override // lib.zj.office.fc.hssf.record.aggregates.RecordAggregate
    public void visitContainedRecords(RecordAggregate.RecordVisitor recordVisitor) {
        RecordAggregate.PositionTrackingVisitor positionTrackingVisitor = new RecordAggregate.PositionTrackingVisitor(recordVisitor, 0);
        int rowBlockCount = getRowBlockCount();
        for (int i10 = 0; i10 < rowBlockCount; i10++) {
            int visitRowRecordsForBlock = visitRowRecordsForBlock(i10, recordVisitor);
            int i11 = visitRowRecordsForBlock + 0;
            int endRowNumberForBlock = getEndRowNumberForBlock(i10);
            DBCellRecord.Builder builder = new DBCellRecord.Builder();
            int i12 = visitRowRecordsForBlock - 20;
            for (int startRowNumberForBlock = getStartRowNumberForBlock(i10); startRowNumberForBlock <= endRowNumberForBlock; startRowNumberForBlock++) {
                if (this._valuesAgg.rowHasCells(startRowNumberForBlock)) {
                    positionTrackingVisitor.setPosition(0);
                    this._valuesAgg.visitCellsForRow(startRowNumberForBlock, positionTrackingVisitor);
                    int position = positionTrackingVisitor.getPosition();
                    i11 += position;
                    builder.addCellOffset(i12);
                    i12 = position;
                }
            }
            recordVisitor.visitRecord(builder.build(i11));
        }
        for (int i13 = 0; i13 < this._unknownRecords.size(); i13++) {
            recordVisitor.visitRecord(this._unknownRecords.get(i13));
        }
    }

    private RowRecordsAggregate(SharedValueManager sharedValueManager) {
        this._firstrow = -1;
        this._lastrow = -1;
        this._rowRecordValues = null;
        if (sharedValueManager != null) {
            this._rowRecords = new TreeMap();
            this._valuesAgg = new ValueRecordsAggregate();
            this._unknownRecords = new ArrayList();
            this._sharedValueManager = sharedValueManager;
            return;
        }
        throw new IllegalArgumentException("SharedValueManager must be provided.");
    }

    public RowRecordsAggregate(RecordStream recordStream, SharedValueManager sharedValueManager) {
        this(sharedValueManager);
        while (recordStream.hasNext()) {
            Record next = recordStream.getNext();
            short sid = next.getSid();
            if (sid != 215) {
                if (sid != 520) {
                    if (next instanceof UnknownRecord) {
                        addUnknownRecord(next);
                        while (recordStream.peekNextSid() == 60) {
                            addUnknownRecord(recordStream.getNext());
                        }
                    } else if (next instanceof MulBlankRecord) {
                        this._valuesAgg.addMultipleBlanks((MulBlankRecord) next);
                    } else if (next instanceof CellValueRecordInterface) {
                        this._valuesAgg.construct((CellValueRecordInterface) next, recordStream, sharedValueManager);
                    } else {
                        throw new RuntimeException("Unexpected record type (" + next.getClass().getName() + ")");
                    }
                } else {
                    insertRow((RowRecord) next);
                }
            }
        }
    }
}
