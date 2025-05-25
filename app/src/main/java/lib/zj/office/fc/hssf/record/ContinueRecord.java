package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class ContinueRecord extends StandardRecord {
    public static final short sid = 60;
    private byte[] _data;

    public ContinueRecord(byte[] bArr) {
        this._data = bArr;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        return new ContinueRecord(this._data);
    }

    public byte[] getData() {
        return this._data;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        byte[] bArr = this._data;
        if (bArr != null) {
            return bArr.length;
        }
        return 0;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 60;
    }

    public void resetData() {
        this._data = null;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.write(this._data);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[CONTINUE RECORD]\n    .data = ");
        stringBuffer.append(HexDump.toHex(this._data));
        stringBuffer.append("\n[/CONTINUE RECORD]\n");
        return stringBuffer.toString();
    }

    public ContinueRecord(RecordInputStream recordInputStream) {
        this._data = recordInputStream.readRemainder();
    }
}
