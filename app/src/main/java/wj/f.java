package wj;

import java.io.File;
import net.lingala.zip4j.model.enums.RandomAccessFileMode;

/* compiled from: NumberedSplitFileInputStream.java */
/* loaded from: classes3.dex */
public final class f extends h {

    /* renamed from: a  reason: collision with root package name */
    public final g f31279a;

    public f(File file) {
        this.f31279a = new g(file, RandomAccessFileMode.READ.getValue(), zj.a.b(file));
    }

    @Override // wj.h
    public final void a(xj.f fVar) {
        this.f31279a.seek(fVar.f31841t);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        g gVar = this.f31279a;
        if (gVar != null) {
            gVar.close();
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        return this.f31279a.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        return this.f31279a.read(bArr, i10, i11);
    }
}
