package lib.zj.office.fc.hssf.record.chart;

import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.hssf.record.StandardRecord;
import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.BitFieldFactory;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class AreaFormatRecord extends StandardRecord {
    private static final BitField automatic = BitFieldFactory.getInstance(1);
    private static final BitField invert = BitFieldFactory.getInstance(2);
    public static final short sid = 4106;
    private int field_1_foregroundColor;
    private int field_2_backgroundColor;
    private short field_3_pattern;
    private short field_4_formatFlags;
    private short field_5_forecolorIndex;
    private short field_6_backcolorIndex;

    public AreaFormatRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        AreaFormatRecord areaFormatRecord = new AreaFormatRecord();
        areaFormatRecord.field_1_foregroundColor = this.field_1_foregroundColor;
        areaFormatRecord.field_2_backgroundColor = this.field_2_backgroundColor;
        areaFormatRecord.field_3_pattern = this.field_3_pattern;
        areaFormatRecord.field_4_formatFlags = this.field_4_formatFlags;
        areaFormatRecord.field_5_forecolorIndex = this.field_5_forecolorIndex;
        areaFormatRecord.field_6_backcolorIndex = this.field_6_backcolorIndex;
        return areaFormatRecord;
    }

    public short getBackcolorIndex() {
        return this.field_6_backcolorIndex;
    }

    public int getBackgroundColor() {
        return this.field_2_backgroundColor;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 16;
    }

    public short getForecolorIndex() {
        return this.field_5_forecolorIndex;
    }

    public int getForegroundColor() {
        return this.field_1_foregroundColor;
    }

    public short getFormatFlags() {
        return this.field_4_formatFlags;
    }

    public short getPattern() {
        return this.field_3_pattern;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    public boolean isAutomatic() {
        return automatic.isSet(this.field_4_formatFlags);
    }

    public boolean isInvert() {
        return invert.isSet(this.field_4_formatFlags);
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeInt(this.field_1_foregroundColor);
        littleEndianOutput.writeInt(this.field_2_backgroundColor);
        littleEndianOutput.writeShort(this.field_3_pattern);
        littleEndianOutput.writeShort(this.field_4_formatFlags);
        littleEndianOutput.writeShort(this.field_5_forecolorIndex);
        littleEndianOutput.writeShort(this.field_6_backcolorIndex);
    }

    public void setAutomatic(boolean z10) {
        this.field_4_formatFlags = automatic.setShortBoolean(this.field_4_formatFlags, z10);
    }

    public void setBackcolorIndex(short s4) {
        this.field_6_backcolorIndex = s4;
    }

    public void setBackgroundColor(int i10) {
        this.field_2_backgroundColor = i10;
    }

    public void setForecolorIndex(short s4) {
        this.field_5_forecolorIndex = s4;
    }

    public void setForegroundColor(int i10) {
        this.field_1_foregroundColor = i10;
    }

    public void setFormatFlags(short s4) {
        this.field_4_formatFlags = s4;
    }

    public void setInvert(boolean z10) {
        this.field_4_formatFlags = invert.setShortBoolean(this.field_4_formatFlags, z10);
    }

    public void setPattern(short s4) {
        this.field_3_pattern = s4;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[AREAFORMAT]\n    .foregroundColor      = 0x");
        stringBuffer.append(HexDump.toHex(getForegroundColor()));
        stringBuffer.append(" (");
        stringBuffer.append(getForegroundColor());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .backgroundColor      = 0x");
        stringBuffer.append(HexDump.toHex(getBackgroundColor()));
        stringBuffer.append(" (");
        stringBuffer.append(getBackgroundColor());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .pattern              = 0x");
        stringBuffer.append(HexDump.toHex(getPattern()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getPattern());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .formatFlags          = 0x");
        stringBuffer.append(HexDump.toHex(getFormatFlags()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getFormatFlags());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("         .automatic                = ");
        stringBuffer.append(isAutomatic());
        stringBuffer.append("\n         .invert                   = ");
        stringBuffer.append(isInvert());
        stringBuffer.append("\n    .forecolorIndex       = 0x");
        stringBuffer.append(HexDump.toHex(getForecolorIndex()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getForecolorIndex());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .backcolorIndex       = 0x");
        stringBuffer.append(HexDump.toHex(getBackcolorIndex()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getBackcolorIndex());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("[/AREAFORMAT]\n");
        return stringBuffer.toString();
    }

    public AreaFormatRecord(RecordInputStream recordInputStream) {
        this.field_1_foregroundColor = recordInputStream.readInt();
        this.field_2_backgroundColor = recordInputStream.readInt();
        this.field_3_pattern = recordInputStream.readShort();
        this.field_4_formatFlags = recordInputStream.readShort();
        this.field_5_forecolorIndex = recordInputStream.readShort();
        this.field_6_backcolorIndex = recordInputStream.readShort();
    }
}
