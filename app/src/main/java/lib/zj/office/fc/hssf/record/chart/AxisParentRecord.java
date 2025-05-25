package lib.zj.office.fc.hssf.record.chart;

import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.hssf.record.StandardRecord;
import lib.zj.office.fc.hssf.record.UnknownRecord;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndian;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class AxisParentRecord extends StandardRecord {
    public static final short AXIS_TYPE_MAIN = 0;
    public static final short AXIS_TYPE_SECONDARY = 1;
    public static final short sid = 4161;
    private short field_1_axisType;
    private int field_2_x;
    private int field_3_y;
    private int field_4_width;
    private int field_5_height;

    public AxisParentRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        AxisParentRecord axisParentRecord = new AxisParentRecord();
        axisParentRecord.field_1_axisType = this.field_1_axisType;
        axisParentRecord.field_2_x = this.field_2_x;
        axisParentRecord.field_3_y = this.field_3_y;
        axisParentRecord.field_4_width = this.field_4_width;
        axisParentRecord.field_5_height = this.field_5_height;
        return axisParentRecord;
    }

    public short getAxisType() {
        return this.field_1_axisType;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 18;
    }

    public int getHeight() {
        return this.field_5_height;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    public int getWidth() {
        return this.field_4_width;
    }

    public int getX() {
        return this.field_2_x;
    }

    public int getY() {
        return this.field_3_y;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this.field_1_axisType);
        littleEndianOutput.writeInt(this.field_2_x);
        littleEndianOutput.writeInt(this.field_3_y);
        littleEndianOutput.writeInt(this.field_4_width);
        littleEndianOutput.writeInt(this.field_5_height);
    }

    public void setAxisType(short s4) {
        this.field_1_axisType = s4;
    }

    public void setHeight(int i10) {
        this.field_5_height = i10;
    }

    public void setWidth(int i10) {
        this.field_4_width = i10;
    }

    public void setX(int i10) {
        this.field_2_x = i10;
    }

    public void setY(int i10) {
        this.field_3_y = i10;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[AXISPARENT]\n    .axisType             = 0x");
        stringBuffer.append(HexDump.toHex(getAxisType()));
        stringBuffer.append(" (");
        stringBuffer.append((int) getAxisType());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .x                    = 0x");
        stringBuffer.append(HexDump.toHex(getX()));
        stringBuffer.append(" (");
        stringBuffer.append(getX());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .y                    = 0x");
        stringBuffer.append(HexDump.toHex(getY()));
        stringBuffer.append(" (");
        stringBuffer.append(getY());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .width                = 0x");
        stringBuffer.append(HexDump.toHex(getWidth()));
        stringBuffer.append(" (");
        stringBuffer.append(getWidth());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .height               = 0x");
        stringBuffer.append(HexDump.toHex(getHeight()));
        stringBuffer.append(" (");
        stringBuffer.append(getHeight());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("[/AXISPARENT]\n");
        return stringBuffer.toString();
    }

    public AxisParentRecord(RecordInputStream recordInputStream) {
        this.field_1_axisType = recordInputStream.readShort();
        this.field_2_x = recordInputStream.readInt();
        this.field_3_y = recordInputStream.readInt();
        this.field_4_width = recordInputStream.readInt();
        this.field_5_height = recordInputStream.readInt();
    }

    public AxisParentRecord(UnknownRecord unknownRecord) {
        if (unknownRecord.getSid() == 4161 && unknownRecord.getData().length == getDataSize()) {
            byte[] data = unknownRecord.getData();
            this.field_1_axisType = LittleEndian.getShort(data, 0);
            this.field_2_x = LittleEndian.getInt(data, 2);
            this.field_3_y = LittleEndian.getInt(data, 6);
            this.field_4_width = LittleEndian.getInt(data, 10);
            this.field_5_height = LittleEndian.getInt(data, 14);
        }
    }
}
