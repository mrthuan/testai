package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class TopMarginRecord extends StandardRecord implements Margin {
    public static final short sid = 40;
    private double field_1_margin;

    public TopMarginRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        TopMarginRecord topMarginRecord = new TopMarginRecord();
        topMarginRecord.field_1_margin = this.field_1_margin;
        return topMarginRecord;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 8;
    }

    @Override // lib.zj.office.fc.hssf.record.Margin
    public double getMargin() {
        return this.field_1_margin;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 40;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeDouble(this.field_1_margin);
    }

    @Override // lib.zj.office.fc.hssf.record.Margin
    public void setMargin(double d10) {
        this.field_1_margin = d10;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[TopMargin]\n    .margin               =  (");
        stringBuffer.append(getMargin());
        stringBuffer.append(" )\n[/TopMargin]\n");
        return stringBuffer.toString();
    }

    public TopMarginRecord(RecordInputStream recordInputStream) {
        this.field_1_margin = recordInputStream.readDouble();
    }
}
