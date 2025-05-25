package lib.zj.office.fc.util;

import java.io.InputStream;

/* loaded from: classes3.dex */
public class BlockingInputStream extends InputStream {
    protected InputStream is;

    public BlockingInputStream(InputStream inputStream) {
        this.is = inputStream;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.is.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.is.close();
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.is.mark(i10);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.is.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        return this.is.read();
    }

    @Override // java.io.InputStream
    public void reset() {
        this.is.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        return this.is.skip(j10);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        int i10 = 0;
        int i11 = 4611;
        while (i10 < bArr.length && (i11 = this.is.read()) != -1) {
            bArr[i10] = (byte) i11;
            i10++;
        }
        if (i10 == 0 && i11 == -1) {
            return -1;
        }
        return i10;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        return this.is.read(bArr, i10, i11);
    }
}
