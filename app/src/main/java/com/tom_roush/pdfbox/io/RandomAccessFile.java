package com.tom_roush.pdfbox.io;

import java.io.File;
import java.io.IOException;

/* loaded from: classes2.dex */
public class RandomAccessFile implements RandomAccess {
    private boolean isClosed;
    private final java.io.RandomAccessFile ras;

    public RandomAccessFile(File file, String str) {
        this.ras = new java.io.RandomAccessFile(file, str);
    }

    private void checkClosed() {
        if (!this.isClosed) {
            return;
        }
        throw new IOException("RandomAccessFile already closed");
    }

    @Override // com.tom_roush.pdfbox.io.RandomAccessRead
    public int available() {
        checkClosed();
        return (int) Math.min(this.ras.length() - getPosition(), 2147483647L);
    }

    @Override // com.tom_roush.pdfbox.io.RandomAccessWrite
    public void clear() {
        checkClosed();
        this.ras.seek(0L);
        this.ras.setLength(0L);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.ras.close();
        this.isClosed = true;
    }

    @Override // com.tom_roush.pdfbox.io.RandomAccessRead
    public long getPosition() {
        checkClosed();
        return this.ras.getFilePointer();
    }

    @Override // com.tom_roush.pdfbox.io.RandomAccessRead
    public boolean isClosed() {
        return this.isClosed;
    }

    @Override // com.tom_roush.pdfbox.io.RandomAccessRead
    public boolean isEOF() {
        if (peek() == -1) {
            return true;
        }
        return false;
    }

    @Override // com.tom_roush.pdfbox.io.RandomAccessRead
    public long length() {
        checkClosed();
        return this.ras.length();
    }

    @Override // com.tom_roush.pdfbox.io.RandomAccessRead
    public int peek() {
        int read = read();
        if (read != -1) {
            rewind(1);
        }
        return read;
    }

    @Override // com.tom_roush.pdfbox.io.RandomAccessRead
    public int read() {
        checkClosed();
        return this.ras.read();
    }

    @Override // com.tom_roush.pdfbox.io.RandomAccessRead
    public byte[] readFully(int i10) {
        checkClosed();
        byte[] bArr = new byte[i10];
        this.ras.readFully(bArr);
        return bArr;
    }

    @Override // com.tom_roush.pdfbox.io.RandomAccessRead
    public void rewind(int i10) {
        checkClosed();
        java.io.RandomAccessFile randomAccessFile = this.ras;
        randomAccessFile.seek(randomAccessFile.getFilePointer() - i10);
    }

    @Override // com.tom_roush.pdfbox.io.RandomAccessRead
    public void seek(long j10) {
        checkClosed();
        this.ras.seek(j10);
    }

    @Override // com.tom_roush.pdfbox.io.RandomAccessWrite
    public void write(byte[] bArr, int i10, int i11) {
        checkClosed();
        this.ras.write(bArr, i10, i11);
    }

    @Override // com.tom_roush.pdfbox.io.RandomAccessRead
    public int read(byte[] bArr) {
        checkClosed();
        return this.ras.read(bArr);
    }

    @Override // com.tom_roush.pdfbox.io.RandomAccessWrite
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // com.tom_roush.pdfbox.io.RandomAccessWrite
    public void write(int i10) {
        checkClosed();
        this.ras.write(i10);
    }

    @Override // com.tom_roush.pdfbox.io.RandomAccessRead
    public int read(byte[] bArr, int i10, int i11) {
        checkClosed();
        return this.ras.read(bArr, i10, i11);
    }
}
