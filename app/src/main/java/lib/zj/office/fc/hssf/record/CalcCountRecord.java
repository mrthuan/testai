package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class CalcCountRecord extends StandardRecord {
    public static final short sid = 12;
    private short field_1_iterations;

    public CalcCountRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        CalcCountRecord calcCountRecord = new CalcCountRecord();
        calcCountRecord.field_1_iterations = this.field_1_iterations;
        return calcCountRecord;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 2;
    }

    public short getIterations() {
        return this.field_1_iterations;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 12;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(getIterations());
    }

    public void setIterations(short s4) {
        this.field_1_iterations = s4;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[CALCCOUNT]\n    .iterations     = ");
        stringBuffer.append(Integer.toHexString(getIterations()));
        stringBuffer.append("\n[/CALCCOUNT]\n");
        return stringBuffer.toString();
    }

    public CalcCountRecord(RecordInputStream recordInputStream) {
        this.field_1_iterations = recordInputStream.readShort();
    }
}
