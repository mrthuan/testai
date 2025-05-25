package lib.zj.office.fc.hssf.record.chart;

import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.hssf.record.StandardRecord;
import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.BitFieldFactory;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class LineFormatRecord extends StandardRecord {
    public static final short LINE_PATTERN_DARK_GRAY_PATTERN = 6;
    public static final short LINE_PATTERN_DASH = 1;
    public static final short LINE_PATTERN_DASH_DOT = 3;
    public static final short LINE_PATTERN_DASH_DOT_DOT = 4;
    public static final short LINE_PATTERN_DOT = 2;
    public static final short LINE_PATTERN_LIGHT_GRAY_PATTERN = 8;
    public static final short LINE_PATTERN_MEDIUM_GRAY_PATTERN = 7;
    public static final short LINE_PATTERN_NONE = 5;
    public static final short LINE_PATTERN_SOLID = 0;
    public static final short WEIGHT_HAIRLINE = -1;
    public static final short WEIGHT_MEDIUM = 1;
    public static final short WEIGHT_NARROW = 0;
    public static final short WEIGHT_WIDE = 2;
    public static final short sid = 4103;
    private int field_1_lineColor;
    private short field_2_linePattern;
    private short field_3_weight;
    private short field_4_format;
    private short field_5_colourPaletteIndex;
    private static final BitField auto = BitFieldFactory.getInstance(1);
    private static final BitField drawTicks = BitFieldFactory.getInstance(4);
    private static final BitField unknown = BitFieldFactory.getInstance(4);

    public LineFormatRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        LineFormatRecord lineFormatRecord = new LineFormatRecord();
        lineFormatRecord.field_1_lineColor = this.field_1_lineColor;
        lineFormatRecord.field_2_linePattern = this.field_2_linePattern;
        lineFormatRecord.field_3_weight = this.field_3_weight;
        lineFormatRecord.field_4_format = this.field_4_format;
        lineFormatRecord.field_5_colourPaletteIndex = this.field_5_colourPaletteIndex;
        return lineFormatRecord;
    }

    public short getColourPaletteIndex() {
        return this.field_5_colourPaletteIndex;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 12;
    }

    public short getFormat() {
        return this.field_4_format;
    }

    public int getLineColor() {
        return this.field_1_lineColor;
    }

    public short getLinePattern() {
        return this.field_2_linePattern;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    public short getWeight() {
        return this.field_3_weight;
    }

    public boolean isAuto() {
        return auto.isSet(this.field_4_format);
    }

    public boolean isDrawTicks() {
        return drawTicks.isSet(this.field_4_format);
    }

    public boolean isUnknown() {
        return unknown.isSet(this.field_4_format);
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeInt(this.field_1_lineColor);
        littleEndianOutput.writeShort(this.field_2_linePattern);
        littleEndianOutput.writeShort(this.field_3_weight);
        littleEndianOutput.writeShort(this.field_4_format);
        littleEndianOutput.writeShort(this.field_5_colourPaletteIndex);
    }

    public void setAuto(boolean z10) {
        this.field_4_format = auto.setShortBoolean(this.field_4_format, z10);
    }

    public void setColourPaletteIndex(short s4) {
        this.field_5_colourPaletteIndex = s4;
    }

    public void setDrawTicks(boolean z10) {
        this.field_4_format = drawTicks.setShortBoolean(this.field_4_format, z10);
    }

    public void setFormat(short s4) {
        this.field_4_format = s4;
    }

    public void setLineColor(int i10) {
        this.field_1_lineColor = i10;
    }

    public void setLinePattern(short s4) {
        this.field_2_linePattern = s4;
    }

    public void setUnknown(boolean z10) {
        this.field_4_format = unknown.setShortBoolean(this.field_4_format, z10);
    }

    public void setWeight(short s4) {
        this.field_3_weight = s4;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[LINEFORMAT]\n    .lineColor            = 0x");
        stringBuffer.append(HexDump.toHex(getLineColor()));
        stringBuffer.append(" (");
        stringBuffer.append(getLineColor());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .linePattern          = 0x");
        stringBuffer.append(HexDump.toHex(getLinePattern()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getLinePattern());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .weight               = 0x");
        stringBuffer.append(HexDump.toHex(getWeight()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getWeight());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .format               = 0x");
        stringBuffer.append(HexDump.toHex(getFormat()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getFormat());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("         .auto                     = ");
        stringBuffer.append(isAuto());
        stringBuffer.append("\n         .drawTicks                = ");
        stringBuffer.append(isDrawTicks());
        stringBuffer.append("\n         .unknown                  = ");
        stringBuffer.append(isUnknown());
        stringBuffer.append("\n    .colourPaletteIndex   = 0x");
        stringBuffer.append(HexDump.toHex(getColourPaletteIndex()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getColourPaletteIndex());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("[/LINEFORMAT]\n");
        return stringBuffer.toString();
    }

    public LineFormatRecord(RecordInputStream recordInputStream) {
        this.field_1_lineColor = recordInputStream.readInt();
        this.field_2_linePattern = recordInputStream.readShort();
        this.field_3_weight = recordInputStream.readShort();
        this.field_4_format = recordInputStream.readShort();
        this.field_5_colourPaletteIndex = recordInputStream.readShort();
    }
}
