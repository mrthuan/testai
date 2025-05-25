package lib.zj.office.fc.hssf.record.chart;

import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.hssf.record.StandardRecord;
import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.BitFieldFactory;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class ValueRangeRecord extends StandardRecord {
    public static final short sid = 4127;
    private double field_1_minimumAxisValue;
    private double field_2_maximumAxisValue;
    private double field_3_majorIncrement;
    private double field_4_minorIncrement;
    private double field_5_categoryAxisCross;
    private short field_6_options;
    private static final BitField automaticMinimum = BitFieldFactory.getInstance(1);
    private static final BitField automaticMaximum = BitFieldFactory.getInstance(2);
    private static final BitField automaticMajor = BitFieldFactory.getInstance(4);
    private static final BitField automaticMinor = BitFieldFactory.getInstance(8);
    private static final BitField automaticCategoryCrossing = BitFieldFactory.getInstance(16);
    private static final BitField logarithmicScale = BitFieldFactory.getInstance(32);
    private static final BitField valuesInReverse = BitFieldFactory.getInstance(64);
    private static final BitField crossCategoryAxisAtMaximum = BitFieldFactory.getInstance(128);
    private static final BitField reserved = BitFieldFactory.getInstance(256);

    public ValueRangeRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        ValueRangeRecord valueRangeRecord = new ValueRangeRecord();
        valueRangeRecord.field_1_minimumAxisValue = this.field_1_minimumAxisValue;
        valueRangeRecord.field_2_maximumAxisValue = this.field_2_maximumAxisValue;
        valueRangeRecord.field_3_majorIncrement = this.field_3_majorIncrement;
        valueRangeRecord.field_4_minorIncrement = this.field_4_minorIncrement;
        valueRangeRecord.field_5_categoryAxisCross = this.field_5_categoryAxisCross;
        valueRangeRecord.field_6_options = this.field_6_options;
        return valueRangeRecord;
    }

    public double getCategoryAxisCross() {
        return this.field_5_categoryAxisCross;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 42;
    }

    public double getMajorIncrement() {
        return this.field_3_majorIncrement;
    }

    public double getMaximumAxisValue() {
        return this.field_2_maximumAxisValue;
    }

    public double getMinimumAxisValue() {
        return this.field_1_minimumAxisValue;
    }

    public double getMinorIncrement() {
        return this.field_4_minorIncrement;
    }

    public short getOptions() {
        return this.field_6_options;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    public boolean isAutomaticCategoryCrossing() {
        return automaticCategoryCrossing.isSet(this.field_6_options);
    }

    public boolean isAutomaticMajor() {
        return automaticMajor.isSet(this.field_6_options);
    }

    public boolean isAutomaticMaximum() {
        return automaticMaximum.isSet(this.field_6_options);
    }

    public boolean isAutomaticMinimum() {
        return automaticMinimum.isSet(this.field_6_options);
    }

    public boolean isAutomaticMinor() {
        return automaticMinor.isSet(this.field_6_options);
    }

    public boolean isCrossCategoryAxisAtMaximum() {
        return crossCategoryAxisAtMaximum.isSet(this.field_6_options);
    }

    public boolean isLogarithmicScale() {
        return logarithmicScale.isSet(this.field_6_options);
    }

    public boolean isReserved() {
        return reserved.isSet(this.field_6_options);
    }

    public boolean isValuesInReverse() {
        return valuesInReverse.isSet(this.field_6_options);
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeDouble(this.field_1_minimumAxisValue);
        littleEndianOutput.writeDouble(this.field_2_maximumAxisValue);
        littleEndianOutput.writeDouble(this.field_3_majorIncrement);
        littleEndianOutput.writeDouble(this.field_4_minorIncrement);
        littleEndianOutput.writeDouble(this.field_5_categoryAxisCross);
        littleEndianOutput.writeShort(this.field_6_options);
    }

    public void setAutomaticCategoryCrossing(boolean z10) {
        this.field_6_options = automaticCategoryCrossing.setShortBoolean(this.field_6_options, z10);
    }

    public void setAutomaticMajor(boolean z10) {
        this.field_6_options = automaticMajor.setShortBoolean(this.field_6_options, z10);
    }

    public void setAutomaticMaximum(boolean z10) {
        this.field_6_options = automaticMaximum.setShortBoolean(this.field_6_options, z10);
    }

    public void setAutomaticMinimum(boolean z10) {
        this.field_6_options = automaticMinimum.setShortBoolean(this.field_6_options, z10);
    }

    public void setAutomaticMinor(boolean z10) {
        this.field_6_options = automaticMinor.setShortBoolean(this.field_6_options, z10);
    }

    public void setCategoryAxisCross(double d10) {
        this.field_5_categoryAxisCross = d10;
    }

    public void setCrossCategoryAxisAtMaximum(boolean z10) {
        this.field_6_options = crossCategoryAxisAtMaximum.setShortBoolean(this.field_6_options, z10);
    }

    public void setLogarithmicScale(boolean z10) {
        this.field_6_options = logarithmicScale.setShortBoolean(this.field_6_options, z10);
    }

    public void setMajorIncrement(double d10) {
        this.field_3_majorIncrement = d10;
    }

    public void setMaximumAxisValue(double d10) {
        this.field_2_maximumAxisValue = d10;
    }

    public void setMinimumAxisValue(double d10) {
        this.field_1_minimumAxisValue = d10;
    }

    public void setMinorIncrement(double d10) {
        this.field_4_minorIncrement = d10;
    }

    public void setOptions(short s4) {
        this.field_6_options = s4;
    }

    public void setReserved(boolean z10) {
        this.field_6_options = reserved.setShortBoolean(this.field_6_options, z10);
    }

    public void setValuesInReverse(boolean z10) {
        this.field_6_options = valuesInReverse.setShortBoolean(this.field_6_options, z10);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[VALUERANGE]\n    .minimumAxisValue     =  (");
        stringBuffer.append(getMinimumAxisValue());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .maximumAxisValue     =  (");
        stringBuffer.append(getMaximumAxisValue());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .majorIncrement       =  (");
        stringBuffer.append(getMajorIncrement());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .minorIncrement       =  (");
        stringBuffer.append(getMinorIncrement());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .categoryAxisCross    =  (");
        stringBuffer.append(getCategoryAxisCross());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .options              = 0x");
        stringBuffer.append(HexDump.toHex(getOptions()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getOptions());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("         .automaticMinimum         = ");
        stringBuffer.append(isAutomaticMinimum());
        stringBuffer.append("\n         .automaticMaximum         = ");
        stringBuffer.append(isAutomaticMaximum());
        stringBuffer.append("\n         .automaticMajor           = ");
        stringBuffer.append(isAutomaticMajor());
        stringBuffer.append("\n         .automaticMinor           = ");
        stringBuffer.append(isAutomaticMinor());
        stringBuffer.append("\n         .automaticCategoryCrossing     = ");
        stringBuffer.append(isAutomaticCategoryCrossing());
        stringBuffer.append("\n         .logarithmicScale         = ");
        stringBuffer.append(isLogarithmicScale());
        stringBuffer.append("\n         .valuesInReverse          = ");
        stringBuffer.append(isValuesInReverse());
        stringBuffer.append("\n         .crossCategoryAxisAtMaximum     = ");
        stringBuffer.append(isCrossCategoryAxisAtMaximum());
        stringBuffer.append("\n         .reserved                 = ");
        stringBuffer.append(isReserved());
        stringBuffer.append("\n[/VALUERANGE]\n");
        return stringBuffer.toString();
    }

    public ValueRangeRecord(RecordInputStream recordInputStream) {
        this.field_1_minimumAxisValue = recordInputStream.readDouble();
        this.field_2_maximumAxisValue = recordInputStream.readDouble();
        this.field_3_majorIncrement = recordInputStream.readDouble();
        this.field_4_minorIncrement = recordInputStream.readDouble();
        this.field_5_categoryAxisCross = recordInputStream.readDouble();
        this.field_6_options = recordInputStream.readShort();
    }
}
