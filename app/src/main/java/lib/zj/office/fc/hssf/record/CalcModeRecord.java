package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class CalcModeRecord extends StandardRecord {
    public static final short AUTOMATIC = 1;
    public static final short AUTOMATIC_EXCEPT_TABLES = -1;
    public static final short MANUAL = 0;
    public static final short sid = 13;
    private short field_1_calcmode;

    public CalcModeRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        CalcModeRecord calcModeRecord = new CalcModeRecord();
        calcModeRecord.field_1_calcmode = this.field_1_calcmode;
        return calcModeRecord;
    }

    public short getCalcMode() {
        return this.field_1_calcmode;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 2;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 13;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(getCalcMode());
    }

    public void setCalcMode(short s4) {
        this.field_1_calcmode = s4;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[CALCMODE]\n    .calcmode       = ");
        stringBuffer.append(Integer.toHexString(getCalcMode()));
        stringBuffer.append("\n[/CALCMODE]\n");
        return stringBuffer.toString();
    }

    public CalcModeRecord(RecordInputStream recordInputStream) {
        this.field_1_calcmode = recordInputStream.readShort();
    }
}
