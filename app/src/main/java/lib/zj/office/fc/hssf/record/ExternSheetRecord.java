package lib.zj.office.fc.hssf.record;

import java.util.ArrayList;
import java.util.List;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public class ExternSheetRecord extends StandardRecord {
    public static final short sid = 23;
    private List<RefSubRecord> _list = new ArrayList();

    public ExternSheetRecord() {
    }

    public static ExternSheetRecord combine(ExternSheetRecord[] externSheetRecordArr) {
        ExternSheetRecord externSheetRecord = new ExternSheetRecord();
        for (ExternSheetRecord externSheetRecord2 : externSheetRecordArr) {
            int numOfREFRecords = externSheetRecord2.getNumOfREFRecords();
            for (int i10 = 0; i10 < numOfREFRecords; i10++) {
                externSheetRecord.addREFRecord(externSheetRecord2.getRef(i10));
            }
        }
        return externSheetRecord;
    }

    private RefSubRecord getRef(int i10) {
        return this._list.get(i10);
    }

    public void addREFRecord(RefSubRecord refSubRecord) {
        this._list.add(refSubRecord);
    }

    public int addRef(int i10, int i11, int i12) {
        this._list.add(new RefSubRecord(i10, i11, i12));
        return this._list.size() - 1;
    }

    public int findRefIndexFromExtBookIndex(int i10) {
        int size = this._list.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (getRef(i11).getExtBookIndex() == i10) {
                return i11;
            }
        }
        return -1;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return (this._list.size() * 6) + 2;
    }

    public int getExtbookIndexFromRefIndex(int i10) {
        return getRef(i10).getExtBookIndex();
    }

    public int getFirstSheetIndexFromRefIndex(int i10) {
        return getRef(i10).getFirstSheetIndex();
    }

    public int getNumOfREFRecords() {
        return this._list.size();
    }

    public int getNumOfRefs() {
        return this._list.size();
    }

    public int getRefIxForSheet(int i10, int i11) {
        int size = this._list.size();
        for (int i12 = 0; i12 < size; i12++) {
            RefSubRecord ref = getRef(i12);
            if (ref.getExtBookIndex() == i10 && ref.getFirstSheetIndex() == i11 && ref.getLastSheetIndex() == i11) {
                return i12;
            }
        }
        return -1;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 23;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        int size = this._list.size();
        littleEndianOutput.writeShort(size);
        for (int i10 = 0; i10 < size; i10++) {
            getRef(i10).serialize(littleEndianOutput);
        }
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[EXTERNSHEET]\n   numOfRefs     = ");
        int size = this._list.size();
        stringBuffer.append(size);
        stringBuffer.append("\n");
        for (int i10 = 0; i10 < size; i10++) {
            stringBuffer.append("refrec         #");
            stringBuffer.append(i10);
            stringBuffer.append(": ");
            stringBuffer.append(getRef(i10).toString());
            stringBuffer.append('\n');
        }
        stringBuffer.append("[/EXTERNSHEET]\n");
        return stringBuffer.toString();
    }

    public ExternSheetRecord(RecordInputStream recordInputStream) {
        short readShort = recordInputStream.readShort();
        for (int i10 = 0; i10 < readShort; i10++) {
            this._list.add(new RefSubRecord(recordInputStream));
        }
    }

    /* loaded from: classes3.dex */
    public static final class RefSubRecord {
        public static final int ENCODED_SIZE = 6;
        private int _extBookIndex;
        private int _firstSheetIndex;
        private int _lastSheetIndex;

        public RefSubRecord(int i10, int i11, int i12) {
            this._extBookIndex = i10;
            this._firstSheetIndex = i11;
            this._lastSheetIndex = i12;
        }

        public int getExtBookIndex() {
            return this._extBookIndex;
        }

        public int getFirstSheetIndex() {
            return this._firstSheetIndex;
        }

        public int getLastSheetIndex() {
            return this._lastSheetIndex;
        }

        public void serialize(LittleEndianOutput littleEndianOutput) {
            littleEndianOutput.writeShort(this._extBookIndex);
            littleEndianOutput.writeShort(this._firstSheetIndex);
            littleEndianOutput.writeShort(this._lastSheetIndex);
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer("extBook=");
            stringBuffer.append(this._extBookIndex);
            stringBuffer.append(" firstSheet=");
            stringBuffer.append(this._firstSheetIndex);
            stringBuffer.append(" lastSheet=");
            stringBuffer.append(this._lastSheetIndex);
            return stringBuffer.toString();
        }

        public RefSubRecord(RecordInputStream recordInputStream) {
            this(recordInputStream.readShort(), recordInputStream.readShort(), recordInputStream.readShort());
        }
    }
}
