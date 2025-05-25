package lib.zj.office.fc.hssf.record.cont;

import lib.zj.office.fc.util.DelayableLittleEndianOutput;
import lib.zj.office.fc.util.LittleEndianByteArrayOutputStream;
import lib.zj.office.fc.util.LittleEndianOutput;

/* loaded from: classes3.dex */
final class UnknownLengthRecordOutput implements LittleEndianOutput {
    private static final int MAX_DATA_SIZE = 8224;
    private final byte[] _byteBuffer;
    private final LittleEndianOutput _dataSizeOutput;
    private final LittleEndianOutput _originalOut;
    private LittleEndianOutput _out;
    private int _size;

    public UnknownLengthRecordOutput(LittleEndianOutput littleEndianOutput, int i10) {
        this._originalOut = littleEndianOutput;
        littleEndianOutput.writeShort(i10);
        if (littleEndianOutput instanceof DelayableLittleEndianOutput) {
            this._dataSizeOutput = ((DelayableLittleEndianOutput) littleEndianOutput).createDelayedOutput(2);
            this._byteBuffer = null;
            this._out = littleEndianOutput;
            return;
        }
        this._dataSizeOutput = littleEndianOutput;
        byte[] bArr = new byte[MAX_DATA_SIZE];
        this._byteBuffer = bArr;
        this._out = new LittleEndianByteArrayOutputStream(bArr, 0);
    }

    public int getAvailableSpace() {
        if (this._out != null) {
            return 8224 - this._size;
        }
        throw new IllegalStateException("Record already terminated");
    }

    public int getTotalSize() {
        return this._size + 4;
    }

    public void terminate() {
        if (this._out != null) {
            this._dataSizeOutput.writeShort(this._size);
            byte[] bArr = this._byteBuffer;
            if (bArr != null) {
                this._originalOut.write(bArr, 0, this._size);
                this._out = null;
                return;
            }
            this._out = null;
            return;
        }
        throw new IllegalStateException("Record already terminated");
    }

    @Override // lib.zj.office.fc.util.LittleEndianOutput
    public void write(byte[] bArr) {
        this._out.write(bArr);
        this._size += bArr.length;
    }

    @Override // lib.zj.office.fc.util.LittleEndianOutput
    public void writeByte(int i10) {
        this._out.writeByte(i10);
        this._size++;
    }

    @Override // lib.zj.office.fc.util.LittleEndianOutput
    public void writeDouble(double d10) {
        this._out.writeDouble(d10);
        this._size += 8;
    }

    @Override // lib.zj.office.fc.util.LittleEndianOutput
    public void writeInt(int i10) {
        this._out.writeInt(i10);
        this._size += 4;
    }

    @Override // lib.zj.office.fc.util.LittleEndianOutput
    public void writeLong(long j10) {
        this._out.writeLong(j10);
        this._size += 8;
    }

    @Override // lib.zj.office.fc.util.LittleEndianOutput
    public void writeShort(int i10) {
        this._out.writeShort(i10);
        this._size += 2;
    }

    @Override // lib.zj.office.fc.util.LittleEndianOutput
    public void write(byte[] bArr, int i10, int i11) {
        this._out.write(bArr, i10, i11);
        this._size += i11;
    }
}
