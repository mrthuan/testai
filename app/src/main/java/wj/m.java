package wj;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import net.lingala.zip4j.model.enums.RandomAccessFileMode;

/* compiled from: ZipStandardSplitFileInputStream.java */
/* loaded from: classes3.dex */
public final class m extends h {

    /* renamed from: a  reason: collision with root package name */
    public RandomAccessFile f31297a;

    /* renamed from: b  reason: collision with root package name */
    public final File f31298b;
    public final int c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f31299d;

    /* renamed from: e  reason: collision with root package name */
    public int f31300e;

    /* renamed from: f  reason: collision with root package name */
    public final byte[] f31301f = new byte[1];

    public m(int i10, File file, boolean z10) {
        this.f31300e = 0;
        this.f31297a = new RandomAccessFile(file, RandomAccessFileMode.READ.getValue());
        this.f31298b = file;
        this.f31299d = z10;
        this.c = i10;
        if (z10) {
            this.f31300e = i10;
        }
    }

    @Override // wj.h
    public final void a(xj.f fVar) {
        if (this.f31299d) {
            int i10 = this.f31300e;
            int i11 = fVar.f31839r;
            if (i10 != i11) {
                b(i11);
                this.f31300e = fVar.f31839r;
            }
        }
        this.f31297a.seek(fVar.f31841t);
    }

    public final void b(int i10) {
        String str;
        int i11 = this.c;
        File file = this.f31298b;
        if (i10 != i11) {
            String canonicalPath = file.getCanonicalPath();
            if (i10 >= 9) {
                str = ".z";
            } else {
                str = ".z0";
            }
            file = new File(canonicalPath.substring(0, canonicalPath.lastIndexOf(".")) + str + (i10 + 1));
        }
        if (file.exists()) {
            this.f31297a.close();
            this.f31297a = new RandomAccessFile(file, RandomAccessFileMode.READ.getValue());
            return;
        }
        throw new FileNotFoundException("zip split file does not exist: " + file);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        RandomAccessFile randomAccessFile = this.f31297a;
        if (randomAccessFile != null) {
            randomAccessFile.close();
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f31301f;
        if (read(bArr) == -1) {
            return -1;
        }
        return bArr[0];
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        int read = this.f31297a.read(bArr, i10, i11);
        if ((read != i11 || read == -1) && this.f31299d) {
            b(this.f31300e + 1);
            this.f31300e++;
            if (read < 0) {
                read = 0;
            }
            int read2 = this.f31297a.read(bArr, read, i11 - read);
            return read2 > 0 ? read + read2 : read;
        }
        return read;
    }
}
