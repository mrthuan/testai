package lib.zj.office.fc.hssf.record.aggregates;

import a0.a;
import java.util.ArrayList;
import java.util.Iterator;
import lib.zj.office.fc.hssf.formula.FormulaShifter;
import lib.zj.office.fc.hssf.formula.ptg.Ptg;
import lib.zj.office.fc.hssf.model.RecordStream;
import lib.zj.office.fc.hssf.record.BlankRecord;
import lib.zj.office.fc.hssf.record.CellValueRecordInterface;
import lib.zj.office.fc.hssf.record.FormulaRecord;
import lib.zj.office.fc.hssf.record.MulBlankRecord;
import lib.zj.office.fc.hssf.record.Record;
import lib.zj.office.fc.hssf.record.RecordBase;
import lib.zj.office.fc.hssf.record.StringRecord;
import lib.zj.office.fc.hssf.record.aggregates.RecordAggregate;

/* loaded from: classes3.dex */
public final class ValueRecordsAggregate implements Iterable<CellValueRecordInterface> {
    private static final int INDEX_NOT_SET = -1;
    private static final int MAX_ROW_INDEX = 65535;
    private int firstcell;
    private int lastcell;
    private CellValueRecordInterface[][] records;

    /* loaded from: classes3.dex */
    public class ValueIterator implements Iterator<CellValueRecordInterface> {
        int curRowIndex = 0;
        int curColIndex = -1;
        int nextRowIndex = 0;
        int nextColIndex = -1;

        public ValueIterator() {
            getNextPos();
        }

        public void getNextPos() {
            if (this.nextRowIndex >= ValueRecordsAggregate.this.records.length) {
                return;
            }
            while (this.nextRowIndex < ValueRecordsAggregate.this.records.length) {
                this.nextColIndex++;
                if (ValueRecordsAggregate.this.records[this.nextRowIndex] != null && this.nextColIndex < ValueRecordsAggregate.this.records[this.nextRowIndex].length) {
                    if (ValueRecordsAggregate.this.records[this.nextRowIndex][this.nextColIndex] != null) {
                        return;
                    }
                } else {
                    this.nextRowIndex++;
                    this.nextColIndex = -1;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.nextRowIndex < ValueRecordsAggregate.this.records.length) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            ValueRecordsAggregate.this.records[this.curRowIndex][this.curColIndex] = null;
        }

        @Override // java.util.Iterator
        public CellValueRecordInterface next() {
            if (hasNext()) {
                this.curRowIndex = this.nextRowIndex;
                this.curColIndex = this.nextColIndex;
                CellValueRecordInterface cellValueRecordInterface = ValueRecordsAggregate.this.records[this.curRowIndex][this.curColIndex];
                getNextPos();
                return cellValueRecordInterface;
            }
            throw new IndexOutOfBoundsException("iterator has no next");
        }
    }

    public ValueRecordsAggregate() {
        this(-1, -1, new CellValueRecordInterface[30]);
    }

    private static int countBlanks(CellValueRecordInterface[] cellValueRecordInterfaceArr, int i10) {
        int i11 = i10;
        while (i11 < cellValueRecordInterfaceArr.length && (cellValueRecordInterfaceArr[i11] instanceof BlankRecord)) {
            i11++;
        }
        return i11 - i10;
    }

    private MulBlankRecord createMBR(CellValueRecordInterface[] cellValueRecordInterfaceArr, int i10, int i11) {
        short[] sArr = new short[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            sArr[i12] = ((BlankRecord) cellValueRecordInterfaceArr[i10 + i12]).getXFIndex();
        }
        return new MulBlankRecord(cellValueRecordInterfaceArr[i10].getRow(), i10, sArr);
    }

    private static int getRowSerializedSize(CellValueRecordInterface[] cellValueRecordInterfaceArr) {
        int recordSize;
        int i10 = 0;
        if (cellValueRecordInterfaceArr == null) {
            return 0;
        }
        int i11 = 0;
        while (i10 < cellValueRecordInterfaceArr.length) {
            RecordBase recordBase = (RecordBase) cellValueRecordInterfaceArr[i10];
            if (recordBase != null) {
                int countBlanks = countBlanks(cellValueRecordInterfaceArr, i10);
                if (countBlanks > 1) {
                    recordSize = (countBlanks * 2) + 10 + i11;
                    i10 += countBlanks - 1;
                } else {
                    recordSize = recordBase.getRecordSize() + i11;
                }
                i11 = recordSize;
            }
            i10++;
        }
        return i11;
    }

    public void addMultipleBlanks(MulBlankRecord mulBlankRecord) {
        for (int i10 = 0; i10 < mulBlankRecord.getNumColumns(); i10++) {
            BlankRecord blankRecord = new BlankRecord();
            blankRecord.setColumn((short) (mulBlankRecord.getFirstColumn() + i10));
            blankRecord.setRow(mulBlankRecord.getRow());
            blankRecord.setXFIndex(mulBlankRecord.getXFAt(i10));
            insertCell(blankRecord);
        }
    }

