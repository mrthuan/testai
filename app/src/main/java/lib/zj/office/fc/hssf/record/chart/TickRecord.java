package lib.zj.office.fc.hssf.record.chart;

import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.hssf.record.StandardRecord;
import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.BitFieldFactory;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class TickRecord extends StandardRecord {
    public static final short sid = 4126;
    private short field_10_options;
    private short field_11_tickColor;
    private short field_12_zero5;
    private byte field_1_majorTickType;
    private byte field_2_minorTickType;
    private byte field_3_labelPosition;
    private byte field_4_background;
    private int field_5_labelColorRgb;
    private int field_6_zero1;
    private int field_7_zero2;
    private int field_8_zero3;
    private int field_9_zero4;
    private static final BitField autoTextColor = BitFieldFactory.getInstance(1);
    private static final BitField autoTextBackground = BitFieldFactory.getInstance(2);
    private static final BitField rotation = BitFieldFactory.getInstance(28);
    private static final BitField autorotate = BitFieldFactory.getInstance(32);

    public TickRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        TickRecord tickRecord = new TickRecord();
        tickRecord.field_1_majorTickType = this.field_1_majorTickType;
        tickRecord.field_2_minorTickType = this.field_2_minorTickType;
        tickRecord.field_3_labelPosition = this.field_3_labelPosition;
        tickRecord.field_4_background = this.field_4_background;
        tickRecord.field_5_labelColorRgb = this.field_5_labelColorRgb;
        tickRecord.field_6_zero1 = this.field_6_zero1;
        tickRecord.field_7_zero2 = this.field_7_zero2;
        tickRecord.field_8_zero3 = this.field_8_zero3;
        tickRecord.field_9_zero4 = this.field_9_zero4;
        tickRecord.field_10_options = this.field_10_options;
        tickRecord.field_11_tickColor = this.field_11_tickColor;
        tickRecord.field_12_zero5 = this.field_12_zero5;
        return tickRecord;
    }

    public byte getBackground() {
        return this.field_4_background;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 30;
    }

    public int getLabelColorRgb() {
        return this.field_5_labelColorRgb;
    }

    public byte getLabelPosition() {
        return this.field_3_labelPosition;
    }

    public byte getMajorTickType() {
        return this.field_1_majorTickType;
    }

    public byte getMinorTickType() {
        return this.field_2_minorTickType;
    }

    public short getOptions() {
        return this.field_10_options;
    }

    public short getRotation() {
        return rotation.getShortValue(this.field_10_options);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    public short getTickColor() {
        return this.field_11_tickColor;
    }

    public int getZero1() {
        return this.field_6_zero1;
    }

    public int getZero2() {
        return this.field_7_zero2;
    }

    public short getZero3() {
        return this.field_12_zero5;
    }

    public boolean isAutoTextBackground() {
        return autoTextBackground.isSet(this.field_10_options);
    }

    public boolean isAutoTextColor() {
        return autoTextColor.isSet(this.field_10_options);
    }

    public boolean isAutorotate() {
        return autorotate.isSet(this.field_10_options);
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeByte(this.field_1_majorTickType);
        littleEndianOutput.writeByte(this.field_2_minorTickType);
        littleEndianOutput.writeByte(this.field_3_labelPosition);
        littleEndianOutput.writeByte(this.field_4_background);
        littleEndianOutput.writeInt(this.field_5_labelColorRgb);
        littleEndianOutput.writeInt(this.field_6_zero1);
        littleEndianOutput.writeInt(this.field_7_zero2);
        littleEndianOutput.writeInt(this.field_8_zero3);
        littleEndianOutput.writeInt(this.field_9_zero4);
        littleEndianOutput.writeShort(this.field_10_options);
        littleEndianOutput.writeShort(this.field_11_tickColor);
        littleEndianOutput.writeShort(this.field_12_zero5);
    }

    public void setAutoTextBackground(boolean z10) {
        this.field_10_options = autoTextBackground.setShortBoolean(this.field_10_options, z10);
    }

    public void setAutoTextColor(boolean z10) {
        this.field_10_options = autoTextColor.setShortBoolean(this.field_10_options, z10);
    }

    public void setAutorotate(boolean z10) {
        this.field_10_options = autorotate.setShortBoolean(this.field_10_options, z10);
    }

    public void setBackground(byte b10) {
        this.field_4_background = b10;
    }

    public void setLabelColorRgb(int i10) {
        this.field_5_labelColorRgb = i10;
    }

    public void setLabelPosition(byte b10) {
        this.field_3_labelPosition = b10;
    }

    public void setMajorTickType(byte b10) {
        this.field_1_majorTickType = b10;
    }

    public void setMinorTickType(byte b10) {
        this.field_2_minorTickType = b10;
    }

    public void setOptions(short s4) {
        this.field_10_options = s4;
    }

    public void setRotation(short s4) {
        this.field_10_options = rotation.setShortValue(this.field_10_options, s4);
    }

    public void setTickColor(short s4) {
        this.field_11_tickColor = s4;
    }

    public void setZero1(int i10) {
        this.field_6_zero1 = i10;
    }

    public void setZero2(int i10) {
        this.field_7_zero2 = i10;
    }

    public void setZero3(short s4) {
        this.field_12_zero5 = s4;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[TICK]\n    .majorTickType        = 0x");
        stringBuffer.append(HexDump.toHex(getMajorTickType()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getMajorTickType());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .minorTickType        = 0x");
        stringBuffer.append(HexDump.toHex(getMinorTickType()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getMinorTickType());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .labelPosition        = 0x");
        stringBuffer.append(HexDump.toHex(getLabelPosition()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getLabelPosition());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .background           = 0x");
        stringBuffer.append(HexDump.toHex(getBackground()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getBackground());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .labelColorRgb        = 0x");
        stringBuffer.append(HexDump.toHex(getLabelColorRgb()));
        stringBuffer.append(" (");
        stringBuffer.append(getLabelColorRgb());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .zero1                = 0x");
        stringBuffer.append(HexDump.toHex(getZero1()));
        stringBuffer.append(" (");
        stringBuffer.append(getZero1());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .zero2                = 0x");
        stringBuffer.append(HexDump.toHex(getZero2()));
        stringBuffer.append(" (");
        stringBuffer.append(getZero2());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .options              = 0x");
        stringBuffer.append(HexDump.toHex(getOptions()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getOptions());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("         .autoTextColor            = ");
        stringBuffer.append(isAutoTextColor());
        stringBuffer.append("\n         .autoTextBackground       = ");
        stringBuffer.append(isAutoTextBackground());
        stringBuffer.append("\n         .rotation                 = ");
        stringBuffer.append((int) getRotation());
        stringBuffer.append("\n         .autorotate               = ");
        stringBuffer.append(isAutorotate());
        stringBuffer.append("\n    .tickColor            = 0x");
        stringBuffer.append(HexDump.toHex(getTickColor()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getTickColor());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .zero3                = 0x");
        stringBuffer.append(HexDump.toHex(getZero3()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getZero3());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("[/TICK]\n");
        return stringBuffer.toString();
    }

    public TickRecord(RecordInputStream recordInputStream) {
        this.field_1_majorTickType = recordInputStream.readByte();
        this.field_2_minorTickType = recordInputStream.readByte();
        this.field_3_labelPosition = recordInputStream.readByte();
        this.field_4_background = recordInputStream.readByte();
        this.field_5_labelColorRgb = recordInputStream.readInt();
        this.field_6_zero1 = recordInputStream.readInt();
        this.field_7_zero2 = recordInputStream.readInt();
        this.field_8_zero3 = recordInputStream.readInt();
        this.field_9_zero4 = recordInputStream.readInt();
        this.field_10_options = recordInputStream.readShort();
        this.field_11_tickColor = recordInputStream.readShort();
        this.field_12_zero5 = recordInputStream.readShort();
    }
}
