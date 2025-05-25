package ek;

import java.io.IOException;
import java.util.List;
import okhttp3.internal.http2.ErrorCode;

/* compiled from: TaskQueue.kt */
/* loaded from: classes3.dex */
public final class j extends bk.a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ d f16729e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f16730f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ List f16731g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, d dVar, int i10, List list, boolean z10) {
        super(str, true);
        this.f16729e = dVar;
        this.f16730f = i10;
        this.f16731g = list;
    }

    @Override // bk.a
    public final long a() {
        androidx.activity.s sVar = this.f16729e.f16681l;
        List responseHeaders = this.f16731g;
        sVar.getClass();
        kotlin.jvm.internal.g.e(responseHeaders, "responseHeaders");
        try {
            this.f16729e.f16694y.i(this.f16730f, ErrorCode.CANCEL);
            synchronized (this.f16729e) {
                this.f16729e.A.remove(Integer.valueOf(this.f16730f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
