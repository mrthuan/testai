package lib.zj.office.fc.hssf.record.chart;

import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.hssf.record.StandardRecord;
import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.BitFieldFactory;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class CategorySeriesAxisRecord extends StandardRecord {
    public static final short sid = 4128;
    private short field_1_crossingPoint;
    private short field_2_labelFrequency;
    private short field_3_tickMarkFrequency;
    private short field_4_options;
    private static final BitField valueAxisCrossing = BitFieldFactory.getInstance(1);
    private static final BitField crossesFarRight = BitFieldFactory.getInstance(2);
    private static final BitField reversed = BitFieldFactory.getInstance(4);

    public CategorySeriesAxisRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        CategorySeriesAxisRecord categorySeriesAxisRecord = new CategorySeriesAxisRecord();
        categorySeriesAxisRecord.field_1_crossingPoint = this.field_1_crossingPoint;
        categorySeriesAxisRecord.field_2_labelFrequency = this.field_2_labelFrequency;
        categorySeriesAxisRecord.field_3_tickMarkFrequency = this.field_3_tickMarkFrequency;
        categorySeriesAxisRecord.field_4_options = this.field_4_options;
        return categorySeriesAxisRecord;
    }

    public short getCrossingPoint() {
        return this.field_1_crossingPoint;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 8;
    }

    public short getLabelFrequency() {
        return this.field_2_labelFrequency;
    }

    public short getOptions() {
        return this.field_4_options;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    public short getTickMarkFrequency() {
        return this.field_3_tickMarkFrequency;
    }

    public boolean isCrossesFarRight() {
        return crossesFarRight.isSet(this.field_4_options);
    }

    public boolean isReversed() {
        return reversed.isSet(this.field_4_options);
    }

    public boolean isValueAxisCrossing() {
        return valueAxisCrossing.isSet(this.field_4_options);
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this.field_1_crossingPoint);
        littleEndianOutput.writeShort(this.field_2_labelFrequency);
        littleEndianOutput.writeShort(this.field_3_tickMarkFrequency);
        littleEndianOutput.writeShort(this.field_4_options);
    }

    public void setCrossesFarRight(boolean z10) {
        this.field_4_options = crossesFarRight.setShortBoolean(this.field_4_options, z10);
    }

    public void setCrossingPoint(short s4) {
        this.field_1_crossingPoint = s4;
    }

    public void setLabelFrequency(short s4) {
        this.field_2_labelFrequency = s4;
    }

    public void setOptions(short s4) {
        this.field_4_options = s4;
    }

    public void setReversed(boolean z10) {
        this.field_4_options = reversed.setShortBoolean(this.field_4_options, z10);
    }

    public void setTickMarkFrequency(short s4) {
        this.field_3_tickMarkFrequency = s4;
    }

    public void setValueAxisCrossing(boolean z10) {
        this.field_4_options = valueAxisCrossing.setShortBoolean(this.field_4_options, z10);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[CATSERRANGE]\n    .crossingPoint        = 0x");
        stringBuffer.append(HexDump.toHex(getCrossingPoint()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getCrossingPoint());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .labelFrequency       = 0x");
        stringBuffer.append(HexDump.toHex(getLabelFrequency()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getLabelFrequency());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .tickMarkFrequency    = 0x");
        stringBuffer.append(HexDump.toHex(getTickMarkFrequency()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getTickMarkFrequency());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .options              = 0x");
        stringBuffer.append(HexDump.toHex(getOptions()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getOptions());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("         .valueAxisCrossing        = ");
        stringBuffer.append(isValueAxisCrossing());
        stringBuffer.append("\n         .crossesFarRight          = ");
        stringBuffer.append(isCrossesFarRight());
        stringBuffer.append("\n         .reversed                 = ");
        stringBuffer.append(isReversed());
        stringBuffer.append("\n[/CATSERRANGE]\n");
        return stringBuffer.toString();
    }

    public CategorySeriesAxisRecord(RecordInputStream recordInputStream) {
        this.field_1_crossingPoint = recordInputStream.readShort();
        this.field_2_labelFrequency = recordInputStream.readShort();
        this.field_3_tickMarkFrequency = recordInputStream.readShort();
        this.field_4_options = recordInputStream.readShort();
    }
}
