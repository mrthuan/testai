package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class AutoFilterInfoRecord extends StandardRecord {
    public static final short sid = 157;
    private short _cEntries;

    public AutoFilterInfoRecord() {
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        return cloneViaReserialise();
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 2;
    }

    public short getNumEntries() {
        return this._cEntries;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this._cEntries);
    }

    public void setNumEntries(short s4) {
        this._cEntries = s4;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[AUTOFILTERINFO]\n    .numEntries          = ");
        stringBuffer.append((int) this._cEntries);
        stringBuffer.append("\n[/AUTOFILTERINFO]\n");
        return stringBuffer.toString();
    }

    public AutoFilterInfoRecord(RecordInputStream recordInputStream) {
        this._cEntries = recordInputStream.readShort();
    }
}
