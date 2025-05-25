package ek;

import java.io.IOException;
import java.util.List;
import okhttp3.internal.http2.ErrorCode;

/* compiled from: TaskQueue.kt */
/* loaded from: classes3.dex */
public final class k extends bk.a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ d f16732e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f16733f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ List f16734g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, d dVar, int i10, List list) {
        super(str, true);
        this.f16732e = dVar;
        this.f16733f = i10;
        this.f16734g = list;
    }

    @Override // bk.a
    public final long a() {
        androidx.activity.s sVar = this.f16732e.f16681l;
        List requestHeaders = this.f16734g;
        sVar.getClass();
        kotlin.jvm.internal.g.e(requestHeaders, "requestHeaders");
        try {
            this.f16732e.f16694y.i(this.f16733f, ErrorCode.CANCEL);
            synchronized (this.f16732e) {
                this.f16732e.A.remove(Integer.valueOf(this.f16733f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
