package com.bumptech.glide.load.resource.bitmap;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class RecyclableBufferedInputStream extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    public volatile byte[] f7047a;

    /* renamed from: b  reason: collision with root package name */
    public int f7048b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public int f7049d;

    /* renamed from: e  reason: collision with root package name */
    public int f7050e;

    /* renamed from: f  reason: collision with root package name */
    public final w3.b f7051f;

    /* loaded from: classes.dex */
    public static class InvalidMarkException extends IOException {
        private static final long serialVersionUID = -4338378848813561757L;

        public InvalidMarkException(String str) {
            super(str);
        }
    }

    public RecyclableBufferedInputStream(InputStream inputStream, w3.b bVar) {
        super(inputStream);
        this.f7049d = -1;
        this.f7051f = bVar;
        this.f7047a = (byte[]) bVar.c(65536, byte[].class);
    }

    public static void c() {
        throw new IOException("BufferedInputStream is closed");
    }

    public final int a(InputStream inputStream, byte[] bArr) {
        int i10 = this.f7049d;
        if (i10 != -1) {
            int i11 = this.f7050e - i10;
            int i12 = this.c;
            if (i11 < i12) {
                if (i10 == 0 && i12 > bArr.length && this.f7048b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i12) {
                        i12 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f7051f.c(i12, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f7047a = bArr2;
                    this.f7051f.put(bArr);
                    bArr = bArr2;
                } else if (i10 > 0) {
                    System.arraycopy(bArr, i10, bArr, 0, bArr.length - i10);
                }
                int i13 = this.f7050e - this.f7049d;
                this.f7050e = i13;
                this.f7049d = 0;
                this.f7048b = 0;
                int read = inputStream.read(bArr, i13, bArr.length - i13);
                int i14 = this.f7050e;
                if (read > 0) {
                    i14 += read;
                }
                this.f7048b = i14;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.f7049d = -1;
            this.f7050e = 0;
            this.f7048b = read2;
        }
        return read2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f7047a != null && inputStream != null) {
        } else {
            c();
            throw null;
        }
        return (this.f7048b - this.f7050e) + inputStream.available();
    }

    public final synchronized void b() {
        if (this.f7047a != null) {
            this.f7051f.put(this.f7047a);
            this.f7047a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f7047a != null) {
            this.f7051f.put(this.f7047a);
            this.f7047a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i10) {
        this.c = Math.max(this.c, i10);
        this.f7049d = this.f7050e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.f7047a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr != null && inputStream != null) {
            if (this.f7050e < this.f7048b || a(inputStream, bArr) != -1) {
                if (bArr != this.f7047a && (bArr = this.f7047a) == null) {
                    c();
                    throw null;
                }
                int i10 = this.f7048b;
                int i11 = this.f7050e;
                if (i10 - i11 > 0) {
                    this.f7050e = i11 + 1;
                    return bArr[i11] & 255;
                }
                return -1;
            }
            return -1;
        }
        c();
        throw null;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.f7047a != null) {
            int i10 = this.f7049d;
            if (-1 != i10) {
                this.f7050e = i10;
            } else {
                throw new InvalidMarkException("Mark has been invalidated, pos: " + this.f7050e + " markLimit: " + this.c);
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j10) {
        if (j10 < 1) {
            return 0L;
        }
        byte[] bArr = this.f7047a;
        if (bArr != null) {
            InputStream inputStream = ((FilterInputStream) this).in;
            if (inputStream != null) {
                int i10 = this.f7048b;
                int i11 = this.f7050e;
                if (i10 - i11 >= j10) {
                    this.f7050e = (int) (i11 + j10);
                    return j10;
                }
                long j11 = i10 - i11;
                this.f7050e = i10;
                if (this.f7049d != -1 && j10 <= this.c) {
                    if (a(inputStream, bArr) == -1) {
                        return j11;
                    }
                    int i12 = this.f7048b;
                    int i13 = this.f7050e;
                    if (i12 - i13 >= j10 - j11) {
                        this.f7050e = (int) ((i13 + j10) - j11);
                        return j10;
                    }
                    long j12 = (j11 + i12) - i13;
                    this.f7050e = i12;
                    return j12;
                }
                return j11 + inputStream.skip(j10 - j11);
            }
            c();
            throw null;
        }
        c();
        throw null;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        byte[] bArr2 = this.f7047a;
        if (bArr2 == null) {
            c();
            throw null;
        } else if (i11 == 0) {
            return 0;
        } else {
            InputStream inputStream = ((FilterInputStream) this).in;
            if (inputStream != null) {
                int i14 = this.f7050e;
                int i15 = this.f7048b;
                if (i14 < i15) {
                    int i16 = i15 - i14;
                    if (i16 >= i11) {
                        i16 = i11;
                    }
                    System.arraycopy(bArr2, i14, bArr, i10, i16);
                    this.f7050e += i16;
                    if (i16 == i11 || inputStream.available() == 0) {
                        return i16;
                    }
                    i10 += i16;
                    i12 = i11 - i16;
                } else {
                    i12 = i11;
                }
                while (true) {
                    if (this.f7049d == -1 && i12 >= bArr2.length) {
                        i13 = inputStream.read(bArr, i10, i12);
                        if (i13 == -1) {
                            return i12 != i11 ? i11 - i12 : -1;
                        }
                    } else if (a(inputStream, bArr2) == -1) {
                        return i12 != i11 ? i11 - i12 : -1;
                    } else {
                        if (bArr2 != this.f7047a && (bArr2 = this.f7047a) == null) {
                            c();
                            throw null;
                        }
                        int i17 = this.f7048b;
                        int i18 = this.f7050e;
                        i13 = i17 - i18;
                        if (i13 >= i12) {
                            i13 = i12;
                        }
                        System.arraycopy(bArr2, i18, bArr, i10, i13);
                        this.f7050e += i13;
                    }
                    i12 -= i13;
                    if (i12 == 0) {
                        return i11;
                    }
                    if (inputStream.available() == 0) {
                        return i11 - i12;
                    }
                    i10 += i13;
                }
            } else {
                c();
                throw null;
            }
        }
    }
}
