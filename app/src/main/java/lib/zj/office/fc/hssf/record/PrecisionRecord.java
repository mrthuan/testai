package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class PrecisionRecord extends StandardRecord {
    public static final short sid = 14;
    public short field_1_precision;

    public PrecisionRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 2;
    }

    public boolean getFullPrecision() {
        if (this.field_1_precision == 1) {
            return true;
        }
        return false;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 14;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this.field_1_precision);
    }

    public void setFullPrecision(boolean z10) {
        if (z10) {
            this.field_1_precision = (short) 1;
        } else {
            this.field_1_precision = (short) 0;
        }
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[PRECISION]\n    .precision       = ");
        stringBuffer.append(getFullPrecision());
        stringBuffer.append("\n[/PRECISION]\n");
        return stringBuffer.toString();
    }

    public PrecisionRecord(RecordInputStream recordInputStream) {
        this.field_1_precision = recordInputStream.readShort();
    }
}
