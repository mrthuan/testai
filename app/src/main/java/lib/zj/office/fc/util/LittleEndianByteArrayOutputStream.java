package lib.zj.office.fc.util;

import a6.h;
import androidx.appcompat.view.menu.d;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* loaded from: classes3.dex */
public final class LittleEndianByteArrayOutputStream implements LittleEndianOutput, DelayableLittleEndianOutput {
    private final byte[] _buf;
    private final int _endIndex;
    private int _writeIndex;

    public LittleEndianByteArrayOutputStream(byte[] bArr, int i10, int i11) {
        if (i10 >= 0 && i10 <= bArr.length) {
            this._buf = bArr;
            this._writeIndex = i10;
            int i12 = i11 + i10;
            this._endIndex = i12;
            if (i12 < i10 || i12 > bArr.length) {
                StringBuilder e10 = d.e("calculated end index (", i12, ") is out of allowable range (");
                e10.append(this._writeIndex);
                e10.append("..");
                throw new IllegalArgumentException(h.g(e10, bArr.length, ")"));
            }
            return;
        }
        throw new IllegalArgumentException(h.g(d.e("Specified startOffset (", i10, ") is out of allowable range (0.."), bArr.length, ")"));
    }

    private void checkPosition(int i10) {
        if (i10 <= this._endIndex - this._writeIndex) {
            return;
        }
        throw new RuntimeException("Buffer overrun");
    }

    @Override // lib.zj.office.fc.util.DelayableLittleEndianOutput
    public LittleEndianOutput createDelayedOutput(int i10) {
        checkPosition(i10);
        LittleEndianByteArrayOutputStream littleEndianByteArrayOutputStream = new LittleEndianByteArrayOutputStream(this._buf, this._writeIndex, i10);
        this._writeIndex += i10;
        return littleEndianByteArrayOutputStream;
    }

    public int getWriteIndex() {
        return this._writeIndex;
    }

    @Override // lib.zj.office.fc.util.LittleEndianOutput
    public void write(byte[] bArr) {
        int length = bArr.length;
        checkPosition(length);
        System.arraycopy(bArr, 0, this._buf, this._writeIndex, length);
        this._writeIndex += length;
    }

    @Override // lib.zj.office.fc.util.LittleEndianOutput
    public void writeByte(int i10) {
        checkPosition(1);
        byte[] bArr = this._buf;
        int i11 = this._writeIndex;
        this._writeIndex = i11 + 1;
        bArr[i11] = (byte) i10;
    }

    @Override // lib.zj.office.fc.util.LittleEndianOutput
    public void writeDouble(double d10) {
        writeLong(Double.doubleToLongBits(d10));
    }

    @Override // lib.zj.office.fc.util.LittleEndianOutput
    public void writeInt(int i10) {
        checkPosition(4);
        int i11 = this._writeIndex;
        byte[] bArr = this._buf;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 0) & FunctionEval.FunctionID.EXTERNAL_FUNC);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((i10 >>> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((i10 >>> 16) & FunctionEval.FunctionID.EXTERNAL_FUNC);
        bArr[i14] = (byte) ((i10 >>> 24) & FunctionEval.FunctionID.EXTERNAL_FUNC);
        this._writeIndex = i14 + 1;
    }

    @Override // lib.zj.office.fc.util.LittleEndianOutput
    public void writeLong(long j10) {
        writeInt((int) (j10 >> 0));
        writeInt((int) (j10 >> 32));
    }

    @Override // lib.zj.office.fc.util.LittleEndianOutput
    public void writeShort(int i10) {
        checkPosition(2);
        int i11 = this._writeIndex;
        byte[] bArr = this._buf;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 0) & FunctionEval.FunctionID.EXTERNAL_FUNC);
        bArr[i12] = (byte) ((i10 >>> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC);
        this._writeIndex = i12 + 1;
    }

    @Override // lib.zj.office.fc.util.LittleEndianOutput
    public void write(byte[] bArr, int i10, int i11) {
        checkPosition(i11);
        System.arraycopy(bArr, i10, this._buf, this._writeIndex, i11);
        this._writeIndex += i11;
    }

    public LittleEndianByteArrayOutputStream(byte[] bArr, int i10) {
        this(bArr, i10, bArr.length - i10);
    }
}
