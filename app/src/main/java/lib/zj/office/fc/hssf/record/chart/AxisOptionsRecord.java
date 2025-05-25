package lib.zj.office.fc.hssf.record.chart;

import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.hssf.record.StandardRecord;
import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.BitFieldFactory;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class AxisOptionsRecord extends StandardRecord {
    public static final short sid = 4194;
    private short field_1_minimumCategory;
    private short field_2_maximumCategory;
    private short field_3_majorUnitValue;
    private short field_4_majorUnit;
    private short field_5_minorUnitValue;
    private short field_6_minorUnit;
    private short field_7_baseUnit;
    private short field_8_crossingPoint;
    private short field_9_options;
    private static final BitField defaultMinimum = BitFieldFactory.getInstance(1);
    private static final BitField defaultMaximum = BitFieldFactory.getInstance(2);
    private static final BitField defaultMajor = BitFieldFactory.getInstance(4);
    private static final BitField defaultMinorUnit = BitFieldFactory.getInstance(8);
    private static final BitField isDate = BitFieldFactory.getInstance(16);
    private static final BitField defaultBase = BitFieldFactory.getInstance(32);
    private static final BitField defaultCross = BitFieldFactory.getInstance(64);
    private static final BitField defaultDateSettings = BitFieldFactory.getInstance(128);

    public AxisOptionsRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        AxisOptionsRecord axisOptionsRecord = new AxisOptionsRecord();
        axisOptionsRecord.field_1_minimumCategory = this.field_1_minimumCategory;
        axisOptionsRecord.field_2_maximumCategory = this.field_2_maximumCategory;
        axisOptionsRecord.field_3_majorUnitValue = this.field_3_majorUnitValue;
        axisOptionsRecord.field_4_majorUnit = this.field_4_majorUnit;
        axisOptionsRecord.field_5_minorUnitValue = this.field_5_minorUnitValue;
        axisOptionsRecord.field_6_minorUnit = this.field_6_minorUnit;
        axisOptionsRecord.field_7_baseUnit = this.field_7_baseUnit;
        axisOptionsRecord.field_8_crossingPoint = this.field_8_crossingPoint;
        axisOptionsRecord.field_9_options = this.field_9_options;
        return axisOptionsRecord;
    }

    public short getBaseUnit() {
        return this.field_7_baseUnit;
    }

    public short getCrossingPoint() {
        return this.field_8_crossingPoint;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 18;
    }

    public short getMajorUnit() {
        return this.field_4_majorUnit;
    }

    public short getMajorUnitValue() {
        return this.field_3_majorUnitValue;
    }

    public short getMaximumCategory() {
        return this.field_2_maximumCategory;
    }

    public short getMinimumCategory() {
        return this.field_1_minimumCategory;
    }

    public short getMinorUnit() {
        return this.field_6_minorUnit;
    }

    public short getMinorUnitValue() {
        return this.field_5_minorUnitValue;
    }

    public short getOptions() {
        return this.field_9_options;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    public boolean isDefaultBase() {
        return defaultBase.isSet(this.field_9_options);
    }

    public boolean isDefaultCross() {
        return defaultCross.isSet(this.field_9_options);
    }

    public boolean isDefaultDateSettings() {
        return defaultDateSettings.isSet(this.field_9_options);
    }

    public boolean isDefaultMajor() {
        return defaultMajor.isSet(this.field_9_options);
    }

    public boolean isDefaultMaximum() {
        return defaultMaximum.isSet(this.field_9_options);
    }

    public boolean isDefaultMinimum() {
        return defaultMinimum.isSet(this.field_9_options);
    }

    public boolean isDefaultMinorUnit() {
        return defaultMinorUnit.isSet(this.field_9_options);
    }

    public boolean isIsDate() {
        return isDate.isSet(this.field_9_options);
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this.field_1_minimumCategory);
        littleEndianOutput.writeShort(this.field_2_maximumCategory);
        littleEndianOutput.writeShort(this.field_3_majorUnitValue);
        littleEndianOutput.writeShort(this.field_4_majorUnit);
        littleEndianOutput.writeShort(this.field_5_minorUnitValue);
        littleEndianOutput.writeShort(this.field_6_minorUnit);
        littleEndianOutput.writeShort(this.field_7_baseUnit);
        littleEndianOutput.writeShort(this.field_8_crossingPoint);
        littleEndianOutput.writeShort(this.field_9_options);
    }

    public void setBaseUnit(short s4) {
        this.field_7_baseUnit = s4;
    }

    public void setCrossingPoint(short s4) {
        this.field_8_crossingPoint = s4;
    }

    public void setDefaultBase(boolean z10) {
        this.field_9_options = defaultBase.setShortBoolean(this.field_9_options, z10);
    }

    public void setDefaultCross(boolean z10) {
        this.field_9_options = defaultCross.setShortBoolean(this.field_9_options, z10);
    }

    public void setDefaultDateSettings(boolean z10) {
        this.field_9_options = defaultDateSettings.setShortBoolean(this.field_9_options, z10);
    }

    public void setDefaultMajor(boolean z10) {
        this.field_9_options = defaultMajor.setShortBoolean(this.field_9_options, z10);
    }

    public void setDefaultMaximum(boolean z10) {
        this.field_9_options = defaultMaximum.setShortBoolean(this.field_9_options, z10);
    }

    public void setDefaultMinimum(boolean z10) {
        this.field_9_options = defaultMinimum.setShortBoolean(this.field_9_options, z10);
    }

    public void setDefaultMinorUnit(boolean z10) {
        this.field_9_options = defaultMinorUnit.setShortBoolean(this.field_9_options, z10);
    }

    public void setIsDate(boolean z10) {
        this.field_9_options = isDate.setShortBoolean(this.field_9_options, z10);
    }

    public void setMajorUnit(short s4) {
        this.field_4_majorUnit = s4;
    }

    public void setMajorUnitValue(short s4) {
        this.field_3_majorUnitValue = s4;
    }

    public void setMaximumCategory(short s4) {
        this.field_2_maximumCategory = s4;
    }

    public void setMinimumCategory(short s4) {
        this.field_1_minimumCategory = s4;
    }

    public void setMinorUnit(short s4) {
        this.field_6_minorUnit = s4;
    }

    public void setMinorUnitValue(short s4) {
        this.field_5_minorUnitValue = s4;
    }

    public void setOptions(short s4) {
        this.field_9_options = s4;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[AXCEXT]\n    .minimumCategory      = 0x");
        stringBuffer.append(HexDump.toHex(getMinimumCategory()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getMinimumCategory());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .maximumCategory      = 0x");
        stringBuffer.append(HexDump.toHex(getMaximumCategory()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getMaximumCategory());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .majorUnitValue       = 0x");
        stringBuffer.append(HexDump.toHex(getMajorUnitValue()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getMajorUnitValue());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .majorUnit            = 0x");
        stringBuffer.append(HexDump.toHex(getMajorUnit()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getMajorUnit());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .minorUnitValue       = 0x");
        stringBuffer.append(HexDump.toHex(getMinorUnitValue()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getMinorUnitValue());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .minorUnit            = 0x");
        stringBuffer.append(HexDump.toHex(getMinorUnit()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getMinorUnit());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .baseUnit             = 0x");
        stringBuffer.append(HexDump.toHex(getBaseUnit()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getBaseUnit());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .crossingPoint        = 0x");
        stringBuffer.append(HexDump.toHex(getCrossingPoint()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getCrossingPoint());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .options              = 0x");
        stringBuffer.append(HexDump.toHex(getOptions()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getOptions());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("         .defaultMinimum           = ");
        stringBuffer.append(isDefaultMinimum());
        stringBuffer.append("\n         .defaultMaximum           = ");
        stringBuffer.append(isDefaultMaximum());
        stringBuffer.append("\n         .defaultMajor             = ");
        stringBuffer.append(isDefaultMajor());
        stringBuffer.append("\n         .defaultMinorUnit         = ");
        stringBuffer.append(isDefaultMinorUnit());
        stringBuffer.append("\n         .isDate                   = ");
        stringBuffer.append(isIsDate());
        stringBuffer.append("\n         .defaultBase              = ");
        stringBuffer.append(isDefaultBase());
        stringBuffer.append("\n         .defaultCross             = ");
        stringBuffer.append(isDefaultCross());
        stringBuffer.append("\n         .defaultDateSettings      = ");
        stringBuffer.append(isDefaultDateSettings());
        stringBuffer.append("\n[/AXCEXT]\n");
        return stringBuffer.toString();
    }

    public AxisOptionsRecord(RecordInputStream recordInputStream) {
        this.field_1_minimumCategory = recordInputStream.readShort();
        this.field_2_maximumCategory = recordInputStream.readShort();
        this.field_3_majorUnitValue = recordInputStream.readShort();
        this.field_4_majorUnit = recordInputStream.readShort();
        this.field_5_minorUnitValue = recordInputStream.readShort();
        this.field_6_minorUnit = recordInputStream.readShort();
        this.field_7_baseUnit = recordInputStream.readShort();
        this.field_8_crossingPoint = recordInputStream.readShort();
        this.field_9_options = recordInputStream.readShort();
    }
}
