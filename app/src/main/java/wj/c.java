package wj;

import java.io.InputStream;
import java.io.PushbackInputStream;

/* compiled from: DecompressedInputStream.java */
/* loaded from: classes3.dex */
public abstract class c extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    public final b<?> f31274a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f31275b = new byte[1];

    public c(b<?> bVar) {
        this.f31274a = bVar;
    }

    public void a(PushbackInputStream pushbackInputStream, int i10) {
        this.f31274a.a(pushbackInputStream, i10);
    }

    public int b(PushbackInputStream pushbackInputStream) {
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f31274a.close();
    }

    @Override // java.io.InputStream
    public int read() {
        byte[] bArr = this.f31275b;
        if (read(bArr) == -1) {
            return -1;
        }
        return bArr[0];
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        return this.f31274a.read(bArr, i10, i11);
    }
}
