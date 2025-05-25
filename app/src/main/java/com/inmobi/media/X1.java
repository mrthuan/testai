package com.inmobi.media;

/* loaded from: classes2.dex */
public final class X1 implements V1 {
    @Override // com.inmobi.media.V1
    public final void a(N1 click) {
        kotlin.jvm.internal.g.e(click, "click");
        kotlin.jvm.internal.g.d(Y1.f(), "access$getTAG$p(...)");
        Y1.b(Y1.f14860a, click);
        O1 b10 = AbstractC1882ya.b();
        b10.getClass();
        b10.a("id = ?", new String[]{String.valueOf(click.f14506a)});
    }

    @Override // com.inmobi.media.V1
    public final void a(N1 click, EnumC1849w3 errorCode) {
        kotlin.jvm.internal.g.e(click, "click");
        kotlin.jvm.internal.g.e(errorCode, "errorCode");
        kotlin.jvm.internal.g.d(Y1.f(), "access$getTAG$p(...)");
        if (click.f14510f == 0) {
            Y1.f14860a.a(click, errorCode.name());
        }
        Y1 y12 = Y1.f14860a;
        Y1.c(y12, click);
        y12.g();
    }
}
