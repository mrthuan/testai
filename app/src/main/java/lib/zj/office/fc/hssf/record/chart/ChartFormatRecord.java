package lib.zj.office.fc.hssf.record.chart;

import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.hssf.record.StandardRecord;
import lib.zj.office.fc.util.BitField;
import lib.zj.office.fc.util.BitFieldFactory;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class ChartFormatRecord extends StandardRecord {
    public static final short sid = 4116;
    private static final BitField varyDisplayPattern = BitFieldFactory.getInstance(1);
    private int field1_x_position;
    private int field2_y_position;
    private int field3_width;
    private int field4_height;
    private int field5_grbit;
    private int field6_unknown;

    public ChartFormatRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 20;
    }

    public int getHeight() {
        return this.field4_height;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    public boolean getVaryDisplayPattern() {
        return varyDisplayPattern.isSet(this.field5_grbit);
    }

    public int getWidth() {
        return this.field3_width;
    }

    public int getXPosition() {
        return this.field1_x_position;
    }

    public int getYPosition() {
        return this.field2_y_position;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeInt(getXPosition());
        littleEndianOutput.writeInt(getYPosition());
        littleEndianOutput.writeInt(getWidth());
        littleEndianOutput.writeInt(getHeight());
        littleEndianOutput.writeShort(this.field5_grbit);
        littleEndianOutput.writeShort(this.field6_unknown);
    }

    public void setHeight(int i10) {
        this.field4_height = i10;
    }

    public void setVaryDisplayPattern(boolean z10) {
        this.field5_grbit = varyDisplayPattern.setBoolean(this.field5_grbit, z10);
    }

    public void setWidth(int i10) {
        this.field3_width = i10;
    }

    public void setXPosition(int i10) {
        this.field1_x_position = i10;
    }

    public void setYPosition(int i10) {
        this.field2_y_position = i10;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[CHARTFORMAT]\n    .xPosition       = ");
        stringBuffer.append(getXPosition());
        stringBuffer.append("\n    .yPosition       = ");
        stringBuffer.append(getYPosition());
        stringBuffer.append("\n    .width           = ");
        stringBuffer.append(getWidth());
        stringBuffer.append("\n    .height          = ");
        stringBuffer.append(getHeight());
        stringBuffer.append("\n    .grBit           = ");
        stringBuffer.append(HexDump.intToHex(this.field5_grbit));
        stringBuffer.append("\n[/CHARTFORMAT]\n");
        return stringBuffer.toString();
    }

    public ChartFormatRecord(RecordInputStream recordInputStream) {
        this.field1_x_position = recordInputStream.readInt();
        this.field2_y_position = recordInputStream.readInt();
        this.field3_width = recordInputStream.readInt();
        this.field4_height = recordInputStream.readInt();
        this.field5_grbit = recordInputStream.readUShort();
        this.field6_unknown = recordInputStream.readUShort();
    }
}
