package wj;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import net.lingala.zip4j.model.enums.CompressionMethod;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import uj.b;

/* compiled from: CipherInputStream.java */
/* loaded from: classes3.dex */
public abstract class b<T extends uj.b> extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    public final j f31271a;

    /* renamed from: b  reason: collision with root package name */
    public final T f31272b;
    public final byte[] c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f31273d = new byte[1];

    public b(j jVar, xj.g gVar, char[] cArr, int i10, boolean z10) {
        this.f31271a = jVar;
        this.f31272b = b(gVar, cArr, z10);
        if (t0.O(gVar).equals(CompressionMethod.DEFLATE)) {
            this.c = new byte[i10];
        }
    }

    public abstract T b(xj.g gVar, char[] cArr, boolean z10);

    public final void c(byte[] bArr) {
        InputStream inputStream = this.f31271a.f31285a;
        int read = inputStream.read(bArr);
        if (read != -1) {
            if (read != bArr.length) {
                int length = bArr.length - read;
                int i10 = 0;
                for (int i11 = 0; read < bArr.length && i10 != -1 && i11 < 15; i11++) {
                    i10 += inputStream.read(bArr, read, length);
                    if (i10 > 0) {
                        read += i10;
                        length -= i10;
                    }
                }
                if (read != bArr.length) {
                    throw new IOException("Cannot read fully into byte buffer");
                }
                return;
            }
            return;
        }
        throw new IOException("Unexpected EOF reached when trying to read stream");
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f31271a.close();
    }

    @Override // java.io.InputStream
    public int read() {
        byte[] bArr = this.f31273d;
        if (read(bArr) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        int k02 = t0.k0(this.f31271a, bArr, i10, i11);
        if (k02 > 0) {
            byte[] bArr2 = this.c;
            if (bArr2 != null) {
                System.arraycopy(bArr, 0, bArr2, 0, k02);
            }
            this.f31272b.a(i10, k02, bArr);
        }
        return k02;
    }

    public void a(PushbackInputStream pushbackInputStream, int i10) {
    }
}
