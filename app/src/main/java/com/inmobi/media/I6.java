package com.inmobi.media;

/* loaded from: classes2.dex */
public final class I6 implements InterfaceC1768q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ M6 f14347a;

    public I6(M6 m62) {
        this.f14347a = m62;
    }

    @Override // com.inmobi.media.InterfaceC1768q
    public final void a() {
        kotlin.jvm.internal.g.d(this.f14347a.f14470l, "access$getTAG$p(...)");
        C1820u0 c1820u0 = this.f14347a.f14480v;
        if (c1820u0 != null) {
            c1820u0.c();
        }
    }

    @Override // com.inmobi.media.InterfaceC1768q
    public final void b(Object obj) {
        C1820u0 c1820u0 = this.f14347a.f14480v;
        if (c1820u0 != null) {
            c1820u0.b();
        }
        A4 a42 = this.f14347a.f14468j;
        if (a42 != null) {
            ((B4) a42).a();
        }
    }

    @Override // com.inmobi.media.InterfaceC1768q
    public final void a(Object obj) {
        C1820u0 c1820u0;
        if (this.f14347a.f() == null || (c1820u0 = this.f14347a.f14480v) == null) {
            return;
        }
        c1820u0.d();
    }
}
