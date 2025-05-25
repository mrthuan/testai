package ek;

import java.io.IOException;
import okhttp3.internal.http2.ErrorCode;

/* compiled from: TaskQueue.kt */
/* loaded from: classes3.dex */
public final class i extends bk.a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ d f16725e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f16726f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ kk.f f16727g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f16728h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, d dVar, int i10, kk.f fVar, int i11, boolean z10) {
        super(str, true);
        this.f16725e = dVar;
        this.f16726f = i10;
        this.f16727g = fVar;
        this.f16728h = i11;
    }

    @Override // bk.a
    public final long a() {
        try {
            androidx.activity.s sVar = this.f16725e.f16681l;
            kk.f source = this.f16727g;
            int i10 = this.f16728h;
            sVar.getClass();
            kotlin.jvm.internal.g.e(source, "source");
            source.skip(i10);
            this.f16725e.f16694y.i(this.f16726f, ErrorCode.CANCEL);
            synchronized (this.f16725e) {
                this.f16725e.A.remove(Integer.valueOf(this.f16726f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
