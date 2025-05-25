package ek;

import java.io.IOException;
import okhttp3.internal.http2.ErrorCode;

/* compiled from: TaskQueue.kt */
/* loaded from: classes3.dex */
public final class f extends bk.a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ d f16717e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ p f16718f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str, d dVar, p pVar) {
        super(str, true);
        this.f16717e = dVar;
        this.f16718f = pVar;
    }

    @Override // bk.a
    public final long a() {
        try {
            this.f16717e.f16672b.b(this.f16718f);
            return -1L;
        } catch (IOException e10) {
            gk.h hVar = gk.h.f17912a;
            gk.h hVar2 = gk.h.f17912a;
            String h10 = kotlin.jvm.internal.g.h(this.f16717e.f16673d, "Http2Connection.Listener failure for ");
            hVar2.getClass();
            gk.h.i(4, h10, e10);
            try {
                this.f16718f.c(ErrorCode.PROTOCOL_ERROR, e10);
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }
}
