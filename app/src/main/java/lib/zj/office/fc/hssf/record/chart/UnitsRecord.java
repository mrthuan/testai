package lib.zj.office.fc.hssf.record.chart;

import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.hssf.record.StandardRecord;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class UnitsRecord extends StandardRecord {
    public static final short sid = 4097;
    private short field_1_units;

    public UnitsRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        UnitsRecord unitsRecord = new UnitsRecord();
        unitsRecord.field_1_units = this.field_1_units;
        return unitsRecord;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 2;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    public short getUnits() {
        return this.field_1_units;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this.field_1_units);
    }

    public void setUnits(short s4) {
        this.field_1_units = s4;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[UNITS]\n    .units                = 0x");
        stringBuffer.append(HexDump.toHex(getUnits()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getUnits());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("[/UNITS]\n");
        return stringBuffer.toString();
    }

    public UnitsRecord(RecordInputStream recordInputStream) {
        this.field_1_units = recordInputStream.readShort();
    }
}
