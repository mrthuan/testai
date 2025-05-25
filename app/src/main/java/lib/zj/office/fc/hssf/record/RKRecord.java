package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.hssf.util.RKUtil;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class RKRecord extends CellRecord {
    public static final short RK_IEEE_NUMBER = 0;
    public static final short RK_IEEE_NUMBER_TIMES_100 = 1;
    public static final short RK_INTEGER = 2;
    public static final short RK_INTEGER_TIMES_100 = 3;
    public static final short sid = 638;
    private int field_4_rk_number;

    private RKRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.CellRecord
    public void appendValueText(StringBuilder sb2) {
        sb2.append("  .value= ");
        sb2.append(getRKNumber());
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        RKRecord rKRecord = new RKRecord();
        copyBaseFields(rKRecord);
        rKRecord.field_4_rk_number = this.field_4_rk_number;
        return rKRecord;
    }

    public double getRKNumber() {
        return RKUtil.decodeNumber(this.field_4_rk_number);
    }

    @Override // lib.zj.office.fc.hssf.record.CellRecord
    public String getRecordName() {
        return "RK";
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    @Override // lib.zj.office.fc.hssf.record.CellRecord
    public int getValueDataSize() {
        return 4;
    }

    @Override // lib.zj.office.fc.hssf.record.CellRecord
    public void serializeValue(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeInt(this.field_4_rk_number);
    }

    public RKRecord(RecordInputStream recordInputStream) {
        super(recordInputStream);
        this.field_4_rk_number = recordInputStream.readInt();
    }
}