    public Object clone() {
        throw new RuntimeException("clone() should not be called.  ValueRecordsAggregate should be copied via Sheet.cloneSheet()");
    }

    public void construct(CellValueRecordInterface cellValueRecordInterface, RecordStream recordStream, SharedValueManager sharedValueManager) {
        StringRecord stringRecord;
        if (cellValueRecordInterface instanceof FormulaRecord) {
            FormulaRecord formulaRecord = (FormulaRecord) cellValueRecordInterface;
            if (recordStream.peekNextClass() == StringRecord.class) {
                stringRecord = (StringRecord) recordStream.getNext();
            } else {
                stringRecord = null;
            }
            insertCell(new FormulaRecordAggregate(formulaRecord, stringRecord, sharedValueManager));
            return;
        }
        insertCell(cellValueRecordInterface);
    }

    public int getFirstCellNum() {
        return this.firstcell;
    }

    public int getLastCellNum() {
        return this.lastcell;
    }

    public int getPhysicalNumberOfCells() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            CellValueRecordInterface[][] cellValueRecordInterfaceArr = this.records;
            if (i10 < cellValueRecordInterfaceArr.length) {
                CellValueRecordInterface[] cellValueRecordInterfaceArr2 = cellValueRecordInterfaceArr[i10];
                if (cellValueRecordInterfaceArr2 != null) {
                    for (CellValueRecordInterface cellValueRecordInterface : cellValueRecordInterfaceArr2) {
                        if (cellValueRecordInterface != null) {
                            i11++;
                        }
                    }
                }
                i10++;
            } else {
                return i11;
            }
        }
    }

    public int getRowCellBlockSize(int i10, int i11) {
        int i12 = 0;
        while (i10 <= i11) {
            CellValueRecordInterface[][] cellValueRecordInterfaceArr = this.records;
            if (i10 >= cellValueRecordInterfaceArr.length) {
                break;
            }
            i12 += getRowSerializedSize(cellValueRecordInterfaceArr[i10]);
            i10++;
        }
        return i12;
    }

    @Deprecated
    public CellValueRecordInterface[] getValueRecords() {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            CellValueRecordInterface[][] cellValueRecordInterfaceArr = this.records;
            if (i10 < cellValueRecordInterfaceArr.length) {
                CellValueRecordInterface[] cellValueRecordInterfaceArr2 = cellValueRecordInterfaceArr[i10];
                if (cellValueRecordInterfaceArr2 != null) {
                    for (CellValueRecordInterface cellValueRecordInterface : cellValueRecordInterfaceArr2) {
                        if (cellValueRecordInterface != null) {
                            arrayList.add(cellValueRecordInterface);
                        }
                    }
                }
                i10++;
            } else {
                CellValueRecordInterface[] cellValueRecordInterfaceArr3 = new CellValueRecordInterface[arrayList.size()];
                arrayList.toArray(cellValueRecordInterfaceArr3);
                return cellValueRecordInterfaceArr3;
            }
        }
    }

    public void insertCell(CellValueRecordInterface cellValueRecordInterface) {
        short column = cellValueRecordInterface.getColumn();
        int row = cellValueRecordInterface.getRow();
        CellValueRecordInterface[][] cellValueRecordInterfaceArr = this.records;
        if (row >= cellValueRecordInterfaceArr.length) {
            int length = cellValueRecordInterfaceArr.length * 2;
            int i10 = row + 1;
            if (length < i10) {
                length = i10;
            }
            CellValueRecordInterface[][] cellValueRecordInterfaceArr2 = new CellValueRecordInterface[length];
            this.records = cellValueRecordInterfaceArr2;
            System.arraycopy(cellValueRecordInterfaceArr, 0, cellValueRecordInterfaceArr2, 0, cellValueRecordInterfaceArr.length);
        }
        CellValueRecordInterface[][] cellValueRecordInterfaceArr3 = this.records;
        CellValueRecordInterface[] cellValueRecordInterfaceArr4 = cellValueRecordInterfaceArr3[row];
        if (cellValueRecordInterfaceArr4 == null) {
            int i11 = column + 1;
            if (i11 < 10) {
                i11 = 10;
            }
            cellValueRecordInterfaceArr4 = new CellValueRecordInterface[i11];
            cellValueRecordInterfaceArr3[row] = cellValueRecordInterfaceArr4;
        }
        if (column >= cellValueRecordInterfaceArr4.length) {
            int length2 = cellValueRecordInterfaceArr4.length * 2;
            int i12 = column + 1;
            if (length2 < i12) {
                length2 = i12;
            }
            CellValueRecordInterface[] cellValueRecordInterfaceArr5 = new CellValueRecordInterface[length2];
            System.arraycopy(cellValueRecordInterfaceArr4, 0, cellValueRecordInterfaceArr5, 0, cellValueRecordInterfaceArr4.length);
            this.records[row] = cellValueRecordInterfaceArr5;
            cellValueRecordInterfaceArr4 = cellValueRecordInterfaceArr5;
        }
        cellValueRecordInterfaceArr4[column] = cellValueRecordInterface;
        int i13 = this.firstcell;
        if (column < i13 || i13 == -1) {
            this.firstcell = column;
        }
        int i14 = this.lastcell;
        if (column > i14 || i14 == -1) {
            this.lastcell = column;
        }
    }

    @Override // java.lang.Iterable
    public Iterator<CellValueRecordInterface> iterator() {
        return new ValueIterator();
    }

    public void removeAllCellsValuesForRow(int i10) {
        if (i10 >= 0 && i10 <= 65535) {
            CellValueRecordInterface[][] cellValueRecordInterfaceArr = this.records;
            if (i10 >= cellValueRecordInterfaceArr.length) {
                return;
            }
            cellValueRecordInterfaceArr[i10] = null;
            return;
        }
        throw new IllegalArgumentException(a.g("Specified rowIndex ", i10, " is outside the allowable range (0..65535)"));
    }

    public void removeCell(CellValueRecordInterface cellValueRecordInterface) {
        if (cellValueRecordInterface != null) {
            int row = cellValueRecordInterface.getRow();
            CellValueRecordInterface[][] cellValueRecordInterfaceArr = this.records;
            if (row < cellValueRecordInterfaceArr.length) {
                CellValueRecordInterface[] cellValueRecordInterfaceArr2 = cellValueRecordInterfaceArr[row];
                if (cellValueRecordInterfaceArr2 != null) {
                    short column = cellValueRecordInterface.getColumn();
                    if (column < cellValueRecordInterfaceArr2.length) {
                        cellValueRecordInterfaceArr2[column] = null;
                        return;
                    }
                    throw new RuntimeException("cell column is out of range");
                }
                throw new RuntimeException("cell row is already empty");
            }
            throw new RuntimeException("cell row is out of range");
        }
        throw new IllegalArgumentException("cell must not be null");
    }

    public boolean rowHasCells(int i10) {
        CellValueRecordInterface[] cellValueRecordInterfaceArr;
        CellValueRecordInterface[][] cellValueRecordInterfaceArr2 = this.records;
        if (i10 >= cellValueRecordInterfaceArr2.length || (cellValueRecordInterfaceArr = cellValueRecordInterfaceArr2[i10]) == null) {
            return false;
        }
        for (CellValueRecordInterface cellValueRecordInterface : cellValueRecordInterfaceArr) {
            if (cellValueRecordInterface != null) {
                return true;
            }
        }
        return false;
    }

    public void updateFormulasAfterRowShift(FormulaShifter formulaShifter, int i10) {
        int i11 = 0;
        while (true) {
            CellValueRecordInterface[][] cellValueRecordInterfaceArr = this.records;
            if (i11 < cellValueRecordInterfaceArr.length) {
                CellValueRecordInterface[] cellValueRecordInterfaceArr2 = cellValueRecordInterfaceArr[i11];
                if (cellValueRecordInterfaceArr2 != null) {
                    for (CellValueRecordInterface cellValueRecordInterface : cellValueRecordInterfaceArr2) {
                        if (cellValueRecordInterface instanceof FormulaRecordAggregate) {
                            FormulaRecord formulaRecord = ((FormulaRecordAggregate) cellValueRecordInterface).getFormulaRecord();
                            Ptg[] parsedExpression = formulaRecord.getParsedExpression();
                            if (formulaShifter.adjustFormula(parsedExpression, i10)) {
                                formulaRecord.setParsedExpression(parsedExpression);
                            }
                        }
                    }
                }
                i11++;
            } else {
                return;
            }
        }
    }

    public void visitCellsForRow(int i10, RecordAggregate.RecordVisitor recordVisitor) {
        CellValueRecordInterface[] cellValueRecordInterfaceArr = this.records[i10];
        if (cellValueRecordInterfaceArr != null) {
            int i11 = 0;
            while (i11 < cellValueRecordInterfaceArr.length) {
                RecordBase recordBase = (RecordBase) cellValueRecordInterfaceArr[i11];
                if (recordBase != null) {
                    int countBlanks = countBlanks(cellValueRecordInterfaceArr, i11);
                    if (countBlanks > 1) {
                        recordVisitor.visitRecord(createMBR(cellValueRecordInterfaceArr, i11, countBlanks));
                        i11 += countBlanks - 1;
                    } else if (recordBase instanceof RecordAggregate) {
                        ((RecordAggregate) recordBase).visitContainedRecords(recordVisitor);
                    } else {
                        recordVisitor.visitRecord((Record) recordBase);
                    }
                }
                i11++;
            }
            return;
        }
        throw new IllegalArgumentException(a.g("Row [", i10, "] is empty"));
    }

    private ValueRecordsAggregate(int i10, int i11, CellValueRecordInterface[][] cellValueRecordInterfaceArr) {
        this.firstcell = i10;
        this.lastcell = i11;
        this.records = cellValueRecordInterfaceArr;
    }

    public void dispose() {
    }
}
