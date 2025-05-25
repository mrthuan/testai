package ek;

import okhttp3.internal.http2.ErrorCode;

/* compiled from: TaskQueue.kt */
/* loaded from: classes3.dex */
public final class l extends bk.a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ d f16735e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f16736f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ ErrorCode f16737g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, d dVar, int i10, ErrorCode errorCode) {
        super(str, true);
        this.f16735e = dVar;
        this.f16736f = i10;
        this.f16737g = errorCode;
    }

    @Override // bk.a
    public final long a() {
        androidx.activity.s sVar = this.f16735e.f16681l;
        ErrorCode errorCode = this.f16737g;
        sVar.getClass();
        kotlin.jvm.internal.g.e(errorCode, "errorCode");
        synchronized (this.f16735e) {
            this.f16735e.A.remove(Integer.valueOf(this.f16736f));
            tf.d dVar = tf.d.f30009a;
        }
        return -1L;
    }
}
