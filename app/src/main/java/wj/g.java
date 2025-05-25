package wj;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.lingala.zip4j.model.enums.RandomAccessFileMode;

/* compiled from: NumberedSplitRandomAccessFile.java */
/* loaded from: classes3.dex */
public final class g extends RandomAccessFile {

    /* renamed from: a  reason: collision with root package name */
    public final long f31280a;

    /* renamed from: b  reason: collision with root package name */
    public final File[] f31281b;
    public RandomAccessFile c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f31282d;

    /* renamed from: e  reason: collision with root package name */
    public int f31283e;

    /* renamed from: f  reason: collision with root package name */
    public final String f31284f;

    public g(File file, String str, File[] fileArr) {
        super(file, str);
        String substring;
        this.f31282d = new byte[1];
        this.f31283e = 0;
        super.close();
        if (!RandomAccessFileMode.WRITE.getValue().equals(str)) {
            int i10 = 1;
            for (File file2 : fileArr) {
                String name = file2.getName();
                if (!name.contains(".")) {
                    substring = "";
                } else {
                    substring = name.substring(name.lastIndexOf(".") + 1);
                }
                try {
                    if (i10 == Integer.parseInt(substring)) {
                        i10++;
                    } else {
                        throw new IOException("Split file number " + i10 + " does not exist");
                    }
                } catch (NumberFormatException unused) {
                    throw new IOException(a6.h.d("Split file extension not in expected format. Found: ", substring, " expected of format: .001, .002, etc"));
                }
            }
            this.c = new RandomAccessFile(file, str);
            this.f31281b = fileArr;
            this.f31280a = file.length();
            this.f31284f = str;
            return;
        }
        throw new IllegalArgumentException("write mode is not allowed for NumberedSplitRandomAccessFile");
    }

    public final void a(int i10) {
        if (this.f31283e == i10) {
            return;
        }
        File[] fileArr = this.f31281b;
        if (i10 <= fileArr.length - 1) {
            RandomAccessFile randomAccessFile = this.c;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.c = new RandomAccessFile(fileArr[i10], this.f31284f);
            this.f31283e = i10;
            return;
        }
        throw new IOException("split counter greater than number of split files");
    }

    @Override // java.io.RandomAccessFile, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        RandomAccessFile randomAccessFile = this.c;
        if (randomAccessFile != null) {
            randomAccessFile.close();
        }
        super.close();
    }

    @Override // java.io.RandomAccessFile
    public final long getFilePointer() {
        return this.c.getFilePointer();
    }

    @Override // java.io.RandomAccessFile
    public final long length() {
        return this.c.length();
    }

    @Override // java.io.RandomAccessFile
    public final int read() {
        byte[] bArr = this.f31282d;
        if (read(bArr) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.RandomAccessFile
    public final void seek(long j10) {
        long j11 = this.f31280a;
        int i10 = (int) (j10 / j11);
        if (i10 != this.f31283e) {
            a(i10);
        }
        this.c.seek(j10 - (i10 * j11));
    }

    @Override // java.io.RandomAccessFile, java.io.DataOutput
    public final void write(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.RandomAccessFile, java.io.DataOutput
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
        throw null;
    }

    @Override // java.io.RandomAccessFile
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.RandomAccessFile, java.io.DataOutput
    public final void write(byte[] bArr, int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.RandomAccessFile
    public final int read(byte[] bArr, int i10, int i11) {
        int read = this.c.read(bArr, i10, i11);
        if (read == -1) {
            int i12 = this.f31283e;
            if (i12 == this.f31281b.length - 1) {
                return -1;
            }
            a(i12 + 1);
            return read(bArr, i10, i11);
        }
        return read;
    }
}
