package com.bumptech.glide.load.data;

import java.io.FileOutputStream;
import java.io.OutputStream;

/* compiled from: BufferedOutputStream.java */
/* loaded from: classes.dex */
public final class c extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    public final OutputStream f6875a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f6876b;
    public final w3.b c;

    /* renamed from: d  reason: collision with root package name */
    public int f6877d;

    public c(FileOutputStream fileOutputStream, w3.b bVar) {
        this.f6875a = fileOutputStream;
        this.c = bVar;
        this.f6876b = (byte[]) bVar.c(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        OutputStream outputStream = this.f6875a;
        try {
            flush();
            outputStream.close();
            byte[] bArr = this.f6876b;
            if (bArr != null) {
                this.c.put(bArr);
                this.f6876b = null;
            }
        } catch (Throwable th2) {
            outputStream.close();
            throw th2;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        int i10 = this.f6877d;
        OutputStream outputStream = this.f6875a;
        if (i10 > 0) {
            outputStream.write(this.f6876b, 0, i10);
            this.f6877d = 0;
        }
        outputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i10) {
        byte[] bArr = this.f6876b;
        int i11 = this.f6877d;
        int i12 = i11 + 1;
        this.f6877d = i12;
        bArr[i11] = (byte) i10;
        if (i12 != bArr.length || i12 <= 0) {
            return;
        }
        this.f6875a.write(bArr, 0, i12);
        this.f6877d = 0;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        do {
            int i13 = i11 - i12;
            int i14 = i10 + i12;
            int i15 = this.f6877d;
            OutputStream outputStream = this.f6875a;
            if (i15 == 0 && i13 >= this.f6876b.length) {
                outputStream.write(bArr, i14, i13);
                return;
            }
            int min = Math.min(i13, this.f6876b.length - i15);
            System.arraycopy(bArr, i14, this.f6876b, this.f6877d, min);
            int i16 = this.f6877d + min;
            this.f6877d = i16;
            i12 += min;
            byte[] bArr2 = this.f6876b;
            if (i16 == bArr2.length && i16 > 0) {
                outputStream.write(bArr2, 0, i16);
                this.f6877d = 0;
                continue;
            }
        } while (i12 < i11);
    }
}
