package com.tom_roush.fontbox.ttf;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.RandomAccessFile;

/* loaded from: classes2.dex */
class RAFDataStream extends TTFDataStream {
    private static final int BUFFERSIZE = 16384;
    private RandomAccessFile raf;
    private File ttfFile;

    public RAFDataStream(String str, String str2) {
        this(new File(str), str2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        RandomAccessFile randomAccessFile = this.raf;
        if (randomAccessFile != null) {
            randomAccessFile.close();
            this.raf = null;
        }
    }

    @Override // com.tom_roush.fontbox.ttf.TTFDataStream
    public long getCurrentPosition() {
        return this.raf.getFilePointer();
    }

    @Override // com.tom_roush.fontbox.ttf.TTFDataStream
    public InputStream getOriginalData() {
        return new FileInputStream(this.ttfFile);
    }

    @Override // com.tom_roush.fontbox.ttf.TTFDataStream
    public long getOriginalDataSize() {
        return this.ttfFile.length();
    }

    @Override // com.tom_roush.fontbox.ttf.TTFDataStream
    public int read() {
        return this.raf.read();
    }

    @Override // com.tom_roush.fontbox.ttf.TTFDataStream
    public long readLong() {
        return this.raf.readLong();
    }

    @Override // com.tom_roush.fontbox.ttf.TTFDataStream
    public short readSignedShort() {
        return this.raf.readShort();
    }

    @Override // com.tom_roush.fontbox.ttf.TTFDataStream
    public int readUnsignedShort() {
        return this.raf.readUnsignedShort();
    }

    @Override // com.tom_roush.fontbox.ttf.TTFDataStream
    public void seek(long j10) {
        this.raf.seek(j10);
    }

    public RAFDataStream(File file, String str) {
        this.raf = null;
        this.ttfFile = null;
        this.raf = new BufferedRandomAccessFile(file, str, 16384);
        this.ttfFile = file;
    }

    @Override // com.tom_roush.fontbox.ttf.TTFDataStream
    public int read(byte[] bArr, int i10, int i11) {
        return this.raf.read(bArr, i10, i11);
    }
}
