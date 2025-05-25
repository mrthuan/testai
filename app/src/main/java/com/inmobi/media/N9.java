package com.inmobi.media;

/* loaded from: classes2.dex */
public final class N9 implements I1 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ S9 f14533a;

    public N9(S9 s92) {
        this.f14533a = s92;
    }

    @Override // com.inmobi.media.I1
    public final void a(String url, String api) {
        kotlin.jvm.internal.g.e(url, "url");
        kotlin.jvm.internal.g.e(api, "api");
        this.f14533a.getLandingPageHandler().b(url, api);
    }

    @Override // com.inmobi.media.I1
    public final void b() {
        A4 a42 = this.f14533a.f14665j;
        if (a42 != null) {
            String str = S9.O0;
            kotlin.jvm.internal.g.d(str, "access$getTAG$cp(...)");
            ((B4) a42).a(str, "onCCTScreenDisplayed");
        }
        this.f14533a.getListener().e(this.f14533a);
        S9.a(this.f14533a, null, null, null);
    }

    @Override // com.inmobi.media.I1
    public final void a() {
        A4 a42 = this.f14533a.f14665j;
        if (a42 != null) {
            String str = S9.O0;
            kotlin.jvm.internal.g.d(str, "access$getTAG$cp(...)");
            ((B4) a42).a(str, "onCCTScreenDismissed");
        }
        this.f14533a.u();
    }
}
