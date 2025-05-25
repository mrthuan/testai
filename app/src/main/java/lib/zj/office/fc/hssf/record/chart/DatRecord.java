package lib.zj.office.fc.hssf.record.chart;

import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.hssf.record.StandardRecord;
import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.BitFieldFactory;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class DatRecord extends StandardRecord {
    public static final short sid = 4195;
    private short field_1_options;
    private static final BitField horizontalBorder = BitFieldFactory.getInstance(1);
    private static final BitField verticalBorder = BitFieldFactory.getInstance(2);
    private static final BitField border = BitFieldFactory.getInstance(4);
    private static final BitField showSeriesKey = BitFieldFactory.getInstance(8);

    public DatRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        DatRecord datRecord = new DatRecord();
        datRecord.field_1_options = this.field_1_options;
        return datRecord;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 2;
    }

    public short getOptions() {
        return this.field_1_options;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    public boolean isBorder() {
        return border.isSet(this.field_1_options);
    }

    public boolean isHorizontalBorder() {
        return horizontalBorder.isSet(this.field_1_options);
    }

    public boolean isShowSeriesKey() {
        return showSeriesKey.isSet(this.field_1_options);
    }

    public boolean isVerticalBorder() {
        return verticalBorder.isSet(this.field_1_options);
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this.field_1_options);
    }

    public void setBorder(boolean z10) {
        this.field_1_options = border.setShortBoolean(this.field_1_options, z10);
    }

    public void setHorizontalBorder(boolean z10) {
        this.field_1_options = horizontalBorder.setShortBoolean(this.field_1_options, z10);
    }

    public void setOptions(short s4) {
        this.field_1_options = s4;
    }

    public void setShowSeriesKey(boolean z10) {
        this.field_1_options = showSeriesKey.setShortBoolean(this.field_1_options, z10);
    }

    public void setVerticalBorder(boolean z10) {
        this.field_1_options = verticalBorder.setShortBoolean(this.field_1_options, z10);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[DAT]\n    .options              = 0x");
        stringBuffer.append(HexDump.toHex(getOptions()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getOptions());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("         .horizontalBorder         = ");
        stringBuffer.append(isHorizontalBorder());
        stringBuffer.append("\n         .verticalBorder           = ");
        stringBuffer.append(isVerticalBorder());
        stringBuffer.append("\n         .border                   = ");
        stringBuffer.append(isBorder());
        stringBuffer.append("\n         .showSeriesKey            = ");
        stringBuffer.append(isShowSeriesKey());
        stringBuffer.append("\n[/DAT]\n");
        return stringBuffer.toString();
    }

    public DatRecord(RecordInputStream recordInputStream) {
        this.field_1_options = recordInputStream.readShort();
    }
}
