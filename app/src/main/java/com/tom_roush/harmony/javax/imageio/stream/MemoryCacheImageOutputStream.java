package com.tom_roush.harmony.javax.imageio.stream;

import java.io.OutputStream;

/* loaded from: classes2.dex */
public class MemoryCacheImageOutputStream extends ImageOutputStreamImpl {
    OutputStream os;
    RandomAccessMemoryCache ramc = new RandomAccessMemoryCache();

    public MemoryCacheImageOutputStream(OutputStream outputStream) {
        if (outputStream != null) {
            this.os = outputStream;
            return;
        }
        throw new IllegalArgumentException("stream == null!");
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStreamImpl, com.tom_roush.harmony.javax.imageio.stream.ImageInputStream
    public void close() {
        long length = length();
        seek(length);
        flushBefore(length);
        super.close();
        this.ramc.close();
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStreamImpl, com.tom_roush.harmony.javax.imageio.stream.ImageInputStream
    public void flushBefore(long j10) {
        long flushedPosition = getFlushedPosition();
        super.flushBefore(j10);
        long flushedPosition2 = getFlushedPosition();
        this.ramc.getData(this.os, (int) (flushedPosition2 - flushedPosition), flushedPosition);
        this.ramc.freeBefore(flushedPosition2);
        this.os.flush();
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStreamImpl, com.tom_roush.harmony.javax.imageio.stream.ImageInputStream
    public boolean isCached() {
        return true;
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStreamImpl, com.tom_roush.harmony.javax.imageio.stream.ImageInputStream
    public boolean isCachedFile() {
        return false;
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStreamImpl, com.tom_roush.harmony.javax.imageio.stream.ImageInputStream
    public boolean isCachedMemory() {
        return true;
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStreamImpl, com.tom_roush.harmony.javax.imageio.stream.ImageInputStream
    public long length() {
        return this.ramc.length();
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStreamImpl, com.tom_roush.harmony.javax.imageio.stream.ImageInputStream
    public int read() {
        this.bitOffset = 0;
        int data = this.ramc.getData(this.streamPos);
        if (data >= 0) {
            this.streamPos++;
        }
        return data;
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageOutputStreamImpl, com.tom_roush.harmony.javax.imageio.stream.ImageOutputStream, java.io.DataOutput
    public void write(int i10) {
        flushBits();
        this.ramc.putData(i10, this.streamPos);
        this.streamPos++;
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStreamImpl, com.tom_roush.harmony.javax.imageio.stream.ImageInputStream
    public int read(byte[] bArr, int i10, int i11) {
        this.bitOffset = 0;
        int data = this.ramc.getData(bArr, i10, i11, this.streamPos);
        if (data > 0) {
            this.streamPos += data;
        }
        return data;
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageOutputStreamImpl, com.tom_roush.harmony.javax.imageio.stream.ImageOutputStream, java.io.DataOutput
    public void write(byte[] bArr, int i10, int i11) {
        flushBits();
        this.ramc.putData(bArr, i10, i11, this.streamPos);
        this.streamPos += i11;
    }
}
