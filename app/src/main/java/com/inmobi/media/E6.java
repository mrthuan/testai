package com.inmobi.media;

/* loaded from: classes2.dex */
public final class E6 implements I1 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ M6 f14226a;

    public E6(M6 m62) {
        this.f14226a = m62;
    }

    @Override // com.inmobi.media.I1
    public final void a(String url, String api) {
        kotlin.jvm.internal.g.e(url, "url");
        kotlin.jvm.internal.g.e(api, "api");
    }

    @Override // com.inmobi.media.I1
    public final void b() {
        C1820u0 c1820u0 = this.f14226a.f14480v;
        if (c1820u0 != null) {
            c1820u0.d();
        }
    }

    @Override // com.inmobi.media.I1
    public final void a() {
        C1820u0 c1820u0 = this.f14226a.f14480v;
        if (c1820u0 != null) {
            c1820u0.b();
        }
        A4 a42 = this.f14226a.f14468j;
        if (a42 != null) {
            ((B4) a42).a();
        }
    }
}
