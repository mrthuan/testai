package lib.zj.office.fc.poifs.filesystem;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class DocumentOutputStream extends OutputStream {
    private final int _limit;
    private final OutputStream _stream;
    private int _written = 0;

    public DocumentOutputStream(OutputStream outputStream, int i10) {
        this._stream = outputStream;
        this._limit = i10;
    }

    private void limitCheck(int i10) {
        int i11 = this._written;
        if (i11 + i10 <= this._limit) {
            this._written = i11 + i10;
            return;
        }
        throw new IOException("tried to write too much data");
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        this._stream.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        limitCheck(1);
        this._stream.write(i10);
    }

    public void writeFiller(int i10, byte b10) {
        int i11 = this._written;
        if (i10 > i11) {
            byte[] bArr = new byte[i10 - i11];
            Arrays.fill(bArr, b10);
            this._stream.write(bArr);
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        limitCheck(i11);
        this._stream.write(bArr, i10, i11);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
