package lib.zj.office.fc.hssf.eventusermodel;

import lib.zj.office.fc.hssf.eventusermodel.dummyrecord.LastCellOfRowDummyRecord;
import lib.zj.office.fc.hssf.eventusermodel.dummyrecord.MissingCellDummyRecord;
import lib.zj.office.fc.hssf.eventusermodel.dummyrecord.MissingRowDummyRecord;
import lib.zj.office.fc.hssf.record.BOFRecord;
import lib.zj.office.fc.hssf.record.CellValueRecordInterface;
import lib.zj.office.fc.hssf.record.MulBlankRecord;
import lib.zj.office.fc.hssf.record.MulRKRecord;
import lib.zj.office.fc.hssf.record.NoteRecord;
import lib.zj.office.fc.hssf.record.NumberRecord;
import lib.zj.office.fc.hssf.record.Record;
import lib.zj.office.fc.hssf.record.RecordFactory;
import lib.zj.office.fc.hssf.record.RowRecord;

/* loaded from: classes3.dex */
public final class MissingRecordAwareHSSFListener implements HSSFListener {
    private HSSFListener childListener;
    private int lastCellColumn;
    private int lastCellRow;
    private int lastRowRow;

    public MissingRecordAwareHSSFListener(HSSFListener hSSFListener) {
        resetCounts();
        this.childListener = hSSFListener;
    }

    private void resetCounts() {
        this.lastRowRow = -1;
        this.lastCellRow = -1;
        this.lastCellColumn = -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // lib.zj.office.fc.hssf.eventusermodel.HSSFListener
    public void processRecord(Record record) {
        int row;
        short column;
        int i10;
        int i11;
        NumberRecord[] numberRecordArr = null;
        numberRecordArr = null;
        r2 = null;
        r2 = null;
        r2 = null;
        NumberRecord[] numberRecordArr2 = null;
        if (record instanceof CellValueRecordInterface) {
            CellValueRecordInterface cellValueRecordInterface = (CellValueRecordInterface) record;
            row = cellValueRecordInterface.getRow();
            column = cellValueRecordInterface.getColumn();
        } else {
            short sid = record.getSid();
            if (sid != 28) {
                if (sid != 520) {
                    if (sid != 1212) {
                        if (sid != 2057) {
                            if (sid != 189) {
                                if (sid == 190) {
                                    numberRecordArr2 = RecordFactory.convertBlankRecords((MulBlankRecord) record);
                                }
                            } else {
                                numberRecordArr2 = RecordFactory.convertRKRecords((MulRKRecord) record);
                            }
                        } else {
                            BOFRecord bOFRecord = (BOFRecord) record;
                            if (bOFRecord.getType() == 5 || bOFRecord.getType() == 16) {
                                resetCounts();
                            }
                        }
                    } else {
                        this.childListener.processRecord(record);
                        return;
                    }
                } else {
                    RowRecord rowRecord = (RowRecord) record;
                    if (this.lastRowRow + 1 < rowRecord.getRowNumber()) {
                        int i12 = this.lastRowRow;
                        while (true) {
                            i12++;
                            if (i12 >= rowRecord.getRowNumber()) {
                                break;
                            }
                            this.childListener.processRecord(new MissingRowDummyRecord(i12));
                        }
                    }
                    this.lastRowRow = rowRecord.getRowNumber();
                }
                column = -1;
                row = -1;
                numberRecordArr = numberRecordArr2;
            } else {
                NoteRecord noteRecord = (NoteRecord) record;
                row = noteRecord.getRow();
                column = noteRecord.getColumn();
            }
        }
        if (numberRecordArr != null && numberRecordArr.length > 0) {
            row = numberRecordArr[0].getRow();
            column = numberRecordArr[0].getColumn();
        }
        int i13 = this.lastCellRow;
        if (row != i13 && i13 > -1) {
            while (i13 < row) {
                if (i13 == this.lastCellRow) {
                    i11 = this.lastCellColumn;
                } else {
                    i11 = -1;
                }
                this.childListener.processRecord(new LastCellOfRowDummyRecord(i13, i11));
                i13++;
            }
        }
        int i14 = this.lastCellRow;
        if (i14 != -1 && (i10 = this.lastCellColumn) != -1 && row == -1) {
            this.childListener.processRecord(new LastCellOfRowDummyRecord(i14, i10));
            this.lastCellRow = -1;
            this.lastCellColumn = -1;
        }
        if (row != this.lastCellRow) {
            this.lastCellColumn = -1;
        }
        int i15 = this.lastCellColumn;
        if (i15 != column - 1) {
            while (true) {
                i15++;
                if (i15 >= column) {
                    break;
                }
                this.childListener.processRecord(new MissingCellDummyRecord(row, i15));
            }
        }
        if (numberRecordArr != null && numberRecordArr.length > 0) {
            column = numberRecordArr[numberRecordArr.length - 1].getColumn();
        }
        if (column != -1) {
            this.lastCellColumn = column;
            this.lastCellRow = row;
        }
        if (numberRecordArr != null && numberRecordArr.length > 0) {
            for (NumberRecord numberRecord : numberRecordArr) {
                this.childListener.processRecord(numberRecord);
            }
            return;
        }
        this.childListener.processRecord(record);
    }
}
