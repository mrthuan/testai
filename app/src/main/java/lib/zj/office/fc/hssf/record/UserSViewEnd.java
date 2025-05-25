package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class UserSViewEnd extends StandardRecord {
    public static final short sid = 427;
    private byte[] _rawData;

    public UserSViewEnd(byte[] bArr) {
        this._rawData = bArr;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        return cloneViaReserialise();
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return this._rawData.length;
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return sid;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.write(this._rawData);
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[USERSVIEWEND] (0x");
        stringBuffer.append(Integer.toHexString(427).toUpperCase() + ")\n");
        stringBuffer.append("  rawData=");
        stringBuffer.append(HexDump.toHex(this._rawData));
        stringBuffer.append("\n[/USERSVIEWEND]\n");
        return stringBuffer.toString();
    }

    public UserSViewEnd(RecordInputStream recordInputStream) {
        this._rawData = recordInputStream.readRemainder();
    }
}
