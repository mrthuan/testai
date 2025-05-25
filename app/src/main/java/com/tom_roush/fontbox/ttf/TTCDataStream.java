package com.tom_roush.fontbox.ttf;

import java.io.InputStream;

/* loaded from: classes2.dex */
class TTCDataStream extends TTFDataStream {
    private final TTFDataStream stream;

    public TTCDataStream(TTFDataStream tTFDataStream) {
        this.stream = tTFDataStream;
    }

    @Override // com.tom_roush.fontbox.ttf.TTFDataStream
    public long getCurrentPosition() {
        return this.stream.getCurrentPosition();
    }

    @Override // com.tom_roush.fontbox.ttf.TTFDataStream
    public InputStream getOriginalData() {
        return this.stream.getOriginalData();
    }

    @Override // com.tom_roush.fontbox.ttf.TTFDataStream
    public long getOriginalDataSize() {
        return this.stream.getOriginalDataSize();
    }

    @Override // com.tom_roush.fontbox.ttf.TTFDataStream
    public int read() {
        return this.stream.read();
    }

    @Override // com.tom_roush.fontbox.ttf.TTFDataStream
    public long readLong() {
        return this.stream.readLong();
    }

    @Override // com.tom_roush.fontbox.ttf.TTFDataStream
    public short readSignedShort() {
        return this.stream.readSignedShort();
    }

    @Override // com.tom_roush.fontbox.ttf.TTFDataStream
    public int readUnsignedShort() {
        return this.stream.readUnsignedShort();
    }

    @Override // com.tom_roush.fontbox.ttf.TTFDataStream
    public void seek(long j10) {
        this.stream.seek(j10);
    }

    @Override // com.tom_roush.fontbox.ttf.TTFDataStream
    public int read(byte[] bArr, int i10, int i11) {
        return this.stream.read(bArr, i10, i11);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
