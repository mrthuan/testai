package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class MMSRecord extends StandardRecord {
    public static final short sid = 193;
    private byte field_1_addMenuCount;
    private byte field_2_delMenuCount;

    public MMSRecord() {
    }

    public byte getAddMenuCount() {
        return this.field_1_addMenuCount;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 2;
    }

    public byte getDelMenuCount() {
        return this.field_2_delMenuCount;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 193;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeByte(getAddMenuCount());
        littleEndianOutput.writeByte(getDelMenuCount());
    }

    public void setAddMenuCount(byte b10) {
        this.field_1_addMenuCount = b10;
    }

    public void setDelMenuCount(byte b10) {
        this.field_2_delMenuCount = b10;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[MMS]\n    .addMenu        = ");
        stringBuffer.append(Integer.toHexString(getAddMenuCount()));
        stringBuffer.append("\n    .delMenu        = ");
        stringBuffer.append(Integer.toHexString(getDelMenuCount()));
        stringBuffer.append("\n[/MMS]\n");
        return stringBuffer.toString();
    }

    public MMSRecord(RecordInputStream recordInputStream) {
        if (recordInputStream.remaining() == 0) {
            return;
        }
        this.field_1_addMenuCount = recordInputStream.readByte();
        this.field_2_delMenuCount = recordInputStream.readByte();
    }
}
