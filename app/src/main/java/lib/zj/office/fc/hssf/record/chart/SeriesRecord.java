package lib.zj.office.fc.hssf.record.chart;

import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.hssf.record.StandardRecord;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class SeriesRecord extends StandardRecord {
    public static final short BUBBLE_SERIES_TYPE_DATES = 0;
    public static final short BUBBLE_SERIES_TYPE_NUMERIC = 1;
    public static final short BUBBLE_SERIES_TYPE_SEQUENCE = 2;
    public static final short BUBBLE_SERIES_TYPE_TEXT = 3;
    public static final short CATEGORY_DATA_TYPE_DATES = 0;
    public static final short CATEGORY_DATA_TYPE_NUMERIC = 1;
    public static final short CATEGORY_DATA_TYPE_SEQUENCE = 2;
    public static final short CATEGORY_DATA_TYPE_TEXT = 3;
    public static final short VALUES_DATA_TYPE_DATES = 0;
    public static final short VALUES_DATA_TYPE_NUMERIC = 1;
    public static final short VALUES_DATA_TYPE_SEQUENCE = 2;
    public static final short VALUES_DATA_TYPE_TEXT = 3;
    public static final short sid = 4099;
    private short field_1_categoryDataType;
    private short field_2_valuesDataType;
    private short field_3_numCategories;
    private short field_4_numValues;
    private short field_5_bubbleSeriesType;
    private short field_6_numBubbleValues;

    public SeriesRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        SeriesRecord seriesRecord = new SeriesRecord();
        seriesRecord.field_1_categoryDataType = this.field_1_categoryDataType;
        seriesRecord.field_2_valuesDataType = this.field_2_valuesDataType;
        seriesRecord.field_3_numCategories = this.field_3_numCategories;
        seriesRecord.field_4_numValues = this.field_4_numValues;
        seriesRecord.field_5_bubbleSeriesType = this.field_5_bubbleSeriesType;
        seriesRecord.field_6_numBubbleValues = this.field_6_numBubbleValues;
        return seriesRecord;
    }

    public short getBubbleSeriesType() {
        return this.field_5_bubbleSeriesType;
    }

    public short getCategoryDataType() {
        return this.field_1_categoryDataType;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 12;
    }

    public short getNumBubbleValues() {
        return this.field_6_numBubbleValues;
    }

    public short getNumCategories() {
        return this.field_3_numCategories;
    }

    public short getNumValues() {
        return this.field_4_numValues;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    public short getValuesDataType() {
        return this.field_2_valuesDataType;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this.field_1_categoryDataType);
        littleEndianOutput.writeShort(this.field_2_valuesDataType);
        littleEndianOutput.writeShort(this.field_3_numCategories);
        littleEndianOutput.writeShort(this.field_4_numValues);
        littleEndianOutput.writeShort(this.field_5_bubbleSeriesType);
        littleEndianOutput.writeShort(this.field_6_numBubbleValues);
    }

    public void setBubbleSeriesType(short s4) {
        this.field_5_bubbleSeriesType = s4;
    }

    public void setCategoryDataType(short s4) {
        this.field_1_categoryDataType = s4;
    }

    public void setNumBubbleValues(short s4) {
        this.field_6_numBubbleValues = s4;
    }

    public void setNumCategories(short s4) {
        this.field_3_numCategories = s4;
    }

    public void setNumValues(short s4) {
        this.field_4_numValues = s4;
    }

    public void setValuesDataType(short s4) {
        this.field_2_valuesDataType = s4;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[SERIES]\n    .categoryDataType     = 0x");
        stringBuffer.append(HexDump.toHex(getCategoryDataType()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getCategoryDataType());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .valuesDataType       = 0x");
        stringBuffer.append(HexDump.toHex(getValuesDataType()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getValuesDataType());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .numCategories        = 0x");
        stringBuffer.append(HexDump.toHex(getNumCategories()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getNumCategories());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .numValues            = 0x");
        stringBuffer.append(HexDump.toHex(getNumValues()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getNumValues());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .bubbleSeriesType     = 0x");
        stringBuffer.append(HexDump.toHex(getBubbleSeriesType()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getBubbleSeriesType());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .numBubbleValues      = 0x");
        stringBuffer.append(HexDump.toHex(getNumBubbleValues()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getNumBubbleValues());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("[/SERIES]\n");
        return stringBuffer.toString();
    }

    public SeriesRecord(RecordInputStream recordInputStream) {
        this.field_1_categoryDataType = recordInputStream.readShort();
        this.field_2_valuesDataType = recordInputStream.readShort();
        this.field_3_numCategories = recordInputStream.readShort();
        this.field_4_numValues = recordInputStream.readShort();
        this.field_5_bubbleSeriesType = recordInputStream.readShort();
        this.field_6_numBubbleValues = recordInputStream.readShort();
    }
}
