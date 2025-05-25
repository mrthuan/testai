package lib.zj.office.fc.hssf.record.chart;

import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.hssf.record.StandardRecord;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class SeriesToChartGroupRecord extends StandardRecord {
    public static final short sid = 4165;
    private short field_1_chartGroupIndex;

    public SeriesToChartGroupRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        SeriesToChartGroupRecord seriesToChartGroupRecord = new SeriesToChartGroupRecord();
        seriesToChartGroupRecord.field_1_chartGroupIndex = this.field_1_chartGroupIndex;
        return seriesToChartGroupRecord;
    }

    public short getChartGroupIndex() {
        return this.field_1_chartGroupIndex;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 2;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 4165;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this.field_1_chartGroupIndex);
    }

    public void setChartGroupIndex(short s4) {
        this.field_1_chartGroupIndex = s4;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[SeriesToChartGroup]\n    .chartGroupIndex      = 0x");
        stringBuffer.append(HexDump.toHex(getChartGroupIndex()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getChartGroupIndex());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("[/SeriesToChartGroup]\n");
        return stringBuffer.toString();
    }

    public SeriesToChartGroupRecord(RecordInputStream recordInputStream) {
        this.field_1_chartGroupIndex = recordInputStream.readShort();
    }
}
