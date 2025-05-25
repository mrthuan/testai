package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class DateWindow1904Record extends StandardRecord {
    public static final short sid = 34;
    private short field_1_window;

    public DateWindow1904Record() {
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 2;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 34;
    }

    public short getWindowing() {
        return this.field_1_window;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(getWindowing());
    }

    public void setWindowing(short s4) {
        this.field_1_window = s4;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[1904]\n    .is1904          = ");
        stringBuffer.append(Integer.toHexString(getWindowing()));
        stringBuffer.append("\n[/1904]\n");
        return stringBuffer.toString();
    }

    public DateWindow1904Record(RecordInputStream recordInputStream) {
        this.field_1_window = recordInputStream.readShort();
    }
}
