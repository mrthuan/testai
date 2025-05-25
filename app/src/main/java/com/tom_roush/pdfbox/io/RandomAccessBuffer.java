package com.tom_roush.pdfbox.io;

import a0.a;
import androidx.appcompat.view.menu.d;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class RandomAccessBuffer implements RandomAccess, Cloneable {
    private static final int DEFAULT_CHUNK_SIZE = 1024;
    private List<byte[]> bufferList;
    private int bufferListIndex;
    private int bufferListMaxIndex;
    private int chunkSize;
    private byte[] currentBuffer;
    private int currentBufferPointer;
    private long pointer;
    private long size;

    public RandomAccessBuffer() {
        this(1024);
    }

    private void checkClosed() {
        if (this.currentBuffer != null) {
            return;
        }
        throw new IOException("RandomAccessBuffer already closed");
    }

    private void expandBuffer() {
        if (this.bufferListMaxIndex > this.bufferListIndex) {
            nextBuffer();
            return;
        }
        byte[] bArr = new byte[this.chunkSize];
        this.currentBuffer = bArr;
        this.bufferList.add(bArr);
        this.currentBufferPointer = 0;
        this.bufferListMaxIndex++;
        this.bufferListIndex++;
    }

    private void nextBuffer() {
        int i10 = this.bufferListIndex;
        if (i10 != this.bufferListMaxIndex) {
            this.currentBufferPointer = 0;
            List<byte[]> list = this.bufferList;
            int i11 = i10 + 1;
            this.bufferListIndex = i11;
            this.currentBuffer = list.get(i11);
            return;
        }
        throw new IOException("No more chunks available, end of buffer reached");
    }

    private int readRemainingBytes(byte[] bArr, int i10, int i11) {
        int min = (int) Math.min(i11, this.size - this.pointer);
        int i12 = this.chunkSize;
        int i13 = this.currentBufferPointer;
        int i14 = i12 - i13;
        if (i14 == 0) {
            return 0;
        }
        if (min >= i14) {
            System.arraycopy(this.currentBuffer, i13, bArr, i10, i14);
            this.currentBufferPointer += i14;
            this.pointer += i14;
            return i14;
        }
        System.arraycopy(this.currentBuffer, i13, bArr, i10, min);
        this.currentBufferPointer += min;
        this.pointer += min;
        return min;
    }

    @Override // com.tom_roush.pdfbox.io.RandomAccessRead
    public int available() {
        return (int) Math.min(length() - getPosition(), 2147483647L);
    }

    @Override // com.tom_roush.pdfbox.io.RandomAccessWrite
    public void clear() {
        this.bufferList.clear();
        byte[] bArr = new byte[this.chunkSize];
        this.currentBuffer = bArr;
        this.bufferList.add(bArr);
        this.pointer = 0L;
        this.currentBufferPointer = 0;
        this.size = 0L;
        this.bufferListIndex = 0;
        this.bufferListMaxIndex = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.currentBuffer = null;
        this.bufferList.clear();
        this.pointer = 0L;
        this.currentBufferPointer = 0;
        this.size = 0L;
        this.bufferListIndex = 0;
    }

    @Override // com.tom_roush.pdfbox.io.RandomAccessRead
    public long getPosition() {
        checkClosed();
        return this.pointer;
    }

    @Override // com.tom_roush.pdfbox.io.RandomAccessRead
    public boolean isClosed() {
        if (this.currentBuffer == null) {
            return true;
        }
        return false;
    }

    @Override // com.tom_roush.pdfbox.io.RandomAccessRead
    public boolean isEOF() {
        checkClosed();
        if (this.pointer >= this.size) {
            return true;
        }
        return false;
    }

    @Override // com.tom_roush.pdfbox.io.RandomAccessRead
    public long length() {
        checkClosed();
        return this.size;
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
        if (this.pointer >= this.size) {
            return -1;
        }
        if (this.currentBufferPointer >= this.chunkSize) {
            int i10 = this.bufferListIndex;
            if (i10 >= this.bufferListMaxIndex) {
                return -1;
            }
            List<byte[]> list = this.bufferList;
            int i11 = i10 + 1;
            this.bufferListIndex = i11;
            this.currentBuffer = list.get(i11);
            this.currentBufferPointer = 0;
        }
        this.pointer++;
        byte[] bArr = this.currentBuffer;
        int i12 = this.currentBufferPointer;
        this.currentBufferPointer = i12 + 1;
        return bArr[i12] & 255;
    }

    @Override // com.tom_roush.pdfbox.io.RandomAccessRead
    public byte[] readFully(int i10) {
        byte[] bArr = new byte[i10];
        int i11 = 0;
        do {
            int read = read(bArr, i11, i10 - i11);
            if (read >= 0) {
                i11 += read;
            } else {
                throw new EOFException();
            }
        } while (i11 < i10);
        return bArr;
    }

    @Override // com.tom_roush.pdfbox.io.RandomAccessRead
    public void rewind(int i10) {
        checkClosed();
        seek(getPosition() - i10);
    }

    @Override // com.tom_roush.pdfbox.io.RandomAccessRead
    public void seek(long j10) {
        checkClosed();
        if (j10 >= 0) {
            this.pointer = j10;
            if (j10 < this.size) {
                int i10 = this.chunkSize;
                int i11 = (int) (j10 / i10);
                this.bufferListIndex = i11;
                this.currentBufferPointer = (int) (j10 % i10);
                this.currentBuffer = this.bufferList.get(i11);
                return;
            }
            int i12 = this.bufferListMaxIndex;
            this.bufferListIndex = i12;
            this.currentBuffer = this.bufferList.get(i12);
            this.currentBufferPointer = (int) (this.size % this.chunkSize);
            return;
        }
        throw new IOException(d.c("Invalid position ", j10));
    }

    @Override // com.tom_roush.pdfbox.io.RandomAccessWrite
    public void write(int i10) {
        checkClosed();
        int i11 = this.currentBufferPointer;
        int i12 = this.chunkSize;
        if (i11 >= i12) {
            if (this.pointer + i12 < 2147483647L) {
                expandBuffer();
            } else {
                throw new IOException("RandomAccessBuffer overflow");
            }
        }
        byte[] bArr = this.currentBuffer;
        int i13 = this.currentBufferPointer;
        int i14 = i13 + 1;
        this.currentBufferPointer = i14;
        bArr[i13] = (byte) i10;
        long j10 = this.pointer + 1;
        this.pointer = j10;
        if (j10 > this.size) {
            this.size = j10;
        }
        int i15 = this.chunkSize;
        if (i14 >= i15) {
            if (j10 + i15 < 2147483647L) {
                expandBuffer();
                return;
            }
            throw new IOException("RandomAccessBuffer overflow");
        }
    }

    private RandomAccessBuffer(int i10) {
        this.chunkSize = 1024;
        this.bufferList = null;
        ArrayList arrayList = new ArrayList();
        this.bufferList = arrayList;
        this.chunkSize = i10;
        byte[] bArr = new byte[i10];
        this.currentBuffer = bArr;
        arrayList.add(bArr);
        this.pointer = 0L;
        this.currentBufferPointer = 0;
        this.size = 0L;
        this.bufferListIndex = 0;
        this.bufferListMaxIndex = 0;
    }

    /* renamed from: clone */
    public RandomAccessBuffer m8clone() {
        RandomAccessBuffer randomAccessBuffer = new RandomAccessBuffer(this.chunkSize);
        randomAccessBuffer.bufferList = new ArrayList(this.bufferList.size());
        for (byte[] bArr : this.bufferList) {
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            randomAccessBuffer.bufferList.add(bArr2);
        }
        if (this.currentBuffer != null) {
            randomAccessBuffer.currentBuffer = (byte[]) a.f(randomAccessBuffer.bufferList, -1);
        } else {
            randomAccessBuffer.currentBuffer = null;
        }
        randomAccessBuffer.pointer = this.pointer;
        randomAccessBuffer.currentBufferPointer = this.currentBufferPointer;
        randomAccessBuffer.size = this.size;
        randomAccessBuffer.bufferListIndex = this.bufferListIndex;
        randomAccessBuffer.bufferListMaxIndex = this.bufferListMaxIndex;
        return randomAccessBuffer;
    }

    @Override // com.tom_roush.pdfbox.io.RandomAccessRead
    public int read(byte[] bArr, int i10, int i11) {
        checkClosed();
        if (this.pointer >= this.size) {
            return -1;
        }
        int readRemainingBytes = readRemainingBytes(bArr, i10, i11);
        while (readRemainingBytes < i11 && available() > 0) {
            readRemainingBytes += readRemainingBytes(bArr, i10 + readRemainingBytes, i11 - readRemainingBytes);
            if (this.currentBufferPointer == this.chunkSize) {
                nextBuffer();
            }
        }
        return readRemainingBytes;
    }

    @Override // com.tom_roush.pdfbox.io.RandomAccessWrite
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public RandomAccessBuffer(byte[] bArr) {
        this.chunkSize = 1024;
        this.bufferList = null;
        ArrayList arrayList = new ArrayList(1);
        this.bufferList = arrayList;
        this.chunkSize = bArr.length;
        this.currentBuffer = bArr;
        arrayList.add(bArr);
        this.pointer = 0L;
        this.currentBufferPointer = 0;
        this.size = this.chunkSize;
        this.bufferListIndex = 0;
        this.bufferListMaxIndex = 0;
    }

    @Override // com.tom_roush.pdfbox.io.RandomAccessWrite
    public void write(byte[] bArr, int i10, int i11) {
        checkClosed();
        long j10 = i11;
        long j11 = this.pointer + j10;
        int i12 = this.chunkSize;
        int i13 = this.currentBufferPointer;
        int i14 = i12 - i13;
        if (i11 < i14) {
            System.arraycopy(bArr, i10, this.currentBuffer, i13, i11);
            this.currentBufferPointer += i11;
        } else if (j11 <= 2147483647L) {
            System.arraycopy(bArr, i10, this.currentBuffer, i13, i14);
            int i15 = i10 + i14;
            long j12 = i11 - i14;
            int i16 = ((int) j12) / this.chunkSize;
            for (int i17 = 0; i17 < i16; i17++) {
                expandBuffer();
                System.arraycopy(bArr, i15, this.currentBuffer, this.currentBufferPointer, this.chunkSize);
                i15 += this.chunkSize;
            }
            long j13 = j12 - (i16 * this.chunkSize);
            int i18 = (j13 > 0L ? 1 : (j13 == 0L ? 0 : -1));
            if (i18 >= 0) {
                expandBuffer();
                if (i18 > 0) {
                    System.arraycopy(bArr, i15, this.currentBuffer, this.currentBufferPointer, (int) j13);
                }
                this.currentBufferPointer = (int) j13;
            }
        } else {
            throw new IOException("RandomAccessBuffer overflow");
        }
        long j14 = this.pointer + j10;
        this.pointer = j14;
        if (j14 > this.size) {
            this.size = j14;
        }
    }

    @Override // com.tom_roush.pdfbox.io.RandomAccessRead
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public RandomAccessBuffer(InputStream inputStream) {
        this();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read > -1) {
                write(bArr, 0, read);
            } else {
                seek(0L);
                return;
            }
        }
    }
}
