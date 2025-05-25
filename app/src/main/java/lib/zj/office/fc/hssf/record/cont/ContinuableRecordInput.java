package lib.zj.office.fc.hssf.record.cont;

import lib.zj.office.fc.hssf.record.RecordInputStream;
import lib.zj.office.fc.util.LittleEndianInput;

/* loaded from: classes3.dex */
public class ContinuableRecordInput implements LittleEndianInput {
    private final RecordInputStream _in;

    public ContinuableRecordInput(RecordInputStream recordInputStream) {
        this._in = recordInputStream;
    }

    @Override // lib.zj.office.fc.util.LittleEndianInput
    public int available() {
        return this._in.available();
    }

    @Override // lib.zj.office.fc.util.LittleEndianInput
    public byte readByte() {
        return this._in.readByte();
    }

    @Override // lib.zj.office.fc.util.LittleEndianInput
    public double readDouble() {
        return this._in.readDouble();
    }

    @Override // lib.zj.office.fc.util.LittleEndianInput
    public void readFully(byte[] bArr) {
        this._in.readFully(bArr);
    }

    @Override // lib.zj.office.fc.util.LittleEndianInput
    public int readInt() {
        int readUByte = this._in.readUByte();
        int readUByte2 = this._in.readUByte();
        return (this._in.readUByte() << 24) + (this._in.readUByte() << 16) + (readUByte2 << 8) + (readUByte << 0);
    }

    @Override // lib.zj.office.fc.util.LittleEndianInput
    public long readLong() {
        int readUByte = this._in.readUByte();
        int readUByte2 = this._in.readUByte();
        int readUByte3 = this._in.readUByte();
        int readUByte4 = this._in.readUByte();
        int readUByte5 = this._in.readUByte();
        int readUByte6 = this._in.readUByte();
        return (this._in.readUByte() << 56) + (this._in.readUByte() << 48) + (readUByte6 << 40) + (readUByte5 << 32) + (readUByte4 << 24) + (readUByte3 << 16) + (readUByte2 << 8) + (readUByte << 0);
    }

    @Override // lib.zj.office.fc.util.LittleEndianInput
    public short readShort() {
        return this._in.readShort();
    }

    @Override // lib.zj.office.fc.util.LittleEndianInput
    public int readUByte() {
        return this._in.readUByte();
    }

    @Override // lib.zj.office.fc.util.LittleEndianInput
    public int readUShort() {
        return (readUByte() << 8) + (readUByte() << 0);
    }

    @Override // lib.zj.office.fc.util.LittleEndianInput
    public void readFully(byte[] bArr, int i10, int i11) {
        this._in.readFully(bArr, i10, i11);
    }
}
