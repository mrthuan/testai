package okhttp3.internal.cache;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kk.h;
import kk.r;
import kk.y;
import kk.z;
import okhttp3.c;

/* compiled from: CacheInterceptor.kt */
/* loaded from: classes3.dex */
public final class b implements y {

    /* renamed from: a  reason: collision with root package name */
    public boolean f23255a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f23256b;
    public final /* synthetic */ c c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ kk.g f23257d;

    public b(h hVar, c.d dVar, r rVar) {
        this.f23256b = hVar;
        this.c = dVar;
        this.f23257d = rVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f23255a && !ak.b.g(this, TimeUnit.MILLISECONDS)) {
            this.f23255a = true;
            this.c.a();
        }
        this.f23256b.close();
    }

    @Override // kk.y
    public final long g(kk.f sink, long j10) {
        kotlin.jvm.internal.g.e(sink, "sink");
        try {
            long g10 = this.f23256b.g(sink, 8192L);
            int i10 = (g10 > (-1L) ? 1 : (g10 == (-1L) ? 0 : -1));
            kk.g gVar = this.f23257d;
            if (i10 == 0) {
                if (!this.f23255a) {
                    this.f23255a = true;
                    gVar.close();
                }
                return -1L;
            }
            sink.a(gVar.y(), sink.f19826b - g10, g10);
            gVar.I();
            return g10;
        } catch (IOException e10) {
            if (!this.f23255a) {
                this.f23255a = true;
                this.c.a();
            }
            throw e10;
        }
    }

    @Override // kk.y
    public final z z() {
        return this.f23256b.z();
    }
}
