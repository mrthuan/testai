package kk;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: JvmOkio.kt */
/* loaded from: classes3.dex */
public final class n implements y {

    /* renamed from: a  reason: collision with root package name */
    public final InputStream f19837a;

    /* renamed from: b  reason: collision with root package name */
    public final z f19838b;

    public n(InputStream input, z timeout) {
        kotlin.jvm.internal.g.e(input, "input");
        kotlin.jvm.internal.g.e(timeout, "timeout");
        this.f19837a = input;
        this.f19838b = timeout;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f19837a.close();
    }

    @Override // kk.y
    public final long g(f sink, long j10) {
        kotlin.jvm.internal.g.e(sink, "sink");
        try {
            this.f19838b.f();
            u n10 = sink.n(1);
            int read = this.f19837a.read(n10.f19849a, n10.c, (int) Math.min(8192L, 8192 - n10.c));
            if (read == -1) {
                if (n10.f19850b == n10.c) {
                    sink.f19825a = n10.a();
                    v.a(n10);
                    return -1L;
                }
                return -1L;
            }
            n10.c += read;
            long j11 = read;
            sink.f19826b += j11;
            return j11;
        } catch (AssertionError e10) {
            if (ge.a.D(e10)) {
                throw new IOException(e10);
            }
            throw e10;
        }
    }

    public final String toString() {
        return "source(" + this.f19837a + ')';
    }

    @Override // kk.y
    public final z z() {
        return this.f19838b;
    }
}
