package lib.zj.office.fc.hssf.record.crypto;

import java.io.InputStream;
import lib.zj.office.fc.hssf.record.BiffHeaderInput;
import lib.zj.office.fc.util.LittleEndianInput;
import lib.zj.office.fc.util.LittleEndianInputStream;

/* loaded from: classes3.dex */
public final class Biff8DecryptingStream implements BiffHeaderInput, LittleEndianInput {
    private final LittleEndianInput _le;
    private final Biff8RC4 _rc4;

    public Biff8DecryptingStream(InputStream inputStream, int i10, Biff8EncryptionKey biff8EncryptionKey) {
        this._rc4 = new Biff8RC4(i10, biff8EncryptionKey);
        if (inputStream instanceof LittleEndianInput) {
            this._le = (LittleEndianInput) inputStream;
        } else {
            this._le = new LittleEndianInputStream(inputStream);
        }
    }

    @Override // lib.zj.office.fc.hssf.record.BiffHeaderInput
    public int available() {
        return this._le.available();
    }

    @Override // lib.zj.office.fc.util.LittleEndianInput
    public byte readByte() {
        return (byte) this._rc4.xorByte(this._le.readUByte());
    }

    @Override // lib.zj.office.fc.hssf.record.BiffHeaderInput
    public int readDataSize() {
        int readUShort = this._le.readUShort();
        this._rc4.skipTwoBytes();
        return readUShort;
    }

    @Override // lib.zj.office.fc.util.LittleEndianInput
    public double readDouble() {
        double longBitsToDouble = Double.longBitsToDouble(readLong());
        if (!Double.isNaN(longBitsToDouble)) {
            return longBitsToDouble;
        }
        throw new RuntimeException("Did not expect to read NaN");
    }

    @Override // lib.zj.office.fc.util.LittleEndianInput
    public void readFully(byte[] bArr) {
        readFully(bArr, 0, bArr.length);
    }

    @Override // lib.zj.office.fc.util.LittleEndianInput
    public int readInt() {
        return this._rc4.xorInt(this._le.readInt());
    }

    @Override // lib.zj.office.fc.util.LittleEndianInput
    public long readLong() {
        return this._rc4.xorLong(this._le.readLong());
    }

    @Override // lib.zj.office.fc.hssf.record.BiffHeaderInput
    public int readRecordSID() {
        int readUShort = this._le.readUShort();
        this._rc4.skipTwoBytes();
        this._rc4.startRecord(readUShort);
        return readUShort;
    }

    @Override // lib.zj.office.fc.util.LittleEndianInput
    public short readShort() {
        return (short) this._rc4.xorShort(this._le.readUShort());
    }

    @Override // lib.zj.office.fc.util.LittleEndianInput
    public int readUByte() {
        return this._rc4.xorByte(this._le.readUByte());
    }

    @Override // lib.zj.office.fc.util.LittleEndianInput
    public int readUShort() {
        return this._rc4.xorShort(this._le.readUShort());
    }

    @Override // lib.zj.office.fc.util.LittleEndianInput
    public void readFully(byte[] bArr, int i10, int i11) {
        this._le.readFully(bArr, i10, i11);
        this._rc4.xor(bArr, i10, i11);
    }
}
