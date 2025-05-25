package lib.zj.office.fc.hssf.record.chart;

import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.hssf.record.StandardRecord;
import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.BitFieldFactory;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class BarRecord extends StandardRecord {
    public static final short sid = 4119;
    private short field_1_barSpace;
    private short field_2_categorySpace;
    private short field_3_formatFlags;
    private static final BitField horizontal = BitFieldFactory.getInstance(1);
    private static final BitField stacked = BitFieldFactory.getInstance(2);
    private static final BitField displayAsPercentage = BitFieldFactory.getInstance(4);
    private static final BitField shadow = BitFieldFactory.getInstance(8);

    public BarRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        BarRecord barRecord = new BarRecord();
        barRecord.field_1_barSpace = this.field_1_barSpace;
        barRecord.field_2_categorySpace = this.field_2_categorySpace;
        barRecord.field_3_formatFlags = this.field_3_formatFlags;
        return barRecord;
    }

    public short getBarSpace() {
        return this.field_1_barSpace;
    }

    public short getCategorySpace() {
        return this.field_2_categorySpace;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 6;
    }

    public short getFormatFlags() {
        return this.field_3_formatFlags;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    public boolean isDisplayAsPercentage() {
        return displayAsPercentage.isSet(this.field_3_formatFlags);
    }

    public boolean isHorizontal() {
        return horizontal.isSet(this.field_3_formatFlags);
    }

    public boolean isShadow() {
        return shadow.isSet(this.field_3_formatFlags);
    }

    public boolean isStacked() {
        return stacked.isSet(this.field_3_formatFlags);
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this.field_1_barSpace);
        littleEndianOutput.writeShort(this.field_2_categorySpace);
        littleEndianOutput.writeShort(this.field_3_formatFlags);
    }

    public void setBarSpace(short s4) {
        this.field_1_barSpace = s4;
    }

    public void setCategorySpace(short s4) {
        this.field_2_categorySpace = s4;
    }

    public void setDisplayAsPercentage(boolean z10) {
        this.field_3_formatFlags = displayAsPercentage.setShortBoolean(this.field_3_formatFlags, z10);
    }

    public void setFormatFlags(short s4) {
        this.field_3_formatFlags = s4;
    }

    public void setHorizontal(boolean z10) {
        this.field_3_formatFlags = horizontal.setShortBoolean(this.field_3_formatFlags, z10);
    }

    public void setShadow(boolean z10) {
        this.field_3_formatFlags = shadow.setShortBoolean(this.field_3_formatFlags, z10);
    }

    public void setStacked(boolean z10) {
        this.field_3_formatFlags = stacked.setShortBoolean(this.field_3_formatFlags, z10);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[BAR]\n    .barSpace             = 0x");
        stringBuffer.append(HexDump.toHex(getBarSpace()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getBarSpace());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .categorySpace        = 0x");
        stringBuffer.append(HexDump.toHex(getCategorySpace()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getCategorySpace());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .formatFlags          = 0x");
        stringBuffer.append(HexDump.toHex(getFormatFlags()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getFormatFlags());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("         .horizontal               = ");
        stringBuffer.append(isHorizontal());
        stringBuffer.append("\n         .stacked                  = ");
        stringBuffer.append(isStacked());
        stringBuffer.append("\n         .displayAsPercentage      = ");
        stringBuffer.append(isDisplayAsPercentage());
        stringBuffer.append("\n         .shadow                   = ");
        stringBuffer.append(isShadow());
        stringBuffer.append("\n[/BAR]\n");
        return stringBuffer.toString();
    }

    public BarRecord(RecordInputStream recordInputStream) {
        this.field_1_barSpace = recordInputStream.readShort();
        this.field_2_categorySpace = recordInputStream.readShort();
        this.field_3_formatFlags = recordInputStream.readShort();
    }
}
