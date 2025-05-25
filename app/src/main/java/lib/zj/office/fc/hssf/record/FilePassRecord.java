package lib.zj.office.fc.hssf.record;

import androidx.activity.r;
import lib.zj.office.fc.util.HexDump;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
public final class FilePassRecord extends StandardRecord {
    private static final int ENCRYPTION_OTHER = 1;
    private static final int ENCRYPTION_OTHER_CAPI_2 = 2;
    private static final int ENCRYPTION_OTHER_CAPI_3 = 3;
    private static final int ENCRYPTION_OTHER_RC4 = 1;
    private static final int ENCRYPTION_XOR = 0;
    public static final short sid = 47;
    private byte[] _docId;
    private int _encryptionInfo;
    private int _encryptionType;
    private int _minorVersionNo;
    private byte[] _saltData;
    private byte[] _saltHash;

    public FilePassRecord(RecordInputStream recordInputStream) {
        int readUShort = recordInputStream.readUShort();
        this._encryptionType = readUShort;
        if (readUShort != 0) {
            if (readUShort == 1) {
                int readUShort2 = recordInputStream.readUShort();
                this._encryptionInfo = readUShort2;
                if (readUShort2 != 1) {
                    if (readUShort2 != 2 && readUShort2 != 3) {
                        throw new RecordFormatException("Unknown encryption info " + this._encryptionInfo);
                    }
                    throw new RecordFormatException("HSSF does not currently support CryptoAPI encryption");
                }
                int readUShort3 = recordInputStream.readUShort();
                this._minorVersionNo = readUShort3;
                if (readUShort3 == 1) {
                    this._docId = read(recordInputStream, 16);
                    this._saltData = read(recordInputStream, 16);
                    this._saltHash = read(recordInputStream, 16);
                    return;
                }
                throw new RecordFormatException("Unexpected VersionInfo number for RC4Header " + this._minorVersionNo);
            }
            throw new RecordFormatException("Unknown encryption type " + this._encryptionType);
        }
        throw new RecordFormatException("HSSF does not currently support XOR obfuscation");
    }

    private static byte[] read(RecordInputStream recordInputStream, int i10) {
        byte[] bArr = new byte[i10];
        recordInputStream.readFully(bArr);
        return bArr;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public int getDataSize() {
        return 54;
    }

    public byte[] getDocId() {
        return (byte[]) this._docId.clone();
    }

    public byte[] getSaltData() {
        return (byte[]) this._saltData.clone();
    }

    public byte[] getSaltHash() {
        return (byte[]) this._saltHash.clone();
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public short getSid() {
        return (short) 47;
    }

    @Override // lib.zj.office.fc.hssf.record.StandardRecord
    public void serialize(LittleEndianOutput littleEndianOutput) {
        littleEndianOutput.writeShort(this._encryptionType);
        littleEndianOutput.writeShort(this._encryptionInfo);
        littleEndianOutput.writeShort(this._minorVersionNo);
        littleEndianOutput.write(this._docId);
        littleEndianOutput.write(this._saltData);
        littleEndianOutput.write(this._saltHash);
    }

    public void setDocId(byte[] bArr) {
        this._docId = (byte[]) bArr.clone();
    }

    public void setSaltData(byte[] bArr) {
        this._saltData = (byte[]) bArr.clone();
    }

    public void setSaltHash(byte[] bArr) {
        this._saltHash = (byte[]) bArr.clone();
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[FILEPASS]\n    .type = ");
        r.j(this._encryptionType, stringBuffer, "\n    .info = ");
        r.j(this._encryptionInfo, stringBuffer, "\n    .ver  = ");
        r.j(this._minorVersionNo, stringBuffer, "\n    .docId= ");
        stringBuffer.append(HexDump.toHex(this._docId));
        stringBuffer.append("\n    .salt = ");
        stringBuffer.append(HexDump.toHex(this._saltData));
        stringBuffer.append("\n    .hash = ");
        stringBuffer.append(HexDump.toHex(this._saltHash));
        stringBuffer.append("\n[/FILEPASS]\n");
        return stringBuffer.toString();
    }

    @Override // lib.zj.office.fc.hssf.record.Record
    public Object clone() {
        return this;
    }
}
