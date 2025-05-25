package r3;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* compiled from: StrictLineReader.java */
/* loaded from: classes.dex */
public final class b implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public final InputStream f29460a;

    /* renamed from: b  reason: collision with root package name */
    public final Charset f29461b;
    public byte[] c;

    /* renamed from: d  reason: collision with root package name */
    public int f29462d;

    /* renamed from: e  reason: collision with root package name */
    public int f29463e;

    /* compiled from: StrictLineReader.java */
    /* loaded from: classes.dex */
    public class a extends ByteArrayOutputStream {
        public a(int i10) {
            super(i10);
        }

        @Override // java.io.ByteArrayOutputStream
        public final String toString() {
            int i10 = ((ByteArrayOutputStream) this).count;
            if (i10 > 0 && ((ByteArrayOutputStream) this).buf[i10 - 1] == 13) {
                i10--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i10, b.this.f29461b.name());
            } catch (UnsupportedEncodingException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public b(FileInputStream fileInputStream, Charset charset) {
        if (charset != null) {
            if (charset.equals(c.f29465a)) {
                this.f29460a = fileInputStream;
                this.f29461b = charset;
                this.c = new byte[8192];
                return;
            }
            throw new IllegalArgumentException("Unsupported encoding");
        }
        throw null;
    }

    public final String a() {
        int i10;
        synchronized (this.f29460a) {
            byte[] bArr = this.c;
            if (bArr != null) {
                if (this.f29462d >= this.f29463e) {
                    int read = this.f29460a.read(bArr, 0, bArr.length);
                    if (read != -1) {
                        this.f29462d = 0;
                        this.f29463e = read;
                    } else {
                        throw new EOFException();
                    }
                }
                for (int i11 = this.f29462d; i11 != this.f29463e; i11++) {
                    byte[] bArr2 = this.c;
                    if (bArr2[i11] == 10) {
                        int i12 = this.f29462d;
                        if (i11 != i12) {
                            i10 = i11 - 1;
                            if (bArr2[i10] == 13) {
                                String str = new String(bArr2, i12, i10 - i12, this.f29461b.name());
                                this.f29462d = i11 + 1;
                                return str;
                            }
                        }
                        i10 = i11;
                        String str2 = new String(bArr2, i12, i10 - i12, this.f29461b.name());
                        this.f29462d = i11 + 1;
                        return str2;
                    }
                }
                a aVar = new a((this.f29463e - this.f29462d) + 80);
                while (true) {
                    byte[] bArr3 = this.c;
                    int i13 = this.f29462d;
                    aVar.write(bArr3, i13, this.f29463e - i13);
                    this.f29463e = -1;
                    byte[] bArr4 = this.c;
                    int read2 = this.f29460a.read(bArr4, 0, bArr4.length);
                    if (read2 != -1) {
                        this.f29462d = 0;
                        this.f29463e = read2;
                        for (int i14 = 0; i14 != this.f29463e; i14++) {
                            byte[] bArr5 = this.c;
                            if (bArr5[i14] == 10) {
                                int i15 = this.f29462d;
                                if (i14 != i15) {
                                    aVar.write(bArr5, i15, i14 - i15);
                                }
                                this.f29462d = i14 + 1;
                                return aVar.toString();
                            }
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            } else {
                throw new IOException("LineReader is closed");
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f29460a) {
            if (this.c != null) {
                this.c = null;
                this.f29460a.close();
            }
        }
    }
}
