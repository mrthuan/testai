package lib.zj.office.fc.hssf.record.chart;

import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.hssf.record.StandardRecord;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class SeriesIndexRecord extends StandardRecord {
    public static final short sid = 4197;
    private short field_1_index;

    public SeriesIndexRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        SeriesIndexRecord seriesIndexRecord = new SeriesIndexRecord();
        seriesIndexRecord.field_1_index = this.field_1_index;
        return seriesIndexRecord;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 2;
    }

    public short getIndex() {
        return this.field_1_index;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this.field_1_index);
    }

    public void setIndex(short s4) {
        this.field_1_index = s4;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[SINDEX]\n    .index                = 0x");
        stringBuffer.append(HexDump.toHex(getIndex()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getIndex());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("[/SINDEX]\n");
        return stringBuffer.toString();
    }

    public SeriesIndexRecord(RecordInputStream recordInputStream) {
        this.field_1_index = recordInputStream.readShort();
    }
}
