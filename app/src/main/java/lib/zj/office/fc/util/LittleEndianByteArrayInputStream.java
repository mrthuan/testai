package lib.zj.office.fc.util;

/* loaded from: classes3.dex */
public final class LittleEndianByteArrayInputStream implements LittleEndianInput {
    private final byte[] _buf;
    private final int _endIndex;
    private int _readIndex;

    public LittleEndianByteArrayInputStream(byte[] bArr, int i10, int i11) {
        this._buf = bArr;
        this._readIndex = i10;
        this._endIndex = i10 + i11;
    }

    private void checkPosition(int i10) {
        if (i10 <= this._endIndex - this._readIndex) {
            return;
        }
        throw new RuntimeException("Buffer overrun");
    }

    @Override // lib.zj.office.fc.util.LittleEndianInput
    public int available() {
        return this._endIndex - this._readIndex;
    }

    public int getReadIndex() {
        return this._readIndex;
    }

    @Override // lib.zj.office.fc.util.LittleEndianInput
    public byte readByte() {
        checkPosition(1);
        byte[] bArr = this._buf;
        int i10 = this._readIndex;
        this._readIndex = i10 + 1;
        return bArr[i10];
    }

    @Override // lib.zj.office.fc.util.LittleEndianInput
    public double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // lib.zj.office.fc.util.LittleEndianInput
    public void readFully(byte[] bArr, int i10, int i11) {
        checkPosition(i11);
        System.arraycopy(this._buf, this._readIndex, bArr, i10, i11);
        this._readIndex += i11;
    }

    @Override // lib.zj.office.fc.util.LittleEndianInput
    public int readInt() {
        checkPosition(4);
        int i10 = this._readIndex;
        byte[] bArr = this._buf;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = i12 + 1;
        this._readIndex = i13 + 1;
        return ((bArr[i13] & 255) << 24) + ((bArr[i12] & 255) << 16) + ((bArr[i11] & 255) << 8) + ((bArr[i10] & 255) << 0);
    }

    @Override // lib.zj.office.fc.util.LittleEndianInput
    public long readLong() {
        checkPosition(8);
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

    @Override // lib.zj.office.fc.util.LittleEndianInput
    public short readShort() {
        return (short) readUShort();
    }

    @Override // lib.zj.office.fc.util.LittleEndianInput
    public int readUByte() {
        checkPosition(1);
        byte[] bArr = this._buf;
        int i10 = this._readIndex;
        this._readIndex = i10 + 1;
        return bArr[i10] & 255;
    }

    @Override // lib.zj.office.fc.util.LittleEndianInput
    public int readUShort() {
        checkPosition(2);
        int i10 = this._readIndex;
        byte[] bArr = this._buf;
        int i11 = i10 + 1;
        this._readIndex = i11 + 1;
        return ((bArr[i11] & 255) << 8) + ((bArr[i10] & 255) << 0);
    }

    @Override // lib.zj.office.fc.util.LittleEndianInput
    public void readFully(byte[] bArr) {
        readFully(bArr, 0, bArr.length);
    }

    public LittleEndianByteArrayInputStream(byte[] bArr, int i10) {
        this(bArr, i10, bArr.length - i10);
    }

    public LittleEndianByteArrayInputStream(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }
}
