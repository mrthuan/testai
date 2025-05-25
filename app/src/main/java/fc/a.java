package fc;

import industries.deepthought.decode.Decoder;
import java.io.InputStream;

/* compiled from: ZJInputStream.java */
/* loaded from: classes2.dex */
public final class a extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    public long f17266a = 0;

    /* renamed from: b  reason: collision with root package name */
    public volatile InputStream f17267b;

    public a(InputStream inputStream) {
        this.f17267b = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f17267b.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f17267b.close();
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i10) {
        this.f17267b.mark(i10);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f17267b.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() {
        return this.f17267b.read();
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.f17267b.reset();
        this.f17266a = 0L;
    }

    @Override // java.io.InputStream
    public final long skip(long j10) {
        long skip = this.f17267b.skip(j10);
        this.f17266a += skip;
        return skip;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        int read = this.f17267b.read(bArr, i10, i11);
        long j10 = this.f17266a;
        try {
            if (Decoder.f18572a) {
                Decoder.decodeNative(bArr, i10, i11, j10);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        if (read != -1) {
            this.f17266a += read;
        }
        return read;
    }
}
