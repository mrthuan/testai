package lib.zj.office.fc.hssf.record.chart;

import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.hssf.record.StandardRecord;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class AxisRecord extends StandardRecord {
    public static final short AXIS_TYPE_CATEGORY_OR_X_AXIS = 0;
    public static final short AXIS_TYPE_SERIES_AXIS = 2;
    public static final short AXIS_TYPE_VALUE_AXIS = 1;
    public static final short sid = 4125;
    private short field_1_axisType;
    private int field_2_reserved1;
    private int field_3_reserved2;
    private int field_4_reserved3;
    private int field_5_reserved4;

    public AxisRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        AxisRecord axisRecord = new AxisRecord();
        axisRecord.field_1_axisType = this.field_1_axisType;
        axisRecord.field_2_reserved1 = this.field_2_reserved1;
        axisRecord.field_3_reserved2 = this.field_3_reserved2;
        axisRecord.field_4_reserved3 = this.field_4_reserved3;
        axisRecord.field_5_reserved4 = this.field_5_reserved4;
        return axisRecord;
    }

    public short getAxisType() {
        return this.field_1_axisType;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 18;
    }

    public int getReserved1() {
        return this.field_2_reserved1;
    }

    public int getReserved2() {
        return this.field_3_reserved2;
    }

    public int getReserved3() {
        return this.field_4_reserved3;
    }

    public int getReserved4() {
        return this.field_5_reserved4;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this.field_1_axisType);
        littleEndianOutput.writeInt(this.field_2_reserved1);
        littleEndianOutput.writeInt(this.field_3_reserved2);
        littleEndianOutput.writeInt(this.field_4_reserved3);
        littleEndianOutput.writeInt(this.field_5_reserved4);
    }

    public void setAxisType(short s4) {
        this.field_1_axisType = s4;
    }

    public void setReserved1(int i10) {
        this.field_2_reserved1 = i10;
    }

    public void setReserved2(int i10) {
        this.field_3_reserved2 = i10;
    }

    public void setReserved3(int i10) {
        this.field_4_reserved3 = i10;
    }

    public void setReserved4(int i10) {
        this.field_5_reserved4 = i10;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[AXIS]\n    .axisType             = 0x");
        stringBuffer.append(HexDump.toHex(getAxisType()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getAxisType());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .reserved1            = 0x");
        stringBuffer.append(HexDump.toHex(getReserved1()));
        stringBuffer.append(" (");
        stringBuffer.append(getReserved1());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .reserved2            = 0x");
        stringBuffer.append(HexDump.toHex(getReserved2()));
        stringBuffer.append(" (");
        stringBuffer.append(getReserved2());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .reserved3            = 0x");
        stringBuffer.append(HexDump.toHex(getReserved3()));
        stringBuffer.append(" (");
        stringBuffer.append(getReserved3());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .reserved4            = 0x");
        stringBuffer.append(HexDump.toHex(getReserved4()));
        stringBuffer.append(" (");
        stringBuffer.append(getReserved4());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("[/AXIS]\n");
        return stringBuffer.toString();
    }

    public AxisRecord(RecordInputStream recordInputStream) {
        this.field_1_axisType = recordInputStream.readShort();
        this.field_2_reserved1 = recordInputStream.readInt();
        this.field_3_reserved2 = recordInputStream.readInt();
        this.field_4_reserved3 = recordInputStream.readInt();
        this.field_5_reserved4 = recordInputStream.readInt();
    }
}
