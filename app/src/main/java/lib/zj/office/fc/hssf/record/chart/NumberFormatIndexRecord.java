package lib.zj.office.fc.hssf.record.chart;

import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.hssf.record.StandardRecord;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class NumberFormatIndexRecord extends StandardRecord {
    public static final short sid = 4174;
    private short field_1_formatIndex;

    public NumberFormatIndexRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        NumberFormatIndexRecord numberFormatIndexRecord = new NumberFormatIndexRecord();
        numberFormatIndexRecord.field_1_formatIndex = this.field_1_formatIndex;
        return numberFormatIndexRecord;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 2;
    }

    public short getFormatIndex() {
        return this.field_1_formatIndex;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this.field_1_formatIndex);
    }

    public void setFormatIndex(short s4) {
        this.field_1_formatIndex = s4;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[IFMT]\n    .formatIndex          = 0x");
        stringBuffer.append(HexDump.toHex(getFormatIndex()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getFormatIndex());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("[/IFMT]\n");
        return stringBuffer.toString();
    }

    public NumberFormatIndexRecord(RecordInputStream recordInputStream) {
        this.field_1_formatIndex = recordInputStream.readShort();
    }
}
