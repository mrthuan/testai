package com.tom_roush.harmony.javax.imageio.stream;

import java.io.InputStream;

/* loaded from: classes2.dex */
public class MemoryCacheImageInputStream extends ImageInputStreamImpl {
    private InputStream is;
    private RandomAccessMemoryCache ramc = new RandomAccessMemoryCache();

    public MemoryCacheImageInputStream(InputStream inputStream) {
        if (inputStream != null) {
            this.is = inputStream;
            return;
        }
        throw new IllegalArgumentException("stream == null!");
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStreamImpl, com.tom_roush.harmony.javax.imageio.stream.ImageInputStream
    public void close() {
        super.close();
        this.ramc.close();
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStreamImpl, com.tom_roush.harmony.javax.imageio.stream.ImageInputStream
    public void flushBefore(long j10) {
        super.flushBefore(j10);
        this.ramc.freeBefore(getFlushedPosition());
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
    public int read() {
        this.bitOffset = 0;
        if (this.streamPos >= this.ramc.length()) {
            int length = (int) ((this.streamPos - this.ramc.length()) + 1);
            if (this.ramc.appendData(this.is, length) < length) {
                return -1;
            }
        }
        int data = this.ramc.getData(this.streamPos);
        if (data >= 0) {
            this.streamPos++;
        }
        return data;
    }

    @Override // com.tom_roush.harmony.javax.imageio.stream.ImageInputStreamImpl, com.tom_roush.harmony.javax.imageio.stream.ImageInputStream
    public int read(byte[] bArr, int i10, int i11) {
        this.bitOffset = 0;
        if (this.streamPos >= this.ramc.length()) {
            this.ramc.appendData(this.is, (int) ((this.streamPos - this.ramc.length()) + i11));
        }
        int data = this.ramc.getData(bArr, i10, i11, this.streamPos);
        if (data > 0) {
            this.streamPos += data;
        }
        return data;
    }
}
