package com.bytedance.sdk.component.fl.ac.Qhi.Qhi;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StrictLineReader.java */
/* loaded from: classes.dex */
public class ac implements Closeable {
    private int CJ;
    private final InputStream Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private byte[] f8387ac;
    private final Charset cJ;

    /* renamed from: fl  reason: collision with root package name */
    private int f8388fl;

    public ac(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    private void ac() {
        InputStream inputStream = this.Qhi;
        byte[] bArr = this.f8387ac;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.CJ = 0;
            this.f8388fl = read;
            return;
        }
        throw new EOFException();
    }

    public boolean cJ() {
        if (this.f8388fl == -1) {
            return true;
        }
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.Qhi) {
            if (this.f8387ac != null) {
                this.f8387ac = null;
                this.Qhi.close();
            }
        }
    }

    public ac(InputStream inputStream, int i10, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i10 >= 0) {
            if (charset.equals(fl.Qhi)) {
                this.Qhi = inputStream;
                this.cJ = charset;
                this.f8387ac = new byte[i10];
                return;
            }
            throw new IllegalArgumentException("Unsupported encoding");
        }
        throw new IllegalArgumentException("capacity <= 0");
    }

    public String Qhi() {
        int i10;
        byte[] bArr;
        int i11;
        synchronized (this.Qhi) {
            if (this.f8387ac != null) {
                if (this.CJ >= this.f8388fl) {
                    ac();
                }
                for (int i12 = this.CJ; i12 != this.f8388fl; i12++) {
                    byte[] bArr2 = this.f8387ac;
                    if (bArr2[i12] == 10) {
                        int i13 = this.CJ;
                        if (i12 != i13) {
                            i11 = i12 - 1;
                            if (bArr2[i11] == 13) {
                                String str = new String(bArr2, i13, i11 - i13, this.cJ.name());
                                this.CJ = i12 + 1;
                                return str;
                            }
                        }
                        i11 = i12;
                        String str2 = new String(bArr2, i13, i11 - i13, this.cJ.name());
                        this.CJ = i12 + 1;
                        return str2;
                    }
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((this.f8388fl - this.CJ) + 80) { // from class: com.bytedance.sdk.component.fl.ac.Qhi.Qhi.ac.1
                    @Override // java.io.ByteArrayOutputStream
                    public String toString() {
                        int i14 = ((ByteArrayOutputStream) this).count;
                        if (i14 > 0 && ((ByteArrayOutputStream) this).buf[i14 - 1] == 13) {
                            i14--;
                        }
                        try {
                            return new String(((ByteArrayOutputStream) this).buf, 0, i14, ac.this.cJ.name());
                        } catch (UnsupportedEncodingException e10) {
                            throw new AssertionError(e10);
                        }
                    }
                };
                loop1: while (true) {
                    byte[] bArr3 = this.f8387ac;
                    int i14 = this.CJ;
                    byteArrayOutputStream.write(bArr3, i14, this.f8388fl - i14);
                    this.f8388fl = -1;
                    ac();
                    i10 = this.CJ;
                    while (i10 != this.f8388fl) {
                        bArr = this.f8387ac;
                        if (bArr[i10] == 10) {
                            break loop1;
                        }
                        i10++;
                    }
                }
                int i15 = this.CJ;
                if (i10 != i15) {
                    byteArrayOutputStream.write(bArr, i15, i10 - i15);
                }
                this.CJ = i10 + 1;
                return byteArrayOutputStream.toString();
            }
            throw new IOException("LineReader is closed");
        }
    }
}
