package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class PrintGridlinesRecord extends StandardRecord {
    public static final short sid = 43;
    private short field_1_print_gridlines;

    public PrintGridlinesRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        PrintGridlinesRecord printGridlinesRecord = new PrintGridlinesRecord();
        printGridlinesRecord.field_1_print_gridlines = this.field_1_print_gridlines;
        return printGridlinesRecord;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 2;
    }

    public boolean getPrintGridlines() {
        if (this.field_1_print_gridlines == 1) {
            return true;
        }
        return false;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 43;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this.field_1_print_gridlines);
    }

    public void setPrintGridlines(boolean z10) {
        if (z10) {
            this.field_1_print_gridlines = (short) 1;
        } else {
            this.field_1_print_gridlines = (short) 0;
        }
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[PRINTGRIDLINES]\n    .printgridlines = ");
        stringBuffer.append(getPrintGridlines());
        stringBuffer.append("\n[/PRINTGRIDLINES]\n");
        return stringBuffer.toString();
    }

    public PrintGridlinesRecord(RecordInputStream recordInputStream) {
        this.field_1_print_gridlines = recordInputStream.readShort();
    }
}
