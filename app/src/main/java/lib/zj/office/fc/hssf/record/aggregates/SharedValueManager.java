package lib.zj.office.fc.hssf.record.aggregates;

import a0.d;
import a6.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lib.zj.office.fc.hssf.record.ArrayRecord;
import lib.zj.office.fc.hssf.record.SharedFormulaRecord;
import lib.zj.office.fc.hssf.record.SharedValueRecordBase;
import lib.zj.office.fc.hssf.record.TableRecord;
import lib.zj.office.fc.hssf.util.CellRangeAddress8Bit;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;
import lib.zj.office.fc.ss.util.CellReference;

/* loaded from: classes3.dex */
public final class SharedValueManager {
    private final List<ArrayRecord> _arrayRecords;
    private final Map<SharedFormulaRecord, SharedFormulaGroup> _groupsBySharedFormulaRecord;
    private Map<Integer, SharedFormulaGroup> _groupsCache;
    private final TableRecord[] _tableRecords;

    /* loaded from: classes3.dex */
    public static final class SharedFormulaGroup {
        private final CellReference _firstCell;
        private final FormulaRecordAggregate[] _frAggs;
        private int _numberOfFormulas;
        private final SharedFormulaRecord _sfr;

        public SharedFormulaGroup(SharedFormulaRecord sharedFormulaRecord, CellReference cellReference) {
            if (sharedFormulaRecord.isInRange(cellReference.getRow(), cellReference.getCol())) {
                this._sfr = sharedFormulaRecord;
                this._firstCell = cellReference;
                this._frAggs = new FormulaRecordAggregate[((sharedFormulaRecord.getLastRow() - sharedFormulaRecord.getFirstRow()) + 1) * ((sharedFormulaRecord.getLastColumn() - sharedFormulaRecord.getFirstColumn()) + 1)];
                this._numberOfFormulas = 0;
                return;
            }
            throw new IllegalArgumentException("First formula cell " + cellReference.formatAsString() + " is not shared formula range " + sharedFormulaRecord.getRange().toString() + ".");
        }

        public void add(FormulaRecordAggregate formulaRecordAggregate) {
            if (this._numberOfFormulas == 0 && (this._firstCell.getRow() != formulaRecordAggregate.getRow() || this._firstCell.getCol() != formulaRecordAggregate.getColumn())) {
                throw new IllegalStateException("shared formula coding error: " + ((int) this._firstCell.getCol()) + PackagingURIHelper.FORWARD_SLASH_CHAR + this._firstCell.getRow() + " != " + ((int) formulaRecordAggregate.getColumn()) + PackagingURIHelper.FORWARD_SLASH_CHAR + formulaRecordAggregate.getRow());
            }
            int i10 = this._numberOfFormulas;
            FormulaRecordAggregate[] formulaRecordAggregateArr = this._frAggs;
            if (i10 < formulaRecordAggregateArr.length) {
                this._numberOfFormulas = i10 + 1;
                formulaRecordAggregateArr[i10] = formulaRecordAggregate;
                return;
            }
            throw new RuntimeException("Too many formula records for shared formula group");
        }

        public SharedFormulaRecord getSFR() {
            return this._sfr;
        }

        public final String toString() {
            StringBuffer stringBuffer = new StringBuffer(64);
            d.h(SharedFormulaGroup.class, stringBuffer, " [");
            stringBuffer.append(this._sfr.getRange().toString());
            stringBuffer.append("]");
            return stringBuffer.toString();
        }

        public void unlinkSharedFormulas() {
            for (int i10 = 0; i10 < this._numberOfFormulas; i10++) {
                this._frAggs[i10].unlinkSharedFormula();
            }
        }
    }

    private SharedValueManager(SharedFormulaRecord[] sharedFormulaRecordArr, CellReference[] cellReferenceArr, ArrayRecord[] arrayRecordArr, TableRecord[] tableRecordArr) {
        int length = sharedFormulaRecordArr.length;
        if (length == cellReferenceArr.length) {
            this._arrayRecords = toList(arrayRecordArr);
            this._tableRecords = tableRecordArr;
            HashMap hashMap = new HashMap((length * 3) / 2);
            for (int i10 = 0; i10 < length; i10++) {
                SharedFormulaRecord sharedFormulaRecord = sharedFormulaRecordArr[i10];
                hashMap.put(sharedFormulaRecord, new SharedFormulaGroup(sharedFormulaRecord, cellReferenceArr[i10]));
            }
            this._groupsBySharedFormulaRecord = hashMap;
            return;
        }
        throw new IllegalArgumentException(h.g(androidx.appcompat.view.menu.d.e("array sizes don't match: ", length, "!="), cellReferenceArr.length, "."));
    }

