package lib.zj.office.fc.hssf.record;

import a0.d;
import com.google.android.play.core.assetpacks.b1;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class CRNRecord extends StandardRecord {
    public static final short sid = 90;
    private int field_1_last_column_index;
    private int field_2_first_column_index;
    private int field_3_row_index;
    private Object[] field_4_constant_values;

    public CRNRecord() {
        throw new RuntimeException("incomplete code");
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return b1.A(this.field_4_constant_values) + 4;
    }

    public int getNumberOfCRNs() {
        return this.field_1_last_column_index;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 90;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeByte(this.field_1_last_column_index);
        littleEndianOutput.writeByte(this.field_2_first_column_index);
        littleEndianOutput.writeShort(this.field_3_row_index);
        b1.u(littleEndianOutput, this.field_4_constant_values);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        d.h(CRNRecord.class, stringBuffer, " [CRN rowIx=");
        stringBuffer.append(this.field_3_row_index);
        stringBuffer.append(" firstColIx=");
        stringBuffer.append(this.field_2_first_column_index);
        stringBuffer.append(" lastColIx=");
        stringBuffer.append(this.field_1_last_column_index);
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public CRNRecord(RecordInputStream recordInputStream) {
        this.field_1_last_column_index = recordInputStream.readUByte();
        this.field_2_first_column_index = recordInputStream.readUByte();
        this.field_3_row_index = recordInputStream.readShort();
        this.field_4_constant_values = b1.U(recordInputStream, (this.field_1_last_column_index - this.field_2_first_column_index) + 1);
    }
}
