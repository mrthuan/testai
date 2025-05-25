package lib.zj.office.fc.hssf.record;

import b.a;
import lib.zj.office.fc.util.IntList;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public class IndexRecord extends StandardRecord {
    public static final short sid = 523;
    private int field_2_first_row;
    private int field_3_last_row_add1;
    private int field_4_zero;
    private IntList field_5_dbcells;

    public IndexRecord() {
    }

    public static int getRecordSizeForBlockCount(int i10) {
        return (i10 * 4) + 20;
    }

    public void addDbcell(int i10) {
        if (this.field_5_dbcells == null) {
            this.field_5_dbcells = new IntList();
        }
        this.field_5_dbcells.add(i10);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        IndexRecord indexRecord = new IndexRecord();
        indexRecord.field_2_first_row = this.field_2_first_row;
        indexRecord.field_3_last_row_add1 = this.field_3_last_row_add1;
        indexRecord.field_4_zero = this.field_4_zero;
        IntList intList = new IntList();
        indexRecord.field_5_dbcells = intList;
        intList.addAll(this.field_5_dbcells);
        return indexRecord;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return (getNumDbcells() * 4) + 16;
    }

    public int getDbcellAt(int i10) {
        return this.field_5_dbcells.get(i10);
    }

    public int getFirstRow() {
        return this.field_2_first_row;
    }

    public int getLastRowAdd1() {
        return this.field_3_last_row_add1;
    }

    public int getNumDbcells() {
        IntList intList = this.field_5_dbcells;
        if (intList == null) {
            return 0;
        }
        return intList.size();
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 523;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeInt(0);
        littleEndianOutput.writeInt(getFirstRow());
        littleEndianOutput.writeInt(getLastRowAdd1());
        littleEndianOutput.writeInt(this.field_4_zero);
        for (int i10 = 0; i10 < getNumDbcells(); i10++) {
            littleEndianOutput.writeInt(getDbcellAt(i10));
        }
    }

    public void setDbcell(int i10, int i11) {
        this.field_5_dbcells.set(i10, i11);
    }

    public void setFirstRow(int i10) {
        this.field_2_first_row = i10;
    }

    public void setLastRowAdd1(int i10) {
        this.field_3_last_row_add1 = i10;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[INDEX]\n    .firstrow       = ");
        stringBuffer.append(Integer.toHexString(getFirstRow()));
        stringBuffer.append("\n    .lastrowadd1    = ");
        stringBuffer.append(Integer.toHexString(getLastRowAdd1()));
        stringBuffer.append("\n");
        for (int i10 = 0; i10 < getNumDbcells(); i10++) {
            stringBuffer.append("    .dbcell_");
            stringBuffer.append(i10);
            stringBuffer.append(" = ");
            stringBuffer.append(Integer.toHexString(getDbcellAt(i10)));
            stringBuffer.append("\n");
        }
        stringBuffer.append("[/INDEX]\n");
        return stringBuffer.toString();
    }

    public IndexRecord(RecordInputStream recordInputStream) {
        int readInt = recordInputStream.readInt();
        if (readInt == 0) {
            this.field_2_first_row = recordInputStream.readInt();
            this.field_3_last_row_add1 = recordInputStream.readInt();
            this.field_4_zero = recordInputStream.readInt();
            int remaining = recordInputStream.remaining() / 4;
            this.field_5_dbcells = new IntList(remaining);
            for (int i10 = 0; i10 < remaining; i10++) {
                this.field_5_dbcells.add(recordInputStream.readInt());
            }
            return;
        }
        throw new RecordFormatException(a.c("Expected zero for field 1 but got ", readInt));
    }
}
