package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class SaveRecalcRecord extends StandardRecord {
    public static final short sid = 95;
    private short field_1_recalc;

    public SaveRecalcRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        SaveRecalcRecord saveRecalcRecord = new SaveRecalcRecord();
        saveRecalcRecord.field_1_recalc = this.field_1_recalc;
        return saveRecalcRecord;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 2;
    }

    public boolean getRecalc() {
        if (this.field_1_recalc == 1) {
            return true;
        }
        return false;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 95;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this.field_1_recalc);
    }

    public void setRecalc(boolean z10) {
        int i10 = 1;
        if (!z10) {
            i10 = 0;
        }
        this.field_1_recalc = (short) i10;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[SAVERECALC]\n    .recalc         = ");
        stringBuffer.append(getRecalc());
        stringBuffer.append("\n[/SAVERECALC]\n");
        return stringBuffer.toString();
    }

    public SaveRecalcRecord(RecordInputStream recordInputStream) {
        this.field_1_recalc = recordInputStream.readShort();
    }
}
