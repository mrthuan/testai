package com.squareup.picasso;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
final class MarkableInputStream extends InputStream {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    private static final int DEFAULT_LIMIT_INCREMENT = 1024;
    private boolean allowExpire;
    private long defaultMark;

    /* renamed from: in  reason: collision with root package name */
    private final InputStream f15973in;
    private long limit;
    private int limitIncrement;
    private long offset;
    private long reset;

    public MarkableInputStream(InputStream inputStream) {
        this(inputStream, 4096);
    }

    private void setLimit(long j10) {
        try {
            long j11 = this.reset;
            long j12 = this.offset;
            if (j11 < j12 && j12 <= this.limit) {
                this.f15973in.reset();
                this.f15973in.mark((int) (j10 - this.reset));
                skip(this.reset, this.offset);
            } else {
                this.reset = j12;
                this.f15973in.mark((int) (j10 - j12));
            }
            this.limit = j10;
        } catch (IOException e10) {
            throw new IllegalStateException("Unable to mark: " + e10);
        }
    }

    private void skip(long j10, long j11) {
        while (j10 < j11) {
            long skip = this.f15973in.skip(j11 - j10);
            if (skip == 0) {
                if (read() == -1) {
                    return;
                }
                skip = 1;
            }
            j10 += skip;
        }
    }

    public void allowMarksToExpire(boolean z10) {
        this.allowExpire = z10;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f15973in.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f15973in.close();
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.defaultMark = savePosition(i10);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f15973in.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        if (!this.allowExpire) {
            long j10 = this.limit;
            if (this.offset + 1 > j10) {
                setLimit(j10 + this.limitIncrement);
            }
        }
        int read = this.f15973in.read();
        if (read != -1) {
            this.offset++;
        }
        return read;
    }

    @Override // java.io.InputStream
    public void reset() {
        reset(this.defaultMark);
    }

    public long savePosition(int i10) {
        long j10 = this.offset + i10;
        if (this.limit < j10) {
            setLimit(j10);
        }
        return this.offset;
    }

    public MarkableInputStream(InputStream inputStream, int i10) {
        this(inputStream, i10, 1024);
    }

    public void reset(long j10) {
        if (this.offset <= this.limit && j10 >= this.reset) {
            this.f15973in.reset();
            skip(this.reset, j10);
            this.offset = j10;
            return;
        }
        throw new IOException("Cannot reset");
    }

    private MarkableInputStream(InputStream inputStream, int i10, int i11) {
        this.defaultMark = -1L;
        this.allowExpire = true;
        this.limitIncrement = -1;
        this.f15973in = inputStream.markSupported() ? inputStream : new BufferedInputStream(inputStream, i10);
        this.limitIncrement = i11;
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        if (!this.allowExpire) {
            long j11 = this.offset;
            if (j11 + j10 > this.limit) {
                setLimit(j11 + j10 + this.limitIncrement);
            }
        }
        long skip = this.f15973in.skip(j10);
        this.offset += skip;
        return skip;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        if (!this.allowExpire) {
            long j10 = this.offset;
            if (bArr.length + j10 > this.limit) {
                setLimit(j10 + bArr.length + this.limitIncrement);
            }
        }
        int read = this.f15973in.read(bArr);
        if (read != -1) {
            this.offset += read;
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        if (!this.allowExpire) {
            long j10 = this.offset;
            long j11 = i11;
            if (j10 + j11 > this.limit) {
                setLimit(j10 + j11 + this.limitIncrement);
            }
        }
        int read = this.f15973in.read(bArr, i10, i11);
        if (read != -1) {
            this.offset += read;
        }
        return read;
    }
}
