package kk;

import com.google.android.gms.common.api.Api;
import java.io.InputStream;

/* compiled from: Buffer.kt */
/* loaded from: classes3.dex */
public final class e extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f19824a;

    public e(f fVar) {
        this.f19824a = fVar;
    }

    @Override // java.io.InputStream
    public final int available() {
        return (int) Math.min(this.f19824a.f19826b, (long) Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    @Override // java.io.InputStream
    public final int read() {
        f fVar = this.f19824a;
        if (fVar.f19826b > 0) {
            return fVar.readByte() & 255;
        }
        return -1;
    }

    public final String toString() {
        return this.f19824a + ".inputStream()";
    }

    @Override // java.io.InputStream
    public final int read(byte[] sink, int i10, int i11) {
        kotlin.jvm.internal.g.e(sink, "sink");
        return this.f19824a.read(sink, i10, i11);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
