package okhttp3.internal.cache;

import java.io.IOException;

/* compiled from: DiskLruCache.kt */
/* loaded from: classes3.dex */
public final class f extends bk.a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ DiskLruCache f23263e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(DiskLruCache diskLruCache, String str) {
        super(str, true);
        this.f23263e = diskLruCache;
    }

    @Override // bk.a
    public final long a() {
        DiskLruCache diskLruCache = this.f23263e;
        synchronized (diskLruCache) {
            if (!diskLruCache.f23232o || diskLruCache.f23233p) {
                return -1L;
            }
            try {
                diskLruCache.n();
            } catch (IOException unused) {
                diskLruCache.f23234q = true;
            }
            try {
                if (diskLruCache.h()) {
                    diskLruCache.l();
                    diskLruCache.f23229l = 0;
                }
            } catch (IOException unused2) {
                diskLruCache.f23235r = true;
                diskLruCache.f23227j = ge.a.l(new kk.d());
            }
            return -1L;
        }
    }
}
