package lib.zj.office.fc.hssf.record.chart;

import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.hssf.record.StandardRecord;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class AxisUsedRecord extends StandardRecord {
    public static final short sid = 4166;
    private short field_1_numAxis;

    public AxisUsedRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        AxisUsedRecord axisUsedRecord = new AxisUsedRecord();
        axisUsedRecord.field_1_numAxis = this.field_1_numAxis;
        return axisUsedRecord;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 2;
    }

    public short getNumAxis() {
        return this.field_1_numAxis;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this.field_1_numAxis);
    }

    public void setNumAxis(short s4) {
        this.field_1_numAxis = s4;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[AXISUSED]\n    .numAxis              = 0x");
        stringBuffer.append(HexDump.toHex(getNumAxis()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getNumAxis());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("[/AXISUSED]\n");
        return stringBuffer.toString();
    }

    public AxisUsedRecord(RecordInputStream recordInputStream) {
        this.field_1_numAxis = recordInputStream.readShort();
    }
}
