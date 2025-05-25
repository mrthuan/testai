package com.tom_roush.fontbox.ttf;

import androidx.appcompat.view.menu.d;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
class MemoryTTFDataStream extends TTFDataStream {
    private int currentPosition = 0;
    private byte[] data;

    public MemoryTTFDataStream(InputStream inputStream) {
        this.data = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(inputStream.available());
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    this.data = byteArrayOutputStream.toByteArray();
                    return;
                }
            }
        } finally {
            inputStream.close();
        }
    }

    @Override // com.tom_roush.fontbox.ttf.TTFDataStream
    public long getCurrentPosition() {
        return this.currentPosition;
    }

    @Override // com.tom_roush.fontbox.ttf.TTFDataStream
    public InputStream getOriginalData() {
        return new ByteArrayInputStream(this.data);
    }

    @Override // com.tom_roush.fontbox.ttf.TTFDataStream
    public long getOriginalDataSize() {
        return this.data.length;
    }

    @Override // com.tom_roush.fontbox.ttf.TTFDataStream
    public int read() {
        int i10 = this.currentPosition;
        byte[] bArr = this.data;
        if (i10 >= bArr.length) {
            return -1;
        }
        byte b10 = bArr[i10];
        this.currentPosition = i10 + 1;
        return (b10 + 256) % 256;
    }

    @Override // com.tom_roush.fontbox.ttf.TTFDataStream
    public long readLong() {
        return (readSignedInt() << 32) + (readSignedInt() & 4294967295L);
    }

    public int readSignedInt() {
        int read = read();
        int read2 = read();
        int read3 = read();
        int read4 = read();
        if ((read | read2 | read3 | read4) >= 0) {
            return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
        }
        throw new EOFException();
    }

    @Override // com.tom_roush.fontbox.ttf.TTFDataStream
    public short readSignedShort() {
        int read = read();
        int read2 = read();
        if ((read | read2) >= 0) {
            return (short) ((read << 8) + read2);
        }
        throw new EOFException();
    }

    @Override // com.tom_roush.fontbox.ttf.TTFDataStream
    public int readUnsignedShort() {
        int read = read();
        int read2 = read();
        if ((read | read2) >= 0) {
            return (read << 8) + read2;
        }
        throw new EOFException();
    }

    @Override // com.tom_roush.fontbox.ttf.TTFDataStream
    public void seek(long j10) {
        if (j10 >= 0 && j10 <= 2147483647L) {
            this.currentPosition = (int) j10;
            return;
        }
        throw new IOException(d.c("Illegal seek position: ", j10));
    }

    @Override // com.tom_roush.fontbox.ttf.TTFDataStream
    public int read(byte[] bArr, int i10, int i11) {
        int i12 = this.currentPosition;
        byte[] bArr2 = this.data;
        if (i12 < bArr2.length) {
            int min = Math.min(i11, bArr2.length - i12);
            System.arraycopy(this.data, this.currentPosition, bArr, i10, min);
            this.currentPosition += min;
            return min;
        }
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
