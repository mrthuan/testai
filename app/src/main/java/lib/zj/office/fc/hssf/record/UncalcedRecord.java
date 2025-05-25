package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class UncalcedRecord extends StandardRecord {
    public static final short sid = 94;
    private short _reserved;

    public UncalcedRecord() {
        this._reserved = (short) 0;
    }

    public static int getStaticRecordSize() {
        return 6;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 2;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 94;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this._reserved);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[UNCALCED]\n    _reserved: ");
        stringBuffer.append((int) this._reserved);
        stringBuffer.append("\n[/UNCALCED]\n");
        return stringBuffer.toString();
    }

    public UncalcedRecord(RecordInputStream recordInputStream) {
        this._reserved = recordInputStream.readShort();
    }
}
