package lib.zj.office.fc.util;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* loaded from: classes3.dex */
public final class LittleEndianOutputStream extends FilterOutputStream implements LittleEndianOutput {
    public LittleEndianOutputStream(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, lib.zj.office.fc.util.LittleEndianOutput
    public void write(byte[] bArr) {
        try {
            super.write(bArr);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // lib.zj.office.fc.util.LittleEndianOutput
    public void writeByte(int i10) {
        try {
            ((FilterOutputStream) this).out.write(i10);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // lib.zj.office.fc.util.LittleEndianOutput
    public void writeDouble(double d10) {
        writeLong(Double.doubleToLongBits(d10));
    }

    @Override // lib.zj.office.fc.util.LittleEndianOutput
    public void writeInt(int i10) {
        int i11 = (i10 >>> 24) & FunctionEval.FunctionID.EXTERNAL_FUNC;
        int i12 = (i10 >>> 16) & FunctionEval.FunctionID.EXTERNAL_FUNC;
        int i13 = (i10 >>> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC;
        try {
            ((FilterOutputStream) this).out.write((i10 >>> 0) & FunctionEval.FunctionID.EXTERNAL_FUNC);
            ((FilterOutputStream) this).out.write(i13);
            ((FilterOutputStream) this).out.write(i12);
            ((FilterOutputStream) this).out.write(i11);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // lib.zj.office.fc.util.LittleEndianOutput
    public void writeLong(long j10) {
        writeInt((int) (j10 >> 0));
        writeInt((int) (j10 >> 32));
    }

    @Override // lib.zj.office.fc.util.LittleEndianOutput
    public void writeShort(int i10) {
        int i11 = (i10 >>> 8) & FunctionEval.FunctionID.EXTERNAL_FUNC;
        try {
            ((FilterOutputStream) this).out.write((i10 >>> 0) & FunctionEval.FunctionID.EXTERNAL_FUNC);
            ((FilterOutputStream) this).out.write(i11);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, lib.zj.office.fc.util.LittleEndianOutput
    public void write(byte[] bArr, int i10, int i11) {
        try {
            super.write(bArr, i10, i11);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
