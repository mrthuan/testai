package lib.zj.office.fc.hssf.record.chart;

import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.hssf.record.StandardRecord;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class FontIndexRecord extends StandardRecord {
    public static final short sid = 4134;
    private short field_1_fontIndex;

    public FontIndexRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        FontIndexRecord fontIndexRecord = new FontIndexRecord();
        fontIndexRecord.field_1_fontIndex = this.field_1_fontIndex;
        return fontIndexRecord;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 2;
    }

    public short getFontIndex() {
        return this.field_1_fontIndex;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this.field_1_fontIndex);
    }

    public void setFontIndex(short s4) {
        this.field_1_fontIndex = s4;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[FONTX]\n    .fontIndex            = 0x");
        stringBuffer.append(HexDump.toHex(getFontIndex()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getFontIndex());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("[/FONTX]\n");
        return stringBuffer.toString();
    }

    public FontIndexRecord(RecordInputStream recordInputStream) {
        this.field_1_fontIndex = recordInputStream.readShort();
    }
}
