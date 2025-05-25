package lib.zj.office.fc.hssf.record.chart;

import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.hssf.record.StandardRecord;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class ChartRecord extends StandardRecord {
    public static final short sid = 4098;
    private int field_1_x;
    private int field_2_y;
    private int field_3_width;
    private int field_4_height;

    public ChartRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        ChartRecord chartRecord = new ChartRecord();
        chartRecord.field_1_x = this.field_1_x;
        chartRecord.field_2_y = this.field_2_y;
        chartRecord.field_3_width = this.field_3_width;
        chartRecord.field_4_height = this.field_4_height;
        return chartRecord;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 16;
    }

    public int getHeight() {
        return this.field_4_height;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    public int getWidth() {
        return this.field_3_width;
    }

    public int getX() {
        return this.field_1_x;
    }

    public int getY() {
        return this.field_2_y;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeInt(this.field_1_x);
        littleEndianOutput.writeInt(this.field_2_y);
        littleEndianOutput.writeInt(this.field_3_width);
        littleEndianOutput.writeInt(this.field_4_height);
    }

    public void setHeight(int i10) {
        this.field_4_height = i10;
    }

    public void setWidth(int i10) {
        this.field_3_width = i10;
    }

    public void setX(int i10) {
        this.field_1_x = i10;
    }

    public void setY(int i10) {
        this.field_2_y = i10;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[CHART]\n    .x     = ");
        stringBuffer.append(getX());
        stringBuffer.append("\n    .y     = ");
        stringBuffer.append(getY());
        stringBuffer.append("\n    .width = ");
        stringBuffer.append(getWidth());
        stringBuffer.append("\n    .height= ");
        stringBuffer.append(getHeight());
        stringBuffer.append("\n[/CHART]\n");
        return stringBuffer.toString();
    }

    public ChartRecord(RecordInputStream recordInputStream) {
        this.field_1_x = recordInputStream.readInt();
        this.field_2_y = recordInputStream.readInt();
        this.field_3_width = recordInputStream.readInt();
        this.field_4_height = recordInputStream.readInt();
    }
}
