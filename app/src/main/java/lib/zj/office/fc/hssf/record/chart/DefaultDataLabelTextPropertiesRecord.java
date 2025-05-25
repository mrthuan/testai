package lib.zj.office.fc.hssf.record.chart;

import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.hssf.record.StandardRecord;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class DefaultDataLabelTextPropertiesRecord extends StandardRecord {
    public static final short CATEGORY_DATA_TYPE_ALL_TEXT_CHARACTERISTIC = 2;
    public static final short CATEGORY_DATA_TYPE_SHOW_LABELS_CHARACTERISTIC = 0;
    public static final short CATEGORY_DATA_TYPE_VALUE_AND_PERCENTAGE_CHARACTERISTIC = 1;
    public static final short sid = 4132;
    private short field_1_categoryDataType;

    public DefaultDataLabelTextPropertiesRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        DefaultDataLabelTextPropertiesRecord defaultDataLabelTextPropertiesRecord = new DefaultDataLabelTextPropertiesRecord();
        defaultDataLabelTextPropertiesRecord.field_1_categoryDataType = this.field_1_categoryDataType;
        return defaultDataLabelTextPropertiesRecord;
    }

    public short getCategoryDataType() {
        return this.field_1_categoryDataType;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 2;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this.field_1_categoryDataType);
    }

    public void setCategoryDataType(short s4) {
        this.field_1_categoryDataType = s4;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[DEFAULTTEXT]\n    .categoryDataType     = 0x");
        stringBuffer.append(HexDump.toHex(getCategoryDataType()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getCategoryDataType());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("[/DEFAULTTEXT]\n");
        return stringBuffer.toString();
    }

    public DefaultDataLabelTextPropertiesRecord(RecordInputStream recordInputStream) {
        this.field_1_categoryDataType = recordInputStream.readShort();
    }
}
