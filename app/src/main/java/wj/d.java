package wj;

import java.io.PushbackInputStream;
import java.util.zip.Inflater;

/* compiled from: InflaterInputStream.java */
/* loaded from: classes3.dex */
public final class d extends c {
    public Inflater c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f31276d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f31277e;

    /* renamed from: f  reason: collision with root package name */
    public int f31278f;

    public d(b<?> bVar, int i10) {
        super(bVar);
        this.f31277e = new byte[1];
        this.c = new Inflater(true);
        this.f31276d = new byte[i10];
    }

    @Override // wj.c
    public final void a(PushbackInputStream pushbackInputStream, int i10) {
        Inflater inflater = this.c;
        if (inflater != null) {
            inflater.end();
            this.c = null;
        }
        super.a(pushbackInputStream, i10);
    }

    @Override // wj.c
    public final int b(PushbackInputStream pushbackInputStream) {
        int remaining = this.c.getRemaining();
        if (remaining > 0) {
            pushbackInputStream.unread(this.f31274a.c, this.f31278f - remaining, remaining);
        }
        return remaining;
    }

    @Override // wj.c, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Inflater inflater = this.c;
        if (inflater != null) {
            inflater.end();
        }
        super.close();
    }

    @Override // wj.c, java.io.InputStream
    public final int read() {
        byte[] bArr = this.f31277e;
        if (read(bArr) == -1) {
            return -1;
        }
        return bArr[0];
    }

    @Override // wj.c, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
        throw new java.io.EOFException("Unexpected end of input stream");
     */
    @Override // wj.c, java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int read(byte[] r5, int r6, int r7) {
        /*
            r4 = this;
        L0:
            java.util.zip.Inflater r0 = r4.c     // Catch: java.util.zip.DataFormatException -> L3e
            int r0 = r0.inflate(r5, r6, r7)     // Catch: java.util.zip.DataFormatException -> L3e
            if (r0 != 0) goto L3d
            java.util.zip.Inflater r0 = r4.c     // Catch: java.util.zip.DataFormatException -> L3e
            boolean r0 = r0.finished()     // Catch: java.util.zip.DataFormatException -> L3e
            r1 = -1
            if (r0 != 0) goto L3c
            java.util.zip.Inflater r0 = r4.c     // Catch: java.util.zip.DataFormatException -> L3e
            boolean r0 = r0.needsDictionary()     // Catch: java.util.zip.DataFormatException -> L3e
            if (r0 == 0) goto L1a
            goto L3c
        L1a:
            java.util.zip.Inflater r0 = r4.c     // Catch: java.util.zip.DataFormatException -> L3e
            boolean r0 = r0.needsInput()     // Catch: java.util.zip.DataFormatException -> L3e
            if (r0 == 0) goto L0
            byte[] r0 = r4.f31276d     // Catch: java.util.zip.DataFormatException -> L3e
            int r2 = r0.length     // Catch: java.util.zip.DataFormatException -> L3e
            r3 = 0
            int r2 = super.read(r0, r3, r2)     // Catch: java.util.zip.DataFormatException -> L3e
            r4.f31278f = r2     // Catch: java.util.zip.DataFormatException -> L3e
            if (r2 == r1) goto L34
            java.util.zip.Inflater r1 = r4.c     // Catch: java.util.zip.DataFormatException -> L3e
            r1.setInput(r0, r3, r2)     // Catch: java.util.zip.DataFormatException -> L3e
            goto L0
        L34:
            java.io.EOFException r5 = new java.io.EOFException     // Catch: java.util.zip.DataFormatException -> L3e
            java.lang.String r6 = "Unexpected end of input stream"
            r5.<init>(r6)     // Catch: java.util.zip.DataFormatException -> L3e
            throw r5     // Catch: java.util.zip.DataFormatException -> L3e
        L3c:
            return r1
        L3d:
            return r0
        L3e:
            r5 = move-exception
            java.io.IOException r6 = new java.io.IOException
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: wj.d.read(byte[], int, int):int");
    }
}