    public static SharedValueManager create(SharedFormulaRecord[] sharedFormulaRecordArr, CellReference[] cellReferenceArr, ArrayRecord[] arrayRecordArr, TableRecord[] tableRecordArr) {
        if (sharedFormulaRecordArr.length + cellReferenceArr.length + arrayRecordArr.length + tableRecordArr.length < 1) {
            return createEmpty();
        }
        return new SharedValueManager(sharedFormulaRecordArr, cellReferenceArr, arrayRecordArr, tableRecordArr);
    }

    public static SharedValueManager createEmpty() {
        return new SharedValueManager(new SharedFormulaRecord[0], new CellReference[0], new ArrayRecord[0], new TableRecord[0]);
    }

    private SharedFormulaGroup findFormulaGroupForCell(CellReference cellReference) {
        if (this._groupsCache == null) {
            this._groupsCache = new HashMap(this._groupsBySharedFormulaRecord.size());
            for (SharedFormulaGroup sharedFormulaGroup : this._groupsBySharedFormulaRecord.values()) {
                this._groupsCache.put(getKeyForCache(sharedFormulaGroup._firstCell), sharedFormulaGroup);
            }
        }
        SharedFormulaGroup sharedFormulaGroup2 = this._groupsCache.get(getKeyForCache(cellReference));
        if (sharedFormulaGroup2 != null) {
            return sharedFormulaGroup2;
        }
        throw new RuntimeException("Failed to find a matching shared formula record");
    }

    private Integer getKeyForCache(CellReference cellReference) {
        return new Integer(cellReference.getRow() | ((cellReference.getCol() + 1) << 16));
    }

    private static <Z> List<Z> toList(Z[] zArr) {
        ArrayList arrayList = new ArrayList(zArr.length);
        for (Z z10 : zArr) {
            arrayList.add(z10);
        }
        return arrayList;
    }

    public void addArrayRecord(ArrayRecord arrayRecord) {
        this._arrayRecords.add(arrayRecord);
    }

    public ArrayRecord getArrayRecord(int i10, int i11) {
        for (ArrayRecord arrayRecord : this._arrayRecords) {
            if (arrayRecord.isFirstCell(i10, i11)) {
                return arrayRecord;
            }
        }
        return null;
    }

    public SharedValueRecordBase getRecordForFirstCell(FormulaRecordAggregate formulaRecordAggregate) {
        TableRecord[] tableRecordArr;
        SharedFormulaGroup findFormulaGroupForCell;
        CellReference expReference = formulaRecordAggregate.getFormulaRecord().getFormula().getExpReference();
        if (expReference == null) {
            return null;
        }
        int row = expReference.getRow();
        short col = expReference.getCol();
        if (formulaRecordAggregate.getRow() == row && formulaRecordAggregate.getColumn() == col) {
            if (!this._groupsBySharedFormulaRecord.isEmpty() && (findFormulaGroupForCell = findFormulaGroupForCell(expReference)) != null) {
                return findFormulaGroupForCell.getSFR();
            }
            for (TableRecord tableRecord : this._tableRecords) {
                if (tableRecord.isFirstCell(row, col)) {
                    return tableRecord;
                }
            }
            for (ArrayRecord arrayRecord : this._arrayRecords) {
                if (arrayRecord.isFirstCell(row, col)) {
                    return arrayRecord;
                }
            }
        }
        return null;
    }

    public SharedFormulaRecord linkSharedFormulaRecord(CellReference cellReference, FormulaRecordAggregate formulaRecordAggregate) {
        SharedFormulaGroup findFormulaGroupForCell = findFormulaGroupForCell(cellReference);
        findFormulaGroupForCell.add(formulaRecordAggregate);
        return findFormulaGroupForCell.getSFR();
    }

    public CellRangeAddress8Bit removeArrayFormula(int i10, int i11) {
        for (ArrayRecord arrayRecord : this._arrayRecords) {
            if (arrayRecord.isInRange(i10, i11)) {
                this._arrayRecords.remove(arrayRecord);
                return arrayRecord.getRange();
            }
        }
        throw new IllegalArgumentException(h.d("Specified cell ", new CellReference(i10, i11, false, false).formatAsString(), " is not part of an array formula."));
    }

    public void unlink(SharedFormulaRecord sharedFormulaRecord) {
        SharedFormulaGroup remove = this._groupsBySharedFormulaRecord.remove(sharedFormulaRecord);
        if (remove != null) {
            this._groupsCache = null;
            remove.unlinkSharedFormulas();
            return;
        }
        throw new IllegalStateException("Failed to find formulas for shared formula");
    }
}
