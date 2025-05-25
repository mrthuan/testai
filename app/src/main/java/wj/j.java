package wj;

import java.io.InputStream;
import java.io.PushbackInputStream;

/* compiled from: ZipEntryInputStream.java */
/* loaded from: classes3.dex */
public final class j extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    public final InputStream f31285a;

    /* renamed from: b  reason: collision with root package name */
    public long f31286b = 0;
    public final byte[] c = new byte[1];

    /* renamed from: d  reason: collision with root package name */
    public final long f31287d;

    public j(PushbackInputStream pushbackInputStream, long j10) {
        this.f31285a = pushbackInputStream;
        this.f31287d = j10;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f31285a.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.c;
        if (read(bArr) == -1) {
            return -1;
        }
        return bArr[0];
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        long j10 = this.f31287d;
        if (j10 != -1) {
            long j11 = this.f31286b;
            if (j11 >= j10) {
                return -1;
            }
            if (i11 > j10 - j11) {
                i11 = (int) (j10 - j11);
            }
        }
        int read = this.f31285a.read(bArr, i10, i11);
        if (read > 0) {
            this.f31286b += read;
        }
        return read;
    }
}
