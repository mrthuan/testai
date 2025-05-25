package na;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: QueueFile.java */
/* loaded from: classes2.dex */
public final class f implements Closeable {

    /* renamed from: g  reason: collision with root package name */
    public static final Logger f22377g = Logger.getLogger(f.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final RandomAccessFile f22378a;

    /* renamed from: b  reason: collision with root package name */
    public int f22379b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public a f22380d;

    /* renamed from: e  reason: collision with root package name */
    public a f22381e;

    /* renamed from: f  reason: collision with root package name */
    public final byte[] f22382f;

    /* compiled from: QueueFile.java */
    /* loaded from: classes2.dex */
    public static class a {
        public static final a c = new a(0, 0);

        /* renamed from: a  reason: collision with root package name */
        public final int f22383a;

        /* renamed from: b  reason: collision with root package name */
        public final int f22384b;

        public a(int i10, int i11) {
            this.f22383a = i10;
            this.f22384b = i11;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a.class.getSimpleName());
            sb2.append("[position = ");
            sb2.append(this.f22383a);
            sb2.append(", length = ");
            return a6.h.g(sb2, this.f22384b, "]");
        }
    }

    public f(File file) {
        byte[] bArr = new byte[16];
        this.f22382f = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i10 = 0;
                int i11 = 0;
                for (int i12 = 4; i10 < i12; i12 = 4) {
                    int i13 = iArr[i10];
                    bArr2[i11] = (byte) (i13 >> 24);
                    bArr2[i11 + 1] = (byte) (i13 >> 16);
                    bArr2[i11 + 2] = (byte) (i13 >> 8);
                    bArr2[i11 + 3] = (byte) i13;
                    i11 += 4;
                    i10++;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th2) {
                randomAccessFile.close();
                throw th2;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.f22378a = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int f10 = f(0, bArr);
        this.f22379b = f10;
        if (f10 <= randomAccessFile2.length()) {
            this.c = f(4, bArr);
            int f11 = f(8, bArr);
            int f12 = f(12, bArr);
            this.f22380d = d(f11);
            this.f22381e = d(f12);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f22379b + ", Actual length: " + randomAccessFile2.length());
    }

    public static int f(int i10, byte[] bArr) {
        return ((bArr[i10] & 255) << 24) + ((bArr[i10 + 1] & 255) << 16) + ((bArr[i10 + 2] & 255) << 8) + (bArr[i10 + 3] & 255);
    }

    public final void a(byte[] bArr) {
        int l10;
        int i10;
        int length = bArr.length;
        synchronized (this) {
            if ((length | 0) >= 0) {
                if (length <= bArr.length - 0) {
                    b(length);
                    boolean c = c();
                    if (c) {
                        l10 = 16;
                    } else {
                        a aVar = this.f22381e;
                        l10 = l(aVar.f22383a + 4 + aVar.f22384b);
                    }
                    a aVar2 = new a(l10, length);
                    byte[] bArr2 = this.f22382f;
                    bArr2[0] = (byte) (length >> 24);
                    bArr2[1] = (byte) (length >> 16);
                    bArr2[2] = (byte) (length >> 8);
                    bArr2[3] = (byte) length;
                    j(l10, bArr2, 4);
                    j(l10 + 4, bArr, length);
                    if (c) {
                        i10 = l10;
                    } else {
                        i10 = this.f22380d.f22383a;
                    }
                    m(this.f22379b, this.c + 1, i10, l10);
                    this.f22381e = aVar2;
                    this.c++;
                    if (c) {
                        this.f22380d = aVar2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public final void b(int i10) {
        int i11 = i10 + 4;
        int k10 = this.f22379b - k();
        if (k10 >= i11) {
            return;
        }
        int i12 = this.f22379b;
        do {
            k10 += i12;
            i12 <<= 1;
        } while (k10 < i11);
        RandomAccessFile randomAccessFile = this.f22378a;
        randomAccessFile.setLength(i12);
        randomAccessFile.getChannel().force(true);
        a aVar = this.f22381e;
        int l10 = l(aVar.f22383a + 4 + aVar.f22384b);
        if (l10 < this.f22380d.f22383a) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.f22379b);
            long j10 = l10 - 4;
            if (channel.transferTo(16L, j10, channel) != j10) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i13 = this.f22381e.f22383a;
        int i14 = this.f22380d.f22383a;
        if (i13 < i14) {
            int i15 = (this.f22379b + i13) - 16;
            m(i12, this.c, i14, i15);
            this.f22381e = new a(i15, this.f22381e.f22384b);
        } else {
            m(i12, this.c, i14, i13);
        }
        this.f22379b = i12;
    }

    public final synchronized boolean c() {
        boolean z10;
        if (this.c == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        return z10;
    }

    public final synchronized void clear() {
        m(4096, 0, 0, 0);
        this.c = 0;
        a aVar = a.c;
        this.f22380d = aVar;
        this.f22381e = aVar;
        if (this.f22379b > 4096) {
            RandomAccessFile randomAccessFile = this.f22378a;
            randomAccessFile.setLength(4096);
            randomAccessFile.getChannel().force(true);
        }
        this.f22379b = 4096;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f22378a.close();
    }

    public final a d(int i10) {
        if (i10 == 0) {
            return a.c;
        }
        RandomAccessFile randomAccessFile = this.f22378a;
        randomAccessFile.seek(i10);
        return new a(i10, randomAccessFile.readInt());
    }

    public final synchronized void h() {
        if (!c()) {
            if (this.c == 1) {
                clear();
            } else {
                a aVar = this.f22380d;
                int l10 = l(aVar.f22383a + 4 + aVar.f22384b);
                i(l10, 0, this.f22382f, 4);
                int f10 = f(0, this.f22382f);
                m(this.f22379b, this.c - 1, l10, this.f22381e.f22383a);
                this.c--;
                this.f22380d = new a(l10, f10);
            }
        } else {
            throw new NoSuchElementException();
        }
    }

    public final void i(int i10, int i11, byte[] bArr, int i12) {
        int l10 = l(i10);
        int i13 = l10 + i12;
        int i14 = this.f22379b;
        RandomAccessFile randomAccessFile = this.f22378a;
        if (i13 <= i14) {
            randomAccessFile.seek(l10);
            randomAccessFile.readFully(bArr, i11, i12);
            return;
        }
        int i15 = i14 - l10;
        randomAccessFile.seek(l10);
        randomAccessFile.readFully(bArr, i11, i15);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i11 + i15, i12 - i15);
    }

    public final void j(int i10, byte[] bArr, int i11) {
        int l10 = l(i10);
        int i12 = l10 + i11;
        int i13 = this.f22379b;
        RandomAccessFile randomAccessFile = this.f22378a;
        if (i12 <= i13) {
            randomAccessFile.seek(l10);
            randomAccessFile.write(bArr, 0, i11);
            return;
        }
        int i14 = i13 - l10;
        randomAccessFile.seek(l10);
        randomAccessFile.write(bArr, 0, i14);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, 0 + i14, i11 - i14);
    }

    public final int k() {
        if (this.c == 0) {
            return 16;
        }
        a aVar = this.f22381e;
        int i10 = aVar.f22383a;
        int i11 = this.f22380d.f22383a;
        if (i10 >= i11) {
            return (i10 - i11) + 4 + aVar.f22384b + 16;
        }
        return (((i10 + 4) + aVar.f22384b) + this.f22379b) - i11;
    }

    public final int l(int i10) {
        int i11 = this.f22379b;
        if (i10 >= i11) {
            return (i10 + 16) - i11;
        }
        return i10;
    }

    public final void m(int i10, int i11, int i12, int i13) {
        int[] iArr = {i10, i11, i12, i13};
        int i14 = 0;
        int i15 = 0;
        while (true) {
            byte[] bArr = this.f22382f;
            if (i14 < 4) {
                int i16 = iArr[i14];
                bArr[i15] = (byte) (i16 >> 24);
                bArr[i15 + 1] = (byte) (i16 >> 16);
                bArr[i15 + 2] = (byte) (i16 >> 8);
                bArr[i15 + 3] = (byte) i16;
                i15 += 4;
                i14++;
            } else {
                RandomAccessFile randomAccessFile = this.f22378a;
                randomAccessFile.seek(0L);
                randomAccessFile.write(bArr);
                return;
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f.class.getSimpleName());
        sb2.append("[fileLength=");
        sb2.append(this.f22379b);
        sb2.append(", size=");
        sb2.append(this.c);
        sb2.append(", first=");
        sb2.append(this.f22380d);
        sb2.append(", last=");
        sb2.append(this.f22381e);
        sb2.append(", element lengths=[");
        try {
            synchronized (this) {
                int i10 = this.f22380d.f22383a;
                boolean z10 = true;
                for (int i11 = 0; i11 < this.c; i11++) {
                    a d10 = d(i10);
                    new b(d10);
                    int i12 = d10.f22384b;
                    if (z10) {
                        z10 = false;
                    } else {
                        sb2.append(", ");
                    }
                    sb2.append(i12);
                    i10 = l(d10.f22383a + 4 + d10.f22384b);
                }
            }
        } catch (IOException e10) {
            f22377g.log(Level.WARNING, "read error", (Throwable) e10);
        }
        sb2.append("]]");
        return sb2.toString();
    }

    /* compiled from: QueueFile.java */
    /* loaded from: classes2.dex */
    public final class b extends InputStream {

        /* renamed from: a  reason: collision with root package name */
        public int f22385a;

        /* renamed from: b  reason: collision with root package name */
        public int f22386b;

        public b(a aVar) {
            this.f22385a = f.this.l(aVar.f22383a + 4);
            this.f22386b = aVar.f22384b;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i10, int i11) {
            if (bArr != null) {
                if ((i10 | i11) >= 0 && i11 <= bArr.length - i10) {
                    int i12 = this.f22386b;
                    if (i12 > 0) {
                        if (i11 > i12) {
                            i11 = i12;
                        }
                        int i13 = this.f22385a;
                        f fVar = f.this;
                        fVar.i(i13, i10, bArr, i11);
                        this.f22385a = fVar.l(this.f22385a + i11);
                        this.f22386b -= i11;
                        return i11;
                    }
                    return -1;
                }
                throw new ArrayIndexOutOfBoundsException();
            }
            throw new NullPointerException("buffer");
        }

        @Override // java.io.InputStream
        public final int read() {
            if (this.f22386b == 0) {
                return -1;
            }
            f fVar = f.this;
            fVar.f22378a.seek(this.f22385a);
            int read = fVar.f22378a.read();
            this.f22385a = fVar.l(this.f22385a + 1);
            this.f22386b--;
            return read;
        }
    }
}
