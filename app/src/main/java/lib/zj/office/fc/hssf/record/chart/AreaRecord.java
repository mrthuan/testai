package lib.zj.office.fc.hssf.record.chart;

import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.hssf.record.StandardRecord;
import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.BitFieldFactory;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class AreaRecord extends StandardRecord {
    public static final short sid = 4122;
    private short field_1_formatFlags;
    private static final BitField stacked = BitFieldFactory.getInstance(1);
    private static final BitField displayAsPercentage = BitFieldFactory.getInstance(2);
    private static final BitField shadow = BitFieldFactory.getInstance(4);

    public AreaRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        AreaRecord areaRecord = new AreaRecord();
        areaRecord.field_1_formatFlags = this.field_1_formatFlags;
        return areaRecord;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 2;
    }

    public short getFormatFlags() {
        return this.field_1_formatFlags;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    public boolean isDisplayAsPercentage() {
        return displayAsPercentage.isSet(this.field_1_formatFlags);
    }

    public boolean isShadow() {
        return shadow.isSet(this.field_1_formatFlags);
    }

    public boolean isStacked() {
        return stacked.isSet(this.field_1_formatFlags);
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this.field_1_formatFlags);
    }

    public void setDisplayAsPercentage(boolean z10) {
        this.field_1_formatFlags = displayAsPercentage.setShortBoolean(this.field_1_formatFlags, z10);
    }

    public void setFormatFlags(short s4) {
        this.field_1_formatFlags = s4;
    }

    public void setShadow(boolean z10) {
        this.field_1_formatFlags = shadow.setShortBoolean(this.field_1_formatFlags, z10);
    }

    public void setStacked(boolean z10) {
        this.field_1_formatFlags = stacked.setShortBoolean(this.field_1_formatFlags, z10);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[AREA]\n    .formatFlags          = 0x");
        stringBuffer.append(HexDump.toHex(getFormatFlags()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getFormatFlags());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("         .stacked                  = ");
        stringBuffer.append(isStacked());
        stringBuffer.append("\n         .displayAsPercentage      = ");
        stringBuffer.append(isDisplayAsPercentage());
        stringBuffer.append("\n         .shadow                   = ");
        stringBuffer.append(isShadow());
        stringBuffer.append("\n[/AREA]\n");
        return stringBuffer.toString();
    }

    public AreaRecord(RecordInputStream recordInputStream) {
        this.field_1_formatFlags = recordInputStream.readShort();
    }
}
