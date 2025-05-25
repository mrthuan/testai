package com.inmobi.media;

import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public final class Ua implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public final InputStream f14737a;

    /* renamed from: b  reason: collision with root package name */
    public final Charset f14738b;
    public byte[] c;

    /* renamed from: d  reason: collision with root package name */
    public int f14739d;

    /* renamed from: e  reason: collision with root package name */
    public int f14740e;

    public Ua(FileInputStream fileInputStream, Charset charset) {
        charset.getClass();
        if (charset.equals(Ub.f14741a)) {
            this.f14737a = fileInputStream;
            this.f14738b = charset;
            this.c = new byte[8192];
            return;
        }
        throw new IllegalArgumentException("Unsupported encoding");
    }

    public final String a() {
        int i10;
        synchronized (this.f14737a) {
            byte[] bArr = this.c;
            if (bArr != null) {
                if (this.f14739d >= this.f14740e) {
                    int read = this.f14737a.read(bArr, 0, bArr.length);
                    if (read != -1) {
                        this.f14739d = 0;
                        this.f14740e = read;
                    } else {
                        throw new EOFException();
                    }
                }
                for (int i11 = this.f14739d; i11 != this.f14740e; i11++) {
                    byte[] bArr2 = this.c;
                    if (bArr2[i11] == 10) {
                        int i12 = this.f14739d;
                        if (i11 != i12) {
                            i10 = i11 - 1;
                            if (bArr2[i10] == 13) {
                                String str = new String(bArr2, i12, i10 - i12, this.f14738b.name());
                                this.f14739d = i11 + 1;
                                return str;
                            }
                        }
                        i10 = i11;
                        String str2 = new String(bArr2, i12, i10 - i12, this.f14738b.name());
                        this.f14739d = i11 + 1;
                        return str2;
                    }
                }
                Ta ta2 = new Ta(this, (this.f14740e - this.f14739d) + 80);
                while (true) {
                    byte[] bArr3 = this.c;
                    int i13 = this.f14739d;
                    ta2.write(bArr3, i13, this.f14740e - i13);
                    this.f14740e = -1;
                    InputStream inputStream = this.f14737a;
                    byte[] bArr4 = this.c;
                    int read2 = inputStream.read(bArr4, 0, bArr4.length);
                    if (read2 != -1) {
                        this.f14739d = 0;
                        this.f14740e = read2;
                        for (int i14 = 0; i14 != this.f14740e; i14++) {
                            byte[] bArr5 = this.c;
                            if (bArr5[i14] == 10) {
                                int i15 = this.f14739d;
                                if (i14 != i15) {
                                    ta2.write(bArr5, i15, i14 - i15);
                                }
                                this.f14739d = i14 + 1;
                                return ta2.toString();
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
        synchronized (this.f14737a) {
            if (this.c != null) {
                this.c = null;
                this.f14737a.close();
            }
        }
    }
}
