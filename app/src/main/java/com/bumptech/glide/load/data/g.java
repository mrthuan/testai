package com.bumptech.glide.load.data;

import java.io.FilterInputStream;
import java.io.InputStream;
import lib.zj.office.fc.hwpf.usermodel.Field;

/* compiled from: ExifOrientationStream.java */
/* loaded from: classes.dex */
public final class g extends FilterInputStream {
    public static final byte[] c = {-1, -31, 0, Field.NUMCHARS, Field.FILESIZE, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* renamed from: d  reason: collision with root package name */
    public static final int f6881d = 31;

    /* renamed from: a  reason: collision with root package name */
    public final byte f6882a;

    /* renamed from: b  reason: collision with root package name */
    public int f6883b;

    public g(InputStream inputStream, int i10) {
        super(inputStream);
        if (i10 >= -1 && i10 <= 8) {
            this.f6882a = (byte) i10;
            return;
        }
        throw new IllegalArgumentException(b.a.c("Cannot add invalid orientation: ", i10));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read;
        int i10;
        int i11 = this.f6883b;
        if (i11 < 2 || i11 > (i10 = f6881d)) {
            read = super.read();
        } else if (i11 == i10) {
            read = this.f6882a;
        } else {
            read = c[i11 - 2] & 255;
        }
        if (read != -1) {
            this.f6883b++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) {
        long skip = super.skip(j10);
        if (skip > 0) {
            this.f6883b = (int) (this.f6883b + skip);
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        int i12;
        int i13 = this.f6883b;
        int i14 = f6881d;
        if (i13 > i14) {
            i12 = super.read(bArr, i10, i11);
        } else if (i13 == i14) {
            bArr[i10] = this.f6882a;
            i12 = 1;
        } else if (i13 < 2) {
            i12 = super.read(bArr, i10, 2 - i13);
        } else {
            int min = Math.min(i14 - i13, i11);
            System.arraycopy(c, this.f6883b - 2, bArr, i10, min);
            i12 = min;
        }
        if (i12 > 0) {
            this.f6883b += i12;
        }
        return i12;
    }
}
