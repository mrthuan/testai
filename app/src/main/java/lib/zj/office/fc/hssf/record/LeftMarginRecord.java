package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class LeftMarginRecord extends StandardRecord implements Margin {
    public static final short sid = 38;
    private double field_1_margin;

    public LeftMarginRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        LeftMarginRecord leftMarginRecord = new LeftMarginRecord();
        leftMarginRecord.field_1_margin = this.field_1_margin;
        return leftMarginRecord;
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
        return (short) 38;
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
        StringBuffer stringBuffer = new StringBuffer("[LeftMargin]\n    .margin               =  (");
        stringBuffer.append(getMargin());
        stringBuffer.append(" )\n[/LeftMargin]\n");
        return stringBuffer.toString();
    }

    public LeftMarginRecord(RecordInputStream recordInputStream) {
        this.field_1_margin = recordInputStream.readDouble();
    }
}
