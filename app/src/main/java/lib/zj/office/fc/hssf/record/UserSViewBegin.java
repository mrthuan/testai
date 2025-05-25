package lib.zj.office.fc.hssf.record;

import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class UserSViewBegin extends StandardRecord {
    public static final short sid = 426;
    private byte[] _rawData;

    public UserSViewBegin(byte[] bArr) {
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

    public byte[] getGuid() {
        byte[] bArr = new byte[16];
        System.arraycopy(this._rawData, 0, bArr, 0, 16);
        return bArr;
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
        StringBuffer stringBuffer = new StringBuffer("[USERSVIEWBEGIN] (0x");
        stringBuffer.append(Integer.toHexString(426).toUpperCase() + ")\n");
        stringBuffer.append("  rawData=");
        stringBuffer.append(HexDump.toHex(this._rawData));
        stringBuffer.append("\n[/USERSVIEWBEGIN]\n");
        return stringBuffer.toString();
    }

    public UserSViewBegin(RecordInputStream recordInputStream) {
        this._rawData = recordInputStream.readRemainder();
    }
}
