package p4;

import androidx.activity.r;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ContentLengthInputStream.java */
/* loaded from: classes.dex */
public final class c extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    public final long f23690a;

    /* renamed from: b  reason: collision with root package name */
    public int f23691b;

    public c(InputStream inputStream, long j10) {
        super(inputStream);
        this.f23690a = j10;
    }

    public final void a(int i10) {
        if (i10 >= 0) {
            this.f23691b += i10;
            return;
        }
        long j10 = this.f23690a;
        if (j10 - this.f23691b <= 0) {
            return;
        }
        StringBuilder h10 = r.h("Failed to read all expected data, expected: ", j10, ", but read: ");
        h10.append(this.f23691b);
        throw new IOException(h10.toString());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return (int) Math.max(this.f23690a - this.f23691b, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int read;
        read = super.read();
        a(read >= 0 ? 1 : -1);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i10, int i11) {
        int read;
        read = super.read(bArr, i10, i11);
        a(read);
        return read;
    }
}
