package p4;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* compiled from: ExceptionCatchingInputStream.java */
/* loaded from: classes.dex */
public final class d extends InputStream {
    public static final ArrayDeque c;

    /* renamed from: a  reason: collision with root package name */
    public InputStream f23692a;

    /* renamed from: b  reason: collision with root package name */
    public IOException f23693b;

    static {
        char[] cArr = j.f23703a;
        c = new ArrayDeque(0);
    }

    public final void a() {
        this.f23693b = null;
        this.f23692a = null;
        ArrayDeque arrayDeque = c;
        synchronized (arrayDeque) {
            arrayDeque.offer(this);
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f23692a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f23692a.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i10) {
        this.f23692a.mark(i10);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f23692a.markSupported();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        try {
            return this.f23692a.read(bArr);
        } catch (IOException e10) {
            this.f23693b = e10;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.f23692a.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j10) {
        try {
            return this.f23692a.skip(j10);
        } catch (IOException e10) {
            this.f23693b = e10;
            return 0L;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        try {
            return this.f23692a.read(bArr, i10, i11);
        } catch (IOException e10) {
            this.f23693b = e10;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        try {
            return this.f23692a.read();
        } catch (IOException e10) {
            this.f23693b = e10;
            return -1;
        }
    }
}
