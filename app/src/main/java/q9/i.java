package q9;

import java.io.InputStream;

/* compiled from: com.google.android.play:asset-delivery@@2.2.2 */
/* loaded from: classes2.dex */
public final class i extends okhttp3.z {

    /* renamed from: a  reason: collision with root package name */
    public final okhttp3.z f29112a;

    /* renamed from: b  reason: collision with root package name */
    public final long f29113b;
    public final long c;

    public i(com.google.android.play.core.assetpacks.g0 g0Var, long j10, long j11) {
        this.f29112a = g0Var;
        long i10 = i(j10);
        this.f29113b = i10;
        this.c = i(i10 + j11);
    }

    @Override // okhttp3.z
    public final long a() {
        return this.c - this.f29113b;
    }

    @Override // okhttp3.z
    public final InputStream b(long j10, long j11) {
        long i10 = i(this.f29113b);
        return this.f29112a.b(i10, i(j11 + i10) - i10);
    }

    public final long i(long j10) {
        if (j10 < 0) {
            return 0L;
        }
        okhttp3.z zVar = this.f29112a;
        if (j10 > zVar.a()) {
            return zVar.a();
        }
        return j10;
    }

    @Override // okhttp3.z, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
