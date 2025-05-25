package lib.zj.office.fc.hssf.record;

import a0.d;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class CRNCountRecord extends StandardRecord {
    private static final short DATA_SIZE = 4;
    public static final short sid = 89;
    private int field_1_number_crn_records;
    private int field_2_sheet_table_index;

    public CRNCountRecord() {
        throw new RuntimeException("incomplete code");
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 4;
    }

    public int getNumberOfCRNs() {
        return this.field_1_number_crn_records;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 89;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort((short) this.field_1_number_crn_records);
        littleEndianOutput.writeShort((short) this.field_2_sheet_table_index);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        d.h(CRNCountRecord.class, stringBuffer, " [XCT nCRNs=");
        stringBuffer.append(this.field_1_number_crn_records);
        stringBuffer.append(" sheetIx=");
        stringBuffer.append(this.field_2_sheet_table_index);
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public CRNCountRecord(RecordInputStream recordInputStream) {
        short readShort = recordInputStream.readShort();
        this.field_1_number_crn_records = readShort;
        if (readShort < 0) {
            this.field_1_number_crn_records = (short) (-readShort);
        }
        this.field_2_sheet_table_index = recordInputStream.readShort();
    }
}
