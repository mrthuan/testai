package lib.zj.office.fc.hssf.record.chart;

import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.hssf.record.StandardRecord;
import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.BitFieldFactory;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class LegendRecord extends StandardRecord {
    public static final byte SPACING_CLOSE = 0;
    public static final byte SPACING_MEDIUM = 1;
    public static final byte SPACING_OPEN = 2;
    public static final byte TYPE_BOTTOM = 0;
    public static final byte TYPE_CORNER = 1;
    public static final byte TYPE_LEFT = 4;
    public static final byte TYPE_RIGHT = 3;
    public static final byte TYPE_TOP = 2;
    public static final byte TYPE_UNDOCKED = 7;
    public static final short sid = 4117;
    private int field_1_xAxisUpperLeft;
    private int field_2_yAxisUpperLeft;
    private int field_3_xSize;
    private int field_4_ySize;
    private byte field_5_type;
    private byte field_6_spacing;
    private short field_7_options;
    private static final BitField autoPosition = BitFieldFactory.getInstance(1);
    private static final BitField autoSeries = BitFieldFactory.getInstance(2);
    private static final BitField autoXPositioning = BitFieldFactory.getInstance(4);
    private static final BitField autoYPositioning = BitFieldFactory.getInstance(8);
    private static final BitField vertical = BitFieldFactory.getInstance(16);
    private static final BitField dataTable = BitFieldFactory.getInstance(32);

    public LegendRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        LegendRecord legendRecord = new LegendRecord();
        legendRecord.field_1_xAxisUpperLeft = this.field_1_xAxisUpperLeft;
        legendRecord.field_2_yAxisUpperLeft = this.field_2_yAxisUpperLeft;
        legendRecord.field_3_xSize = this.field_3_xSize;
        legendRecord.field_4_ySize = this.field_4_ySize;
        legendRecord.field_5_type = this.field_5_type;
        legendRecord.field_6_spacing = this.field_6_spacing;
        legendRecord.field_7_options = this.field_7_options;
        return legendRecord;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 20;
    }

    public short getOptions() {
        return this.field_7_options;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    public byte getSpacing() {
        return this.field_6_spacing;
    }

    public byte getType() {
        return this.field_5_type;
    }

    public int getXAxisUpperLeft() {
        return this.field_1_xAxisUpperLeft;
    }

    public int getXSize() {
        return this.field_3_xSize;
    }

    public int getYAxisUpperLeft() {
        return this.field_2_yAxisUpperLeft;
    }

    public int getYSize() {
        return this.field_4_ySize;
    }

    public boolean isAutoPosition() {
        return autoPosition.isSet(this.field_7_options);
    }

    public boolean isAutoSeries() {
        return autoSeries.isSet(this.field_7_options);
    }

    public boolean isAutoXPositioning() {
        return autoXPositioning.isSet(this.field_7_options);
    }

    public boolean isAutoYPositioning() {
        return autoYPositioning.isSet(this.field_7_options);
    }

    public boolean isDataTable() {
        return dataTable.isSet(this.field_7_options);
    }

    public boolean isVertical() {
        return vertical.isSet(this.field_7_options);
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeInt(this.field_1_xAxisUpperLeft);
        littleEndianOutput.writeInt(this.field_2_yAxisUpperLeft);
        littleEndianOutput.writeInt(this.field_3_xSize);
        littleEndianOutput.writeInt(this.field_4_ySize);
        littleEndianOutput.writeByte(this.field_5_type);
        littleEndianOutput.writeByte(this.field_6_spacing);
        littleEndianOutput.writeShort(this.field_7_options);
    }

    public void setAutoPosition(boolean z10) {
        this.field_7_options = autoPosition.setShortBoolean(this.field_7_options, z10);
    }

    public void setAutoSeries(boolean z10) {
        this.field_7_options = autoSeries.setShortBoolean(this.field_7_options, z10);
    }

    public void setAutoXPositioning(boolean z10) {
        this.field_7_options = autoXPositioning.setShortBoolean(this.field_7_options, z10);
    }

    public void setAutoYPositioning(boolean z10) {
        this.field_7_options = autoYPositioning.setShortBoolean(this.field_7_options, z10);
    }

    public void setDataTable(boolean z10) {
        this.field_7_options = dataTable.setShortBoolean(this.field_7_options, z10);
    }

    public void setOptions(short s4) {
        this.field_7_options = s4;
    }

    public void setSpacing(byte b10) {
        this.field_6_spacing = b10;
    }

    public void setType(byte b10) {
        this.field_5_type = b10;
    }

    public void setVertical(boolean z10) {
        this.field_7_options = vertical.setShortBoolean(this.field_7_options, z10);
    }

    public void setXAxisUpperLeft(int i10) {
        this.field_1_xAxisUpperLeft = i10;
    }

    public void setXSize(int i10) {
        this.field_3_xSize = i10;
    }

    public void setYAxisUpperLeft(int i10) {
        this.field_2_yAxisUpperLeft = i10;
    }

    public void setYSize(int i10) {
        this.field_4_ySize = i10;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[LEGEND]\n    .xAxisUpperLeft       = 0x");
        stringBuffer.append(HexDump.toHex(getXAxisUpperLeft()));
        stringBuffer.append(" (");
        stringBuffer.append(getXAxisUpperLeft());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .yAxisUpperLeft       = 0x");
        stringBuffer.append(HexDump.toHex(getYAxisUpperLeft()));
        stringBuffer.append(" (");
        stringBuffer.append(getYAxisUpperLeft());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .xSize                = 0x");
        stringBuffer.append(HexDump.toHex(getXSize()));
        stringBuffer.append(" (");
        stringBuffer.append(getXSize());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .ySize                = 0x");
        stringBuffer.append(HexDump.toHex(getYSize()));
        stringBuffer.append(" (");
        stringBuffer.append(getYSize());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .type                 = 0x");
        stringBuffer.append(HexDump.toHex(getType()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getType());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .spacing              = 0x");
        stringBuffer.append(HexDump.toHex(getSpacing()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getSpacing());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .options              = 0x");
        stringBuffer.append(HexDump.toHex(getOptions()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getOptions());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("         .autoPosition             = ");
        stringBuffer.append(isAutoPosition());
        stringBuffer.append("\n         .autoSeries               = ");
        stringBuffer.append(isAutoSeries());
        stringBuffer.append("\n         .autoXPositioning         = ");
        stringBuffer.append(isAutoXPositioning());
        stringBuffer.append("\n         .autoYPositioning         = ");
        stringBuffer.append(isAutoYPositioning());
        stringBuffer.append("\n         .vertical                 = ");
        stringBuffer.append(isVertical());
        stringBuffer.append("\n         .dataTable                = ");
        stringBuffer.append(isDataTable());
        stringBuffer.append("\n[/LEGEND]\n");
        return stringBuffer.toString();
    }

    public LegendRecord(RecordInputStream recordInputStream) {
        this.field_1_xAxisUpperLeft = recordInputStream.readInt();
        this.field_2_yAxisUpperLeft = recordInputStream.readInt();
        this.field_3_xSize = recordInputStream.readInt();
        this.field_4_ySize = recordInputStream.readInt();
        this.field_5_type = recordInputStream.readByte();
        this.field_6_spacing = recordInputStream.readByte();
        this.field_7_options = recordInputStream.readShort();
    }
}
