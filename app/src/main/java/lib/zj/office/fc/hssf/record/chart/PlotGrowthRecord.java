package lib.zj.office.fc.hssf.record.chart;

import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.hssf.record.StandardRecord;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class PlotGrowthRecord extends StandardRecord {
    public static final short sid = 4196;
    private int field_1_horizontalScale;
    private int field_2_verticalScale;

    public PlotGrowthRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        PlotGrowthRecord plotGrowthRecord = new PlotGrowthRecord();
        plotGrowthRecord.field_1_horizontalScale = this.field_1_horizontalScale;
        plotGrowthRecord.field_2_verticalScale = this.field_2_verticalScale;
        return plotGrowthRecord;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 8;
    }

    public int getHorizontalScale() {
        return this.field_1_horizontalScale;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    public int getVerticalScale() {
        return this.field_2_verticalScale;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeInt(this.field_1_horizontalScale);
        littleEndianOutput.writeInt(this.field_2_verticalScale);
    }

    public void setHorizontalScale(int i10) {
        this.field_1_horizontalScale = i10;
    }

    public void setVerticalScale(int i10) {
        this.field_2_verticalScale = i10;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[PLOTGROWTH]\n    .horizontalScale      = 0x");
        stringBuffer.append(HexDump.toHex(getHorizontalScale()));
        stringBuffer.append(" (");
        stringBuffer.append(getHorizontalScale());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("    .verticalScale        = 0x");
        stringBuffer.append(HexDump.toHex(getVerticalScale()));
        stringBuffer.append(" (");
        stringBuffer.append(getVerticalScale());
        stringBuffer.append(" )");
        stringBuffer.append(System.getProperty("line.separator"));
        stringBuffer.append("[/PLOTGROWTH]\n");
        return stringBuffer.toString();
    }

    public PlotGrowthRecord(RecordInputStream recordInputStream) {
        this.field_1_horizontalScale = recordInputStream.readInt();
        this.field_2_verticalScale = recordInputStream.readInt();
    }
}
