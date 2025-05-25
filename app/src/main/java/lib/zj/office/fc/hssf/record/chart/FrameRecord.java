package lib.zj.office.fc.hssf.record.chart;

import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.hssf.record.StandardRecord;
import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.BitFieldFactory;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class FrameRecord extends StandardRecord {
    public static final short BORDER_TYPE_REGULAR = 0;
    public static final short BORDER_TYPE_SHADOW = 1;
    public static final short sid = 4146;
    private short field_1_borderType;
    private short field_2_options;
    private static final BitField autoSize = BitFieldFactory.getInstance(1);
    private static final BitField autoPosition = BitFieldFactory.getInstance(2);

    public FrameRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        FrameRecord frameRecord = new FrameRecord();
        frameRecord.field_1_borderType = this.field_1_borderType;
        frameRecord.field_2_options = this.field_2_options;
        return frameRecord;
    }

    public short getBorderType() {
        return this.field_1_borderType;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 4;
    }

    public short getOptions() {
        return this.field_2_options;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    public boolean isAutoPosition() {
        return autoPosition.isSet(this.field_2_options);
    }

    public boolean isAutoSize() {
        return autoSize.isSet(this.field_2_options);
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this.field_1_borderType);
        littleEndianOutput.writeShort(this.field_2_options);
    }

    public void setAutoPosition(boolean z10) {
        this.field_2_options = autoPosition.setShortBoolean(this.field_2_options, z10);
    }

    public void setAutoSize(boolean z10) {
        this.field_2_options = autoSize.setShortBoolean(this.field_2_options, z10);
    }

    public void setBorderType(short s4) {
        this.field_1_borderType = s4;
    }

    public void setOptions(short s4) {
        this.field_2_options = s4;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[FRAME]\n    .borderType           = 0x");
        stringBuffer.append(HexDump.toHex(getBorderType()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getBorderType());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .options              = 0x");
        stringBuffer.append(HexDump.toHex(getOptions()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getOptions());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("         .autoSize                 = ");
        stringBuffer.append(isAutoSize());
        stringBuffer.append("\n         .autoPosition             = ");
        stringBuffer.append(isAutoPosition());
        stringBuffer.append("\n[/FRAME]\n");
        return stringBuffer.toString();
    }

    public FrameRecord(RecordInputStream recordInputStream) {
        this.field_1_borderType = recordInputStream.readShort();
        this.field_2_options = recordInputStream.readShort();
    }
}
