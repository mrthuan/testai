package lib.zj.office.fc.poifs.nio;

import java.io.OutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public class ByteArrayBackedDataSource extends DataSource {
    private byte[] buffer;
    private long size;

    public ByteArrayBackedDataSource(byte[] bArr, int i10) {
        this.buffer = bArr;
        this.size = i10;
    }

    private void extend(long j10) {
        byte[] bArr = this.buffer;
        long length = j10 - bArr.length;
        if (length < bArr.length * 0.25d) {
            length = (long) (bArr.length * 0.25d);
        }
        if (length < 4096) {
            length = 4096;
        }
        byte[] bArr2 = new byte[(int) (length + bArr.length)];
        System.arraycopy(bArr, 0, bArr2, 0, (int) this.size);
        this.buffer = bArr2;
    }

    @Override // lib.zj.office.fc.poifs.nio.DataSource
    public void close() {
        this.buffer = null;
        this.size = -1L;
    }

    @Override // lib.zj.office.fc.poifs.nio.DataSource
    public void copyTo(OutputStream outputStream) {
        outputStream.write(this.buffer, 0, (int) this.size);
    }

    @Override // lib.zj.office.fc.poifs.nio.DataSource
    public ByteBuffer read(int i10, long j10) {
        long j11 = this.size;
        if (j10 < j11) {
            return ByteBuffer.wrap(this.buffer, (int) j10, (int) Math.min(i10, j11 - j10));
        }
        throw new IndexOutOfBoundsException("Unable to read " + i10 + " bytes from " + j10 + " in stream of length " + this.size);
    }

    @Override // lib.zj.office.fc.poifs.nio.DataSource
    public long size() {
        return this.size;
    }

    @Override // lib.zj.office.fc.poifs.nio.DataSource
    public void write(ByteBuffer byteBuffer, long j10) {
        long capacity = byteBuffer.capacity() + j10;
        if (capacity > this.buffer.length) {
            extend(capacity);
        }
        byteBuffer.get(this.buffer, (int) j10, byteBuffer.capacity());
        if (capacity > this.size) {
            this.size = capacity;
        }
    }

    public ByteArrayBackedDataSource(byte[] bArr) {
        this(bArr, bArr.length);
    }
}
