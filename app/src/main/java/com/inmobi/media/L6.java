package com.inmobi.media;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class L6 extends U9 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ M6 f14432a;

    public L6(M6 m62) {
        this.f14432a = m62;
    }

    @Override // com.inmobi.media.U9
    public final void a(HashMap params) {
        kotlin.jvm.internal.g.e(params, "params");
        C1820u0 c1820u0 = this.f14432a.f14480v;
        if (c1820u0 != null) {
            c1820u0.a();
        }
    }

    @Override // com.inmobi.media.U9
    public final void c() {
        C1820u0 c1820u0 = this.f14432a.f14480v;
        if (c1820u0 != null) {
            c1820u0.c();
        }
    }

    @Override // com.inmobi.media.U9
    public final void d(S9 renderView) {
        kotlin.jvm.internal.g.e(renderView, "renderView");
        C1820u0 c1820u0 = this.f14432a.f14480v;
        if (c1820u0 != null) {
            c1820u0.b();
        }
    }

    @Override // com.inmobi.media.U9
    public final void e(S9 renderView) {
        kotlin.jvm.internal.g.e(renderView, "renderView");
        C1820u0 c1820u0 = this.f14432a.f14480v;
        if (c1820u0 != null) {
            c1820u0.d();
        }
    }

    @Override // com.inmobi.media.U9, com.inmobi.media.Tb
    public final void a() {
        C1820u0 c1820u0 = this.f14432a.f14480v;
        if (c1820u0 != null) {
            c1820u0.g();
        }
    }

    @Override // com.inmobi.media.U9
    public final void d() {
        C1820u0 c1820u0;
        M6 m62 = this.f14432a;
        if (m62.f14460a != 0 || (c1820u0 = m62.f14480v) == null) {
            return;
        }
        c1820u0.e();
    }

    @Override // com.inmobi.media.U9
    public final void a(C1780qb telemetryOnAdImpression) {
        kotlin.jvm.internal.g.e(telemetryOnAdImpression, "telemetryOnAdImpression");
        C1820u0 c1820u0 = this.f14432a.f14480v;
        if (c1820u0 != null) {
            telemetryOnAdImpression.f15397e = "nativeBeacon";
            if (c1820u0.f15485a.Z()) {
                telemetryOnAdImpression.b();
            } else {
                c1820u0.f15485a.D.a(telemetryOnAdImpression);
            }
        }
    }

    @Override // com.inmobi.media.U9
    public final void a(String log) {
        kotlin.jvm.internal.g.e(log, "log");
        C1820u0 c1820u0 = this.f14432a.f14480v;
        if (c1820u0 != null) {
            A4 a42 = c1820u0.f15485a.f15531j;
            if (a42 != null) {
                String e10 = AbstractC1846w0.e();
                kotlin.jvm.internal.g.d(e10, "<get-TAG>(...)");
                ((B4) a42).a(e10, "onImraidLog");
            }
            if (c1820u0.f15485a.Z()) {
                return;
            }
            AbstractC1689k0 abstractC1689k0 = (AbstractC1689k0) c1820u0.f15486b.get();
            if (abstractC1689k0 != null) {
                abstractC1689k0.a(log);
                return;
            }
            A4 a43 = c1820u0.f15485a.f15531j;
            if (a43 != null) {
                String e11 = AbstractC1846w0.e();
                kotlin.jvm.internal.g.d(e11, "<get-TAG>(...)");
                ((B4) a43).b(e11, "listener is null");
            }
        }
    }
}
