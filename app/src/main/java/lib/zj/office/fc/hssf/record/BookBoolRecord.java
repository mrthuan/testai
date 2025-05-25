package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class BookBoolRecord extends StandardRecord {
    public static final short sid = 218;
    private short field_1_save_link_values;

    public BookBoolRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 2;
    }

    public short getSaveLinkValues() {
        return this.field_1_save_link_values;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this.field_1_save_link_values);
    }

    public void setSaveLinkValues(short s4) {
        this.field_1_save_link_values = s4;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[BOOKBOOL]\n    .savelinkvalues  = ");
        stringBuffer.append(Integer.toHexString(getSaveLinkValues()));
        stringBuffer.append("\n[/BOOKBOOL]\n");
        return stringBuffer.toString();
    }

    public BookBoolRecord(RecordInputStream recordInputStream) {
        this.field_1_save_link_values = recordInputStream.readShort();
    }
}
