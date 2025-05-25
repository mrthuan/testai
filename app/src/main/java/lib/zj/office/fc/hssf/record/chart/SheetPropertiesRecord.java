package lib.zj.office.fc.hssf.record.chart;

import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.hssf.record.StandardRecord;
import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.BitFieldFactory;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class SheetPropertiesRecord extends StandardRecord {
    public static final byte EMPTY_INTERPOLATED = 2;
    public static final byte EMPTY_NOT_PLOTTED = 0;
    public static final byte EMPTY_ZERO = 1;
    public static final short sid = 4164;
    private int field_1_flags;
    private int field_2_empty;
    private static final BitField chartTypeManuallyFormatted = BitFieldFactory.getInstance(1);
    private static final BitField plotVisibleOnly = BitFieldFactory.getInstance(2);
    private static final BitField doNotSizeWithWindow = BitFieldFactory.getInstance(4);
    private static final BitField defaultPlotDimensions = BitFieldFactory.getInstance(8);
    private static final BitField autoPlotArea = BitFieldFactory.getInstance(16);

    public SheetPropertiesRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        SheetPropertiesRecord sheetPropertiesRecord = new SheetPropertiesRecord();
        sheetPropertiesRecord.field_1_flags = this.field_1_flags;
        sheetPropertiesRecord.field_2_empty = this.field_2_empty;
        return sheetPropertiesRecord;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 4;
    }

    public int getEmpty() {
        return this.field_2_empty;
    }

    public int getFlags() {
        return this.field_1_flags;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    public boolean isAutoPlotArea() {
        return autoPlotArea.isSet(this.field_1_flags);
    }

    public boolean isChartTypeManuallyFormatted() {
        return chartTypeManuallyFormatted.isSet(this.field_1_flags);
    }

    public boolean isDefaultPlotDimensions() {
        return defaultPlotDimensions.isSet(this.field_1_flags);
    }

    public boolean isDoNotSizeWithWindow() {
        return doNotSizeWithWindow.isSet(this.field_1_flags);
    }

    public boolean isPlotVisibleOnly() {
        return plotVisibleOnly.isSet(this.field_1_flags);
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this.field_1_flags);
        littleEndianOutput.writeShort(this.field_2_empty);
    }

    public void setAutoPlotArea(boolean z10) {
        this.field_1_flags = autoPlotArea.setBoolean(this.field_1_flags, z10);
    }

    public void setChartTypeManuallyFormatted(boolean z10) {
        this.field_1_flags = chartTypeManuallyFormatted.setBoolean(this.field_1_flags, z10);
    }

    public void setDefaultPlotDimensions(boolean z10) {
        this.field_1_flags = defaultPlotDimensions.setBoolean(this.field_1_flags, z10);
    }

    public void setDoNotSizeWithWindow(boolean z10) {
        this.field_1_flags = doNotSizeWithWindow.setBoolean(this.field_1_flags, z10);
    }

    public void setEmpty(byte b10) {
        this.field_2_empty = b10;
    }

    public void setPlotVisibleOnly(boolean z10) {
        this.field_1_flags = plotVisibleOnly.setBoolean(this.field_1_flags, z10);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[SHTPROPS]\n    .flags                = ");
        stringBuffer.append(HexDump.shortToHex(this.field_1_flags));
        stringBuffer.append("\n         .chartTypeManuallyFormatted= ");
        stringBuffer.append(isChartTypeManuallyFormatted());
        stringBuffer.append("\n         .plotVisibleOnly           = ");
        stringBuffer.append(isPlotVisibleOnly());
        stringBuffer.append("\n         .doNotSizeWithWindow       = ");
        stringBuffer.append(isDoNotSizeWithWindow());
        stringBuffer.append("\n         .defaultPlotDimensions     = ");
        stringBuffer.append(isDefaultPlotDimensions());
        stringBuffer.append("\n         .autoPlotArea              = ");
        stringBuffer.append(isAutoPlotArea());
        stringBuffer.append("\n    .empty                = ");
        stringBuffer.append(HexDump.shortToHex(this.field_2_empty));
        stringBuffer.append("\n[/SHTPROPS]\n");
        return stringBuffer.toString();
    }

    public SheetPropertiesRecord(RecordInputStream recordInputStream) {
        this.field_1_flags = recordInputStream.readUShort();
        this.field_2_empty = recordInputStream.readUShort();
    }
}
