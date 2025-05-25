package kk;

import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: RealBufferedSource.kt */
/* loaded from: classes3.dex */
public final class s extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t f19846a;

    public s(t tVar) {
        this.f19846a = tVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        t tVar = this.f19846a;
        if (!tVar.c) {
            return (int) Math.min(tVar.f19848b.f19826b, (long) Api.BaseClientBuilder.API_PRIORITY_OTHER);
        }
        throw new IOException("closed");
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f19846a.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        t tVar = this.f19846a;
        if (!tVar.c) {
            f fVar = tVar.f19848b;
            if (fVar.f19826b == 0 && tVar.f19847a.g(fVar, 8192L) == -1) {
                return -1;
            }
            return tVar.f19848b.readByte() & 255;
        }
        throw new IOException("closed");
    }

    public final String toString() {
        return this.f19846a + ".inputStream()";
    }

    @Override // java.io.InputStream
    public final int read(byte[] data, int i10, int i11) {
        kotlin.jvm.internal.g.e(data, "data");
        t tVar = this.f19846a;
        if (!tVar.c) {
            androidx.activity.s.u(data.length, i10, i11);
            f fVar = tVar.f19848b;
            if (fVar.f19826b == 0 && tVar.f19847a.g(fVar, 8192L) == -1) {
                return -1;
            }
            return tVar.f19848b.read(data, i10, i11);
        }
        throw new IOException("closed");
    }
}
