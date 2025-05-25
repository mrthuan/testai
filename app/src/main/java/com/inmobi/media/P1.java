package com.inmobi.media;

import android.os.Message;

/* loaded from: classes2.dex */
public final class P1 implements V1 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ R1 f14566a;

    public P1(R1 r12) {
        this.f14566a = r12;
    }

    @Override // com.inmobi.media.V1
    public final void a(N1 click) {
        kotlin.jvm.internal.g.e(click, "click");
        R1 r12 = this.f14566a;
        r12.getClass();
        Message obtain = Message.obtain();
        obtain.what = 4;
        obtain.obj = click;
        r12.sendMessage(obtain);
    }

    @Override // com.inmobi.media.V1
    public final void a(N1 click, EnumC1849w3 errorCode) {
        kotlin.jvm.internal.g.e(click, "click");
        kotlin.jvm.internal.g.e(errorCode, "errorCode");
        A4 a42 = this.f14566a.f14603a;
        if (a42 != null) {
            String f10 = Y1.f();
            ((B4) a42).b(f10, androidx.activity.r.g(A5.a(f10, "access$getTAG$p(...)", "Pinging click ("), click.f14507b, ") via HTTP failed ..."));
        }
        Y1.c(Y1.f14860a, click);
        this.f14566a.b(click);
    }
}
