package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class PrintHeadersRecord extends StandardRecord {
    public static final short sid = 42;
    private short field_1_print_headers;

    public PrintHeadersRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        PrintHeadersRecord printHeadersRecord = new PrintHeadersRecord();
        printHeadersRecord.field_1_print_headers = this.field_1_print_headers;
        return printHeadersRecord;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 2;
    }

    public boolean getPrintHeaders() {
        if (this.field_1_print_headers == 1) {
            return true;
        }
        return false;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 42;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this.field_1_print_headers);
    }

    public void setPrintHeaders(boolean z10) {
        if (z10) {
            this.field_1_print_headers = (short) 1;
        } else {
            this.field_1_print_headers = (short) 0;
        }
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[PRINTHEADERS]\n    .printheaders   = ");
        stringBuffer.append(getPrintHeaders());
        stringBuffer.append("\n[/PRINTHEADERS]\n");
        return stringBuffer.toString();
    }

    public PrintHeadersRecord(RecordInputStream recordInputStream) {
        this.field_1_print_headers = recordInputStream.readShort();
    }
}
