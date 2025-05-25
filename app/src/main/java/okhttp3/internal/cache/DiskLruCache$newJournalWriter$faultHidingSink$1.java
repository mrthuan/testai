package okhttp3.internal.cache;

import cg.l;
import java.io.IOException;
import kotlin.jvm.internal.Lambda;

/* compiled from: DiskLruCache.kt */
/* loaded from: classes3.dex */
final class DiskLruCache$newJournalWriter$faultHidingSink$1 extends Lambda implements l<IOException, tf.d> {
    final /* synthetic */ DiskLruCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiskLruCache$newJournalWriter$faultHidingSink$1(DiskLruCache diskLruCache) {
        super(1);
        this.this$0 = diskLruCache;
    }

    @Override // cg.l
    public /* bridge */ /* synthetic */ tf.d invoke(IOException iOException) {
        invoke2(iOException);
        return tf.d.f30009a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(IOException it) {
        kotlin.jvm.internal.g.e(it, "it");
        DiskLruCache diskLruCache = this.this$0;
        byte[] bArr = ak.b.f665a;
        diskLruCache.f23230m = true;
    }
}
