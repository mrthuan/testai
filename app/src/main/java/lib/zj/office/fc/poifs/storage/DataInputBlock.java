package lib.zj.office.fc.poifs.storage;

/* loaded from: classes3.dex */
public final class DataInputBlock {
    private final byte[] _buf;
    private int _maxIndex;
    private int _readIndex;

    public DataInputBlock(byte[] bArr, int i10) {
        this._buf = bArr;
        this._readIndex = i10;
        this._maxIndex = bArr.length;
    }

    private void readSpanning(DataInputBlock dataInputBlock, int i10, byte[] bArr) {
        System.arraycopy(dataInputBlock._buf, dataInputBlock._readIndex, bArr, 0, i10);
        int length = bArr.length - i10;
        System.arraycopy(this._buf, 0, bArr, i10, length);
        this._readIndex = length;
    }

    public int available() {
        return this._maxIndex - this._readIndex;
    }

    public void readFully(byte[] bArr, int i10, int i11) {
        System.arraycopy(this._buf, this._readIndex, bArr, i10, i11);
        this._readIndex += i11;
    }

    public int readIntLE() {
        int i10 = this._readIndex;
        byte[] bArr = this._buf;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = i12 + 1;
        this._readIndex = i13 + 1;
        return ((bArr[i13] & 255) << 24) + ((bArr[i12] & 255) << 16) + ((bArr[i11] & 255) << 8) + ((bArr[i10] & 255) << 0);
    }

    public long readLongLE() {
        int i10 = this._readIndex;
        byte[] bArr = this._buf;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = i12 + 1;
        int i14 = i13 + 1;
        int i15 = i14 + 1;
        int i16 = i15 + 1;
        int i17 = i16 + 1;
        this._readIndex = i17 + 1;
        return ((bArr[i17] & 255) << 56) + ((bArr[i16] & 255) << 48) + ((bArr[i15] & 255) << 40) + ((bArr[i14] & 255) << 32) + ((bArr[i13] & 255) << 24) + ((bArr[i12] & 255) << 16) + ((bArr[i11] & 255) << 8) + ((bArr[i10] & 255) << 0);
    }

    public int readUByte() {
        byte[] bArr = this._buf;
        int i10 = this._readIndex;
        this._readIndex = i10 + 1;
        return bArr[i10] & 255;
    }

    public int readUShortLE() {
        int i10 = this._readIndex;
        byte[] bArr = this._buf;
        int i11 = i10 + 1;
        this._readIndex = i11 + 1;
        return ((bArr[i11] & 255) << 8) + ((bArr[i10] & 255) << 0);
    }

    public int readUShortLE(DataInputBlock dataInputBlock) {
        byte[] bArr = dataInputBlock._buf;
        byte[] bArr2 = this._buf;
        int i10 = this._readIndex;
        this._readIndex = i10 + 1;
        return ((bArr2[i10] & 255) << 8) + ((bArr[bArr.length - 1] & 255) << 0);
    }

    public int readIntLE(DataInputBlock dataInputBlock, int i10) {
        byte[] bArr = new byte[4];
        readSpanning(dataInputBlock, i10, bArr);
        return ((bArr[3] & 255) << 24) + ((bArr[2] & 255) << 16) + ((bArr[1] & 255) << 8) + ((bArr[0] & 255) << 0);
    }

    public long readLongLE(DataInputBlock dataInputBlock, int i10) {
        byte[] bArr = new byte[8];
        readSpanning(dataInputBlock, i10, bArr);
        return ((bArr[7] & 255) << 56) + ((bArr[6] & 255) << 48) + ((bArr[5] & 255) << 40) + ((bArr[4] & 255) << 32) + ((bArr[3] & 255) << 24) + ((bArr[2] & 255) << 16) + ((bArr[1] & 255) << 8) + ((bArr[0] & 255) << 0);
    }
}
