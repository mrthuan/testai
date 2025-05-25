package okhttp3.internal.cache;

import kk.j;
import kk.y;
import okhttp3.internal.cache.DiskLruCache;

/* compiled from: DiskLruCache.kt */
/* loaded from: classes3.dex */
public final class e extends j {

    /* renamed from: b  reason: collision with root package name */
    public boolean f23260b;
    public final /* synthetic */ y c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ DiskLruCache f23261d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ DiskLruCache.a f23262e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(y yVar, DiskLruCache diskLruCache, DiskLruCache.a aVar) {
        super(yVar);
        this.c = yVar;
        this.f23261d = diskLruCache;
        this.f23262e = aVar;
    }

    @Override // kk.j, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        if (!this.f23260b) {
            this.f23260b = true;
            DiskLruCache diskLruCache = this.f23261d;
            DiskLruCache.a aVar = this.f23262e;
            synchronized (diskLruCache) {
                int i10 = aVar.f23248h - 1;
                aVar.f23248h = i10;
                if (i10 == 0 && aVar.f23246f) {
                    diskLruCache.m(aVar);
                }
                tf.d dVar = tf.d.f30009a;
            }
        }
    }
}
